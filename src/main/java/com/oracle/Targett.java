package com.oracle;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//[rɪˈtenʃn]保留
@Retention(RetentionPolicy.RUNTIME)
// [ˈtɑ:gɪt]目标
@Target(ElementType.METHOD)
@interface Test {

}

@SetCustomAnnotation
class Junit{
    @Test
    public static void test1(){

    }

    public static void test2(){

    }

    public static void test3(){

    }

    @Test
    public static void test4(){

    }

}

public class Targett{
    public static void main(String[] args) throws Exception{
        //1.1通过反射获取类
        Class<?> forName = Class.forName("com.oracle.Junit");
        //1.2获取该类自身声明的所有方法
        Method[] methods = forName.getDeclaredMethods();
        Annotation[] annotations = forName.getAnnotations();
        int checkCount = 0; //测试的数量
        int uncheckCount = 0;  //未测试的数量
        for (Method method : methods) {
            if(method.isAnnotationPresent(Test.class)){
                checkCount++;
            }else{
                uncheckCount++;
            }
        }
        System.out.println("标注的方法有" + checkCount);
        System.out.println("未标注的方法有" + uncheckCount);
        int i = 0;
        for (Annotation annotation: annotations)
        {
            System.out.printf("#%02d:,%s,%s",i++,annotation.toString(),annotation.getClass());
        }
    }
}