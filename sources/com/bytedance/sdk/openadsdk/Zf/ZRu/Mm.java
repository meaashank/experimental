package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.lp;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    private static HandlerThread NOt;
    private static ZRu ZRu;

    public static class ZRu extends Handler {
        public ZRu(Looper looper) {
            super(looper);
        }

        public void ZRu(NOt nOt) {
            if (nOt == null) {
                return;
            }
            int iIntValue = nOt.ZH().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = nOt;
            sendMessageDelayed(messageObtain, nOt.Ht());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            NOt nOt = (NOt) message.obj;
            if (nOt == null) {
                return;
            }
            int iNOt = nOt.NOt();
            if (iNOt == 1) {
                nOt.Mm();
            } else {
                if (iNOt != 2) {
                    TFq.NOt(nOt.ZH());
                    return;
                }
                nOt.FA();
            }
            if (nOt.Vor()) {
                TFq.NOt(nOt.ZH());
            } else if (nOt.lp()) {
                ZRu(nOt);
            }
        }
    }

    public static void NOt(NOt nOt) {
        if (nOt == null || ZRu == null) {
            return;
        }
        try {
            int iIntValue = nOt.ZH().intValue();
            if (ZRu.hasMessages(iIntValue)) {
                ZRu.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void ZRu() {
    }

    public static void ZRu(NOt nOt) {
        if (nOt == null) {
            return;
        }
        NOt();
        ZRu zRu = ZRu;
        if (zRu != null) {
            zRu.ZRu(nOt);
        }
    }

    public static void NOt() {
        if (ZRu != null) {
            return;
        }
        try {
            HandlerThread handlerThread = NOt;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (Mm.class) {
                try {
                    HandlerThread handlerThread2 = NOt;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                        NOt = handlerThread3;
                        handlerThread3.start();
                        ZRu = new ZRu(NOt.getLooper());
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            lp.ZRu("MRC", th.getMessage());
        }
    }
}
