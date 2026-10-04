package kotlin.time;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class InstantFormatException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantFormatException(@NotNull String message) {
        super(message);
        kotlin.jvm.internal.G.p(message, "message");
    }
}
