package com.bytedance.adsdk.ugeno.uR.mZ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.Mm.Vor;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends ZRu implements Vor.ZRu {
    private int Vor;
    private Handler ZH;
    private int aT;
    private int lp;

    public TFq(Context context) {
        super(context);
        this.aT = 0;
        this.ZH = new Vor(Looper.getMainLooper(), this);
        this.lp = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.uR.mZ.ZRu
    public boolean ZRu(Object... objArr) {
        Map<String, String> map = this.TFq;
        if (map != null) {
            int iZRu = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(map.get("loop"), 0);
            this.Vor = iZRu;
            if (iZRu <= 0) {
                this.lp = -1;
            } else {
                this.lp = iZRu;
            }
            this.aT = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(this.TFq.get(x.h.f238399b), 0);
        }
        this.ZH.sendEmptyMessageDelayed(1001, this.aT);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.Mm.Vor.ZRu
    public void ZRu(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.lp);
        this.ZRu.ZRu(this.NOt, this.Ht, this.mZ.NOt());
        int i12 = this.lp + (-1);
        this.lp = i12;
        if (i12 < 0 && (i11 = this.aT) != 0) {
            this.ZH.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.aT) != 0) {
            this.ZH.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.ZH.removeMessages(1001);
        }
    }
}
