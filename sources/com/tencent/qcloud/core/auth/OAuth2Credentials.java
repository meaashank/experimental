package com.tencent.qcloud.core.auth;

import java.util.Date;
import tb.h;

/* JADX INFO: loaded from: classes7.dex */
public class OAuth2Credentials implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f194140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f194141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f194142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f194143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f194144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f194145h;

    public static final class Builder {
        private String accessToken;
        private String authorizationCode;
        private long expiresIn;
        private String openId;
        private String platform;
        private String refreshToken;
        private String scope;
        private long tokenStartTime;

        public Builder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder authorizationCode(String str) {
            this.authorizationCode = str;
            return this;
        }

        public OAuth2Credentials build() {
            return new OAuth2Credentials(this);
        }

        public Builder expiresInSeconds(long j10) {
            this.expiresIn = j10;
            return this;
        }

        public Builder openId(String str) {
            this.openId = str;
            return this;
        }

        public Builder platform(String str) {
            this.platform = str;
            return this;
        }

        public Builder refreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public Builder scope(String str) {
            this.scope = str;
            return this;
        }

        public Builder tokenStartTime(long j10) {
            this.tokenStartTime = j10;
            return this;
        }
    }

    @Override // tb.h
    public String c() {
        return this.f194143f;
    }

    public String e() {
        return this.f194139b;
    }

    public String f() {
        return this.f194145h;
    }

    public long g() {
        return (this.f194140c.getTime() - this.f194141d.getTime()) / 1000;
    }

    public String h() {
        return this.f194143f;
    }

    public String i() {
        return this.f194138a;
    }

    public String j() {
        return this.f194142e;
    }

    public String k() {
        return this.f194144g;
    }

    public Date l() {
        return this.f194141d;
    }

    public Date m() {
        return this.f194140c;
    }

    public boolean n() {
        return System.currentTimeMillis() > this.f194140c.getTime();
    }

    public OAuth2Credentials(Builder builder) {
        this.f194138a = builder.platform;
        this.f194139b = builder.accessToken;
        this.f194141d = new Date(builder.tokenStartTime);
        this.f194140c = new Date((builder.expiresIn * 1000) + builder.tokenStartTime);
        this.f194142e = builder.refreshToken;
        this.f194143f = builder.openId;
        this.f194144g = builder.scope;
        this.f194145h = builder.authorizationCode;
    }
}
