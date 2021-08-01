package com.offcn.Demos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPReceiveGroup {

    public static void main(String[] args) throws IOException {
        //创建通信点对象
        MulticastSocket ms = new MulticastSocket(8989);

        //加入组播
        InetAddress ip = InetAddress.getByName("224.0.0.23");
        ms.joinGroup(ip);

        //准备空包接收
        byte[] buf = new byte[1024];
        int length = buf.length;
        DatagramPacket dp = new DatagramPacket(buf, length);

        ms.receive(dp);

        //解析数据
        int len = dp.getLength();
        String message = new String(buf, 0, len);

        System.out.println("message = " + message);

        ms.close();
    }
}
