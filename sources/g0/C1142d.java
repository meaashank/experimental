package G0;

import G0.C1143e;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: renamed from: G0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1142d {

    /* JADX INFO: renamed from: G0.d$a */
    @e.T(29)
    public static class a {
        public static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    @Nullable
    public static ColorFilter a(int i10, @NonNull BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = C1143e.b.a(blendModeCompat);
            if (objA != null) {
                return a.a(i10, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = C1143e.a(blendModeCompat);
        if (modeA != null) {
            return new PorterDuffColorFilter(i10, modeA);
        }
        return null;
    }
}
