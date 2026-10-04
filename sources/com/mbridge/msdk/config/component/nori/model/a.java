package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpVersion;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f154699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f154700b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f154702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f154703e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f154706h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f154710l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154701c = HttpVersion.HTTP;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154704f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154705g = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f154707i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f154708j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f154709k = 9377;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Map<String, Object> mapB;
        if (map != null) {
            try {
                Object obj = map.get(c.c("165"));
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get(c.c("151"));
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.c("170"));
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get(c.c("168"));
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                } else if (obj4 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj4).b());
                }
                Object obj5 = map.get(c.c("172"));
                if (obj5 != null) {
                    try {
                        c(Integer.parseInt(String.valueOf(obj5)));
                    } catch (Throwable th) {
                        q0.b("NetworkRequestModel", th.getMessage());
                        c(9377);
                    }
                }
                Object obj6 = map.get(c.c("171"));
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                } else if ((obj6 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (mapB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj6).b()) != null) {
                    try {
                        if (!mapB.isEmpty()) {
                            HashMap map2 = new HashMap();
                            for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                                map2.put(entry.getKey(), String.valueOf(entry.getValue()));
                            }
                            d(map2);
                        }
                    } catch (Throwable th2) {
                        q0.b("NetworkRequestModel", th2.getMessage());
                    }
                }
                Object obj7 = map.get(c.c("174"));
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e10) {
                        q0.b("NetworkRequestModel", e10.getMessage());
                    }
                }
                Object obj8 = map.get(c.c("175"));
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e11) {
                        q0.b("NetworkRequestModel", e11.getMessage());
                    }
                }
                Object obj9 = map.get(c.c("162"));
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e12) {
                        q0.b("NetworkRequestModel", e12.getMessage());
                    }
                }
                Object obj10 = map.get(c.c("169"));
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                } else if (obj10 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    c(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj10).b());
                }
                Object obj11 = map.get(c.c("173"));
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get(c.c("request_type"));
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e13) {
                q0.b("NetworkRequestModel", e13.getMessage(), e13);
            }
        }
    }

    public void b(List<String> list) {
        this.f154700b = list;
    }

    public void c(String str) {
        this.f154701c = str;
    }

    public Map<String, String> d() {
        return this.f154702d;
    }

    public String e() {
        return this.f154707i;
    }

    public String f() {
        return this.f154710l;
    }

    public int g() {
        return this.f154704f;
    }

    public int h() {
        return this.f154705g;
    }

    public String i() {
        return this.f154701c;
    }

    public int j() {
        return this.f154709k;
    }

    public long k() {
        return this.f154708j;
    }

    public List<String> l() {
        return this.f154700b;
    }

    public Map<String, Object> b() {
        return this.f154703e;
    }

    public void c(Map<String, Object> map) {
        this.f154703e = map;
    }

    public void d(Map<String, String> map) {
        this.f154702d = map;
    }

    public void b(Map<String, Object> map) {
        this.f154706h = map;
    }

    public void c(int i10) {
        this.f154709k = i10;
    }

    public void b(int i10) {
        this.f154705g = i10;
    }

    public List<String> c() {
        return this.f154699a;
    }

    public void b(String str) {
        this.f154710l = str;
    }

    public void a(int i10) {
        this.f154704f = i10;
    }

    public Map<String, Object> a() {
        return this.f154706h;
    }

    public void a(String str) {
        this.f154707i = str;
    }

    public void a(long j10) {
        this.f154708j = j10;
    }

    public void a(List<String> list) {
        this.f154699a = list;
    }
}
