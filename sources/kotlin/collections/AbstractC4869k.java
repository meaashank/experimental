package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public abstract class AbstractC4869k<E> extends AbstractC4855b<E> implements Set<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f217624a = new a();

    /* JADX INFO: renamed from: kotlin.collections.k$a */
    public static final class a {
        public a() {
        }

        public final boolean a(@NotNull Set<?> c10, @NotNull Set<?> other) {
            kotlin.jvm.internal.G.p(c10, "c");
            kotlin.jvm.internal.G.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        public final int b(@NotNull Collection<?> c10) {
            kotlin.jvm.internal.G.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public a(C4969v c4969v) {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f217624a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f217624a.b(this);
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
