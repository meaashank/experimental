package com.mbridge.msdk.foundation.same.net.utils;

import C4.q;
import android.text.TextUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f156442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f156443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, b> f156444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f156445d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f156446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f156447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f156448c;

        public b(long j10, int i10, String str) {
            this.f156448c = j10;
            this.f156446a = i10;
            this.f156447b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    public static class C0571c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f156449a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0571c.f156449a;
    }

    private c() {
        this.f156442a = "IDErrorUtil";
        this.f156444c = new ConcurrentHashMap<>();
        this.f156445d = new ArrayList<>();
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        gVarA = gVarA == null ? i.b().a() : gVarA;
        this.f156443b = gVarA.u() * 1000;
        if (gVarA.z() == null || gVarA.z().size() <= 0) {
            q0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f156445d.addAll(a());
        } else {
            q0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f156445d.addAll(gVarA.z());
        }
    }

    public synchronized void a(String str, int i10, String str2, long j10) {
        if (this.f156444c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f156445d.contains(Integer.valueOf(i10))) {
            q0.b("IDErrorUtil", "addErrorInfo : " + str + q.f17581a + str2);
            this.f156444c.put(str, new b(j10, i10, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get(MintegralConstants.PLACEMENT_ID);
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace("[", "").replace("]", "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return a(str, str4, str3, eVar.a().get(BidResponsed.KEY_TOKEN), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str3);
        sb2.append("_");
        sb2.append(str2);
        String strA = android.support.v4.media.e.a(sb2, "_", str5);
        b bVarA = a(strA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.f156447b)) {
            try {
                if (bVarA.f156446a != -1) {
                    return e.a(new JSONObject(bVarA.f156447b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f156447b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i10 = Integer.parseInt(str5)) != 287 && i10 != 94) {
                    if (System.currentTimeMillis() < ((long) (i.b().c(str, str2).u() * 1000)) + bVarA.f156448c) {
                        return e.a(new JSONObject(bVarA.f156447b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f156447b.getBytes(), arrayList));
                    }
                    this.f156444c.remove(strA);
                    return null;
                }
            } catch (Exception e10) {
                q0.b("IDErrorUtil", e10.getMessage());
            }
        }
        q0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        q0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f156444c.containsKey(str) || (bVar = this.f156444c.get(str)) == null) {
            return null;
        }
        if (bVar.f156446a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f156448c + ((long) this.f156443b)) {
            this.f156444c.remove(str);
            if (this.f156444c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f156444c.entrySet()) {
                    q0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f156448c > this.f156443b) {
                        this.f156444c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        q0.b("IDErrorUtil", "getErrorInfo : " + bVar.f156447b);
        return bVar;
    }
}
