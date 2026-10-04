package j0;

import j0.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Lc.c(AnnotationRetention.BINARY)
@c.a({@c(name = "Red", wallpaper = 0), @c(name = "Blue", wallpaper = 2), @c(name = "Green", wallpaper = 1), @c(name = "Yellow", wallpaper = 3)})
@Lc.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
public @interface d {
}
