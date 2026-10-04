package com.android.launcher3.graphics;

import android.graphics.Bitmap;
import com.android.launcher3.ItemInfoWithIcon;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapInfo {
    public int color;
    public Bitmap icon;

    public static BitmapInfo fromBitmap(Bitmap bitmap) {
        BitmapInfo bitmapInfo = new BitmapInfo();
        bitmapInfo.icon = bitmap;
        bitmapInfo.color = ColorExtractor.findDominantColorByHue(bitmap, 20);
        return bitmapInfo;
    }

    public void applyTo(ItemInfoWithIcon itemInfoWithIcon) {
        itemInfoWithIcon.iconBitmap = this.icon;
        itemInfoWithIcon.iconColor = this.color;
    }

    public void applyTo(BitmapInfo bitmapInfo) {
        bitmapInfo.icon = this.icon;
        bitmapInfo.color = this.color;
    }
}
