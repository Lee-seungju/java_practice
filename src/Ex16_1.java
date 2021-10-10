import java.net.*;
import java.util.*;

class Ex16_1 {
    public static void main(String args[]) {
        InetAddress ip = null;
        InetAddress[] ipArr = null;

        try {
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("getHostName() :" + ip.getHostName());
            // getHostName() :www.naver.com
            System.out.println("getHostAddress() :" + ip.getHostAddress());
            // getHostAddress() :223.130.195.95
            System.out.println("toString() :" + ip.toString());
            // toString() :www.naver.com/223.130.195.95

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() :" + Arrays.toString(ipAddr));
            // getAddress() :[-33, -126, -61, 95]

            String result = "";
            for(int i=0; i < ipAddr.length; i++)
                result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i])+".";
            System.out.println("getAddress()+256 :" + result);
            // getAddress()+256 :223.130.195.95.
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() :" + ip.getHostName());
            // getHostName() :seungjuui-MacBookPro.local
            System.out.println("getHostAddress() :" + ip.getHostAddress());
            // getHostAddress() :218.38.137.27
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            ipArr = InetAddress.getAllByName("www.naver.com");

            for(int i=0; i<ipArr.length; i++)
                System.out.println("ipArr["+i+"] :"+ipArr[i]);
            // ipArr[0] :www.naver.com/223.130.195.95
            // ipArr[1] :www.naver.com/223.130.200.104
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
