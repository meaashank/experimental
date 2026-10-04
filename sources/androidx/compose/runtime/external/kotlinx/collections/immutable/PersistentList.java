package androidx.compose.runtime.external.kotlinx.collections.immutable;

import H.c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import ed.l;
import fd.InterfaceC4422e;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentList<E> extends c<E>, PersistentCollection<E> {

    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, InterfaceC4422e {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        @NotNull
        PersistentList<E> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> a(@NotNull l<? super E, Boolean> lVar);

    @Override // java.util.List
    @NotNull
    PersistentList<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> add(E e10);

    @Override // java.util.List
    @NotNull
    PersistentList<E> addAll(int i10, @NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> clear();

    @NotNull
    PersistentList<E> l(int i10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> remove(E e10);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection, java.util.Set
    @NotNull
    PersistentList<E> retainAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List
    @NotNull
    PersistentList<E> set(int i10, E e10);
}
