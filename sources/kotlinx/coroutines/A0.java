package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface A0 extends i.b {

    /* JADX INFO: renamed from: A3, reason: collision with root package name */
    @NotNull
    public static final b f218690A3 = b.f218691a;

    public static final class a {
        public static /* synthetic */ void b(A0 a02, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            a02.a(cancellationException);
        }

        public static /* synthetic */ boolean c(A0 a02, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return a02.g(th);
        }

        public static <R> R d(@NotNull A0 a02, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(a02, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E e(@NotNull A0 a02, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(a02, cVar);
        }

        @InterfaceC5107q0
        public static /* synthetic */ void f() {
        }

        public static /* synthetic */ InterfaceC5058e0 g(A0 a02, boolean z10, boolean z11, ed.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return a02.C1(z10, z11, lVar);
        }

        @NotNull
        public static kotlin.coroutines.i h(@NotNull A0 a02, @NotNull i.c<?> cVar) {
            return i.b.a.c(a02, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i i(@NotNull A0 a02, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(a02, iVar);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static A0 j(@NotNull A0 a02, @NotNull A0 a03) {
            return a03;
        }
    }

    public static final class b implements i.c<A0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f218691a = new b();
    }

    @NotNull
    kotlinx.coroutines.selects.c C0();

    @InterfaceC5120x0
    @NotNull
    InterfaceC5058e0 C1(boolean z10, boolean z11, @NotNull ed.l<? super Throwable, kotlin.L0> lVar);

    @InterfaceC5120x0
    @NotNull
    InterfaceC5111t N0(@NotNull InterfaceC5115v interfaceC5115v);

    @NotNull
    InterfaceC5000m<A0> Q0();

    boolean U();

    @NotNull
    InterfaceC5058e0 V1(@NotNull ed.l<? super Throwable, kotlin.L0> lVar);

    void a(@Nullable CancellationException cancellationException);

    @Nullable
    Object c2(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC5120x0
    @NotNull
    CancellationException f1();

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean g(Throwable th);

    @Nullable
    A0 getParent();

    boolean isActive();

    boolean isCancelled();

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    A0 q(@NotNull A0 a02);

    boolean start();
}
