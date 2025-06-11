class Solution {
    public int solution(int n, int k) {
        int drink = n / 10;
        drink = k-drink;
        
        return 12000*n + 2000*drink;
    }
}