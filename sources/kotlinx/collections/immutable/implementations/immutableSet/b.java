package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4868j;
import kotlin.jvm.internal.G;
import kotlinx.collections.immutable.PersistentSet;
import org.jetbrains.annotations.NotNull;
import ud.g;

/* JADX INFO: loaded from: classes5.dex */
public final class b<E> extends AbstractC4868j<E> implements PersistentSet.Builder<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public a<E> f218605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public g f218606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public d<E> f218607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218609e;

    public b(@NotNull a<E> set) {
        G.p(set, "set");
        this.f218605a = set;
        this.f218606b = new g();
        this.f218607c = set.f218603b;
        this.f218609e = set.getSize();
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int size = getSize();
        this.f218607c = this.f218607c.v(e10 != null ? e10.hashCode() : 0, e10, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.addAll(elements);
        }
        ud.b bVar2 = new ud.b(0, 1, null);
        int size = getSize();
        d<E> dVarW = this.f218607c.w(aVarBuild.f218603b, 0, bVar2, this);
        int size2 = (elements.size() + size) - bVar2.f239700a;
        if (size != size2) {
            this.f218607c = dVarW;
            o(size2);
        }
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        d.f218613d.getClass();
        d<E> dVar = d.f218614e;
        G.n(dVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f218607c = dVar;
        o(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218607c.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        return elements instanceof a ? this.f218607c.k(((a) elements).f218603b, 0) : elements instanceof b ? this.f218607c.k(((b) elements).f218607c, 0) : super.containsAll(elements);
    }

    @Override // kotlinx.collections.immutable.PersistentSet.Builder, kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a<E> build() {
        d<E> dVar = this.f218607c;
        a<E> aVar = this.f218605a;
        if (dVar != aVar.f218603b) {
            this.f218606b = new g();
            aVar = new a<>(this.f218607c, getSize());
        }
        this.f218605a = aVar;
        return aVar;
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f218609e;
    }

    public final int h() {
        return this.f218608d;
    }

    @NotNull
    public final d<E> i() {
        return this.f218607c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new td.a(this);
    }

    @NotNull
    public final g j() {
        return this.f218606b;
    }

    public void o(int i10) {
        this.f218609e = i10;
        this.f218608d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = getSize();
        this.f218607c = this.f218607c.C(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.removeAll(elements);
        }
        ud.b bVar2 = new ud.b(0, 1, null);
        int size = getSize();
        Object objD = this.f218607c.D(aVarBuild.f218603b, 0, bVar2, this);
        int i10 = size - bVar2.f239700a;
        if (i10 == 0) {
            clear();
        } else if (i10 != size) {
            G.n(objD, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f218607c = (d) objD;
            o(i10);
        }
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        a<E> aVarBuild = elements instanceof a ? (a) elements : null;
        if (aVarBuild == null) {
            b bVar = elements instanceof b ? (b) elements : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.retainAll(elements);
        }
        ud.b bVar2 = new ud.b(0, 1, null);
        int size = getSize();
        Object objE = this.f218607c.E(aVarBuild.f218603b, 0, bVar2, this);
        int i10 = bVar2.f239700a;
        if (i10 == 0) {
            clear();
        } else if (i10 != size) {
            G.n(objE, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f218607c = (d) objE;
            o(i10);
        }
        return size != getSize();
    }
}
