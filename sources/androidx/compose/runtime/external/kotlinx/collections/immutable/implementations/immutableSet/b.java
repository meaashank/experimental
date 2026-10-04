package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.r;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4868j;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b<E> extends AbstractC4868j<E> implements PersistentSet.Builder<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f99638f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public a<E> f99639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public M.f f99640b = new M.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public e<E> f99641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f99643e;

    public b(@NotNull a<E> aVar) {
        this.f99639a = aVar;
        this.f99641c = aVar.f99636b;
        this.f99643e = aVar.getSize();
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int size = getSize();
        this.f99641c = this.f99641c.u(e10 != null ? e10.hashCode() : 0, e10, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.addAll(collection);
        }
        M.b bVar2 = new M.b(0, 1, null);
        int size = getSize();
        e<E> eVarV = this.f99641c.v(aVarBuild.f99636b, 0, bVar2, this);
        int size2 = (collection.size() + size) - bVar2.f58781a;
        if (size != size2) {
            this.f99641c = eVarV;
            o(size2);
        }
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        e.f99653d.getClass();
        e<E> eVar = e.f99655f;
        G.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f99641c = eVar;
        o(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f99641c.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return collection instanceof a ? this.f99641c.j(((a) collection).f99636b, 0) : collection instanceof b ? this.f99641c.j(((b) collection).f99641c, 0) : super.containsAll(collection);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a<E> build() {
        e<E> eVar = this.f99641c;
        a<E> aVar = this.f99639a;
        if (eVar != aVar.f99636b) {
            this.f99640b = new M.f();
            aVar = new a<>(this.f99641c, getSize());
        }
        this.f99639a = aVar;
        return aVar;
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f99643e;
    }

    public final int h() {
        return this.f99642d;
    }

    @NotNull
    public final e<E> i() {
        return this.f99641c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new d(this);
    }

    @NotNull
    public final M.f j() {
        return this.f99640b;
    }

    public void o(int i10) {
        this.f99643e = i10;
        this.f99642d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = getSize();
        this.f99641c = this.f99641c.E(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != getSize();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.removeAll(collection);
        }
        M.b bVar2 = new M.b(0, 1, null);
        int size = getSize();
        Object objF = this.f99641c.F(aVarBuild.f99636b, 0, bVar2, this);
        int i10 = size - bVar2.f58781a;
        if (i10 == 0) {
            clear();
        } else if (i10 != size) {
            G.n(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f99641c = (e) objF;
            o(i10);
        }
        return size != getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.retainAll(collection);
        }
        M.b bVar2 = new M.b(0, 1, null);
        int size = getSize();
        Object objH = this.f99641c.H(aVarBuild.f99636b, 0, bVar2, this);
        int i10 = bVar2.f58781a;
        if (i10 == 0) {
            clear();
        } else if (i10 != size) {
            G.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f99641c = (e) objH;
            o(i10);
        }
        return size != getSize();
    }
}
