package j0;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
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
@c.a({@c(fontScale = 0.85f, name = "85%"), @c(fontScale = 1.0f, name = "100%"), @c(fontScale = 1.15f, name = "115%"), @c(fontScale = 1.3f, name = "130%"), @c(fontScale = 1.5f, name = "150%"), @c(fontScale = 1.8f, name = "180%"), @c(fontScale = SwipeRefreshLayout.f117485b0, name = "200%")})
@Lc.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
public @interface e {
}
