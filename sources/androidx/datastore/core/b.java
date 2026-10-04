package androidx.datastore.core;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f112435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112436b;

    public b(T t10, int i10) {
        this.f112435a = t10;
        this.f112436b = i10;
    }

    public final void a() {
        T t10 = this.f112435a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f112436b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int b() {
        return this.f112436b;
    }

    public final T c() {
        return this.f112435a;
    }
}
