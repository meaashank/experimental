package com.bytedance.sdk.openadsdk.core.FA.ZRu;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static float NOt(Context context) {
        return Cox.uR(context, Cox.aT(context));
    }

    @NonNull
    public static Pair<Float, Float> ZRu(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArrZRu = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrZRu[0] = Cox.uR(window.getContext(), fArrZRu[0]);
        float fUR = Cox.uR(window.getContext(), fArrZRu[1]);
        fArrZRu[1] = fUR;
        if (fArrZRu[0] < 10.0f || fUR < 10.0f) {
            fArrZRu = ZRu(window.getContext(), Cox.uR(window.getContext(), Cox.ZRu()), i10);
        }
        float fMax = Math.max(fArrZRu[0], fArrZRu[1]);
        float fMin = Math.min(fArrZRu[0], fArrZRu[1]);
        if (i10 == 1) {
            fArrZRu[0] = fMin;
            fArrZRu[1] = fMax;
        } else {
            fArrZRu[0] = fMax;
            fArrZRu[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrZRu[0]), Float.valueOf(fArrZRu[1]));
    }

    private static float[] ZRu(Context context, int i10, int i11) {
        float fZRu = ZRu(context);
        float fNOt = NOt(context);
        if ((i11 == 1) != (fZRu > fNOt)) {
            float f10 = fZRu + fNOt;
            fNOt = f10 - fNOt;
            fZRu = f10 - fNOt;
        }
        if (i11 == 1) {
            fZRu -= i10;
        } else {
            fNOt -= i10;
        }
        return new float[]{fNOt, fZRu};
    }

    public static float ZRu(Context context) {
        return Cox.uR(context, Cox.Vor(context));
    }
}
