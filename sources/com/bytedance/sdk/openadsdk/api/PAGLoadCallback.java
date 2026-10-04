package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import e.I;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadCallback<Ad> {
    @I
    void onAdLoaded(Ad ad2);

    @I
    void onError(@NonNull PAGErrorModel pAGErrorModel);
}
