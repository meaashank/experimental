package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@dd.h
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217469b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f217470a;

    public static final class Failure implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @NotNull
        public final Throwable f217471a;

        public Failure(@NotNull Throwable exception) {
            kotlin.jvm.internal.G.p(exception, "exception");
            this.f217471a = exception;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && kotlin.jvm.internal.G.g(this.f217471a, ((Failure) obj).f217471a);
        }

        public int hashCode() {
            return this.f217471a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.f217471a + ')';
        }
    }

    public static final class a {
        public a() {
        }

        @Xc.f
        @dd.j(name = "failure")
        public final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.G.p(exception, "exception");
            return C4885d0.a(exception);
        }

        @Xc.f
        @dd.j(name = "success")
        public final <T> Object b(T t10) {
            return t10;
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4850b0
    public /* synthetic */ Result(Object obj) {
        this.f217470a = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    @InterfaceC4850b0
    @NotNull
    public static <T> Object b(@Nullable Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && kotlin.jvm.internal.G.g(obj, ((Result) obj2).f217470a);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.G.g(obj, obj2);
    }

    @Nullable
    public static final Throwable e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f217471a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final T f(Object obj) {
        if (obj instanceof Failure) {
            return null;
        }
        return obj;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof Failure;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof Failure);
    }

    @NotNull
    public static String k(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f217470a, obj);
    }

    public int hashCode() {
        return h(this.f217470a);
    }

    public final /* synthetic */ Object l() {
        return this.f217470a;
    }

    @NotNull
    public String toString() {
        return k(this.f217470a);
    }
}
