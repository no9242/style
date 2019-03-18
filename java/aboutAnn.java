import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 注释,以注释的形式使用,是程序专用的注释
 * 中新手按官方文档使用即可, 后期再自定义使用
 */
public @interface aboutAnn {
    String name();
    String value() default "hello world";
}