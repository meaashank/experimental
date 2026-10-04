package j5;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    public static int a(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(int r2, float r3) {
        /*
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 > 0) goto Le
            goto L6
        Le:
            int r0 = r2 >>> 24
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            int r3 = r3 << 24
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.i.b(int, float):int");
    }

    public static int c(Context context, int i10) {
        return (int) TypedValue.applyDimension(2, i10, context.getResources().getDisplayMetrics());
    }

    public static int d(Context context, String str) {
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return -1;
        }
        TypedValue typedValue = new TypedValue();
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            return -1;
        }
        theme.resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }
}
