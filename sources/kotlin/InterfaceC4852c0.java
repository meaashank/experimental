package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: renamed from: kotlin.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Target({})
@Lc.c(AnnotationRetention.BINARY)
@Lc.a
@Lc.d(allowedTargets = {})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC4852c0 {
    String expression();

    String[] imports();
}
