package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaic implements zzagh {
    private final zzeu zza;
    private final zzaib zzb;
    private final boolean zzc;
    private final zzanx zzd;
    private int zze;
    private zzagk zzf;
    private zzaid zzg;
    private long zzh;
    private zzaif[] zzi;
    private long zzj;

    @Nullable
    private zzaif zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaic() {
        this(1, zzanx.zza);
    }

    @Nullable
    private final zzaif zzi(int i10) {
        for (zzaif zzaifVar : this.zzi) {
            if (zzaifVar.zzc(i10)) {
                return zzaifVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 12);
        zzeuVar.zzh(0);
        if (zzeuVar.zzC() != 1179011410) {
            return false;
        }
        zzeuVar.zzk(4);
        return zzeuVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zze = 0;
        if (this.zzc) {
            zzagkVar = new zzaoa(zzagkVar, this.zzd);
        }
        this.zzf = zzagkVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        boolean z10;
        int i10;
        long j10;
        long j11 = this.zzj;
        if (j11 != -1) {
            long jZzn = zzagiVar.zzn();
            if (j11 < jZzn || j11 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzn) {
                zzahhVar.zza = j11;
                z10 = true;
            } else {
                zzagiVar.zzf((int) (j11 - jZzn));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i11 = this.zze;
        zzaif zzaifVar = null;
        if (i11 == 0) {
            if (!zza(zzagiVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzagiVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i11 == 1) {
            zzeu zzeuVar = this.zza;
            zzagiVar.zzc(zzeuVar.zzi(), 0, 12);
            zzeuVar.zzh(0);
            zzaib zzaibVar = this.zzb;
            zzaibVar.zza(zzeuVar);
            int i12 = zzaibVar.zza;
            if (i12 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.client.b.a(i12, 22));
                sb2.append("LIST expected, found: ");
                sb2.append(i12);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzeuVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzaibVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(com.google.android.gms.ads.internal.client.b.a(iZzC, 22));
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i11 == 2) {
            int i13 = this.zzl - 4;
            zzeu zzeuVar2 = new zzeu(i13);
            zzagiVar.zzc(zzeuVar2.zzi(), 0, i13);
            zzaig zzaigVarZzb = zzaig.zzb(1819436136, zzeuVar2);
            if (zzaigVarZzb.zza() != 1819436136) {
                int iZza = zzaigVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzaid zzaidVar = (zzaid) zzaigVarZzb.zzc(zzaid.class);
            if (zzaidVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaidVar;
            this.zzh = ((long) zzaidVar.zzc) * ((long) zzaidVar.zza);
            ArrayList arrayList = new ArrayList();
            zzgxm zzgxmVar = zzaigVarZzb.zza;
            int size = zzgxmVar.size();
            int i14 = 0;
            int i15 = 0;
            while (i14 < size) {
                zzahz zzahzVar = (zzahz) zzgxmVar.get(i14);
                if (zzahzVar.zza() == 1819440243) {
                    zzaig zzaigVar = (zzaig) zzahzVar;
                    int i16 = i15 + 1;
                    zzaie zzaieVar = (zzaie) zzaigVar.zzc(zzaie.class);
                    zzaih zzaihVar = (zzaih) zzaigVar.zzc(zzaih.class);
                    if (zzaieVar == null) {
                        zzeh.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzaihVar == null) {
                        zzeh.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzaieVar.zzd();
                        zzv zzvVar = zzaihVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i15);
                        int i17 = zzaieVar.zze;
                        if (i17 != 0) {
                            zztVarZza.zzp(i17);
                        }
                        zzaii zzaiiVar = (zzaii) zzaigVar.zzc(zzaii.class);
                        if (zzaiiVar != null) {
                            zztVarZza.zzc(zzaiiVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzp);
                        if (iZzf == 1) {
                            zzaht zzahtVarZzs = this.zzf.zzs(i15, iZzf);
                            zzahtVarZzs.zzA(zztVarZza.zzQ());
                            zzahtVarZzs.zzP(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaifVar = new zzaif(i15, zzaieVar, zzahtVarZzs);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzaht zzahtVarZzs2 = this.zzf.zzs(i15, iZzf);
                            zzahtVarZzs2.zzA(zztVarZza.zzQ());
                            zzahtVarZzs2.zzP(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaifVar = new zzaif(i15, zzaieVar, zzahtVarZzs2);
                        } else {
                            zzaifVar = null;
                        }
                    }
                    if (zzaifVar != null) {
                        arrayList.add(zzaifVar);
                    }
                    i15 = i16;
                }
                i14++;
                zzaifVar = null;
            }
            this.zzi = (zzaif[]) arrayList.toArray(new zzaif[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i11 == 3) {
            long j12 = this.zzm;
            if (j12 != -1 && zzagiVar.zzn() != j12) {
                this.zzj = j12;
                return 0;
            }
            zzeu zzeuVar3 = this.zza;
            zzagiVar.zzi(zzeuVar3.zzi(), 0, 12);
            zzagiVar.zzl();
            zzeuVar3.zzh(0);
            zzaib zzaibVar2 = this.zzb;
            zzaibVar2.zza(zzeuVar3);
            int iZzC2 = zzeuVar3.zzC();
            int i18 = zzaibVar2.zza;
            if (i18 == 1179011410) {
                zzagiVar.zzf(12);
                return 0;
            }
            if (i18 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzagiVar.zzn() + ((long) zzaibVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzagiVar.zzn();
            this.zzm = jZzn2;
            long j13 = jZzn2 + ((long) zzaibVar2.zzb) + 8;
            this.zzn = j13;
            if (!this.zzp) {
                zzaid zzaidVar2 = this.zzg;
                zzaidVar2.getClass();
                if ((zzaidVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j13;
                    return 0;
                }
                this.zzf.zzw(new zzahj(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzagiVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i11 == 4) {
            zzeu zzeuVar4 = this.zza;
            zzagiVar.zzc(zzeuVar4.zzi(), 0, 8);
            zzeuVar4.zzh(0);
            int iZzC3 = zzeuVar4.zzC();
            int iZzC4 = zzeuVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzagiVar.zzn() + ((long) iZzC4);
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i11 != 5) {
            if (zzagiVar.zzn() >= this.zzn) {
                return -1;
            }
            zzaif zzaifVar2 = this.zzk;
            if (zzaifVar2 != null) {
                if (!zzaifVar2.zze(zzagiVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzagiVar.zzn() & 1) == 1) {
                zzagiVar.zzf(1);
            }
            zzeu zzeuVar5 = this.zza;
            zzagiVar.zzi(zzeuVar5.zzi(), 0, 12);
            zzeuVar5.zzh(0);
            int iZzC5 = zzeuVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzeuVar5.zzh(8);
                zzagiVar.zzf(zzeuVar5.zzC() != 1769369453 ? 8 : 12);
                zzagiVar.zzl();
                return 0;
            }
            int iZzC6 = zzeuVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzagiVar.zzn() + ((long) iZzC6) + 8;
                return 0;
            }
            zzagiVar.zzf(8);
            zzagiVar.zzl();
            zzaif zzaifVarZzi = zzi(iZzC5);
            if (zzaifVarZzi == null) {
                this.zzj = zzagiVar.zzn() + ((long) iZzC6);
                return 0;
            }
            zzaifVarZzi.zzd(iZzC6);
            this.zzk = zzaifVarZzi;
            return 0;
        }
        zzeu zzeuVar6 = new zzeu(this.zzo);
        zzagiVar.zzc(zzeuVar6.zzi(), 0, this.zzo);
        if (zzeuVar6.zzd() < 16) {
            i10 = 0;
            j10 = 0;
        } else {
            int iZzg = zzeuVar6.zzg();
            zzeuVar6.zzk(8);
            long jZzC = zzeuVar6.zzC();
            i10 = 0;
            long j14 = this.zzm;
            j10 = jZzC > j14 ? 0L : j14 + 8;
            zzeuVar6.zzh(iZzg);
        }
        while (zzeuVar6.zzd() >= 16) {
            int iZzC7 = zzeuVar6.zzC();
            int iZzC8 = zzeuVar6.zzC();
            long jZzC2 = ((long) zzeuVar6.zzC()) + j10;
            zzeuVar6.zzk(4);
            zzaif zzaifVarZzi2 = zzi(iZzC7);
            if (zzaifVarZzi2 != null) {
                zzaifVarZzi2.zza(jZzC2, (iZzC8 & 16) == 16 ? 1 : i10);
            }
        }
        zzaif[] zzaifVarArr = this.zzi;
        int length = zzaifVarArr.length;
        for (int i19 = i10; i19 < length; i19++) {
            zzaifVarArr[i19].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzahj(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzaia(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaif zzaifVar : this.zzi) {
            zzaifVar.zzf(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    public final /* synthetic */ zzaif[] zzh() {
        return this.zzi;
    }

    public zzaic(int i10, zzanx zzanxVar) {
        this.zzd = zzanxVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzeu(12);
        this.zzb = new zzaib(null);
        this.zzf = new zzahg();
        this.zzi = new zzaif[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
