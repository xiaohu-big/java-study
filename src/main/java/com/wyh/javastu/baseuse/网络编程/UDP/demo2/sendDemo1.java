package com.wyh.javastu.baseuse.网络编程.UDP.demo2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author WYH
 * @version 2019年11月25日 下午6:46:00
 */
public class sendDemo1 {
    public static void main(String[] args) throws IOException {
        //创建Socket
        DatagramSocket ds = new DatagramSocket();
        //创建数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null) {
            //当输入886的时候跳出
            if("886".equals(line)) {
                break;
            }
            byte[] buf = line.getBytes();
            int length = buf.length;
            InetAddress address = InetAddress.getByName("192.168.1.255");
            int port = 12345;
            //打包数据
            DatagramPacket dp = new DatagramPacket(buf, length, address, port);
            //发送数据
            ds.send(dp);
        }


        //释放资源
        ds.close();

    }

}
