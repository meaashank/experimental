package com.prism.fusionadsdk.internal.config;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes6.dex */
public class AdConfig {
    public String adNetworkName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f162307id;
    public String type;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{adNetworkName:");
        sb2.append(this.adNetworkName);
        sb2.append(",type:");
        sb2.append(this.type);
        sb2.append(",id:");
        return e.a(sb2, this.f162307id, "}");
    }
}
