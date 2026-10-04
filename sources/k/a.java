package K;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class a<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58282d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f58283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f58284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Object f58285c;

    public a(V v10, @Nullable Object obj, @Nullable Object obj2) {
        this.f58283a = v10;
        this.f58284b = obj;
        this.f58285c = obj2;
    }

    public final boolean a() {
        return this.f58285c != M.c.f58782a;
    }

    public final boolean b() {
        return this.f58284b != M.c.f58782a;
    }

    @Nullable
    public final Object c() {
        return this.f58285c;
    }

    @Nullable
    public final Object d() {
        return this.f58284b;
    }

    public final V e() {
        return this.f58283a;
    }

    @NotNull
    public final a<V> f(@Nullable Object obj) {
        return new a<>(this.f58283a, this.f58284b, obj);
    }

    @NotNull
    public final a<V> g(@Nullable Object obj) {
        return new a<>(this.f58283a, obj, this.f58285c);
    }

    @NotNull
    public final a<V> h(V v10) {
        return new a<>(v10, this.f58284b, this.f58285c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(V v10) {
        M.c cVar = M.c.f58782a;
        this(v10, cVar, cVar);
    }

    public a(V v10, @Nullable Object obj) {
        this(v10, obj, M.c.f58782a);
    }
}
