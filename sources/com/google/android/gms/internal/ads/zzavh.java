package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavh extends zzind {
    public zzavh(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzind
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
