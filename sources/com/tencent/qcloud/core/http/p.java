package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.http.QCloudHttpClient;
import javax.net.ssl.HostnameVerifier;
import wb.C5773b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5773b f194340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f194341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f194342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public okhttp3.m f194343d;

    public abstract q a();

    public void b(QCloudHttpClient.Builder builder, HostnameVerifier hostnameVerifier, okhttp3.m mVar, g gVar) {
        this.f194340a = builder.retryStrategy;
        this.f194341b = gVar;
        this.f194342c = builder.enableDebugLog;
        this.f194343d = mVar;
    }
}
