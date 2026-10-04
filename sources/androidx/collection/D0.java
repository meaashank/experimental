package androidx.collection;

import fd.InterfaceC4424g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class D0<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object[] f86687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object[] f86688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86689c;

    public D0(@NotNull Object[] keys, @NotNull Object[] values, int i10) {
        kotlin.jvm.internal.G.p(keys, "keys");
        kotlin.jvm.internal.G.p(values, "values");
        this.f86687a = keys;
        this.f86688b = values;
        this.f86689c = i10;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    public final int b() {
        return this.f86689c;
    }

    @NotNull
    public final Object[] e() {
        return this.f86687a;
    }

    @NotNull
    public final Object[] g() {
        return this.f86688b;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.f86687a[this.f86689c];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.f86688b[this.f86689c];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        Object[] objArr = this.f86688b;
        int i10 = this.f86689c;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }
}
