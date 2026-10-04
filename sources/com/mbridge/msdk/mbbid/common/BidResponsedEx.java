package com.mbridge.msdk.mbbid.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BidResponsedEx extends BidResponsed {
    public static final String KEY_CID = "cid";
    public static final String KEY_MACORS = "macors";
    public static final String TAG = "BidResponsedEx";
    private String cid;

    public static String decodePrice(String str) {
        return str;
    }

    public static BidResponsedEx parseBidResponsedEx(JSONObject jSONObject, String str) {
        BidResponsedEx bidResponsedEx;
        BidResponsedEx bidResponsedEx2 = null;
        if (jSONObject != null) {
            try {
                bidResponsedEx = new BidResponsedEx();
            } catch (Throwable th) {
                th = th;
            }
            try {
                bidResponsedEx.setBidId(jSONObject.optString(BidResponsed.KEY_BID_ID));
                bidResponsedEx.setCur(jSONObject.optString(BidResponsed.KEY_CUR));
                bidResponsedEx.setPrice(jSONObject.optString("price"));
                bidResponsedEx.setCid(jSONObject.optString(KEY_CID));
                bidResponsedEx.setBidToken(jSONObject.optString(BidResponsed.KEY_TOKEN));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_MACORS);
                String strOptString = jSONObject.optString(BidResponsed.KEY_LN);
                String strOptString2 = jSONObject.optString(BidResponsed.KEY_WN);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        strOptString = replaceUrl(strOptString, next, string);
                        strOptString2 = replaceUrl(strOptString2, next, string);
                    }
                }
                bidResponsedEx.setLn(strOptString);
                bidResponsedEx.setWn(strOptString2);
                return bidResponsedEx;
            } catch (Throwable th2) {
                th = th2;
                bidResponsedEx2 = bidResponsedEx;
                q0.b(TAG, th.getMessage());
                return bidResponsedEx2;
            }
        }
        return bidResponsedEx2;
    }

    private static String replaceUrl(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return str.replaceAll("\\{" + str2 + "\\}", str3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setLn(String str) {
        this.ln = str;
    }

    public void setWn(String str) {
        this.wn = str;
    }
}
