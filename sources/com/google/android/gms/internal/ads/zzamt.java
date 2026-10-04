package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzamt {
    private static final zzguz zza = zzguz.zza(zzgty.zzd(':'));
    private static final zzguz zzb = zzguz.zza(zzgty.zzd('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb(zzagi zzagiVar, zzahh zzahhVar, List list) throws IOException {
        int i10;
        byte b10;
        char c10;
        int i11 = this.zzd;
        if (i11 == 0) {
            long jZzo = zzagiVar.zzo();
            zzahhVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i12 = 2;
        if (i11 != 1) {
            short s10 = 2817;
            short s11 = 2816;
            short s12 = 2192;
            if (i11 != 2) {
                long jZzn = zzagiVar.zzn();
                int iZzo = (int) ((zzagiVar.zzo() - zzagiVar.zzn()) - ((long) this.zze));
                zzeu zzeuVar = new zzeu(iZzo);
                zzagiVar.zzc(zzeuVar.zzi(), 0, iZzo);
                int i13 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i13 >= list2.size()) {
                        zzahhVar.zza = 0L;
                        return 1;
                    }
                    zzams zzamsVar = (zzams) list2.get(i13);
                    zzeuVar.zzh((int) (zzamsVar.zza - jZzn));
                    zzeuVar.zzk(4);
                    int iZzC = zzeuVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    String strZzK = zzeuVar.zzK(iZzC, charset);
                    switch (strZzK.hashCode()) {
                        case -1711564334:
                            b10 = strZzK.equals("SlowMotion_Data") ? (byte) 0 : (byte) -1;
                            break;
                        case -1332107749:
                            b10 = strZzK.equals("Super_SlowMotion_Edit_Data") ? (byte) 3 : (byte) -1;
                            break;
                        case -1251387154:
                            b10 = strZzK.equals("Super_SlowMotion_Data") ? (byte) 1 : (byte) -1;
                            break;
                        case -830665521:
                            b10 = strZzK.equals("Super_SlowMotion_Deflickering_On") ? (byte) 4 : (byte) -1;
                            break;
                        case 1760745220:
                            b10 = strZzK.equals("Super_SlowMotion_BGM") ? (byte) 2 : (byte) -1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        c10 = 2192;
                    } else if (b10 == 1) {
                        c10 = 2816;
                    } else if (b10 == 2) {
                        c10 = 2817;
                    } else if (b10 == 3) {
                        c10 = 2819;
                    } else {
                        if (b10 != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c10 = 2820;
                    }
                    int i14 = zzamsVar.zzb - (iZzC + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZzg = zzb.zzg(zzeuVar.zzK(i14, charset));
                        for (int i15 = 0; i15 < listZzg.size(); i15++) {
                            List listZzg2 = zza.zzg((CharSequence) listZzg.get(i15));
                            if (listZzg2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzakg(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                            } catch (NumberFormatException e10) {
                                throw zzat.zzb(null, e10);
                            }
                        }
                        list.add(new zzakh(arrayList));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                        throw new IllegalStateException();
                    }
                    i13++;
                }
            } else {
                long jZzo2 = zzagiVar.zzo();
                int i16 = this.zze - 20;
                zzeu zzeuVar2 = new zzeu(i16);
                zzagiVar.zzc(zzeuVar2.zzi(), 0, i16);
                int i17 = 0;
                while (i17 < i16 / 12) {
                    zzeuVar2.zzk(i12);
                    short sZzw = zzeuVar2.zzw();
                    if (sZzw == s12 || sZzw == s11 || sZzw == s10 || sZzw == 2819 || sZzw == 2820) {
                        i10 = i16;
                        this.zzc.add(new zzams(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzeuVar2.zzC()), zzeuVar2.zzC()));
                    } else {
                        zzeuVar2.zzk(8);
                        i10 = i16;
                    }
                    i17++;
                    i16 = i10;
                    i12 = 2;
                    s10 = 2817;
                    s11 = 2816;
                    s12 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzahhVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzahhVar.zza = ((zzams) list3.get(0)).zza;
                }
            }
        } else {
            zzeu zzeuVar3 = new zzeu(8);
            zzagiVar.zzc(zzeuVar3.zzi(), 0, 8);
            this.zze = zzeuVar3.zzC() + 8;
            if (zzeuVar3.zzB() != 1397048916) {
                zzahhVar.zza = 0L;
            } else {
                zzahhVar.zza = zzagiVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
