package kotlin.time;

import androidx.activity.C1477d;
import com.prism.gaia.helper.utils.l;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f218385h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f218388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f218389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f218390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f218391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f218392g;

    public static final class a {
        public a() {
        }

        @NotNull
        public final H a(@NotNull Instant instant) {
            long j10;
            kotlin.jvm.internal.G.p(instant, "instant");
            long j11 = instant.f218396a;
            long j12 = j11 / 86400;
            long j13 = 0;
            if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
                j12--;
            }
            long j14 = j11 % 86400;
            int i10 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
            long j15 = (j12 + ((long) w.f218449f)) - ((long) 60);
            if (j15 < 0) {
                long j16 = w.f218448e;
                long j17 = ((j15 + 1) / j16) - 1;
                j10 = 0;
                j13 = ((long) 400) * j17;
                j15 += (-j17) * j16;
            } else {
                j10 = 0;
            }
            long j18 = 400;
            long j19 = ((j18 * j15) + ((long) 591)) / ((long) w.f218448e);
            long j20 = l.b.f165186t;
            long j21 = 4;
            long j22 = 100;
            long j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
            if (j23 < j10) {
                j19--;
                j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
            }
            int i11 = (int) j23;
            int i12 = ((i11 * 5) + 2) / 153;
            int i13 = i10 / 3600;
            int i14 = i10 - (i13 * 3600);
            int i15 = i14 / 60;
            return new H((int) (j19 + j13 + ((long) (i12 / 10))), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1, i13, i15, i14 - (i15 * 60), instant.f218397b);
        }

        public a(C4969v c4969v) {
        }
    }

    public H(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f218386a = i10;
        this.f218387b = i11;
        this.f218388c = i12;
        this.f218389d = i13;
        this.f218390e = i14;
        this.f218391f = i15;
        this.f218392g = i16;
    }

    public final int a() {
        return this.f218388c;
    }

    public final int b() {
        return this.f218389d;
    }

    public final int c() {
        return this.f218390e;
    }

    public final int d() {
        return this.f218387b;
    }

    public final int e() {
        return this.f218392g;
    }

    public final int f() {
        return this.f218391f;
    }

    public final int g() {
        return this.f218386a;
    }

    public final <T> T h(int i10, @NotNull ed.p<? super Long, ? super Integer, ? extends T> buildInstant) {
        kotlin.jvm.internal.G.p(buildInstant, "buildInstant");
        int i11 = this.f218386a;
        long j10 = i11;
        long j11 = ((long) l.b.f165186t) * j10;
        long j12 = j10 >= 0 ? ((j10 + ((long) 399)) / ((long) 400)) + (((((long) 3) + j10) / ((long) 4)) - ((((long) 99) + j10) / ((long) 100))) + j11 : j11 - ((j10 / ((long) (-400))) + ((j10 / ((long) (-4))) - (j10 / ((long) (-100)))));
        long j13 = j12 + ((long) (((r3 * 367) - 362) / 12)) + ((long) (this.f218388c - 1));
        if (this.f218387b > 2) {
            j13 = !w.p(i11) ? j13 - 2 : (-1) + j13;
        }
        return buildInstant.invoke(Long.valueOf((((j13 - ((long) w.f218449f)) * ((long) 86400)) + ((long) (((this.f218390e * 60) + (this.f218389d * 3600)) + this.f218391f))) - ((long) i10)), Integer.valueOf(this.f218392g));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnboundLocalDateTime(");
        sb2.append(this.f218386a);
        sb2.append(SignatureVisitor.SUPER);
        sb2.append(this.f218387b);
        sb2.append(SignatureVisitor.SUPER);
        sb2.append(this.f218388c);
        sb2.append(' ');
        sb2.append(this.f218389d);
        sb2.append(':');
        sb2.append(this.f218390e);
        sb2.append(':');
        sb2.append(this.f218391f);
        sb2.append('.');
        return C1477d.a(sb2, this.f218392g, ')');
    }
}
