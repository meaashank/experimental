package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.changelist.j;
import ed.l;
import java.util.concurrent.CancellationException;
import kotlin.L0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
public final class HandlerContext extends d implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Handler f218813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f218814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f218815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HandlerContext f218816f;

    @V({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n141#2:15\n142#2:17\n1#3:16\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n f218817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HandlerContext f218818b;

        public a(InterfaceC5100n interfaceC5100n, HandlerContext handlerContext) {
            this.f218817a = interfaceC5100n;
            this.f218818b = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f218817a.l0(this.f218818b, L0.f217464a);
        }
    }

    public HandlerContext(Handler handler, String str, boolean z10) {
        this.f218813c = handler;
        this.f218814d = str;
        this.f218815e = z10;
        this.f218816f = z10 ? this : new HandlerContext(handler, str, true);
    }

    public static final void J3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f218813c.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull i iVar, @NotNull Runnable runnable) {
        if (this.f218813c.post(runnable)) {
            return;
        }
        v3(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean J2(@NotNull i iVar) {
        return (this.f218815e && G.g(Looper.myLooper(), this.f218813c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.U
    public void T0(long j10, @NotNull InterfaceC5100n<? super L0> interfaceC5100n) {
        final a aVar = new a(interfaceC5100n, this);
        Handler handler = this.f218813c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(aVar, j10)) {
            interfaceC5100n.k0(new l<Throwable, L0>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(@Nullable Throwable th) {
                    this.f218819d.f218813c.removeCallbacks(aVar);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                    e(th);
                    return L0.f217464a;
                }
            });
        } else {
            v3(interfaceC5100n.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.J0
    public J0 Z2() {
        return this.f218816f;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f218813c == this.f218813c && handlerContext.f218815e == this.f218815e;
    }

    @Override // kotlinx.coroutines.android.d, kotlinx.coroutines.U
    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull final Runnable runnable, @NotNull i iVar) {
        Handler handler = this.f218813c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j10)) {
            return new InterfaceC5058e0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.InterfaceC5058e0
                public final void dispose() {
                    HandlerContext.J3(this.f218821a, runnable);
                }
            };
        }
        v3(iVar, runnable);
        return M0.f218772a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f218813c) ^ (this.f218815e ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.d
    public d k3() {
        return this.f218816f;
    }

    @Override // kotlinx.coroutines.J0, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String strD3 = d3();
        if (strD3 != null) {
            return strD3;
        }
        String string = this.f218814d;
        if (string == null) {
            string = this.f218813c.toString();
        }
        return this.f218815e ? j.a(string, ".immediate") : string;
    }

    public final void v3(i iVar, Runnable runnable) {
        D0.f(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C5052b0.c().F2(iVar, runnable);
    }

    @NotNull
    public HandlerContext x3() {
        return this.f218816f;
    }

    public HandlerContext(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    public HandlerContext(Handler handler, String str, int i10, C4969v c4969v) {
        this(handler, (i10 & 2) != 0 ? null : str, false);
    }
}
