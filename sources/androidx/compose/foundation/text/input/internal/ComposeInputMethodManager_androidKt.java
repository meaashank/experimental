package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static ed.l<? super View, ? extends InterfaceC1802q> f93674a = new ed.l<View, InterfaceC1802q>() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // ed.l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1802q invoke(@NotNull View view) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 34 ? new C1815x(view) : i10 >= 24 ? new C1809u(view) : new C1805s(view);
        }
    };

    @NotNull
    public static final InterfaceC1802q a(@NotNull View view) {
        return f93674a.invoke(view);
    }

    @TestOnly
    @e.f0
    @NotNull
    public static final ed.l<View, InterfaceC1802q> b(@NotNull ed.l<? super View, ? extends InterfaceC1802q> lVar) {
        ed.l lVar2 = f93674a;
        f93674a = lVar;
        return lVar2;
    }
}
