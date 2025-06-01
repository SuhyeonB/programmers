class Solution {
    public int solution(String binomial) {
        String[] operation = binomial.split(" ");
        
        int a = Integer.parseInt(operation[0]);
        int b = Integer.parseInt(operation[2]);
        
        if (operation[1].equals("+")) return a + b;
        if (operation[1].equals("-")) return a - b;
        if (operation[1].equals("*")) return a * b;
        return 0;
    }
}