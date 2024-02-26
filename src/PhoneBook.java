import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    HashMap<String, ArrayList<String>> hm = new HashMap<>();
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    public void put(String key, String number) {
        if (hm.containsKey(key)) {
            hm.get(key).add(number);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            hm.put(key, list);
            this.size += 1;
        }
    }

    public void clear() {
        hm.clear();
        size = 0;
    }

    @Override
    public String toString() {
        if (size == 0) return "The phone book is empty";
        StringBuilder sb = new StringBuilder();
        Set<String> keys = hm.keySet();
        int seporator = 2;
        int maxName = 0;
        for (String key : keys) {
            if (key.length() > maxName) maxName = key.length();
        }
        for (Map.Entry<String, ArrayList<String>> el : hm.entrySet()) {
            sb.append(el.getKey()).append(":").repeat(" ", seporator + maxName - el.getKey().length())
            .append(el.getValue().toString().replace('[', ' ')
            .replace(']', ' ')).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public HashMap<String, ArrayList<String>> getAll() {
        return hm;
    }
}
