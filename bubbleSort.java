public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2};
        int n=arr.length;
//time coplexity=O(n^2)

        //n-1 comaperations
        for(int i=0;i<n-1;i++){
            //n-i-1 comparisons
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
