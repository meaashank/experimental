package K;

import fd.InterfaceC4425h;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4868j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class g<K, V> extends AbstractC4868j<K> implements Set<K>, InterfaceC4425h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58303b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d<K, V> f58304a;

    public g(@NotNull d<K, V> dVar) {
        this.f58304a = dVar;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f58304a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f58304a.f58298d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f58304a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new h(this.f58304a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f58304a.f58298d.containsKey(obj)) {
            return false;
        }
        this.f58304a.remove(obj);
        return true;
    }
}
