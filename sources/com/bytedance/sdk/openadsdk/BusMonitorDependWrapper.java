package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.yBV.NOt;
import com.bytedance.sdk.openadsdk.yBV.NOt.ZRu;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BusMonitorDependWrapper implements NOt {
    private Handler NOt;
    private NOt ZRu;

    public BusMonitorDependWrapper(NOt nOt) {
        this.ZRu = nOt;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public Context getContext() {
        NOt nOt = this.ZRu;
        return (nOt == null || nOt.getContext() == null) ? getReflectContext() : this.ZRu.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public Handler getHandler() {
        NOt nOt = this.ZRu;
        if (nOt != null && nOt.getHandler() != null) {
            return this.ZRu.getHandler();
        }
        if (this.NOt == null) {
            HandlerThread handlerThread = new HandlerThread("pag_monitor");
            handlerThread.start();
            this.NOt = new Handler(handlerThread.getLooper());
        }
        return this.NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public int getOnceLogCount() {
        NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public int getOnceLogInterval() {
        NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        NOt nOt = this.ZRu;
        if (nOt == null || (uploadIntervalTime = nOt.getUploadIntervalTime()) < 1800000) {
            return 1800000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public boolean isMonitorOpen() {
        NOt nOt = this.ZRu;
        if (nOt != null) {
            return nOt.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.yBV.NOt
    public void onMonitorUpload(List<ZRu> list) {
        NOt nOt = this.ZRu;
        if (nOt != null) {
            nOt.onMonitorUpload(list);
        }
    }
}
