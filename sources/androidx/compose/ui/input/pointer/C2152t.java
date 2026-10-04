package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2152t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102323b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102324c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102325d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102326e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102327f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102328g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f102329h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f102330i = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102331a;

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.t$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2152t.f102328g;
        }

        public final int b() {
            return C2152t.f102329h;
        }

        public final int c() {
            return C2152t.f102327f;
        }

        public final int d() {
            return C2152t.f102325d;
        }

        public final int e() {
            return C2152t.f102326e;
        }

        public final int f() {
            return C2152t.f102330i;
        }

        public final int g() {
            return C2152t.f102324c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2152t(int i10) {
        this.f102331a = i10;
    }

    public static final /* synthetic */ C2152t h(int i10) {
        return new C2152t(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof C2152t) && i10 == ((C2152t) obj).f102331a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return i10;
    }

    @NotNull
    public static String m(int i10) {
        return i10 == f102325d ? "Press" : i10 == f102326e ? "Release" : i10 == f102327f ? "Move" : i10 == f102328g ? "Enter" : i10 == f102329h ? "Exit" : i10 == f102330i ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f102331a, obj);
    }

    public int hashCode() {
        return this.f102331a;
    }

    public final /* synthetic */ int n() {
        return this.f102331a;
    }

    @NotNull
    public String toString() {
        return m(this.f102331a);
    }
}
