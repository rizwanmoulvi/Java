//package group of classes for a program

public class J2_DataType {
    public static void print(){
        System.out.println("Hello World! Data Type");
    }

    public static void main(String[] args) {
        print();
        byte a = 10; // 1 byte = 8 bit
        short b = 20; // 2 byte = 16 bit, range = -2^(2*8) to 2^(2*8)-1
        int c = 30; // 4 byte = 32 bit, range = -2^(4*8) to 2^(4*8)-1
        long  d = 40; // 8 byte = 64 bit, range = -2^(8*8) to 2^(8*8)-1
        double e = 50.0; // 8 byte = 64 bit, range = -2^(8*8) to 2^(8*8)-1
        float f = 60.0f; // 4 byte = 32 bit, range = -2^(4*8) to 2^(4*8)-1
        char g = 'a'; // 2 byte = 16 bit, range = 0 to 2^(2*8)-1, unicode not acsii, support various languages
        boolean h = true; // 1 bit, true or false
    }
}