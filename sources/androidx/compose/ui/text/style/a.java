package androidx.compose.ui.text.style;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0265a f104952b = new C0265a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f104953c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f104954d = -0.5f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f104955e = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f104956a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name */
    public static final class C0265a {
        public C0265a() {
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

        public final float a() {
            return a.f104955e;
        }

        public final float c() {
            return a.f104954d;
        }

        public final float e() {
            return a.f104953c;
        }

        public C0265a(C4969v c4969v) {
        }
    }

    public /* synthetic */ a(float f10) {
        this.f104956a = f10;
    }

    public static final /* synthetic */ a d(float f10) {
        return new a(f10);
    }

    public static float e(float f10) {
        return f10;
    }

    public static boolean f(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).f104956a) == 0;
    }

    public static final boolean g(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int i(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static String j(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f104956a, obj);
    }

    public final float h() {
        return this.f104956a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f104956a);
    }

    public final /* synthetic */ float k() {
        return this.f104956a;
    }

    public String toString() {
        return j(this.f104956a);
    }
}
