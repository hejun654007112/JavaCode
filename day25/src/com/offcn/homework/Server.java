package com.offcn.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8989);
        while (true) {
            final Socket s = ss.accept();
            new Thread(new Runnable() {
            @Override
            public void run() {
                InputStream is = null;
                OutputStream os = null;
                try {

                    is = s.getInputStream();

                    byte[] bytes1 = new byte[1024];

                    int len;
                    StringBuilder sb = new StringBuilder();
                    while ((len = is.read(bytes1)) != -1){
                        sb.append(new String(bytes1,0,len));
                    }
                    s.shutdownInput();

                    byte[] bytes = sb.reverse().toString().getBytes();

                    os = s.getOutputStream();

                    os.write(bytes);

                    s.shutdownOutput();
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
                        if (os != null) {
                            os.close();
                        }
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
        }).start();
        }


    }
}
