package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.view.View;
import androidx.core.view.G;
import com.bytedance.sdk.openadsdk.Zf.ZRu.TFq;
import com.bytedance.sdk.openadsdk.core.model.qF;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NOt {
    private final Integer FA;
    private final TFq.ZRu Ht;
    private final int Mm;
    protected qF NOt;
    private final AtomicBoolean TFq;
    private volatile boolean Vor = false;
    protected WeakReference<View> ZRu;
    protected final AtomicBoolean mZ;
    private final AtomicLong uR;

    public NOt(Integer num, View view, qF qFVar, int i10, TFq.ZRu zRu) {
        this.FA = num;
        this.Mm = i10;
        this.NOt = qFVar;
        this.Ht = zRu;
        ZRu(view);
        this.mZ = new AtomicBoolean(false);
        this.uR = new AtomicLong(-1L);
        this.TFq = new AtomicBoolean(false);
    }

    public static NOt ZRu(boolean z10, Integer num, View view, qF qFVar, TFq.ZRu zRu) {
        return z10 ? new FA(num, view, qFVar, zRu) : new mZ(num, view, qFVar, zRu);
    }

    public void FA() {
        this.uR.set(-1L);
    }

    public abstract int Ht();

    public void Mm() {
        if (Vor()) {
            return;
        }
        if (!this.mZ.get()) {
            FA();
        } else if (!this.uR.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.uR.get() >= this.Mm) {
            uR();
        }
    }

    public int NOt() {
        if (Vor()) {
            return 1;
        }
        WeakReference<View> weakReference = this.ZRu;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.Vor) {
            return 3;
        }
        if (ZH().equals(view.getTag(G.f111542t))) {
            return (ZH().equals(view.getTag(G.f111542t)) && mZ()) ? 1 : 2;
        }
        aT();
        TFq.NOt(ZH());
        return 3;
    }

    public abstract void NOt(int i10);

    public ZRu TFq() {
        WeakReference<View> weakReference = this.ZRu;
        if (weakReference == null) {
            return new ZRu(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new ZRu(0, 0, 0.0f) : new ZRu(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public boolean Vor() {
        return this.TFq.get();
    }

    public Integer ZH() {
        return this.FA;
    }

    public void aT() {
        this.Vor = true;
        Mm.NOt(this);
    }

    public boolean lp() {
        return this.mZ.get();
    }

    public abstract boolean mZ();

    public void sAl() {
        this.mZ.set(false);
        FA();
    }

    public void uR() {
        if (this.TFq.compareAndSet(false, true)) {
            uR.ZRu(this.NOt, TFq(), this.Ht);
        }
    }

    public void ZRu() {
        if (this.mZ.compareAndSet(false, true)) {
            Mm.ZRu(this);
        }
    }

    public void ZRu(int i10) {
        if (i10 == 4) {
            ZRu();
            return;
        }
        if (i10 == 8) {
            sAl();
        } else if (i10 == 9) {
            uR();
        } else {
            NOt(i10);
        }
    }

    public void ZRu(View view) {
        if (view != null) {
            view.setTag(G.f111542t, ZH());
        }
        this.ZRu = new WeakReference<>(view);
    }
}
