package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4345t;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    @e.T(26)
    public static class a {
        @InterfaceC4345t
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            e0.g(view, charSequence);
        }
    }
}
