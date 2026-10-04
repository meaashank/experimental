package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1711w0;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    public static final /* synthetic */ int zzR = 0;
    public final float zzA;
    public final int zzB;
    public final boolean zzC;
    public final float zzD;

    @Nullable
    public final byte[] zzE;
    public final int zzF;

    @Nullable
    public final zzi zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    public final int zzO;
    public final int zzP;
    public final int zzQ;
    private int zzS;

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final List zzc;

    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzap zzl;

    @Nullable
    public final Object zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final String zzo;

    @Nullable
    public final String zzp;
    public final int zzq;
    public final int zzr;
    public final List zzs;

    @Nullable
    public final zzq zzt;
    public final long zzu;
    public final boolean zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final int zzz;

    static {
        new zzv(new zzt());
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
        Integer.toString(39, 36);
        Integer.toString(40, 36);
    }

    public /* synthetic */ zzv(zzt zztVar, byte[] bArr) {
        this(zztVar);
    }

    public static String zze(@Nullable zzv zzvVar) {
        String str;
        int i10;
        int i11;
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("id=");
        sbA.append(zzvVar.zza);
        sbA.append(", mimeType=");
        sbA.append(zzvVar.zzp);
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            sbA.append(", container=");
            sbA.append(str2);
        }
        String str3 = zzvVar.zzn;
        if (str3 != null) {
            sbA.append(", primaryGroupId=");
            sbA.append(str3);
        }
        int i12 = zzvVar.zzj;
        if (i12 != -1) {
            sbA.append(", bitrate=");
            sbA.append(i12);
        }
        String str4 = zzvVar.zzk;
        if (str4 != null) {
            sbA.append(", codecs=");
            sbA.append(str4);
        }
        zzq zzqVar = zzvVar.zzt;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i13 = 0; i13 < zzqVar.zzb; i13++) {
                UUID uuid = zzqVar.zza(i13).zza;
                if (uuid.equals(zzg.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzg.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    String string = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbA.append(", drm=[");
            zzgue.zzb(sbA, linkedHashSet, ",");
            sbA.append(']');
        }
        int i14 = zzvVar.zzw;
        if (i14 != -1 && (i11 = zzvVar.zzx) != -1) {
            C1711w0.a(sbA, ", res=", i14, "x", i11);
        }
        int i15 = zzvVar.zzy;
        if (i15 != -1 && (i10 = zzvVar.zzz) != -1) {
            C1711w0.a(sbA, ", decRes=", i15, "x", i10);
        }
        float f10 = zzvVar.zzD;
        int i16 = zzhaw.zza;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbA.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str5 = zzfm.zza;
            sbA.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.zzG;
        if (zziVar != null && (zziVar.zze() || zziVar.zzf())) {
            sbA.append(", color=");
            sbA.append(zziVar.zzg());
        }
        float f11 = zzvVar.zzA;
        if (f11 != -1.0f) {
            sbA.append(", fps=");
            sbA.append(f11);
        }
        int i17 = zzvVar.zzB;
        if (i17 != 0) {
            sbA.append(", rotation=");
            sbA.append(i17);
        }
        if (zzvVar.zzC) {
            sbA.append(", mirrorHorizontal");
        }
        int i18 = zzvVar.zzH;
        if (i18 != -1) {
            sbA.append(", maxSubLayers=");
            sbA.append(i18);
        }
        int i19 = zzvVar.zzI;
        if (i19 != -1) {
            sbA.append(", channels=");
            sbA.append(i19);
        }
        int i20 = zzvVar.zzJ;
        if (i20 != -1) {
            sbA.append(", channel_mask=");
            sbA.append(i20);
        }
        int i21 = zzvVar.zzK;
        if (i21 != -1) {
            sbA.append(", sample_rate=");
            sbA.append(i21);
        }
        String str6 = zzvVar.zzd;
        if (str6 != null) {
            sbA.append(", language=");
            sbA.append(str6);
        }
        List list = zzvVar.zzc;
        if (!list.isEmpty()) {
            sbA.append(", labels=[");
            zzgue.zzb(sbA, zzgym.zzc(list, zzu.zza), ",");
            sbA.append("]");
        }
        int i22 = zzvVar.zze;
        if (i22 != 0) {
            sbA.append(", selectionFlags=[");
            String str7 = zzfm.zza;
            ArrayList arrayList = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i22 & 2) != 0) {
                arrayList.add("forced");
            }
            zzgue.zzb(sbA, arrayList, ",");
            sbA.append("]");
        }
        int i23 = zzvVar.zzf;
        if (i23 != 0) {
            sbA.append(", roleFlags=[");
            int i24 = i23 & 32768;
            String str8 = zzfm.zza;
            ArrayList arrayList2 = new ArrayList();
            if ((i23 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i23 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i23 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i23 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i23 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i23 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i23 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i23 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i23 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i23 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i23 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i23 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i23 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i23 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i23 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i24 != 0) {
                arrayList2.add("auxiliary");
            }
            zzgue.zzb(sbA, arrayList2, ",");
            sbA.append("]");
        }
        if ((i23 & 32768) != 0) {
            sbA.append(", auxiliaryTrackType=");
            int i25 = zzvVar.zzg;
            String str9 = zzfm.zza;
            if (i25 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i25 == 1) {
                str = "original";
            } else if (i25 == 2) {
                str = "depth-linear";
            } else if (i25 == 3) {
                str = "depth-inverse";
            } else {
                if (i25 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbA.append(str);
        }
        return sbA.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzv.class == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            int i11 = this.zzS;
            if ((i11 == 0 || (i10 = zzvVar.zzS) == 0 || i11 == i10) && this.zze == zzvVar.zze && this.zzf == zzvVar.zzf && this.zzg == zzvVar.zzg && this.zzh == zzvVar.zzh && this.zzi == zzvVar.zzi && this.zzq == zzvVar.zzq && this.zzu == zzvVar.zzu && this.zzw == zzvVar.zzw && this.zzx == zzvVar.zzx && this.zzy == zzvVar.zzy && this.zzz == zzvVar.zzz && this.zzB == zzvVar.zzB && this.zzC == zzvVar.zzC && this.zzF == zzvVar.zzF && this.zzH == zzvVar.zzH && this.zzI == zzvVar.zzI && this.zzJ == zzvVar.zzJ && this.zzK == zzvVar.zzK && this.zzL == zzvVar.zzL && this.zzM == zzvVar.zzM && this.zzN == zzvVar.zzN && this.zzO == zzvVar.zzO && this.zzQ == zzvVar.zzQ && Float.compare(this.zzA, zzvVar.zzA) == 0 && Float.compare(this.zzD, zzvVar.zzD) == 0 && Objects.equals(this.zza, zzvVar.zza) && Objects.equals(this.zzb, zzvVar.zzb) && this.zzc.equals(zzvVar.zzc) && Objects.equals(this.zzk, zzvVar.zzk) && Objects.equals(this.zzn, zzvVar.zzn) && Objects.equals(this.zzo, zzvVar.zzo) && Objects.equals(this.zzp, zzvVar.zzp) && Objects.equals(this.zzd, zzvVar.zzd) && Arrays.equals(this.zzE, zzvVar.zzE) && Objects.equals(this.zzl, zzvVar.zzl) && Objects.equals(this.zzG, zzvVar.zzG) && Objects.equals(this.zzt, zzvVar.zzt) && zzd(zzvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzS;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = this.zzc.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.zzl;
        int iHashCode5 = iHashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.zzn;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzo;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int iA = ((((((((((((((((((((((androidx.compose.animation.B.a(this.zzD, (((androidx.compose.animation.B.a(this.zzA, (((((((((((((((iHashCode7 + (this.zzp != null ? r0.hashCode() : 0)) * 31) + this.zzq) * 31) + ((int) this.zzu)) * 31) + this.zzw) * 31) + this.zzx) * 31) - 1) * 31) + this.zzy) * 31) + this.zzz) * 31, 31) + this.zzB) * 31) + (this.zzC ? 1 : 0)) * 31, 31) + this.zzF) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) + this.zzM) * 31) + this.zzN) * 31) + this.zzO) * 31) - 1) * 31) - 1) * 31) + this.zzQ;
        this.zzS = iA;
        return iA;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzG);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzo;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzp;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zzk;
        int length5 = String.valueOf(str5).length();
        int i10 = this.zzj;
        int length6 = String.valueOf(i10).length();
        String str6 = this.zzd;
        int length7 = String.valueOf(str6).length();
        int i11 = this.zzw;
        int length8 = String.valueOf(i11).length();
        int i12 = this.zzx;
        int length9 = String.valueOf(i12).length();
        float f10 = this.zzA;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i13 = this.zzI;
        int length12 = String.valueOf(i13).length();
        int i14 = this.zzJ;
        int length13 = String.valueOf(i14).length();
        int i15 = this.zzK;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i15).length() + 2);
        androidx.room.F.a(sb2, "Format(", str, U6.j.f68738d, str2);
        androidx.room.F.a(sb2, U6.j.f68738d, str3, U6.j.f68738d, str4);
        sb2.append(U6.j.f68738d);
        sb2.append(str5);
        sb2.append(U6.j.f68738d);
        sb2.append(i10);
        sb2.append(U6.j.f68738d);
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(U6.j.f68738d);
        sb2.append(i12);
        sb2.append(U6.j.f68738d);
        sb2.append(f10);
        sb2.append(U6.j.f68738d);
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i13);
        C1711w0.a(sb2, U6.j.f68738d, i14, U6.j.f68738d, i15);
        sb2.append("])");
        return sb2.toString();
    }

    public final zzt zza() {
        return new zzt(this, null);
    }

    public final zzv zzb(int i10) {
        zzt zztVar = new zzt(this, null);
        zztVar.zzP(i10);
        return new zzv(zztVar);
    }

    public final int zzc() {
        int i10;
        int i11 = this.zzw;
        if (i11 == -1 || (i10 = this.zzx) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean zzd(zzv zzvVar) {
        List list = this.zzs;
        int size = list.size();
        List list2 = zzvVar.zzs;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzv(zzt zztVar) {
        boolean z10;
        String str;
        this.zza = zztVar.zzR();
        String strZzi = zzfm.zzi(zztVar.zzU());
        this.zzd = strZzi;
        if (zztVar.zzT().isEmpty() && zztVar.zzS() != null) {
            this.zzc = zzgxm.zzj(new zzx(strZzi, zztVar.zzS()));
            this.zzb = zztVar.zzS();
        } else if (!zztVar.zzT().isEmpty() && zztVar.zzS() == null) {
            this.zzc = zztVar.zzT();
            List listZzT = zztVar.zzT();
            Iterator it = listZzT.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) listZzT.get(0)).zzb;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.zza, strZzi)) {
                    str = zzxVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        } else if (zztVar.zzT().isEmpty() && zztVar.zzS() == null) {
            z10 = true;
            zzguk.zzi(z10);
            this.zzc = zztVar.zzT();
            this.zzb = zztVar.zzS();
        } else {
            for (int i10 = 0; i10 < zztVar.zzT().size(); i10++) {
                if (((zzx) zztVar.zzT().get(i10)).zzb.equals(zztVar.zzS())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            zzguk.zzi(z10);
            this.zzc = zztVar.zzT();
            this.zzb = zztVar.zzS();
        }
        this.zze = zztVar.zzV();
        zzguk.zzj(zztVar.zzX() == 0 || (zztVar.zzW() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zztVar.zzW();
        this.zzg = zztVar.zzX();
        int iZzY = zztVar.zzY();
        this.zzh = iZzY;
        int iZzZ = zztVar.zzZ();
        this.zzi = iZzZ;
        this.zzj = iZzZ != -1 ? iZzZ : iZzY;
        this.zzk = zztVar.zzaa();
        this.zzl = zztVar.zzab();
        this.zzm = null;
        this.zzn = zztVar.zzac();
        this.zzo = zztVar.zzad();
        this.zzp = zztVar.zzae();
        this.zzq = zztVar.zzaf();
        this.zzr = zztVar.zzag();
        this.zzs = zztVar.zzah() == null ? Collections.EMPTY_LIST : zztVar.zzah();
        zzq zzqVarZzai = zztVar.zzai();
        this.zzt = zzqVarZzai;
        this.zzu = zztVar.zzaj();
        this.zzv = zztVar.zzak();
        this.zzw = zztVar.zzal();
        this.zzx = zztVar.zzam();
        this.zzy = zztVar.zzan();
        this.zzz = zztVar.zzao();
        this.zzA = zztVar.zzap();
        this.zzB = zztVar.zzaq() == -1 ? 0 : zztVar.zzaq();
        this.zzC = zztVar.zzar();
        this.zzD = zztVar.zzas() == -1.0f ? 1.0f : zztVar.zzas();
        this.zzE = zztVar.zzat();
        this.zzF = zztVar.zzau();
        this.zzG = zztVar.zzav();
        this.zzH = zztVar.zzaw();
        int iZzax = zztVar.zzax();
        this.zzI = iZzax;
        int iZzay = zztVar.zzay();
        this.zzJ = iZzay;
        if (iZzax != -1 && iZzay != -1 && Integer.bitCount(iZzay) != iZzax) {
            throw new IllegalStateException(zzgvb.zzd("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(iZzax), Integer.valueOf(iZzay)));
        }
        this.zzK = zztVar.zzaz();
        this.zzL = zztVar.zzaA();
        this.zzM = zztVar.zzaB() == -1 ? 0 : zztVar.zzaB();
        this.zzN = zztVar.zzaC() != -1 ? zztVar.zzaC() : 0;
        this.zzO = zztVar.zzaD();
        this.zzP = zztVar.zzaE();
        if (zztVar.zzaF() != 0 || zzqVarZzai == null) {
            this.zzQ = zztVar.zzaF();
        } else {
            this.zzQ = 1;
        }
    }
}
