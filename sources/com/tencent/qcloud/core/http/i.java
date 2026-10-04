package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudServiceException;
import java.util.List;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f194291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HttpRequest<T> f194292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f194293e;

    public i(h<T> hVar, T t10) {
        Response response = hVar.f194288b;
        this.f194289a = response.f225295d;
        this.f194290b = response.f225294c;
        this.f194291c = response.f225297f.w();
        this.f194293e = t10;
        this.f194292d = hVar.f194287a;
    }

    public QCloudServiceException a() {
        QCloudServiceException qCloudServiceException = new QCloudServiceException(this.f194290b);
        qCloudServiceException.setStatusCode(this.f194289a);
        return qCloudServiceException;
    }

    public int b() {
        return this.f194289a;
    }

    public T c() {
        return this.f194293e;
    }

    public String d(String str) {
        List<String> list = this.f194291c.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public Map<String, List<String>> e() {
        return this.f194291c;
    }

    public final boolean f() {
        int i10 = this.f194289a;
        return i10 >= 200 && i10 < 300;
    }

    public String g() {
        return this.f194290b;
    }

    public HttpRequest<T> h() {
        return this.f194292d;
    }
}
