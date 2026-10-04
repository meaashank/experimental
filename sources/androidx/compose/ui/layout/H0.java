package androidx.compose.ui.layout;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface H0 {

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a implements Collection<Object>, InterfaceC4418a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f102400b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Set<Object> f102401a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            return this.f102401a.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean b(@Nullable Object obj) {
            return this.f102401a.add(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f102401a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.f102401a.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> collection) {
            return this.f102401a.containsAll(collection);
        }

        public final boolean g(@NotNull ed.l<Object, Boolean> lVar) {
            return kotlin.collections.N.I0(this.f102401a, lVar);
        }

        public int getSize() {
            return this.f102401a.size();
        }

        public final boolean h(@NotNull ed.l<Object, Boolean> lVar) {
            return kotlin.collections.N.S0(this.f102401a, lVar);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f102401a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<Object> iterator() {
            return this.f102401a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object obj) {
            return this.f102401a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            return this.f102401a.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            return this.f102401a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f102401a.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return C4968u.a(this);
        }

        public a(@NotNull Set<Object> set) {
            this.f102401a = set;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C4968u.b(this, tArr);
        }

        public /* synthetic */ a(Set set, int i10, C4969v c4969v) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(@NotNull a aVar);

    boolean b(@Nullable Object obj, @Nullable Object obj2);
}
