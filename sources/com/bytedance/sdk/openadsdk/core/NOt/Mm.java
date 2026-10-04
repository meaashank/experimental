package com.bytedance.sdk.openadsdk.core.NOt;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.bytedance.sdk.openadsdk.utils.sAl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mm extends mZ {
    private final com.bytedance.sdk.openadsdk.core.lp.ZRu NOt;
    private final String ZRu;
    private mZ mZ;

    public Mm(String str, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu) {
        this(str, zRu, null);
    }

    public void ZRu(mZ mZVar) {
        this.mZ = mZVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NOt.mZ, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public Mm(String str, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu, mZ mZVar) {
        this.ZRu = str;
        this.NOt = zRu;
        this.mZ = mZVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NOt.mZ
    public void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.lp.ZRu zRu = this.NOt;
        if (zRu != null) {
            zRu.TFq(this.ZRu);
        }
        if (view != null) {
            if (view.getId() == sAl.mZ) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == sAl.Mm) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.ZRu);
            }
        }
        mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.le = this.le;
            mZVar.MR = this.MR;
            mZVar.fcs = this.fcs;
            int i10 = this.fcs;
            mZVar.f140664Nb = i10;
            mZVar.VdW = i10;
            mZVar.ZRu(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
