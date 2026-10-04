package kotlin.collections;

import fd.InterfaceC4418a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class EmptyMap implements Map, Serializable, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final EmptyMap f217511a = new EmptyMap();
    private static final long serialVersionUID = 8246714829545688274L;

    private EmptyMap() {
    }

    private final Object readResolve() {
        return f217511a;
    }

    public boolean b(@NotNull Void value) {
        kotlin.jvm.internal.G.p(value, "value");
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        b((Void) obj);
        return false;
    }

    @Nullable
    public Void d(@Nullable Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return EmptySet.f217512a;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public int getSize() {
        return 0;
    }

    @NotNull
    public Set<Map.Entry> h() {
        return EmptySet.f217512a;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @NotNull
    public Set<Object> i() {
        return EmptySet.f217512a;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @NotNull
    public Collection j() {
        return EmptyList.f217510a;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return EmptySet.f217512a;
    }

    public Void m(Object obj, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void o(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    @NotNull
    public String toString() {
        return Ib.b.f53002g;
    }

    @Override // java.util.Map
    public final Collection values() {
        return EmptyList.f217510a;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        o(obj);
        throw null;
    }
}
