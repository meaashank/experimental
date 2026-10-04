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
@ListenerClass(method = {@ListenerMethod(defaultReturn = "true", name = "onEditorAction", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f103259Q, "int", "android.view.KeyEvent"}, returnType = x.b.f238265f)}, setter = "setOnEditorActionListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103259Q, type = "android.widget.TextView.OnEditorActionListener")
public @interface OnEditorAction {
    @C
    int[] value() default {-1};
}
