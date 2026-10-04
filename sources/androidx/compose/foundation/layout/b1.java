package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90873c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90874d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90875e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90876f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f90879i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f90880j = 32;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f90882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f90883m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f90872b = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f90877g = 8 | 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f90878h = 4 | 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90884n = 16 | 32;

    public static final class a {
        public a() {
        }

        public final int a() {
            return b1.f90873c;
        }

        public final int b() {
            return b1.f90875e;
        }

        public final int c() {
            return b1.f90874d;
        }

        public final int d() {
            return b1.f90876f;
        }

        public final int e() {
            return b1.f90880j;
        }

        public final int f() {
            return b1.f90878h;
        }

        public final int g() {
            return b1.f90883m;
        }

        public final int h() {
            return b1.f90881k;
        }

        public final int i() {
            return b1.f90882l;
        }

        public final int j() {
            return b1.f90877g;
        }

        public final int k() {
            return b1.f90879i;
        }

        public final int l() {
            return b1.f90884n;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        int i10 = 8 | 2;
        f90881k = i10;
        int i11 = 4 | 1;
        f90882l = i11;
        f90883m = i10 | i11;
    }

    public /* synthetic */ b1(int i10) {
        this.f90885a = i10;
    }

    public static final /* synthetic */ b1 m(int i10) {
        return new b1(i10);
    }

    public static int n(int i10) {
        return i10;
    }

    public static boolean o(int i10, Object obj) {
        return (obj instanceof b1) && i10 == ((b1) obj).f90885a;
    }

    public static final boolean p(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean q(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int r(int i10) {
        return i10;
    }

    public static final int s(int i10, int i11) {
        return i10 | i11;
    }

    @NotNull
    public static String t(int i10) {
        return "WindowInsetsSides(" + v(i10) + ')';
    }

    public static final String v(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f90877g;
        if ((i10 & i11) == i11) {
            w(sb2, "Start");
        }
        int i12 = f90881k;
        if ((i10 & i12) == i12) {
            w(sb2, "Left");
        }
        int i13 = f90879i;
        if ((i10 & i13) == i13) {
            w(sb2, "Top");
        }
        int i14 = f90878h;
        if ((i10 & i14) == i14) {
            w(sb2, "End");
        }
        int i15 = f90882l;
        if ((i10 & i15) == i15) {
            w(sb2, "Right");
        }
        int i16 = f90880j;
        if ((i10 & i16) == i16) {
            w(sb2, "Bottom");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void w(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append(SignatureVisitor.EXTENDS);
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return o(this.f90885a, obj);
    }

    public int hashCode() {
        return this.f90885a;
    }

    @NotNull
    public String toString() {
        return t(this.f90885a);
    }

    public final /* synthetic */ int u() {
        return this.f90885a;
    }
}
