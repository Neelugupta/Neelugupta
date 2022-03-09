public class BitManipulation {
    public static void main(String[] args) {
        int a= 5;
        int b=-7;
        System.out.println("Bitwise AND"+(a&b));
        System.out.println("bitwise or"+(a|b));
        System.out.println("bitwise XOR"+(a^b));
        System.out.println("bitwise complement"+(~a));
        System.out.println(3<<2);
        System.out.println(3>>2);
        System.out.println(2>>>1);
        System.out.println(9>>>1);
    }
}
