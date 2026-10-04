package androidx.annotation;

import Lc.a;
import Lc.c;
import Lc.d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@c(AnnotationRetention.BINARY)
@a
@d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface CheckResult {
    String suggest() default "";
}
