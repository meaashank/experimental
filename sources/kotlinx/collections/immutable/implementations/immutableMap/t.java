package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t<K, V, T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f218587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218589c;

    public t() {
        s.f218579e.getClass();
        this.f218587a = s.f218580f.f218584d;
    }

    public final K b() {
        return (K) this.f218587a[this.f218589c];
    }

    @NotNull
    public final s<? extends K, ? extends V> d() {
        h();
        Object obj = this.f218587a[this.f218589c];
        G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (s) obj;
    }

    @NotNull
    public final Object[] e() {
        return this.f218587a;
    }

    public final int f() {
        return this.f218589c;
    }

    public final boolean g() {
        return this.f218589c < this.f218588b;
    }

    public final boolean h() {
        return this.f218589c < this.f218587a.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void i() {
        this.f218589c += 2;
    }

    public final void j() {
        h();
        this.f218589c++;
    }

    public final void m(@NotNull Object[] buffer, int i10) {
        G.p(buffer, "buffer");
        o(buffer, i10, 0);
    }

    public final void o(@NotNull Object[] buffer, int i10, int i11) {
        G.p(buffer, "buffer");
        this.f218587a = buffer;
        this.f218588b = i10;
        this.f218589c = i11;
    }

    public final void p(int i10) {
        this.f218589c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
