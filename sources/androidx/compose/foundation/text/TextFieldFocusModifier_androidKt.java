package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.C1989d;
import androidx.compose.ui.focus.InterfaceC1999n;
import androidx.compose.ui.platform.InterfaceC2285u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull final LegacyTextFieldState legacyTextFieldState, @NotNull final InterfaceC1999n interfaceC1999n) {
        return androidx.compose.ui.input.key.f.b(pVar, new ed.l<androidx.compose.ui.input.key.c, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean e(@NotNull KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zJ = false;
                if (device != null && device.supportsSource(513) && !device.isVirtual()) {
                    int iB = androidx.compose.ui.input.key.e.b(keyEvent);
                    androidx.compose.ui.input.key.d.f102101b.getClass();
                    if (iB == androidx.compose.ui.input.key.d.f102104e && keyEvent.getSource() != 257) {
                        if (TextFieldFocusModifier_androidKt.c(keyEvent, 19)) {
                            InterfaceC1999n interfaceC1999n2 = interfaceC1999n;
                            C1989d.f100651b.getClass();
                            zJ = interfaceC1999n2.j(C1989d.f100656g);
                        } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 20)) {
                            InterfaceC1999n interfaceC1999n3 = interfaceC1999n;
                            C1989d.f100651b.getClass();
                            zJ = interfaceC1999n3.j(C1989d.f100657h);
                        } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 21)) {
                            InterfaceC1999n interfaceC1999n4 = interfaceC1999n;
                            C1989d.f100651b.getClass();
                            zJ = interfaceC1999n4.j(C1989d.f100654e);
                        } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 22)) {
                            InterfaceC1999n interfaceC1999n5 = interfaceC1999n;
                            C1989d.f100651b.getClass();
                            zJ = interfaceC1999n5.j(C1989d.f100655f);
                        } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 23)) {
                            InterfaceC2285u1 interfaceC2285u1 = legacyTextFieldState.f93320c;
                            if (interfaceC2285u1 != null) {
                                interfaceC2285u1.show();
                            }
                            zJ = true;
                        }
                    }
                }
                return Boolean.valueOf(zJ);
            }

            @Override // ed.l
            public /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return e(cVar.f102100a);
            }
        });
    }

    public static final boolean c(KeyEvent keyEvent, int i10) {
        return ((int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32)) == i10;
    }
}
