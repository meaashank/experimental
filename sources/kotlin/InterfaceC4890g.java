package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: kotlin.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Target({})
@InterfaceC4887e0(version = "1.7")
@Lc.a
@Lc.d(allowedTargets = {AnnotationTarget.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC4890g {
    int count();
}
