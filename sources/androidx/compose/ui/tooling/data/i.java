package androidx.compose.ui.tooling.data;

import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105380h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f105382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f105384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f105385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f105386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f105387g;

    public i(@NotNull String str, @Nullable Object obj, boolean z10, boolean z11, boolean z12, @Nullable String str2, boolean z13) {
        this.f105381a = str;
        this.f105382b = obj;
        this.f105383c = z10;
        this.f105384d = z11;
        this.f105385e = z12;
        this.f105386f = str2;
        this.f105387g = z13;
    }

    public static i i(i iVar, String str, Object obj, boolean z10, boolean z11, boolean z12, String str2, boolean z13, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = iVar.f105381a;
        }
        if ((i10 & 2) != 0) {
            obj = iVar.f105382b;
        }
        if ((i10 & 4) != 0) {
            z10 = iVar.f105383c;
        }
        if ((i10 & 8) != 0) {
            z11 = iVar.f105384d;
        }
        if ((i10 & 16) != 0) {
            z12 = iVar.f105385e;
        }
        if ((i10 & 32) != 0) {
            str2 = iVar.f105386f;
        }
        if ((i10 & 64) != 0) {
            z13 = iVar.f105387g;
        }
        boolean z14 = z13;
        iVar.getClass();
        String str3 = str2;
        boolean z15 = z12;
        boolean z16 = z10;
        return new i(str, obj, z16, z11, z15, str3, z14);
    }

    @NotNull
    public final String a() {
        return this.f105381a;
    }

    @Nullable
    public final Object b() {
        return this.f105382b;
    }

    public final boolean c() {
        return this.f105383c;
    }

    public final boolean d() {
        return this.f105384d;
    }

    public final boolean e() {
        return this.f105385e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return G.g(this.f105381a, iVar.f105381a) && G.g(this.f105382b, iVar.f105382b) && this.f105383c == iVar.f105383c && this.f105384d == iVar.f105384d && this.f105385e == iVar.f105385e && G.g(this.f105386f, iVar.f105386f) && this.f105387g == iVar.f105387g;
    }

    @Nullable
    public final String f() {
        return this.f105386f;
    }

    public final boolean g() {
        return this.f105387g;
    }

    @NotNull
    public final i h(@NotNull String str, @Nullable Object obj, boolean z10, boolean z11, boolean z12, @Nullable String str2, boolean z13) {
        return new i(str, obj, z10, z11, z12, str2, z13);
    }

    public int hashCode() {
        int iHashCode = this.f105381a.hashCode() * 31;
        Object obj = this.f105382b;
        int iA = (C1635o.a(this.f105385e) + ((C1635o.a(this.f105384d) + ((C1635o.a(this.f105383c) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.f105386f;
        return C1635o.a(this.f105387g) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean j() {
        return this.f105385e;
    }

    public final boolean k() {
        return this.f105383c;
    }

    @Nullable
    public final String l() {
        return this.f105386f;
    }

    @NotNull
    public final String m() {
        return this.f105381a;
    }

    public final boolean n() {
        return this.f105387g;
    }

    public final boolean o() {
        return this.f105384d;
    }

    @Nullable
    public final Object p() {
        return this.f105382b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParameterInformation(name=");
        sb2.append(this.f105381a);
        sb2.append(", value=");
        sb2.append(this.f105382b);
        sb2.append(", fromDefault=");
        sb2.append(this.f105383c);
        sb2.append(", static=");
        sb2.append(this.f105384d);
        sb2.append(", compared=");
        sb2.append(this.f105385e);
        sb2.append(", inlineClass=");
        sb2.append(this.f105386f);
        sb2.append(", stable=");
        return C1636p.a(sb2, this.f105387g, ')');
    }
}
