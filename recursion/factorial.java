public class factorial {
public static int factorialcalc(int n)
{
    if(n==0||n==1)
    {
        return 1;
        
    }

    return n * factorialcalc(n-1);
       

}





    public static void main(String[] args)
    

    {
       int f= factorialcalc(5);
    
        System.out.println(f);
    }
    
}
