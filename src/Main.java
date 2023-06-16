import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();

        userMap.put(11111, "Ichiro");
        userMap.put(22222, "Jiro");
        userMap.put(33333, "Saburo");

        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println("id:" + entry.getValue() + "名前:" + entry.getKey());
        }

        System.out.println("idを入力してください");
        int id = new java.util.Scanner(System.in).nextInt();

        String result;
        result = userMap.get(id);

        try {
            if (result != null) {
                System.out.println("名前は" + result + "ですね。");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(id + "は見つかりませんでした");
        } finally {
            System.out.println("検索を終了します。");
        }
    }
}