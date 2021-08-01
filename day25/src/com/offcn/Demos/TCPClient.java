package com.offcn.Demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",9090);

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

        pw.println(sc.nextLine());

        socket.close();
    }
}
