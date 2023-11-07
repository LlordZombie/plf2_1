public class Main {
    public static void main(String[] args) {
        System.out.println("getClass(0x09024713) = " + getClass(0x09024713));
        System.out.println("getClass(0xc0a80001) = " + getClass(0xc0a80001));
        System.out.println("getClass(0xAC100001) = " + getClass(0xAC100001));
        System.out.println("getClass(0xF0000001) = " + getClass(0xF0000001));
        System.out.println("getClass(0xE00000FF) = " + getClass(0xE00000FF));
    }

    public static char getClass(int ip){
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
}