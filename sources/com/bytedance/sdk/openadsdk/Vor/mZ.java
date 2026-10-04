package com.bytedance.sdk.openadsdk.Vor;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.TFq.ZH;
import com.bytedance.sdk.component.TFq.yBV;
import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements yBV<Bitmap> {
    private final String NOt = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> ZRu;

    private mZ(ImageView imageView) {
        this.ZRu = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(int i10, String str, @Nullable Throwable th) {
    }

    public static yBV ZRu(qF qFVar, String str, ImageView imageView) {
        return new NOt(qFVar, str, new mZ(imageView));
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(ZH<Bitmap> zh) {
        final ImageView imageView = this.ZRu.get();
        if (imageView == null || !(zh.NOt() instanceof Bitmap)) {
            return;
        }
        final Bitmap bitmapNOt = zh.NOt();
        if (WD.TFq()) {
            imageView.setImageBitmap(bitmapNOt);
        } else {
            edo.mZ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Vor.mZ.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapNOt);
                }
            });
        }
    }
}
