
public class sum {
    public static void sumof(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }


        sum+=i;
        sumof(i+1,n,sum);

    }
      
    public static void main(String[] args)
    {
        sumof(1,10,0);

    }
    
}
