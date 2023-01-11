package com.hanyi._10内部类_匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 目标：匿名内部类的使用形式。
 *
 * 需求：很多角色要一起参加游泳比赛
 */
public class Anonymity02 {
    public static void main(String[] args) {

        // 1.创建一个窗口
        JFrame win = new JFrame("登录界面");

        // 2.设置窗口的大小
        win.setSize(400, 300);

        // 3.居中
        win.setLocationRelativeTo(null);

        // 4.为当前界面加上一个按钮对象
        JButton btn = new JButton("开始登录");
        JPanel panel = new JPanel();
        panel.add(btn);
        win.add(panel);

        // 5.为当前按钮对象绑定一个单击事件监听器
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("用户出发了登录");
            }
        });

        //匿名内部类常用方式
        //btn.addActionListener(s -> System.out.println("出牛壁垒"));

        // 6.显示窗口
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
