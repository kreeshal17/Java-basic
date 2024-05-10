public class Main {
    public static int fibo(int a, int b, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int c = a + b;
        System.out.println(c);
        return fibo(b, c, n - 1);
    }

   public  static void main(String [] args){
       int a=0,b=1;
       int n=7;
       System.out.println(a);
       System.out.println(b);
       fibo(a,b,n-2);
    }
}
