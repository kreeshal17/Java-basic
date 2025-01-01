public class mergesort{
    public static void Merge(int arr[],int l,int r)
    {
        if(l<r){
        int mid= (l+r)/2;
        Merge(arr,l,mid);
        Merge(arr,mid+1,r);
        merge(arr,l,mid,r);
                
        }
        
            }
            private static void merge(int[] arr, int l, int mid, int r) {

                //ask for the copy lenght
                int n1= mid-l+1;
                int n2=r-mid;
                int left[]=new int [n1];
                int right[]=new int[n2];
                //copy the data
                for (int i=0;i<n1;i++)
                {
                    left[i] = arr[l + i];
                   
                }
                for (int i=0;i<n2;i++)
                {
                    right[i] = arr[mid + 1 + i];
                }
                //for merging
                int i=0;
              int j=0;
              int k=l;
              while(i<n1&&j<n2)
              {
           if (left[i]<=right[j])
           {
            arr[k]=left[i];
            i++;
           }
           else{
            arr[k]=right[j];
            j++;

           }
           k++;


              }

              //copy remaning element
              while(i<n1)
              {
                arr[k]=left[i];
                i++;
                k++;
              }
              while(j<n2)
              {
                arr[k]=right[j];
            j++;
            k++;
              }
            }
               
            public static void main(String args[])
    {
        int arr[]={1,2,3,44,55,22,33,66,99,777};
        System.out.println("before printing");
        for (int p:arr)
        {
 System.out.print(" "+p);
        }
        System.out.println("");
        System.out.println("after printing");
        Merge(arr,0,arr.length-1);
        for (int p:arr)
        {
 System.out.print(" "+p);
        };

    }
}