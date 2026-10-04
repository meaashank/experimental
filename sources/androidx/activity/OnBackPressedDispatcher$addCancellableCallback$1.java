package androidx.activity;

import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends FunctionReferenceImpl implements InterfaceC4376a<L0> {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void V() {
        ((OnBackPressedDispatcher) this.receiver).u();
    }

    @Override // ed.InterfaceC4376a
    public /* bridge */ /* synthetic */ L0 invoke() {
        V();
        return L0.f217464a;
    }
}
