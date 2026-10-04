package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class Ht implements ZH, Runnable {
    private boolean FA;
    private boolean Ht;
    private final ZRu Mm;
    private final Activity NOt;
    private long TFq;
    private long uR;
    private final AtomicBoolean Vor = new AtomicBoolean(false);
    private final Handler mZ = new Handler(Looper.getMainLooper());
    private View ZRu = uR();

    public interface ZRu {
        void NOt();

        View ZRu();
    }

    private Ht(Activity activity, int i10, ZRu zRu) {
        this.Mm = zRu;
        this.NOt = activity;
        this.uR = i10;
    }

    private void Ht() {
        Activity activity;
        View childAt;
        if (this.Ht || (activity = this.NOt) == null || activity.isFinishing() || this.NOt.isDestroyed()) {
            return;
        }
        if (this.ZRu == null) {
            this.ZRu = uR();
        }
        View view = this.ZRu;
        if (view != null) {
            if (NOt(view)) {
                ZRu(this.ZRu);
                View view2 = this.ZRu;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.ZRu).getChildAt(0)) != null && NOt(childAt)) {
                    ZRu(childAt);
                }
                ZRu zRu = this.Mm;
                if (zRu != null) {
                    zRu.NOt();
                }
            }
            Mm();
        }
        this.Ht = true;
    }

    private void Mm() {
        ViewParent parent = this.ZRu.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.ZRu) != r0.getChildCount() - 1) {
                this.ZRu.bringToFront();
            }
        }
    }

    private void TFq() {
        this.FA = false;
        this.TFq = SystemClock.elapsedRealtime();
        Handler handler = this.mZ;
        if (handler != null) {
            handler.postDelayed(this, this.uR);
        }
    }

    public static ZH ZRu(Activity activity, ZRu zRu) {
        int iAOL = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().AOL();
        return iAOL < 0 ? new ZH() { // from class: com.bytedance.sdk.openadsdk.utils.Ht.1
            @Override // com.bytedance.sdk.openadsdk.utils.ZH
            public void NOt() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ZH
            public void ZRu() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ZH
            public void mZ() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ZH
            public void ZRu(long j10) {
            }
        } : new Ht(activity, Math.min(iAOL, 50) * 1000, zRu);
    }

    private View uR() {
        ZRu zRu = this.Mm;
        if (zRu != null) {
            return zRu.ZRu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.ZH
    public void NOt() {
        if (this.TFq <= 0 || this.Ht) {
            return;
        }
        if (!this.FA) {
            this.uR -= SystemClock.elapsedRealtime() - this.TFq;
        }
        this.FA = true;
        if (this.uR <= 0) {
            Ht();
            return;
        }
        Handler handler = this.mZ;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.ZH
    public void mZ() {
        if (this.Ht) {
            return;
        }
        this.Ht = true;
        Handler handler = this.mZ;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Ht();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.ZH
    public void ZRu(long j10) {
        if (this.Vor.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.uR += j10;
            TFq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.ZH
    public void ZRu() {
        if (this.TFq == 0 || !this.FA) {
            return;
        }
        TFq();
    }

    private void ZRu(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean NOt(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
