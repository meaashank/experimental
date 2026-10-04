package Tc;

import Xc.f;
import java.util.concurrent.CancellationException;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.V;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class a {
    @InterfaceC4887e0(version = "1.4")
    @f
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC4887e0(version = "1.4")
    @f
    public static final CancellationException b(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? String.valueOf(th) : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC4887e0(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
