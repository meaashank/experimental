package bc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: bc.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC2857g {
    Class<?>[] includes() default {};

    Class<?>[] subcomponents() default {};
}
