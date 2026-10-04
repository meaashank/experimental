package androidx.lifecycle;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.InterfaceC5058e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class EmittedSource implements InterfaceC5058e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final K<?> f113973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final N<?> f113974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113975c;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    @Vc.d(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113976a;

        public AnonymousClass1(kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            return EmittedSource.this.new AnonymousClass1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f113976a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            EmittedSource.this.d();
            return L0.f217464a;
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    public EmittedSource(@NotNull K<?> source, @NotNull N<?> mediator) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(mediator, "mediator");
        this.f113973a = source;
        this.f113974b = mediator;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objG = C5092j.g(C5052b0.e().Z2(), new EmittedSource$disposeNow$2(this, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    @e.I
    public final void d() {
        if (this.f113975c) {
            return;
        }
        this.f113974b.t(this.f113973a);
        this.f113975c = true;
    }

    @Override // kotlinx.coroutines.InterfaceC5058e0
    public void dispose() {
        C5092j.f(kotlinx.coroutines.M.a(C5052b0.e().Z2()), null, null, new AnonymousClass1(null), 3, null);
    }
}
