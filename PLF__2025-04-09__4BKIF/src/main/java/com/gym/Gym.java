package com.gym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gym {
    private double maxPreisEur;
    private int maxAnzahl;
    private List<Maschine> maschinen;

    public Gym(double maxPreisEur, int maxAnzahl) throws GymException {
        this.maschinen = new ArrayList<>();
        setMaxPreisEur(maxPreisEur);
        setMaxAnzahl(maxAnzahl);
    }

    private void setMaxPreisEur(double maxPreisEur) throws GymException {
        if (maxPreisEur < 0 || maxPreisEur > 9000.0) {
            throw new GymException("MaxPreisEur muss zwischen 0 und 9000 liegen");
        }
        this.maxPreisEur = maxPreisEur;
    }

    private void setMaxAnzahl(int maxAnzahl) throws GymException {
        if (maxAnzahl < 5 || maxAnzahl > 100) {
            throw new GymException("MaxAnzahl muss zwischen 5 und 100 liegen");
        }
        this.maxAnzahl = maxAnzahl;
    }

    public double getMaxPreisEur() {
        return maxPreisEur;
    }

    public int getMaxAnzahl() {
        return maxAnzahl;
    }

    public boolean aufstellen(Maschine maschine) throws GymException {
        if (maschine == null) {
            throw new GymException("Maschine darf nicht null sein");
        }
        if (maschine.getPreisEur() > maxPreisEur || maschinen.size() >= maxAnzahl || maschinen.contains(maschine)) {
            return false;
        }
        return maschinen.add(maschine);
    }

    public double berechneAvgPreisMaschinen() {
        if (maschinen.isEmpty()) return 0.0;
        return maschinen.stream()
                .mapToDouble(Maschine::getPreisEur)
                .average()
                .orElse(0.0);
    }

    public void sortierenNachName() {
        maschinen.sort(Comparator.comparing(Maschine::getName));
    }

    public int entfernenAlle(char typ) {
        if (maschinen.isEmpty()) return -99;
        int removedCount;
        switch (Character.toLowerCase(typ)) {
            case 'b':
                removedCount = (int) maschinen.stream().filter(m -> m instanceof Beinpresse).count();
                maschinen.removeIf(m -> m instanceof Beinpresse);
                return removedCount;
            case 'e':
                removedCount = (int) maschinen.stream().filter(m -> m instanceof Ergometer).count();
                maschinen.removeIf(m -> m instanceof Ergometer);
                return removedCount;
            default:
                return -99;
        }
    }
    public ArrayList<Maschine> getMaschinen () {
        return new ArrayList<>(maschinen);
    };

    public boolean entfernen(Maschine maschine) {
        return maschine != null && maschinen.remove(maschine);
    }

    public int maxWartungsIntervall() {
        if (maschinen.isEmpty()) return -99;
        return maschinen.stream()
                .mapToInt(Maschine::wartungsIntervall)
                .max()
                .orElse(-99);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Gym (maxPreisEur=%.1f, maxAnzahl=%d):%n", maxPreisEur, maxAnzahl));
        maschinen.forEach(m -> sb.append(m.toString()).append("\n"));
        return sb.toString();
    }
}