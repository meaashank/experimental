package kotlin.random;

import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class XorWowRandom extends Random implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f218010i = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f218015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f218016h;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public XorWowRandom(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f218011c = i10;
        this.f218012d = i11;
        this.f218013e = i12;
        this.f218014f = i13;
        this.f218015g = i14;
        this.f218016h = i15;
        v();
        for (int i16 = 0; i16 < 64; i16++) {
            p();
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            v();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            G.o(thInitCause, "initCause(...)");
            throw thInitCause;
        }
    }

    @Override // kotlin.random.Random
    public int e(int i10) {
        return d.j(p(), i10);
    }

    @Override // kotlin.random.Random
    public int p() {
        int i10 = this.f218011c;
        int i11 = i10 ^ (i10 >>> 2);
        this.f218011c = this.f218012d;
        this.f218012d = this.f218013e;
        this.f218013e = this.f218014f;
        int i12 = this.f218015g;
        this.f218014f = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f218015g = i13;
        int i14 = this.f218016h + 362437;
        this.f218016h = i14;
        return i13 + i14;
    }

    public final void v() {
        if ((this.f218011c | this.f218012d | this.f218013e | this.f218014f | this.f218015g) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    public XorWowRandom(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
