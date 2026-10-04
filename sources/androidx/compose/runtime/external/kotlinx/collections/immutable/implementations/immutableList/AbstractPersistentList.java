package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import H.c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.r;
import ed.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4859d;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
@r(parameters = 2)
public abstract class AbstractPersistentList<E> extends AbstractC4859d<E> implements PersistentList<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99581c = 0;

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
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

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    public PersistentList<E> addAll(@NotNull Collection<? extends E> collection) {
        PersistentVectorBuilder persistentVectorBuilder = (PersistentVectorBuilder) builder();
        persistentVectorBuilder.addAll(collection);
        return persistentVectorBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    public PersistentList<E> clear() {
        return j.b();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    public PersistentList<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? l(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    public PersistentList<E> removeAll(@NotNull final Collection<? extends E> collection) {
        return a((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(collection.contains(e10));
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    public PersistentList<E> retainAll(@NotNull final Collection<? extends E> collection) {
        return a((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(!collection.contains(e10));
            }
        });
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List, H.c
    @NotNull
    public H.c<E> subList(int i10, int i11) {
        return new c.a(this, i10, i11);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> addAll(int i10, @NotNull Collection<? extends E> collection) {
        PersistentVectorBuilder persistentVectorBuilder = (PersistentVectorBuilder) builder();
        persistentVectorBuilder.addAll(i10, collection);
        return persistentVectorBuilder.build();
    }
}
