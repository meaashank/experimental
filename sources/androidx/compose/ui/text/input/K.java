package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    @NotNull
    public static final A a(@NotNull InputConnection inputConnection, @NotNull ed.l<? super A, L0> lVar) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 34 ? new J(inputConnection, lVar) : i10 >= 25 ? new G(inputConnection, lVar) : i10 >= 24 ? new F(inputConnection, lVar) : new B(inputConnection, lVar);
    }
}
