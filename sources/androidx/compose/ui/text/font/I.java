package androidx.compose.ui.text.font;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104531b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104532c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104533d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104534e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104535f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104536a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return I.f104533d;
        }

        public final int b() {
            return I.f104532c;
        }

        public final int c() {
            return I.f104535f;
        }

        public final int d() {
            return I.f104534e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ I(int i10) {
        this.f104536a = i10;
    }

    public static final /* synthetic */ I e(int i10) {
        return new I(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof I) && i10 == ((I) obj).f104536a;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    public static final boolean j(int i10) {
        return i10 == f104533d || i10 == f104535f;
    }

    public static final boolean k(int i10) {
        return i10 == f104533d || i10 == f104534e;
    }

    @NotNull
    public static String l(int i10) {
        return i10 == f104532c ? "None" : i10 == f104533d ? "All" : i10 == f104534e ? "Weight" : i10 == f104535f ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f104536a, obj);
    }

    public int hashCode() {
        return this.f104536a;
    }

    public final /* synthetic */ int m() {
        return this.f104536a;
    }

    @NotNull
    public String toString() {
        return l(this.f104536a);
    }
}
