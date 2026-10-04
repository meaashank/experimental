package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,67:1\n26#2:68\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n39#1:68\n*E\n"})
public final class JobCancellationException extends CancellationException implements G<JobCancellationException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final transient A0 f218742a;

    public JobCancellationException(@NotNull String str, @Nullable Throwable th, @NotNull A0 a02) {
        super(str);
        this.f218742a = a02;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.G
    public /* bridge */ /* synthetic */ Throwable d() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return kotlin.jvm.internal.G.g(jobCancellationException.getMessage(), getMessage()) && kotlin.jvm.internal.G.g(jobCancellationException.f218742a, this.f218742a) && kotlin.jvm.internal.G.g(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Nullable
    public JobCancellationException g() {
        return null;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.G.m(message);
        int iHashCode = (this.f218742a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.f218742a;
    }
}
