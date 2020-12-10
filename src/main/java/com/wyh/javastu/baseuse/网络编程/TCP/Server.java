package com.wyh.javastu.baseuse.网络编程.TCP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author WYH
 * @version 2019年11月26日 下午7:28:59
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9997);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();

        //包装通道里的流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(ip + ":" + line);
        }

        s.close();

    }

}
