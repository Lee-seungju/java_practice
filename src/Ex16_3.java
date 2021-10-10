import java.net.*;

class Ex16_3 {
    public static void main(String args[]) {
//        String address = "https://www.codechobo.com/sample/hello.html";
        String address = "https://www.naver.com";
        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println("conn.toString():" + conn);
            System.out.print("getAllowUserInteraction():"
                    + conn.getAllowUserInteraction());
            System.out.println("\t\t\tgetConnectTimeout():" + conn.getConnectTimeout());
            System.out.println("getContent():" + conn.getContent());
            System.out.print("getContentEncoding():" + conn.getContentEncoding());
            System.out.println("\t\t\tgetContentLength():" + conn.getContentLength());
            System.out.print("getContentType():" + conn.getContentType());
            System.out.println("\tgetDate():" + conn.getDate());
            System.out.println("getDefaultAllowUserInteraction():"
                    + conn.getDefaultAllowUserInteraction());
            System.out.print("getDefaultUseCaches():" + conn.getDefaultUseCaches());
            System.out.println("\t\t\tgetDoInput():" + conn.getDoInput());
            System.out.print("getDoOutput():" + conn.getDoOutput());
            System.out.println("\t\t\t\tgetExpiration():" + conn.getExpiration());
            System.out.println("getHeaderFields():" + conn.getHeaderFields());
            System.out.print("getIfModifiedSince():" + conn.getIfModifiedSince());
            System.out.println("\t\t\t\tgetLastModified():" + conn.getLastModified());
            System.out.println("getReadTimeout():" + conn.getReadTimeout());
            System.out.println("getURL():" + conn.getURL());
            System.out.println("getUseCaches():" + conn.getUseCaches());
        } catch(Exception e) {e.printStackTrace();}
    }
}
