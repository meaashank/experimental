package kotlin.collections.builders;

import fd.InterfaceC4425h;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4868j;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SetBuilder<E> extends AbstractC4868j<E> implements Set<E>, Serializable, InterfaceC4425h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217593b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SetBuilder f217594c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MapBuilder<E, ?> f217595a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        MapBuilder.f217560n.getClass();
        f217594c = new SetBuilder(MapBuilder.f217565s);
    }

    public SetBuilder(@NotNull MapBuilder<E, ?> backing) {
        G.p(backing, "backing");
        this.f217595a = backing;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f217595a.f217578m) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractC4868j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f217595a.o(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        this.f217595a.r();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f217595a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f217595a.containsKey(obj);
    }

    @NotNull
    public final Set<E> g() {
        this.f217595a.q();
        return getSize() > 0 ? this : f217594c;
    }

    @Override // kotlin.collections.AbstractC4868j
    public int getSize() {
        return this.f217595a.f217574i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f217595a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f217595a;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f217595a.T(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217595a.r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        this.f217595a.r();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i10) {
        this(new MapBuilder(i10));
    }
}
