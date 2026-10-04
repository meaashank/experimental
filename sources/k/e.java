package K;

import J.AbstractC1212a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentOrderedMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class e<K, V> extends AbstractC1212a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58299c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<K, V> f58300b;

    public e(@NotNull d<K, V> dVar) {
        this.f58300b = dVar;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f58300b.clear();
    }

    @Override // J.AbstractC1212a
    public boolean g(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        V v10 = this.f58300b.get(entry.getKey());
        if (v10 != null) {
            return v10.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            return this.f58300b.f58298d.containsKey(entry.getKey());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f58300b.size();
    }

    @Override // J.AbstractC1212a
    public boolean i(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f58300b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new f(this.f58300b);
    }

    public boolean j(@NotNull Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
