package com.gtr.staticmethod;

//静态方法设计工具类
public class VerifyCodeUtil {

    //因为工具类没有创建对象的需求，所以建议私有化
    private VerifyCodeUtil(){}

        public static String generateVerifyCode(int length){
            String code = "";
            for (int i = 0; i < length; i++) {
                int choice = (int) (Math.random() * 3);
                switch (choice) {
                    case 0:
                        int num = (int) (Math.random() * 10);
                        code += num;
                        break;
                    case 1:
                        int lower = (int) (Math.random() * 26);
                        char ch1 = (char) ('a' + lower);
                        code += ch1;
                        break;
                    default:
                        int upper = (int) (Math.random() * 26);
                        char ch2 = (char) ('A' + upper);
                        code += ch2;
                }
            }
            return code;
        }
    }