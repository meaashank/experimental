package com.bytedance.sdk.openadsdk.WMI.ZRu;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.TFq.FA;
import com.bytedance.sdk.component.TFq.ZH;
import com.bytedance.sdk.component.TFq.yBV;
import com.bytedance.sdk.openadsdk.Vor.uR;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public interface InterfaceC0430ZRu {
        void ZRu(int i10, String str, Throwable th);

        void ZRu(String str, NOt nOt);
    }

    public void ZRu(com.bytedance.sdk.openadsdk.WMI.ZRu zRu, final InterfaceC0430ZRu interfaceC0430ZRu, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, qF qFVar) {
        uR.ZRu(zRu.ZRu).ZRu(zRu.NOt).ZRu(i10).NOt(i11).TFq(Cox.uR(WMI.ZRu())).uR(Cox.mZ(WMI.ZRu())).NOt(str).ZRu(Bitmap.Config.RGB_565).ZRu(scaleType).ZRu(!TextUtils.isEmpty(str)).ZRu(new FA() { // from class: com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu.2
            @Override // com.bytedance.sdk.component.TFq.FA
            public Bitmap ZRu(Bitmap bitmap) {
                return i12 <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.uR.ZRu.ZRu(WMI.ZRu(), bitmap, i12);
            }
        }).ZRu(new com.bytedance.sdk.openadsdk.Vor.NOt(qFVar, zRu.ZRu, new yBV() { // from class: com.bytedance.sdk.openadsdk.WMI.ZRu.ZRu.1
            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(ZH zh) {
                ZRu.this.ZRu(zh, interfaceC0430ZRu);
            }

            @Override // com.bytedance.sdk.component.TFq.yBV
            public void ZRu(int i13, String str2, Throwable th) {
                ZRu.this.ZRu(i13, str2, th, interfaceC0430ZRu);
            }
        }));
    }

    public void ZRu(ZH zh, InterfaceC0430ZRu interfaceC0430ZRu) {
        if (interfaceC0430ZRu != null) {
            Object objNOt = zh.NOt();
            int iZRu = ZRu(zh);
            if (objNOt instanceof byte[]) {
                interfaceC0430ZRu.ZRu(zh.ZRu(), new NOt((byte[]) objNOt, iZRu));
                return;
            }
            if (objNOt instanceof Bitmap) {
                interfaceC0430ZRu.ZRu(zh.ZRu(), new NOt((Bitmap) objNOt, zh.mZ() instanceof Bitmap ? (Bitmap) zh.mZ() : null, iZRu));
            } else {
                interfaceC0430ZRu.ZRu(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int ZRu(ZH zh) {
        Object obj;
        Map<String, String> mapUR = zh.uR();
        if (mapUR == null || (obj = mapUR.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void ZRu(int i10, String str, Throwable th, InterfaceC0430ZRu interfaceC0430ZRu) {
        if (interfaceC0430ZRu != null) {
            interfaceC0430ZRu.ZRu(i10, str, th);
        }
    }
}
