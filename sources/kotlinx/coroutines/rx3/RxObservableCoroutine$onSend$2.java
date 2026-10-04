package kotlinx.coroutines.rx3;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class RxObservableCoroutine$onSend$2 extends FunctionReferenceImpl implements ed.q<RxObservableCoroutine<?>, Object, Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RxObservableCoroutine$onSend$2 f220597a = new RxObservableCoroutine$onSend$2();

    public RxObservableCoroutine$onSend$2() {
        super(3, RxObservableCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object e(@NotNull RxObservableCoroutine<?> rxObservableCoroutine, @Nullable Object obj, @Nullable Object obj2) throws Throwable {
        RxObservableCoroutine.T1(rxObservableCoroutine, obj, obj2);
        return rxObservableCoroutine;
    }

    @Override // ed.q
    public Object invoke(RxObservableCoroutine<?> rxObservableCoroutine, Object obj, Object obj2) throws Throwable {
        RxObservableCoroutine<?> rxObservableCoroutine2 = rxObservableCoroutine;
        RxObservableCoroutine.T1(rxObservableCoroutine2, obj, obj2);
        return rxObservableCoroutine2;
    }
}
