package com.bytedance.sdk.openadsdk.core.Ht.ZRu;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.NOt.ZH;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.model.edo;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends mZ implements com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu {
    protected WeakReference<View> NOt;
    protected WeakReference<View> ZRu;
    private ZH mZ;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu
    public void NOt(View view) {
        this.NOt = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu
    public void ZRu(ZH zh) {
        this.mZ = zh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu
    public void ZRu(View view) {
        this.ZRu = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NOt.mZ
    public void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray, boolean z10) {
        ZRu(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void ZRu(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray) {
        if (this.mZ != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.NOt;
            if (weakReference != null) {
                int[] iArrZRu = Cox.ZRu(weakReference.get());
                if (iArrZRu != null) {
                    iArr = iArrZRu;
                }
                int[] iArrMZ = Cox.mZ(this.NOt.get());
                if (iArrMZ != null) {
                    iArr2 = iArrMZ;
                }
            }
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.ZRu.to;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.mZ.ZRu(view, i10, new edo.ZRu().uR(f10).mZ(f11).NOt(f12).ZRu(f13).NOt(this.le).ZRu(this.MR).mZ(iArr[0]).uR(iArr[1]).TFq(iArr2[0]).Ht(iArr2[1]).ZRu(sparseArray).ZRu(this.WD).ZRu(strValueOf).ZRu());
        }
    }
}
