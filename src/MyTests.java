import com.company.adsf.Complex;

import java.util.ArrayList;

public class MyTests {
    public static void main(String[] args) {
        Complex c = new Complex(1);
        System.out.println("getClass(0x09024713) = " + BitOp.getClass(0x09024713));
        System.out.println("getClass(0xc0a80001) = " + BitOp.getClass(0xc0a80001));
        System.out.println("getClass(0xAC100001) = " + BitOp.getClass(0xAC100001));
        System.out.println("getClass(0xF0000001) = " + BitOp.getClass(0xF0000001));
        System.out.println("getClass(0xE00000FF) = " + BitOp.getClass(0xE00000FF));
        System.out.println("BitOp.isBroadCastIP(0x0ca80317, 24) = " + BitOp.isBroadCastIP(0x0ca80317, 24));
        System.out.println("BitOp.isBroadCastIP(0x0ca803FF, 24) = " + BitOp.isBroadCastIP(0x0ca803FF, 24));
        System.out.println("BitOp.isBroadCastIP(0x0ca803FF, 23) = " + BitOp.isBroadCastIP(0x0ca803FF, 23));
        System.out.println("BitOp.isBroadCastIP(0x0ca803FF, 22) = " + BitOp.isBroadCastIP(0x0ca803FF, 22));
        System.out.println("BitOp.isBroadCastIP(0x0ca803FF, 21) = " + BitOp.isBroadCastIP(0x0ca803FF, 21));

    }

}
