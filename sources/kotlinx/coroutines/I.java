package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlinx.coroutines.H;
import kotlinx.coroutines.internal.C5077k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class I {

    @kotlin.jvm.internal.V({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n*L\n1#1,106:1\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.p<kotlin.coroutines.i, Throwable, kotlin.L0> f218731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.p<? super kotlin.coroutines.i, ? super Throwable, kotlin.L0> pVar, H.b bVar) {
            super(bVar);
            this.f218731b = pVar;
        }

        @Override // kotlinx.coroutines.H
        public void handleException(@NotNull kotlin.coroutines.i iVar, @NotNull Throwable th) {
            this.f218731b.invoke(iVar, th);
        }
    }

    @NotNull
    public static final H a(@NotNull ed.p<? super kotlin.coroutines.i, ? super Throwable, kotlin.L0> pVar) {
        return new a(pVar, H.f218728z3);
    }

    @InterfaceC5120x0
    public static final void b(@NotNull kotlin.coroutines.i iVar, @NotNull Throwable th) {
        try {
            H h10 = (H) iVar.get(H.f218728z3);
            if (h10 != null) {
                h10.handleException(iVar, th);
            } else {
                C5077k.a(iVar, th);
            }
        } catch (Throwable th2) {
            C5077k.a(iVar, c(th, th2));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th, @NotNull Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C4987s.a(runtimeException, th);
        return runtimeException;
    }
}
