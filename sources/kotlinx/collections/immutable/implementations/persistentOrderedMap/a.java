package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f218637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f218638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Object f218639c;

    public a(V v10, @Nullable Object obj, @Nullable Object obj2) {
        this.f218637a = v10;
        this.f218638b = obj;
        this.f218639c = obj2;
    }

    public final boolean a() {
        return this.f218639c != ud.c.f239701a;
    }

    public final boolean b() {
        return this.f218638b != ud.c.f239701a;
    }

    @Nullable
    public final Object c() {
        return this.f218639c;
    }

    @Nullable
    public final Object d() {
        return this.f218638b;
    }

    public final V e() {
        return this.f218637a;
    }

    @NotNull
    public final a<V> f(@Nullable Object obj) {
        return new a<>(this.f218637a, this.f218638b, obj);
    }

    @NotNull
    public final a<V> g(@Nullable Object obj) {
        return new a<>(this.f218637a, obj, this.f218639c);
    }

    @NotNull
    public final a<V> h(V v10) {
        return new a<>(v10, this.f218638b, this.f218639c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(V v10) {
        ud.c cVar = ud.c.f239701a;
        this(v10, cVar, cVar);
    }

    public a(V v10, @Nullable Object obj) {
        this(v10, obj, ud.c.f239701a);
    }
}
