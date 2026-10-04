package kotlinx.coroutines.flow.internal;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    @InterfaceC4850b0
    public static final int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@NotNull AbortFlowException abortFlowException, @NotNull Object obj) {
        if (abortFlowException.f220073a != obj) {
            throw abortFlowException;
        }
    }
}
