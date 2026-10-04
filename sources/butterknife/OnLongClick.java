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
@ListenerClass(method = {@ListenerMethod(defaultReturn = "true", name = "onLongClick", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f103257O}, returnType = x.b.f238265f)}, setter = "setOnLongClickListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f103257O, type = "android.view.View.OnLongClickListener")
public @interface OnLongClick {
    @C
    int[] value() default {-1};
}
