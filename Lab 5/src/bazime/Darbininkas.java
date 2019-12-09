package bazime;

public class Darbininkas {

    private String vardas;
    private String detale;
    private int kiekis;
    private double kaina;

    public Darbininkas(String vardas, String detale, int kiekis, double kaina) {
        this.vardas = vardas;
        this.detale = detale;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getDetale() {
        return detale;
    }

    public void setDetale(String detale) {
        this.detale = detale;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return "vardas: " + vardas  +
                " detale: " + detale  +
                " kiekis: " + kiekis +
                " kaina: " + kaina + "\n";
    }

}

