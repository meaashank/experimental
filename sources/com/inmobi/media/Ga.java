package com.inmobi.media;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ga extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ga f151994a = new Ga();

    public Ga() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() throws JSONException {
        JSONObject jSONObjectA = AbstractC3600ja.a("left", 0, "top", 0);
        jSONObjectA.put("right", 0);
        return jSONObjectA.put("bottom", 0);
    }
}
