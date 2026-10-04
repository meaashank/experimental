package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
final class zzarp implements zzarh {
    final /* synthetic */ zzarr zza;
    private final zzet zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzarp(zzarr zzarrVar, int i10) {
        Objects.requireNonNull(zzarrVar);
        this.zza = zzarrVar;
        this.zzb = new zzet(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        zzarr zzarrVar;
        int i10;
        zzet zzetVar;
        int i11;
        int i12;
        if (zzeuVar.zzs() != 2) {
            return;
        }
        zzarr zzarrVar2 = this.zza;
        zzfj zzfjVar = (zzfj) zzarrVar2.zzh().get(0);
        if ((zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(1);
            int iZzt = zzeuVar.zzt();
            int i13 = 3;
            zzeuVar.zzk(3);
            zzet zzetVar2 = this.zzb;
            zzeuVar.zzl(zzetVar2, 2);
            zzetVar2.zzh(3);
            int i14 = 13;
            zzarrVar2.zzq(zzetVar2.zzj(13));
            zzeuVar.zzl(zzetVar2, 2);
            int i15 = 4;
            zzetVar2.zzh(4);
            int i16 = 12;
            zzeuVar.zzk(zzetVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzeuVar.zzd();
            while (iZzd > 0) {
                int i17 = 5;
                zzeuVar.zzl(zzetVar2, 5);
                int iZzj = zzetVar2.zzj(8);
                zzetVar2.zzh(i13);
                int iZzj2 = zzetVar2.zzj(i14);
                zzetVar2.zzh(i15);
                int iZzj3 = zzetVar2.zzj(i16);
                int iZzg = zzeuVar.zzg();
                int i18 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i19 = -1;
                int iZzs = 0;
                while (zzeuVar.zzg() < i18) {
                    int iZzs2 = zzeuVar.zzs();
                    int iZzg2 = zzeuVar.zzg() + zzeuVar.zzs();
                    if (iZzg2 > i18) {
                        break;
                    }
                    if (iZzs2 == i17) {
                        long jZzz = zzeuVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i12 = 36;
                                        zzarrVar = zzarrVar2;
                                        i19 = i12;
                                        i10 = iZzg2;
                                        zzetVar = zzetVar2;
                                        i11 = iZzd;
                                    }
                                    zzarrVar = zzarrVar2;
                                    i10 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i11 = iZzd;
                                }
                                zzarrVar = zzarrVar2;
                                i10 = iZzg2;
                                zzetVar = zzetVar2;
                                i11 = iZzd;
                                i19 = 172;
                            }
                            zzarrVar = zzarrVar2;
                            zzetVar = zzetVar2;
                            i11 = iZzd;
                            i19 = 135;
                            i10 = iZzg2;
                        }
                        zzarrVar = zzarrVar2;
                        i10 = iZzg2;
                        zzetVar = zzetVar2;
                        i11 = iZzd;
                        i19 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzarrVar = zzarrVar2;
                                zzetVar = zzetVar2;
                                i11 = iZzd;
                                i19 = 135;
                                i10 = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzeuVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i12 = Opcodes.L2I;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i12 = Opcodes.F2I;
                                            }
                                            zzarrVar = zzarrVar2;
                                            i10 = iZzg2;
                                            zzetVar = zzetVar2;
                                            i11 = iZzd;
                                        }
                                    }
                                    zzarrVar = zzarrVar2;
                                    i10 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i11 = iZzd;
                                    i19 = 172;
                                } else if (iZzs2 == 123) {
                                    i12 = 138;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzeuVar.zzs();
                                    zzarrVar = zzarrVar2;
                                    str = strTrim;
                                    i10 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i11 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzeuVar.zzg() < iZzg2) {
                                        int i20 = iZzg2;
                                        String strTrim2 = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzeuVar.zzs();
                                        int i21 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzeuVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzars(strTrim2, iZzs4, bArr));
                                        iZzd = i21;
                                        iZzg2 = i20;
                                        zzetVar2 = zzetVar2;
                                        zzarrVar2 = zzarrVar2;
                                    }
                                    zzarrVar = zzarrVar2;
                                    i10 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i11 = iZzd;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    zzarrVar = zzarrVar2;
                                    i10 = iZzg2;
                                    zzetVar = zzetVar2;
                                    i11 = iZzd;
                                    if (iZzs2 == 111) {
                                        i19 = 257;
                                    }
                                }
                                zzarrVar = zzarrVar2;
                                i19 = i12;
                                i10 = iZzg2;
                                zzetVar = zzetVar2;
                                i11 = iZzd;
                            }
                        }
                        zzarrVar = zzarrVar2;
                        i10 = iZzg2;
                        zzetVar = zzetVar2;
                        i11 = iZzd;
                        i19 = 129;
                    }
                    zzeuVar.zzk(i10 - zzeuVar.zzg());
                    iZzd = i11;
                    zzetVar2 = zzetVar;
                    zzarrVar2 = zzarrVar;
                    i17 = 5;
                }
                zzarr zzarrVar3 = zzarrVar2;
                zzet zzetVar3 = zzetVar2;
                int i22 = iZzd;
                zzeuVar.zzh(i18);
                zzart zzartVar = new zzart(i19, str, iZzs, arrayList, Arrays.copyOfRange(zzeuVar.zzi(), iZzg, i18));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzartVar.zza;
                }
                iZzd = i22 - (iZzj3 + 5);
                if (!zzarrVar3.zzk().get(iZzj2)) {
                    zzarw zzarwVarZzb = zzarrVar3.zzi().zzb(iZzj, zzartVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzarwVarZzb);
                }
                i15 = 4;
                zzetVar2 = zzetVar3;
                zzarrVar2 = zzarrVar3;
                i13 = 3;
                i14 = 13;
                i16 = 12;
            }
            zzarr zzarrVar4 = zzarrVar2;
            int size = sparseIntArray.size();
            for (int i23 = 0; i23 < size; i23++) {
                int iKeyAt = sparseIntArray.keyAt(i23);
                int iValueAt = sparseIntArray.valueAt(i23);
                zzarrVar4.zzk().put(iKeyAt, true);
                zzarrVar4.zzl().put(iValueAt, true);
                zzarw zzarwVar = (zzarw) sparseArray.valueAt(i23);
                if (zzarwVar != null) {
                    zzarwVar.zza(zzfjVar, zzarrVar4.zzm(), new zzarv(iZzt, iKeyAt, 8192));
                    zzarrVar4.zzj().put(iValueAt, zzarwVar);
                }
            }
            zzarrVar4.zzj().remove(this.zze);
            zzarrVar4.zzo(0);
            if (zzarrVar4.zzn() == 0) {
                zzarrVar4.zzm().zzv();
                zzarrVar4.zzp(true);
            }
        }
    }
}
