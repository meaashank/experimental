package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class b2<T> extends ThreadLocal<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99424b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<T> f99425a;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        this.f99425a = interfaceC4376a;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public T initialValue() {
        return this.f99425a.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t10) {
        super.set(t10);
    }
}
