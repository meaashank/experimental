package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes2.dex */
@Target({})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
public @interface H {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
