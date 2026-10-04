package kotlinx.collections.immutable;

import ed.l;
import fd.InterfaceC4425h;
import java.util.Collection;
import java.util.Set;
import kotlinx.collections.immutable.PersistentCollection;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public interface PersistentSet<E> extends InterfaceC5552c<E>, PersistentCollection<E> {

    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, InterfaceC4425h {
        @Override // kotlinx.collections.immutable.PersistentCollection.Builder
        @NotNull
        PersistentSet<E> build();
    }

    @Override // kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> a(@NotNull l<? super E, Boolean> lVar);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> add(E e10);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    @NotNull
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> remove(E e10);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    @NotNull
    PersistentSet<E> retainAll(@NotNull Collection<? extends E> collection);
}
