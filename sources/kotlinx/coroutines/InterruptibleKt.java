package kotlinx.coroutines;

import ed.InterfaceC4376a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InterruptibleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218733a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f218734b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218735c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f218736d = 3;

    @Nullable
    public static final <T> Object b(@NotNull kotlin.coroutines.i iVar, @NotNull InterfaceC4376a<? extends T> interfaceC4376a, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return C5092j.g(iVar, new InterruptibleKt$runInterruptible$2(interfaceC4376a, null), eVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.i iVar, InterfaceC4376a interfaceC4376a, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        return b(iVar, interfaceC4376a, eVar);
    }

    public static final <T> T d(kotlin.coroutines.i iVar, InterfaceC4376a<? extends T> interfaceC4376a) throws Throwable {
        try {
            g1 g1Var = new g1(JobKt__JobKt.z(iVar));
            g1Var.h();
            try {
                return interfaceC4376a.invoke();
            } finally {
                g1Var.b();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
