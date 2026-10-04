package J;

import fd.InterfaceC4419b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4865g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class l<K, V> extends AbstractC4865g<V> implements Collection<V>, InterfaceC4419b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53080b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f<K, V> f53081a;

    public l(@NotNull f<K, V> fVar) {
        this.f53081a = fVar;
    }

    @Override // kotlin.collections.AbstractC4865g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f53081a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f53081a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4865g
    public int getSize() {
        return this.f53081a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new m(this.f53081a);
    }
}
