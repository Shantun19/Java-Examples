import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the values in the array !!");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // call the bubble sort function.
        bubbleSort(arr);
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        // iterate no. of cycle 
        for(int cycle=0; cycle<size-1; cycle++) {
            for(int i=0; i<size-cycle-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
