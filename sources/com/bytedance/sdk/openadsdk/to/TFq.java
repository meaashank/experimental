package com.bytedance.sdk.openadsdk.to;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements uR {
    private uR NOt;
    Handler ZRu = null;

    public TFq(uR uRVar) {
        this.NOt = uRVar;
    }

    private Context FA() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public JSONObject Ht() {
        uR uRVar = this.NOt;
        if (uRVar != null) {
            return uRVar.Ht();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public Map<String, String> Mm() {
        uR uRVar = this.NOt;
        return (uRVar == null || uRVar.Mm() == null) ? new HashMap() : this.NOt.Mm();
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public Context NOt() {
        uR uRVar = this.NOt;
        return (uRVar == null || uRVar.NOt() == null) ? FA() : this.NOt.NOt();
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public String TFq() {
        uR uRVar = this.NOt;
        if (uRVar != null) {
            return uRVar.TFq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public ExecutorService ZRu() {
        uR uRVar = this.NOt;
        return (uRVar == null || uRVar.ZRu() == null) ? Executors.newCachedThreadPool() : this.NOt.ZRu();
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public String mZ() {
        uR uRVar = this.NOt;
        return (uRVar == null || TextUtils.isEmpty(uRVar.mZ())) ? "null" : this.NOt.mZ();
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public Handler uR() {
        uR uRVar = this.NOt;
        if (uRVar != null && uRVar.Mm() != null) {
            return this.NOt.uR();
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.ZRu = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.to.uR
    public JSONObject ZRu(JSONObject jSONObject) {
        uR uRVar = this.NOt;
        return uRVar != null ? uRVar.ZRu(jSONObject) : jSONObject;
    }
}
