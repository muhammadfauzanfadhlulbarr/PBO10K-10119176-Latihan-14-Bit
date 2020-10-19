public class Latihan14 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        /* 49 = 0011 0001 */
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        /* -61 = 1100 0011 */
        c = ~a;
        System.out.println(" ~a= " + c);
        /* 1240 = 1111 0000 */
        c = a << 2;
        System.out.println("a << 2 = " + c);
        /* 15 = 0000 1111 */
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
}
