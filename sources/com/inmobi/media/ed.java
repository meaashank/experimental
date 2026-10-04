package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ed extends C3525e5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f152891g;

    public ed(StackTraceElement[] stackTrace) {
        kotlin.jvm.internal.G.p(stackTrace, "stackTrace");
        ScheduledExecutorService scheduledExecutorService = Cc.f151826a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            jSONObject.put("stack", Cc.a(stackTrace));
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        super("ANRWatchDog", "ANRWatchDogEvent", string);
        this.f152891g = stackTrace;
    }
}
