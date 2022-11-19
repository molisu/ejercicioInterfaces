import example.CocheCRUD;
import example.CocheCRUDImpl;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }

}
