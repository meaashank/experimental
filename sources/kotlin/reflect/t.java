package kotlin.reflect;

import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218025c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final t f218026d = new t(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final KVariance f218027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final r f218028b;

    public static final class a {
        public a() {
        }

        @InterfaceC4850b0
        public static /* synthetic */ void d() {
        }

        @dd.o
        @NotNull
        public final t a(@NotNull r type) {
            G.p(type, "type");
            return new t(KVariance.IN, type);
        }

        @dd.o
        @NotNull
        public final t b(@NotNull r type) {
            G.p(type, "type");
            return new t(KVariance.OUT, type);
        }

        @NotNull
        public final t c() {
            return t.f218026d;
        }

        @dd.o
        @NotNull
        public final t e(@NotNull r type) {
            G.p(type, "type");
            return new t(KVariance.INVARIANT, type);
        }

        public a(C4969v c4969v) {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218029a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f218029a = iArr;
        }
    }

    public t(@Nullable KVariance kVariance, @Nullable r rVar) {
        String str;
        this.f218027a = kVariance;
        this.f218028b = rVar;
        if ((kVariance == null) == (rVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @dd.o
    @NotNull
    public static final t c(@NotNull r rVar) {
        return f218025c.a(rVar);
    }

    public static t e(t tVar, KVariance kVariance, r rVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVariance = tVar.f218027a;
        }
        if ((i10 & 2) != 0) {
            rVar = tVar.f218028b;
        }
        tVar.getClass();
        return new t(kVariance, rVar);
    }

    @dd.o
    @NotNull
    public static final t f(@NotNull r rVar) {
        return f218025c.b(rVar);
    }

    @dd.o
    @NotNull
    public static final t i(@NotNull r rVar) {
        return f218025c.e(rVar);
    }

    @Nullable
    public final KVariance a() {
        return this.f218027a;
    }

    @Nullable
    public final r b() {
        return this.f218028b;
    }

    @NotNull
    public final t d(@Nullable KVariance kVariance, @Nullable r rVar) {
        return new t(kVariance, rVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f218027a == tVar.f218027a && G.g(this.f218028b, tVar.f218028b);
    }

    @Nullable
    public final r g() {
        return this.f218028b;
    }

    @Nullable
    public final KVariance h() {
        return this.f218027a;
    }

    public int hashCode() {
        KVariance kVariance = this.f218027a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        r rVar = this.f218028b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        KVariance kVariance = this.f218027a;
        int i10 = kVariance == null ? -1 : b.f218029a[kVariance.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f218028b);
        }
        if (i10 == 2) {
            return "in " + this.f218028b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f218028b;
    }
}
