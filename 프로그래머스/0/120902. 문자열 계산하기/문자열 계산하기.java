class Solution {
    public int solution(String my_string) {
        String[] exp = my_string.split(" ");
        
        int answer = Integer.parseInt(exp[0]);
        
        for (int i=2; i<exp.length; i+=2) {
            if (exp[i-1].equals("+")) 
                answer += Integer.parseInt(exp[i]);
            else answer -= Integer.parseInt(exp[i]);
        }
        
        return answer;
    }
}