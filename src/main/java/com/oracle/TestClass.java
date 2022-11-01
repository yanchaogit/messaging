package com.oracle;

public class TestClass {
    private int age;
    private String names;

    /**
     * set field
     *
     * @param age 描述年龄
     * 年龄
     */
    public void setAge(int age) {
//        @TestAnnotation(True)
        this.age = age;
    }

    /**
     * set field
     *
     * @param names 描述姓名
     * 姓名
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * get field
     *
     * @return age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * get field
     *
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    public static void main(String[] argv){

        @Author(first = "Oompah", last = "Loompah")
        TestClass testOjb = new TestClass();
        System.out.printf("%s,%s,%s,%s\n",testOjb.getAge(),testOjb.getNames(),testOjb.getClass().toString());
    }
}
