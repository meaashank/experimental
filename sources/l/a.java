package L;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58599c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f58600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f58601b;

    public a(@Nullable Object obj, @Nullable Object obj2) {
        this.f58600a = obj;
        this.f58601b = obj2;
    }

    public final boolean a() {
        return this.f58601b != M.c.f58782a;
    }

    public final boolean b() {
        return this.f58600a != M.c.f58782a;
    }

    @Nullable
    public final Object c() {
        return this.f58601b;
    }

    @Nullable
    public final Object d() {
        return this.f58600a;
    }

    @NotNull
    public final a e(@Nullable Object obj) {
        return new a(this.f58600a, obj);
    }

    @NotNull
    public final a f(@Nullable Object obj) {
        return new a(obj, this.f58601b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        M.c cVar = M.c.f58782a;
        this(cVar, cVar);
    }

    public a(@Nullable Object obj) {
        this(obj, M.c.f58782a);
    }
}
