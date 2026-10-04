package dd;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC4887e0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({})
@InterfaceC4887e0(version = "1.2")
@Retention(RetentionPolicy.SOURCE)
@Lc.c(AnnotationRetention.SOURCE)
@Lc.a
@Lc.d(allowedTargets = {AnnotationTarget.FILE})
@Documented
public @interface l {
    String name();
}
