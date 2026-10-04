package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class OCA {
    private static SparseArray<WeakReference<Interpolator>> NOt;
    private static final Interpolator ZRu = new LinearInterpolator();

    /* JADX WARN: Removed duplicated region for block: B:127:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.NOt.Mm.ZRu<T> NOt(com.bytedance.adsdk.NOt.Mm r24, android.util.JsonReader r25, float r26, com.bytedance.adsdk.NOt.TFq.Qg<T> r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.TFq.OCA.NOt(com.bytedance.adsdk.NOt.Mm, android.util.JsonReader, float, com.bytedance.adsdk.NOt.TFq.Qg):com.bytedance.adsdk.NOt.Mm.ZRu");
    }

    private static SparseArray<WeakReference<Interpolator>> ZRu() {
        if (NOt == null) {
            NOt = new SparseArray<>();
        }
        return NOt;
    }

    private static WeakReference<Interpolator> ZRu(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (OCA.class) {
            weakReference = ZRu().get(i10);
        }
        return weakReference;
    }

    private static void ZRu(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (OCA.class) {
            NOt.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.NOt.Mm.ZRu<T> ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, float f10, Qg<T> qg, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return NOt(mm, jsonReader, f10, qg);
        }
        if (z10) {
            return ZRu(mm, jsonReader, f10, qg);
        }
        return ZRu(jsonReader, f10, qg);
    }

    private static <T> com.bytedance.adsdk.NOt.Mm.ZRu<T> ZRu(com.bytedance.adsdk.NOt.Mm mm, JsonReader jsonReader, float f10, Qg<T> qg) throws IOException {
        Interpolator interpolatorZRu;
        jsonReader.beginObject();
        PointF pointFNOt = null;
        T tNOt = null;
        T tNOt2 = null;
        PointF pointFNOt2 = null;
        PointF pointFNOt3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFNOt4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tNOt = qg.NOt(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFNOt4 = om.NOt(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFNOt = om.NOt(jsonReader, 1.0f);
                    break;
                case "s":
                    tNOt2 = qg.NOt(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFNOt3 = om.NOt(jsonReader, f10);
                    break;
                case "to":
                    pointFNOt2 = om.NOt(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFNOt != null && pointFNOt4 != null) {
                interpolatorZRu = ZRu(pointFNOt, pointFNOt4);
            }
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu = new com.bytedance.adsdk.NOt.Mm.ZRu<>(mm, tNOt2, tNOt, interpolatorZRu, fNextDouble, null);
            zRu.FA = pointFNOt2;
            zRu.Vor = pointFNOt3;
            return zRu;
        }
        tNOt = tNOt2;
        interpolatorZRu = ZRu;
        com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu2 = new com.bytedance.adsdk.NOt.Mm.ZRu<>(mm, tNOt2, tNOt, interpolatorZRu, fNextDouble, null);
        zRu2.FA = pointFNOt2;
        zRu2.Vor = pointFNOt3;
        return zRu2;
    }

    private static Interpolator ZRu(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.NOt.Ht.TFq.NOt(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.NOt.Ht.TFq.NOt(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.NOt.Ht.TFq.NOt(pointF2.x, -1.0f, 1.0f);
        float fNOt = com.bytedance.adsdk.NOt.Ht.TFq.NOt(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fNOt;
        int iZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu(pointF.x, pointF.y, pointF2.x, fNOt);
        WeakReference<Interpolator> weakReferenceZRu = com.bytedance.adsdk.NOt.TFq.ZRu() ? null : ZRu(iZRu);
        Interpolator interpolator = weakReferenceZRu != null ? weakReferenceZRu.get() : null;
        if (weakReferenceZRu != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.NOt.WMI.ZRu(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.NOt.WMI.ZRu(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.NOt.TFq.ZRu()) {
            try {
                ZRu(iZRu, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.NOt.Mm.ZRu<T> ZRu(JsonReader jsonReader, float f10, Qg<T> qg) throws IOException {
        return new com.bytedance.adsdk.NOt.Mm.ZRu<>(qg.NOt(jsonReader, f10));
    }
}
