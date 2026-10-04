package kotlinx.collections.immutable.implementations.immutableList;

import ed.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4859d;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nkotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
public abstract class AbstractPersistentList<E> extends AbstractC4859d<E> implements PersistentList<E> {
    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> addAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        PersistentVectorBuilder persistentVectorBuilder = (PersistentVectorBuilder) builder();
        persistentVectorBuilder.addAll(elements);
        return persistentVectorBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> clear() {
        return j.b();
    }

    @Override // java.util.Collection, java.util.List, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? l(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> removeAll(@NotNull final Collection<? extends E> elements) {
        G.p(elements, "elements");
        return a((l) new l<E, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(elements.contains(e10));
            }
        });
    }

    @Override // java.util.Collection, java.util.List, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> retainAll(@NotNull final Collection<? extends E> elements) {
        G.p(elements, "elements");
        return a((l) new l<E, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(!elements.contains(e10));
            }
        });
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List, H.c
    @NotNull
    public kotlinx.collections.immutable.b<E> subList(int i10, int i11) {
        return new b.C0827b(this, i10, i11);
    }

    @Override // java.util.List, kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> addAll(int i10, @NotNull Collection<? extends E> c10) {
        G.p(c10, "c");
        PersistentVectorBuilder persistentVectorBuilder = (PersistentVectorBuilder) builder();
        persistentVectorBuilder.addAll(i10, c10);
        return persistentVectorBuilder.build();
    }
}
