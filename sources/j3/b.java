package J3;

import androidx.compose.runtime.internal.r;
import java.util.Collection;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class b<T> implements a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53163b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a<T> f53164a;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // J3.a
    public boolean a(T t10) {
        a<T> aVar = this.f53164a;
        if (aVar != null) {
            return aVar.a(t10);
        }
        return false;
    }

    @Override // J3.a
    public /* bridge */ /* synthetic */ void b(Collection collection) {
        e(collection);
        throw null;
    }

    @Nullable
    public final a<T> c() {
        return this.f53164a;
    }

    @NotNull
    public Void d(T t10) {
        throw new IllegalStateException("DelegatingBloomFilter does not support put");
    }

    @NotNull
    public Void e(@NotNull Collection<? extends T> collection) {
        G.p(collection, "collection");
        throw new IllegalStateException("DelegatingBloomFilter does not support putAll");
    }

    public final void f(@Nullable a<T> aVar) {
        this.f53164a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // J3.a
    public /* bridge */ /* synthetic */ void put(Object obj) {
        d(obj);
        throw null;
    }

    public b(@Nullable a<T> aVar) {
        this.f53164a = aVar;
    }

    public /* synthetic */ b(a aVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : aVar);
    }
}
