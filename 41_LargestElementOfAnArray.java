class HelloWorld {
    public static void main(String[] args) {
       double[] arr = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
       double max = Double.NEGATIVE_INFINITY;
       for(double ele : arr) {
           if(ele > max) max = ele;
       }
       System.out.println("The largest element is " + max);
    }
}
