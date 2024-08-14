class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Convert Byte Array to Hexadecimal.
        byte[] bytes = {10, 2, 15, 11};
        for(byte b : bytes) {
            String str = String.format("%02X" , b);
            System.out.print(str+ " ");
        }
    }
}
