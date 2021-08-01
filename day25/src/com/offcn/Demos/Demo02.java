package com.offcn.Demos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8990);
        byte[] buff = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(buff,0,buff.length);
        ds.receive(dp2);

        String string = new String(buff, dp2.getOffset(), dp2.getLength());

        System.out.println(string);

        Scanner sc = new Scanner(System.in);

        byte[] bytes = sc.nextLine().getBytes();

        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLoopbackAddress(), 8989);

        ds.send(dp);

        ds.close();

    }
}
