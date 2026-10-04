package androidx.compose.ui.text;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104218b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104219c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104220d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104221e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104222f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104223g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104224h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104225i = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104226a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return C.f104219c;
        }

        public final int b() {
            return C.f104221e;
        }

        public final int c() {
            return C.f104222f;
        }

        public final int d() {
            return C.f104224h;
        }

        public final int e() {
            return C.f104225i;
        }

        public final int f() {
            return C.f104223g;
        }

        public final int g() {
            return C.f104220d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C(int i10) {
        this.f104226a = i10;
    }

    public static final /* synthetic */ C h(int i10) {
        return new C(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof C) && i10 == ((C) obj).f104226a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return i10;
    }

    @NotNull
    public static String m(int i10) {
        return i10 == f104219c ? "AboveBaseline" : i10 == f104220d ? "Top" : i10 == f104221e ? "Bottom" : i10 == f104222f ? "Center" : i10 == f104223g ? "TextTop" : i10 == f104224h ? "TextBottom" : i10 == f104225i ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f104226a, obj);
    }

    public int hashCode() {
        return this.f104226a;
    }

    public final /* synthetic */ int n() {
        return this.f104226a;
    }

    @NotNull
    public String toString() {
        return m(this.f104226a);
    }
}
