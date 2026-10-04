package androidx.compose.ui.layout;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public interface InterfaceC2171i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f102572a = a.f102573a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f102573a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102574b = new C0254a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102575c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102576d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102577e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102578f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final C2178m f102579g = new C2178m(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final InterfaceC2171i f102580h = new b();

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$a, reason: collision with other inner class name */
        public static final class C0254a implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                float f10 = C2173j.f(j10, j11);
                return D0.a(f10, f10);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$b */
        public static final class b implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                return D0.a(C2173j.h(j10, j11), C2173j.e(j10, j11));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$c */
        public static final class c implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                float fE = C2173j.e(j10, j11);
                return D0.a(fE, fE);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$d */
        public static final class d implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                float fH = C2173j.h(j10, j11);
                return D0.a(fH, fH);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$e */
        public static final class e implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                float fG = C2173j.g(j10, j11);
                return D0.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i$a$f */
        public static final class f implements InterfaceC2171i {
            @Override // androidx.compose.ui.layout.InterfaceC2171i
            public long a(long j10, long j11) {
                if (P.n.t(j10) <= P.n.t(j11) && P.n.m(j10) <= P.n.m(j11)) {
                    return D0.a(1.0f, 1.0f);
                }
                float fG = C2173j.g(j10, j11);
                return D0.a(fG, fG);
            }
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

        @NotNull
        public final InterfaceC2171i a() {
            return f102574b;
        }

        @NotNull
        public final InterfaceC2171i c() {
            return f102580h;
        }

        @NotNull
        public final InterfaceC2171i e() {
            return f102576d;
        }

        @NotNull
        public final InterfaceC2171i g() {
            return f102577e;
        }

        @NotNull
        public final InterfaceC2171i i() {
            return f102575c;
        }

        @NotNull
        public final InterfaceC2171i k() {
            return f102578f;
        }

        @NotNull
        public final C2178m m() {
            return f102579g;
        }
    }

    long a(long j10, long j11);
}
