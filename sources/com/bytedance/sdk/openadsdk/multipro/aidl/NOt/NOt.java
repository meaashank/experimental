package com.bytedance.sdk.openadsdk.multipro.aidl.NOt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.mZ.uR;
import com.bytedance.sdk.openadsdk.mZ.aT;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends IDislikeClosedListener.Stub {
    private final String NOt;
    private final uR.ZRu ZRu;

    public NOt(String str, uR.ZRu zRu) {
        this.NOt = str;
        this.ZRu = zRu;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.NOt.1
            @Override // java.lang.Runnable
            public void run() {
                if (NOt.this.ZRu != null) {
                    NOt.this.ZRu.ZRu();
                    aT.ZRu(6, NOt.this.NOt);
                }
            }
        });
    }
}
