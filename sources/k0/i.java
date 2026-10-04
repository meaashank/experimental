package k0;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,577:1\n132#2:578\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n96#1:578\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214308b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f214309c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f214310d = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f214311e = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214312a;

    public static final class a {
        public a() {
        }

        public final float a() {
            return i.f214309c;
        }

        public final float c() {
            return i.f214310d;
        }

        public final float e() {
            return i.f214311e;
        }

        public a(C4969v c4969v) {
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
    }

    public /* synthetic */ i(float f10) {
        this.f214312a = f10;
    }

    public static final /* synthetic */ i d(float f10) {
        return new i(f10);
    }

    @T1
    public static int f(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    @T1
    public static final float h(float f10, float f11) {
        return f10 / f11;
    }

    @T1
    public static final float i(float f10, float f11) {
        return f10 / f11;
    }

    @T1
    public static final float j(float f10, int i10) {
        return f10 / i10;
    }

    public static boolean k(float f10, Object obj) {
        return (obj instanceof i) && Float.compare(f10, ((i) obj).f214312a) == 0;
    }

    public static final boolean l(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int n(float f10) {
        return Float.floatToIntBits(f10);
    }

    @T1
    public static final float p(float f10, float f11) {
        return f10 - f11;
    }

    @T1
    public static final float r(float f10, float f11) {
        return f10 + f11;
    }

    @T1
    public static final float s(float f10, float f11) {
        return f10 * f11;
    }

    @T1
    public static final float t(float f10, int i10) {
        return f10 * i10;
    }

    @T1
    @NotNull
    public static String u(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @T1
    public static final float v(float f10) {
        return -f10;
    }

    @Override // java.lang.Comparable
    public int compareTo(i iVar) {
        return Float.compare(this.f214312a, iVar.f214312a);
    }

    @T1
    public int e(float f10) {
        return Float.compare(this.f214312a, f10);
    }

    public boolean equals(Object obj) {
        return k(this.f214312a, obj);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f214312a);
    }

    public final float m() {
        return this.f214312a;
    }

    @T1
    @NotNull
    public String toString() {
        return u(this.f214312a);
    }

    public final /* synthetic */ float w() {
        return this.f214312a;
    }

    public static float g(float f10) {
        return f10;
    }
}
