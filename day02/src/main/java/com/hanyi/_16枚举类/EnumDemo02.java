package com.hanyi._16枚举类;

/**
 * 目标：枚举类用于做信息标志和信息分类。
 * 常量做信息标志和分类：虽然也挺好，但是入参不受控制，入参太随性无法严谨。
 * 枚举类用于做信息标志和信息分类：优雅！
 *
 * 小结：信息标准和信息分类
 */

enum Oritation{
    UP, DOWN, LEFT, RIGHT
}


public class EnumDemo02 {

    public static void main(String[] args) {
        move(Oritation.LEFT);
    }

    public static void move(Oritation oritation) {
        switch (oritation) {
            case UP:
                System.out.println("控制玛丽向上");
            case DOWN:
                System.out.println("控制玛丽向下");
            case LEFT:
                System.out.println("控制玛丽向左");
            case RIGHT:
                System.out.println("控制玛丽向右");
        }
    }






//    public static final int UP = 0;
//    public static final int DOWN = 1;
//    public static final int LEFT = 2;
//    public static final int RIGHT = 3;
//
//    public static void main(String[] args) {
//        move(LEFT);
//    }
//
//    public static void move(int oritation) {
//        switch (oritation) {
//            case UP:
//                System.out.println("控制玛丽向上");
//            case DOWN:
//                System.out.println("控制玛丽向下");
//            case LEFT:
//                System.out.println("控制玛丽向左");
//            case RIGHT:
//                System.out.println("控制玛丽向右");
//        }
//    }
}
