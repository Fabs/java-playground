package main;

public class BitFun {
    static short countBits(int x) {
        short bits = 0;
        while (x != 0) {
            if (x % 2 == 0) {
                bits += 1;
            }
            x = x >>> 1;
        }
        return bits;
    }
}
