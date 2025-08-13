import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> db_map = new HashMap<>();
        
        for (int i=0; i<db.length; i++) {
            db_map.put(db[i][0], db[i][1]);
        }
        
        if (!db_map.containsKey(id_pw[0])) return "fail";
        if (!id_pw[1].equals(db_map.get(id_pw[0]))) return "wrong pw";
        return "login";
    }
}