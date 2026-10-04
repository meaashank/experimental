package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f159378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f159379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f159380c;

    public h(@Nullable String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f159378a = str;
        this.f159379b = j10;
        this.f159380c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f159379b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f159378a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f159380c;
    }
}
