package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.focus.InterfaceC1999n;
import androidx.compose.ui.platform.InterfaceC2285u1;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1770a extends TextFieldKeyEventHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94058e = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public boolean b(@NotNull KeyEvent keyEvent, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, boolean z10, boolean z11, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        if (iB == androidx.compose.ui.input.key.d.f102104e && keyEvent.isFromSource(257) && !a1.c(keyEvent)) {
            textFieldSelectionState.y0(false);
        }
        return super.b(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, z10, z11, interfaceC4376a);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public boolean c(@NotNull KeyEvent keyEvent, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull InterfaceC1999n interfaceC1999n, @NotNull InterfaceC2285u1 interfaceC2285u1) {
        if (super.c(keyEvent, transformedTextFieldState, textFieldSelectionState, interfaceC1999n, interfaceC2285u1)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual()) {
            return false;
        }
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        if (iB != androidx.compose.ui.input.key.d.f102104e || keyEvent.getSource() == 257) {
            return false;
        }
        if (a1.d(keyEvent, 19)) {
            C1989d.f100651b.getClass();
            return interfaceC1999n.j(C1989d.f100656g);
        }
        if (a1.d(keyEvent, 20)) {
            C1989d.f100651b.getClass();
            return interfaceC1999n.j(C1989d.f100657h);
        }
        if (a1.d(keyEvent, 21)) {
            C1989d.f100651b.getClass();
            return interfaceC1999n.j(C1989d.f100654e);
        }
        if (a1.d(keyEvent, 22)) {
            C1989d.f100651b.getClass();
            return interfaceC1999n.j(C1989d.f100655f);
        }
        if (!a1.d(keyEvent, 23)) {
            return false;
        }
        interfaceC2285u1.show();
        return true;
    }
}
