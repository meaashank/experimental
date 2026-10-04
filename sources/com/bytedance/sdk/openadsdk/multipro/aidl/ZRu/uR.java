package com.bytedance.sdk.openadsdk.multipro.aidl.ZRu;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends ZRu {
    private static volatile uR NOt;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> ZRu = new ConcurrentHashMap<>();

    public static uR ZRu() {
        if (NOt == null) {
            synchronized (uR.class) {
                try {
                    if (NOt == null) {
                        NOt = new uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        ZRu(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        ZRu.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ZRu.remove(str);
    }

    private synchronized void ZRu(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = ZRu;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        lp.ZRu("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            lp.ZRu("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
