package Lc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.ANNOTATION_TYPE})
@a
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
    AnnotationTarget[] allowedTargets();
}
