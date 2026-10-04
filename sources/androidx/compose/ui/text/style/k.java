package androidx.compose.ui.text.style;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f105023b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105024c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105025d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105026e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105027f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105028g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105029h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105030a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return k.f105026e;
        }

        public final int b() {
            return k.f105027f;
        }

        public final int c() {
            return k.f105028g;
        }

        public final int d() {
            return k.f105024c;
        }

        public final int e() {
            return k.f105025d;
        }

        public final int f() {
            return k.f105029h;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ k(int i10) {
        this.f105030a = i10;
    }

    public static final /* synthetic */ k g(int i10) {
        return new k(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).f105030a;
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return i10;
    }

    @NotNull
    public static String l(int i10) {
        return i10 == f105024c ? "Ltr" : i10 == f105025d ? "Rtl" : i10 == f105026e ? "Content" : i10 == f105027f ? "ContentOrLtr" : i10 == f105028g ? "ContentOrRtl" : i10 == f105029h ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f105030a, obj);
    }

    public int hashCode() {
        return this.f105030a;
    }

    public final /* synthetic */ int m() {
        return this.f105030a;
    }

    @NotNull
    public String toString() {
        return l(this.f105030a);
    }
}
