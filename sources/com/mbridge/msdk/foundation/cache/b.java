package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f155913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f155914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f155915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f155916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f155917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f155918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f155920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f155921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f155922j;

    public void a(long j10) {
        this.f155922j = j10;
    }

    public double b() {
        return this.f155914b;
    }

    public long c() {
        return this.f155922j;
    }

    public String d() {
        return this.f155915c;
    }

    public String e() {
        return this.f155916d;
    }

    public int f() {
        return this.f155917e;
    }

    public int g() {
        return this.f155919g;
    }

    public long h() {
        return this.f155920h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f155913a;
    }

    public void b(String str) {
        this.f155915c = str;
    }

    public void c(String str) {
        this.f155916d = str;
    }

    public void d(String str) {
        this.f155921i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f155913a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f155919g = i10;
    }

    public void c(long j10) {
        this.f155920h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f155914b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f155918f = j10;
    }

    public void a(int i10) {
        this.f155917e = i10;
    }
}
