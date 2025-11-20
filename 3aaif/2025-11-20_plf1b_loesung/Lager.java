class Lager {

    // default access bitte lassen, wird von den Tests genutzt
    Artikel[] lager;
    int maxKg;

    public Lager(int fach, int maxKg) {
        this.maxKg = maxKg;
        this.lager = new Artikel[fach];
    }

    public boolean istDrin(Artikel artikel) {
        /**
         * gibt zurück, ob die Artikel im Lager ist ( true / false )
         * throws on NULL
         */
        if (artikel == null) throw new IllegalArgumentException("Diese Frage macht keinen Sinn");
        for (Artikel a: lager) {
            //System.out.println ("prüfe gerade: " +a);
            if (a == artikel) { 
                return true;
            }
        }     
        return false;
    }

    public int freieFaecher() {
        /**
         * Diese Methode gibt die Anzahl der freien Fächer im Lager zurück
         */
        int antwort = 0;
        for (Artikel a: lager) {
            if (a == null) antwort++;
        }
        return antwort;
    }

    public int beladungInKg() {
        /**
         * Diese Methode gibt das Gesamtgewicht aller Artikel im Lager zurück
         * besonders geeignet als Hilfsmethode für "reingeben"
         */
        int antwort = 0;
        for (Artikel a: lager) {
            if (a != null) antwort+=a.getKg();
        }
        return antwort;
    }

    public int restKapazitaetKg() {
        /**
         * Diese Methode gibt die noch verfügbare Kapazität in kg zurück
         * besonders geeignet als Hilfsmethode für "reingeben"
         */
        return maxKg - beladungInKg();
    }

    public boolean reingeben(Artikel artikel) {
        /**
         * Anforderungen an die Methode:
         * wenn artikel null: Exception werfen
         * wenn artikel bereits im Lager: Exception werfen
         * wenn maxKg überschritten würde: return false
         * wenn kein Platz mehr frei ist: return false
         * sonst: artikel ins Lager einlagern und return true
         */
        if (artikel == null) throw new IllegalArgumentException("unwilling to perform with null");
        if (istDrin(artikel)) throw new IllegalArgumentException("already have performed your wish, it's inside");
        if (restKapazitaetKg() < artikel.getKg()) return false;
        for (int i = 0; i < lager.length; i++) {
            if (lager[i] == null) {
                lager[i] = artikel;
                return true;
            }
        }
        return false;
    }

    public Artikel entnehmen(Artikel artikel) {
        /**
         * Anforderungen an die Methode:
         * wenn artikel null: Exception werfen
         * wenn artikel nicht im Lager: return null
         * sonst: artikel aus dem Lager entfernen und den artikel zurückgeben
         */
        if (artikel == null) throw new IllegalArgumentException("unwilling to perform with null");
        for (int i = 0; i < lager.length; i++) {
            if (lager[i] == artikel) {
                lager[i] = null;
                return artikel;
            }
        }
        return null;
    }
}
