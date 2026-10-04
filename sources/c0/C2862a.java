package c0;

import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class C2862a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f126023g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f126025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f126027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f126028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f126029f;

    public C2862a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f126024a = i10;
        this.f126025b = i11;
        this.f126026c = i12;
        this.f126027d = i13;
        this.f126028e = i14;
        this.f126029f = i15;
    }

    public static C2862a h(C2862a c2862a, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = c2862a.f126024a;
        }
        if ((i16 & 2) != 0) {
            i11 = c2862a.f126025b;
        }
        if ((i16 & 4) != 0) {
            i12 = c2862a.f126026c;
        }
        if ((i16 & 8) != 0) {
            i13 = c2862a.f126027d;
        }
        if ((i16 & 16) != 0) {
            i14 = c2862a.f126028e;
        }
        if ((i16 & 32) != 0) {
            i15 = c2862a.f126029f;
        }
        int i17 = i15;
        c2862a.getClass();
        int i18 = i14;
        int i19 = i12;
        return new C2862a(i10, i11, i19, i13, i18, i17);
    }

    public final int a() {
        return this.f126024a;
    }

    public final int b() {
        return this.f126025b;
    }

    public final int c() {
        return this.f126026c;
    }

    public final int d() {
        return this.f126027d;
    }

    public final int e() {
        return this.f126028e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2862a)) {
            return false;
        }
        C2862a c2862a = (C2862a) obj;
        return this.f126024a == c2862a.f126024a && this.f126025b == c2862a.f126025b && this.f126026c == c2862a.f126026c && this.f126027d == c2862a.f126027d && this.f126028e == c2862a.f126028e && this.f126029f == c2862a.f126029f;
    }

    public final int f() {
        return this.f126029f;
    }

    @NotNull
    public final C2862a g(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new C2862a(i10, i11, i12, i13, i14, i15);
    }

    public int hashCode() {
        return (((((((((this.f126024a * 31) + this.f126025b) * 31) + this.f126026c) * 31) + this.f126027d) * 31) + this.f126028e) * 31) + this.f126029f;
    }

    public final int i() {
        return this.f126029f;
    }

    public final int j() {
        return this.f126025b;
    }

    public final int k() {
        return this.f126026c;
    }

    public final int l() {
        return this.f126028e;
    }

    public final int m() {
        return this.f126024a;
    }

    public final int n() {
        return this.f126027d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Segment(startOffset=");
        sb2.append(this.f126024a);
        sb2.append(", endOffset=");
        sb2.append(this.f126025b);
        sb2.append(", left=");
        sb2.append(this.f126026c);
        sb2.append(", top=");
        sb2.append(this.f126027d);
        sb2.append(", right=");
        sb2.append(this.f126028e);
        sb2.append(", bottom=");
        return C1477d.a(sb2, this.f126029f, ')');
    }
}
