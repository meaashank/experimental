package com.bytedance.sdk.openadsdk.multipro.aidl.NOt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu ZRu;

    public uR(com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu zRu) {
        this.ZRu = zRu;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR.3
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.ZRu != null) {
                    uR.this.ZRu.NOt();
                }
                uR.this.ZRu();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR.1
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.ZRu != null) {
                    uR.this.ZRu.ZRu();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR.2
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.ZRu != null) {
                    uR.this.ZRu.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.uR.4
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.ZRu != null) {
                    uR.this.ZRu.ZRu(z10, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu() {
        this.ZRu = null;
    }
}
