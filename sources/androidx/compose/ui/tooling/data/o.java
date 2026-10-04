package androidx.compose.ui.tooling.data;

import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105410f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f105414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105415e;

    public o(int i10, int i11, int i12, @Nullable String str, int i13) {
        this.f105411a = i10;
        this.f105412b = i11;
        this.f105413c = i12;
        this.f105414d = str;
        this.f105415e = i13;
    }

    public static o g(o oVar, int i10, int i11, int i12, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = oVar.f105411a;
        }
        if ((i14 & 2) != 0) {
            i11 = oVar.f105412b;
        }
        if ((i14 & 4) != 0) {
            i12 = oVar.f105413c;
        }
        if ((i14 & 8) != 0) {
            str = oVar.f105414d;
        }
        if ((i14 & 16) != 0) {
            i13 = oVar.f105415e;
        }
        int i15 = i13;
        oVar.getClass();
        int i16 = i12;
        return new o(i10, i11, i16, str, i15);
    }

    public final int a() {
        return this.f105411a;
    }

    public final int b() {
        return this.f105412b;
    }

    public final int c() {
        return this.f105413c;
    }

    @Nullable
    public final String d() {
        return this.f105414d;
    }

    public final int e() {
        return this.f105415e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f105411a == oVar.f105411a && this.f105412b == oVar.f105412b && this.f105413c == oVar.f105413c && G.g(this.f105414d, oVar.f105414d) && this.f105415e == oVar.f105415e;
    }

    @NotNull
    public final o f(int i10, int i11, int i12, @Nullable String str, int i13) {
        return new o(i10, i11, i12, str, i13);
    }

    public final int h() {
        return this.f105413c;
    }

    public int hashCode() {
        int i10 = ((((this.f105411a * 31) + this.f105412b) * 31) + this.f105413c) * 31;
        String str = this.f105414d;
        return ((i10 + (str == null ? 0 : str.hashCode())) * 31) + this.f105415e;
    }

    public final int i() {
        return this.f105411a;
    }

    public final int j() {
        return this.f105412b;
    }

    public final int k() {
        return this.f105415e;
    }

    @Nullable
    public final String l() {
        return this.f105414d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SourceLocation(lineNumber=");
        sb2.append(this.f105411a);
        sb2.append(", offset=");
        sb2.append(this.f105412b);
        sb2.append(", length=");
        sb2.append(this.f105413c);
        sb2.append(", sourceFile=");
        sb2.append(this.f105414d);
        sb2.append(", packageHash=");
        return C1477d.a(sb2, this.f105415e, ')');
    }
}
