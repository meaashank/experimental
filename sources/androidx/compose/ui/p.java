package androidx.compose.ui;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode;
import androidx.compose.runtime.T1;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.node.InterfaceC2203g;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface p {

    /* JADX INFO: renamed from: M2, reason: collision with root package name */
    @NotNull
    public static final a f103112M2 = a.f103113a;

    public static final class b {
        @Deprecated
        @NotNull
        public static p a(@NotNull p pVar, @NotNull p pVar2) {
            return o.a(pVar, pVar2);
        }
    }

    public interface c extends p {

        public static final class a {
            @Deprecated
            public static boolean a(@NotNull c cVar, @NotNull ed.l<? super c, Boolean> lVar) {
                return q.a(cVar, lVar);
            }

            @Deprecated
            public static boolean b(@NotNull c cVar, @NotNull ed.l<? super c, Boolean> lVar) {
                return q.b(cVar, lVar);
            }

            @Deprecated
            public static <R> R c(@NotNull c cVar, R r10, @NotNull ed.p<? super R, ? super c, ? extends R> pVar) {
                return pVar.invoke(r10, cVar);
            }

            @Deprecated
            public static <R> R d(@NotNull c cVar, R r10, @NotNull ed.p<? super c, ? super R, ? extends R> pVar) {
                return pVar.invoke(cVar, r10);
            }

            @Deprecated
            @NotNull
            public static p e(@NotNull c cVar, @NotNull p pVar) {
                return o.a(cVar, pVar);
            }
        }

        @Override // androidx.compose.ui.p
        <R> R M(R r10, @NotNull ed.p<? super c, ? super R, ? extends R> pVar);

        @Override // androidx.compose.ui.p
        boolean O(@NotNull ed.l<? super c, Boolean> lVar);

        @Override // androidx.compose.ui.p
        boolean S(@NotNull ed.l<? super c, Boolean> lVar);

        @Override // androidx.compose.ui.p
        <R> R l0(R r10, @NotNull ed.p<? super R, ? super c, ? extends R> pVar);
    }

    @V({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,414:1\n42#2,7:415\n42#2,7:422\n42#2,7:429\n42#2,7:436\n42#2,7:443\n42#2,7:450\n42#2,7:457\n42#2,7:464\n42#2,7:471\n42#2,7:478\n42#2,7:485\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n252#1:415,7\n253#1:422,7\n261#1:429,7\n264#1:436,7\n273#1:443,7\n274#1:450,7\n277#1:457,7\n286#1:464,7\n287#1:471,7\n290#1:478,7\n302#1:485,7\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static abstract class d implements InterfaceC2203g {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f103114n = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public L f103116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103117c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public d f103119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public d f103120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public ObserverNodeOwnerScope f103121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public NodeCoordinator f103122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f103123i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f103124j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f103125k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f103126l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f103127m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public d f103115a = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103118d = -1;

        public static /* synthetic */ void E2() {
        }

        public static /* synthetic */ void I2() {
        }

        @Nullable
        public final NodeCoordinator A2() {
            return this.f103122h;
        }

        @NotNull
        public final L B2() {
            L l10 = this.f103116b;
            if (l10 != null) {
                return l10;
            }
            L lA = M.a(C2204h.s(this).m().plus(new C0((A0) C2204h.s(this).m().get(A0.f218690A3))));
            this.f103116b = lA;
            return lA;
        }

        public final boolean C2() {
            return this.f103123i;
        }

        public final int D2() {
            return this.f103117c;
        }

        @Nullable
        public final ObserverNodeOwnerScope F2() {
            return this.f103121g;
        }

        @Nullable
        public final d G2() {
            return this.f103119e;
        }

        public boolean H2() {
            return !(this instanceof LazyLayoutSemanticsModifierNode);
        }

        public final boolean J2() {
            return this.f103124j;
        }

        public final boolean K2() {
            return this.f103127m;
        }

        public final boolean L2(int i10) {
            return (i10 & this.f103117c) != 0;
        }

        public void M2() {
            if (this.f103127m) {
                W.a.g("node attached multiple times");
                throw null;
            }
            if (!(this.f103122h != null)) {
                W.a.g("attach invoked on a node without a coordinator");
                throw null;
            }
            this.f103127m = true;
            this.f103125k = true;
        }

        public void N2() {
            if (!this.f103127m) {
                W.a.g("Cannot detach a node that is not attached");
                throw null;
            }
            if (this.f103125k) {
                W.a.g("Must run runAttachLifecycle() before markAsDetached()");
                throw null;
            }
            if (this.f103126l) {
                W.a.g("Must run runDetachLifecycle() before markAsDetached()");
                throw null;
            }
            this.f103127m = false;
            L l10 = this.f103116b;
            if (l10 != null) {
                M.d(l10, new ModifierNodeDetachedCancellationException());
                this.f103116b = null;
            }
        }

        public void O2() {
        }

        public void P2() {
        }

        public void Q2() {
        }

        public void R2() {
            if (this.f103127m) {
                Q2();
            } else {
                W.a.g("reset() called on an unattached node");
                throw null;
            }
        }

        public void S2() {
            if (!this.f103127m) {
                W.a.g("Must run markAsAttached() prior to runAttachLifecycle");
                throw null;
            }
            if (!this.f103125k) {
                W.a.g("Must run runAttachLifecycle() only once after markAsAttached()");
                throw null;
            }
            this.f103125k = false;
            O2();
            this.f103126l = true;
        }

        public void T2() {
            if (!this.f103127m) {
                W.a.g("node detached multiple times");
                throw null;
            }
            if (!(this.f103122h != null)) {
                W.a.g("detach invoked on a node without a coordinator");
                throw null;
            }
            if (!this.f103126l) {
                W.a.g("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                throw null;
            }
            this.f103126l = false;
            P2();
        }

        public final void U2(int i10) {
            this.f103118d = i10;
        }

        public void V2(@NotNull d dVar) {
            this.f103115a = dVar;
        }

        public final void W2(@Nullable d dVar) {
            this.f103120f = dVar;
        }

        public final void X2(boolean z10) {
            this.f103123i = z10;
        }

        public final void Y2(int i10) {
            this.f103117c = i10;
        }

        public final void Z2(@Nullable ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.f103121g = observerNodeOwnerScope;
        }

        public final void a3(@Nullable d dVar) {
            this.f103119e = dVar;
        }

        public final void b3(boolean z10) {
            this.f103124j = z10;
        }

        @i
        public final void c3(@NotNull InterfaceC4376a<L0> interfaceC4376a) {
            C2204h.s(this).Z(interfaceC4376a);
        }

        public void d3(@Nullable NodeCoordinator nodeCoordinator) {
            this.f103122h = nodeCoordinator;
        }

        @Override // androidx.compose.ui.node.InterfaceC2203g
        @NotNull
        public final d g0() {
            return this.f103115a;
        }

        public final int y2() {
            return this.f103118d;
        }

        @Nullable
        public final d z2() {
            return this.f103120f;
        }
    }

    <R> R M(R r10, @NotNull ed.p<? super c, ? super R, ? extends R> pVar);

    boolean O(@NotNull ed.l<? super c, Boolean> lVar);

    @NotNull
    p P0(@NotNull p pVar);

    boolean S(@NotNull ed.l<? super c, Boolean> lVar);

    <R> R l0(R r10, @NotNull ed.p<? super R, ? super c, ? extends R> pVar);

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f103113a = new a();

        @Override // androidx.compose.ui.p
        public boolean O(@NotNull ed.l<? super c, Boolean> lVar) {
            return false;
        }

        @Override // androidx.compose.ui.p
        @NotNull
        public p P0(@NotNull p pVar) {
            return pVar;
        }

        @Override // androidx.compose.ui.p
        public boolean S(@NotNull ed.l<? super c, Boolean> lVar) {
            return true;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.p
        public <R> R M(R r10, @NotNull ed.p<? super c, ? super R, ? extends R> pVar) {
            return r10;
        }

        @Override // androidx.compose.ui.p
        public <R> R l0(R r10, @NotNull ed.p<? super R, ? super c, ? extends R> pVar) {
            return r10;
        }
    }
}
