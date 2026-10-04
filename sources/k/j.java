package K;

import fd.InterfaceC4419b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4865g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class j<K, V> extends AbstractC4865g<V> implements Collection<V>, InterfaceC4419b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58314b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d<K, V> f58315a;

    public j(@NotNull d<K, V> dVar) {
        this.f58315a = dVar;
    }

    @Override // kotlin.collections.AbstractC4865g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f58315a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f58315a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4865g
    public int getSize() {
        return this.f58315a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new k(this.f58315a);
    }
}
