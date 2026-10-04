package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavg extends zzinf {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzinp zzm;
    private long zzn;

    public zzavg() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzinp.zzj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return android.support.v4.media.session.f.a(sb2, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzind
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzink.zza(zzavc.zzd(byteBuffer));
            this.zzh = zzink.zza(zzavc.zzd(byteBuffer));
            this.zzi = zzavc.zza(byteBuffer);
            this.zzj = zzavc.zzd(byteBuffer);
        } else {
            this.zzg = zzink.zza(zzavc.zza(byteBuffer));
            this.zzh = zzink.zza(zzavc.zza(byteBuffer));
            this.zzi = zzavc.zza(byteBuffer);
            this.zzj = zzavc.zza(byteBuffer);
        }
        this.zzk = zzavc.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzavc.zzb(byteBuffer);
        zzavc.zza(byteBuffer);
        zzavc.zza(byteBuffer);
        this.zzm = new zzinp(zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzavc.zza(byteBuffer);
    }
}
