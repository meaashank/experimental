package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes4.dex */
final class zzjk {
    private final byte[] buffer;
    private final zzjr zznx;

    private zzjk(int i10) {
        byte[] bArr = new byte[i10];
        this.buffer = bArr;
        this.zznx = zzjr.zzb(bArr);
    }

    public final zzjc zzbx() {
        this.zznx.zzcb();
        return new zzjm(this.buffer);
    }

    public final zzjr zzby() {
        return this.zznx;
    }

    public /* synthetic */ zzjk(int i10, zzjd zzjdVar) {
        this(i10);
    }
}
