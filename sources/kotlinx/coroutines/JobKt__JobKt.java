package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.InterfaceC5000m;
import kotlinx.coroutines.A0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,675:1\n1313#2,2:676\n1313#2,2:678\n1313#2,2:680\n1313#2,2:682\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n511#1:676,2\n525#1:678,2\n619#1:680,2\n643#1:682,2\n*E\n"})
public final /* synthetic */ class JobKt__JobKt {
    @NotNull
    public static final InterfaceC5058e0 A(@NotNull A0 a02, boolean z10, boolean z11, @NotNull InterfaceC5118w0 interfaceC5118w0) {
        return a02 instanceof JobSupport ? ((JobSupport) a02).T0(z10, z11, interfaceC5118w0) : a02.C1(z10, z11, new JobKt__JobKt$invokeOnCompletion$1(interfaceC5118w0));
    }

    public static InterfaceC5058e0 B(A0 a02, boolean z10, boolean z11, InterfaceC5118w0 interfaceC5118w0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return A(a02, z10, z11, interfaceC5118w0);
    }

    public static final boolean C(@NotNull kotlin.coroutines.i iVar) {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 != null) {
            return a02.isActive();
        }
        return true;
    }

    public static final Throwable D(Throwable th, A0 a02) {
        return th == null ? new JobCancellationException("Job was cancelled", null, a02) : th;
    }

    @NotNull
    public static final InterfaceC5123z a(@Nullable A0 a02) {
        return new C0(a02);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @dd.j(name = "Job")
    public static final A0 b(A0 a02) {
        return new C0(a02);
    }

    public static InterfaceC5123z c(A0 a02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a02 = null;
        }
        return new C0(a02);
    }

    public static A0 d(A0 a02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a02 = null;
        }
        return new C0(a02);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void e(kotlin.coroutines.i iVar) {
        f(iVar, null);
    }

    public static final void f(@NotNull kotlin.coroutines.i iVar, @Nullable CancellationException cancellationException) {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 != null) {
            a02.a(cancellationException);
        }
    }

    public static final void g(@NotNull A0 a02, @NotNull String str, @Nullable Throwable th) {
        a02.a(C5101n0.a(str, th));
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.i iVar, Throwable th) throws Throwable {
        i.b bVar = iVar.get(A0.f218690A3);
        JobSupport jobSupport = bVar instanceof JobSupport ? (JobSupport) bVar : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.Z(D(th, jobSupport));
        return true;
    }

    public static void i(kotlin.coroutines.i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        f(iVar, cancellationException);
    }

    public static void j(A0 a02, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        g(a02, str, th);
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.i iVar, Throwable th, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        return h(iVar, th);
    }

    @Nullable
    public static final Object l(@NotNull A0 a02, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        A0.a.b(a02, null, 1, null);
        Object objC2 = a02.c2(eVar);
        return objC2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objC2 : kotlin.L0.f217464a;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void m(kotlin.coroutines.i iVar) {
        o(iVar, null);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(kotlin.coroutines.i iVar, Throwable th) throws Throwable {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 == null) {
            return;
        }
        for (A0 a03 : a02.Q0()) {
            JobSupport jobSupport = a03 instanceof JobSupport ? (JobSupport) a03 : null;
            if (jobSupport != null) {
                jobSupport.Z(D(th, a02));
            }
        }
    }

    public static final void o(@NotNull kotlin.coroutines.i iVar, @Nullable CancellationException cancellationException) {
        InterfaceC5000m<A0> interfaceC5000mQ0;
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 == null || (interfaceC5000mQ0 = a02.Q0()) == null) {
            return;
        }
        Iterator<A0> it = interfaceC5000mQ0.iterator();
        while (it.hasNext()) {
            it.next().a(cancellationException);
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void p(A0 a02) {
        r(a02, null);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(A0 a02, Throwable th) throws Throwable {
        for (A0 a03 : a02.Q0()) {
            JobSupport jobSupport = a03 instanceof JobSupport ? (JobSupport) a03 : null;
            if (jobSupport != null) {
                jobSupport.Z(D(th, a02));
            }
        }
    }

    public static final void r(@NotNull A0 a02, @Nullable CancellationException cancellationException) {
        Iterator<A0> it = a02.Q0().iterator();
        while (it.hasNext()) {
            it.next().a(cancellationException);
        }
    }

    public static /* synthetic */ void s(kotlin.coroutines.i iVar, Throwable th, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th = null;
        }
        n(iVar, th);
    }

    public static void t(kotlin.coroutines.i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        o(iVar, cancellationException);
    }

    public static /* synthetic */ void u(A0 a02, Throwable th, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th = null;
        }
        q(a02, th);
    }

    public static void v(A0 a02, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        r(a02, cancellationException);
    }

    @NotNull
    public static final InterfaceC5058e0 w(@NotNull A0 a02, @NotNull InterfaceC5058e0 interfaceC5058e0) {
        return B(a02, false, false, new C5062g0(interfaceC5058e0), 3, null);
    }

    public static final void x(@NotNull kotlin.coroutines.i iVar) {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 != null) {
            y(a02);
        }
    }

    public static final void y(@NotNull A0 a02) {
        if (!a02.isActive()) {
            throw a02.f1();
        }
    }

    @NotNull
    public static final A0 z(@NotNull kotlin.coroutines.i iVar) {
        A0 a02 = (A0) iVar.get(A0.f218690A3);
        if (a02 != null) {
            return a02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }
}
