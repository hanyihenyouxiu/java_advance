package com.itheima._05多态接口的综合案例;

/**
 * 拓展：面向对象思想设计一个电脑对象，可以介入两个USB设备
 * （鼠标，键盘：实现接入，调用独有功能，拔出）
 *
 * 分析：
 *      (1)提供两个USB设备。(USB设备必须满足；接入和拔出的功能)
 *      (2)定义一个USB的接口(申明USB设备的规范必须是实现接入和拔出的功能)
 *      (3)开始定义2个真是的实现类代表鼠标和键盘
 *      (4)定义一个电脑类。
 */
public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb1 = new Mouse("小米");
        computer.install(usb1);
        USB usb2 = new KeyBoard("逻辑");
        computer.install(usb2);
    }
}

class Computer {
    // 提供一个安装USB设备的入口
    public void install(USB usb) {
        usb.connect();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.dbClick();
        }

        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.keyDown();
        }
        usb.unConnect();
    }
}

class Mouse implements USB{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    // 双击

    public void dbClick() {
        System.out.println(name + "双击了,666");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功加入了设备.");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "成功拔出了设备");
    }
}

class KeyBoard implements USB{

    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    // 案件
    public void keyDown() {
        System.out.println(name + "敲击了一哈");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功加入了设备.");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "成功拔出了设备");
    }
}

// 定义USB的规范，必须要完成接入和拔出的功能
interface USB {
    void connect(); // 接入

    void unConnect(); // 拔出
}
