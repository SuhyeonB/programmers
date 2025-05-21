class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 6;
        
        if (a == b && a == c && a == d) return 1111*a;
        
        if (a!=b && b==c && b==d) return (10*b+a)*(10*b+a);
        if (a!=b && a==c && a==d) return (10*a+b)*(10*a+b);
        if (a==b && a!=c && a==d) return (10*a+c)*(10*a+c);
        if (a==b && a==c && a!=d) return (10*a+d)*(10*a+d);
        
        if (a==b && a!=c) {
            if (c==d) return (a+c) * Math.abs(a-c);
            else return c*d;
        }
        if (a==c && a!=b) {
            if(b==d) return (a+b) * Math.abs(a-b);
            else return b*d;
        }
        if (a==d && a!=b) {
            if(b==c) return (a+b) * Math.abs(a-b);
            else return b*c;
        }
        if (b==c && a!=c) {
            if (a==d) return (a+b) * Math.abs(a-b);
            else return a*d;
        }
        if (b==d && a!=b) {
            if(a==c) return (a+b) * Math.abs(a-b);
            else return a*c;
        }
        if (c==d && a!=c) {
            if(a==b) return (a+c) * Math.abs(a-c);
            else return a*b;
        }
        
        if (a < answer) answer = a;
        if (b < answer) answer = b;
        if (c < answer) answer = c;
        if (d < answer) answer = d;
        return answer;
    }
}