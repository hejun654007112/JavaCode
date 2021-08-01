package com.offcn.Demos;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) throws IOException {

        new MyThread().start();
         DatagramSocket ds = new DatagramSocket();

        while (true) {

            Scanner sc = new Scanner(System.in);

            byte[] bytes = sc.nextLine().getBytes();

            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("192.168.25.48"), 9090);
//            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("255.255.255.255"), 9898);

            ds.send(dp);

        }


    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8989);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true) {
            byte[] buff = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(buff, 0, buff.length);
            try {
                ds.receive(dp2);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String string = new String(buff, dp2.getOffset(), dp2.getLength());

            System.out.println(string);
        }
    }
}
