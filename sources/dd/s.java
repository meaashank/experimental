package dd;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@Lc.c(AnnotationRetention.RUNTIME)
@Lc.a
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface s {
    String value();
}
