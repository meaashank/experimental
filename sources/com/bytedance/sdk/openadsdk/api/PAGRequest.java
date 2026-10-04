package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRequest {
    private Map<String, Object> NOt;
    private String ZRu;
    private Bundle mZ = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.mZ == null) {
            this.mZ = new Bundle();
        }
        this.mZ.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.ZRu;
    }

    public Map<String, Object> getExtraInfo() {
        return this.NOt;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.mZ;
    }

    public void setAdString(String str) {
        this.ZRu = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.NOt = map;
    }
}
