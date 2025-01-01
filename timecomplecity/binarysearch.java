public class binarysearch{
    public static void main(String[] args) 
        {
            int target=33;
            int arr[]={11,22,33,44,55,66,77,88,99};
            
            int result=binarysearch(arr,target);
            if (result!=-1)
            {
                System.out.println("the element found at " + result);
            }
            else{
                System.out.println("not found");
            }
        }
        public static int binarysearch(int arr[],int target)
        {
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                int mid = (left + right ) / 2;
                if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                 left=mid+1;
            }
      else{
              right=mid-1;

            }
        }
            

            return -1;
        }

    
}