package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3801y2 extends F1 {
    public C3801y2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.F1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.G.p(contentValues, "contentValues");
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        C3662o2 c3662o2 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        kotlin.jvm.internal.G.o(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        kotlin.jvm.internal.G.m(asLong);
        long jLongValue = asLong.longValue();
        c3662o2.getClass();
        return C3662o2.a(asString3, jSONObject, asString2, jLongValue);
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        Config config = (Config) obj;
        kotlin.jvm.internal.G.p(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    public final boolean b(String type, String accountId) {
        boolean z10;
        kotlin.jvm.internal.G.p(type, "type");
        kotlin.jvm.internal.G.p(accountId, "accountId");
        try {
            z10 = !C3495c3.b(this.f151914a, null, "account_id=? AND config_type=?", new String[]{accountId, type}, null, null, null, null).isEmpty();
        } catch (Exception unused) {
            z10 = false;
        }
        return !z10;
    }

    public final long a(String type, String str) {
        kotlin.jvm.internal.G.p(type, "type");
        String[] strArr = {str, type};
        C3787x2 transform = C3787x2.f153515a;
        kotlin.jvm.internal.G.p(transform, "transform");
        Object objInvoke = null;
        try {
            List<ContentValues> listB = C3495c3.b(this.f151914a, null, "account_id=? AND config_type=?", strArr, null, null, null, null);
            if (!listB.isEmpty()) {
                objInvoke = transform.invoke(listB.get(0));
            }
        } catch (Exception unused) {
        }
        Long l10 = (Long) objInvoke;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
