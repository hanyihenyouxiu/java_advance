package com.hanyi._08TCP通信方式四;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2023/2/15
 * Time: 22:06
 * Description:
 *
 * @author 寒毅
 */
public class ReadClientRunnable implements Runnable{

    private Socket socket;

    public ReadClientRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            Reader fr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(fr);
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
