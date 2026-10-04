package com.mbridge.msdk.mbbid.common;

import B0.C0922f;
import Jb.d;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f157244a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONArray f157245b;

    public static String a(Context context, String str) {
        HashMap map = new HashMap();
        map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return a(context, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r14 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r12 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if ((r14 - r12) >= (((long) r7.optInt("ttl")) * 1000)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = r7.optDouble("rate");
        r0 = new java.util.Random().nextInt(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r8 == 0.0d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if ((r8 * 100.0d) < r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r4 = r0;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r0 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        a(r19, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("BidCommon", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbid.common.b.b(android.content.Context, java.lang.String):boolean");
    }

    public static String a(Context context, Map<String, String> map) {
        String md5;
        String str;
        f157244a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                com.mbridge.msdk.foundation.controller.c.n().b(context);
            }
            if (com.mbridge.msdk.config.manager.a.c().d()) {
                try {
                    String strA = com.mbridge.msdk.config.component.common.util.c.a();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    a("buyerIdStart", strA, 0, 0L);
                    if (com.mbridge.msdk.config.manager.a.c().e()) {
                        String strA2 = a(strA, map, jCurrentTimeMillis);
                        if (!TextUtils.isEmpty(strA2)) {
                            return strA2;
                        }
                    } else if (com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f155326o)) {
                        String strA3 = a(strA, map, jCurrentTimeMillis);
                        if (!TextUtils.isEmpty(strA3)) {
                            return strA3;
                        }
                    } else {
                        a("buyerIdEnd", strA, 3, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                } catch (Throwable th) {
                    q0.b("BidCommon", th.getMessage());
                }
            }
            if (f157245b == null) {
                f157245b = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).o0();
            }
            md5 = SameMD5.getMD5(v0.d());
            try {
                if (b(context, md5)) {
                    return "";
                }
                Map<String, String> map2 = f157244a;
                if (map2 == null || !map2.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                    str = "";
                } else {
                    str = f157244a.get(BidConstants.BID_FILTER_KEY_UNIT_ID);
                }
                return a(context, str, md5);
            } catch (Exception unused) {
                return a(context, "", md5);
            }
        } catch (Exception unused2) {
            md5 = "";
            return a(context, "", md5);
        }
    }

    public static String a(Context context, String str, String str2) {
        long jA;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    com.mbridge.msdk.foundation.controller.c.n().b(context);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("BidCommon", e10.getMessage());
                }
            }
        }
        g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            gVarF = i.b().a();
        }
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.d());
        stringBuffer.append("|");
        stringBuffer.append(a.a(1, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(2, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(m0.t());
        stringBuffer.append("|");
        stringBuffer.append(m0.u());
        stringBuffer.append("|");
        stringBuffer.append(m0.s(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(m0.n(context));
        stringBuffer.append("x");
        stringBuffer.append(m0.m(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.i());
        stringBuffer.append("|");
        stringBuffer.append(a.a(3, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(v0.b(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.f156320d);
        stringBuffer.append("|");
        stringBuffer.append(m0.x());
        stringBuffer.append("|");
        stringBuffer.append(m0.h());
        stringBuffer.append("|");
        stringBuffer.append(a.a(4, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(5, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(a.a(6, gVarF, context));
        stringBuffer.append("|");
        stringBuffer.append(t0.c());
        stringBuffer.append("|");
        stringBuffer.append(t0.a());
        stringBuffer.append("|");
        try {
            jA = l0.a();
        } catch (Exception unused) {
            jA = 0;
        }
        if (jA > 0) {
            stringBuffer.append(jA);
            stringBuffer.append("|");
        } else {
            stringBuffer.append("");
            stringBuffer.append("|");
        }
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a7.c.f84756a));
        stringBuffer.append("|");
        stringBuffer.append(m0.j());
        String strA = gVarF != null ? gVarF.a() : "";
        stringBuffer.append("|");
        stringBuffer.append(strA);
        stringBuffer.append("|");
        stringBuffer.append(v0.a());
        stringBuffer.append("|");
        String strC = v0.c();
        if (TextUtils.isEmpty(strC)) {
            strC = "";
        }
        stringBuffer.append(strC);
        stringBuffer.append("|");
        stringBuffer.append(v0.c(str));
        stringBuffer.append("|");
        if (gVarF != null && gVarF.y0() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append(a.a(7, gVarF, context));
        }
        stringBuffer.append("|");
        stringBuffer.append(m0.G());
        stringBuffer.append("|");
        stringBuffer.append(m0.E(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.D() + "");
        stringBuffer.append("|");
        stringBuffer.append(m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
        stringBuffer.append("|");
        stringBuffer.append(m0.E());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() ? "1" : "2");
        stringBuffer.append("|");
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            if (com.mbridge.msdk.util.b.b()) {
                stringBuffer.append(m0.F());
            } else {
                stringBuffer.append(a.a(8, gVarF, context));
            }
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("1");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c());
        stringBuffer.append("|");
        if (m0.A() != 0) {
            stringBuffer.append(m0.A() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append("|");
            stringBuffer.append(1);
        } else {
            stringBuffer.append("|");
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(m0.r(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.q(context));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.e());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.tools.g.a());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.util.c.f160168b);
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(g0.a().b());
        stringBuffer.append("|");
        stringBuffer.append(m0.k(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.u(context));
        stringBuffer.append("|");
        stringBuffer.append(m0.o(context));
        stringBuffer.append("|");
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("|");
        stringBuffer.append(Build.VERSION.SDK_INT);
        stringBuffer.append("|");
        stringBuffer.append(m0.v());
        return k0.b(stringBuffer.toString());
    }

    public static void a(Context context, String str, long j10) {
        x0.b(context, str, Long.valueOf(j10));
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split(com.prism.gaia.download.a.f164606q)) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String strA = C0922f.a(str3, 1, 1);
                Map<String, String> map = f157244a;
                if (map != null && map.containsKey(strA)) {
                    String strValueOf = String.valueOf(f157244a.get(strA));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        str = str.replace(str3, strValueOf.concat(""));
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    private static void a(int i10, JSONObject jSONObject, int i11, int i12) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", "2000122");
                jSONObject2.put("filter", i10);
                jSONObject2.put("network_type", m0.s(contextD));
                jSONObject2.put(d.f58184l, i11);
                if (jSONObject != null && jSONObject.length() > 0) {
                    jSONObject2.put("hitNode", jSONObject);
                }
                jSONObject2.put("hitRate", i12);
                Map<String, String> map = f157244a;
                if (map != null) {
                    if (map.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                        jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, f157244a.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                    }
                    if (f157244a.containsKey(BidConstants.BID_FILTER_KEY_PLACEMENT_ID)) {
                        jSONObject2.put("placementId", f157244a.get(BidConstants.BID_FILTER_KEY_PLACEMENT_ID));
                    }
                    if (f157244a.containsKey(BidConstants.BID_FILTER_KEY_AD_TYPE)) {
                        jSONObject2.put("adType", f157244a.get(BidConstants.BID_FILTER_KEY_AD_TYPE));
                    }
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject2);
            }
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
        }
    }

    private static void a(String str, int i10) {
        e eVar = new e();
        eVar.a("filter", Integer.valueOf(i10));
        eVar.a("lrid", str);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000124", eVar);
    }

    private static void a(String str, String str2, int i10, long j10) {
        String str3;
        try {
            if (str.equals("buyerIdStart")) {
                str3 = "m_pipe_buyerid_start";
            } else {
                str3 = "m_pipe_buyerid_end";
            }
            HashMap map = new HashMap();
            map.put("context_id", str2);
            if (str.equals("buyerIdEnd")) {
                map.put(R9.c.f67796d, Integer.valueOf(i10));
                map.put(x.h.f238399b, Long.valueOf(j10));
            }
            com.mbridge.msdk.config.component.common.metrics.b.a(str3, map);
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
        }
    }

    private static String a(String str, Map<String, String> map, long j10) {
        try {
            com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
            P5.a aVar2 = new P5.a(aVar);
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, map.get(BidConstants.BID_FILTER_KEY_UNIT_ID));
                map2.put("buyer_params", map);
            }
            HashMap map3 = new HashMap();
            map3.put("callback", aVar2);
            map2.put("sdk_context", map3);
            com.mbridge.msdk.config.manager.a.c().a(str, "c4", map2);
            Object objA = aVar.a(com.mbridge.msdk.config.manager.a.f155326o);
            if (objA instanceof Map) {
                Object obj = ((Map) objA).get("buyer_id");
                if (obj instanceof String) {
                    a("buyerIdEnd", str, 1, System.currentTimeMillis() - j10);
                    return String.valueOf(obj);
                }
                a("buyerIdEnd", str, 2, System.currentTimeMillis() - j10);
                return "";
            }
            return "";
        } catch (Throwable th) {
            q0.b("BidCommon", th.getMessage());
            return "";
        }
    }
}
