package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class n<K, V> implements Iterator<a<V>>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f218658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<K, a<V>> f218659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218660c;

    public n(@Nullable Object obj, @NotNull Map<K, a<V>> hashMap) {
        G.p(hashMap, "hashMap");
        this.f218658a = obj;
        this.f218659b = hashMap;
    }

    public final int b() {
        return this.f218660c;
    }

    @Nullable
    public final Object d() {
        return this.f218658a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a<V> aVar = this.f218659b.get(this.f218658a);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f218660c++;
            this.f218658a = aVar2.f218639c;
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f218658a + ") has changed after it was added to the persistent map.");
    }

    public final void f(int i10) {
        this.f218660c = i10;
    }

    public final void g(@Nullable Object obj) {
        this.f218658a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218660c < this.f218659b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
