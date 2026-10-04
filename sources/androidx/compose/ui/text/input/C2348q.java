package androidx.compose.ui.text.input;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2348q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104819b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104820c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104821d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104822e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104823f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104824g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104825h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104826i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f104827j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f104828k = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104829a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.q$a */
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

        public final int a() {
            return C2348q.f104821d;
        }

        public final int c() {
            return C2348q.f104828k;
        }

        public final int e() {
            return C2348q.f104823f;
        }

        public final int g() {
            return C2348q.f104827j;
        }

        public final int i() {
            return C2348q.f104822e;
        }

        public final int k() {
            return C2348q.f104826i;
        }

        public final int m() {
            return C2348q.f104824g;
        }

        public final int o() {
            return C2348q.f104825h;
        }

        public final int q() {
            return C2348q.f104820c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2348q(int i10) {
        this.f104829a = i10;
    }

    public static final /* synthetic */ C2348q j(int i10) {
        return new C2348q(i10);
    }

    public static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof C2348q) && i10 == ((C2348q) obj).f104829a;
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return i10;
    }

    @NotNull
    public static String o(int i10) {
        return i10 == f104820c ? "Unspecified" : i10 == f104822e ? "None" : i10 == f104821d ? H2.d.f45452a : i10 == f104823f ? "Go" : i10 == f104824g ? "Search" : i10 == f104825h ? "Send" : i10 == f104826i ? "Previous" : i10 == f104827j ? "Next" : i10 == f104828k ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f104829a, obj);
    }

    public int hashCode() {
        return this.f104829a;
    }

    public final /* synthetic */ int p() {
        return this.f104829a;
    }

    @NotNull
    public String toString() {
        return o(this.f104829a);
    }
}
