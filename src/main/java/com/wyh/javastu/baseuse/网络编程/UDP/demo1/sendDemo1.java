package com.wyh.javastu.baseuse.网络编程.UDP.demo1;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author WYH
 * @version 2019年11月25日 下午6:46:00
 */
public class sendDemo1 {
    public static void main(String[] args) throws IOException {
        //创建Socket
        DatagramSocket ds = new DatagramSocket();
        //创建数据
        byte[] buf = "你好，我是优化后的数据".getBytes();
        int length = buf.length;
        InetAddress address = InetAddress.getByName("192.168.1.103");
        int port = 12345;
        //打包数据
        DatagramPacket dp = new DatagramPacket(buf, length, address, port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();

    }

}