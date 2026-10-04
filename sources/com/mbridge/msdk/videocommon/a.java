package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161460a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161461b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161462c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161463d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161464e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161465f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161466g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161467h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161468i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0653a> f161469j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0653a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f161470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f161471b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f161470a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f161470a;
        }

        public boolean c() {
            return this.f161471b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f161470a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f161470a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f161471b = z10;
        }
    }

    public static void a(String str, C0653a c0653a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f161467h.put(str, c0653a);
                return;
            } else {
                f161466g.put(str, c0653a);
                return;
            }
        }
        if (z11) {
            f161469j.put(str, c0653a);
        } else {
            f161468i.put(str, c0653a);
        }
    }

    public static C0653a b(String str) {
        if (f161466g.containsKey(str)) {
            return f161466g.get(str);
        }
        if (f161467h.containsKey(str)) {
            return f161467h.get(str);
        }
        if (f161468i.containsKey(str)) {
            return f161468i.get(str);
        }
        if (f161469j.containsKey(str)) {
            return f161469j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0653a> entry : f161466g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f161466g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0653a> entry : f161467h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f161467h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f161466g.containsKey(str)) {
            f161466g.remove(str);
        }
        if (f161468i.containsKey(str)) {
            f161468i.remove(str);
        }
        if (f161467h.containsKey(str)) {
            f161467h.remove(str);
        }
        if (f161469j.containsKey(str)) {
            f161469j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f161466g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f161466g.remove(str2);
                }
            }
        } else {
            f161466g.clear();
        }
        f161467h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0653a> concurrentHashMap = f161461b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0653a> concurrentHashMap2 = f161464e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0653a> concurrentHashMap3 = f161460a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0653a> concurrentHashMap4 = f161463d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0653a> concurrentHashMap5 = f161462c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0653a> concurrentHashMap6 = f161465f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f161468i.clear();
        f161469j.clear();
    }

    public static C0653a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0653a> concurrentHashMap = f161460a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f161460a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0653a> concurrentHashMap2 = f161463d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f161463d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0653a> concurrentHashMap3 = f161462c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f161462c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0653a> concurrentHashMap4 = f161465f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f161465f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0653a> concurrentHashMap5 = f161461b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f161461b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0653a> concurrentHashMap6 = f161464e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f161464e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0653a c0653a) {
        try {
            if (i10 == 94) {
                if (f161464e == null) {
                    f161464e = new ConcurrentHashMap<>();
                }
                f161464e.put(str, c0653a);
            } else if (i10 == 287) {
                if (f161465f == null) {
                    f161465f = new ConcurrentHashMap<>();
                }
                f161465f.put(str, c0653a);
            } else if (i10 != 288) {
                if (f161460a == null) {
                    f161460a = new ConcurrentHashMap<>();
                }
                f161460a.put(str, c0653a);
            } else {
                if (f161463d == null) {
                    f161463d = new ConcurrentHashMap<>();
                }
                f161463d.put(str, c0653a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0653a c0653a) {
        try {
            if (i10 == 94) {
                if (f161461b == null) {
                    f161461b = new ConcurrentHashMap<>();
                }
                f161461b.put(str, c0653a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f161462c == null) {
                    f161462c = new ConcurrentHashMap<>();
                }
                f161462c.put(str, c0653a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
