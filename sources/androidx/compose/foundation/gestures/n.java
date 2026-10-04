package androidx.compose.foundation.gestures;

import androidx.collection.E0;
import androidx.compose.foundation.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@L
@androidx.compose.runtime.internal.r(parameters = 0)
public final class n<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90039b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final E0<T> f90040a = new E0<>(0, 1, null);

    public final void a(T t10, float f10) {
        this.f90040a.l0(t10, f10);
    }

    @NotNull
    public final E0<T> b() {
        return this.f90040a;
    }
}
