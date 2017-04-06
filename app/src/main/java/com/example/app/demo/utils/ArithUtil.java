package com.example.app.demo.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ArithUtil {
    private static final int DEF_DIV_SCALE = 10;

    private ArithUtil() {
    }

    /**
     * 两个double相加
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 两个double相减
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 两个double型的String字符相减
     *
     * @param doubleString1
     * @param doubleString2
     * @return
     */
    public static double sub(String doubleString1, String doubleString2) {
        BigDecimal b1 = new BigDecimal(doubleString1);
        BigDecimal b2 = new BigDecimal(doubleString2);
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 两个double相乘
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 两个String 相乘
     *
     * @param v1
     * @param v2
     * @return int
     */
    public static int mul(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).intValue();
    }

    /**
     * 两个double相除
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    //保留 两位小数,返回字符串
    public static String convertToDouble(String price) {
        String finalPrice = "";
        try {
            Double doublePrice = Double.parseDouble(price);
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            finalPrice = decimalFormat.format(doublePrice);
        } catch (Exception e) {
            finalPrice = "0.0";
        }
        return finalPrice;
    }

    public static int parseInt(String intString) {
        int parseInt = 0;
        try {
            parseInt = Integer.parseInt(intString);
        } catch (Exception e) {
            parseInt = 0;
        }
        return parseInt;
    }

    public static double parseDouble(String doubleString) {
        double parseDouble = 0.0;
        try {
            parseDouble = Double.parseDouble(doubleString);
        } catch (Exception e) {
            parseDouble = 0.0;
        }
        return parseDouble;
    }
}