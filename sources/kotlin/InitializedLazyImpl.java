package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class InitializedLazyImpl<T> implements G<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f217463a;

    public InitializedLazyImpl(T t10) {
        this.f217463a = t10;
    }

    @Override // kotlin.G
    public T getValue() {
        return this.f217463a;
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f217463a);
    }
}
