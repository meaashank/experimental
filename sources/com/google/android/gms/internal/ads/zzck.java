package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzck {
    private final zzgxm zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgxm zzgxmVar) {
        this.zza = zzgxmVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= zzj()) {
                if (!this.zzc[i10].hasRemaining()) {
                    List list = this.zzb;
                    zzcp zzcpVar = (zzcp) list.get(i10);
                    if (!zzcpVar.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcpVar.zzd(byteBuffer2);
                        this.zzc[i10] = zzcpVar.zzf();
                        boolean z11 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzj()) {
                        ((zzcp) list.get(i10 + 1)).zze();
                    }
                }
                i10++;
            }
        } while (z10);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgxm zzgxmVar = this.zza;
        int size = zzgxmVar.size();
        zzgxm zzgxmVar2 = ((zzck) obj).zza;
        if (size != zzgxmVar2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < zzgxmVar.size(); i10++) {
            if (zzgxmVar.get(i10) != zzgxmVar2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzco {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i10 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i10);
            zzcl zzclVarZzb = zzcpVar.zzb(zzclVar);
            if (zzcpVar.zzc()) {
                zzguk.zzi(!zzclVarZzb.equals(r0));
                zzclVar = zzclVarZzb;
            }
            i10++;
        }
    }

    public final void zzb(zzcn zzcnVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i10 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                break;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i10);
            zzcpVar.zzi(zzcnVar);
            if (zzcpVar.zzc()) {
                zzcm zzcmVar = new zzcm(zzcnVar, null);
                zzcmVar.zza(zzcpVar.zza(zzcnVar.zzb));
                zzcnVar = zzcmVar.zzd();
                list.add(zzcpVar);
            }
            i10++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= zzj(); i11++) {
            this.zzc[i11] = ((zzcp) list.get(i11)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcp.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcp.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcp) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcp) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i10 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i10);
            zzcpVar.zzi(zzcn.zza);
            zzcpVar.zzj();
            i10++;
        }
    }
}
