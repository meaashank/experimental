package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class le implements com.bytedance.sdk.component.TFq.yBV<Bitmap> {
    private final WeakReference<ImageView> ZRu;

    public le(ImageView imageView) {
        this.ZRu = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(com.bytedance.sdk.component.TFq.ZH<Bitmap> zh) {
        ImageView imageView = this.ZRu.get();
        if (imageView == null) {
            return;
        }
        if (zh != null) {
            try {
                if (zh.NOt() != null) {
                    imageView.setImageBitmap(zh.NOt());
                    return;
                }
            } catch (Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.TFq.yBV
    public void ZRu(int i10, String str, @Nullable Throwable th) {
        ImageView imageView = this.ZRu.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
