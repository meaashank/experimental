package com.bytedance.sdk.openadsdk.core.lp.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.prism.gaia.server.accounts.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends mZ implements Comparable<ZRu> {
    public long ZRu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0451ZRu {
        private final long NOt;
        private final String ZRu;
        private mZ.EnumC0452mZ mZ = mZ.EnumC0452mZ.TRACKING_URL;
        private boolean uR = false;

        public C0451ZRu(String str, long j10) {
            this.ZRu = str;
            this.NOt = j10;
        }

        public ZRu ZRu() {
            return new ZRu(this.NOt, this.ZRu, this.mZ, Boolean.valueOf(this.uR));
        }
    }

    public ZRu(long j10, String str, mZ.EnumC0452mZ enumC0452mZ, Boolean bool) {
        super(str, enumC0452mZ, bool);
        this.ZRu = j10;
    }

    public static int ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(b.f166434b0);
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean ZRu(long j10) {
        return this.ZRu <= j10 && !TFq();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(ZRu zRu) {
        if (zRu == null) {
            return 1;
        }
        long j10 = this.ZRu;
        long j11 = zRu.ZRu;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }

    public JSONObject ZRu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mZ());
        jSONObject.put("trackingMilliseconds", this.ZRu);
        return jSONObject;
    }
}
