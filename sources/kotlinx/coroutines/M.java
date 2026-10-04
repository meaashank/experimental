package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.C5075i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class M {
    @NotNull
    public static final L a(@NotNull kotlin.coroutines.i iVar) {
        if (iVar.get(A0.f218690A3) == null) {
            iVar = iVar.plus(JobKt__JobKt.c(null, 1, null));
        }
        return new C5075i(iVar);
    }

    @NotNull
    public static final L b() {
        return new C5075i(i.b.a.d((JobSupport) Y0.c(null, 1, null), C5052b0.e()));
    }

    public static final void c(@NotNull L l10, @NotNull String str, @Nullable Throwable th) {
        d(l10, C5101n0.a(str, th));
    }

    public static final void d(@NotNull L l10, @Nullable CancellationException cancellationException) {
        A0 a02 = (A0) l10.m().get(A0.f218690A3);
        if (a02 != null) {
            a02.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l10).toString());
        }
    }

    public static /* synthetic */ void e(L l10, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        c(l10, str, th);
    }

    public static /* synthetic */ void f(L l10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(l10, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull ed.p<? super L, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        kotlinx.coroutines.internal.M m10 = new kotlinx.coroutines.internal.M(eVar.getContext(), eVar);
        Object objD = wd.b.d(m10, m10, pVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objD;
    }

    @Nullable
    public static final Object h(@NotNull kotlin.coroutines.e<? super kotlin.coroutines.i> eVar) {
        return eVar.getContext();
    }

    public static final Object i(kotlin.coroutines.e<? super kotlin.coroutines.i> eVar) {
        throw null;
    }

    public static final void j(@NotNull L l10) {
        JobKt__JobKt.x(l10.m());
    }

    public static final boolean k(@NotNull L l10) {
        A0 a02 = (A0) l10.m().get(A0.f218690A3);
        if (a02 != null) {
            return a02.isActive();
        }
        return true;
    }

    public static /* synthetic */ void l(L l10) {
    }

    @NotNull
    public static final L m(@NotNull L l10, @NotNull kotlin.coroutines.i iVar) {
        return new C5075i(l10.m().plus(iVar));
    }
}
