package com.bytedance.sdk.openadsdk.multipro.aidl.NOt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ZRu.uR.NOt ZRu;

    public ZRu(com.bytedance.sdk.openadsdk.ZRu.uR.NOt nOt) {
        this.ZRu = nOt;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.ZRu();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.ZRu.3
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.NOt();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.NOt.ZRu.4
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.mZ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        ZRu();
    }

    private void ZRu() {
        this.ZRu = null;
    }
}
