package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class ZH extends FA {
    private long NOt;
    private long ZRu;

    public ZH(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public void NOt(com.bytedance.sdk.openadsdk.core.model.qF qFVar, int i10) {
        if (isShown()) {
            return;
        }
        NOt();
        setVisibility(0);
        this.ZRu = SystemClock.elapsedRealtime();
        ZRu(qFVar, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.FA
    public boolean ZRu() {
        return false;
    }

    public long getDisplayDuration() {
        if (this.ZRu == 0) {
            return 0L;
        }
        if (this.NOt == 0) {
            this.NOt = SystemClock.elapsedRealtime();
        }
        return this.NOt - this.ZRu;
    }

    public void mZ() {
        setVisibility(8);
        if (this.ZRu != 0) {
            this.NOt = SystemClock.elapsedRealtime();
        }
    }

    public boolean uR() {
        return this.ZRu > 0 && this.NOt > 0;
    }
}
