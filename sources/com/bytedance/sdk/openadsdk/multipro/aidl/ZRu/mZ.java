package com.bytedance.sdk.openadsdk.multipro.aidl.ZRu;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends ZRu {
    private static volatile mZ NOt;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> ZRu = new HashMap<>();

    public static mZ ZRu() {
        if (NOt == null) {
            synchronized (mZ.class) {
                try {
                    if (NOt == null) {
                        NOt = new mZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackListRemove = ZRu.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i10);
            if (iCommonPermissionListener != null) {
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        ZRu.put(str, remoteCallbackList);
    }
}
