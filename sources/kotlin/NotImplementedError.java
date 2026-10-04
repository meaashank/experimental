package kotlin;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(@NotNull String message) {
        super(message);
        kotlin.jvm.internal.G.p(message, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
