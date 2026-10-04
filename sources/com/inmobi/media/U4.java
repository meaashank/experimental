package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class U4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f152480a;

    public U4(JSONObject jSONObject) {
        this.f152480a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean boolC = C3672oc.f153249a.c();
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        if (zBooleanValue) {
            return;
        }
        AbstractC3469a5.a(this.f152480a);
    }
}
