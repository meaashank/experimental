package androidx.datastore.core;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f112439a;

    public h(@NotNull Throwable readException) {
        G.p(readException, "readException");
        this.f112439a = readException;
    }

    @NotNull
    public final Throwable a() {
        return this.f112439a;
    }
}
