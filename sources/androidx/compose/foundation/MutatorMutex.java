package androidx.compose.foundation;

import androidx.compose.animation.core.C1598m0;
import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.sync.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class MutatorMutex {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88818c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<a> f88819a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f88820b = MutexKt.b(false, 1, null);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutatePriority f88821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final A0 f88822b;

        public a(@NotNull MutatePriority mutatePriority, @NotNull A0 a02) {
            this.f88821a = mutatePriority;
            this.f88822b = a02;
        }

        public final boolean a(@NotNull a aVar) {
            return this.f88821a.compareTo(aVar.f88821a) >= 0;
        }

        public final void b() {
            this.f88822b.a(new MutationInterruptedException());
        }

        @NotNull
        public final A0 c() {
            return this.f88822b;
        }

        @NotNull
        public final MutatePriority d() {
            return this.f88821a;
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, ed.l lVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, lVar, eVar);
    }

    public static /* synthetic */ Object g(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, ed.p pVar, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.f(obj, mutatePriority, pVar, eVar);
    }

    @Nullable
    public final <R> Object d(@NotNull MutatePriority mutatePriority, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return kotlinx.coroutines.M.g(new MutatorMutex$mutate$2(mutatePriority, this, lVar, null), eVar);
    }

    @Nullable
    public final <T, R> Object f(T t10, @NotNull MutatePriority mutatePriority, @NotNull ed.p<? super T, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        return kotlinx.coroutines.M.g(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t10, null), eVar);
    }

    @InterfaceC4850b0
    public final boolean h() {
        return a.C0832a.c(this.f88820b, null, 1, null);
    }

    public final boolean i(@NotNull InterfaceC4376a<L0> interfaceC4376a) {
        boolean zH = h();
        if (!zH) {
            return zH;
        }
        try {
            interfaceC4376a.invoke();
            return zH;
        } finally {
            k();
        }
    }

    public final void j(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f88819a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C1598m0.a(this.f88819a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @InterfaceC4850b0
    public final void k() {
        a.C0832a.d(this.f88820b, null, 1, null);
    }
}
