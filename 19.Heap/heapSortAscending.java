public class heapSortAscending {
    //using maxHeap
    //step 1 
    // Make the maxheap with at least one parent element at appropriate position
    public static void heapify(int arr[],int i,int n){
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }
        if(right < n && arr[right]>arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            int temp = arr[i];
            arr[i]= arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,maxIdx,n);
        }
    }
    public static void heapSort(int arr[]){
        int n = arr.length;
        //step 1
        //heapify ancestors /last level
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        //step 2 
        //swap first and last element and apply heapify on array of one less than previous
        for(int i=n-1;i>0;i--){
            int temp =arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            //do not heapify whole array this time 
            heapify(arr,0,i);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,6,4,5,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
