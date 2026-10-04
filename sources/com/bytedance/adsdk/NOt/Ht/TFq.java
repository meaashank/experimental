package com.bytedance.adsdk.NOt.Ht;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.NOt.mZ.NOt.edo;
import com.bytedance.component.sdk.annotation.FloatRange;
import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private static final PointF ZRu = new PointF();

    private static int NOt(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int ZRu(int i10, int i11, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }

    public static boolean mZ(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static PointF ZRu(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float NOt(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void ZRu(edo edoVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFZRu = edoVar.ZRu();
        path.moveTo(pointFZRu.x, pointFZRu.y);
        ZRu.set(pointFZRu.x, pointFZRu.y);
        int i10 = 0;
        while (i10 < edoVar.mZ().size()) {
            com.bytedance.adsdk.NOt.mZ.ZRu zRu = edoVar.mZ().get(i10);
            PointF pointFZRu2 = zRu.ZRu();
            PointF pointFNOt = zRu.NOt();
            PointF pointFMZ = zRu.mZ();
            PointF pointF = ZRu;
            if (pointFZRu2.equals(pointF) && pointFNOt.equals(pointFMZ)) {
                path.lineTo(pointFMZ.x, pointFMZ.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFZRu2.x, pointFZRu2.y, pointFNOt.x, pointFNOt.y, pointFMZ.x, pointFMZ.y);
            }
            pointF.set(pointFMZ.x, pointFMZ.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (edoVar.NOt()) {
            path3.close();
        }
    }

    public static float ZRu(float f10, float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        return C4541d.a(f11, f10, f12, f10);
    }

    public static int ZRu(float f10, float f11) {
        return ZRu((int) f10, (int) f11);
    }

    private static int ZRu(int i10, int i11) {
        return i10 - (i11 * NOt(i10, i11));
    }

    public static int ZRu(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
