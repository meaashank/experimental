package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzien implements zzihj {
    private final zziem zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzien(zziem zziemVar) {
        zziemVar.getClass();
        this.zza = zziemVar;
        zziemVar.zzd = this;
    }

    private final void zzQ(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zziem zziemVar = this.zza;
        int iZzo = zziemVar.zzo();
        zziemVar.zzJ();
        int iZzB = zziemVar.zzB(iZzo);
        zziemVar.zza++;
        zzihoVar.zzg(obj, this, zziewVar);
        zziemVar.zzb(0);
        zziemVar.zza--;
        zziemVar.zzC(iZzB);
    }

    private final Object zzS(zziho zzihoVar, zziew zziewVar) throws IOException {
        Object objZza = zzihoVar.zza();
        zzR(objZza, zzihoVar, zziewVar);
        zzihoVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzihoVar.zzg(obj, this, zziewVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzige("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final Object zzU(zziin zziinVar, Class cls, zziew zziewVar) throws IOException {
        zziin zziinVar2 = zziin.zza;
        switch (zziinVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzihg.zza().zzb(cls), zziewVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i10) throws IOException {
        if (this.zza.zzE() != i10) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzige("Failed to parse the message.");
        }
    }

    private static final void zzX(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzige("Failed to parse the message.");
        }
    }

    public static zzien zza(zziem zziemVar) {
        Object obj = zziemVar.zzd;
        return obj != null ? (zzien) obj : new zzien(zziemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzg());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzg());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzg()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzg()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzh());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzh());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzh()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzh()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzX(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzigkVar.zzd(zziemVar.zzi());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzi());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zziemVar3.zzi()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzi()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzW(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzifnVar.zzi(zziemVar.zzj());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            if (i10 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzj());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zziemVar3.zzj()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            if (i11 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzj()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidy) {
            zzidy zzidyVar = (zzidy) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzidyVar.zzg(zziemVar.zzk());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzidyVar.zzg(zziemVar2.zzk());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zziemVar3.zzk()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Boolean.valueOf(zziemVar4.zzk()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z10) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzigh) && !z10) {
            zzigh zzighVar = (zzigh) list;
            do {
                zzq();
                zzighVar.zzb();
                zziem zziemVar = this.zza;
                if (zziemVar.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzn() : zzm());
                zziem zziemVar2 = this.zza;
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza = zziemVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzG(List list, zziho zzihoVar, zziew zziewVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzihoVar, zziewVar));
            zziem zziemVar = this.zza;
            if (zziemVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zziemVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    @Deprecated
    public final void zzH(List list, zziho zzihoVar, zziew zziewVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zzihoVar.zza();
            zzT(objZza, zzihoVar, zziewVar);
            zzihoVar.zzk(objZza);
            list.add(objZza);
            zziem zziemVar = this.zza;
            if (zziemVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zziemVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zziem zziemVar = this.zza;
            if (zziemVar.zzD()) {
                return;
            } else {
                iZza = zziemVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzo());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzo());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzo()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzo()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzp());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzp());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzp()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzp()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzW(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzifnVar.zzi(zziemVar.zzq());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            if (i10 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzq());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zziemVar3.zzq()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            if (i11 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzq()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzX(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzigkVar.zzd(zziemVar.zzr());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzr());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zziemVar3.zzr()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzr()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzs());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzs());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzs()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzs()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzt());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzt());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzt()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzt()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r9.zza.zzC(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzihj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzP(java.util.Map r10, com.google.android.gms.internal.ads.zzigo r11, com.google.android.gms.internal.ads.zziew r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.zzQ(r0)
            com.google.android.gms.internal.ads.zziem r1 = r9.zza
            int r2 = r1.zzo()
            int r2 = r1.zzB(r2)
            java.lang.Object r3 = r11.zzd
            java.lang.Object r4 = r11.zzb
            r5 = r3
        L13:
            int r6 = r9.zzb()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.zzD()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.zzd()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.android.gms.internal.ads.zzige r6 = new com.google.android.gms.internal.ads.zzige     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
        L37:
            r10 = move-exception
            goto L64
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            com.google.android.gms.internal.ads.zziin r6 = r11.zzc     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            java.lang.Object r5 = r9.zzU(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            goto L13
        L46:
            com.google.android.gms.internal.ads.zziin r6 = r11.zza     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            r7 = 0
            java.lang.Object r4 = r9.zzU(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzigd -> L39
            goto L13
        L4e:
            boolean r7 = r9.zzd()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.android.gms.internal.ads.zzige r10 = new com.google.android.gms.internal.ads.zzige     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zziem r10 = r9.zza
            r10.zzC(r2)
            return
        L64:
            com.google.android.gms.internal.ads.zziem r11 = r9.zza
            r11.zzC(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzien.zzP(java.util.Map, com.google.android.gms.internal.ads.zzigo, com.google.android.gms.internal.ads.zziew):void");
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        if (iZza == 0 || iZza == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i10;
        zziem zziemVar = this.zza;
        if (zziemVar.zzD() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return zziemVar.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzo(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zzQ(2);
        zzR(obj, zzihoVar, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzp(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zzQ(3);
        zzT(obj, zzihoVar, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final zziei zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zziet) {
            zziet zzietVar = (zziet) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzX(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzietVar.zzg(zziemVar.zzd());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzietVar.zzg(zziemVar2.zzd());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Double.valueOf(zziemVar3.zzd()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Double.valueOf(zziemVar4.zzd()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifd) {
            zzifd zzifdVar = (zzifd) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziem zziemVar = this.zza;
                int iZzo = zziemVar.zzo();
                zzW(iZzo);
                int iZzE = zziemVar.zzE() + iZzo;
                do {
                    zzifdVar.zzg(zziemVar.zze());
                } while (zziemVar.zzE() < iZzE);
                return;
            }
            if (i10 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifdVar.zzg(zziemVar2.zze());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziem zziemVar3 = this.zza;
                int iZzo2 = zziemVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zziemVar3.zzE() + iZzo2;
                do {
                    list.add(Float.valueOf(zziemVar3.zze()));
                } while (zziemVar3.zzE() < iZzE2);
                return;
            }
            if (i11 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Float.valueOf(zziemVar4.zze()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int iZzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzf());
                } while (zziemVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzf());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zziemVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int iZzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzf()));
                } while (zziemVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzf()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    iZza = zziemVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }
}
