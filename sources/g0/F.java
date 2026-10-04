package G0;

import G0.C1143e;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40035a = "\udfffd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40036b = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<androidx.core.util.p<Rect, Rect>> f40037c = new ThreadLocal<>();

    @e.T(23)
    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @e.T(29)
    public static class b {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(@NonNull Paint paint, @NonNull String str) {
        return paint.hasGlyph(str);
    }

    public static androidx.core.util.p<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.p<Rect, Rect>> threadLocal = f40037c;
        androidx.core.util.p<Rect, Rect> pVar = threadLocal.get();
        if (pVar == null) {
            androidx.core.util.p<Rect, Rect> pVar2 = new androidx.core.util.p<>(new Rect(), new Rect());
            threadLocal.set(pVar2);
            return pVar2;
        }
        pVar.f111414a.setEmpty();
        pVar.f111415b.setEmpty();
        return pVar;
    }

    public static boolean c(@NonNull Paint paint, @Nullable BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, blendModeCompat != null ? C1143e.b.a(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = C1143e.a(blendModeCompat);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
