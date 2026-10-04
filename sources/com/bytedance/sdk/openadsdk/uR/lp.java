package com.bytedance.sdk.openadsdk.uR;

import U9.J0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.qF;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lp {
    private static volatile lp ZRu;
    private Map<String, Object> Ht;
    private HandlerThread NOt;
    private final Handler mZ;
    private final Executor uR = Executors.newCachedThreadPool();
    private NOt TFq = NOt.ZRu();

    public static class NOt {
        public int ZRu = 300;
        public int NOt = J0.f73938b;

        private NOt() {
        }

        public static NOt ZRu() {
            return new NOt();
        }
    }

    public static class ZRu implements Serializable, Runnable {
        public Map<String, Object> TFq;
        public qF mZ;
        public String uR;
        public final AtomicInteger ZRu = new AtomicInteger(0);
        public final AtomicBoolean NOt = new AtomicBoolean(false);

        public ZRu(qF qFVar, String str, Map<String, Object> map) {
            this.mZ = qFVar;
            this.uR = str;
            this.TFq = map;
        }

        public static ZRu ZRu(qF qFVar, String str, Map<String, Object> map) {
            return new ZRu(qFVar, str, map);
        }

        public void NOt() {
            this.ZRu.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mZ == null || TextUtils.isEmpty(this.uR)) {
                return;
            }
            String str = this.NOt.get() ? "dpl_success" : "dpl_failed";
            if (this.TFq == null) {
                this.TFq = new HashMap();
            }
            qF qFVar = this.mZ;
            if (qFVar != null && qFVar.Jf() == 0) {
                Map<String, Object> map = this.TFq;
                qF qFVar2 = this.mZ;
                map.put("auto_click", Boolean.valueOf((qFVar2 == null || qFVar2.uR()) ? false : true));
            }
            this.TFq.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.oK.ZRu().mZ()));
            mZ.ZRu(this.mZ, this.uR, str, this.TFq);
        }

        public ZRu ZRu(boolean z10) {
            this.NOt.set(z10);
            return this;
        }

        public int ZRu() {
            return this.ZRu.get();
        }
    }

    private lp() {
        if (this.NOt == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.NOt = handlerThread;
            handlerThread.start();
        }
        this.mZ = new Handler(this.NOt.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.uR.lp.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                Object obj = message.obj;
                ZRu zRu = (obj == null || !(obj instanceof ZRu)) ? null : (ZRu) obj;
                if (zRu == null) {
                    return true;
                }
                lp.this.NOt(zRu);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(ZRu zRu) {
        if (zRu == null) {
            return;
        }
        boolean zUR = com.bytedance.sdk.openadsdk.core.oK.ZRu().uR();
        boolean zZRu = com.bytedance.sdk.openadsdk.core.oK.ZRu().ZRu(true);
        if (!zUR && zZRu) {
            ZRu(zRu);
            return;
        }
        if (zRu.TFq == null) {
            zRu.TFq = new HashMap();
        }
        zRu.TFq.put("is_background", Boolean.valueOf(zUR));
        zRu.TFq.put("has_focus", Boolean.valueOf(zZRu));
        mZ(zRu.ZRu(true));
    }

    private void mZ(ZRu zRu) {
        if (zRu == null) {
            return;
        }
        this.uR.execute(zRu);
    }

    public static lp ZRu() {
        if (ZRu == null) {
            synchronized (lp.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new lp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public lp ZRu(Map<String, Object> map) {
        this.Ht = map;
        return ZRu();
    }

    public void ZRu(qF qFVar, String str) {
        Message messageObtainMessage = this.mZ.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = ZRu.ZRu(qFVar, str, this.Ht);
        messageObtainMessage.sendToTarget();
    }

    private void ZRu(ZRu zRu) {
        if (zRu == null) {
            return;
        }
        zRu.NOt();
        int iZRu = zRu.ZRu();
        NOt nOt = this.TFq;
        if (iZRu * nOt.ZRu > nOt.NOt) {
            mZ(zRu.ZRu(false));
            return;
        }
        Message messageObtainMessage = this.mZ.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = zRu;
        this.mZ.sendMessageDelayed(messageObtainMessage, this.TFq.ZRu);
    }
}
