package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class C2029f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101105b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101106c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101107d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101108e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f101109f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f101110g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101111a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.f2$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2029f2.f101107d;
        }

        public final int b() {
            return C2029f2.f101106c;
        }

        public final int c() {
            return C2029f2.f101109f;
        }

        public final int d() {
            return C2029f2.f101110g;
        }

        public final int e() {
            return C2029f2.f101108e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2029f2(int i10) {
        this.f101111a = i10;
    }

    public static final /* synthetic */ C2029f2 f(int i10) {
        return new C2029f2(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof C2029f2) && i10 == ((C2029f2) obj).f101111a;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return i10;
    }

    @NotNull
    public static String l(int i10) {
        return i10 == f101106c ? "Argb8888" : i10 == f101107d ? "Alpha8" : i10 == f101108e ? "Rgb565" : i10 == f101109f ? "F16" : i10 == f101110g ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f101111a, obj);
    }

    public int hashCode() {
        return this.f101111a;
    }

    public final int j() {
        return this.f101111a;
    }

    public final /* synthetic */ int m() {
        return this.f101111a;
    }

    @NotNull
    public String toString() {
        return l(this.f101111a);
    }
}
