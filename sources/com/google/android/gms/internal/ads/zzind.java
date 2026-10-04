package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzind implements zzavd {
    private static final zzino zzg = zzino.zzb(zzind.class);
    protected final String zza;
    long zzd;
    zzini zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzind(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzino zzinoVar = zzg;
                String str = this.zza;
                zzinoVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final void zzb(zzini zziniVar, ByteBuffer byteBuffer, long j10, zzava zzavaVar) throws IOException {
        this.zzd = zziniVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zziniVar;
        zziniVar.zzd(zziniVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzino zzinoVar = zzg;
            String str = this.zza;
            zzinoVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
