package com.prism.gaia.helper.utils.apk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestException;

/* JADX INFO: loaded from: classes6.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f165099a;

    public c(ByteBuffer byteBuffer) {
        this.f165099a = byteBuffer.slice();
    }

    @Override // com.prism.gaia.helper.utils.apk.f
    public void a(e eVar, long j10, int i10) throws DigestException, IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f165099a) {
            this.f165099a.position(0);
            int i11 = (int) j10;
            this.f165099a.limit(i10 + i11);
            this.f165099a.position(i11);
            byteBufferSlice = this.f165099a.slice();
        }
        eVar.a(byteBufferSlice);
    }

    @Override // com.prism.gaia.helper.utils.apk.f
    public long size() {
        return this.f165099a.capacity();
    }
}
