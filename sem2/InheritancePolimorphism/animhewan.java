package practicumpbo.polymorphismandinheritance;

/**
 *
 * @author ACER A515-45-R3RR
 */
public class animhewan {
    private String jenisHewan;
    private int umur;

    public animhewan(String jenisHewan, int umur) {
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getUmur() {
        return umur;
    }

    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }

    @Override
    public String toString() {
        return "Jenis Hewan: " + jenisHewan + ", Umur: " + umur;
    }
}

class Kucing extends animhewan {
    private String jenisBulu;

    public Kucing(String jenisHewan, int umur, String jenisBulu) {
        super(jenisHewan, umur);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }

    @Override
    public void bersuara() {
        System.out.println("Meow...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Bulu: " + jenisBulu;
    }
}

class Anjing extends animhewan {
    private String jenisRambut;

    public Anjing(String jenisHewan, int umur, String jenisRambut) {
        super(jenisHewan, umur);
        this.jenisRambut = jenisRambut;
    }

    public String getJenisRambut() {
        return jenisRambut;
    }

    @Override
    public void bersuara() {
        System.out.println("Guk-guk...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Rambut: " + jenisRambut;
    }
}

class Main {
    public static void main(String[] args) {
        animhewan hewan1 = new Kucing("Kucing", 3, "Persia");
        animhewan hewan2 = new Anjing("Anjing", 5, "Bulldog");

        System.out.println(hewan1);
        hewan1.bersuara();
        System.out.println(hewan2);
        hewan2.bersuara();
    }
}
