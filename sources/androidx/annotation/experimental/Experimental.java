package androidx.annotation.experimental;

import Lc.c;
import Lc.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@c(AnnotationRetention.BINARY)
@InterfaceC4982o(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @InterfaceC4852c0(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
public @interface Experimental {

    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
