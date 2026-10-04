package com.bytedance.adsdk.NOt.ZRu;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.NOt.Ht.TFq;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends Paint {
    public ZRu() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(TFq.ZRu(i10, 0, 255));
        } else {
            setColor((TFq.ZRu(i10, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public ZRu(int i10) {
        super(i10);
    }

    public ZRu(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ZRu(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
