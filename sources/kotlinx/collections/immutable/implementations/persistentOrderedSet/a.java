package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f218676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f218677b;

    public a(@Nullable Object obj, @Nullable Object obj2) {
        this.f218676a = obj;
        this.f218677b = obj2;
    }

    public final boolean a() {
        return this.f218677b != ud.c.f239701a;
    }

    public final boolean b() {
        return this.f218676a != ud.c.f239701a;
    }

    @Nullable
    public final Object c() {
        return this.f218677b;
    }

    @Nullable
    public final Object d() {
        return this.f218676a;
    }

    @NotNull
    public final a e(@Nullable Object obj) {
        return new a(this.f218676a, obj);
    }

    @NotNull
    public final a f(@Nullable Object obj) {
        return new a(obj, this.f218677b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        ud.c cVar = ud.c.f239701a;
        this(cVar, cVar);
    }

    public a(@Nullable Object obj) {
        this(obj, ud.c.f239701a);
    }
}
