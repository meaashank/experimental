package com.bytedance.sdk.component.FA.ZRu;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.ru;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ru implements mZ {
    private final HandlerThread NOt;

    public NOt(HandlerThread handlerThread, ru.ZRu zRu) {
        super(handlerThread.getLooper(), zRu);
        this.NOt = handlerThread;
    }

    public void NOt() {
        HandlerThread handlerThread = this.NOt;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.FA.ZRu.mZ
    public void ZRu() {
        removeCallbacksAndMessages(null);
        WeakReference<ru.ZRu> weakReference = this.ZRu;
        if (weakReference != null) {
            weakReference.clear();
            this.ZRu = null;
        }
    }

    public void ZRu(ru.ZRu zRu) {
        this.ZRu = new WeakReference<>(zRu);
    }
}
