package butterknife;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import e.C;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(method = {@ListenerMethod(name = "doClick", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f103257O})}, setter = "setOnClickListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103257O, type = "butterknife.internal.DebouncingOnClickListener")
public @interface OnClick {
    @C
    int[] value() default {-1};
}
