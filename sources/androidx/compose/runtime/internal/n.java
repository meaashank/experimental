package androidx.compose.runtime.internal;

import androidx.compose.runtime.InterfaceC1935o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Lc.c(AnnotationRetention.RUNTIME)
@InterfaceC1935o
@Lc.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface n {
    String file();
}
