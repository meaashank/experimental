package G0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import e.InterfaceC4348w;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    @e.T(26)
    public static class a {
        public static float[] a(Path path, float f10) {
            return path.approximate(f10);
        }
    }

    @NonNull
    @e.T(26)
    public static Collection<J> a(@NonNull Path path) {
        return b(path, 0.5f);
    }

    @NonNull
    @e.T(26)
    public static Collection<J> b(@NonNull Path path, @InterfaceC4348w(from = 0.0d) float f10) {
        float[] fArrA = a.a(path, f10);
        int length = fArrA.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f11 = fArrA[i11];
            float f12 = fArrA[i11 + 1];
            float f13 = fArrA[i11 + 2];
            float f14 = fArrA[i12];
            float f15 = fArrA[i12 + 1];
            float f16 = fArrA[i12 + 2];
            if (f11 != f14 && (f12 != f15 || f13 != f16)) {
                arrayList.add(new J(new PointF(f15, f16), f14, new PointF(f12, f13), f11));
            }
        }
        return arrayList;
    }
}
