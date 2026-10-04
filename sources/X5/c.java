package X5;

import X5.b;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements dagger.internal.e<V5.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f76792a = new c();

    public static c a() {
        return f76792a;
    }

    public static V5.d c() {
        return new b.a();
    }

    public static V5.d d() {
        return new b.a();
    }

    public V5.d b() {
        return new b.a();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new b.a();
    }
}
