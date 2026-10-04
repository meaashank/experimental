package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes5.dex */
public final class Sb extends L3 {
    public Sb() {
        super("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        String asString3 = contentValues.getAsString("eventSource");
        String asString4 = contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS);
        kotlin.jvm.internal.G.o(asString4, "getAsString(...)");
        long j10 = Long.parseLong(asString4);
        kotlin.jvm.internal.G.m(asString);
        kotlin.jvm.internal.G.m(asString3);
        Tb tb2 = new Tb(asString, asString2, asString3);
        tb2.f151968b = j10;
        Integer asInteger = contentValues.getAsInteger("id");
        kotlin.jvm.internal.G.o(asInteger, "getAsInteger(...)");
        tb2.f151969c = asInteger.intValue();
        return tb2;
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        Tb item = (Tb) obj;
        kotlin.jvm.internal.G.p(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", item.f151967a);
        contentValues.put("payload", item.a());
        contentValues.put("eventSource", item.f152464e);
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(item.f151968b));
        return contentValues;
    }
}
