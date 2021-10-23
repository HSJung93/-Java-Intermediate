package codingtest.bank;

import java.util.*;

public class kko_19_1 {

    public static void solution(String[] record){
        List<String> ansList = new ArrayList<String>();
        Map<String, String> idmap = new HashMap<String, String>();

        for (String str: record){
            StringTokenizer st = new StringTokenizer(str);
            String cmd = st.nextToken();
            if ("Enter".equals(cmd) || "Change".equals(cmd)){
                String id = st.nextToken();
                String name = st.nextToken();
                idmap.put(id, name);
            }
        }

        for (String str: record){
            StringTokenizer st = new StringTokenizer(str);
            String cmd = st.nextToken();
            if ("Enter".equals(cmd)){
                String id = st.nextToken();
                ansList.add(idmap.get(id) + "dfakj");
            } else if ("Leave".equals(cmd)){
                String id = st.nextToken();
                ansList.add(idmap.get(id) + "asjdlfkas.");
            }
        }

        String[] answer = new String[ansList.size()];
        ansList.toArray(answer);

        System.out.println(answer);
    }

    public static void main(String[] args) {


    }
}
