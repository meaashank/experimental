package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {

    public static class ZRu implements View.OnLayoutChangeListener {
        private int NOt;
        private final Drawable ZRu;
        private int mZ;

        public ZRu(Drawable drawable) {
            this.ZRu = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.NOt && i19 == this.mZ) {
                return;
            }
            this.NOt = i18;
            this.mZ = i19;
            this.ZRu.setBounds(0, 0, i18, i19);
        }
    }

    public static void ZRu(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (viewGroup == null || qFVar == null || TextUtils.isEmpty(qFVar.KuY())) {
            return;
        }
        try {
            int i10 = sAl.KuY;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableZRu = ZRu(viewGroup.getResources(), qFVar);
            if (drawableZRu == null) {
                return;
            }
            viewGroup.setForeground(drawableZRu);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("add overlay fail", th.getMessage());
        }
    }

    public static void ZRu(Activity activity, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (activity == null || qFVar == null || TextUtils.isEmpty(qFVar.KuY())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = sAl.KuY;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableZRu = ZRu(activity.getResources(), qFVar);
            if (drawableZRu == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableZRu);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable ZRu(Resources resources, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        try {
            String strKuY = qFVar.KuY();
            if (TextUtils.isEmpty(strKuY)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strKuY, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
