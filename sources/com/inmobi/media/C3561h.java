package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.core.Trackers;
import com.inmobi.ads.core.TrackingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3561h {

    @NotNull
    public static final String CLICK_BEACON = "click";

    @NotNull
    public static final C3533f Companion = new C3533f();
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;

    @NotNull
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;

    @NotNull
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";

    @NotNull
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = "h";

    @NotNull
    public static final String WIN_BEACON = "win_beacon";

    @Nullable
    private final String adAuctionMeta;

    @Nullable
    private JSONObject adContent;

    @NotNull
    private final kotlin.G adMetaInfo$delegate;

    @Nullable
    private AdQualityControl adQualityControl;

    @Nullable
    private String adType;
    private final boolean allowAutoRedirection;

    @Nullable
    private JSONArray assetUrls;

    @Nullable
    private final JSONObject contextData;

    @InterfaceC3692q4
    @Nullable
    private C3506d0 features;

    @NotNull
    private final String impressionId;
    private boolean isPreloadWebView;

    @Nullable
    private JSONArray landingPageParams;
    private long mExpiryDurationInMillis;
    private long mInsertionTimestampInMillis;

    @NotNull
    private String markupType;

    @Nullable
    private final JSONObject metaInfo;

    @NotNull
    private String pubContent;

    @Nullable
    private String sf;

    @Nullable
    private final JSONArray trackers;

    @NotNull
    private final List<TrackingInfo> trackingInfo;

    @NotNull
    private final JSONObject transaction;

    @NotNull
    private String webVast;

    public C3561h() {
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = EmptyList.f217510a;
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = kotlin.I.a(new C3547g(this));
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    @e.f0
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void g() {
    }

    @e.f0
    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v() {
    }

    @Nullable
    public final String A() {
        return this.sf;
    }

    @Nullable
    public final Boolean C() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean(com.prism.gaia.server.content.j.f167238E));
        }
        return null;
    }

    @Nullable
    public final JSONArray D() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optJSONArray("trackingEvents");
        }
        return null;
    }

    @NotNull
    public final JSONObject E() {
        return this.transaction;
    }

    @NotNull
    public final String F() {
        return this.webVast;
    }

    public final boolean G() {
        return this.isPreloadWebView;
    }

    public final void a(@Nullable JSONArray jSONArray) {
        this.assetUrls = jSONArray;
    }

    @Nullable
    public final String b() {
        return this.adAuctionMeta;
    }

    @Nullable
    public final JSONObject c() {
        return this.adContent;
    }

    public final void d(@Nullable String str) {
        this.sf = str;
    }

    public final void e(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<set-?>");
        this.webVast = str;
    }

    @Nullable
    public final String f() {
        return this.adType;
    }

    @Nullable
    public final String h() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optString("advertisedContent", null);
        }
        return null;
    }

    public final boolean i() {
        return this.allowAutoRedirection;
    }

    @Nullable
    public final Long j() {
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject == null || !jSONObject.has("asPlcId")) {
                return null;
            }
            return Long.valueOf(jSONObject.getLong("asPlcId"));
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        return null;
    }

    @Nullable
    public final JSONArray k() {
        return this.assetUrls;
    }

    @Nullable
    public final String l() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optString("baseEventUrl", null);
        }
        return null;
    }

    @Nullable
    public final Long m() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("bidderId"));
        }
        return null;
    }

    public final int n() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optInt("casAdTypeId", -1);
        }
        return -1;
    }

    @NotNull
    public final String o() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("creativeId") : null;
        return strOptString == null ? "" : strOptString;
    }

    @Nullable
    public final String p() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString("creativeType", null);
        }
        return null;
    }

    @Nullable
    public final C3506d0 q() {
        return this.features;
    }

    @NotNull
    public final String s() {
        return this.impressionId;
    }

    @NotNull
    public final String t() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("landingPageParams");
            this.landingPageParams = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray != null) {
                Object objOpt = jSONArrayOptJSONArray.opt(0);
                JSONObject jSONObject2 = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                if (jSONObject2 != null) {
                    String strOptString = jSONObject2.optString("openMode", "DEFAULT");
                    kotlin.jvm.internal.G.o(strOptString, "optString(...)");
                    return strOptString;
                }
            }
        }
        return "DEFAULT";
    }

    @NotNull
    public final String u() {
        return this.markupType;
    }

    @NotNull
    public final String w() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("telemetryMetadataBlob") : null;
        return strOptString == null ? "" : strOptString;
    }

    @NotNull
    public final String x() {
        return this.pubContent;
    }

    @NotNull
    public final Set<C3488ba> y() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = this.assetUrls;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i10));
                    byte b10 = (byte) jSONObject.getInt("type");
                    String strOptString = jSONObject.optString("url");
                    kotlin.jvm.internal.G.m(strOptString);
                    if (strOptString.length() > 0) {
                        hashSet.add(new C3488ba(b10, strOptString));
                    }
                }
            }
            return hashSet;
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
            return hashSet;
        }
    }

    @Nullable
    public final Map<String, String> z() {
        try {
            JSONObject jSONObject = this.adContent;
            JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("pubContent") : null;
            if (jSONObject2 != null) {
                Companion.getClass();
                if (!jSONObject2.has("rewards")) {
                    return null;
                }
                HashMap map = new HashMap();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("rewards");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        kotlin.jvm.internal.G.m(next);
                        kotlin.jvm.internal.G.m(string);
                        map.put(next, string);
                    }
                }
                return map;
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        return null;
    }

    public final void a(boolean z10) {
        this.isPreloadWebView = z10;
    }

    public final void b(@Nullable String str) {
        try {
            this.transaction.put(C3604k0.CTX_HASH_KEY, str);
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(AbstractC3701r0.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Nullable
    public final List<String> c(@NotNull String type) {
        JSONArray jSONArrayOptJSONArray;
        kotlin.jvm.internal.G.p(type, "type");
        JSONArray jSONArray = this.trackers;
        if (jSONArray != null && jSONArray.length() != 0) {
            LinkedList linkedList = new LinkedList();
            int length = this.trackers.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject = this.trackers.getJSONObject(i10);
                    if (type.equals(jSONObject.optString("type")) && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url")) != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            linkedList.add(jSONArrayOptJSONArray.getString(i11));
                        }
                    }
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (!linkedList.isEmpty()) {
                return linkedList;
            }
        } else if (!this.trackingInfo.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TrackingInfo trackingInfo : this.trackingInfo) {
                for (Trackers trackers : trackingInfo.getTrackers()) {
                    try {
                        if (type.equals(trackers.getType())) {
                            arrayList.addAll(trackers.getUrl());
                            List<String> imExts = trackers.getImExts();
                            ArrayList arrayList2 = new ArrayList(kotlin.collections.J.d0(imExts, 10));
                            Iterator<T> it = imExts.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(trackingInfo.getImBaseUrl() + ((String) it.next()));
                            }
                            arrayList.addAll(arrayList2);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    @NotNull
    public final AdMetaInfo d() {
        return (AdMetaInfo) this.adMetaInfo$delegate.getValue();
    }

    @Nullable
    public final AdQualityControl e() {
        return this.adQualityControl;
    }

    public final void f(@NotNull String pubContent) throws JSONException {
        kotlin.jvm.internal.G.p(pubContent, "pubContent");
        if ("inmobiJson".equals(this.markupType)) {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("pubContent", new JSONObject(pubContent));
            }
        } else {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject2.put("pubContent", pubContent);
            }
        }
        this.pubContent = pubContent;
    }

    public final void a(@Nullable C3506d0 c3506d0) {
        this.features = c3506d0;
    }

    public final void a() throws IllegalStateException {
        if (!kotlin.jvm.internal.G.g(this.markupType, "unknown")) {
            if (this.impressionId.length() != 0) {
                return;
            }
            String TAG2 = TAG;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            AbstractC3666o6.a((byte) 1, TAG2, "Impression Id is Null");
            throw new IllegalArgumentException("Invalid Ad");
        }
        String TAG3 = TAG;
        kotlin.jvm.internal.G.o(TAG3, "TAG");
        AbstractC3666o6.a((byte) 1, TAG3, "UnKnown MarkUp Type");
        throw new IllegalArgumentException("Invalid Ad");
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable String str, long j10) {
        this.adContent = jSONObject;
        this.adType = str;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
        this.mExpiryDurationInMillis = j10;
        String str2 = this.sf;
        if (str2 != null) {
            if (!AbstractC3620l2.a(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                this.features = new C3506d0(str2);
            }
        }
    }

    public C3561h(@NotNull C3561h ad2, @Nullable JSONArray jSONArray) {
        kotlin.jvm.internal.G.p(ad2, "ad");
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = EmptyList.f217510a;
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = kotlin.I.a(new C3547g(this));
        C3818z5.b(ad2, this);
        this.assetUrls = jSONArray;
    }

    public final boolean a(long j10) {
        long jCurrentTimeMillis;
        long j11 = this.mExpiryDurationInMillis;
        if ((j11 == -1 ? -1L : this.mInsertionTimestampInMillis + j11) == -1) {
            jCurrentTimeMillis = (TimeUnit.SECONDS.toMillis(j10) + this.mInsertionTimestampInMillis) - System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = (j11 != -1 ? this.mInsertionTimestampInMillis + j11 : -1L) - System.currentTimeMillis();
        }
        return jCurrentTimeMillis < 0;
    }

    public final void a(@NotNull String buyerPrice) {
        kotlin.jvm.internal.G.p(buyerPrice, "buyerPrice");
        try {
            this.transaction.put(C3604k0.BUYER_PRICE, Double.parseDouble(buyerPrice));
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String str = this.pubContent;
                kotlin.jvm.internal.G.m(next);
                String string = jSONObject.getString(next);
                kotlin.jvm.internal.G.o(string, "getString(...)");
                this.pubContent = kotlin.text.F.B2(str, next, string, false, 4, null);
            }
        }
        f(this.pubContent);
    }
}
