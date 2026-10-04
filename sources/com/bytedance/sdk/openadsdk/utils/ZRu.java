package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements Application.ActivityLifecycleCallbacks {
    public static long NOt = 0;
    public static boolean ZRu = false;
    public static long mZ;
    private volatile WeakReference<Activity> sAl;
    private final AtomicBoolean uR = new AtomicBoolean(false);
    private final RunnableC0474ZRu TFq = new RunnableC0474ZRu();
    private final uR Ht = new uR();
    private final mZ Mm = new mZ();
    private final NOt FA = new NOt();
    private int Vor = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.ZRu>> aT = new CopyOnWriteArrayList<>();
    private HandlerThread ZH = null;
    private Handler lp = null;
    private final LinkedList<Activity> edo = new LinkedList<>();

    public static class NOt implements Runnable {
        private NOt() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.Ht.NOt.ZRu().NOt();
            com.bytedance.sdk.openadsdk.uR.ZRu.edo edoVarHNL = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().hNL();
            if (edoVarHNL == null || edoVarHNL.ZRu() || !com.bytedance.sdk.component.utils.oK.FA(com.bytedance.sdk.openadsdk.core.WMI.ZRu())) {
                return;
            }
            com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.core.lp.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()));
        }
    }

    public class TFq implements Runnable {
        private long NOt;
        private long mZ;
        private boolean uR;

        public TFq(long j10, long j11, boolean z10) {
            this.NOt = j10;
            this.mZ = j11;
            this.uR = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.uR) {
                com.bytedance.sdk.openadsdk.edo.mZ.ZRu().ZRu(this.NOt / 1000, this.mZ / 1000);
            }
            ZRu.this.uR();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ZRu$ZRu, reason: collision with other inner class name */
    public static class RunnableC0474ZRu implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            WD.mZ(new com.bytedance.sdk.component.FA.FA("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.ZRu.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class mZ implements Runnable {
        public mZ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerNOt = com.bytedance.sdk.openadsdk.core.edo.NOt();
                Message messageObtain = Message.obtain(handlerNOt, ZRu.this.TFq);
                messageObtain.what = 1001;
                handlerNOt.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    public class uR implements Runnable {
        public uR() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.edo.NOt().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.WMI.ZRu() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.aT.ZRu.NOt();
        }
    }

    public ZRu() {
        mZ();
    }

    private void mZ() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.ZH = handlerThread;
        handlerThread.start();
        this.lp = new Handler(this.ZH.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uR() {
        com.bytedance.sdk.openadsdk.uR.ZRu.ZRu.ZRu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.edo.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.aT != null && this.aT.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.ZRu> weakReference : this.aT) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().ZRu(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.sAl != null && this.sAl.get() == activity) {
            this.sAl = null;
        }
        this.edo.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.Vor - 1;
        this.Vor = i10;
        if (i10 < 0) {
            this.Vor = 0;
        }
        if (ApmHelper.isIsInit()) {
            ZRu(this.Mm);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ZRu(this.Ht);
        if (!ZRu) {
            NOt = System.currentTimeMillis();
            ZRu = true;
        }
        this.sAl = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.Vor++;
        this.lp.removeCallbacks(this.FA);
        if (this.uR.get()) {
            ZRu(this.FA);
        }
        this.uR.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.Vor <= 0) {
            this.uR.set(true);
        }
        if (ZRu()) {
            ZRu = false;
            com.bytedance.sdk.openadsdk.core.edo.NOt.set(false);
            mZ = System.currentTimeMillis();
            ZRu(this.FA);
        }
        ZRu(new TFq(NOt, mZ, ZRu()));
    }

    private void ZRu(Runnable runnable) {
        if (!this.ZH.isAlive()) {
            mZ();
        }
        this.lp.postDelayed(runnable, 1000L);
    }

    public boolean NOt(com.bytedance.sdk.component.adexpress.ZRu zRu) {
        return this.aT.remove(new WeakReference(zRu));
    }

    public Activity NOt() {
        if (this.edo.isEmpty()) {
            return null;
        }
        return this.edo.getFirst();
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.ZRu zRu) {
        this.aT.add(new WeakReference<>(zRu));
    }

    public boolean ZRu() {
        return this.uR.get();
    }

    public boolean ZRu(boolean z10) {
        Activity activity;
        Window window;
        return (this.sAl == null || (activity = this.sAl.get()) == null || (window = activity.getWindow()) == null) ? z10 : window.getDecorView().hasWindowFocus();
    }
}
