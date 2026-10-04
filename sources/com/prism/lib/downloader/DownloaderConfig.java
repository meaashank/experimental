package com.prism.lib.downloader;

import com.prism.lib.pfs.PrivateFileSystem;
import sa.C5584a;
import wa.C5770a;
import wa.InterfaceC5771b;

/* JADX INFO: loaded from: classes6.dex */
public class DownloaderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5771b f178659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PrivateFileSystem f178660e;

    public static final class Builder {
        private int readTimeout = 20000;
        private int connTimeout = 20000;
        private String userAgent = C5584a.f238604a;
        private InterfaceC5771b httpClient = new C5770a();
        private PrivateFileSystem pfs = null;

        public DownloaderConfig build() {
            return new DownloaderConfig(this);
        }

        public Builder setConnTimeout(int i10) {
            this.connTimeout = i10;
            return this;
        }

        public Builder setHttpClient(InterfaceC5771b interfaceC5771b) {
            this.httpClient = interfaceC5771b;
            return this;
        }

        public Builder setPfs(PrivateFileSystem privateFileSystem) {
            this.pfs = privateFileSystem;
            return this;
        }

        public Builder setReadTimeout(int i10) {
            this.readTimeout = i10;
            return this;
        }

        public Builder setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }
    }

    public static Builder f() {
        return new Builder();
    }

    public int a() {
        return this.f178657b;
    }

    public PrivateFileSystem b() {
        return this.f178660e;
    }

    public InterfaceC5771b c() {
        return this.f178659d;
    }

    public int d() {
        return this.f178656a;
    }

    public String e() {
        return this.f178658c;
    }

    public DownloaderConfig(Builder builder) {
        this.f178656a = builder.readTimeout;
        this.f178657b = builder.connTimeout;
        this.f178658c = builder.userAgent;
        this.f178659d = builder.httpClient;
        this.f178660e = builder.pfs;
    }
}
