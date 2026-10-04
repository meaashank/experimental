package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.C2029f2;
import androidx.compose.ui.graphics.colorspace.AbstractC2015c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class V {
    @NotNull
    public static final InterfaceC2025e2 a(int i10, int i11, int i12, boolean z10, @NotNull AbstractC2015c abstractC2015c) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configD = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = C2092p0.b(i10, i11, i12, z10, abstractC2015c);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD);
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new T(bitmapCreateBitmap);
    }

    @NotNull
    public static final Bitmap b(@NotNull InterfaceC2025e2 interfaceC2025e2) {
        if (interfaceC2025e2 instanceof T) {
            return ((T) interfaceC2025e2).f100823b;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final InterfaceC2025e2 c(@NotNull Bitmap bitmap) {
        return new T(bitmap);
    }

    @NotNull
    public static final Bitmap.Config d(int i10) {
        C2029f2.a aVar = C2029f2.f101105b;
        aVar.getClass();
        if (i10 == C2029f2.f101106c) {
            return Bitmap.Config.ARGB_8888;
        }
        aVar.getClass();
        if (i10 == C2029f2.f101107d) {
            return Bitmap.Config.ALPHA_8;
        }
        aVar.getClass();
        if (i10 == C2029f2.f101108e) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            aVar.getClass();
            if (i10 == C2029f2.f101109f) {
                return Bitmap.Config.RGBA_F16;
            }
        }
        if (i11 >= 26) {
            aVar.getClass();
            if (i10 == C2029f2.f101110g) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(@NotNull Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            C2029f2.f101105b.getClass();
            return C2029f2.f101107d;
        }
        if (config == Bitmap.Config.RGB_565) {
            C2029f2.f101105b.getClass();
            return C2029f2.f101108e;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            C2029f2.f101105b.getClass();
            return C2029f2.f101106c;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && config == Bitmap.Config.RGBA_F16) {
            C2029f2.f101105b.getClass();
            return C2029f2.f101109f;
        }
        if (i10 < 26 || config != Bitmap.Config.HARDWARE) {
            C2029f2.f101105b.getClass();
            return C2029f2.f101106c;
        }
        C2029f2.f101105b.getClass();
        return C2029f2.f101110g;
    }
}
