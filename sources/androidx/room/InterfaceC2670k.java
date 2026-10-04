package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: androidx.room.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC2670k {
    String value() default "";

    String viewName() default "";
}
