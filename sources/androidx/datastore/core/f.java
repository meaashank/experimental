package androidx.datastore.core;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f112438a;

    public f(@NotNull Throwable finalException) {
        G.p(finalException, "finalException");
        this.f112438a = finalException;
    }

    @NotNull
    public final Throwable a() {
        return this.f112438a;
    }
}
