class Solution {
    public int solution(int a, int b) {
        
        int deno = b / gcd(a, b);
        
        while (deno % 2 == 0) deno /= 2;
        while (deno % 5 == 0) deno /= 5;
        
        if (deno == 1) return 1;
        else return 2;
    }
    
    int gcd(int a, int b) {
        int result = 0;
        
        for (int i=1; i<=b; i++) 
            if (a%i == 0 && b%i == 0) result = i;
        
        return result;
    }
}