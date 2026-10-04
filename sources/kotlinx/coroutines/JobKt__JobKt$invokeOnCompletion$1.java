package kotlinx.coroutines;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements ed.l<Throwable, kotlin.L0> {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, InterfaceC5118w0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    public final void e(@Nullable Throwable th) {
        ((InterfaceC5118w0) this.receiver).a(th);
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ kotlin.L0 invoke(Throwable th) {
        e(th);
        return kotlin.L0.f217464a;
    }
}
