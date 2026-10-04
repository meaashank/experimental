package com.iab.omid.library.mmadbridge.adsession.media;

import W3.o;
import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f151538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f151539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f151540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f151541d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f151538a = z10;
        this.f151539b = f10;
        this.f151540c = z11;
        this.f151541d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f151538a);
            if (this.f151538a) {
                jSONObject.put("skipOffset", this.f151539b);
            }
            jSONObject.put("autoPlay", this.f151540c);
            jSONObject.put(o.f76584m, this.f151541d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f151541d;
    }

    public Float getSkipOffset() {
        return this.f151539b;
    }

    public boolean isAutoPlay() {
        return this.f151540c;
    }

    public boolean isSkippable() {
        return this.f151538a;
    }
}
