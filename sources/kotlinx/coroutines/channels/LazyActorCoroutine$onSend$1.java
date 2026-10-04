package kotlinx.coroutines.channels;

import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements ed.q<LazyActorCoroutine<?>, kotlinx.coroutines.selects.j<?>, Object, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LazyActorCoroutine$onSend$1 f219152a = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void e(@NotNull LazyActorCoroutine<?> lazyActorCoroutine, @NotNull kotlinx.coroutines.selects.j<?> jVar, @Nullable Object obj) {
        lazyActorCoroutine.W1(jVar, obj);
    }

    @Override // ed.q
    public L0 invoke(LazyActorCoroutine<?> lazyActorCoroutine, kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        lazyActorCoroutine.W1(jVar, obj);
        return L0.f217464a;
    }
}
