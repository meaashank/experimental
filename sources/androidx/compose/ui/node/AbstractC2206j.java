package androidx.compose.ui.node;

import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.node.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,288:1\n245#1,6:289\n245#1,6:295\n245#1,6:321\n245#1,6:327\n245#1,6:333\n245#1,6:339\n245#1,6:345\n42#2,7:301\n42#2,7:314\n78#3:308\n78#3:310\n78#3:312\n61#4:309\n61#4:311\n61#4:313\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:289,6\n64#1:295,6\n254#1:321,6\n265#1:327,6\n273#1:333,6\n279#1:339,6\n285#1:345,6\n95#1:301,7\n192#1:314,7\n117#1:308\n173#1:310\n187#1:312\n117#1:309\n173#1:311\n187#1:313\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC2206j extends p.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f103064q = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f103065o = C2200e0.g(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public p.d f103066p;

    public static /* synthetic */ void j3() {
    }

    @Override // androidx.compose.ui.p.d
    public void M2() {
        super.M2();
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.d3(this.f103122h);
            if (!dVar.f103127m) {
                dVar.M2();
            }
        }
    }

    @Override // androidx.compose.ui.p.d
    public void N2() {
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.N2();
        }
        super.N2();
    }

    @Override // androidx.compose.ui.p.d
    public void R2() {
        super.R2();
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.R2();
        }
    }

    @Override // androidx.compose.ui.p.d
    public void S2() {
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.S2();
        }
        super.S2();
    }

    @Override // androidx.compose.ui.p.d
    public void T2() {
        super.T2();
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.T2();
        }
    }

    @Override // androidx.compose.ui.p.d
    public void V2(@NotNull p.d dVar) {
        this.f103115a = dVar;
        for (p.d dVar2 = this.f103066p; dVar2 != null; dVar2 = dVar2.f103120f) {
            dVar2.V2(dVar);
        }
    }

    @Override // androidx.compose.ui.p.d
    public void d3(@Nullable NodeCoordinator nodeCoordinator) {
        this.f103122h = nodeCoordinator;
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            dVar.d3(nodeCoordinator);
        }
    }

    @NotNull
    public final <T extends InterfaceC2203g> T e3(@NotNull T t10) {
        p.d dVarG0 = t10.g0();
        if (dVarG0 != t10) {
            p.d dVar = t10 instanceof p.d ? (p.d) t10 : null;
            p.d dVar2 = dVar != null ? dVar.f103119e : null;
            if (dVarG0 != this.f103115a || !kotlin.jvm.internal.G.g(dVar2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (dVarG0.f103127m) {
                W.a.g("Cannot delegate to an already attached node");
                throw null;
            }
            dVarG0.V2(this.f103115a);
            int i10 = this.f103117c;
            int iH = C2200e0.h(dVarG0);
            dVarG0.f103117c = iH;
            o3(iH, dVarG0);
            dVarG0.f103120f = this.f103066p;
            this.f103066p = dVarG0;
            dVarG0.f103119e = this;
            n3(this.f103117c | iH, false);
            if (this.f103127m) {
                if ((iH & 2) == 0 || (i10 & 2) != 0) {
                    d3(this.f103122h);
                } else {
                    C2194b0 c2194b0 = C2204h.r(this).f102729A;
                    this.f103115a.d3(null);
                    c2194b0.M();
                }
                dVarG0.M2();
                dVarG0.S2();
                C2200e0.a(dVarG0);
            }
        }
        return t10;
    }

    @NotNull
    public final <T extends InterfaceC2203g> T f3(@NotNull T t10) {
        e3(t10);
        return t10;
    }

    public final void g3(@NotNull ed.l<? super p.d, L0> lVar) {
        for (p.d dVar = this.f103066p; dVar != null; dVar = dVar.f103120f) {
            lVar.invoke(dVar);
        }
    }

    @Nullable
    public final p.d h3() {
        return this.f103066p;
    }

    public final int i3() {
        return this.f103065o;
    }

    public final void k3(@Nullable p.d dVar) {
        this.f103066p = dVar;
    }

    public final void l3(@NotNull InterfaceC2203g interfaceC2203g) {
        p.d dVar = null;
        for (p.d dVar2 = this.f103066p; dVar2 != null; dVar2 = dVar2.f103120f) {
            if (dVar2 == interfaceC2203g) {
                if (dVar2.f103127m) {
                    C2200e0.d(dVar2);
                    dVar2.T2();
                    dVar2.N2();
                }
                dVar2.V2(dVar2);
                dVar2.f103118d = 0;
                if (dVar == null) {
                    this.f103066p = dVar2.f103120f;
                } else {
                    dVar.f103120f = dVar2.f103120f;
                }
                dVar2.f103120f = null;
                dVar2.f103119e = null;
                int i10 = this.f103117c;
                int iH = C2200e0.h(this);
                n3(iH, true);
                if (this.f103127m && (i10 & 2) != 0 && (iH & 2) == 0) {
                    C2194b0 c2194b0 = C2204h.r(this).f102729A;
                    this.f103115a.d3(null);
                    c2194b0.M();
                    return;
                }
                return;
            }
            dVar = dVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2203g).toString());
    }

    public final void m3(@NotNull InterfaceC2203g interfaceC2203g) {
        l3(interfaceC2203g);
    }

    public final void n3(int i10, boolean z10) {
        p.d dVar;
        int i11 = this.f103117c;
        this.f103117c = i10;
        if (i11 != i10) {
            if (g0() == this) {
                this.f103118d = i10;
            }
            if (this.f103127m) {
                p.d dVar2 = this.f103115a;
                p.d dVar3 = this;
                while (dVar3 != null) {
                    i10 |= dVar3.f103117c;
                    dVar3.f103117c = i10;
                    if (dVar3 == dVar2) {
                        break;
                    } else {
                        dVar3 = dVar3.f103119e;
                    }
                }
                if (z10 && dVar3 == dVar2) {
                    i10 = C2200e0.h(dVar2);
                    dVar2.f103117c = i10;
                }
                int i12 = i10 | ((dVar3 == null || (dVar = dVar3.f103120f) == null) ? 0 : dVar.f103118d);
                while (dVar3 != null) {
                    i12 |= dVar3.f103117c;
                    dVar3.f103118d = i12;
                    dVar3 = dVar3.f103119e;
                }
            }
        }
    }

    public final void o3(int i10, p.d dVar) {
        int i11 = this.f103117c;
        if ((i10 & 2) == 0 || (i11 & 2) == 0 || (this instanceof C)) {
            return;
        }
        W.a.g("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + dVar);
        throw null;
    }
}
