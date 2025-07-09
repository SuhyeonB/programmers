class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        my_string = my_string.trim();
        
        if (my_string.equals("")) return 0;
        
        String[] nums = my_string.split("\\s+");
        
        for(String n : nums) {
            answer += Integer.parseInt(n);
        }
        
        return answer;
    }
}