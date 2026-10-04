package com.inmobi.ads;

import com.inmobi.media.C3604k0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AdMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f151662b;

    public AdMetaInfo(@NotNull String creativeID, @Nullable JSONObject jSONObject) {
        G.p(creativeID, "creativeID");
        this.f151661a = creativeID;
        this.f151662b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f151662b;
        if (jSONObject != null) {
            return jSONObject.optDouble(C3604k0.BUYER_PRICE);
        }
        return 0.0d;
    }

    @NotNull
    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f151662b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Nullable
    public final String getBidKeyword() {
        JSONObject jSONObject = this.f151662b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    @NotNull
    public final String getCreativeID() {
        return this.f151661a;
    }
}
