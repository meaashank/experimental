package kotlinx.coroutines.debug.internal;

import com.google.common.util.concurrent.r;
import ed.l;
import ed.p;
import fd.InterfaceC4421d;
import fd.InterfaceC4424g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC4867i;
import kotlin.collections.AbstractC4868j;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class ConcurrentWeakMap<K, V> extends AbstractC4867i<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f219209b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f219210c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ReferenceQueue<K> f219211a;
    private volatile /* synthetic */ Object core$volatile;

    public final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f219212g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f219213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f219214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f219215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f219216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f219217e;
        private volatile /* synthetic */ int load$volatile;

        /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a, reason: collision with other inner class name */
        @V({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        public final class C0829a<E> implements Iterator<E>, InterfaceC4421d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final p<K, V, E> f219219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219220b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public K f219221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public V f219222d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0829a(@NotNull p<? super K, ? super V, ? extends E> pVar) {
                this.f219219a = pVar;
                b();
            }

            public final void b() {
                K k10;
                while (true) {
                    int i10 = this.f219220b + 1;
                    this.f219220b = i10;
                    if (i10 >= a.this.f219213a) {
                        return;
                    }
                    g gVar = (g) a.this.f219216d.get(this.f219220b);
                    if (gVar != null && (k10 = (K) gVar.get()) != null) {
                        this.f219221c = k10;
                        Object obj = (V) a.this.f219217e.get(this.f219220b);
                        if (obj instanceof h) {
                            obj = (V) ((h) obj).f219289a;
                        }
                        if (obj != null) {
                            this.f219222d = (V) obj;
                            return;
                        }
                    }
                }
            }

            @NotNull
            public Void d() {
                kotlinx.coroutines.debug.internal.b.e();
                throw null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f219220b < a.this.f219213a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f219220b >= a.this.f219213a) {
                    throw new NoSuchElementException();
                }
                p<K, V, E> pVar = this.f219219a;
                K k10 = this.f219221c;
                if (k10 == null) {
                    G.S("key");
                    throw null;
                }
                V v10 = this.f219222d;
                if (v10 == null) {
                    G.S("value");
                    throw null;
                }
                E eInvoke = pVar.invoke(k10, v10);
                b();
                return eInvoke;
            }

            @Override // java.util.Iterator
            public void remove() {
                kotlinx.coroutines.debug.internal.b.e();
                throw null;
            }
        }

        public a(int i10) {
            this.f219213a = i10;
            this.f219214b = Integer.numberOfLeadingZeros(i10) + 1;
            this.f219215c = (i10 * 2) / 3;
            this.f219216d = new AtomicReferenceArray(i10);
            this.f219217e = new AtomicReferenceArray(i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object m(a aVar, Object obj, Object obj2, g gVar, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                gVar = null;
            }
            return aVar.l(obj, obj2, gVar);
        }

        public final void d(@NotNull g<?> gVar) {
            int iJ = j(gVar.f219288a);
            while (true) {
                g<?> gVar2 = (g) this.f219216d.get(iJ);
                if (gVar2 == null) {
                    return;
                }
                if (gVar2 == gVar) {
                    o(iJ);
                    return;
                } else {
                    if (iJ == 0) {
                        iJ = this.f219213a;
                    }
                    iJ--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final V e(@NotNull K k10) {
            int iJ = j(k10.hashCode());
            while (true) {
                g gVar = (g) this.f219216d.get(iJ);
                if (gVar == null) {
                    return null;
                }
                Object obj = gVar.get();
                if (k10.equals(obj)) {
                    V v10 = (V) this.f219217e.get(iJ);
                    return v10 instanceof h ? (V) ((h) v10).f219289a : v10;
                }
                if (obj == null) {
                    o(iJ);
                }
                if (iJ == 0) {
                    iJ = this.f219213a;
                }
                iJ--;
            }
        }

        public final /* synthetic */ AtomicReferenceArray f() {
            return this.f219216d;
        }

        public final /* synthetic */ int g() {
            return this.load$volatile;
        }

        public final /* synthetic */ AtomicReferenceArray i() {
            return this.f219217e;
        }

        public final int j(int i10) {
            return (i10 * (-1640531527)) >>> this.f219214b;
        }

        @NotNull
        public final <E> Iterator<E> k(@NotNull p<? super K, ? super V, ? extends E> pVar) {
            return new C0829a(pVar);
        }

        @Nullable
        public final Object l(@NotNull K k10, @Nullable V v10, @Nullable g<K> gVar) {
            int i10;
            Object obj;
            int iJ = j(k10.hashCode());
            boolean z10 = false;
            while (true) {
                g gVar2 = (g) this.f219216d.get(iJ);
                if (gVar2 != null) {
                    Object obj2 = gVar2.get();
                    if (!k10.equals(obj2)) {
                        if (obj2 == null) {
                            o(iJ);
                        }
                        if (iJ == 0) {
                            iJ = this.f219213a;
                        }
                        iJ--;
                    } else if (z10) {
                        f219212g.decrementAndGet(this);
                    }
                } else if (v10 != null) {
                    if (!z10) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f219212g;
                        do {
                            i10 = atomicIntegerFieldUpdater.get(this);
                            if (i10 >= this.f219215c) {
                                return kotlinx.coroutines.debug.internal.b.f219274c;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1));
                        z10 = true;
                    }
                    if (gVar == null) {
                        gVar = new g<>(k10, ConcurrentWeakMap.this.f219211a);
                    }
                    if (r.a(this.f219216d, iJ, null, gVar)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = this.f219217e.get(iJ);
                if (obj instanceof h) {
                    return kotlinx.coroutines.debug.internal.b.f219274c;
                }
            } while (!r.a(this.f219217e, iJ, obj, v10));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ConcurrentWeakMap<K, V>.a n() {
            int i10;
            Object obj;
            while (true) {
                int size = ConcurrentWeakMap.this.size();
                if (size < 4) {
                    size = 4;
                }
                ConcurrentWeakMap<K, V>.a aVar = (ConcurrentWeakMap<K, V>.a) ConcurrentWeakMap.this.new a(Integer.highestOneBit(size) * 4);
                int i11 = this.f219213a;
                while (i10 < i11) {
                    g gVar = (g) this.f219216d.get(i10);
                    Object obj2 = gVar != null ? gVar.get() : null;
                    if (gVar != null && obj2 == null) {
                        o(i10);
                    }
                    while (true) {
                        obj = this.f219217e.get(i10);
                        if (obj instanceof h) {
                            obj = ((h) obj).f219289a;
                            break;
                        }
                        if (r.a(this.f219217e, i10, obj, kotlinx.coroutines.debug.internal.b.d(obj))) {
                            break;
                        }
                    }
                    i10 = (obj2 == null || obj == null || aVar.l(obj2, obj, gVar) != kotlinx.coroutines.debug.internal.b.f219274c) ? i10 + 1 : 0;
                }
                return aVar;
            }
        }

        public final void o(int i10) {
            Object obj;
            do {
                obj = this.f219217e.get(i10);
                if (obj == null || (obj instanceof h)) {
                    return;
                }
            } while (!r.a(this.f219217e, i10, obj, null));
            ConcurrentWeakMap.this.h();
        }

        public final /* synthetic */ void p(int i10) {
            this.load$volatile = i10;
        }

        public final /* synthetic */ void q(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, l<? super Integer, Integer> lVar) {
            int i10;
            do {
                i10 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, lVar.invoke(Integer.valueOf(i10)).intValue()));
        }
    }

    public static final class b<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f219224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f219225b;

        public b(K k10, V v10) {
            this.f219224a = k10;
            this.f219225b = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f219224a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f219225b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            kotlinx.coroutines.debug.internal.b.e();
            throw null;
        }
    }

    public final class c<E> extends AbstractC4868j<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final p<K, V, E> f219226a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull p<? super K, ? super V, ? extends E> pVar) {
            this.f219226a = pVar;
        }

        @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            kotlinx.coroutines.debug.internal.b.e();
            throw null;
        }

        @Override // kotlin.collections.AbstractC4868j
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            a aVar = (a) ConcurrentWeakMap.f219210c.get(ConcurrentWeakMap.this);
            p<K, V, E> pVar = this.f219226a;
            aVar.getClass();
            return aVar.new C0829a(pVar);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void f(g<?> gVar) {
        ((a) f219210c.get(this)).d(gVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) f219210c.get(this)).e(obj);
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(new p<K, V, Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @NotNull
            public final Map.Entry<K, V> e(@NotNull K k10, @NotNull V v10) {
                return new ConcurrentWeakMap.b(k10, v10);
            }

            @Override // ed.p
            public Object invoke(Object obj, Object obj2) {
                return new ConcurrentWeakMap.b(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractC4867i
    @NotNull
    public Set<K> getKeys() {
        return new c(new p<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // ed.p
            @NotNull
            public final K invoke(@NotNull K k10, @NotNull V v10) {
                return k10;
            }
        });
    }

    @Override // kotlin.collections.AbstractC4867i
    public int getSize() {
        return f219209b.get(this);
    }

    public final void h() {
        f219209b.decrementAndGet(this);
    }

    public final /* synthetic */ Object i() {
        return this.core$volatile;
    }

    public final /* synthetic */ int m() {
        return this._size$volatile;
    }

    public final synchronized V p(K k10, V v10) {
        V v11;
        a aVarN = (a) f219210c.get(this);
        while (true) {
            K k11 = k10;
            V v12 = v10;
            v11 = (V) a.m(aVarN, k11, v12, null, 4, null);
            if (v11 == kotlinx.coroutines.debug.internal.b.f219274c) {
                aVarN = aVarN.n();
                f219210c.set(this, aVarN);
                k10 = k11;
                v10 = v12;
            }
        }
        return v11;
    }

    @Override // kotlin.collections.AbstractC4867i, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k10, @NotNull V v10) {
        V vP = (V) a.m((a) f219210c.get(this), k10, v10, null, 4, null);
        if (vP == kotlinx.coroutines.debug.internal.b.f219274c) {
            vP = p(k10, v10);
        }
        if (vP == null) {
            f219209b.incrementAndGet(this);
        }
        return vP;
    }

    public final void q() {
        if (this.f219211a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.f219211a.remove();
                G.n(referenceRemove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                f((g) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final /* synthetic */ void r(Object obj) {
        this.core$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        if (obj == 0) {
            return null;
        }
        V vP = (V) a.m((a) f219210c.get(this), obj, null, null, 4, null);
        if (vP == kotlinx.coroutines.debug.internal.b.f219274c) {
            vP = p(obj, null);
        }
        if (vP != null) {
            f219209b.decrementAndGet(this);
        }
        return vP;
    }

    public final /* synthetic */ void t(int i10) {
        this._size$volatile = i10;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public ConcurrentWeakMap(boolean z10) {
        this.core$volatile = new a(16);
        this.f219211a = z10 ? new ReferenceQueue<>() : null;
    }
}
