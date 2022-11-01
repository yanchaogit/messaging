package com.oracle;

public @interface Check {
    int min() default  0;
    int max() default  0;
    int value() default  0;
}
