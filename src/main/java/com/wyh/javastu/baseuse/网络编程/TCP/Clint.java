package com.wyh.javastu.baseuse.网络编程.TCP;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author WYH
 * @version 2019年11月26日 下午7:17:58
 * 客户端键盘录入，服务器端控制台输出
 *
 *
 *          TCP一定要先开启服务端 java.net.ConnectException: Connection refused: connect
 *
 */
public class Clint {
    public static void main(String[] args) throws IOException {
        // 创建TCP协议的Socket对象
        Socket s = new Socket("192.168.0.103", 9997);

        /*
         * Scanner sc =new Scanner(System.in); System.out.print("请输入想要发送的数据:"); String
         * info = sc.next();
         */
        System.out.print("请输入想要发送的数据:");
        //键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //包装通道流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            //键盘录入的一定要自定义结束
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 释放资源
        s.close();

    }

}
