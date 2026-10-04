package l0;

import androidx.annotation.RestrictTo;
import androidx.collection.W0;
import androidx.compose.runtime.internal.r;
import e.InterfaceC4330d;
import e.f0;
import k0.s;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,235:1\n54#2,7:236\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:236,7\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@r(parameters = 0)
public final class C5131b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5131b f220897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f220898b = 100.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final float[] f220899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static volatile W0<InterfaceC5130a> f220900d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Object[] f220901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f220902f = 1.03f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f220903g;

    static {
        C5131b c5131b = new C5131b();
        f220897a = c5131b;
        f220899c = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f220900d = new W0<>(0, 1, null);
        Object[] objArr = new Object[0];
        f220901e = objArr;
        synchronized (objArr) {
            c5131b.j(f220900d, 1.15f, new C5132c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c5131b.j(f220900d, 1.3f, new C5132c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c5131b.j(f220900d, 1.5f, new C5132c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c5131b.j(f220900d, 1.8f, new C5132c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c5131b.j(f220900d, 2.0f, new C5132c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if (((((float) f220900d.m(0)) / 100.0f) - 0.01f > 1.03f ? 1 : 0) != 0) {
            f220903g = 8;
        } else {
            s.d("You should only apply non-linear scaling to font scales > 1");
            throw null;
        }
    }

    public final InterfaceC5130a a(InterfaceC5130a interfaceC5130a, InterfaceC5130a interfaceC5130a2, float f10) {
        float[] fArr = f220899c;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f220899c[i10];
            fArr2[i10] = C5133d.f220908a.b(interfaceC5130a.b(f11), interfaceC5130a2.b(f11), f10);
        }
        return new C5132c(f220899c, fArr2);
    }

    @InterfaceC4330d
    @Nullable
    public final InterfaceC5130a b(float f10) {
        InterfaceC5130a interfaceC5130aZ;
        if (!h(f10)) {
            return null;
        }
        InterfaceC5130a interfaceC5130aC = f220897a.c(f10);
        if (interfaceC5130aC != null) {
            return interfaceC5130aC;
        }
        int iJ = f220900d.j((int) (f10 * 100.0f));
        if (iJ >= 0) {
            return f220900d.z(iJ);
        }
        int i10 = -(iJ + 1);
        int i11 = i10 - 1;
        float fM = 1.0f;
        if (i10 >= f220900d.y()) {
            C5132c c5132c = new C5132c(new float[]{1.0f}, new float[]{f10});
            i(f10, c5132c);
            return c5132c;
        }
        if (i11 < 0) {
            float[] fArr = f220899c;
            interfaceC5130aZ = new C5132c(fArr, fArr);
        } else {
            fM = f220900d.m(i11) / 100.0f;
            interfaceC5130aZ = f220900d.z(i11);
        }
        InterfaceC5130a interfaceC5130aA = a(interfaceC5130aZ, f220900d.z(i10), C5133d.f220908a.a(0.0f, 1.0f, fM, f220900d.m(i10) / 100.0f, f10));
        i(f10, interfaceC5130aA);
        return interfaceC5130aA;
    }

    public final InterfaceC5130a c(float f10) {
        return f220900d.g((int) (f10 * 100.0f));
    }

    public final int d(float f10) {
        return (int) (f10 * 100.0f);
    }

    @NotNull
    public final W0<InterfaceC5130a> e() {
        return f220900d;
    }

    public final float g(int i10) {
        return i10 / 100.0f;
    }

    @InterfaceC4330d
    public final boolean h(float f10) {
        return f10 >= 1.03f;
    }

    public final void i(float f10, InterfaceC5130a interfaceC5130a) {
        synchronized (f220901e) {
            W0<InterfaceC5130a> w0C = f220900d.clone();
            f220897a.getClass();
            w0C.n((int) (f10 * 100.0f), interfaceC5130a);
            f220900d = w0C;
        }
    }

    public final void j(W0<InterfaceC5130a> w02, float f10, InterfaceC5130a interfaceC5130a) {
        w02.n((int) (f10 * 100.0f), interfaceC5130a);
    }

    public final void k(@NotNull W0<InterfaceC5130a> w02) {
        f220900d = w02;
    }

    @f0
    public static /* synthetic */ void f() {
    }
}
