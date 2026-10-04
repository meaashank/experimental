package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class i3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101130b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101131c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101132d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101133e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f101134f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101135a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return i3.f101131c;
        }

        public final int b() {
            return i3.f101134f;
        }

        public final int c() {
            return i3.f101133e;
        }

        public final int d() {
            return i3.f101132d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ i3(int i10) {
        this.f101135a = i10;
    }

    public static final /* synthetic */ i3 e(int i10) {
        return new i3(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof i3) && i10 == ((i3) obj).f101135a;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @NotNull
    public static String j(int i10) {
        return i10 == f101131c ? "Clamp" : i10 == f101132d ? "Repeated" : i10 == f101133e ? "Mirror" : i10 == f101134f ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.f101135a, obj);
    }

    public int hashCode() {
        return this.f101135a;
    }

    public final /* synthetic */ int k() {
        return this.f101135a;
    }

    @NotNull
    public String toString() {
        return j(this.f101135a);
    }
}
