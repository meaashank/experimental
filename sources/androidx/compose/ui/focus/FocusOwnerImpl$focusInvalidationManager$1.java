package androidx.compose.ui.focus;

import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class FocusOwnerImpl$focusInvalidationManager$1 extends FunctionReferenceImpl implements InterfaceC4376a<L0> {
    public FocusOwnerImpl$focusInvalidationManager$1(Object obj) {
        super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
    }

    public final void V() {
        ((FocusOwnerImpl) this.receiver).t();
    }

    @Override // ed.InterfaceC4376a
    public /* bridge */ /* synthetic */ L0 invoke() {
        V();
        return L0.f217464a;
    }
}
