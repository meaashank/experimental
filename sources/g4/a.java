package G4;

import androidx.annotation.NonNull;
import androidx.lifecycle.K;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K<T> f40401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f40402b;

    public a(@NonNull K<T> k10, @NonNull T t10) {
        this.f40401a = k10;
        this.f40402b = t10;
    }

    @NonNull
    public T a() {
        T tF = this.f40401a.f();
        return tF != null ? tF : this.f40402b;
    }
}
