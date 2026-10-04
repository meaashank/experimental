package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Enumeration;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class K extends J {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f217516a;

        public a(Enumeration<T> enumeration) {
            this.f217516a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f217516a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f217516a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static <T> Iterator<T> h0(@NotNull Enumeration<T> enumeration) {
        kotlin.jvm.internal.G.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
