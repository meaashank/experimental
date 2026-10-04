package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzinf extends zzind implements zzavd {
    private int zzg;

    public zzinf(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzavc.zzc(byteBuffer.get());
        zzavc.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
