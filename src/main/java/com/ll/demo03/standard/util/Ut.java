package com.ll.demo03.standard.util;

public class Ut {
    public static class str {
        public static boolean isBlank(String str) {
            return str == null || str.isBlank();
        }

        public static boolean hasLength(String str) {
            return !isBlank(str);
        }
    }
}
