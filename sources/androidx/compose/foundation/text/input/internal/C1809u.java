package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(24)
public class C1809u extends C1805s {
    public C1809u(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.C1805s, androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void sendKeyEvent(@NotNull KeyEvent keyEvent) {
        l().dispatchKeyEventFromInputMethod(this.f94116a, keyEvent);
    }
}
