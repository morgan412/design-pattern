package com.turbo.template.concrete;

import com.turbo.template.abstr.GetTimeTemplate;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author zouxq
 */
public class CopyFileDemo extends GetTimeTemplate {
    @Override
    public void code() {
        //复制文件
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("1.jpg"));

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("2.jpg"));

            byte[] bs = new byte[256];
            int len = 0;

            while ((len = inputStream.read(bs)) != -1) {
                outputStream.write(bs, 0, len);
                outputStream.flush();
            }
            //释放资源
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
