package com.mbridge.msdk.config.component.wei.model;

import androidx.multidex.MultiDexExtractor;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;
import k3.C4820a;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f154886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f154888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f154889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f154890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f154891i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f154886d = str;
    }

    public void b(String str) {
        this.f154885c = str;
    }

    public String c() {
        return this.f154890h;
    }

    public void d(String str) {
        this.f154883a = str;
    }

    public void e(String str) {
        this.f154887e = str;
    }

    public String f() {
        return this.f154884b;
    }

    public String g() {
        return this.f154883a;
    }

    public String h() {
        return this.f154887e;
    }

    public boolean i() {
        return this.f154889g;
    }

    public AdSession a() {
        return this.f154888f;
    }

    public String b() {
        return this.f154886d;
    }

    public void c(String str) {
        this.f154884b = str;
    }

    public String d() {
        return this.f154885c;
    }

    public List<Map<String, Object>> e() {
        return this.f154891i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f154891i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(MultiDexExtractor.f114845k) && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                if (strValueOf.startsWith("assets://")) {
                    strValueOf = strValueOf.replace("assets://", C4820a.f214347d);
                }
                d(strValueOf);
            }
            Object obj2 = map.get(c.c("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
