package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class S extends F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f152421b;

    public S() {
        super("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        String asString = contentValues.getAsString("image_location");
        String asString2 = contentValues.getAsString("beacon_url");
        String asString3 = contentValues.getAsString("sdk_model_result");
        String asString4 = contentValues.getAsString("extras");
        if ((asString2 != null && asString2.length() != 0) || (asString != null && asString.length() != 0)) {
            kotlin.jvm.internal.G.m(asString);
            kotlin.jvm.internal.G.m(asString2);
            return new AdQualityResult(asString, asString3, asString2, asString4);
        }
        String asString5 = contentValues.getAsString("id");
        kotlin.jvm.internal.G.o(asString5, "getAsString(...)");
        a("id=?", new String[]{asString5});
        return null;
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        AdQualityResult item = (AdQualityResult) obj;
        kotlin.jvm.internal.G.p(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_location", item.getImageLocation());
        String sdkModelResult = item.getSdkModelResult();
        if (sdkModelResult == null) {
            sdkModelResult = "";
        }
        contentValues.put("sdk_model_result", sdkModelResult);
        contentValues.put("beacon_url", item.getBeaconUrl());
        contentValues.put("extras", item.getExtras());
        return contentValues;
    }

    public final void a(AdQualityResult result) {
        kotlin.jvm.internal.G.p(result, "result");
        Log.i("AdQualityDao", "queueing");
        a((Object) result);
        Q q10 = this.f152421b;
        if (q10 != null) {
            Log.i("AdQualityDao", "sending callback - queued");
            N n10 = (N) q10;
            Log.i("AdQualityBeaconExecutor", "item update callback received");
            if (n10.f152263c.get()) {
                Log.i("AdQualityBeaconExecutor", "resume executor");
                n10.f152263c.set(false);
                L l10 = new L(n10);
                ScheduledExecutorService scheduledExecutorService = P.f152360a;
                P.a(new C3491c(l10));
            }
        }
    }
}
