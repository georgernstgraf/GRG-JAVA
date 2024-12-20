public class Produkt {
    private String name;
    private int preis;

    public Produkt(String name, int preis) {
        setName(name);
        setPreis(preis);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null == name) {
            throw new IllegalArgumentException("Name für das Produkt darf nicht leer sein!");
        }
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        if (preis < 0) {
            throw new IllegalArgumentException("preis darf nicht kleiner 0 sein!");
        }
        this.preis = preis;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Preis: %d Euro", this.name, this.preis);
    }
}