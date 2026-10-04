package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class LazyActorCoroutine<E> extends a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public kotlin.coroutines.e<? super L0> f219151e;

    public LazyActorCoroutine(@NotNull kotlin.coroutines.i iVar, @NotNull g<E> gVar, @NotNull ed.p<? super c<E>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        super(iVar, gVar, false);
        this.f219151e = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    public static /* synthetic */ void U1() {
    }

    @Override // kotlinx.coroutines.channels.h, kotlinx.coroutines.channels.s
    public boolean G(@Nullable Throwable th) {
        boolean zG = super.G(th);
        start();
        return zG;
    }

    @Override // kotlinx.coroutines.channels.h, kotlinx.coroutines.channels.s
    @Nullable
    public Object I(E e10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        start();
        Object objI = super.I(e10, eVar);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : L0.f217464a;
    }

    public final void W1(kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        q1();
        this.f219193d.h().c().invoke(this, jVar, obj);
    }

    @Override // kotlinx.coroutines.channels.h, kotlinx.coroutines.channels.s
    @NotNull
    public kotlinx.coroutines.selects.g<E, s<E>> h() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.f219152a;
        G.n(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Y.q(lazyActorCoroutine$onSend$1, 3);
        return new kotlinx.coroutines.selects.h(this, lazyActorCoroutine$onSend$1, this.f219193d.h().b(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.h, kotlinx.coroutines.channels.s
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC4852c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        start();
        return super.offer(e10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void q1() {
        wd.a.e(this.f219151e, this);
    }

    @Override // kotlinx.coroutines.channels.h, kotlinx.coroutines.channels.s
    @NotNull
    public Object t(E e10) {
        start();
        return super.t(e10);
    }
}
