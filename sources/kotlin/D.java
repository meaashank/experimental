package kotlin;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public final class D implements Comparable<D> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f217445f = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f217449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f217450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f217444e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final D f217446g = E.a();

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public D(int i10, int i11, int i12) {
        this.f217447a = i10;
        this.f217448b = i11;
        this.f217449c = i12;
        this.f217450d = g(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull D other) {
        kotlin.jvm.internal.G.p(other, "other");
        return this.f217450d - other.f217450d;
    }

    public final int b() {
        return this.f217447a;
    }

    public final int c() {
        return this.f217448b;
    }

    public final int d() {
        return this.f217449c;
    }

    public final boolean e(int i10, int i11) {
        int i12 = this.f217447a;
        if (i12 <= i10) {
            return i12 == i10 && this.f217448b >= i11;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        D d10 = obj instanceof D ? (D) obj : null;
        return d10 != null && this.f217450d == d10.f217450d;
    }

    public final boolean f(int i10, int i11, int i12) {
        int i13 = this.f217447a;
        if (i13 > i10) {
            return true;
        }
        if (i13 != i10) {
            return false;
        }
        int i14 = this.f217448b;
        if (i14 <= i11) {
            return i14 == i11 && this.f217449c >= i12;
        }
        return true;
    }

    public final int g(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public int hashCode() {
        return this.f217450d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f217447a);
        sb2.append('.');
        sb2.append(this.f217448b);
        sb2.append('.');
        sb2.append(this.f217449c);
        return sb2.toString();
    }

    public D(int i10, int i11) {
        this(i10, i11, 0);
    }
}
