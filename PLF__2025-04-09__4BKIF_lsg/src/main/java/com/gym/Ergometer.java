package com.gym;

public class Ergometer extends Maschine {
    private int maxDrehzahl;

    public Ergometer(String name, float preisEur, int maxDrehzahl) throws GymException {
        super(name, preisEur);
        setMaxDrehzahl(maxDrehzahl);
    }

    public int getMaxDrehzahl() {
        return maxDrehzahl;
    }

    public void setMaxDrehzahl(int maxDrehzahl) throws GymException {
        if (maxDrehzahl < 5 || maxDrehzahl > 150) {
            throw new GymException("MaxDrehzahl muss zwischen 5 und 150 liegen");
        }
        this.maxDrehzahl = maxDrehzahl;
    }

    @Override
    public int wartungsIntervall() {
        return 12;
    }

    @Override
    public String toString() {
        return String.format("Ergometer: %s, Wartungsintervall: %d Monate, max. Drehzahl %d",
                super.toString(), wartungsIntervall(), maxDrehzahl);
    }
}