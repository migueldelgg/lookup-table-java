import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class function {
    public static void main(String[] args) {

        String[] response = user_roles("free");

        System.out.println(Arrays.toString(response));
    }

    public static String[] user_roles(String role) {
        Map<String, String[]> map = new HashMap<>();

        map.put("free", new String[]{"read"});
        map.put("incognito", new String[]{});
        map.put("plus", new String[]{"read", "write"});
        map.put("premium", new String[]{"read", "write", "download"});
        map.put("vip", new String[]{"read", "write", "download", "premium support"});
        map.put("admin", new String[]{"read", "write", "download", "premium support", "admin privileges"});

        return map.get(role);
    }
}
