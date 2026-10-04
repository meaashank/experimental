package Ga;

import android.content.Context;
import android.graphics.PointF;
import com.prism.commons.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45354a = 80;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45355b = 80;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static PointF f45356c;

    public static PointF a(Context context) {
        if (f45356c == null) {
            PointF pointF = new PointF();
            f45356c = pointF;
            pointF.x = r.e(context) - (r.a(context, 80) / 2.0f);
            f45356c.y = r.c(context) / 2.0f;
        }
        PointF pointF2 = f45356c;
        return new PointF(pointF2.x, pointF2.y);
    }

    public static void b(Context context, float f10, float f11) {
        if (f45356c == null) {
            f45356c = new PointF();
        }
        PointF pointF = f45356c;
        pointF.x = f10;
        pointF.y = f11;
    }
}
