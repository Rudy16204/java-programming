public class binarysearch {
    public static void main(String[] args) {
        int a[]={10,30,20,50,40,60};
        int low=0,high=a.length-1;
        int mid=(low + high)/2;
        int element=40;
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
       System.out.println();
       while(low<=high){
        if(a[mid]==element)
        {
            System.out.print("the element found at index:"+mid);
            break;
            
        }
        else if(a[mid]<element)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
        mid=(low+high)/2;
    }
    if(low>high)
    {

        System.out.println("Element not found..");
    }
  }
}
