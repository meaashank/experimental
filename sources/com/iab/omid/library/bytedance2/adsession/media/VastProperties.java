package com.iab.omid.library.bytedance2.adsession.media;

import W3.o;
import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f151280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f151281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f151282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f151283d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f151280a = z10;
        this.f151281b = f10;
        this.f151282c = z11;
        this.f151283d = position;
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
            jSONObject.put("skippable", this.f151280a);
            if (this.f151280a) {
                jSONObject.put("skipOffset", this.f151281b);
            }
            jSONObject.put("autoPlay", this.f151282c);
            jSONObject.put(o.f76584m, this.f151283d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f151283d;
    }

    public Float getSkipOffset() {
        return this.f151281b;
    }

    public boolean isAutoPlay() {
        return this.f151282c;
    }

    public boolean isSkippable() {
        return this.f151280a;
    }
}
