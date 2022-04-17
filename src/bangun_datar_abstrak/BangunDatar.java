package bangun_datar_abstrak;

//Membuat abstract class
public abstract class BangunDatar {
    //Membuat variabel
    private String color;

    protected void setColor (String color) {
        this.color = color;
    }

    //Membuat abstract method
    abstract double luas();
    abstract double keliling();

    protected void greeting () {
        System.out.println("Selamat Datang Di Bangun Datar");
    }
}
