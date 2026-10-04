package kotlinx.collections.immutable;

import ed.l;
import fd.InterfaceC4422e;
import java.util.Collection;
import java.util.List;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface PersistentList<E> extends b<E>, PersistentCollection<E> {

    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, InterfaceC4422e {
        @Override // kotlinx.collections.immutable.PersistentCollection.Builder
        @NotNull
        PersistentList<E> build();
    }

    public static final class a {
        @NotNull
        public static <E> b<E> a(@NotNull PersistentList<? extends E> persistentList, int i10, int i11) {
            return new b.C0827b(persistentList, i10, i11);
        }
    }

    @Override // kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> a(@NotNull l<? super E, Boolean> lVar);

    @Override // java.util.List
    @NotNull
    PersistentList<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> add(E e10);

    @Override // java.util.List
    @NotNull
    PersistentList<E> addAll(int i10, @NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    @NotNull
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> clear();

    @NotNull
    PersistentList<E> l(int i10);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> remove(E e10);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentList<E> retainAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List
    @NotNull
    PersistentList<E> set(int i10, E e10);
}
