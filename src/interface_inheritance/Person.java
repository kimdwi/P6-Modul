package interface_inheritance;

//Membuat interface implements class
public interface Person extends Named {
    //Membuat variabel
    String FIRSTNAME = "Budi";
    String LASTNAME  = "Gunawan";

    //Membuat method
    @Override
    public default String getName () {
        return FIRSTNAME+ " " +LASTNAME;
    }
}
