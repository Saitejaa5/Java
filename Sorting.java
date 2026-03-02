public class Sorting {

    static void bubbleSortDesc(int[] arr){

    }
    static void bubbleSortAsn(int[] arr){
 
        int n = arr.length;

        for(int i = 0 ; i < n -1; i++){
            for(int j = 0 ; j < n-1; j++){
                if(arr[j]  > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = { 39 , 9 , 34 , 71, 23};
        bubbleSortAsn(arr);
    }
    
}
