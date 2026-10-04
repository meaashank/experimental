package androidx.compose.foundation;

import androidx.compose.ui.p;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableSemanticsNode extends p.d implements androidx.compose.ui.node.x0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f88625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public String f88626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.semantics.i f88627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public InterfaceC4376a<L0> f88628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f88629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f88630t;

    public /* synthetic */ ClickableSemanticsNode(boolean z10, String str, androidx.compose.ui.semantics.i iVar, InterfaceC4376a interfaceC4376a, String str2, InterfaceC4376a interfaceC4376a2, C4969v c4969v) {
        this(z10, str, iVar, interfaceC4376a, str2, interfaceC4376a2);
    }

    @Override // androidx.compose.ui.node.x0
    public /* synthetic */ boolean B1() {
        return false;
    }

    public final void g3(boolean z10, @Nullable String str, @Nullable androidx.compose.ui.semantics.i iVar, @NotNull InterfaceC4376a<L0> interfaceC4376a, @Nullable String str2, @Nullable InterfaceC4376a<L0> interfaceC4376a2) {
        this.f88625o = z10;
        this.f88626p = str;
        this.f88627q = iVar;
        this.f88628r = interfaceC4376a;
        this.f88629s = str2;
        this.f88630t = interfaceC4376a2;
    }

    @Override // androidx.compose.ui.node.x0
    public void o0(@NotNull androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.i iVar = this.f88627q;
        if (iVar != null) {
            kotlin.jvm.internal.G.m(iVar);
            SemanticsPropertiesKt.C1(uVar, iVar.f104135a);
        }
        SemanticsPropertiesKt.I0(uVar, this.f88626p, new InterfaceC4376a<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$1
            {
                super(0);
            }

            @NotNull
            public final Boolean g() {
                this.f88631d.f88628r.invoke();
                return Boolean.TRUE;
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ Boolean invoke() {
                g();
                return Boolean.TRUE;
            }
        });
        if (this.f88630t != null) {
            SemanticsPropertiesKt.M0(uVar, this.f88629s, new InterfaceC4376a<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$2
                {
                    super(0);
                }

                @NotNull
                public final Boolean g() {
                    InterfaceC4376a<L0> interfaceC4376a = this.f88632d.f88630t;
                    if (interfaceC4376a != null) {
                        interfaceC4376a.invoke();
                    }
                    return Boolean.TRUE;
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    g();
                    return Boolean.TRUE;
                }
            });
        }
        if (this.f88625o) {
            return;
        }
        SemanticsPropertiesKt.n(uVar);
    }

    @Override // androidx.compose.ui.node.x0
    public boolean q1() {
        return true;
    }

    public ClickableSemanticsNode(boolean z10, String str, androidx.compose.ui.semantics.i iVar, InterfaceC4376a<L0> interfaceC4376a, String str2, InterfaceC4376a<L0> interfaceC4376a2) {
        this.f88625o = z10;
        this.f88626p = str;
        this.f88627q = iVar;
        this.f88628r = interfaceC4376a;
        this.f88629s = str2;
        this.f88630t = interfaceC4376a2;
    }
}
