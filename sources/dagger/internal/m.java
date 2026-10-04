package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f194937b = "Set contributions cannot be null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f194938a;

    public m(int estimatedSize) {
        this.f194938a = new ArrayList(estimatedSize);
    }

    public static <T> m<T> d(int estimatedSize) {
        return new m<>(estimatedSize);
    }

    public m<T> a(T t10) {
        List<T> list = this.f194938a;
        j.b(t10, f194937b);
        list.add(t10);
        return this;
    }

    public m<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            j.b(it.next(), f194937b);
        }
        this.f194938a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        int size = this.f194938a.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableSet(new HashSet(this.f194938a)) : Collections.singleton(this.f194938a.get(0)) : Collections.EMPTY_SET;
    }
}
