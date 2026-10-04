package androidx.activity.compose;

import ed.InterfaceC4376a;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements l<InterfaceC4376a<? extends Boolean>, L0> {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public final void e(@NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        ((ReportDrawnComposition) this.receiver).h(interfaceC4376a);
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(InterfaceC4376a<? extends Boolean> interfaceC4376a) {
        e(interfaceC4376a);
        return L0.f217464a;
    }
}
