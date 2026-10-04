package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.r;
import ed.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import kotlin.collections.N;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
@r(parameters = 0)
public final class a<E> extends AbstractC4869k<E> implements PersistentSet<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0242a f99633d = new C0242a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99634e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f99635f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e<E> f99636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99637c;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a$a, reason: collision with other inner class name */
    public static final class C0242a {
        public C0242a() {
        }

        @NotNull
        public final <E> PersistentSet<E> a() {
            return a.f99635f;
        }

        public C0242a(C4969v c4969v) {
        }
    }

    static {
        e.f99653d.getClass();
        f99635f = new a(e.f99655f, 0);
    }

    public a(@NotNull e<E> eVar, int i10) {
        this.f99636b = eVar;
        this.f99637c = i10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection.Builder builder() {
        return new b(this);
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f99636b.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return collection instanceof a ? this.f99636b.j(((a) collection).f99636b, 0) : collection instanceof b ? this.f99636b.j(((b) collection).f99641c, 0) : super.containsAll(collection);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f99637c;
    }

    @NotNull
    public final e<E> i() {
        return this.f99636b;
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new c(this.f99636b);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> a(@NotNull l<? super E, Boolean> lVar) {
        b bVar = new b(this);
        N.I0(bVar, lVar);
        return bVar.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> add(E e10) {
        e<E> eVarB = this.f99636b.b(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f99636b == eVarB ? this : new a(eVarB, getSize() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> addAll(@NotNull Collection<? extends E> collection) {
        b bVar = new b(this);
        bVar.addAll(collection);
        return bVar.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet.Builder<E> builder() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> clear() {
        f99633d.getClass();
        return f99635f;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> remove(E e10) {
        e<E> eVarK = this.f99636b.K(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f99636b == eVarK ? this : new a(eVarK, getSize() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> removeAll(@NotNull Collection<? extends E> collection) {
        b bVar = new b(this);
        bVar.removeAll(collection);
        return bVar.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> retainAll(@NotNull Collection<? extends E> collection) {
        b bVar = new b(this);
        bVar.retainAll(collection);
        return bVar.build();
    }
}
