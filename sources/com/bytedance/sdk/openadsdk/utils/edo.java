package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu;

/* JADX INFO: loaded from: classes3.dex */
public class edo {

    public interface ZRu {
        void ZRu();

        void ZRu(com.bytedance.sdk.openadsdk.WMI.ZRu.NOt nOt);
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.WMI.ZRu zRu, int i10, int i11, ZRu zRu2, String str) {
        ZRu(zRu, i10, i11, zRu2, str, 0);
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.WMI.ZRu zRu, int i10, int i11, final ZRu zRu2, String str, int i12) {
        com.bytedance.sdk.component.utils.lp.ZRu("splashLoadAd", " getImageBytes url ".concat(String.valueOf(zRu)));
        com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().mZ().ZRu(zRu, new ZRu.InterfaceC0430ZRu() { // from class: com.bytedance.sdk.openadsdk.utils.edo.1
            @Override // com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu.InterfaceC0430ZRu
            public void ZRu(String str2, com.bytedance.sdk.openadsdk.WMI.ZRu.NOt nOt) {
                ZRu zRu3;
                if (nOt.uR() && (zRu3 = zRu2) != null) {
                    zRu3.ZRu(nOt);
                    return;
                }
                ZRu zRu4 = zRu2;
                if (zRu4 != null) {
                    zRu4.ZRu();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu.InterfaceC0430ZRu
            public void ZRu(int i13, String str2, Throwable th) {
                ZRu zRu3 = zRu2;
                if (zRu3 != null) {
                    zRu3.ZRu();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable ZRu(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
