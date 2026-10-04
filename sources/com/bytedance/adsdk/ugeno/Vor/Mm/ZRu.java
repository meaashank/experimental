package com.bytedance.adsdk.ugeno.Vor.Mm;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu extends com.bytedance.adsdk.ugeno.NOt.ZRu<com.bytedance.adsdk.ugeno.Vor.NOt.ZRu> {
    public ZRu(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                NOt(str, str2);
                break;
        }
    }
}
