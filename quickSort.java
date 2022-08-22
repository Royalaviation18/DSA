

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};
        int n = arr.length;
        
        quickSort(arr,0,n-1);
        System.out.println("The sorted array is : ");
        printArray(arr,n);
        
    }
    
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int arr[],int l,int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i<j){
            while(arr[i]<= pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,l);
        return j;
    }
    
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    
}
