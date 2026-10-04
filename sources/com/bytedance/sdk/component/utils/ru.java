package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ru extends Handler {
    protected WeakReference<ZRu> ZRu;

    public interface ZRu {
        void ZRu(Message message);
    }

    public ru(ZRu zRu) {
        if (zRu != null) {
            this.ZRu = new WeakReference<>(zRu);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ZRu zRu;
        WeakReference<ZRu> weakReference = this.ZRu;
        if (weakReference == null || (zRu = weakReference.get()) == null || message == null) {
            return;
        }
        zRu.ZRu(message);
    }

    public ru(Looper looper, ZRu zRu) {
        super(looper);
        if (zRu != null) {
            this.ZRu = new WeakReference<>(zRu);
        }
    }
}
