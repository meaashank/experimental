package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpRequest;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class QCloudHttpRequest<T> extends HttpRequest<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tb.l f194198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f194199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tb.n[] f194200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public tb.k f194201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f194202q;

    public static class Builder<T> extends HttpRequest.Builder<T> {
        private tb.n[] credentialScope;
        private tb.k selfSigner;
        private boolean signInUrl;
        private tb.l signProvider;
        private String signerType;

        public Builder<T> credentialScope(tb.n[] nVarArr) {
            this.credentialScope = nVarArr;
            return this;
        }

        public Builder<T> selfSigner(tb.k kVar) {
            this.selfSigner = kVar;
            return this;
        }

        public Builder<T> signInUrl(boolean z10) {
            this.signInUrl = z10;
            return this;
        }

        public Builder<T> signer(String str, tb.l lVar) {
            this.signerType = str;
            this.signProvider = lVar;
            return this;
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> addHeader(String str, String str2) {
            return (Builder) super.addHeader(str, str2);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> body(x xVar) {
            return (Builder) super.body(xVar);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public QCloudHttpRequest<T> build() {
            prepareBuild();
            return new QCloudHttpRequest<>(this);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> contentMD5() {
            return (Builder) super.contentMD5();
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> converter(y<T> yVar) {
            return (Builder) super.converter((y) yVar);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> host(String str) {
            return (Builder) super.host(str);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> method(String str) {
            return (Builder) super.method(str);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> path(String str) {
            return (Builder) super.path(str);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> port(int i10) {
            return (Builder) super.port(i10);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> query(String str, String str2) {
            return (Builder) super.query(str, str2);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> removeHeader(String str) {
            return (Builder) super.removeHeader(str);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> scheme(String str) {
            return (Builder) super.scheme(str);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> setUseCache(boolean z10) {
            return (Builder) super.setUseCache(z10);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> tag(Object obj) {
            return (Builder) super.tag(obj);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> url(URL url) {
            return (Builder) super.url(url);
        }

        @Override // com.tencent.qcloud.core.http.HttpRequest.Builder
        public Builder<T> userAgent(String str) {
            return (Builder) super.userAgent(str);
        }
    }

    public QCloudHttpRequest(Builder<T> builder) {
        super(builder);
        this.f194199n = ((Builder) builder).signerType;
        this.f194198m = ((Builder) builder).signProvider;
        this.f194200o = ((Builder) builder).credentialScope;
        this.f194202q = ((Builder) builder).signInUrl;
        this.f194201p = ((Builder) builder).selfSigner;
    }

    public tb.n[] B() {
        return this.f194200o;
    }

    public tb.l C() {
        return this.f194198m;
    }

    public boolean D() {
        return this.f194202q;
    }

    public final boolean E() {
        return yb.e.d(p("Authorization"));
    }

    @Override // com.tencent.qcloud.core.http.HttpRequest
    public tb.k l() throws QCloudClientException {
        return this.f194201p;
    }

    @Override // com.tencent.qcloud.core.http.HttpRequest
    public tb.m m() throws QCloudClientException {
        if (this.f194199n == null || !E()) {
            return null;
        }
        tb.m mVarB = tb.s.b(this.f194199n);
        if (mVarB != null) {
            return mVarB;
        }
        throw new QCloudClientException(new QCloudAuthenticationException("can't get signer for type : " + this.f194199n));
    }
}
