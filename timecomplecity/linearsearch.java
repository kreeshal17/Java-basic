public class linearsearch{
    public static void main(String [] args)
    {
        int arr[]={11,22,55,66,33,77};
        int target=33;
       int result=searchit(arr,target);
              if (result==1)
              {
               System.out.println("element found");
              }
              else{
               System.out.println("element not found");
              }
           }
       
           public static int searchit(int[] arr, int target) {
            for (int i=0;i<arr.length;i++)
            {
             if(arr[i]==target)
             {
                return 1;
             }
            
             
           }
           return -1;}}
