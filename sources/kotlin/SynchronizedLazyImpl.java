package kotlin;

import ed.InterfaceC4376a;
import java.io.Serializable;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class SynchronizedLazyImpl<T> implements G<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<? extends T> f217477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Object f217478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f217479c;

    public SynchronizedLazyImpl(@NotNull InterfaceC4376a<? extends T> initializer, @Nullable Object obj) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        this.f217477a = initializer;
        this.f217478b = F0.f217452a;
        this.f217479c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.G
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f217478b;
        F0 f02 = F0.f217452a;
        if (t10 != f02) {
            return t10;
        }
        synchronized (this.f217479c) {
            tInvoke = (T) this.f217478b;
            if (tInvoke == f02) {
                InterfaceC4376a<? extends T> interfaceC4376a = this.f217477a;
                kotlin.jvm.internal.G.m(interfaceC4376a);
                tInvoke = interfaceC4376a.invoke();
                this.f217478b = tInvoke;
                this.f217477a = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return this.f217478b != F0.f217452a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(InterfaceC4376a interfaceC4376a, Object obj, int i10, C4969v c4969v) {
        this(interfaceC4376a, (i10 & 2) != 0 ? null : obj);
    }
}
