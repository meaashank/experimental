package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101047b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101048c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101049d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101050e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f101051f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101052a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return o.f101051f;
        }

        public final int b() {
            return o.f101048c;
        }

        public final int c() {
            return o.f101049d;
        }

        public final int d() {
            return o.f101050e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ o(int i10) {
        this.f101052a = i10;
    }

    public static final /* synthetic */ o e(int i10) {
        return new o(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof o) && i10 == ((o) obj).f101052a;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @NotNull
    public static String j(int i10) {
        return i10 == f101048c ? "Perceptual" : i10 == f101049d ? "Relative" : i10 == f101050e ? t1.b.f238980l1 : i10 == f101051f ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.f101052a, obj);
    }

    public int hashCode() {
        return this.f101052a;
    }

    public final /* synthetic */ int k() {
        return this.f101052a;
    }

    @NotNull
    public String toString() {
        return j(this.f101052a);
    }
}
