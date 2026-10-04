package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1974w;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import k0.C4811b;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SubcomposeLayoutState {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102512f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final H0 f102513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LayoutNodeSubcompositionsState f102514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.p<LayoutNode, SubcomposeLayoutState, L0> f102515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.p<LayoutNode, AbstractC1974w, L0> f102516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.p<LayoutNode, ed.p<? super G0, ? super C4811b, ? extends T>, L0> f102517e;

    public interface a {
        int a();

        void b(@Nullable Object obj, @NotNull ed.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar);

        void c(int i10, long j10);

        void dispose();
    }

    public SubcomposeLayoutState(@NotNull H0 h02) {
        this.f102513a = h02;
        this.f102515c = new ed.p<LayoutNode, SubcomposeLayoutState, L0>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            public final void e(@NotNull LayoutNode layoutNode, @NotNull SubcomposeLayoutState subcomposeLayoutState) {
                SubcomposeLayoutState subcomposeLayoutState2 = this.f102520d;
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.f102731C;
                if (layoutNodeSubcompositionsState == null) {
                    layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeLayoutState2.f102513a);
                    layoutNode.f102731C = layoutNodeSubcompositionsState;
                }
                subcomposeLayoutState2.f102514b = layoutNodeSubcompositionsState;
                this.f102520d.h().F();
                this.f102520d.h().N(this.f102520d.f102513a);
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ L0 invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                e(layoutNode, subcomposeLayoutState);
                return L0.f217464a;
            }
        };
        this.f102516d = new ed.p<LayoutNode, AbstractC1974w, L0>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            public final void e(@NotNull LayoutNode layoutNode, @NotNull AbstractC1974w abstractC1974w) {
                this.f102518d.h().f102423b = abstractC1974w;
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ L0 invoke(LayoutNode layoutNode, AbstractC1974w abstractC1974w) {
                e(layoutNode, abstractC1974w);
                return L0.f217464a;
            }
        };
        this.f102517e = new ed.p<LayoutNode, ed.p<? super G0, ? super C4811b, ? extends T>, L0>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            public final void e(@NotNull LayoutNode layoutNode, @NotNull ed.p<? super G0, ? super C4811b, ? extends T> pVar) {
                layoutNode.k(this.f102519d.h().u(pVar));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ L0 invoke(LayoutNode layoutNode, ed.p<? super G0, ? super C4811b, ? extends T> pVar) {
                e(layoutNode, pVar);
                return L0.f217464a;
            }
        };
    }

    public final void d() {
        h().A();
    }

    @NotNull
    public final ed.p<LayoutNode, AbstractC1974w, L0> e() {
        return this.f102516d;
    }

    @NotNull
    public final ed.p<LayoutNode, ed.p<? super G0, ? super C4811b, ? extends T>, L0> f() {
        return this.f102517e;
    }

    @NotNull
    public final ed.p<LayoutNode, SubcomposeLayoutState, L0> g() {
        return this.f102515c;
    }

    public final LayoutNodeSubcompositionsState h() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f102514b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    @NotNull
    public final a i(@Nullable Object obj, @NotNull ed.p<? super InterfaceC1946s, ? super Integer, L0> pVar) {
        return h().K(obj, pVar);
    }

    public SubcomposeLayoutState() {
        this(C2164e0.f102553a);
    }

    @InterfaceC4982o(message = "This constructor is deprecated", replaceWith = @InterfaceC4852c0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i10) {
        this(new C2177l(i10));
    }
}
