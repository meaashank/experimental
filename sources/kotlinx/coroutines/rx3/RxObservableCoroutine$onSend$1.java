package kotlinx.coroutines.rx3;

import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class RxObservableCoroutine$onSend$1 extends FunctionReferenceImpl implements ed.q<RxObservableCoroutine<?>, kotlinx.coroutines.selects.j<?>, Object, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RxObservableCoroutine$onSend$1 f220596a = new RxObservableCoroutine$onSend$1();

    public RxObservableCoroutine$onSend$1() {
        super(3, RxObservableCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void e(@NotNull RxObservableCoroutine<?> rxObservableCoroutine, @NotNull kotlinx.coroutines.selects.j<?> jVar, @Nullable Object obj) {
        rxObservableCoroutine.g2(jVar, obj);
    }

    @Override // ed.q
    public L0 invoke(RxObservableCoroutine<?> rxObservableCoroutine, kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        rxObservableCoroutine.g2(jVar, obj);
        return L0.f217464a;
    }
}
