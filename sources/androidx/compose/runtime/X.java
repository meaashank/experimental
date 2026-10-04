package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class X<T> extends AbstractC1885a1<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99399e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H1<T> f99400d;

    public X(@NotNull H1<T> h12, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        super(interfaceC4376a);
        this.f99400d = h12;
    }

    @Override // androidx.compose.runtime.AbstractC1885a1
    @NotNull
    public C1888b1<T> e(T t10) {
        return new C1888b1<>(this, t10, t10 == null, this.f99400d, null, null, true);
    }
}
