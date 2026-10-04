package androidx.compose.runtime.external.kotlinx.collections.immutable;

import H.e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import ed.l;
import fd.InterfaceC4425h;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentSet<E> extends e<E>, PersistentCollection<E> {

    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, InterfaceC4425h {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        @NotNull
        PersistentSet<E> build();
    }

    @NotNull
    PersistentSet<E> a(@NotNull l<? super E, Boolean> lVar);

    @NotNull
    PersistentSet<E> add(E e10);

    @NotNull
    PersistentSet<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    Builder<E> builder();

    @NotNull
    PersistentSet<E> clear();

    @NotNull
    PersistentSet<E> remove(E e10);

    @NotNull
    PersistentSet<E> removeAll(@NotNull Collection<? extends E> collection);

    @NotNull
    PersistentSet<E> retainAll(@NotNull Collection<? extends E> collection);
}
