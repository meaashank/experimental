package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMutatorMutex.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.jvm.kt\nandroidx/compose/foundation/MutationInterruptedException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,29:1\n26#2:30\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.jvm.kt\nandroidx/compose/foundation/MutationInterruptedException\n*L\n25#1:30\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class MutationInterruptedException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f88817a = 0;

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
