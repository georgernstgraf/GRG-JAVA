package com.gym;

public class Beinpresse extends Maschine {
    private int maxGewicht;

    public Beinpresse(String name, float preisEur, int maxGewicht) throws GymException {
        super(name, preisEur);
        setMaxGewicht(maxGewicht);
    }

    public int getMaxGewicht() {
        return maxGewicht;
    }

    public void setMaxGewicht(int maxGewicht) throws GymException {
        if (maxGewicht < 100 || maxGewicht > 500) {
            throw new GymException("MaxGewicht muss zwischen 100 und 500 liegen");
        }
        this.maxGewicht = maxGewicht;
    }

    @Override
    public int wartungsIntervall() {
        return 6;
    }

    @Override
    public String toString() {
        return String.format("Beinpresse: %s, Wartungsintervall: %d Monate, max. Gewicht: %d",
                super.toString(), wartungsIntervall(), maxGewicht);
    }
}