package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: androidx.compose.runtime.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1936o0
@Target({ElementType.METHOD})
@Lc.c(AnnotationRetention.BINARY)
@Lc.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC1920j {
    String scheme();
}
