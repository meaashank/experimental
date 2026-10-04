package androidx.compose.ui.text.input;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2354x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104847b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104848c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104849d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104850e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104851f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104852g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104853h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104854i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f104855j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f104856k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f104857l = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104858a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.x$a */
    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @T1
        public static /* synthetic */ void f() {
        }

        @T1
        public static /* synthetic */ void h() {
        }

        @T1
        public static /* synthetic */ void j() {
        }

        @T1
        public static /* synthetic */ void l() {
        }

        @T1
        public static /* synthetic */ void n() {
        }

        @T1
        public static /* synthetic */ void p() {
        }

        @T1
        public static /* synthetic */ void r() {
        }

        @T1
        public static /* synthetic */ void t() {
        }

        public final int a() {
            return C2354x.f104850e;
        }

        public final int c() {
            return C2354x.f104857l;
        }

        public final int e() {
            return C2354x.f104854i;
        }

        public final int g() {
            return C2354x.f104851f;
        }

        public final int i() {
            return C2354x.f104856k;
        }

        public final int k() {
            return C2354x.f104855j;
        }

        public final int m() {
            return C2354x.f104852g;
        }

        public final int o() {
            return C2354x.f104849d;
        }

        public final int q() {
            return C2354x.f104848c;
        }

        public final int s() {
            return C2354x.f104853h;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2354x(int i10) {
        this.f104858a = i10;
    }

    public static final /* synthetic */ C2354x k(int i10) {
        return new C2354x(i10);
    }

    public static int l(int i10) {
        return i10;
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof C2354x) && i10 == ((C2354x) obj).f104858a;
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return i10;
    }

    @NotNull
    public static String p(int i10) {
        return i10 == f104848c ? "Unspecified" : i10 == f104849d ? "Text" : i10 == f104850e ? "Ascii" : i10 == f104851f ? "Number" : i10 == f104852g ? "Phone" : i10 == f104853h ? "Uri" : i10 == f104854i ? "Email" : i10 == f104855j ? "Password" : i10 == f104856k ? "NumberPassword" : i10 == f104857l ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f104858a, obj);
    }

    public int hashCode() {
        return this.f104858a;
    }

    public final /* synthetic */ int q() {
        return this.f104858a;
    }

    @NotNull
    public String toString() {
        return p(this.f104858a);
    }
}
