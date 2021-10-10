import java.io.*;

public class Ex15_4 {
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("Ex15_4.java");
        int data = 0;
        while((data=fis.read())!=-1) {
            char c = (char)data;
            System.out.print(c);
        }
    }
}
