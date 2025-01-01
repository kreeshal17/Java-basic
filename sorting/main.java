import java.util.Scanner;
public class main
{
    public static void sorting(int arr[])
    {
     
       for(int i=1;i<arr.length;i++)
       {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
           arr[j+1]=arr[j];
           j--;


        }
       
            arr[j+1]=key;
        

       }
    }
    public static void main(String[] args)
    {
  int arr[]= new int[4];
  Scanner sc=new Scanner(System.in);
  for (int i = 0; i < 4; i++) {
      System.out.print("enter the element a["+ i + "] ");
      arr[i]=sc.nextInt();
    }
    System.out.println("before sorting");
    for(int x:arr){
        System.out.print(" " + x);
    }
    System.out.println("");
    System.out.println("after sorting");
    sorting(arr);
    for(int x:arr){
        System.out.print(" " + x);
    }

    }
}