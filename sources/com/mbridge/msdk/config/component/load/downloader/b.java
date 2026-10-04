package com.mbridge.msdk.config.component.load.downloader;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f154475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f154478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f154479e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154480f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f154481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f154482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f154483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f154484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f154485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f154486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f154487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f154488n;

    public b(Object obj, String str, String str2, String str3, int i10) {
        this.f154475a = obj;
        this.f154481g = str3;
        this.f154476b = i10;
        this.f154477c = str;
        this.f154485k = str2;
        try {
            if (TextUtils.isEmpty(str2)) {
                URL url = new URL(str);
                this.f154485k = url.getProtocol() + "://" + url.getHost() + url.getPath();
            }
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f154478d == null) {
            this.f154478d = new HashMap(4);
        }
        this.f154478d.put(str, obj);
    }

    public void b(int i10) {
        this.f154476b = i10;
    }

    public long c() {
        return this.f154483i;
    }

    public int d() {
        return this.f154484j;
    }

    public int e() {
        return this.f154476b;
    }

    public String f() {
        return this.f154477c;
    }

    public long g() {
        return this.f154487m;
    }

    public String h() {
        return this.f154481g;
    }

    public long i() {
        return this.f154488n;
    }

    public String j() {
        return this.f154480f;
    }

    public boolean k() {
        return this.f154482h;
    }

    public void b(String str) {
        this.f154480f = str;
    }

    public void c(long j10) {
        this.f154488n = j10;
    }

    public String b() {
        return this.f154485k;
    }

    public void a(boolean z10) {
        this.f154482h = z10;
    }

    public void b(long j10) {
        this.f154487m = j10;
    }

    public void a(long j10) {
        this.f154483i = j10;
    }

    public void a(int i10) {
        this.f154484j = i10;
    }

    public String a() {
        return this.f154486l;
    }

    public void a(String str) {
        this.f154486l = str;
    }
}
