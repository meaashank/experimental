package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4418a;
import java.util.Map;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nkotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public class b<K, V> implements Map.Entry<K, V>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f218560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f218561b;

    public b(K k10, V v10) {
        this.f218560a = k10;
        this.f218561b = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && G.g(entry.getKey(), getKey()) && G.g(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f218560a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f218561b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(SignatureVisitor.INSTANCEOF);
        sb2.append(getValue());
        return sb2.toString();
    }
}
