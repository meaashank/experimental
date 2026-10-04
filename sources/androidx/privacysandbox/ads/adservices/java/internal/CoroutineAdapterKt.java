package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import ed.l;
import java.util.concurrent.CancellationException;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.S;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineAdapterKt {
    public static /* synthetic */ Object a(S s10, Object obj, CallbackToFutureAdapter.a aVar) {
        d(s10, obj, aVar);
        return obj;
    }

    @NotNull
    public static final <T> ListenableFuture<T> b(@NotNull final S<? extends T> s10, @Nullable final Object obj) {
        G.p(s10, "<this>");
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                S s11 = s10;
                Object obj2 = obj;
                CoroutineAdapterKt.d(s11, obj2, aVar);
                return obj2;
            }
        });
    }

    public static /* synthetic */ ListenableFuture c(S s10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(s10, obj);
    }

    public static final Object d(final S this_asListenableFuture, Object obj, final CallbackToFutureAdapter.a completer) {
        G.p(this_asListenableFuture, "$this_asListenableFuture");
        G.p(completer, "completer");
        this_asListenableFuture.V1(new l<Throwable, L0>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void e(@Nullable Throwable th) {
                if (th == null) {
                    completer.c((T) this_asListenableFuture.n());
                } else if (th instanceof CancellationException) {
                    completer.d();
                } else {
                    completer.f(th);
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        });
        return obj;
    }
}
