package androidx.compose.runtime.snapshots;

import fd.InterfaceC4425h;
import java.util.Set;
import kotlin.jvm.internal.C4968u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class t<K, V, E> implements Set<E>, InterfaceC4425h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x<K, V> f100196a;

    public t(@NotNull x<K, V> xVar) {
        this.f100196a = xVar;
    }

    @NotNull
    public final x<K, V> b() {
        return this.f100196a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f100196a.clear();
    }

    public int getSize() {
        return this.f100196a.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f100196a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }
}
