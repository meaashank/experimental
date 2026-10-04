package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nInternalMotatorMutex.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMotatorMutex.jvm.kt\nandroidx/compose/animation/core/MutationInterruptedException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,28:1\n26#2:29\n*S KotlinDebug\n*F\n+ 1 InternalMotatorMutex.jvm.kt\nandroidx/compose/animation/core/MutationInterruptedException\n*L\n24#1:29\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class MutationInterruptedException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87717a = 0;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
