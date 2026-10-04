package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(34)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1792l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1792l f94105a = new C1792l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94106b = 0;

    @InterfaceC4345t
    public final void a(@NotNull InputMethodManager inputMethodManager, @NotNull View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
