package com.wyh.javastu.baseuse.网络编程.UDP.demo2;


import java.io.IOException;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author WYH
 * @version 2019年11月25日 下午6:40:16
 */
public class reciveDemo1 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket(12345);


        byte[] bt =new byte[1024];
        //创建包裹
        DatagramPacket dp = new DatagramPacket(bt, bt.length);
        //while(true) 保证它可以一直可以接收数据
        while(true) {
            //接收数据
            ds.receive(dp);

            //解析数据
            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(),0,dp.getLength());
            System.out.println("主机名："+ip+",接收的数据是："+s);
        }


        //释放资源
        //ds.close();

    }

}