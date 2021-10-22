package codingtest.bank;

import java.util.Arrays;
import java.util.HashMap;

public class DevMatch2 {
    private static int solution(int leave, String day, int[] holidays){
        int[] calendar = new int[31];

        Arrays.fill(calendar, 1);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("SUN", 0);
        map.put("MON", 6);
        map.put("TUE", 5);
        map.put("WEN", 4);
        map.put("THU", 3);
        map.put("FRI", 2);
        map.put("SAT", 1);

        int free = map.get(day);

        for (int i=0; i < 31; i++){
            if (i % 7 == free || i % 7 == ((free + 1) % 7)) calendar[i] = 0;
        }

        for (int j: holidays) {
            calendar[j] = 0;
        }

        int sm = 0;
        int mx = 0;

        for (int a=1; a < (calendar.length-1); a++){
            sm = calendar[a];
            for (int b=a+1; b < (calendar.length); b++ ){
                sm += calendar[b];
                if (sm <= leave){
                    mx = Math.max(mx, b-a+1);
                }else{
                    break;
                }
            }
        }

        return mx;


    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 13, 15, 17};
        System.out.println(solution(4, "FRI", arr));
    }
}
