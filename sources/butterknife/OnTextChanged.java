package butterknife;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import butterknife.internal.ListenerClass;
import e.C;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(callbacks = Callback.class, remover = "removeTextChangedListener", setter = "addTextChangedListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103259Q, type = "android.text.TextWatcher")
public @interface OnTextChanged {

    public enum Callback {
        TEXT_CHANGED,
        BEFORE_TEXT_CHANGED,
        AFTER_TEXT_CHANGED
    }

    Callback callback() default Callback.TEXT_CHANGED;

    @C
    int[] value() default {-1};
}
