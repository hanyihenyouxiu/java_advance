package com.hanyi._07转换流;

/**
 * 目标：字符输入转换流InputStreamReader的使用。
 *
 *
 * 字符输入转换流InputStreamReader：
 *      -- 作用：可以解决字符流读取不同编码乱码的问题。
 *              可以把原始的字节流按照当前默认的代码编码转换成字符流输入流。
 *              也可以把原始的字节流按照指定编码转换成字符输入流。
 *
 *      -- 构造器：
 *              public InputStreamReader(InputStream is)：可以还是用当前代码默认编码转换成字符输入流
 *              public InputStreamReader(InputStream is,String charset)：指定编码转成成字符输入流。
 */
public class InputStreamReaderDemo01 {
}
