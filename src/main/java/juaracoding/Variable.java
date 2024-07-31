package juaracoding;

public class Variable {
    public static void main(String[] args){
        // tipe data number
        byte age = 127;
        short stock = 999;
        float price = 10000.55f;
        double totalPrice = 300000000.99d;
        long total = 4000000000000L;
        int cartProduct = 1000;

        // char
        char gender = 'L';
        char predikat='A';

        // escape character
        System.out.println("\"JuaraCoding\n Indonesia");

        // boolean
        boolean isResult = true;
        boolean isLogin = false;

        // String
        String ProductName = "Headset";
        System.out.println ("Product Name : " + ProductName);

        // Buatkan output menampilkan profile user
        String pathimage = "F:\\PT Alfadigitalsoluction\\Instagram\\website.jpg";
        System.out.println(pathimage);

        // implisit casting / automatic Casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(data1);
        System.out.println(dataDouble);

        char data2 = '2';
        long dataLong = data2;
        System.out.println(dataLong);

        // Explitcit Caasting / Manual Casting
        char data3 = '+';
        byte dataByte = (byte) data3;
        System.out.println(dataByte);

        int stok = 9999;
        short dataShort = (short) stok;
        System.out.println(dataShort);

        // passing by Value
        String address = "Jakarta";
        String duplicatAddress = address;
        duplicatAddress = "Bandung";
        System.out.println(duplicatAddress);
    }
}