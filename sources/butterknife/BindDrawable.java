package butterknife;

import e.InterfaceC4332f;
import e.InterfaceC4346u;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BindDrawable {
    @InterfaceC4332f
    int tint() default -1;

    @InterfaceC4346u
    int value();
}
