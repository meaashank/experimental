package kotlinx.coroutines.rx3;

import java.lang.reflect.InvocationTargetException;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends FunctionReferenceImpl implements ed.p<Throwable, kotlin.coroutines.i, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RxFlowableKt$RX_HANDLER$1 f220592a = new RxFlowableKt$RX_HANDLER$1();

    public RxFlowableKt$RX_HANDLER$1() {
        super(2, b.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
    }

    public final void e(@NotNull Throwable th, @NotNull kotlin.coroutines.i iVar) throws IllegalAccessException, InvocationTargetException {
        b.a(th, iVar);
    }

    @Override // ed.p
    public L0 invoke(Throwable th, kotlin.coroutines.i iVar) throws IllegalAccessException, InvocationTargetException {
        b.a(th, iVar);
        return L0.f217464a;
    }
}
