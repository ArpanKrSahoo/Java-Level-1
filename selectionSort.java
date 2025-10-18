public class selectionSort {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2};
        int n=arr.length;
        //time complexity=O(n^2)

        //n-1 passes
        for(int i=0;i<n-1;i++){
            //find the minimum element in unsorted array
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //swap the found minimum element with the first element
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
