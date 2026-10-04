package okhttp3.internal.http2;

import dd.g;
import java.io.IOException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    @NotNull
    public final ErrorCode f225778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@NotNull ErrorCode errorCode) {
        super(G.C("stream was reset: ", errorCode));
        G.p(errorCode, "errorCode");
        this.f225778a = errorCode;
    }
}
