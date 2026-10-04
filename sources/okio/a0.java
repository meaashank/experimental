package okio;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f225911h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f225912i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f225913j = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final byte[] f225914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public int f225915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public int f225916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public boolean f225917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public boolean f225918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @Nullable
    public a0 f225919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dd.g
    @Nullable
    public a0 f225920g;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public a0() {
        this.f225914a = new byte[8192];
        this.f225918e = true;
        this.f225917d = false;
    }

    public final void a() {
        int i10;
        a0 a0Var = this.f225920g;
        if (a0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.G.m(a0Var);
        if (a0Var.f225918e) {
            int i11 = this.f225916c - this.f225915b;
            a0 a0Var2 = this.f225920g;
            kotlin.jvm.internal.G.m(a0Var2);
            int i12 = 8192 - a0Var2.f225916c;
            a0 a0Var3 = this.f225920g;
            kotlin.jvm.internal.G.m(a0Var3);
            if (a0Var3.f225917d) {
                i10 = 0;
            } else {
                a0 a0Var4 = this.f225920g;
                kotlin.jvm.internal.G.m(a0Var4);
                i10 = a0Var4.f225915b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            a0 a0Var5 = this.f225920g;
            kotlin.jvm.internal.G.m(a0Var5);
            g(a0Var5, i11);
            b();
            b0.d(this);
        }
    }

    @Nullable
    public final a0 b() {
        a0 a0Var = this.f225919f;
        if (a0Var == this) {
            a0Var = null;
        }
        a0 a0Var2 = this.f225920g;
        kotlin.jvm.internal.G.m(a0Var2);
        a0Var2.f225919f = this.f225919f;
        a0 a0Var3 = this.f225919f;
        kotlin.jvm.internal.G.m(a0Var3);
        a0Var3.f225920g = this.f225920g;
        this.f225919f = null;
        this.f225920g = null;
        return a0Var;
    }

    @NotNull
    public final a0 c(@NotNull a0 segment) {
        kotlin.jvm.internal.G.p(segment, "segment");
        segment.f225920g = this;
        segment.f225919f = this.f225919f;
        a0 a0Var = this.f225919f;
        kotlin.jvm.internal.G.m(a0Var);
        a0Var.f225920g = segment;
        this.f225919f = segment;
        return segment;
    }

    @NotNull
    public final a0 d() {
        this.f225917d = true;
        return new a0(this.f225914a, this.f225915b, this.f225916c, true, false);
    }

    @NotNull
    public final a0 e(int i10) {
        a0 a0VarE;
        if (i10 <= 0 || i10 > this.f225916c - this.f225915b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            a0VarE = d();
        } else {
            a0VarE = b0.e();
            byte[] bArr = this.f225914a;
            byte[] bArr2 = a0VarE.f225914a;
            int i11 = this.f225915b;
            C4875q.E0(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        a0VarE.f225916c = a0VarE.f225915b + i10;
        this.f225915b += i10;
        a0 a0Var = this.f225920g;
        kotlin.jvm.internal.G.m(a0Var);
        a0Var.c(a0VarE);
        return a0VarE;
    }

    @NotNull
    public final a0 f() {
        byte[] bArr = this.f225914a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(this, size)");
        return new a0(bArrCopyOf, this.f225915b, this.f225916c, false, true);
    }

    public final void g(@NotNull a0 sink, int i10) {
        kotlin.jvm.internal.G.p(sink, "sink");
        if (!sink.f225918e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f225916c;
        if (i11 + i10 > 8192) {
            if (sink.f225917d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f225915b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f225914a;
            C4875q.E0(bArr, bArr, 0, i12, i11, 2, null);
            sink.f225916c -= sink.f225915b;
            sink.f225915b = 0;
        }
        byte[] bArr2 = this.f225914a;
        byte[] bArr3 = sink.f225914a;
        int i13 = sink.f225916c;
        int i14 = this.f225915b;
        C4875q.v0(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f225916c += i10;
        this.f225915b += i10;
    }

    public a0(@NotNull byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(data, "data");
        this.f225914a = data;
        this.f225915b = i10;
        this.f225916c = i11;
        this.f225917d = z10;
        this.f225918e = z11;
    }
}
