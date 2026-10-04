package androidx.compose.foundation.text;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1822k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC1821j f94400a = new a();

    /* JADX INFO: renamed from: androidx.compose.foundation.text.k$a */
    public static final class a implements InterfaceC1821j {
        @Override // androidx.compose.foundation.text.InterfaceC1821j
        @Nullable
        public KeyCommand a(@NotNull KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long jA = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA, r.f94608j)) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94609k)) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94610l)) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.b.E4(jA, r.f94611m)) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA2 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                r.f94599a.getClass();
                if (androidx.compose.ui.input.key.b.E4(jA2, r.f94608j)) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94609k)) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94610l)) {
                    keyCommand = KeyCommand.HOME;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, r.f94611m)) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.b().a(keyEvent) : keyCommand;
        }
    }

    @NotNull
    public static final InterfaceC1821j a() {
        return f94400a;
    }
}
