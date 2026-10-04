package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f155923i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f155924j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f155925k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f155926l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f155927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155929c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155930d = f155924j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f155931e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f155932f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f155933g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f155934h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f155927a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f155934h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f155927a;
    }

    public String d() {
        List<String> list = this.f155933g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f155928b;
    }

    public String f() {
        List<String> list = this.f155932f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f155930d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f155931e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f155932f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f155933g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f155928b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f155931e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f155930d = i10;
    }
}
