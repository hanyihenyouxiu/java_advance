package com.hanyi._05字符缓冲流;

/**
 *  目标：字符缓冲输出流：BufferedWriter
 *      -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能。
 *      -- 构造器：public BufferedWriter(Writer writer)
 *      -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了！
 *      -- 字符缓冲输出流除了提高字符输出流写数据的性能，还多了一个换行的特有功能；
 *         public void newLine()：新建一行
 *  小结：
 *      缓冲字符输出流可以把低级的字符输出流进行包装。提高了写字符的性能。
 *      多了一个换行的功能:public void newLine()：新建一行。
 */
public class BufferWriterDemo {
}
