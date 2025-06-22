package com.gym;

public abstract class Maschine {
    private String name;
    private float preisEur;

    public Maschine(String name, float preisEur) throws GymException {
        setName(name);
        setPreisEur(preisEur);
    }

    public String getName() {
        return name;
    }

    public float getPreisEur() {
        return preisEur;
    }

    public void setName(String name) throws GymException {
        if (name == null || name.trim().isEmpty()) {
            throw new GymException("Name darf nicht leer oder null sein");
        }
        this.name = name;
    }

    public void setPreisEur(float preisEur) throws GymException {
        if (preisEur < 0) {
            throw new GymException("Preis darf nicht negativ sein");
        }
        this.preisEur = preisEur;
    }

    public String getClassName () {
return this.getClass().getSimpleName();
    }

    public abstract int wartungsIntervall();

    @Override
    public String toString() {
        return String.format("%s, %.1f EUR", name, preisEur);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maschine)) return false;
        Maschine maschine = (Maschine) o;
        return Float.compare(maschine.preisEur, preisEur) == 0 &&
                name.equals(maschine.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + Float.hashCode(preisEur);
    }
}