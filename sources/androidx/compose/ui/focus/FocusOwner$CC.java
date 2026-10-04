package androidx.compose.ui.focus;

import android.view.KeyEvent;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.focus.FocusOwner$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FocusOwner$CC {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean a(t tVar, KeyEvent keyEvent, InterfaceC4376a interfaceC4376a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            interfaceC4376a = new InterfaceC4376a<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                @NotNull
                public final Boolean g() {
                    return Boolean.FALSE;
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return tVar.a(keyEvent, interfaceC4376a);
    }
}
