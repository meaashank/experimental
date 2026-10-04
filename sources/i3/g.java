package I3;

import androidx.compose.runtime.internal.r;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51069a = 0;

    @r(parameters = 0)
    public static final class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51070c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Exception f51071b;

        public a(@NotNull Exception cause) {
            G.p(cause, "cause");
            this.f51071b = cause;
        }

        public static /* synthetic */ a c(a aVar, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = aVar.f51071b;
            }
            return aVar.b(exc);
        }

        @NotNull
        public final Exception a() {
            return this.f51071b;
        }

        @NotNull
        public final a b(@NotNull Exception cause) {
            G.p(cause, "cause");
            return new a(cause);
        }

        @NotNull
        public final Exception d() {
            return this.f51071b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && G.g(this.f51071b, ((a) obj).f51071b);
        }

        public int hashCode() {
            return this.f51071b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(cause=" + this.f51071b + ")";
        }
    }

    @r(parameters = 0)
    public static final class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51072c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<U3.a> f51073b;

        public b(@NotNull List<U3.a> hosts) {
            G.p(hosts, "hosts");
            this.f51073b = hosts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = bVar.f51073b;
            }
            return bVar.b(list);
        }

        @NotNull
        public final List<U3.a> a() {
            return this.f51073b;
        }

        @NotNull
        public final b b(@NotNull List<U3.a> hosts) {
            G.p(hosts, "hosts");
            return new b(hosts);
        }

        @NotNull
        public final List<U3.a> d() {
            return this.f51073b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && G.g(this.f51073b, ((b) obj).f51073b);
        }

        public int hashCode() {
            return this.f51073b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(hosts=" + this.f51073b + ")";
        }
    }

    public g() {
    }

    public g(C4969v c4969v) {
    }
}
