package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class P0 extends C3525e5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f152365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f152366h;

    public P0(String str, int i10, String trace) {
        kotlin.jvm.internal.G.p(trace, "trace");
        StringBuilder sb2 = new StringBuilder("reason - ");
        sb2.append(i10);
        sb2.append(" description - ");
        sb2.append(str == null ? "ApplicationExit" : str);
        String message = sb2.toString();
        ScheduledExecutorService scheduledExecutorService = Cc.f151826a;
        kotlin.jvm.internal.G.p(message, "message");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        super("AppExitReasonReporting", "AppExitReasonEvent", string);
        this.f152365g = i10;
        this.f152366h = trace;
    }
}
