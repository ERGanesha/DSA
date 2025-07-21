package DSA;

public class Shitf {
    public static void main(String[] args) {
        int num = 5;

        // LEFT SHIFT
        int leftShift = num << 1; // shifts left by 1
        System.out.println(num + " << 1 = " + leftShift);
        // Dry Run:
        // 5 = 101 in binary
        // Shift left by 1: 101 -> 1010 = 10

        // RIGHT SHIFT
        int num2 = 10;
        int rightShift = num2 >> 1; // shifts right by 1
        System.out.println(num2 + " >> 1 = " + rightShift);
        // Dry Run:
        // 10 = 1010 in binary
        // Shift right by 1: 1010 -> 0101 = 5

        // Another example:
        int num3 = 20; // 10100
        int leftShift2 = num3 << 2; // shift left by 2
        int rightShift2 = num3 >> 2; // shift right by 2
        System.out.println(num3 + " << 2 = " + leftShift2);
        System.out.println(num3 + " >> 2 = " + rightShift2);
        // Dry Run:
        // 20 = 10100
        // <<2: 10100 -> 1010000 (add two zeros) = 80
        // >>2: 10100 -> 00101 = 5
    }
}

