package C4;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public abstract class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17556a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17557b = 0;

    public static final class a {
        public a() {
        }

        @NotNull
        public final <T> j<T> a(@Nullable T t10) {
            return t10 != null ? new c(t10) : b.f17558c;
        }

        public a(C4969v c4969v) {
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f17558c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f17559d = 0;
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class c<T> extends j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f17560d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f17561c;

        public c(T t10) {
            this.f17561c = t10;
        }

        public static c c(c cVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = cVar.f17561c;
            }
            cVar.getClass();
            return new c(obj);
        }

        public final T a() {
            return this.f17561c;
        }

        @NotNull
        public final c<T> b(T t10) {
            return new c<>(t10);
        }

        public final T d() {
            return this.f17561c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && G.g(this.f17561c, ((c) obj).f17561c);
        }

        public int hashCode() {
            T t10 = this.f17561c;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Some(some=" + this.f17561c + ")";
        }
    }

    public j() {
    }

    public j(C4969v c4969v) {
    }
}
