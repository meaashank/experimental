package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z {

    public static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f159792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f159793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f159794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f159795d;

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f159792a = uVar;
            this.f159793b = i10;
            this.f159794c = bArr;
            this.f159795d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f159793b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        @Nullable
        public u b() {
            return this.f159792a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f159794c, this.f159795d, this.f159793b);
        }
    }

    public static z a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    @Nullable
    public abstract u b();

    public static z a(@Nullable u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
