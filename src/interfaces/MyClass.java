package interfaces;

//Membuat implements class
public class MyClass implements MyInterface {
    //Membuat method

    @Override
    public void demo() {
        System.out.println("Nilai Konstanta NUMBER dari MyInterface = " +NUMBER);
    }

    @Override
    public void printHello () {
        System.out.println(GREETING);
        System.out.println("printHello Adalah Method Abstrak Dari MyInterface");
    }
}
