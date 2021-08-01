package com.offcn.Demos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveBroadcast {

    public static void main(String[] args) throws IOException {
        //创建通信点对象
        DatagramSocket ds = new DatagramSocket(9898);

        //准备空数据报包
        byte[] buf = new byte[1024];
        int length = buf.length;
        DatagramPacket dp = new DatagramPacket(buf, length);

        ds.receive(dp);

        //解析数据
        int len = dp.getLength();
        String message = new String(buf, 0, len);



        System.out.println("message = " + message);
    }
}
