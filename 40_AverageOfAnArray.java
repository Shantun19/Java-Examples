class HelloWorld {
    public static void main(String[] args) {
        // average = sum of numbers / total count;
         double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
         double sum = 0;
         for(double d : numArray) {
             sum += d;
         }
         
         System.out.println("The Average is => " + (sum/numArray.length));
    }
}
