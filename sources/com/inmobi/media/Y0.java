package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class Y0 extends F1 {
    public Y0() {
        super("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        String asString2 = contentValues.getAsString("disk_uri");
        Long asLong = contentValues.getAsLong(CampaignEx.JSON_KEY_ST_TS);
        Long asLong2 = contentValues.getAsLong("created_ts");
        Long asLong3 = contentValues.getAsLong("ttl");
        Long asLong4 = contentValues.getAsLong("soft_ttl");
        kotlin.jvm.internal.G.m(asInteger);
        int iIntValue = asInteger.intValue();
        kotlin.jvm.internal.G.m(asString);
        kotlin.jvm.internal.G.m(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        kotlin.jvm.internal.G.m(asLong);
        long jLongValue = asLong.longValue();
        kotlin.jvm.internal.G.m(asLong2);
        long jLongValue2 = asLong2.longValue();
        kotlin.jvm.internal.G.m(asLong3);
        long jLongValue3 = asLong3.longValue();
        kotlin.jvm.internal.G.m(asLong4);
        return new C3589j(iIntValue, asString, asString2, iIntValue2, jLongValue, jLongValue2, jLongValue3, asLong4.longValue());
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        C3589j adAsset = (C3589j) obj;
        kotlin.jvm.internal.G.p(adAsset, "adAsset");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(adAsset.f153015a));
        contentValues.put("url", adAsset.f153016b);
        contentValues.put("disk_uri", adAsset.f153017c);
        contentValues.put("pending_attempts", Integer.valueOf(adAsset.f153018d));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(adAsset.f153019e));
        contentValues.put("created_ts", String.valueOf(adAsset.f153020f));
        contentValues.put("ttl", String.valueOf(adAsset.f153021g));
        contentValues.put("soft_ttl", String.valueOf(adAsset.f153022h));
        return contentValues;
    }

    public final ArrayList a() {
        ArrayList arrayListA = F1.a(this, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            C3589j c3589j = (C3589j) obj;
            if (c3589j != null && c3589j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            C3589j c3589j2 = (C3589j) obj2;
            if (c3589j2 != null) {
                arrayList2.add(c3589j2);
            }
        }
        return arrayList2;
    }

    public final ArrayList b() {
        ArrayList arrayListA = F1.a(this, null, null, null, null, "ts ASC ", null, 47);
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            C3589j c3589j = (C3589j) obj;
            if (c3589j != null && !c3589j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            C3589j c3589j2 = (C3589j) obj2;
            if (c3589j2 != null) {
                arrayList2.add(c3589j2);
            }
        }
        return arrayList2;
    }

    public final C3589j a(String remoteUrl) {
        kotlin.jvm.internal.G.p(remoteUrl, "remoteUrl");
        ArrayList arrayListA = F1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C3589j) arrayListA.get(0);
    }

    public final C3589j b(String remoteUrl) {
        kotlin.jvm.internal.G.p(remoteUrl, "remoteUrl");
        ArrayList arrayListA = F1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C3589j) arrayListA.get(0);
    }

    public final void a(C3589j asset) {
        kotlin.jvm.internal.G.p(asset, "asset");
        b(asset, "url = ?", new String[]{asset.f153016b.toString()});
    }
}
