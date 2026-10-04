package androidx.compose.ui.node;

import androidx.compose.ui.platform.G1;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4850b0
public interface ComposeUiNode {

    /* JADX INFO: renamed from: Q2, reason: collision with root package name */
    @NotNull
    public static final Companion f102678Q2 = Companion.f102679a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f102679a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final InterfaceC4376a<ComposeUiNode> f102680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final InterfaceC4376a<ComposeUiNode> f102681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, androidx.compose.ui.p, L0> f102682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, InterfaceC4814e, L0> f102683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, androidx.compose.runtime.D, L0> f102684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, androidx.compose.ui.layout.Q, L0> f102685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, LayoutDirection, L0> f102686h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, G1, L0> f102687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final ed.p<ComposeUiNode, Integer, L0> f102688j;

        static {
            LayoutNode.f102722L.getClass();
            f102680b = LayoutNode.f102726P;
            f102681c = new InterfaceC4376a<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
                @Override // ed.InterfaceC4376a
                @NotNull
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 0, 2, null);
                }
            };
            f102682d = new ed.p<ComposeUiNode, androidx.compose.ui.p, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull androidx.compose.ui.p pVar) {
                    composeUiNode.l(pVar);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, androidx.compose.ui.p pVar) {
                    composeUiNode.l(pVar);
                    return L0.f217464a;
                }
            };
            f102683e = new ed.p<ComposeUiNode, InterfaceC4814e, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull InterfaceC4814e interfaceC4814e) {
                    composeUiNode.f(interfaceC4814e);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, InterfaceC4814e interfaceC4814e) {
                    composeUiNode.f(interfaceC4814e);
                    return L0.f217464a;
                }
            };
            f102684f = new ed.p<ComposeUiNode, androidx.compose.runtime.D, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull androidx.compose.runtime.D d10) {
                    composeUiNode.n(d10);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, androidx.compose.runtime.D d10) {
                    composeUiNode.n(d10);
                    return L0.f217464a;
                }
            };
            f102685g = new ed.p<ComposeUiNode, androidx.compose.ui.layout.Q, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull androidx.compose.ui.layout.Q q10) {
                    composeUiNode.k(q10);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, androidx.compose.ui.layout.Q q10) {
                    composeUiNode.k(q10);
                    return L0.f217464a;
                }
            };
            f102686h = new ed.p<ComposeUiNode, LayoutDirection, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull LayoutDirection layoutDirection) {
                    composeUiNode.d(layoutDirection);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                    composeUiNode.d(layoutDirection);
                    return L0.f217464a;
                }
            };
            f102687i = new ed.p<ComposeUiNode, G1, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
                public final void e(@NotNull ComposeUiNode composeUiNode, @NotNull G1 g12) {
                    composeUiNode.p(g12);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, G1 g12) {
                    composeUiNode.p(g12);
                    return L0.f217464a;
                }
            };
            f102688j = new ed.p<ComposeUiNode, Integer, L0>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
                public final void e(@NotNull ComposeUiNode composeUiNode, int i10) {
                    composeUiNode.g(i10);
                }

                @Override // ed.p
                public L0 invoke(ComposeUiNode composeUiNode, Integer num) {
                    composeUiNode.g(num.intValue());
                    return L0.f217464a;
                }
            };
        }

        @androidx.compose.ui.i
        public static /* synthetic */ void c() {
        }

        @NotNull
        public final InterfaceC4376a<ComposeUiNode> a() {
            return f102680b;
        }

        @androidx.compose.ui.i
        @NotNull
        public final ed.p<ComposeUiNode, Integer, L0> b() {
            return f102688j;
        }

        @NotNull
        public final ed.p<ComposeUiNode, InterfaceC4814e, L0> d() {
            return f102683e;
        }

        @NotNull
        public final ed.p<ComposeUiNode, LayoutDirection, L0> e() {
            return f102686h;
        }

        @NotNull
        public final ed.p<ComposeUiNode, androidx.compose.ui.layout.Q, L0> f() {
            return f102685g;
        }

        @NotNull
        public final ed.p<ComposeUiNode, androidx.compose.ui.p, L0> g() {
            return f102682d;
        }

        @NotNull
        public final ed.p<ComposeUiNode, androidx.compose.runtime.D, L0> h() {
            return f102684f;
        }

        @NotNull
        public final ed.p<ComposeUiNode, G1, L0> i() {
            return f102687i;
        }

        @NotNull
        public final InterfaceC4376a<ComposeUiNode> j() {
            return f102681c;
        }
    }

    @NotNull
    InterfaceC4814e a();

    @NotNull
    androidx.compose.ui.p b();

    @NotNull
    G1 c();

    void d(@NotNull LayoutDirection layoutDirection);

    void f(@NotNull InterfaceC4814e interfaceC4814e);

    void g(int i10);

    @NotNull
    LayoutDirection getLayoutDirection();

    int h();

    void k(@NotNull androidx.compose.ui.layout.Q q10);

    void l(@NotNull androidx.compose.ui.p pVar);

    void n(@NotNull androidx.compose.runtime.D d10);

    @NotNull
    androidx.compose.runtime.D o();

    void p(@NotNull G1 g12);

    @NotNull
    androidx.compose.ui.layout.Q s();
}
