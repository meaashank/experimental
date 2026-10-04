package kotlin;

import ed.InterfaceC4376a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsafeLazyImpl<T> implements G<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<? extends T> f217483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object f217484b;

    public UnsafeLazyImpl(@NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        this.f217483a = initializer;
        this.f217484b = F0.f217452a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.G
    public T getValue() {
        if (this.f217484b == F0.f217452a) {
            InterfaceC4376a<? extends T> interfaceC4376a = this.f217483a;
            kotlin.jvm.internal.G.m(interfaceC4376a);
            this.f217484b = interfaceC4376a.invoke();
            this.f217483a = null;
        }
        return (T) this.f217484b;
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return this.f217484b != F0.f217452a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
