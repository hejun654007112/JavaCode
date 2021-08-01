package com.offcn.homework;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        while (true) {
            Socket s = null;
            OutputStream os = null;
            InputStream is= null;
            try {
                s = new Socket(InetAddress.getLoopbackAddress(), 8989);

                Scanner sc = new Scanner(System.in);

                byte[] bytes = sc.nextLine().getBytes();

                os = s.getOutputStream();

                os.write(bytes);

                s.shutdownOutput();

                is = s.getInputStream();

                byte[] bytes1 = new byte[1024];

                int len;

                while ((len = is.read(bytes1)) != -1){
                    System.out.println(new String(bytes1,0,len));
                }

                s.shutdownInput();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (os != null)
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    if (s != null) {
                        s.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
