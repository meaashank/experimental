package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class Y1<T> extends AbstractC1885a1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99406d = 0;

    public Y1(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        super(interfaceC4376a);
    }

    @Override // androidx.compose.runtime.AbstractC1885a1
    @NotNull
    public C1888b1<T> e(T t10) {
        return new C1888b1<>(this, t10, t10 == null, null, null, null, false);
    }
}
