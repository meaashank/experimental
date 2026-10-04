package ha;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.a0;
import com.android.launcher3.IconCache;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f202585j = "minus_one_native_ads_v1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f202586k = "minus_one_native_ads.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f202589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f202590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f202592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f202593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, e> f202594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, c> f202595i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f202597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f202599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f202600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f202601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map<String, String> f202602g;

        public a(JSONObject jSONObject) throws JSONException {
            String scheme;
            this.f202596a = jSONObject.getString("type");
            this.f202597b = jSONObject.optString("url");
            this.f202598c = jSONObject.optString("fallbackUrl");
            this.f202599d = jSONObject.optString("openIn", "in_app_browser");
            this.f202600e = jSONObject.optString("packageName").trim();
            String strOptString = jSONObject.optString("referrer");
            this.f202601f = strOptString;
            if (strOptString.length() > 2048) {
                throw new JSONException("Referrer too long");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String[][] strArr = {new String[]{"source", "utm_source"}, new String[]{FirebaseAnalytics.Param.MEDIUM, "utm_medium"}, new String[]{"campaign", "utm_campaign"}, new String[]{"campaignId", "utm_id"}, new String[]{"content", "utm_content"}, new String[]{FirebaseAnalytics.Param.TERM, "utm_term"}};
            for (int i10 = 0; i10 < 6; i10++) {
                String[] strArr2 = strArr[i10];
                if (jSONObject.has(strArr2[0]) && !jSONObject.isNull(strArr2[0])) {
                    Object obj = jSONObject.get(strArr2[0]);
                    if (!(obj instanceof String)) {
                        throw new JSONException("Invalid attribution field: " + strArr2[0]);
                    }
                    String strTrim = ((String) obj).trim();
                    if (strTrim.length() > 256) {
                        throw new JSONException("Attribution field too long: " + strArr2[0]);
                    }
                    if (!strTrim.isEmpty()) {
                        linkedHashMap.put(strArr2[1], strTrim);
                    }
                }
            }
            this.f202602g = Collections.unmodifiableMap(linkedHashMap);
            if (this.f202596a.equals("google_play")) {
                if (!a(this.f202600e)) {
                    throw new JSONException("Invalid Google Play destination");
                }
                return;
            }
            if (this.f202596a.equals("web")) {
                if (!x.g(this.f202597b)) {
                    throw new JSONException("Invalid landing URL");
                }
            } else {
                if (!this.f202596a.equals(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    if (!this.f202596a.equals("browser")) {
                        throw new JSONException("Unknown action");
                    }
                    return;
                }
                try {
                    scheme = URI.create(this.f202597b).getScheme();
                } catch (Exception unused) {
                    scheme = null;
                }
                if (scheme == null || scheme.matches("(?i)(file|content|javascript|data|intent)") || !x.g(this.f202598c)) {
                    throw new JSONException("Invalid deep link");
                }
            }
        }

        public static boolean a(String str) {
            return str != null && str.length() <= 255 && str.matches("[A-Za-z_][A-Za-z0-9_]*(\\.[A-Za-z_][A-Za-z0-9_]*)+");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f202603e = 67108864;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f202605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f202607d;

        public b(String str, String str2, long j10, String str3) {
            str = str == null ? "" : str;
            this.f202604a = str;
            String lowerCase = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
            this.f202605b = lowerCase;
            this.f202607d = j10;
            str3 = str3 == null ? "" : str3;
            this.f202606c = str3;
            if (!str.isEmpty() && (!x.g(str) || !lowerCase.matches("[a-f0-9]{64}") || j10 < 0 || j10 > f202603e)) {
                throw new IllegalArgumentException("Remote assets need HTTPS and SHA-256; optional size must be bounded");
            }
            if (!str3.isEmpty() && !x.k(str3)) {
                throw new IllegalArgumentException("Invalid asset path");
            }
            if (str.isEmpty() && str3.isEmpty()) {
                throw new IllegalArgumentException("Missing asset");
            }
        }

        public static b a(JSONObject jSONObject) {
            return new b(jSONObject.optString("url"), jSONObject.optString("sha256"), jSONObject.optLong("bytes"), jSONObject.optString("fallbackAsset"));
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f202609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f202611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f202612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f202613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f202614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f202615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f202616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f202617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final d f202618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b f202619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final b f202620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final b f202621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Map<String, b> f202622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final a f202623p;

        public c(String str, JSONObject jSONObject) throws JSONException {
            this.f202608a = str;
            this.f202609b = jSONObject.optString("version", "1");
            this.f202612e = jSONObject.optBoolean(com.prism.gaia.server.content.j.f167238E, true);
            this.f202616i = new d(jSONObject.opt("title"));
            this.f202617j = new d(jSONObject.opt("description"));
            this.f202618k = new d(jSONObject.opt(InMobiNetworkValues.CTA));
            this.f202619l = jSONObject.has("icon") ? b.a(jSONObject.getJSONObject("icon")) : null;
            JSONObject jSONObject2 = jSONObject.getJSONObject("media");
            String string = jSONObject2.getString("type");
            this.f202610c = string;
            if (!string.equals("image") && !string.equals("video") && !string.equals("html")) {
                throw new JSONException("Unknown media type");
            }
            b bVarA = b.a(jSONObject2);
            this.f202620m = bVarA;
            this.f202621n = jSONObject2.has("poster") ? b.a(jSONObject2.getJSONObject("poster")) : null;
            this.f202615h = (float) Math.max(0.5d, Math.min(3.0d, jSONObject2.optDouble(InMobiNetworkValues.ASPECT_RATIO, 1.7777777777777777d)));
            this.f202613f = jSONObject2.optBoolean("autoplay", false);
            this.f202614g = jSONObject2.optBoolean("muted", true);
            String strOptString = jSONObject2.optString("entryPath", "index.html");
            this.f202611d = strOptString;
            if (!x.k(strOptString)) {
                throw new JSONException("Invalid H5 entry");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (string.equals("html")) {
                linkedHashMap.put(strOptString, bVarA);
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("resources");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < Math.min(jSONArrayOptJSONArray.length(), 64); i10++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                        String strH = x.h(jSONObject3, "path");
                        if (!x.k(strH) || linkedHashMap.containsKey(strH)) {
                            throw new JSONException("Invalid H5 path");
                        }
                        linkedHashMap.put(strH, b.a(jSONObject3));
                    }
                }
            }
            this.f202622o = Collections.unmodifiableMap(linkedHashMap);
            this.f202623p = new a(jSONObject.getJSONObject("action"));
        }

        public List<b> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f202620m);
            b bVar = this.f202619l;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            b bVar2 = this.f202621n;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
            arrayList.addAll(this.f202622o.values());
            return arrayList;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f202625b = new LinkedHashMap();

        public d(Object obj) {
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : new JSONObject();
            this.f202624a = obj instanceof String ? (String) obj : jSONObject.optString("defaultValue", "");
            JSONObject jSONObjectI = x.i(jSONObject, a0.f114167g);
            Iterator<String> itKeys = jSONObjectI.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.f202625b.put(next, jSONObjectI.optString(next));
            }
        }

        public String a(Locale locale) {
            String[] strArr = {locale.toLanguageTag(), locale.toString(), locale.getLanguage(), "default"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (this.f202625b.containsKey(str)) {
                    return this.f202625b.get(str);
                }
            }
            return this.f202624a;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f202626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<f> f202627b;

        public e(int i10, List<f> list) {
            this.f202626a = i10;
            this.f202627b = Collections.unmodifiableList(list);
        }

        public List<f> a(int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f202627b) {
                if (arrayList.size() >= this.f202626a) {
                    break;
                }
                if (!fVar.f202630c.equals("after_results") || i10 >= fVar.f202633f) {
                    if (!fVar.f202630c.equals("after_shortcuts") || i11 != 0) {
                        arrayList.add(fVar);
                    }
                }
            }
            return arrayList;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f202629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f202631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f202632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f202633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<g> f202634g;

        public f(JSONObject jSONObject, String str) throws JSONException {
            this.f202628a = x.h(jSONObject, "slotId");
            this.f202631d = jSONObject.optBoolean(com.prism.gaia.server.content.j.f167238E, true);
            String strOptString = jSONObject.optString("template", str.equals("home") ? "card_medium" : "card_compact");
            this.f202629b = strOptString;
            if (!strOptString.equals("card_medium") && !strOptString.equals("card_compact")) {
                throw new JSONException("Unknown template");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(W3.o.f76584m);
            String string = jSONObject2.getString("anchor");
            this.f202630c = string;
            if (!str.equals("home") ? string.equals("below_search_header") || string.equals("after_results") : string.equals("below_search") || string.equals("after_shortcuts")) {
                throw new JSONException("Unknown anchor");
            }
            this.f202632e = jSONObject2.optInt(W3.r.f76594e, 0);
            this.f202633f = x.e(jSONObject2.optInt("afterItems", 6), 1, 50);
            JSONArray jSONArray = jSONObject.getJSONArray("sources");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < Math.min(jSONArray.length(), 3); i10++) {
                arrayList.add(new g(jSONArray.getJSONObject(i10)));
            }
            if (arrayList.isEmpty()) {
                throw new JSONException("No sources");
            }
            this.f202634g = Collections.unmodifiableList(arrayList);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f202635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f202636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, Integer> f202638d;

        public g(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("type");
            if (!string.equals("sdk_native") && !string.equals("custom")) {
                throw new JSONException("Unknown source");
            }
            boolean zEquals = string.equals("sdk_native");
            this.f202635a = zEquals;
            this.f202637c = zEquals ? x.h(jSONObject, "placement") : "";
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fallbackOn");
            boolean zEquals2 = jSONArrayOptJSONArray == null;
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    zEquals2 |= "no_fill".equals(jSONArrayOptJSONArray.optString(i10));
                }
            }
            this.f202636b = zEquals2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!this.f202635a) {
                JSONArray jSONArray = jSONObject.getJSONArray("candidates");
                for (int i11 = 0; i11 < Math.min(jSONArray.length(), 50); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    int iE = x.e(jSONObject2.optInt("weight", 100), 0, 10000);
                    if (iE > 0) {
                        linkedHashMap.put(x.h(jSONObject2, "creativeId"), Integer.valueOf(iE));
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    throw new JSONException("No candidates");
                }
            }
            this.f202638d = Collections.unmodifiableMap(linkedHashMap);
        }
    }

    public x(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.getInt("schemaVersion") != 1 || !jSONObject.has(com.prism.gaia.server.content.j.f167238E)) {
            throw new JSONException("Unsupported or incomplete schema");
        }
        this.f202587a = jSONObject.getBoolean(com.prism.gaia.server.content.j.f167238E);
        this.f202588b = jSONObject.optString("revision", "default");
        JSONObject jSONObjectI = i(jSONObject, "loading");
        JSONObject jSONObjectI2 = i(jSONObject, "assetCache");
        int i10 = 2;
        this.f202589c = e(jSONObjectI.optInt("maxConcurrentRequests", 2), 1, 2);
        int i11 = 0;
        this.f202590d = e(jSONObjectI.optInt("preloadDistanceDp", 240), 0, 600);
        this.f202591e = e(jSONObjectI.optInt("minRequestIntervalSeconds", 60), 30, 3600);
        this.f202592f = e(jSONObjectI2.optInt("maxDiskMb", 128), 16, 256);
        this.f202593g = jSONObjectI2.optBoolean("preloadOnMetered", false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectI3 = i(jSONObject, "creatives");
        Iterator<String> itKeys = jSONObjectI3.keys();
        while (itKeys.hasNext() && linkedHashMap.size() < 50) {
            String next = itKeys.next();
            try {
                linkedHashMap.put(next, new c(next, jSONObjectI3.getJSONObject(next)));
            } catch (IllegalArgumentException | JSONException unused) {
            }
        }
        this.f202595i = Collections.unmodifiableMap(linkedHashMap);
        JSONObject jSONObject3 = this.f202587a ? jSONObject.getJSONObject(NotificationCompat.w.f110894B) : i(jSONObject, NotificationCompat.w.f110894B);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        String[] strArr = {"home", "search"};
        int i12 = 0;
        while (i12 < i10) {
            String str = strArr[i12];
            JSONObject jSONObjectI4 = i(jSONObject3, str);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectI4.optJSONArray("slots");
            if (jSONArrayOptJSONArray != null) {
                int i13 = i11;
                while (i13 < Math.min(jSONArrayOptJSONArray.length(), 20)) {
                    try {
                        f fVar = new f(jSONArrayOptJSONArray.getJSONObject(i13), str);
                        HashSet hashSet3 = new HashSet();
                        boolean zContains = hashSet.contains(fVar.f202628a);
                        Iterator<g> it = fVar.f202634g.iterator();
                        while (it.hasNext()) {
                            jSONObject2 = jSONObject3;
                            try {
                                g next2 = it.next();
                                Iterator<g> it2 = it;
                                if (next2.f202635a) {
                                    String lowerCase = next2.f202637c.toLowerCase(Locale.ROOT);
                                    zContains = (hashSet2.contains(lowerCase) || !hashSet3.add(lowerCase)) | zContains;
                                }
                                jSONObject3 = jSONObject2;
                                it = it2;
                            } catch (IllegalArgumentException | JSONException unused2) {
                            }
                        }
                        jSONObject2 = jSONObject3;
                        if (!zContains && fVar.f202631d) {
                            hashSet.add(fVar.f202628a);
                            hashSet2.addAll(hashSet3);
                            arrayList.add(fVar);
                        }
                    } catch (IllegalArgumentException | JSONException unused3) {
                        jSONObject2 = jSONObject3;
                    }
                    i13++;
                    jSONObject3 = jSONObject2;
                }
            }
            Collections.sort(arrayList, new w());
            i10 = 2;
            linkedHashMap2.put(str, new e(e(jSONObjectI4.optInt("maxAds", 2), 0, 3), arrayList));
            i12++;
            jSONObject3 = jSONObject3;
            i11 = 0;
        }
        this.f202594h = Collections.unmodifiableMap(linkedHashMap2);
    }

    public static int e(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static x f() {
        try {
            return j("{\"schemaVersion\":1,\"enabled\":false}");
        } catch (JSONException e10) {
            throw new AssertionError(e10);
        }
    }

    public static boolean g(String str) {
        try {
            URI uriCreate = URI.create(str);
            if ("https".equalsIgnoreCase(uriCreate.getScheme())) {
                if (uriCreate.getHost() != null) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String h(JSONObject jSONObject, String str) throws JSONException {
        String strTrim = jSONObject.getString(str).trim();
        if (strTrim.isEmpty() || strTrim.length() > 128) {
            throw new JSONException(w.y.a("Invalid ", str));
        }
        return strTrim;
    }

    public static JSONObject i(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public static x j(String str) throws JSONException {
        if (str == null || str.length() > 262144) {
            throw new JSONException("Config too large");
        }
        return new x(new JSONObject(str));
    }

    public static boolean k(String str) {
        if (str.isEmpty() || str.startsWith(RemoteSettings.FORWARD_SLASH_STRING) || str.contains("\\") || str.contains(com.prism.gaia.server.accounts.b.f166434b0) || str.contains("?") || str.contains("#") || str.contains("%")) {
            return false;
        }
        for (String str2 : str.split(RemoteSettings.FORWARD_SLASH_STRING)) {
            if (str2.equals("..") || str2.equals(IconCache.EMPTY_CLASS_NAME) || str2.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
