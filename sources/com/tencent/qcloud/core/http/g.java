package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.http.HttpLoggingInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;
import vb.C5721b;
import vb.C5724e;

/* JADX INFO: loaded from: classes7.dex */
public class g implements HttpLoggingInterceptor.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f194283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5721b f194284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f194285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f194286e;

    public g(boolean z10, String str) {
        this.f194283b = z10;
        this.f194286e = str;
        this.f194285d = new ArrayList(10);
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.a
    public void a(String str) {
        if (this.f194283b) {
            C5724e.g(this.f194286e, str, new Object[0]);
        }
        C5721b c5721b = (C5721b) C5724e.f(C5721b.class);
        this.f194284c = c5721b;
        if (c5721b != null) {
            synchronized (this.f194285d) {
                this.f194285d.add(str);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.a
    public void b(Response response, String str) {
        if (this.f194283b) {
            C5724e.g(this.f194286e, str, new Object[0]);
        }
        if (this.f194284c != null && response != null && !response.G1()) {
            d();
            this.f194284c.a(4, this.f194286e, str, null);
        } else {
            synchronized (this.f194285d) {
                this.f194285d.clear();
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.a
    public void c(Exception exc, String str) {
        C5724e.g(this.f194286e, str, new Object[0]);
        if (this.f194284c != null && exc != null) {
            d();
            this.f194284c.a(4, this.f194286e, str, exc);
        } else {
            synchronized (this.f194285d) {
                this.f194285d.clear();
            }
        }
    }

    public final synchronized void d() {
        synchronized (this.f194285d) {
            try {
                if (this.f194284c != null && this.f194285d.size() > 0) {
                    Iterator<String> it = this.f194285d.iterator();
                    while (it.hasNext()) {
                        this.f194284c.a(4, this.f194286e, it.next(), null);
                    }
                    this.f194285d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(boolean z10) {
        this.f194283b = z10;
    }

    public void f(String str) {
        this.f194286e = str;
    }

    public g(boolean z10) {
        this(z10, QCloudHttpClient.f194181k);
    }
}
