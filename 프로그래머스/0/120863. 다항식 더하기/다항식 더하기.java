class Solution {
    public String solution(String polynomial) {
        String[] ops = polynomial.split(" ");
        
        // 결론: nx + m
        int n = 0, m = 0;
        
        for (int i=0; i<ops.length; i++){
            if (ops[i].contains("x")) {
                if (ops[i].equals("x")) n++;
                else {
                    String temp = ops[i].substring(0, ops[i].length()-1);
                    n += Integer.parseInt(temp);
                }
            } else if (ops[i].equals("+")) {
                continue;
            } else {
                m += Integer.parseInt(ops[i]);
            }
        }
        if (n == 0 & m == 0) return "0";
        if (n == 0) return String.valueOf(m);
        if (m == 0) {
            if (n == 1) return "x";
            return n + "x";
        }
        if (n == 1) return "x + " + m;
        return n + "x + " + m;
    }
}