package dc;

import dagger.internal.f;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/* JADX INFO: renamed from: dc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@f
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Qualifier
@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC4321b {
    Class<? extends Annotation> value();
}
