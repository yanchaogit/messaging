package com.oracle;

public @interface Author {
    String first() default "Hello";
    String last() default "World";
}
