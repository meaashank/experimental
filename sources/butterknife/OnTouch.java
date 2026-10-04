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
@ListenerClass(method = {@ListenerMethod(defaultReturn = "true", name = "onTouch", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f103257O, "android.view.MotionEvent"}, returnType = x.b.f238265f)}, setter = "setOnTouchListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103257O, type = "android.view.View.OnTouchListener")
public @interface OnTouch {
    @C
    int[] value() default {-1};
}
