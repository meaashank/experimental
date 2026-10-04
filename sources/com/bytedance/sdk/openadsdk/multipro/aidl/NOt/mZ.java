package com.bytedance.sdk.openadsdk.multipro.aidl.NOt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ZRu.mZ.NOt ZRu;

    public mZ(com.bytedance.sdk.openadsdk.ZRu.mZ.NOt nOt) {
        this.ZRu = nOt;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.mZ.3
            @Override // java.lang.Runnable
            public void run() {
                if (mZ.this.ZRu != null) {
                    mZ.this.ZRu.NOt();
                }
                mZ.this.ZRu();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.mZ.1
            @Override // java.lang.Runnable
            public void run() {
                if (mZ.this.ZRu != null) {
                    mZ.this.ZRu.ZRu();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.mZ.2
            @Override // java.lang.Runnable
            public void run() {
                if (mZ.this.ZRu != null) {
                    mZ.this.ZRu.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu() {
        this.ZRu = null;
    }
}
