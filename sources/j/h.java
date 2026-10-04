package J;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentHashMapBuilderContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapBuilderContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class h<K, V> extends AbstractC1212a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53073c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f<K, V> f53074b;

    public h(@NotNull f<K, V> fVar) {
        this.f53074b = fVar;
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f53074b.clear();
    }

    @Override // J.AbstractC1212a
    public boolean g(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        V v10 = this.f53074b.get(entry.getKey());
        return v10 != null ? v10.equals(entry.getValue()) : entry.getValue() == null && this.f53074b.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f53074b.size();
    }

    @Override // J.AbstractC1212a
    public boolean i(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f53074b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f53074b);
    }

    public boolean j(@NotNull Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
