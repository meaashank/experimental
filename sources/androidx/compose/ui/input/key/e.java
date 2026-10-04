package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final long a(@NotNull KeyEvent keyEvent) {
        return i.a(keyEvent.getKeyCode());
    }

    public static final int b(@NotNull KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            d.f102101b.getClass();
            return d.f102104e;
        }
        if (action != 1) {
            d.f102101b.getClass();
            return d.f102102c;
        }
        d.f102101b.getClass();
        return d.f102103d;
    }

    public static final int c(@NotNull KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(@NotNull KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(@NotNull KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(@NotNull KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    public static final boolean g(@NotNull KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
