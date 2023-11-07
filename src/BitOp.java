public class BitOp {
    static char getClass(int ip){
        char netClass= 'A';
        String bin = Integer.toBinaryString(ip);
        if(bin.length()!=32){
            return 'A';
        }
        String lastFour = bin.substring(0,4);
        for (int i = 0; i < lastFour.length(); i++) {
            if (lastFour.charAt(i)=='0'){
                break;
            }else {
                netClass++;
            }
        }
        return netClass;

    }
    public static int setBitWithShift(int num, int i, int k) {
        return (num<<k) |(1<<i);
    }
    public static int bitwiseSubtract(int a, int b) {
        return a+~b;
    }

    public static int countBitFlips(int a, int b) {
        String diff =Integer.toBinaryString(a^b);
        return diff.length()-diff.replace("1","").length();
    }

    static boolean isBroadCastIP(int ip, int suffix){
        int mask = ~1<<(32-suffix-1);
        mask = ~(mask);
        int hostbits = ip &mask;
        return Integer.toBinaryString(hostbits).equals(Integer.toBinaryString(mask));
    }
}