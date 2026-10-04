package k0;

import androidx.activity.C1477d;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f214332f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f214334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f214335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f214336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f214337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f214331e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final v f214333g = new v(0, 0, 0, 0);

    public static final class a {
        public a() {
        }

        @NotNull
        public final v a() {
            return v.f214333g;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }
    }

    public v(int i10, int i11, int i12, int i13) {
        this.f214334a = i10;
        this.f214335b = i11;
        this.f214336c = i12;
        this.f214337d = i13;
    }

    public static v h(v vVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = vVar.f214334a;
        }
        if ((i14 & 2) != 0) {
            i11 = vVar.f214335b;
        }
        if ((i14 & 4) != 0) {
            i12 = vVar.f214336c;
        }
        if ((i14 & 8) != 0) {
            i13 = vVar.f214337d;
        }
        vVar.getClass();
        return new v(i10, i11, i12, i13);
    }

    public final int B() {
        return this.f214335b;
    }

    public final long D() {
        return u.a((G() / 2) + this.f214334a, this.f214335b);
    }

    public final long E() {
        return u.a(this.f214334a, this.f214335b);
    }

    public final long F() {
        return u.a(this.f214336c, this.f214335b);
    }

    public final int G() {
        return this.f214336c - this.f214334a;
    }

    @T1
    @NotNull
    public final v I(int i10) {
        return new v(this.f214334a - i10, this.f214335b - i10, this.f214336c + i10, this.f214337d + i10);
    }

    @T1
    @NotNull
    public final v J(@NotNull v vVar) {
        return new v(Math.max(this.f214334a, vVar.f214334a), Math.max(this.f214335b, vVar.f214335b), Math.min(this.f214336c, vVar.f214336c), Math.min(this.f214337d, vVar.f214337d));
    }

    public final boolean K() {
        return this.f214334a >= this.f214336c || this.f214335b >= this.f214337d;
    }

    public final boolean M(@NotNull v vVar) {
        return this.f214336c > vVar.f214334a && vVar.f214336c > this.f214334a && this.f214337d > vVar.f214335b && vVar.f214337d > this.f214335b;
    }

    @T1
    @NotNull
    public final v N(int i10, int i11) {
        return new v(this.f214334a + i10, this.f214335b + i11, this.f214336c + i10, this.f214337d + i11);
    }

    @T1
    @NotNull
    public final v O(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = this.f214334a + i10;
        int i12 = this.f214335b;
        int i13 = (int) (j10 & ZipKt.f225990j);
        return new v(i11, i12 + i13, this.f214336c + i10, this.f214337d + i13);
    }

    public final int b() {
        return this.f214334a;
    }

    public final int c() {
        return this.f214335b;
    }

    public final int d() {
        return this.f214336c;
    }

    public final int e() {
        return this.f214337d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f214334a == vVar.f214334a && this.f214335b == vVar.f214335b && this.f214336c == vVar.f214336c && this.f214337d == vVar.f214337d;
    }

    public final boolean f(long j10) {
        int i10;
        int i11 = (int) (j10 >> 32);
        return i11 >= this.f214334a && i11 < this.f214336c && (i10 = (int) (j10 & ZipKt.f225990j)) >= this.f214335b && i10 < this.f214337d;
    }

    @NotNull
    public final v g(int i10, int i11, int i12, int i13) {
        return new v(i10, i11, i12, i13);
    }

    public int hashCode() {
        return (((((this.f214334a * 31) + this.f214335b) * 31) + this.f214336c) * 31) + this.f214337d;
    }

    @T1
    @NotNull
    public final v i(int i10) {
        return I(-i10);
    }

    public final int j() {
        return this.f214337d;
    }

    public final long l() {
        return u.a((G() / 2) + this.f214334a, this.f214337d);
    }

    public final long m() {
        return u.a(this.f214334a, this.f214337d);
    }

    public final long n() {
        return u.a(this.f214336c, this.f214337d);
    }

    public final long o() {
        return u.a((G() / 2) + this.f214334a, (r() / 2) + this.f214335b);
    }

    public final long p() {
        return u.a(this.f214334a, (r() / 2) + this.f214335b);
    }

    public final long q() {
        return u.a(this.f214336c, (r() / 2) + this.f214335b);
    }

    public final int r() {
        return this.f214337d - this.f214335b;
    }

    public final int t() {
        return this.f214334a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f214334a);
        sb2.append(U6.j.f68738d);
        sb2.append(this.f214335b);
        sb2.append(U6.j.f68738d);
        sb2.append(this.f214336c);
        sb2.append(U6.j.f68738d);
        return C1477d.a(sb2, this.f214337d, ')');
    }

    public final int v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final int w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final int x() {
        return this.f214336c;
    }

    public final long z() {
        return y.a(G(), r());
    }

    @T1
    public static /* synthetic */ void A() {
    }

    @T1
    public static /* synthetic */ void C() {
    }

    @T1
    public static /* synthetic */ void H() {
    }

    @T1
    public static /* synthetic */ void L() {
    }

    @T1
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void s() {
    }

    @T1
    public static /* synthetic */ void u() {
    }

    @T1
    public static /* synthetic */ void y() {
    }
}
