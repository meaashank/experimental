package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpRequest<T> f194287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Response f194288b;

    public h(HttpRequest<T> httpRequest, Response response) {
        this.f194287a = httpRequest;
        this.f194288b = response;
    }

    public static void c(h hVar) throws QCloudServiceException {
        if (hVar == null) {
            throw new QCloudServiceException("response is null");
        }
        if (hVar.h()) {
            return;
        }
        QCloudServiceException qCloudServiceException = new QCloudServiceException(hVar.f194288b.f225294c);
        qCloudServiceException.setStatusCode(hVar.f194288b.f225295d);
        throw qCloudServiceException;
    }

    public final InputStream a() {
        okhttp3.u uVar = this.f194288b.f225298g;
        if (uVar == null) {
            return null;
        }
        return uVar.d();
    }

    public final byte[] b() throws IOException {
        okhttp3.u uVar = this.f194288b.f225298g;
        if (uVar == null) {
            return null;
        }
        return uVar.l();
    }

    public int d() {
        return this.f194288b.f225295d;
    }

    public final long e() {
        okhttp3.u uVar = this.f194288b.f225298g;
        if (uVar == null) {
            return 0L;
        }
        return uVar.p();
    }

    public String f(String str) {
        return this.f194288b.T0(str);
    }

    public Map<String, List<String>> g() {
        return this.f194288b.f225297f.w();
    }

    public final boolean h() {
        Response response = this.f194288b;
        return response != null && response.G1();
    }

    public String i() {
        return this.f194288b.f225294c;
    }

    public HttpRequest<T> j() {
        return this.f194287a;
    }

    public final String k() throws IOException {
        okhttp3.u uVar = this.f194288b.f225298g;
        if (uVar == null) {
            return null;
        }
        return uVar.N0();
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(this.f194288b.f225295d);
        Response response = this.f194288b;
        return String.format(locale, "http code = %d, http message = %s %nheader is %s", numValueOf, response.f225294c, response.f225297f.w());
    }
}
