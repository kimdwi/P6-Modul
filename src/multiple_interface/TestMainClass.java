package multiple_interface;

public class TestMainClass {
    public static void main(String[] args) {
        //Membuat objek
        MainClass mainClass = new MainClass();
        mainClass.printHello();
        System.out.println("Nilai Dobel Dari NUMBER Pada FirstInterface = " +mainClass.doubleNumberA());
        System.out.println("Nilai Dobel Dari NUMBER Pada SecondInterface = " +mainClass.doubleNumberB());
    }
}
