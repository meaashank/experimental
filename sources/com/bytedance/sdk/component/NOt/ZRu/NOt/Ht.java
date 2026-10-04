package com.bytedance.sdk.component.NOt.ZRu.NOt;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
final class Ht {
    static long NOt;
    static TFq ZRu;

    private Ht() {
    }

    public static TFq ZRu() {
        synchronized (Ht.class) {
            TFq tFq = ZRu;
            if (tFq == null) {
                return new TFq();
            }
            ZRu = tFq.Ht;
            tFq.Ht = null;
            NOt -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return tFq;
        }
    }

    public static void ZRu(TFq tFq) {
        if (tFq.Ht == null && tFq.Mm == null) {
            if (tFq.uR) {
                return;
            }
            synchronized (Ht.class) {
                try {
                    long j10 = NOt;
                    if (j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                        return;
                    }
                    NOt = j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    tFq.Ht = ZRu;
                    tFq.mZ = 0;
                    tFq.NOt = 0;
                    ZRu = tFq;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
