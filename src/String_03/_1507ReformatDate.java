package String_03;

import java.util.HashMap;
import java.util.Map;

public class _1507ReformatDate {
    public static String reformatDate(String date) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        // vì một từ ngày 1-9 có 12 kí tự, 10- 30 có 13 kí tự nên ta gộp chung lại một trường hợp là 13 kí tự bằng cách thêm số 0 nếu độ dài là 12
        if (date.length() == 12) {
            date = "0" + date;
        }
        // cach chuoi
        // 20th Oct 2051 => 2051-10-20
        String yeah = date.substring(9, 13);
        String day = date.substring(0,2);
        String month = map.get(date.substring(5,8));

        date = yeah + "-" + month + "-" + day;
       return date;
    }

    // complixity time : O(1)
    // Complixity space : O(1)
    public static void main(String[] args) {
        String date = "20th Oct 2051";
reformatDate(date);
    }
}
