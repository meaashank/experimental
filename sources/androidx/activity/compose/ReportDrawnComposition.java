package androidx.activity.compose;

import androidx.activity.z;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import ed.InterfaceC4376a;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ReportDrawnComposition implements InterfaceC4376a<L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final z f84970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Boolean> f84971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SnapshotStateObserver f84972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l<InterfaceC4376a<Boolean>, L0> f84973d;

    public ReportDrawnComposition(@NotNull z zVar, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        this.f84970a = zVar;
        this.f84971b = interfaceC4376a;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<InterfaceC4376a<? extends L0>, L0>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            public final void e(@NotNull InterfaceC4376a<L0> interfaceC4376a2) {
                interfaceC4376a2.invoke();
            }

            @Override // ed.l
            public L0 invoke(InterfaceC4376a<? extends L0> interfaceC4376a2) {
                interfaceC4376a2.invoke();
                return L0.f217464a;
            }
        });
        snapshotStateObserver.v();
        this.f84972c = snapshotStateObserver;
        this.f84973d = new ReportDrawnComposition$checkReporter$1(this);
        zVar.b(this);
        if (zVar.e()) {
            return;
        }
        zVar.c();
        h(interfaceC4376a);
    }

    public void g() {
        this.f84972c.j();
        this.f84972c.w();
    }

    public final void h(final InterfaceC4376a<Boolean> interfaceC4376a) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f84972c.q(interfaceC4376a, this.f84973d, new InterfaceC4376a<L0>() { // from class: androidx.activity.compose.ReportDrawnComposition$observeReporter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                booleanRef.f217897a = interfaceC4376a.invoke().booleanValue();
            }
        });
        if (booleanRef.f217897a) {
            i();
        }
    }

    public final void i() {
        this.f84972c.k(this.f84971b);
        if (!this.f84970a.e()) {
            this.f84970a.h();
        }
        g();
    }

    @Override // ed.InterfaceC4376a
    public /* bridge */ /* synthetic */ L0 invoke() {
        g();
        return L0.f217464a;
    }
}
