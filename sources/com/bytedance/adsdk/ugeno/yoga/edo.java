package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes2.dex */
public class edo extends YogaNodeJNIBase {
    public void finalize() throws Throwable {
        try {
            lp();
        } finally {
            super.finalize();
        }
    }

    public void lp() {
        long j10 = this.ZRu;
        if (j10 != 0) {
            this.ZRu = 0L;
            YogaNative.jni_YGNodeDeallocateJNI(j10);
        }
    }
}
