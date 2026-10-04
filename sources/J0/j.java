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
@c.a({@c(device = b.f212473K, name = "Phone", showSystemUi = true), @c(device = "spec:width = 411dp, height = 891dp, orientation = landscape, dpi = 420", name = "Phone - Landscape", showSystemUi = true), @c(device = b.f212474L, name = "Unfolded Foldable", showSystemUi = true), @c(device = b.f212475M, name = "Tablet", showSystemUi = true), @c(device = b.f212476N, name = "Desktop", showSystemUi = true)})
@Lc.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
public @interface j {
}
