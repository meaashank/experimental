package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    @NotNull
    public static final TextFieldKeyEventHandler b() {
        return new C1770a();
    }

    public static final boolean c(@NotNull KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean d(KeyEvent keyEvent, int i10) {
        return ((int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32)) == i10;
    }
}
