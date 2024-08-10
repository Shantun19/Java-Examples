import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        // concat two arrays 
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int[] res = contactTwoArrays(array1 , array2);
        for(int ele : res) {
            System.out.print(ele + " ");
        }
        
        usingCopyObject(array1 , array2);
    }
    
    public static int[] contactTwoArrays(int[] a1 , int[] a2) {
        int[] res = new int[a1.length + a2.length];
        
        int i;
        for(i=0; i<a1.length; i++) {
            res[i] = a1[i];
        }
        int k = 0;
        for(int j=i; j<res.length; j++) {
            res[j] = a2[k++];
        }
        
        return res;
        
    }
    
    public static void usingCopyObject(int[] a1 , int[] a2)
    {
        int[] res = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, res, 0, a1.length);
        System.arraycopy(a2, 0, res, a1.length, a2.length);
        
        System.out.println(Arrays.toString(res));
    }
}
