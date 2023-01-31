package com.hanyi._01编程思维题目;

import java.io.*;
import java.nio.file.Files;

/**
 * 目标：复制文件夹
 * <p>
 * 源文件：/xx/xx
 * 目标文件：/yy/yy
 * 不能运行，只学习了解。
 */
public class CopyDirDemo02 {
    public static void main(String[] args) {
        copyDir(new File("/xx/xx"), new File("/yy/yy"));
    }

    /**
     * 复制文件夹
     *
     * @param srcDir  源文件夹
     * @param destDir 目标文件夹
     */
    public static void copyDir(File srcDir, File destDir) {
        if (srcDir.exists() && srcDir.isDirectory()) {
            destDir.mkdirs();
            File[] files = srcDir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        copyFile(file, new File(destDir + file.getName()));
                    } else {
                        copyDir(file, new File(destDir, file.getName()));
                    }
                }
            }
        }
    }

    public static void copyFile(File srcFile, File destFile) {

        try (InputStream is = Files.newInputStream(srcFile.toPath());
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream os = Files.newOutputStream(destFile.toPath());
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
            int length;
            byte[] buffer = new byte[1024];
            while ((length = bis.read(buffer)) > 0) {
            //while ((length = bis.read(buffer)) == -1) {
                bos.write(buffer, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
