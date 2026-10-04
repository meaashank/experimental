package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
@kotlin.jvm.internal.V({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1807#2,3:154\n1786#2,3:157\n296#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractC4863f<K, V> implements Map<K, V>, InterfaceC4418a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f217615c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile Set<? extends K> f217616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Collection<? extends V> f217617b;

    /* JADX INFO: renamed from: kotlin.collections.f$a */
    @kotlin.jvm.internal.V({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a {
        public a() {
        }

        public final boolean a(@NotNull Map.Entry<?, ?> e10, @Nullable Object obj) {
            kotlin.jvm.internal.G.p(e10, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.G.g(e10.getKey(), entry.getKey()) && kotlin.jvm.internal.G.g(e10.getValue(), entry.getValue());
        }

        public final int b(@NotNull Map.Entry<?, ?> e10) {
            kotlin.jvm.internal.G.p(e10, "e");
            Object key = e10.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = e10.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @NotNull
        public final String c(@NotNull Map.Entry<?, ?> e10) {
            kotlin.jvm.internal.G.p(e10, "e");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e10.getKey());
            sb2.append(SignatureVisitor.INSTANCEOF);
            sb2.append(e10.getValue());
            return sb2.toString();
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.f$b */
    public static final class b extends AbstractC4869k<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4863f<K, V> f217618b;

        /* JADX INFO: renamed from: kotlin.collections.f$b$a */
        public static final class a implements Iterator<K>, InterfaceC4418a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f217619a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f217619a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f217619a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f217619a.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(AbstractC4863f<K, ? extends V> abstractC4863f) {
            this.f217618b = abstractC4863f;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f217618b.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217618b.getSize();
        }

        @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f217618b.f().iterator());
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.f$c */
    public static final class c extends AbstractC4855b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC4863f<K, V> f217620a;

        /* JADX INFO: renamed from: kotlin.collections.f$c$a */
        public static final class a implements Iterator<V>, InterfaceC4418a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f217621a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f217621a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f217621a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f217621a.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC4863f<K, ? extends V> abstractC4863f) {
            this.f217620a = abstractC4863f;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f217620a.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217620a.getSize();
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a(this.f217620a.f().iterator());
        }
    }

    public static final CharSequence p(AbstractC4863f abstractC4863f, Map.Entry it) {
        kotlin.jvm.internal.G.p(it, "it");
        return abstractC4863f.o(it);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setF = f();
        if (setF.isEmpty()) {
            return false;
        }
        Iterator<T> it = setF.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.G.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        V v10 = get(key);
        if (kotlin.jvm.internal.G.g(value, v10)) {
            return v10 != null || containsKey(key);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getSize() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Set<Map.Entry<K, V>> f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> entryJ = j(obj);
        if (entryJ != null) {
            return entryJ.getValue();
        }
        return null;
    }

    public int getSize() {
        return f().size();
    }

    @NotNull
    public Set<K> h() {
        if (this.f217616a == null) {
            this.f217616a = new b(this);
        }
        Set<? extends K> set = this.f217616a;
        kotlin.jvm.internal.G.m(set);
        return set;
    }

    @Override // java.util.Map
    public int hashCode() {
        return f().hashCode();
    }

    @NotNull
    public Collection<V> i() {
        if (this.f217617b == null) {
            this.f217617b = new c(this);
        }
        Collection<? extends V> collection = this.f217617b;
        kotlin.jvm.internal.G.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getSize() == 0;
    }

    public final Map.Entry<K, V> j(K k10) {
        Object next;
        Iterator<T> it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.G.g(((Map.Entry) next).getKey(), k10)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return h();
    }

    public final String m(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String o(Map.Entry<? extends K, ? extends V> entry) {
        return m(entry.getKey()) + SignatureVisitor.INSTANCEOF + m(entry.getValue());
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return U.r3(f(), U6.j.f68738d, "{", "}", 0, null, new ed.l() { // from class: kotlin.collections.e
            @Override // ed.l
            public final Object invoke(Object obj) {
                return AbstractC4863f.p(this.f217612a, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
