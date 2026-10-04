package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.launcher3.LauncherAnimUtils;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.NOt;
import com.bytedance.sdk.component.utils.lp;
import g7.BinderC4457a;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private String FA;
    private int Ht;
    private String MR;
    private boolean Mm;
    private int NOt;
    private int OCA;
    private float TFq;
    private int Vor;
    private String WMI;
    private String ZH;
    private String ZRu;
    private int Zf;
    private String aT;
    private boolean edo;
    private Map<String, Object> fcs;
    private Bundle le;
    private int lp;
    private int mZ;
    private String oK;
    private String om;
    private String qF;
    private JSONArray ru;
    private boolean sAl;
    private int to;
    private float uR;
    private int xY;
    private String yBV;

    public static class Builder {
        private String FA;
        private String WMI;
        private float ZH;
        private String ZRu;
        private int Zf;
        private int aT;
        private String edo;
        private float lp;
        private String oK;
        private String qF;
        private boolean sAl;
        private Bundle to;
        private String xY;
        private String yBV;
        private int NOt = 640;
        private int mZ = LauncherAnimUtils.ALL_APPS_TRANSITION_MS;
        private final boolean uR = true;
        private int TFq = 1;
        private final String Ht = "";
        private final int Mm = 0;
        private String Vor = "defaultUser";
        private boolean om = true;
        private Map<String, Object> OCA = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.ZRu = this.ZRu;
            adSlot.Ht = this.TFq;
            adSlot.Mm = true;
            adSlot.NOt = this.NOt;
            adSlot.mZ = this.mZ;
            float f10 = this.ZH;
            if (f10 <= 0.0f) {
                adSlot.uR = this.NOt;
                adSlot.TFq = this.mZ;
            } else {
                adSlot.uR = f10;
                adSlot.TFq = this.lp;
            }
            adSlot.FA = "";
            adSlot.Vor = 0;
            adSlot.aT = this.FA;
            adSlot.ZH = this.Vor;
            adSlot.lp = this.aT;
            adSlot.sAl = this.om;
            adSlot.edo = this.sAl;
            adSlot.oK = this.edo;
            adSlot.yBV = this.oK;
            adSlot.WMI = this.yBV;
            adSlot.qF = this.WMI;
            adSlot.om = this.qF;
            adSlot.fcs = this.OCA;
            adSlot.MR = this.xY;
            adSlot.Zf = this.Zf;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.sAl = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.TFq = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.oK = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.ZRu = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.yBV = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.Zf = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.ZH = f10;
            this.lp = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.WMI = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.NOt = i10;
            this.mZ = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.om = z10;
            return this;
        }

        public Builder setLinkId(String str) {
            this.xY = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.FA = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.aT = i10;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.to = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.OCA = map;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i10) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }

        public Builder setUserData(String str) {
            this.qF = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.Vor = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (lp.uR()) {
                NOt.ZRu(str);
            }
            this.edo = str;
            return this;
        }
    }

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", LauncherAnimUtils.ALL_APPS_TRANSITION_MS);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString(BinderC4457a.f202278e));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.Ht;
    }

    public String getAdId() {
        return this.yBV;
    }

    public String getBidAdm() {
        return this.oK;
    }

    public JSONArray getBiddingTokens() {
        return this.ru;
    }

    public String getCodeId() {
        return this.ZRu;
    }

    public String getCreativeId() {
        return this.WMI;
    }

    public int getDurationSlotType() {
        return this.Zf;
    }

    public float getExpressViewAcceptedHeight() {
        return this.TFq;
    }

    public float getExpressViewAcceptedWidth() {
        return this.uR;
    }

    public String getExt() {
        return this.qF;
    }

    public int getImgAcceptedHeight() {
        return this.mZ;
    }

    public int getImgAcceptedWidth() {
        return this.NOt;
    }

    public int getIsRotateBanner() {
        return this.OCA;
    }

    public String getLinkId() {
        return this.MR;
    }

    public String getMediaExtra() {
        return this.aT;
    }

    public int getNativeAdType() {
        return this.lp;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.le;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.fcs;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.Vor;
    }

    @Deprecated
    public String getRewardName() {
        return this.FA;
    }

    public int getRotateOrder() {
        return this.xY;
    }

    public int getRotateTime() {
        return this.to;
    }

    public String getUserData() {
        return this.om;
    }

    public String getUserID() {
        return this.ZH;
    }

    public boolean isAutoPlay() {
        return this.sAl;
    }

    public boolean isExpressAd() {
        return this.edo;
    }

    public boolean isSupportDeepLink() {
        return this.Mm;
    }

    public void setAdCount(int i10) {
        this.Ht = i10;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.ru = jSONArray;
    }

    public void setDurationSlotType(int i10) {
        this.Zf = i10;
    }

    public void setIsRotateBanner(int i10) {
        this.OCA = i10;
    }

    public void setNativeAdType(int i10) {
        this.lp = i10;
    }

    public void setRotateOrder(int i10) {
        this.xY = i10;
    }

    public void setRotateTime(int i10) {
        this.to = i10;
    }

    public void setUserData(String str) {
        this.om = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.ZRu);
            jSONObject.put("mAdCount", this.Ht);
            jSONObject.put("mIsAutoPlay", this.sAl);
            jSONObject.put("mImgAcceptedWidth", this.NOt);
            jSONObject.put("mImgAcceptedHeight", this.mZ);
            jSONObject.put("mExpressViewAcceptedWidth", this.uR);
            jSONObject.put("mExpressViewAcceptedHeight", this.TFq);
            jSONObject.put("mSupportDeepLink", this.Mm);
            jSONObject.put("mRewardName", this.FA);
            jSONObject.put("mRewardAmount", this.Vor);
            jSONObject.put("mMediaExtra", this.aT);
            jSONObject.put("mUserID", this.ZH);
            jSONObject.put("mNativeAdType", this.lp);
            jSONObject.put("mIsExpressAd", this.edo);
            jSONObject.put(BinderC4457a.f202278e, this.yBV);
            jSONObject.put("mCreativeId", this.WMI);
            jSONObject.put("mExt", this.qF);
            jSONObject.put("mBidAdm", this.oK);
            jSONObject.put("mUserData", this.om);
            jSONObject.put("mDurationSlotType", this.Zf);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.sAl = true;
        this.edo = false;
        this.OCA = 0;
        this.to = 0;
        this.xY = 0;
    }
}
