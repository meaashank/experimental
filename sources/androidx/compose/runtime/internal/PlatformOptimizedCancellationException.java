package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nUtils.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.jvm.kt\nandroidx/compose/runtime/internal/PlatformOptimizedCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,39:1\n26#2:40\n*S KotlinDebug\n*F\n+ 1 Utils.jvm.kt\nandroidx/compose/runtime/internal/PlatformOptimizedCancellationException\n*L\n35#1:40\n*E\n"})
@r(parameters = 1)
public abstract class PlatformOptimizedCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99934a = 0;

    public PlatformOptimizedCancellationException() {
        this(null, 1, null);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public PlatformOptimizedCancellationException(@Nullable String str) {
        super(str);
    }

    public PlatformOptimizedCancellationException(String str, int i10, C4969v c4969v) {
        super((i10 & 1) != 0 ? null : str);
    }
}
