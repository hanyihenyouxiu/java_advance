package com.hanyi._06TCP通信方式二;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/2/15
 * Time: 17:33
 * Description:
 *
 * @author 寒毅
 */
public class SeverDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动了！");
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream inputStream = socket.getInputStream();
        Reader fr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(fr);
        String msg;
        while ((msg = br.readLine()) != null) {
            System.out.println(msg);
        }
    }
}
