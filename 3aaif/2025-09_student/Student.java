public class Student extends Object
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Constructor
    // name: mind. 3 char, max 50
    public Student (String name, float kg, int cm, char gender) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }
    // 
    public Student (String name, boolean isMann, int cm, int kg) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        if (isMann) {
            this.setGender('m');
        } else {
            this.setGender('f');
        }
    }

    public void setNameJakob (String name) {
        try {
            if ((name.length() >= 3) && (name.length() <= 50)) {// Wenn wahr: Name gültig
                this.name = name;
            } else {
                // Name falsch, aber was machen jetzt?
                throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
    // setter für name
    public void setName (String name) {
        // TODO separate Meldungen zu kurz bzw. zu lang
        if ((name.length() < 3) || (name.length() > 50)) {  // wenn wahr: name ungültig
            throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
            // System.out.println("OLDSCOOL: Name ist falsch zu kurz oder zu lang");
        }
        // Ab hier weiss ich dass name meinen Kriterien entspricht
        this.name = name;
    }

    // setter für kg
    public void setKg (float kilogramm) {
        this.kg = kilogramm;
    }

    // setter für cm
    public void setCm (int cm) {
        this.cm = cm;
    }
    // SETTer gender
    public void setGender (char g) {
        // akzeptiere hier nur 'm' oder 'f' sowie 'M' oder 'F'
        g = Character.toLowerCase(g);
        // jetzt ist g mit Sicherheit klein
        if ((g != 'm') && (g != 'f')) {
            throw new IllegalArgumentException("Gender darf nur m oder f sein. Ich nammat sogar Großbuchstaben.");            
        }
        this.gender = g;
    }

    public void setGenderBal (char g) {  // TEst auf GUT
        // akzeptiere hier nur 'm' oder 'f' sowie 'M' oder 'F'
        g = Character.toLowerCase(g);
        // jetzt ist g mit Sicherheit klein
        if (g == 'f' || g == 'm') {  // also gültig
            this.gender = g;
            return;
        } 
        throw new IllegalArgumentException("Gender darf nur m oder f sein. Ich nammat sogar Großbuchstaben.");
    }
    // calculate bmi
    public float bmi () {
        return this.kg/((this.cm/100.0f)*(this.cm/100.0f));
    }

    public String mannOderFrau () {
        if (this.gender == 'm') return "männlich";
        // this.
        return "weiblich";
    }

    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + ")";
    }

    public String bmi_werter(){
        int normal_max_m = 25;
        int normal_min_m = 20;
        int normal_max_f = 24;
        int normal_min_f = 19;
        float bmi = this.bmi();
        if (gender == 'm'){
            if (bmi < normal_min_m){
                return "Untergewichtig";
            }
            if (bmi > normal_max_m){
                return "Übergewichtig";
            }
            return "Normalgewichtig";
        }
        // Ab hier bin ich sicher sie ist (this) FRAU
        if (bmi < normal_min_f){
            return "Untergewichtig";
        }
        if (bmi > normal_max_f){
            return "Übergewichtig";
        }
        return "Normalgewichtig";
    }
}
