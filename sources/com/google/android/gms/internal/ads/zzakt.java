package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.collection.LruCacheKt;
import e.InterfaceC4335i;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakt implements zzagh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private boolean zzE;

    @Nullable
    private zzakn zzF;

    @Nullable
    private zzaks zzG;
    private boolean zzH;
    private int zzI;
    private long zzJ;
    private final SparseArray zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private long zzU;
    private boolean zzV;
    private int zzW;
    private long zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int[] zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private int zzaf;
    private boolean zzag;
    private long zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private boolean zzal;
    private boolean zzam;
    private boolean zzan;
    private int zzao;
    private byte zzap;
    private boolean zzaq;
    private zzagk zzar;
    private final zzakl zzas;
    private final zzakv zzh;
    private final SparseArray zzi;
    private final LongSparseArray zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final zzanx zzm;
    private final zzeu zzn;
    private final zzeu zzo;
    private final zzeu zzp;
    private final zzeu zzq;
    private final zzeu zzr;
    private final zzeu zzs;
    private final zzeu zzt;
    private final zzeu zzu;
    private final zzeu zzv;
    private final zzeu zzw;
    private ByteBuffer zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfm.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        C.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C.a(Opcodes.GETFIELD, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakt() {
        this(new zzakl(), 2, zzanx.zza);
    }

    private final long zzA(long j10) throws zzat {
        long j11 = this.zzA;
        if (j11 != -9223372036854775807L) {
            return zzfm.zzw(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzB(@Nullable int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void zzC() {
        if (!this.zzE) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzagk zzagkVar = this.zzar;
                zzagkVar.getClass();
                zzagkVar.zzv();
                this.zzE = false;
                return;
            }
            if (((zzaks) sparseArray.valueAt(i10)).zzW) {
                return;
            } else {
                i10++;
            }
        }
    }

    @EnsuresNonNull({"currentChapter"})
    private final void zzq(int i10) throws zzat {
        if (this.zzF != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in an EditionEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i10) throws zzat {
        if (this.zzG != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzs(int i10) throws zzat {
        if (this.zzL) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt(com.google.android.gms.internal.ads.zzaks r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakt.zzt(com.google.android.gms.internal.ads.zzaks, long, int, int, int):void");
    }

    private final void zzu(zzagi zzagiVar, int i10) throws IOException {
        zzeu zzeuVar = this.zzp;
        if (zzeuVar.zze() >= i10) {
            return;
        }
        if (zzeuVar.zzj() < i10) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzagiVar.zzc(zzeuVar.zzi(), zzeuVar.zze(), i10 - zzeuVar.zze());
        zzeuVar.zzf(i10);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzv(zzagi zzagiVar, zzaks zzaksVar, int i10, boolean z10) throws IOException {
        int i11;
        String str = zzaksVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzx(zzagiVar, zzb, i10);
            int i12 = this.zzaj;
            zzw();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzx(zzagiVar, zzd, i10);
            int i13 = this.zzaj;
            zzw();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzx(zzagiVar, zze, i10);
            int i14 = this.zzaj;
            zzw();
            return i14;
        }
        if (zzaksVar.zzW) {
            zzv zzvVar = zzaksVar.zzaa;
            zzvVar.getClass();
            zzv zzvVarZzi = zzagg.zzi(zzagiVar, i10, zzvVar);
            zzaksVar.zzaa = zzvVarZzi;
            zzaksVar.zzZ.zzA(zzvVarZzi);
            zzaksVar.zzW = false;
            zzC();
        }
        zzaht zzahtVar = zzaksVar.zzZ;
        if (!this.zzal) {
            if (zzaksVar.zzi) {
                this.zzae &= -1073741825;
                if (!this.zzam) {
                    zzeu zzeuVar = this.zzp;
                    zzagiVar.zzc(zzeuVar.zzi(), 0, 1);
                    this.zzai++;
                    if ((zzeuVar.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzap = zzeuVar.zzi()[0];
                    this.zzam = true;
                }
                byte b10 = this.zzap;
                if ((b10 & 1) == 1) {
                    int i15 = b10 & 2;
                    this.zzae |= 1073741824;
                    if (!this.zzaq) {
                        zzeu zzeuVar2 = this.zzu;
                        zzagiVar.zzc(zzeuVar2.zzi(), 0, 8);
                        this.zzai += 8;
                        this.zzaq = true;
                        zzeu zzeuVar3 = this.zzp;
                        zzeuVar3.zzi()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        zzeuVar3.zzh(0);
                        zzahtVar.zzd(zzeuVar3, 1, 1);
                        this.zzaj++;
                        zzeuVar2.zzh(0);
                        zzahtVar.zzd(zzeuVar2, 8, 1);
                        this.zzaj += 8;
                    }
                    if (i15 == 2) {
                        if (!this.zzan) {
                            zzeu zzeuVar4 = this.zzp;
                            zzagiVar.zzc(zzeuVar4.zzi(), 0, 1);
                            this.zzai++;
                            zzeuVar4.zzh(0);
                            this.zzao = zzeuVar4.zzs();
                            this.zzan = true;
                        }
                        int i16 = this.zzao * 4;
                        zzeu zzeuVar5 = this.zzp;
                        zzeuVar5.zza(i16);
                        zzagiVar.zzc(zzeuVar5.zzi(), 0, i16);
                        this.zzai += i16;
                        int i17 = (this.zzao >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzx;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.zzx = ByteBuffer.allocate(i18);
                        }
                        this.zzx.position(0);
                        this.zzx.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.zzao;
                            if (i19 >= i11) {
                                break;
                            }
                            int iZzH = zzeuVar5.zzH();
                            int i21 = iZzH - i20;
                            if (i19 % 2 == 0) {
                                this.zzx.putShort((short) i21);
                            } else {
                                this.zzx.putInt(i21);
                            }
                            i19++;
                            i20 = iZzH;
                        }
                        int i22 = (i10 - this.zzai) - i20;
                        if ((i11 & 1) == 1) {
                            this.zzx.putInt(i22);
                        } else {
                            this.zzx.putShort((short) i22);
                            this.zzx.putInt(0);
                        }
                        zzeu zzeuVar6 = this.zzv;
                        zzeuVar6.zzb(this.zzx.array(), i18);
                        zzahtVar.zzd(zzeuVar6, i18, 1);
                        this.zzaj += i18;
                    }
                }
            } else {
                byte[] bArr = zzaksVar.zzj;
                if (bArr != null) {
                    this.zzs.zzb(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaksVar.zzc) ? zzaksVar.zzh > 0 : z10) {
                this.zzae |= 268435456;
                this.zzw.zza(0);
                int iZze = (this.zzs.zze() + i10) - this.zzai;
                zzeu zzeuVar7 = this.zzp;
                zzeuVar7.zza(4);
                zzeuVar7.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzeuVar7.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzeuVar7.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzeuVar7.zzi()[3] = (byte) (iZze & 255);
                zzahtVar.zzd(zzeuVar7, 4, 2);
                this.zzaj += 4;
            }
            this.zzal = true;
        }
        zzeu zzeuVar8 = this.zzs;
        int iZze2 = zzeuVar8.zze() + i10;
        String str2 = zzaksVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaksVar.zzV != null) {
                zzguk.zzi(zzeuVar8.zze() == 0);
                zzaksVar.zzV.zzb(zzagiVar);
            }
            while (true) {
                int i23 = this.zzai;
                if (i23 >= iZze2) {
                    break;
                }
                int iZzz = zzz(zzagiVar, zzahtVar, iZze2 - i23);
                this.zzai += iZzz;
                this.zzaj += iZzz;
            }
        } else {
            zzeu zzeuVar9 = this.zzo;
            byte[] bArrZzi = zzeuVar9.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i24 = zzaksVar.zzab;
            int i25 = 4 - i24;
            while (this.zzai < iZze2) {
                int i26 = this.zzak;
                if (i26 == 0) {
                    int iMin = Math.min(i24, zzeuVar8.zzd());
                    zzagiVar.zzc(bArrZzi, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        zzeuVar8.zzm(bArrZzi, i25, iMin);
                    }
                    this.zzai += i24;
                    zzeuVar9.zzh(0);
                    this.zzak = zzeuVar9.zzH();
                    zzeu zzeuVar10 = this.zzn;
                    zzeuVar10.zzh(0);
                    zzahtVar.zzc(zzeuVar10, 4);
                    this.zzaj += 4;
                } else {
                    int iZzz2 = zzz(zzagiVar, zzahtVar, i26);
                    this.zzai += iZzz2;
                    this.zzaj += iZzz2;
                    this.zzak -= iZzz2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaksVar.zzc)) {
            zzeu zzeuVar11 = this.zzq;
            zzeuVar11.zzh(0);
            zzahtVar.zzc(zzeuVar11, 4);
            this.zzaj += 4;
        }
        int i27 = this.zzaj;
        zzw();
        return i27;
    }

    private final void zzw() {
        this.zzai = 0;
        this.zzaj = 0;
        this.zzak = 0;
        this.zzal = false;
        this.zzam = false;
        this.zzan = false;
        this.zzao = 0;
        this.zzap = (byte) 0;
        this.zzaq = false;
        this.zzs.zza(0);
    }

    private final void zzx(zzagi zzagiVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        zzeu zzeuVar = this.zzt;
        if (zzeuVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzeuVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzeuVar.zzi(), 0, length);
        }
        zzagiVar.zzc(zzeuVar.zzi(), length, i10);
        zzeuVar.zzh(0);
        zzeuVar.zzf(i11);
    }

    private static byte[] zzy(long j10, String str, long j11) {
        zzguk.zza(j10 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = zzfm.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzz(zzagi zzagiVar, zzaht zzahtVar, int i10) throws IOException {
        zzeu zzeuVar = this.zzs;
        int iZzd = zzeuVar.zzd();
        if (iZzd <= 0) {
            return zzahtVar.zza(zzagiVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzahtVar.zzc(zzeuVar, iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return new zzaku().zza(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if (this.zzl) {
            zzagkVar = new zzaoa(zzagkVar, this.zzm);
        }
        this.zzar = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        int i10 = 0;
        this.zzV = false;
        while (!this.zzV) {
            boolean zZzc = this.zzas.zzc(zzagiVar);
            if (zZzc) {
                long jZzn = zzagiVar.zzn();
                if (this.zzR) {
                    this.zzT = jZzn;
                    zzahhVar.zza = this.zzS;
                    this.zzR = false;
                    return 1;
                }
                if (this.zzH) {
                    long j10 = this.zzT;
                    if (j10 != -1) {
                        zzahhVar.zza = j10;
                        this.zzT = -1L;
                        return 1;
                    }
                }
            }
            if (!zZzc) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzaks zzaksVar = (zzaks) sparseArray.valueAt(i10);
                    zzaksVar.zzb();
                    zzahu zzahuVar = zzaksVar.zzV;
                    if (zzahuVar != null) {
                        zzahuVar.zzd(zzaksVar.zzZ, zzaksVar.zzk);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    @InterfaceC4335i
    public final void zze(long j10, long j11) {
        this.zzU = -9223372036854775807L;
        int i10 = 0;
        this.zzW = 0;
        this.zzas.zzb();
        this.zzh.zza();
        zzw();
        this.zzL = false;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        if (!this.zzH) {
            this.zzK.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzahu zzahuVar = ((zzaks) sparseArray.valueAt(i10)).zzV;
            if (zzahuVar != null) {
                zzahuVar.zza();
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    @InterfaceC4335i
    public final void zzh(int i10, long j10, long j11) throws zzat {
        zzagk zzagkVar = this.zzar;
        zzagkVar.getClass();
        if (i10 == 128) {
            zzq(i10);
            this.zzF.zzh = null;
            zzq(i10);
            this.zzF.zzi = null;
            return;
        }
        if (i10 == 160) {
            this.zzag = false;
            this.zzah = 0L;
            return;
        }
        if (i10 == 174) {
            zzaks zzaksVar = new zzaks();
            this.zzG = zzaksVar;
            zzaksVar.zza = this.zzD;
            return;
        }
        if (i10 == 187) {
            if (this.zzH) {
                return;
            }
            zzs(i10);
            this.zzM = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            this.zzI = -1;
            this.zzJ = -1L;
            return;
        }
        if (i10 == 20533) {
            zzr(i10);
            this.zzG.zzi = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzz;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzz = j10;
            this.zzy = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.zzH) {
                return;
            }
            this.zzL = true;
            return;
        }
        if (i10 == 524531317) {
            if (this.zzH) {
                return;
            }
            if (this.zzk && this.zzS != -1) {
                this.zzR = true;
                return;
            } else {
                zzagkVar.zzw(new zzahj(this.zzC, 0L));
                this.zzH = true;
                return;
            }
        }
        if (i10 == 182) {
            this.zzF = new zzakn();
            return;
        }
        if (i10 == 183 && !this.zzH) {
            zzs(i10);
            this.zzN = -1;
            this.zzO = -1L;
            this.zzP = -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        r26 = -1;
        r24 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        r40.zzar.zzw(new com.google.android.gms.internal.ads.zzahj(r40.zzC, 0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    @e.InterfaceC4335i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r41) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakt.zzi(int):void");
    }

    @InterfaceC4335i
    public final void zzj(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 136) {
            z10 = j10 == 1;
            zzr(i10);
            this.zzG.zzY = z10;
            return;
        }
        if (i10 == 137) {
            zzq(i10);
            this.zzF.zze = j10;
            return;
        }
        if (i10 == 145) {
            zzq(i10);
            this.zzF.zzb = j10;
            return;
        }
        if (i10 == 146) {
            zzq(i10);
            this.zzF.zzc = j10;
            return;
        }
        if (i10 == 240) {
            if (this.zzH) {
                return;
            }
            zzs(i10);
            if (this.zzP == -1) {
                this.zzP = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.zzH) {
                return;
            }
            zzs(i10);
            if (this.zzO == -1) {
                this.zzO = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i10 == 29636) {
            zzq(i10);
            this.zzF.zza = j10;
            return;
        }
        if (i10 == 29637) {
            zzr(i10);
            this.zzG.zze = j10;
            return;
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzr(i10);
                    this.zzG.zzf = 2;
                    return;
                }
                if (i11 == 2) {
                    zzr(i10);
                    this.zzG.zzf = 1;
                    return;
                } else if (i11 == 17) {
                    zzr(i10);
                    this.zzG.zzf = 3;
                    return;
                } else if (i11 != 33) {
                    zzr(i10);
                    this.zzG.zzf = -1;
                    return;
                } else {
                    zzr(i10);
                    this.zzG.zzf = 5;
                    return;
                }
            case Opcodes.DCMPG /* 152 */:
                z10 = j10 == 1;
                zzq(i10);
                this.zzF.zzd = z10;
                return;
            case 155:
                this.zzY = zzA(j10);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                zzr(i10);
                this.zzG.zzP = (int) j10;
                return;
            case Opcodes.ARETURN /* 176 */:
                zzr(i10);
                this.zzG.zzn = (int) j10;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                if (this.zzH) {
                    return;
                }
                zzs(i10);
                this.zzM = zzA(j10);
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                zzr(i10);
                this.zzG.zzo = (int) j10;
                return;
            case 215:
                zzr(i10);
                this.zzG.zzd = (int) j10;
                return;
            case 231:
                this.zzU = zzA(j10);
                return;
            case 238:
                this.zzaf = (int) j10;
                return;
            case 247:
                if (this.zzH) {
                    return;
                }
                zzs(i10);
                this.zzN = (int) j10;
                return;
            case 251:
                this.zzag = true;
                return;
            case 16871:
                zzr(i10);
                this.zzG.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzJ = j10 + this.zzz;
                return;
            case 21432:
                int i12 = (int) j10;
                zzr(i10);
                if (i12 == 0) {
                    this.zzG.zzy = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzG.zzy = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzG.zzy = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzG.zzy = 3;
                    return;
                }
            case 21680:
                zzr(i10);
                this.zzG.zzq = (int) j10;
                return;
            case 21682:
                zzr(i10);
                this.zzG.zzs = (int) j10;
                return;
            case 21690:
                zzr(i10);
                this.zzG.zzr = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzr(i10);
                this.zzG.zzX = z10;
                return;
            case 21938:
                zzr(i10);
                this.zzG.zzp = (int) j10;
                return;
            case 21998:
                zzr(i10);
                this.zzG.zzh = (int) j10;
                return;
            case 22186:
                zzr(i10);
                this.zzG.zzT = j10;
                return;
            case 22203:
                zzr(i10);
                this.zzG.zzU = j10;
                return;
            case 25188:
                zzr(i10);
                this.zzG.zzQ = (int) j10;
                return;
            case 30114:
                this.zzah = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzr(i10);
                if (i13 == 0) {
                    this.zzG.zzt = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzG.zzt = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzG.zzt = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzG.zzt = 3;
                    return;
                }
            case 2352003:
                zzr(i10);
                this.zzG.zzg = (int) j10;
                return;
            case 2807729:
                this.zzA = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzr(i10);
                        if (i14 == 1) {
                            this.zzG.zzB = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzG.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzr(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzG.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i10);
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzG.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i10);
                        this.zzG.zzC = (int) j10;
                        return;
                    case 21949:
                        zzr(i10);
                        this.zzG.zzD = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @InterfaceC4335i
    public final void zzk(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzr(i10);
            this.zzG.zzS = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzB = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzr(i10);
                this.zzG.zzE = (float) d10;
                break;
            case 21970:
                zzr(i10);
                this.zzG.zzF = (float) d10;
                break;
            case 21971:
                zzr(i10);
                this.zzG.zzG = (float) d10;
                break;
            case 21972:
                zzr(i10);
                this.zzG.zzH = (float) d10;
                break;
            case 21973:
                zzr(i10);
                this.zzG.zzI = (float) d10;
                break;
            case 21974:
                zzr(i10);
                this.zzG.zzJ = (float) d10;
                break;
            case 21975:
                zzr(i10);
                this.zzG.zzK = (float) d10;
                break;
            case 21976:
                zzr(i10);
                this.zzG.zzL = (float) d10;
                break;
            case 21977:
                zzr(i10);
                this.zzG.zzM = (float) d10;
                break;
            case 21978:
                zzr(i10);
                this.zzG.zzN = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzr(i10);
                        this.zzG.zzu = (float) d10;
                        break;
                    case 30324:
                        zzr(i10);
                        this.zzG.zzv = (float) d10;
                        break;
                    case 30325:
                        zzr(i10);
                        this.zzG.zzw = (float) d10;
                        break;
                }
                break;
        }
    }

    @InterfaceC4335i
    public final void zzl(int i10, String str) throws zzat {
        if (i10 == 133) {
            zzq(i10);
            this.zzF.zzh = str;
            return;
        }
        if (i10 == 134) {
            zzr(i10);
            this.zzG.zzc = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzD = Objects.equals(str, "webm");
                return;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 17276) {
            zzq(i10);
            this.zzF.zzi = str;
        } else if (i10 == 21358) {
            zzr(i10);
            this.zzG.zzb = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            zzr(i10);
            this.zzG.zze(str);
        }
    }

    @InterfaceC4335i
    public final void zzm(int i10, int i11, zzagi zzagiVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i10;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        if (i23 != 161 && i23 != 163) {
            if (i23 == 165) {
                if (this.zzW != 2) {
                    return;
                }
                zzaks zzaksVar = (zzaks) this.zzi.get(this.zzac);
                if (this.zzaf != 4 || !"V_VP9".equals(zzaksVar.zzc)) {
                    zzagiVar.zzf(i11);
                    return;
                }
                zzeu zzeuVar = this.zzw;
                zzeuVar.zza(i11);
                zzagiVar.zzc(zzeuVar.zzi(), 0, i11);
                return;
            }
            if (i23 == 16877) {
                zzr(i10);
                zzaks zzaksVar2 = this.zzG;
                if (zzaksVar2.zzc() != 1685485123 && zzaksVar2.zzc() != 1685480259) {
                    zzagiVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzaksVar2.zzO = bArr;
                zzagiVar.zzc(bArr, 0, i11);
                return;
            }
            if (i23 == 16981) {
                zzr(i10);
                byte[] bArr2 = new byte[i11];
                this.zzG.zzj = bArr2;
                zzagiVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i23 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzagiVar.zzc(bArr3, 0, i11);
                zzr(i10);
                this.zzG.zzk = new zzahs(1, bArr3, 0, 0);
                return;
            }
            if (i23 == 21419) {
                zzeu zzeuVar2 = this.zzr;
                Arrays.fill(zzeuVar2.zzi(), (byte) 0);
                zzagiVar.zzc(zzeuVar2.zzi(), 4 - i11, i11);
                zzeuVar2.zzh(0);
                this.zzI = (int) zzeuVar2.zzz();
                return;
            }
            if (i23 == 25506) {
                zzr(i10);
                byte[] bArr4 = new byte[i11];
                this.zzG.zzl = bArr4;
                zzagiVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i23 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i23).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i23);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzr(i10);
            byte[] bArr5 = new byte[i11];
            this.zzG.zzx = bArr5;
            zzagiVar.zzc(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (this.zzW == 0) {
            zzakv zzakvVar = this.zzh;
            this.zzac = (int) zzakvVar.zzb(zzagiVar, false, true, 8);
            this.zzad = zzakvVar.zzc();
            this.zzY = -9223372036854775807L;
            this.zzW = 1;
            this.zzp.zza(0);
        }
        zzaks zzaksVar3 = (zzaks) this.zzi.get(this.zzac);
        if (zzaksVar3 == null) {
            zzagiVar.zzf(i11 - this.zzad);
            this.zzW = 0;
            return;
        }
        zzaksVar3.zzb();
        if (this.zzW == 1) {
            zzu(zzagiVar, 3);
            zzeu zzeuVar3 = this.zzp;
            int i28 = (zzeuVar3.zzi()[2] & 6) >> 1;
            if (i28 == 0) {
                this.zzaa = 1;
                int[] iArrZzB = zzB(this.zzab, 1);
                this.zzab = iArrZzB;
                iArrZzB[0] = (i11 - this.zzad) - 3;
            } else {
                zzu(zzagiVar, 4);
                int i29 = (zzeuVar3.zzi()[3] & 255) + 1;
                this.zzaa = i29;
                int[] iArrZzB2 = zzB(this.zzab, i29);
                this.zzab = iArrZzB2;
                if (i28 == 2) {
                    int i30 = (i11 - this.zzad) - 4;
                    int i31 = this.zzaa;
                    Arrays.fill(iArrZzB2, 0, i31, i30 / i31);
                } else {
                    if (i28 != 1) {
                        if (i28 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.zzaa - 1;
                            if (i32 >= i35) {
                                i13 = i24;
                                i14 = i25;
                                i15 = i26;
                                this.zzab[i35] = ((i11 - this.zzad) - i34) - i33;
                                break;
                            }
                            this.zzab[i32] = i26;
                            int i36 = i34 + 1;
                            zzu(zzagiVar, i36);
                            if (zzeuVar3.zzi()[i34] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i37 = i26;
                            while (true) {
                                if (i26 >= i27) {
                                    i16 = i24;
                                    i17 = i25;
                                    i18 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i18 = i27;
                                int i38 = i25 << (7 - i26);
                                if ((zzeuVar3.zzi()[i34] & i38) != 0) {
                                    i36 += i26;
                                    zzu(zzagiVar, i36);
                                    int i39 = i34 + 1;
                                    int i40 = zzeuVar3.zzi()[i34] & 255 & (~i38);
                                    int i41 = i24;
                                    j10 = i40;
                                    i16 = i41;
                                    int i42 = i39;
                                    while (i42 < i36) {
                                        j10 = (j10 << i18) | ((long) (zzeuVar3.zzi()[i42] & 255));
                                        i25 = i25;
                                        i42++;
                                        i26 = i26;
                                    }
                                    i17 = i25;
                                    int i43 = i26;
                                    if (i32 > 0) {
                                        j10 -= (1 << ((i43 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    i27 = i18;
                                }
                            }
                            if (j10 < -2147483648L || j10 > LruCacheKt.f86729a) {
                                break;
                            }
                            int[] iArr = this.zzab;
                            int i44 = (int) j10;
                            if (i32 != 0) {
                                i44 += iArr[i32 - 1];
                            }
                            iArr[i32] = i44;
                            i33 += i44;
                            i32++;
                            i34 = i36;
                            i26 = i37;
                            i24 = i16;
                            i27 = i18;
                            i25 = i17;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 4;
                    while (true) {
                        i19 = this.zzaa - 1;
                        if (i45 >= i19) {
                            break;
                        }
                        this.zzab[i45] = 0;
                        while (true) {
                            i20 = i47 + 1;
                            zzu(zzagiVar, i20);
                            int i48 = zzeuVar3.zzi()[i47] & 255;
                            int[] iArr2 = this.zzab;
                            i21 = iArr2[i45] + i48;
                            iArr2[i45] = i21;
                            if (i48 != 255) {
                                break;
                            } else {
                                i47 = i20;
                            }
                        }
                        i46 += i21;
                        i45++;
                        i47 = i20;
                    }
                    this.zzab[i19] = ((i11 - this.zzad) - i47) - i46;
                }
            }
            i13 = 2;
            i14 = 1;
            i15 = 0;
            this.zzX = this.zzU + zzA((zzeuVar3.zzi()[i15] << 8) | (zzeuVar3.zzi()[i14] & 255));
            if (zzaksVar3.zzf == i14) {
                i22 = 1;
                this.zzae = i22;
                this.zzW = i13;
                this.zzZ = i15;
                i12 = Opcodes.IF_ICMPGT;
            } else {
                if (i23 != 163) {
                    i22 = i15;
                } else if ((zzeuVar3.zzi()[i13] & 128) == 128) {
                    i23 = Opcodes.IF_ICMPGT;
                    i22 = 1;
                } else {
                    i22 = i15;
                    i23 = Opcodes.IF_ICMPGT;
                }
                this.zzae = i22;
                this.zzW = i13;
                this.zzZ = i15;
                i12 = Opcodes.IF_ICMPGT;
            }
        } else {
            i12 = 163;
        }
        if (i23 == i12) {
            while (true) {
                int i49 = this.zzZ;
                if (i49 >= this.zzaa) {
                    this.zzW = 0;
                    return;
                }
                int iZzv = zzv(zzagiVar, zzaksVar3, this.zzab[i49], false);
                zzaks zzaksVar4 = zzaksVar3;
                zzt(zzaksVar4, this.zzX + ((long) ((this.zzZ * zzaksVar3.zzg) / 1000)), this.zzae, iZzv, 0);
                this.zzZ++;
                zzaksVar3 = zzaksVar4;
            }
        } else {
            while (true) {
                int i50 = this.zzZ;
                if (i50 >= this.zzaa) {
                    return;
                }
                int[] iArr3 = this.zzab;
                iArr3[i50] = zzv(zzagiVar, zzaksVar3, iArr3[i50], true);
                this.zzZ++;
            }
        }
    }

    public zzakt(zzakl zzaklVar, int i10, zzanx zzanxVar) {
        this.zzz = -1L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        this.zzQ = -1;
        this.zzS = -1L;
        this.zzT = -1L;
        this.zzU = -9223372036854775807L;
        this.zzas = zzaklVar;
        zzaklVar.zza(new zzako(this, null));
        this.zzm = zzanxVar;
        this.zzK = new SparseArray();
        this.zzk = 1 == ((i10 & 1) ^ 1);
        this.zzl = (i10 & 2) == 0;
        this.zzh = new zzakv();
        this.zzj = new LongSparseArray();
        this.zzi = new SparseArray();
        this.zzp = new zzeu(4);
        this.zzq = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzr = new zzeu(4);
        this.zzn = new zzeu(zzgr.zza);
        this.zzo = new zzeu(4);
        this.zzs = new zzeu();
        this.zzt = new zzeu();
        this.zzu = new zzeu(8);
        this.zzv = new zzeu();
        this.zzw = new zzeu();
        this.zzab = new int[1];
        this.zzE = true;
    }

    public zzakt(zzanx zzanxVar, int i10) {
        this(new zzakl(), 0, zzanxVar);
    }
}
