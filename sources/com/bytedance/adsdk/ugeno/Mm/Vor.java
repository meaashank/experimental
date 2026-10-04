package com.bytedance.adsdk.ugeno.Mm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends Handler {
    private final WeakReference<ZRu> ZRu;

    public interface ZRu {
        void ZRu(Message message);
    }

    public Vor(Looper looper, ZRu zRu) {
        super(looper);
        this.ZRu = new WeakReference<>(zRu);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ZRu zRu = this.ZRu.get();
        if (zRu == null || message == null) {
            return;
        }
        zRu.ZRu(message);
    }
}
