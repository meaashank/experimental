package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.f3;
import androidx.compose.ui.graphics.g3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f100920c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f100918a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f100919b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f100920c = iArr3;
        }
    }

    @NotNull
    public static final InterfaceC2105s2 a() {
        return new X();
    }

    @NotNull
    public static final InterfaceC2105s2 b(@NotNull Paint paint) {
        return new X(paint);
    }

    public static final float c(@NotNull Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean d(@NotNull Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long e(@NotNull Paint paint) {
        return M0.b(paint.getColor());
    }

    public static final int f(@NotNull Paint paint) {
        if (paint.isFilterBitmap()) {
            U1.f100844b.getClass();
            return U1.f100846d;
        }
        U1.f100844b.getClass();
        return U1.f100845c;
    }

    public static final int g(@NotNull Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f100919b[strokeCap.ordinal()];
        if (i10 == 1) {
            f3.f101112b.getClass();
            return f3.f101113c;
        }
        if (i10 == 2) {
            f3.f101112b.getClass();
            return f3.f101114d;
        }
        if (i10 != 3) {
            f3.f101112b.getClass();
            return f3.f101113c;
        }
        f3.f101112b.getClass();
        return f3.f101115e;
    }

    public static final int h(@NotNull Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f100920c[strokeJoin.ordinal()];
        if (i10 == 1) {
            g3.f101118b.getClass();
            return g3.f101119c;
        }
        if (i10 == 2) {
            g3.f101118b.getClass();
            return g3.f101121e;
        }
        if (i10 != 3) {
            g3.f101118b.getClass();
            return g3.f101119c;
        }
        g3.f101118b.getClass();
        return g3.f101120d;
    }

    public static final float i(@NotNull Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float j(@NotNull Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int k(@NotNull Paint paint) {
        Paint.Style style = paint.getStyle();
        if ((style == null ? -1 : a.f100918a[style.ordinal()]) == 1) {
            C2113u2.f101431b.getClass();
            return C2113u2.f101433d;
        }
        C2113u2.f101431b.getClass();
        return C2113u2.f101432c;
    }

    @NotNull
    public static final Paint l() {
        return new Paint(7);
    }

    public static final void m(@NotNull Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void n(@NotNull Paint paint, boolean z10) {
        paint.setAntiAlias(z10);
    }

    public static final void o(@NotNull Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            o3.f101364a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(F.d(i10)));
        }
    }

    public static final void p(@NotNull Paint paint, long j10) {
        paint.setColor(M0.t(j10));
    }

    public static final void q(@NotNull Paint paint, @Nullable L0 l02) {
        paint.setColorFilter(l02 != null ? l02.f100754a : null);
    }

    public static final void r(@NotNull Paint paint, int i10) {
        U1.f100844b.getClass();
        paint.setFilterBitmap(!(i10 == U1.f100845c));
    }

    public static final void s(@NotNull Paint paint, @Nullable InterfaceC2121w2 interfaceC2121w2) {
        C2002a0 c2002a0 = (C2002a0) interfaceC2121w2;
        paint.setPathEffect(c2002a0 != null ? c2002a0.f100929b : null);
    }

    public static final void t(@NotNull Paint paint, @Nullable Shader shader) {
        paint.setShader(shader);
    }

    public static final void u(@NotNull Paint paint, int i10) {
        Paint.Cap cap;
        f3.a aVar = f3.f101112b;
        aVar.getClass();
        if (i10 == f3.f101115e) {
            cap = Paint.Cap.SQUARE;
        } else {
            aVar.getClass();
            if (i10 == f3.f101114d) {
                cap = Paint.Cap.ROUND;
            } else {
                aVar.getClass();
                cap = i10 == f3.f101113c ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    public static final void v(@NotNull Paint paint, int i10) {
        Paint.Join join;
        g3.a aVar = g3.f101118b;
        aVar.getClass();
        if (i10 == g3.f101119c) {
            join = Paint.Join.MITER;
        } else {
            aVar.getClass();
            if (i10 == g3.f101121e) {
                join = Paint.Join.BEVEL;
            } else {
                aVar.getClass();
                join = i10 == g3.f101120d ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    public static final void w(@NotNull Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void x(@NotNull Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void y(@NotNull Paint paint, int i10) {
        C2113u2.f101431b.getClass();
        paint.setStyle(i10 == C2113u2.f101433d ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
