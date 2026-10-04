package kotlinx.collections.immutable.implementations.immutableSet;

import ed.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import kotlin.collections.N;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
public final class a<E> extends AbstractC4869k<E> implements PersistentSet<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0828a f218601d = new C0828a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f218602e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<E> f218603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f218604c;

    /* JADX INFO: renamed from: kotlinx.collections.immutable.implementations.immutableSet.a$a, reason: collision with other inner class name */
    public static final class C0828a {
        public C0828a() {
        }

        @NotNull
        public final <E> PersistentSet<E> a() {
            return a.f218602e;
        }

        public C0828a(C4969v c4969v) {
        }
    }

    static {
        d.f218613d.getClass();
        f218602e = new a(d.f218614e, 0);
    }

    public a(@NotNull d<E> node, int i10) {
        G.p(node, "node");
        this.f218603b = node;
        this.f218604c = i10;
    }

    @Override // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection.Builder builder() {
        return new b(this);
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f218603b.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        return elements instanceof a ? this.f218603b.k(((a) elements).f218603b, 0) : elements instanceof b ? this.f218603b.k(((b) elements).f218607c, 0) : super.containsAll(elements);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f218604c;
    }

    @NotNull
    public final d<E> i() {
        return this.f218603b;
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new c(this.f218603b);
    }

    @Override // kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> a(@NotNull l<? super E, Boolean> predicate) {
        G.p(predicate, "predicate");
        b bVar = new b(this);
        N.I0(bVar, predicate);
        return bVar.build();
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> add(E e10) {
        d<E> dVarB = this.f218603b.b(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f218603b == dVarB ? this : new a(dVarB, getSize() + 1);
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> addAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        b bVar = new b(this);
        bVar.addAll(elements);
        return bVar.build();
    }

    @Override // kotlinx.collections.immutable.PersistentSet, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet.Builder<E> builder() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> clear() {
        f218601d.getClass();
        return f218602e;
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> remove(E e10) {
        d<E> dVarG = this.f218603b.G(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f218603b == dVarG ? this : new a(dVarG, getSize() - 1);
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> removeAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        b bVar = new b(this);
        bVar.removeAll(elements);
        return bVar.build();
    }

    @Override // java.util.Collection, java.util.Set, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> retainAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        b bVar = new b(this);
        bVar.retainAll(elements);
        return bVar.build();
    }
}
