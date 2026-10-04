package butterknife;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import e.C;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(method = {@ListenerMethod(name = "onFocusChange", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f103257O, x.b.f238265f})}, setter = "setOnFocusChangeListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103257O, type = "android.view.View.OnFocusChangeListener")
public @interface OnFocusChange {
    @C
    int[] value() default {-1};
}
