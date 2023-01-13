public class heapSortDesce {
    //using minHeap
    public static void heapify(int arr[],int i,int n){
        int minIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]<arr[minIdx]){
            minIdx=left;
        }
        if(right<n && arr[right]<arr[minIdx]){
            minIdx=right;
        }
        if(minIdx != i){
            int temp = arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
            heapify(arr,minIdx,n);
        }

    }
    public static void heapSort(int arr[]){
        //convert it into  minheap
        int n = arr.length;
        for(int i=n/2 ; i>=0;i--){
            heapify(arr,i,n);
        }
        //swap first and last indexed values and then heapify
        for(int i=n-1;i>0;i--){
            int temp =arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }

    }
    public static void main(String args[]){
       int arr[]={1,5,6,4,2,3};
       heapSort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}
