package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3483b5 extends L3 {
    public C3483b5() {
        super(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        String asString5 = contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS);
        kotlin.jvm.internal.G.o(asString5, "getAsString(...)");
        long j10 = Long.parseLong(asString5);
        kotlin.jvm.internal.G.m(asString);
        kotlin.jvm.internal.G.m(asString3);
        kotlin.jvm.internal.G.m(asString2);
        C3525e5 c3525e5 = new C3525e5(asString, asString3, asString2, asString4);
        c3525e5.f151968b = j10;
        Integer asInteger = contentValues.getAsInteger("id");
        kotlin.jvm.internal.G.o(asInteger, "getAsInteger(...)");
        c3525e5.f151969c = asInteger.intValue();
        return c3525e5;
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        C3525e5 item = (C3525e5) obj;
        kotlin.jvm.internal.G.p(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", item.f152842e);
        contentValues.put("componentType", item.f152843f);
        contentValues.put("eventType", item.f151967a);
        contentValues.put("payload", item.a());
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(item.f151968b));
        return contentValues;
    }
}
