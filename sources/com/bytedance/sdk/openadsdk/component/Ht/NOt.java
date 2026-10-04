package com.bytedance.sdk.openadsdk.component.Ht;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements Handler.Callback {
    private boolean Mm;
    private final com.bytedance.sdk.openadsdk.component.FA.ZRu NOt;
    private ZRu mZ;
    private Handler ZRu = new Handler(Looper.myLooper(), this);
    private int uR = 0;
    private int TFq = 5;
    private int Ht = 0;

    public NOt(com.bytedance.sdk.openadsdk.component.FA.ZRu zRu) {
        this.NOt = zRu;
    }

    public void NOt(int i10) {
        this.Ht = i10;
    }

    public void TFq() {
        this.ZRu.removeCallbacksAndMessages(null);
        this.ZRu = null;
    }

    public void ZRu(int i10) {
        this.uR = i10;
        int i11 = this.TFq - i10;
        this.NOt.ZRu(i11);
        if (i10 <= 0) {
            ZRu zRu = this.mZ;
            if (zRu != null && !this.Mm) {
                zRu.NOt();
                this.Mm = true;
            }
            i10 = 0;
        }
        boolean z10 = i11 >= this.Ht;
        ZRu zRu2 = this.mZ;
        if (zRu2 != null) {
            zRu2.ZRu(i10, i11, z10);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.ZRu != null) {
            int i10 = message.arg1;
            ZRu(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.ZRu.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }

    public void mZ() {
        if (this.ZRu != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.uR;
            this.ZRu.sendMessage(messageObtain);
        }
    }

    public void uR() {
        Handler handler = this.ZRu;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void NOt() {
        Handler handler = this.ZRu;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.TFq, 0));
        }
    }

    public void ZRu(float f10) {
        int i10 = (int) f10;
        this.TFq = i10;
        if (i10 <= 0) {
            this.TFq = 5;
        }
    }

    public void ZRu(ZRu zRu) {
        this.mZ = zRu;
    }

    public int ZRu() {
        return this.Ht;
    }
}
