package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f154123k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f154124l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f154125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f154127c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f154128d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f154129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f154132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f154133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f154134j;

    public b(String str, String str2) {
        this.f154125a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f154132h = z10;
    }

    public void b(boolean z10) {
        this.f154133i = z10;
    }

    public long c() {
        return this.f154128d;
    }

    public int d() {
        return this.f154134j;
    }

    public int e() {
        return this.f154126b;
    }

    public String f() {
        return this.f154130f;
    }

    public String g() {
        return this.f154125a;
    }

    public int h() {
        return this.f154131g;
    }

    public boolean i() {
        return this.f154132h;
    }

    public boolean j() {
        return this.f154133i;
    }

    public void a(int i10) {
        this.f154134j = i10;
    }

    public void b(int i10) {
        this.f154131g = i10;
    }

    public CampaignEx a() {
        return this.f154129e;
    }

    public void b(String str) {
        this.f154130f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f154129e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f154127c;
    }

    public void a(String str) {
        this.f154126b++;
        this.f154127c.add(str);
    }
}
