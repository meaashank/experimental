package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.compose.ui.graphics.C2099r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100680a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f100680a = iArr;
        }
    }

    public static final boolean a(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        C2099r0.f101402b.getClass();
        return i10 == C2099r0.f101406f || d(i10) != PorterDuff.Mode.SRC_OVER;
    }

    @e.T(29)
    @NotNull
    public static final BlendMode b(int i10) {
        C2099r0.a aVar = C2099r0.f101402b;
        aVar.getClass();
        if (i10 == C2099r0.f101403c) {
            return BlendMode.CLEAR;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101404d) {
            return BlendMode.SRC;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101405e) {
            return BlendMode.DST;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101406f) {
            return BlendMode.SRC_OVER;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101407g) {
            return BlendMode.DST_OVER;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101408h) {
            return BlendMode.SRC_IN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101409i) {
            return BlendMode.DST_IN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101410j) {
            return BlendMode.SRC_OUT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101411k) {
            return BlendMode.DST_OUT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101412l) {
            return BlendMode.SRC_ATOP;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101413m) {
            return BlendMode.DST_ATOP;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101414n) {
            return BlendMode.XOR;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101415o) {
            return BlendMode.PLUS;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101416p) {
            return BlendMode.MODULATE;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101417q) {
            return BlendMode.SCREEN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101418r) {
            return BlendMode.OVERLAY;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101419s) {
            return BlendMode.DARKEN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101420t) {
            return BlendMode.LIGHTEN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101421u) {
            return BlendMode.COLOR_DODGE;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101422v) {
            return BlendMode.COLOR_BURN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101423w) {
            return BlendMode.HARD_LIGHT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101424x) {
            return BlendMode.SOFT_LIGHT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101425y) {
            return BlendMode.DIFFERENCE;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101426z) {
            return BlendMode.EXCLUSION;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101397A) {
            return BlendMode.MULTIPLY;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101398B) {
            return BlendMode.HUE;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101399C) {
            return BlendMode.SATURATION;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101400D) {
            return BlendMode.COLOR;
        }
        aVar.getClass();
        return i10 == C2099r0.f101401E ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    @e.T(29)
    public static final int c(@NotNull BlendMode blendMode) {
        switch (a.f100680a[blendMode.ordinal()]) {
            case 1:
                C2099r0.f101402b.getClass();
                return C2099r0.f101403c;
            case 2:
                C2099r0.f101402b.getClass();
                return C2099r0.f101404d;
            case 3:
                C2099r0.f101402b.getClass();
                return C2099r0.f101405e;
            case 4:
                C2099r0.f101402b.getClass();
                return C2099r0.f101406f;
            case 5:
                C2099r0.f101402b.getClass();
                return C2099r0.f101407g;
            case 6:
                C2099r0.f101402b.getClass();
                return C2099r0.f101408h;
            case 7:
                C2099r0.f101402b.getClass();
                return C2099r0.f101409i;
            case 8:
                C2099r0.f101402b.getClass();
                return C2099r0.f101410j;
            case 9:
                C2099r0.f101402b.getClass();
                return C2099r0.f101411k;
            case 10:
                C2099r0.f101402b.getClass();
                return C2099r0.f101412l;
            case 11:
                C2099r0.f101402b.getClass();
                return C2099r0.f101413m;
            case 12:
                C2099r0.f101402b.getClass();
                return C2099r0.f101414n;
            case 13:
                C2099r0.f101402b.getClass();
                return C2099r0.f101415o;
            case 14:
                C2099r0.f101402b.getClass();
                return C2099r0.f101416p;
            case 15:
                C2099r0.f101402b.getClass();
                return C2099r0.f101417q;
            case 16:
                C2099r0.f101402b.getClass();
                return C2099r0.f101418r;
            case 17:
                C2099r0.f101402b.getClass();
                return C2099r0.f101419s;
            case 18:
                C2099r0.f101402b.getClass();
                return C2099r0.f101420t;
            case 19:
                C2099r0.f101402b.getClass();
                return C2099r0.f101421u;
            case 20:
                C2099r0.f101402b.getClass();
                return C2099r0.f101422v;
            case 21:
                C2099r0.f101402b.getClass();
                return C2099r0.f101423w;
            case 22:
                C2099r0.f101402b.getClass();
                return C2099r0.f101424x;
            case 23:
                C2099r0.f101402b.getClass();
                return C2099r0.f101425y;
            case 24:
                C2099r0.f101402b.getClass();
                return C2099r0.f101426z;
            case 25:
                C2099r0.f101402b.getClass();
                return C2099r0.f101397A;
            case 26:
                C2099r0.f101402b.getClass();
                return C2099r0.f101398B;
            case 27:
                C2099r0.f101402b.getClass();
                return C2099r0.f101399C;
            case 28:
                C2099r0.f101402b.getClass();
                return C2099r0.f101400D;
            case 29:
                C2099r0.f101402b.getClass();
                return C2099r0.f101401E;
            default:
                C2099r0.f101402b.getClass();
                return C2099r0.f101406f;
        }
    }

    @NotNull
    public static final PorterDuff.Mode d(int i10) {
        C2099r0.a aVar = C2099r0.f101402b;
        aVar.getClass();
        if (i10 == C2099r0.f101403c) {
            return PorterDuff.Mode.CLEAR;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101404d) {
            return PorterDuff.Mode.SRC;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101405e) {
            return PorterDuff.Mode.DST;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101406f) {
            return PorterDuff.Mode.SRC_OVER;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101407g) {
            return PorterDuff.Mode.DST_OVER;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101408h) {
            return PorterDuff.Mode.SRC_IN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101409i) {
            return PorterDuff.Mode.DST_IN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101410j) {
            return PorterDuff.Mode.SRC_OUT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101411k) {
            return PorterDuff.Mode.DST_OUT;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101412l) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101413m) {
            return PorterDuff.Mode.DST_ATOP;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101414n) {
            return PorterDuff.Mode.XOR;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101415o) {
            return PorterDuff.Mode.ADD;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101417q) {
            return PorterDuff.Mode.SCREEN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101418r) {
            return PorterDuff.Mode.OVERLAY;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101419s) {
            return PorterDuff.Mode.DARKEN;
        }
        aVar.getClass();
        if (i10 == C2099r0.f101420t) {
            return PorterDuff.Mode.LIGHTEN;
        }
        aVar.getClass();
        return i10 == C2099r0.f101416p ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
