package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.layout.InterfaceC2171i;
import androidx.compose.ui.unit.LayoutDirection;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1645z
@T1
public interface P extends androidx.compose.ui.layout.M {

    public interface a {
        @Nullable
        Path a(@NotNull d dVar, @NotNull P.j jVar, @NotNull LayoutDirection layoutDirection, @NotNull InterfaceC4814e interfaceC4814e);
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f87362a = a.f87363a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f87363a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f87364b = C0173a.f87366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public static final b f87365c = C0174b.f87367b;

            /* JADX INFO: renamed from: androidx.compose.animation.P$b$a$a, reason: collision with other inner class name */
            public static final class C0173a implements b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0173a f87366b = new C0173a();

                @Override // androidx.compose.animation.P.b
                public final long a(long j10, long j11) {
                    return j11;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.animation.P$b$a$b, reason: collision with other inner class name */
            public static final class C0174b implements b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0174b f87367b = new C0174b();

                @Override // androidx.compose.animation.P.b
                public final long a(long j10, long j11) {
                    return j10;
                }
            }

            @NotNull
            public final b a() {
                return f87364b;
            }

            @NotNull
            public final b b() {
                return f87365c;
            }
        }

        long a(long j10, long j11);
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f87368a = a.f87369a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f87369a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f87370b = K.f87355b;

            public static c b(a aVar, InterfaceC2171i interfaceC2171i, androidx.compose.ui.c cVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    InterfaceC2171i.f102572a.getClass();
                    interfaceC2171i = InterfaceC2171i.a.f102577e;
                }
                if ((i10 & 2) != 0) {
                    androidx.compose.ui.c.f100390a.getClass();
                    cVar = c.a.f100396f;
                }
                aVar.getClass();
                return SharedTransitionScopeKt.c(interfaceC2171i, cVar);
            }

            @NotNull
            public final c a(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar) {
                return SharedTransitionScopeKt.c(interfaceC2171i, cVar);
            }

            @NotNull
            public final c c() {
                return f87370b;
            }
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n*L\n690#1:1338\n690#1:1339,2\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f87371c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f87372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final L0 f87373b = M1.g(null, null, 2, null);

        public d(@NotNull Object obj) {
            this.f87372a = obj;
        }

        @Nullable
        public final Path a() {
            return d().f87428i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final SharedElementInternalState b() {
            return (SharedElementInternalState) this.f87373b.getValue();
        }

        @NotNull
        public final Object c() {
            return this.f87372a;
        }

        public final SharedElementInternalState d() {
            SharedElementInternalState sharedElementInternalStateB = b();
            if (sharedElementInternalStateB != null) {
                return sharedElementInternalStateB;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        @Nullable
        public final d e() {
            SharedElementInternalState sharedElementInternalState = d().f87430k;
            if (sharedElementInternalState != null) {
                return sharedElementInternalState.v();
            }
            return null;
        }

        public final boolean f() {
            SharedElement sharedElementQ;
            SharedElementInternalState sharedElementInternalStateB = b();
            if (sharedElementInternalStateB == null || (sharedElementQ = sharedElementInternalStateB.q()) == null) {
                return false;
            }
            return sharedElementQ.d();
        }

        public final void g(@Nullable SharedElementInternalState sharedElementInternalState) {
            this.f87373b.setValue(sharedElementInternalState);
        }
    }

    @InterfaceC4982o(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    AbstractC1642w D(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar);

    @NotNull
    androidx.compose.ui.p E(@NotNull androidx.compose.ui.p pVar, @NotNull d dVar, boolean z10, @NotNull InterfaceC1634n interfaceC1634n, @NotNull b bVar, boolean z11, float f10, @NotNull a aVar);

    boolean H();

    @NotNull
    androidx.compose.ui.p K(@NotNull androidx.compose.ui.p pVar, @NotNull InterfaceC4376a<Boolean> interfaceC4376a, float f10, @NotNull ed.p<? super LayoutDirection, ? super InterfaceC4814e, ? extends Path> pVar2);

    @InterfaceC1917i
    @NotNull
    d O(@NotNull Object obj, @Nullable InterfaceC1946s interfaceC1946s, int i10);

    @NotNull
    androidx.compose.ui.p R(@NotNull androidx.compose.ui.p pVar, @NotNull d dVar, @NotNull InterfaceC1630j interfaceC1630j, @NotNull InterfaceC1634n interfaceC1634n, @NotNull b bVar, boolean z10, float f10, @NotNull a aVar);

    @NotNull
    androidx.compose.ui.p U(@NotNull androidx.compose.ui.p pVar, @NotNull d dVar, @NotNull InterfaceC1630j interfaceC1630j, @NotNull AbstractC1640u abstractC1640u, @NotNull AbstractC1642w abstractC1642w, @NotNull InterfaceC1634n interfaceC1634n, @NotNull c cVar, @NotNull b bVar, boolean z10, float f10, @NotNull a aVar);

    @NotNull
    androidx.compose.ui.p X(@NotNull androidx.compose.ui.p pVar);

    @NotNull
    a a0(@NotNull c3 c3Var);

    @InterfaceC4982o(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    AbstractC1640u g(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar);
}
