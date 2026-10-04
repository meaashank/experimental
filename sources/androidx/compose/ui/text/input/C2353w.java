package androidx.compose.ui.text.input;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2353w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104840b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104841c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104842d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104843e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104844f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104845g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104846a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.w$a */
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

        public final int a() {
            return C2353w.f104843e;
        }

        public final int c() {
            return C2353w.f104842d;
        }

        public final int e() {
            return C2353w.f104845g;
        }

        public final int g() {
            return C2353w.f104841c;
        }

        public final int i() {
            return C2353w.f104844f;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2353w(int i10) {
        this.f104846a = i10;
    }

    public static final /* synthetic */ C2353w f(int i10) {
        return new C2353w(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof C2353w) && i10 == ((C2353w) obj).f104846a;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return i10;
    }

    @NotNull
    public static String k(int i10) {
        return i10 == f104841c ? "Unspecified" : i10 == f104842d ? "None" : i10 == f104843e ? "Characters" : i10 == f104844f ? "Words" : i10 == f104845g ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f104846a, obj);
    }

    public int hashCode() {
        return this.f104846a;
    }

    public final /* synthetic */ int l() {
        return this.f104846a;
    }

    @NotNull
    public String toString() {
        return k(this.f104846a);
    }
}
