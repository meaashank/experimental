package kotlinx.coroutines.channels;

import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@dd.h
public final class j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f219194b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f219195c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f219196a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @Nullable
        public final Throwable f219197a;

        public a(@Nullable Throwable th) {
            this.f219197a = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && G.g(this.f219197a, ((a) obj).f219197a);
        }

        public int hashCode() {
            Throwable th = this.f219197a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.j.c
        @NotNull
        public String toString() {
            return "Closed(" + this.f219197a + ')';
        }
    }

    @InterfaceC5120x0
    public static final class b {
        public b() {
        }

        @InterfaceC5120x0
        @NotNull
        public final <E> Object a(@Nullable Throwable th) {
            return new a(th);
        }

        @InterfaceC5120x0
        @NotNull
        public final <E> Object b() {
            return j.f219195c;
        }

        @InterfaceC5120x0
        @NotNull
        public final <E> Object c(E e10) {
            return e10;
        }

        public b(C4969v c4969v) {
        }
    }

    public static class c {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @InterfaceC4850b0
    public /* synthetic */ j(Object obj) {
        this.f219196a = obj;
    }

    public static final /* synthetic */ j b(Object obj) {
        return new j(obj);
    }

    @InterfaceC4850b0
    @NotNull
    public static <T> Object c(@Nullable Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof j) && G.g(obj, ((j) obj2).f219196a);
    }

    public static final boolean e(Object obj, Object obj2) {
        return G.g(obj, obj2);
    }

    @Nullable
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f219197a;
        }
        return null;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).f219197a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f219196a, obj);
    }

    public int hashCode() {
        return j(this.f219196a);
    }

    public final /* synthetic */ Object o() {
        return this.f219196a;
    }

    @NotNull
    public String toString() {
        return n(this.f219196a);
    }
}
