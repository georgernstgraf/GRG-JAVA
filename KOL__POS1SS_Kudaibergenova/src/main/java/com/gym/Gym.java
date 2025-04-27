package com.gym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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

    public Map<String, List<Maschine>> getGroupedMachines() {
        return null;
    }

    public double getMaxPreisEur() {
        return Math.E;
    }

    public int getMaxAnzahl() {
        return 9;
    }

    public boolean aufstellen(Maschine maschine) throws GymException {
        return false;
    }

    public double berechneAvgPreisMaschinen() {
        return Math.PI;
    }

    public void sortierenNachName() {
    }

    public int entfernenAlle(char typ) {
        return 4711;
    }

    public ArrayList<Maschine> getMaschinen() {
        return new ArrayList<>(maschinen);
    }

    public boolean entfernen(Maschine maschine) {
        return false;
    }

    public int maxWartungsIntervall() {
        return 54;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Gym (maxPreisEur=%.1f, maxAnzahl=%d):%n", maxPreisEur, maxAnzahl));
        maschinen.forEach(m -> sb.append(m.toString()).append("\n"));
        return sb.toString();
    }
}