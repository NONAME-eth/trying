package PhoneNumber;

public class NumberDirectory {
    
    
// Phone Directory → Store names & numbers using HashMap, search by name.
import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> list = new HashMap<>();

        list.add("Suraj", "9878959707");
        list.add("Anmol", "9876543210");
        list.add("Jassi", "9123456789");
        list.add("Ashu", "9988776655");
        list.add("Neraj", "9012345678");
        list.add("Yuvi", "8800991122");
        list.add("Paras", "9345678901");
        list.add("Rajat", "7698451236");

        System.out.println("Phone Number list: " + list);

    }
}

}
