package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.Ht;

/* JADX INFO: loaded from: classes3.dex */
public interface IADLoader<R extends PAGRequest, L extends Ht> {
    void loadAd(String str, R r10, L l10);
}
