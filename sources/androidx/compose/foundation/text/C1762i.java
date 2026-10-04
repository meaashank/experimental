package androidx.compose.foundation.text;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1762i {
    public static final boolean a(@NotNull KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        return iB == androidx.compose.ui.input.key.d.f102103d;
    }

    public static final void b() {
    }
}
