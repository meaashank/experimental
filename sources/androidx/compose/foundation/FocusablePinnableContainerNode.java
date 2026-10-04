package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.node.C2201f;
import androidx.compose.ui.node.InterfaceC2199e;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FocusablePinnableContainerNode extends p.d implements InterfaceC2199e, androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public u0.a f88692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f88693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f88694q;

    @Override // androidx.compose.ui.node.g0
    public void E1() {
        androidx.compose.ui.layout.u0 u0VarE3 = e3();
        if (this.f88693p) {
            u0.a aVar = this.f88692o;
            if (aVar != null) {
                aVar.release();
            }
            this.f88692o = u0VarE3 != null ? u0VarE3.a() : null;
        }
    }

    @Override // androidx.compose.ui.p.d
    public boolean H2() {
        return this.f88694q;
    }

    @Override // androidx.compose.ui.p.d
    public void Q2() {
        u0.a aVar = this.f88692o;
        if (aVar != null) {
            aVar.release();
        }
        this.f88692o = null;
    }

    public final androidx.compose.ui.layout.u0 e3() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        androidx.compose.ui.node.h0.a(this, new InterfaceC4376a<L0>() { // from class: androidx.compose.foundation.FocusablePinnableContainerNode$retrievePinnableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.f217904a = C2201f.a(this, PinnableContainerKt.a());
            }
        });
        return (androidx.compose.ui.layout.u0) objectRef.f217904a;
    }

    public final void f3(boolean z10) {
        if (z10) {
            androidx.compose.ui.layout.u0 u0VarE3 = e3();
            this.f88692o = u0VarE3 != null ? u0VarE3.a() : null;
        } else {
            u0.a aVar = this.f88692o;
            if (aVar != null) {
                aVar.release();
            }
            this.f88692o = null;
        }
        this.f88693p = z10;
    }
}
