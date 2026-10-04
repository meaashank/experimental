package J;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class v<K, V, T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53103d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f53104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53106c;

    public v() {
        u.f53093e.getClass();
        this.f53104a = u.f53095g.f53099d;
    }

    public final K b() {
        return (K) this.f53104a[this.f53106c];
    }

    @NotNull
    public final u<? extends K, ? extends V> d() {
        h();
        Object obj = this.f53104a[this.f53106c];
        G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (u) obj;
    }

    @NotNull
    public final Object[] e() {
        return this.f53104a;
    }

    public final int f() {
        return this.f53106c;
    }

    public final boolean g() {
        return this.f53106c < this.f53105b;
    }

    public final boolean h() {
        return this.f53106c < this.f53104a.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void i() {
        this.f53106c += 2;
    }

    public final void j() {
        h();
        this.f53106c++;
    }

    public final void m(@NotNull Object[] objArr, int i10) {
        o(objArr, i10, 0);
    }

    public final void o(@NotNull Object[] objArr, int i10, int i11) {
        this.f53104a = objArr;
        this.f53105b = i10;
        this.f53106c = i11;
    }

    public final void p(int i10) {
        this.f53106c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
