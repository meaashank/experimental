package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzawb implements zzaws {
    public static final /* synthetic */ zzawb zza;
    public static final /* synthetic */ zzawb zzb;
    public static final /* synthetic */ zzawb zzc;
    public static final /* synthetic */ zzawb zzd;
    public static final /* synthetic */ zzawb zze;
    public static final /* synthetic */ zzawb zzf;
    public static final /* synthetic */ zzawb zzg;
    public static final /* synthetic */ zzawb zzh;
    public static final /* synthetic */ zzawb zzi;
    public static final /* synthetic */ zzawb zzj;
    public static final /* synthetic */ zzawb zzk;
    public static final /* synthetic */ zzawb zzl;
    public static final /* synthetic */ zzawb zzm;
    public static final /* synthetic */ zzawb zzn;
    public static final /* synthetic */ zzawb zzo;
    public static final /* synthetic */ zzawb zzp;
    private final /* synthetic */ int zzq;

    static {
        int i10 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i11 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i12 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i13 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i14 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i15 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i16 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i17 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i18 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i19 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i20 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i21 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzawb((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzawb((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzawb(i21);
        zzm = new zzawb(i12);
        zzl = new zzawb(i13);
        zzk = new zzawb(i14);
        zzj = new zzawb(i11);
        zzi = new zzawb(i15);
        zzh = new zzawb(i16);
        zzg = new zzawb(i17);
        zzf = new zzawb(i10);
        zze = new zzawb(i18);
        zzd = new zzawb(i19);
        zzc = new zzawb(i20);
        zzb = new zzawb(1);
        zza = new zzawb(0);
    }

    private /* synthetic */ zzawb(int i10) {
        this.zzq = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzavk zzavkVar;
        zzaxa zzaxaVarZzc;
        int i10 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i11 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzawv) obj).zza();
                                case 1:
                                    try {
                                        zzawr zzawrVar = ((zzawv) obj).zzb;
                                        long jZzm = zzawrVar.zzc().zzm();
                                        zzaxa zzaxaVarZzc2 = zzawrVar.zzc();
                                        List listZzo = zzaxaVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += (long) listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzawy();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzawrVar.zzb(zzaxaVarZzc2);
                                        return Optional.empty();
                                    } catch (zzawy unused) {
                                        zzavkVar = zzavk.zzI;
                                    }
                                    break;
                                case 2:
                                    zzawv zzawvVar = (zzawv) obj;
                                    zzawr zzawrVar2 = zzawvVar.zzb;
                                    zzaxa zzaxaVarZzc3 = zzawrVar2.zzc();
                                    zzawe zzaweVarZzn = zzawrVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzaxaVarZzc3.zzk(byteArrayOutputStream);
                                    zzawvVar.zzb.zzb(zzaxa.zzd(zzaweVarZzn.zzd(zzawe.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzawv zzawvVar2 = (zzawv) obj;
                                    zzawr zzawrVar3 = zzawvVar2.zzb;
                                    zzaxa zzaxaVarZzc4 = zzawrVar3.zzc();
                                    zzawe zzaweVarZzn2 = zzawrVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzawa.zzb(zzaxaVarZzc4.zzm(), new zzawz(byteArrayOutputStream2, i10 ^ i11), false);
                                    zzawvVar2.zzb.zzb(zzaxa.zzd(zzaweVarZzn2.zzd(zzawe.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzawv zzawvVar3 = (zzawv) obj;
                                    zzawvVar3.zzb.zze(-(zzawvVar3.zzc.zzb().zzb + zzawvVar3.zzd.zze()), zzawvVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzawr zzawrVar4 = ((zzawv) obj).zzb;
                                    zzawrVar4.zzb(zzaxa.zzb(zzawrVar4.zzc().zzm() << ((int) zzawrVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzawr zzawrVar5 = ((zzawv) obj).zzb;
                                    zzawrVar5.zzb(zzaxa.zzb(zzawrVar5.zzc().zzm() >>> ((int) zzawrVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzawr zzawrVar6 = ((zzawv) obj).zzb;
                                    zzawrVar6.zzb(zzaxa.zzc(zzawrVar6.zzc().zzq() - zzawrVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzawr zzawrVar7 = ((zzawv) obj).zzb;
                                    zzawrVar7.zzb(zzaxa.zzb(zzawrVar7.zzc().zzm() - zzawrVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzawv zzawvVar4 = (zzawv) obj;
                                    zzawr zzawrVar8 = zzawvVar4.zzb;
                                    long jZzm2 = zzawrVar8.zzc().zzm();
                                    zzaxa zzaxaVarZzc5 = zzawrVar8.zzc();
                                    zzawr zzawrVar9 = zzawvVar4.zzb;
                                    zzaxa zzaxaVarZzd = zzawrVar9.zzd(jZzm2);
                                    zzawrVar9.zze(jZzm2, zzaxaVarZzc5);
                                    zzawrVar9.zzb(zzaxaVarZzd);
                                    return Optional.empty();
                                case 10:
                                    zzawv zzawvVar5 = (zzawv) obj;
                                    zzawr zzawrVar10 = zzawvVar5.zzb;
                                    long jZzm3 = zzawvVar5.zzc.zzb().zzb + zzawrVar10.zzc().zzm();
                                    zzaxa zzaxaVarZzc6 = zzawrVar10.zzc();
                                    zzawr zzawrVar11 = zzawvVar5.zzb;
                                    long j10 = -jZzm3;
                                    zzaxa zzaxaVarZzd2 = zzawrVar11.zzd(j10);
                                    zzawrVar11.zze(j10, zzaxaVarZzc6);
                                    zzawrVar11.zzb(zzaxaVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzawv zzawvVar6 = (zzawv) obj;
                                    long jZze = zzawvVar6.zzc.zzb().zzb + zzawvVar6.zzd.zze();
                                    zzaxa zzaxaVarZzc7 = zzawvVar6.zzb.zzc();
                                    zzawr zzawrVar12 = zzawvVar6.zzb;
                                    long j11 = -jZze;
                                    zzaxa zzaxaVarZzd3 = zzawrVar12.zzd(j11);
                                    zzawrVar12.zze(j11, zzaxaVarZzc7);
                                    zzawrVar12.zzb(zzaxaVarZzd3);
                                    return Optional.empty();
                                case 12:
                                    zzawv zzawvVar7 = (zzawv) obj;
                                    long jZzm4 = zzawvVar7.zzb.zzc().zzm();
                                    try {
                                        zzawr zzawrVar13 = zzawvVar7.zzb;
                                        int i12 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i13 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzaxaVarZzc = zzawrVar13.zzc();
                                        } else {
                                            int iZza = zzawrVar13.zza(jZzm4);
                                            zzawrVar13.zzb += i12 ^ i13;
                                            zzaxaVarZzc = (zzaxa) zzawrVar13.zza.remove(iZza);
                                        }
                                        zzawrVar13.zzb(zzaxaVarZzc);
                                        return Optional.empty();
                                    } catch (zzawp unused2) {
                                        zzavkVar = zzavk.zzg;
                                    }
                                    break;
                                case 13:
                                    zzawv zzawvVar8 = (zzawv) obj;
                                    try {
                                        zzawr zzawrVar14 = zzawvVar8.zzb;
                                        long jZzm5 = zzawrVar14.zzc().zzm();
                                        long jZzm6 = zzawrVar14.zzc().zzm();
                                        zzawo zzawoVar = zzawvVar8.zzc;
                                        zzawj zzawjVar = zzawvVar8.zzd;
                                        zzawoVar.zza(zzawjVar.zzb(), jZzm6, zzawoVar.zzb().zzb);
                                        zzawjVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzawh | zzawi unused3) {
                                        zzavkVar = zzavk.zzr;
                                    } catch (zzawm unused4) {
                                        zzavkVar = zzavk.zzB;
                                    } catch (zzawn unused5) {
                                        zzavkVar = zzavk.zzw;
                                    }
                                    break;
                                case 14:
                                    zzawv zzawvVar9 = (zzawv) obj;
                                    try {
                                        zzawvVar9.zzb.zzb(zzaxa.zzg(zzawvVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzawx unused6) {
                                        zzavkVar = zzavk.zzp;
                                    }
                                    break;
                                default:
                                    try {
                                        zzawr zzawrVar15 = ((zzawv) obj).zzb;
                                        Iterator it = zzawrVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzawrVar15.zzb((zzaxa) it.next());
                                            break;
                                        }
                                        return Optional.empty();
                                    } catch (zzawq unused7) {
                                        zzavkVar = zzavk.zza;
                                    }
                                    break;
                            }
                        } catch (zzawp unused8) {
                            zzavkVar = zzavk.zzh;
                        }
                    } catch (zzawq e10) {
                        e = e10;
                        throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzawn | zzawp unused9) {
                    zzavkVar = zzavk.zzx;
                }
            } catch (zzawg | zzawi | zzawx unused10) {
                zzavkVar = zzavk.zzy;
            }
        } catch (zzawx unused11) {
            zzavkVar = zzavk.zzk;
        } catch (IOException e11) {
            e = e11;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzavkVar);
    }
}
