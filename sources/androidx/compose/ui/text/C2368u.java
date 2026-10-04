package androidx.compose.ui.text;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2368u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105069d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2370w f105070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105072c;

    public C2368u(@NotNull InterfaceC2370w interfaceC2370w, int i10, int i11) {
        this.f105070a = interfaceC2370w;
        this.f105071b = i10;
        this.f105072c = i11;
    }

    public static C2368u e(C2368u c2368u, InterfaceC2370w interfaceC2370w, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            interfaceC2370w = c2368u.f105070a;
        }
        if ((i12 & 2) != 0) {
            i10 = c2368u.f105071b;
        }
        if ((i12 & 4) != 0) {
            i11 = c2368u.f105072c;
        }
        c2368u.getClass();
        return new C2368u(interfaceC2370w, i10, i11);
    }

    @NotNull
    public final InterfaceC2370w a() {
        return this.f105070a;
    }

    public final int b() {
        return this.f105071b;
    }

    public final int c() {
        return this.f105072c;
    }

    @NotNull
    public final C2368u d(@NotNull InterfaceC2370w interfaceC2370w, int i10, int i11) {
        return new C2368u(interfaceC2370w, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2368u)) {
            return false;
        }
        C2368u c2368u = (C2368u) obj;
        return kotlin.jvm.internal.G.g(this.f105070a, c2368u.f105070a) && this.f105071b == c2368u.f105071b && this.f105072c == c2368u.f105072c;
    }

    public final int f() {
        return this.f105072c;
    }

    @NotNull
    public final InterfaceC2370w g() {
        return this.f105070a;
    }

    public final int h() {
        return this.f105071b;
    }

    public int hashCode() {
        return (((this.f105070a.hashCode() * 31) + this.f105071b) * 31) + this.f105072c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f105070a);
        sb2.append(", startIndex=");
        sb2.append(this.f105071b);
        sb2.append(", endIndex=");
        return C1477d.a(sb2, this.f105072c, ')');
    }
}
