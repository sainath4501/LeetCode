class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int f3=f2+f1;

        return f3;
    }
}