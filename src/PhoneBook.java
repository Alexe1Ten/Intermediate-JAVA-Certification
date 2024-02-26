import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<String>> hm = new HashMap<>();

    public void put(String key, String number) {
        if (hm.containsKey(key)) {
            hm.get(key).add(number);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            hm.put(key, list);
        }

    }


    public HashMap<String, ArrayList<String>> getAll() {
        return hm;
    }
}
