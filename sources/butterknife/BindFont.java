package butterknife;

import androidx.annotation.RestrictTo;
import e.InterfaceC4349x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BindFont {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface TypefaceStyle {
    }

    @TypefaceStyle
    int style() default 0;

    @InterfaceC4349x
    int value();
}
