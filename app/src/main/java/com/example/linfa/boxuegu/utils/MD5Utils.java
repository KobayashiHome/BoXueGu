package com.example.linfa.boxuegu.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @date 2018/3/19.
 * @author skylinelin
 */

public class MD5Utils {
    /**
     * MD5加密算法
     */
    public static String md5 (String text) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(text.getBytes());
            StringBuilder builder = new StringBuilder();

            for (byte b:result) {
                int number = b & 0xff;
                String hex = Integer.toHexString(number);
                if (hex.length() == 1){
                    builder.append("0" + hex);
                }else {
                    builder.append(hex);
                }

            }
            return builder.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
