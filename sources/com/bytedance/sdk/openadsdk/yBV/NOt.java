package com.bytedance.sdk.openadsdk.yBV;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface NOt {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.yBV.NOt.ZRu> list);
}
