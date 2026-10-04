package com.bytedance.sdk.component.FA.ZRu;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ru;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private Handler NOt;
    private final uR<NOt> ZRu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.FA.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0402ZRu {
        private static final ZRu ZRu = new ZRu();
    }

    public Handler NOt() {
        if (this.NOt == null) {
            synchronized (ZRu.class) {
                try {
                    if (this.NOt == null) {
                        this.NOt = ZRu("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.NOt;
    }

    private ZRu() {
        this.ZRu = uR.ZRu(2);
    }

    public static ZRu ZRu() {
        return C0402ZRu.ZRu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.FA.ZRu.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.this.ZRu(handler, handler2);
                }
            }, 1000L);
        }
    }

    private NOt NOt(ru.ZRu zRu, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new NOt(handlerThread, zRu);
    }

    public ru ZRu(ru.ZRu zRu, final String str) {
        NOt nOt = (NOt) this.ZRu.ZRu();
        if (nOt != null) {
            nOt.ZRu(zRu);
            nOt.post(new Runnable() { // from class: com.bytedance.sdk.component.FA.ZRu.ZRu.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return nOt;
        }
        return NOt(zRu, str);
    }

    public ru ZRu(String str) {
        return ZRu((ru.ZRu) null, str);
    }

    public boolean ZRu(ru ruVar) {
        if (!(ruVar instanceof NOt)) {
            return false;
        }
        NOt nOt = (NOt) ruVar;
        if (this.ZRu.ZRu(nOt)) {
            return true;
        }
        nOt.NOt();
        return true;
    }
}
