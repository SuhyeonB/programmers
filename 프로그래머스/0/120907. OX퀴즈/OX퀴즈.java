class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] ops = quiz[i].split(" ");
            int x = Integer.parseInt(ops[0]);
            int y = Integer.parseInt(ops[2]);
            int z = Integer.parseInt(ops[4]);
            
            if (ops[1].equals("+")) {
                answer[i] = (x + y == z) ? "O" : "X";
            } else if (ops[1].equals("-")) {
                answer[i] = (x - y == z) ? "O" : "X";
            }
        }
        return answer;
    }
}