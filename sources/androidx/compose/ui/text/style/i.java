package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f105008b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105009c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105010d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105011e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105012f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105013g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105014h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f105015i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105016a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return i.f105011e;
        }

        public final int b() {
            return i.f105014h;
        }

        public final int c() {
            return i.f105012f;
        }

        public final int d() {
            return i.f105009c;
        }

        public final int e() {
            return i.f105010d;
        }

        public final int f() {
            return i.f105013g;
        }

        public final int g() {
            return i.f105015i;
        }

        @NotNull
        public final List<i> h() {
            return I.Q(new i(i.f105009c), new i(i.f105010d), new i(i.f105011e), new i(i.f105012f), new i(i.f105013g), new i(i.f105014h));
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ i(int i10) {
        this.f105016a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).f105016a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return i10;
    }

    @NotNull
    public static String m(int i10) {
        return i10 == f105009c ? "Left" : i10 == f105010d ? "Right" : i10 == f105011e ? "Center" : i10 == f105012f ? "Justify" : i10 == f105013g ? "Start" : i10 == f105014h ? "End" : i10 == f105015i ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f105016a, obj);
    }

    public int hashCode() {
        return this.f105016a;
    }

    public final /* synthetic */ int n() {
        return this.f105016a;
    }

    @NotNull
    public String toString() {
        return m(this.f105016a);
    }
}
