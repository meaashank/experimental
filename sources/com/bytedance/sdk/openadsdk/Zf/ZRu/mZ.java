package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.view.View;
import com.bytedance.sdk.openadsdk.Zf.ZRu.TFq;
import com.bytedance.sdk.openadsdk.core.model.qF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends NOt {
    private int uR;

    public mZ(Integer num, View view, qF qFVar, TFq.ZRu zRu) {
        super(num, view, qFVar, 1000, zRu);
        this.uR = -1;
        NOt(view);
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public int Ht() {
        return 100;
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public void NOt(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public boolean mZ() {
        WeakReference<View> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.ZRu.get();
        if (this.uR == -1) {
            NOt(view);
        }
        return Ht.ZRu(view, this.uR == 1, this.NOt.dkT());
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public void uR() {
        super.uR();
    }

    private void NOt(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.uR = width * height >= 242500 ? 1 : 0;
        }
    }
}
