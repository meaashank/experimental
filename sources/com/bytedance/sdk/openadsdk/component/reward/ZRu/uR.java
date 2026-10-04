package com.bytedance.sdk.openadsdk.component.reward.ZRu;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    private final com.bytedance.sdk.openadsdk.core.model.qF NOt;
    private final com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu TFq;
    com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Ht ZRu;
    private final String mZ;
    private boolean uR;

    public interface ZRu {
        void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray, int i10, int i11, int i12);

        void ZRu(String str, JSONObject jSONObject);
    }

    public uR(com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu) {
        this.TFq = zRu;
        this.NOt = zRu.NOt;
        this.mZ = zRu.TFq;
    }

    private void uR() {
        if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ() && this.NOt.IZ() == 4) {
            this.ZRu = com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Mm.ZRu(this.TFq.Qg, this.NOt, this.mZ);
        }
        if (this.ZRu == null) {
            this.ZRu = com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Mm.ZRu(this.TFq.AK, this.NOt, this.mZ);
        }
    }

    public void NOt() {
        com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Ht ht = this.ZRu;
        if (ht != null) {
            ht.uR();
        }
    }

    public void ZRu() {
        if (this.uR) {
            return;
        }
        this.uR = true;
        uR();
    }

    public com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Ht mZ() {
        return this.ZRu;
    }

    public void ZRu(View view, float f10, float f11, float f12, float f13, SparseArray<mZ.ZRu> sparseArray, int i10, int i11, int i12, ZRu zRu) {
        if (this.ZRu != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.sAl.TFq) {
                zRu.ZRu("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.sAl.uR) {
                zRu.ZRu("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.sAl.mZ) {
                zRu.ZRu("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.sAl.NOt) {
                    zRu.ZRu("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        zRu.ZRu(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
