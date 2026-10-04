package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: kotlin.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@InterfaceC4887e0(version = "1.3")
@Lc.c(AnnotationRetention.BINARY)
@Wc.f
@Lc.d(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4849b {
}
