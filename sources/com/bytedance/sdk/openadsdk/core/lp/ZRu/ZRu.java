package com.bytedance.sdk.openadsdk.core.lp.ZRu;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum ZRu {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int FA;

    ZRu(int i10) {
        this.FA = i10;
    }

    @NonNull
    public String ZRu() {
        return String.valueOf(this.FA);
    }
}
