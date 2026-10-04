package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f154527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b f154528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f154529c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.f f154530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f154531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f154532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f154533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f154534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f154535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f154536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f154537k;

    public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f154528b = bVar;
    }

    public e a(long j10) {
        this.f154527a = j10;
        return this;
    }

    public e b(long j10) {
        this.f154533g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d build() {
        return d.a(this);
    }

    public p c(long j10) {
        this.f154537k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p withTimeout(long j10) {
        this.f154535i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(com.mbridge.msdk.config.component.load.downloader.f fVar) {
        this.f154530d = fVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e withHttpRetryCounter(int i10) {
        this.f154534h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(int i10) {
        this.f154529c = i10;
        return this;
    }
}
