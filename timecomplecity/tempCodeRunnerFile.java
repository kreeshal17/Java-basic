public class binarysearch{
    public static void main(String[] args) 
        {
            int target=11;
            int arr[]={11,22,33,44,55,66,77,88,99};
            
            int result=binarysearch(arr,target);
            if (result!=-1)
            {
                System.out.println("the element found at " + result);
            }
        }
        public static int binarysearch(int arr[],int target)
        {
            int left=0;
            int right=arr.length-1;
            int mid=(left+right)/2;
        while(left<=right){
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