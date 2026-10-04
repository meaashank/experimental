package com.tencent.qcloud.core.http;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tencent.qcloud.core.common.QCloudClientException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes7.dex */
public class HttpRequest<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request.Builder f194169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<String>> f194170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f194171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f194172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f194173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final okhttp3.t f194174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f194175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f194176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final URL f194177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y<T> f194178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f194179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f194180l;

    public HttpRequest(Builder<T> builder) {
        Request.Builder builder2 = builder.requestBuilder;
        this.f194169a = builder2;
        this.f194178j = builder.responseBodyConverter;
        this.f194170b = builder.headers;
        this.f194171c = builder.queries;
        this.f194172d = builder.noSignHeaderKeys;
        this.f194173e = builder.noSignParamsKeys;
        this.f194180l = builder.keyTime;
        this.f194175g = builder.method;
        this.f194179k = builder.calculateContentMD5;
        Object obj = builder.tag;
        if (obj == null) {
            this.f194176h = toString();
        } else {
            this.f194176h = obj;
        }
        this.f194177i = builder.httpUrlBuilder.build().a0();
        x xVar = builder.requestBodySerializer;
        if (xVar != null) {
            this.f194174f = xVar.a();
        } else {
            this.f194174f = null;
        }
        builder2.method(builder.method, this.f194174f);
    }

    public static void c(Map<String, List<String>> map, String str, String str2) {
        List<String> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>(2);
            map.put(str, arrayList);
        }
        arrayList.add(str2.trim());
    }

    public static void v(Map<String, List<String>> map, String str) {
        map.remove(str);
    }

    public URL A() {
        return this.f194177i;
    }

    public void b(String str, String str2) {
        List<String> list = this.f194170b.get(str);
        if (list == null || list.size() < 1) {
            this.f194169a.addHeader(str, str2);
            c(this.f194170b, str, str2);
        }
    }

    public void d(String str, String str2) {
        List<String> list = this.f194170b.get(str);
        if (list != null && list.size() > 0) {
            this.f194170b.remove(str);
            this.f194169a.removeHeader(str);
            this.f194170b.remove(str);
        }
        this.f194169a.addHeader(str, str2);
        c(this.f194170b, str, str2);
    }

    public void e(String str, String str2) {
        if (str != null) {
            this.f194171c.put(str, str2);
        }
    }

    public Request f() {
        return this.f194169a.build();
    }

    public long g() throws IOException {
        okhttp3.t tVar = this.f194174f;
        if (tVar == null) {
            return -1L;
        }
        return tVar.c();
    }

    public String h() {
        okhttp3.q qVarD;
        okhttp3.t tVar = this.f194174f;
        if (tVar == null || (qVarD = tVar.d()) == null) {
            return null;
        }
        return qVarD.f225819a;
    }

    public String i() {
        return this.f194180l;
    }

    public Set<String> j() {
        return this.f194172d;
    }

    public Set<String> k() {
        return this.f194173e;
    }

    public tb.k l() throws QCloudClientException {
        return null;
    }

    public tb.m m() throws QCloudClientException {
        return null;
    }

    public okhttp3.t n() {
        return this.f194174f;
    }

    public y<T> o() {
        return this.f194178j;
    }

    public String p(String str) {
        List<String> list = this.f194170b.get(str);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public Map<String, List<String>> q() {
        return this.f194170b;
    }

    public String r() {
        return this.f194177i.getHost();
    }

    public String s() {
        return this.f194175g;
    }

    public Map<String, String> t() {
        return this.f194171c;
    }

    public void u(String str) {
        this.f194169a.removeHeader(str);
        this.f194170b.remove(str);
    }

    public void w(String str) {
        this.f194169a.tag(str);
    }

    public void x(String str) {
        this.f194169a.url(str);
    }

    public boolean y() {
        return this.f194179k && yb.e.d(p("Content-MD5"));
    }

    public Object z() {
        return this.f194176h;
    }

    public static class Builder<T> {
        boolean calculateContentMD5;
        String keyTime;
        String method;
        x requestBodySerializer;
        y<T> responseBodyConverter;
        Object tag;
        Map<String, List<String>> headers = new HashMap(10);
        Map<String, String> queries = new HashMap(10);
        Set<String> noSignHeaderKeys = new HashSet();
        Set<String> noSignParamsKeys = new HashSet();
        boolean isCacheEnabled = true;
        HttpUrl.Builder httpUrlBuilder = new HttpUrl.Builder();
        Request.Builder requestBuilder = new Request.Builder();

        public Builder<T> addHeader(String str, String str2) {
            if (str != null && str2 != null) {
                this.requestBuilder.addHeader(str, str2);
                HttpRequest.c(this.headers, str, str2);
            }
            return this;
        }

        public Builder<T> addHeaders(Map<String, List<String>> map) {
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if (key != null && str != null) {
                            this.requestBuilder.addHeader(key, str);
                            HttpRequest.c(this.headers, key, str);
                        }
                    }
                }
            }
            return this;
        }

        public Builder<T> addHeadersUnsafeNonAscii(Map<String, List<String>> map) {
            if (map != null) {
                Headers.Builder builder = new Headers.Builder();
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if (key != null && str != null) {
                            builder.addUnsafeNonAscii(key, str);
                            HttpRequest.c(this.headers, key, str);
                        }
                    }
                }
                this.requestBuilder.headers(builder.build());
            }
            return this;
        }

        public Builder<T> addNoSignHeaderKeys(Set<String> set) {
            this.noSignHeaderKeys.addAll(set);
            return this;
        }

        public Builder<T> addNoSignParamKeys(Set<String> set) {
            this.noSignParamsKeys.addAll(set);
            return this;
        }

        public Builder<T> body(x xVar) {
            this.requestBodySerializer = xVar;
            return this;
        }

        public HttpRequest<T> build() {
            prepareBuild();
            return new HttpRequest<>(this);
        }

        public Builder<T> contentMD5() {
            this.calculateContentMD5 = true;
            return this;
        }

        public Builder<T> converter(y<T> yVar) {
            this.responseBodyConverter = yVar;
            return this;
        }

        public Builder<T> encodedQuery(String str, String str2) {
            if (str != null) {
                this.queries.put(str, str2);
                this.httpUrlBuilder.addEncodedQueryParameter(str, str2);
            }
            return this;
        }

        public Set<String> getNoSignHeaderKeys() {
            return this.noSignHeaderKeys;
        }

        public Set<String> getNoSignParamsKeys() {
            return this.noSignParamsKeys;
        }

        public Builder<T> host(String str) {
            this.httpUrlBuilder.host(str);
            return this;
        }

        public Builder<T> method(String str) {
            this.method = str;
            return this;
        }

        public Builder<T> path(String str) {
            if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            if (str.length() > 0) {
                this.httpUrlBuilder.addPathSegments(str);
            }
            return this;
        }

        public Builder<T> port(int i10) {
            this.httpUrlBuilder.port(i10);
            return this;
        }

        public void prepareBuild() {
            this.requestBuilder.url(this.httpUrlBuilder.build());
            if (!this.isCacheEnabled) {
                this.requestBuilder.cacheControl(CacheControl.f225147o);
            }
            if (this.responseBodyConverter == null) {
                this.responseBodyConverter = (y<T>) y.string();
            }
        }

        public Builder<T> query(String str, String str2) {
            if (str != null) {
                this.queries.put(str, str2);
                this.httpUrlBuilder.addQueryParameter(str, str2);
            }
            return this;
        }

        public Builder<T> removeHeader(String str) {
            this.requestBuilder.removeHeader(str);
            this.headers.remove(str);
            return this;
        }

        public Builder<T> scheme(String str) {
            this.httpUrlBuilder.scheme(str);
            return this;
        }

        public Builder<T> setKeyTime(String str) {
            this.keyTime = str;
            return this;
        }

        public Builder<T> setUseCache(boolean z10) {
            this.isCacheEnabled = z10;
            return this;
        }

        public Builder<T> tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder<T> url(URL url) {
            HttpUrl httpUrlJ = HttpUrl.f225211k.j(url);
            if (httpUrlJ != null) {
                this.httpUrlBuilder = httpUrlJ.H();
                return this;
            }
            throw new IllegalArgumentException("url is not legal : " + url);
        }

        public Builder<T> userAgent(String str) {
            this.requestBuilder.addHeader("User-Agent", str);
            HttpRequest.c(this.headers, "User-Agent", str);
            return this;
        }

        public Builder<T> encodedQuery(String str) {
            this.httpUrlBuilder.encodedQuery(str);
            return this;
        }

        public Builder<T> query(Map<String, String> map) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.queries.put(key, entry.getValue());
                        this.httpUrlBuilder.addQueryParameter(key, entry.getValue());
                    }
                }
            }
            return this;
        }

        public Builder<T> encodedQuery(Map<String, String> map) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.queries.put(key, entry.getValue());
                        this.httpUrlBuilder.addEncodedQueryParameter(key, entry.getValue());
                    }
                }
            }
            return this;
        }
    }
}
