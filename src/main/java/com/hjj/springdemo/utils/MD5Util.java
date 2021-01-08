package com.hjj.springdemo.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @program: SpringBootDemo
 * @description: MD5加密工具
 * @author: hjj
 * @create: 2020-12-31 21:14
 **/
public class MD5Util {
    private static final String SALT = "tamboo";

    public static String encode(String password) {
        password = password + SALT;
        /**
         * MessageDigest功能：
         * 1.单向文本加密
         * 2.不论输入的文本多长，输出固定长度的hash值
         *
         * 使用过程：
         * 1.创建实例
         * 2.调用update()方法开始计算，
         * 3.调用digest()方法获取加密内容
         */
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        char[] charArray = password.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if(val < 16){
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static void main(String[] args) {
        System.out.println(MD5Util.encode("abel"));
    }
}
