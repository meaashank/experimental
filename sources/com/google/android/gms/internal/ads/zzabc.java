package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabc extends zzabi implements zznf {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgzg zzc = zzgzg.zzc(zzaal.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @InterfaceC4326A("lock")
    private zzaaq zze;

    @Nullable
    @InterfaceC4326A("lock")
    private Thread zzf;

    @Nullable
    private zzacr zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzx zzj;

    public zzabc(Context context) {
        zzzx zzzxVar = new zzzx();
        zzaaq zzaaqVar = zzaaq.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzzxVar;
        if (androidx.activity.D.a(zzaaqVar)) {
            this.zze = zzaaqVar;
        } else {
            zzaap zzaapVar = new zzaap(zzaaqVar, bArr);
            zzaapVar.zzx((zzbl) zzaaqVar);
            this.zze = new zzaaq(zzaapVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    private static Pair zzA(zzabd[] zzabdVarArr, int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzabd zzabdVar = zzabdVarArr[i11];
            if (zzabdVar != null && zzabdVar.zza.zzc == i10) {
                return Pair.create(zzabdVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    @Nullable
    private static final Pair zzB(int i10, zzabh zzabhVar, int[][][] iArr, zzaat zzaatVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzabh zzabhVar2 = zzabhVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzabhVar2.zza(i11)) {
                zzzr zzzrVarZzb = zzabhVar2.zzb(i11);
                for (int i12 = 0; i12 < zzzrVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzzrVarZzb.zza(i12);
                    List listZza = zzaatVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzaau zzaauVar = (zzaau) listZza.get(i14);
                        int iZza = zzaauVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgxm.zzj(zzaauVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaauVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzaau zzaauVar2 = (zzaau) listZza.get(i16);
                                    if (zzaauVar2.zza() == 2 && zzaauVar.zzc(zzaauVar2)) {
                                        arrayList2.add(zzaauVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            zzabhVar2 = zzabhVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzaau) list.get(i17)).zzc;
        }
        zzaau zzaauVar3 = (zzaau) list.get(0);
        return Pair.create(new zzabd(zzaauVar3.zzb, iArr2, 0), Integer.valueOf(zzaauVar3.zza));
    }

    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfm.zza;
        return strZzi2.split(com.prism.gaia.download.a.f164606q, 2)[0].equals(strZzi.split(com.prism.gaia.download.a.f164606q, 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzgxm r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabc.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzgxm):int");
    }

    @Nullable
    public static final zzabd zzp(int i10, zzzr zzzrVar, int[][] iArr, zzaaq zzaaqVar) throws zzjn {
        int i11 = zzaaqVar.zzw.zzb;
        int i12 = 0;
        zzbg zzbgVar = null;
        zzaao zzaaoVar = null;
        for (int i13 = 0; i13 < zzzrVar.zzb; i13++) {
            zzbg zzbgVarZza = zzzrVar.zza(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < zzbgVarZza.zza; i14++) {
                if (C3355u1.c(iArr2[i14], zzaaqVar.zzV)) {
                    zzaao zzaaoVar2 = new zzaao(zzbgVarZza.zza(i14), iArr2[i14]);
                    if (zzaaoVar == null || zzaaoVar2.compareTo(zzaaoVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i12 = i14;
                        zzaaoVar = zzaaoVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzabd(zzbgVar, new int[]{i12}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z10;
        zzacr zzacrVar;
        synchronized (this.zzd) {
            try {
                z10 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null && zzacrVar.zzb()) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            zzt();
        }
    }

    private static void zzw(zzabh zzabhVar, zzbl zzblVar, zzabd[] zzabdVarArr) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzx(zzabhVar.zzb(i10), zzblVar, map);
        }
        zzx(zzabhVar.zze(), zzblVar, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzbh) map.get(Integer.valueOf(zzabhVar.zza(i11)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzr zzzrVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzzrVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzzrVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzzr zzzrVarZzb = zzabhVar.zzb(i10);
            if (zzaaqVar.zzb(i10, zzzrVarZzb)) {
                if (zzaaqVar.zzc(i10, zzzrVarZzb) != null) {
                    throw null;
                }
                zzabdVarArr[i10] = null;
            }
        }
    }

    private static void zzz(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            int iZza = zzabhVar.zza(i10);
            if (zzaaqVar.zza(i10) || zzaaqVar.zzI.contains(Integer.valueOf(iZza))) {
                zzabdVarArr[i10] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final void zza(zzne zzneVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzb() {
        zzacr zzacrVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzguk.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null) {
            zzacrVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaaq zzc() {
        zzaaq zzaaqVar;
        synchronized (this.zzd) {
            zzaaqVar = this.zze;
        }
        return zzaaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaap zzaapVar) {
        boolean zEquals;
        zzaaq zzaaqVar = new zzaaq(zzaapVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzaaqVar);
            this.zze = zzaaqVar;
        }
        if (zEquals) {
            return;
        }
        if (zzaaqVar.zzU && this.zza == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    @Nullable
    public final zznf zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final Pair zzh(zzabh zzabhVar, int[][][] iArr, final int[] iArr2, zzxo zzxoVar, zzbf zzbfVar) throws zzjn {
        final zzaaq zzaaqVar;
        final String str;
        zzzx zzzxVar;
        int[] iArr3;
        int length;
        zzabe zzabeVarZza;
        int i10;
        int i11;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z10;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaaqVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfm.zzR(context3));
        }
        if (zzaaqVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzacr(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaam
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            }, this.zzi);
        }
        zzabd[] zzabdVarArr = new zzabd[2];
        zzw(zzabhVar, zzaaqVar, zzabdVarArr);
        zzy(zzabhVar, zzaaqVar, zzabdVarArr);
        zzz(zzabhVar, zzaaqVar, zzabdVarArr);
        Pair pairZzA = zzA(zzabdVarArr, 1);
        int i12 = 0;
        if (pairZzA == null) {
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    z10 = false;
                    break;
                }
                if (zzabhVar.zza(i13) == 2 && zzabhVar.zzb(i13).zzb > 0) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            pairZzA = zzB(1, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaah
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i14, zzbg zzbgVar, int[] iArr4) {
                    final zzabc zzabcVar = this.zza;
                    final zzaaq zzaaqVar2 = zzaaqVar;
                    zzgul zzgulVar = new zzgul() { // from class: com.google.android.gms.internal.ads.zzaak
                        @Override // com.google.android.gms.internal.ads.zzgul
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzabcVar.zzl(zzaaqVar2, (zzv) obj);
                        }
                    };
                    int i15 = iArr2[i14];
                    int i16 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    for (int i17 = 0; i17 < zzbgVar.zza; i17++) {
                        zzgxjVar.zzf(new zzaab(i14, zzbgVar, i17, zzaaqVar2, iArr4[i17], z10, zzgulVar, i15));
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaac.zza);
            if (pairZzA != null) {
                zzabdVarArr[((Integer) pairZzA.second).intValue()] = (zzabd) pairZzA.first;
            }
        }
        if (pairZzA == null) {
            str = null;
        } else {
            Object obj = pairZzA.first;
            str = ((zzabd) obj).zza.zza(((zzabd) obj).zzb[0]).zzd;
        }
        Pair pairZzA2 = zzA(zzabdVarArr, 2);
        Pair pairZzA3 = zzA(zzabdVarArr, 4);
        if (pairZzA2 == null && pairZzA3 == null) {
            int i14 = zzaaqVar.zzw.zzb;
            final Point pointZzT = (!zzaaqVar.zzk || (context2 = this.zza) == null) ? null : zzfm.zzT(context2);
            Pair pairZzB = zzB(2, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaag
                /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
                @Override // com.google.android.gms.internal.ads.zzaat
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final /* synthetic */ java.util.List zza(int r18, com.google.android.gms.internal.ads.zzbg r19, int[] r20) {
                    /*
                        Method dump skipped, instruction units count: 207
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaag.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
                }
            }, zzaaf.zza);
            Pair pairZzB2 = pairZzB == null ? zzB(4, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i15, zzbg zzbgVar, int[] iArr4) {
                    int i16 = zzabc.zzb;
                    int i17 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    for (int i18 = 0; i18 < zzbgVar.zza; i18++) {
                        zzgxjVar.zzf(new zzaan(i15, zzbgVar, i18, zzaaqVar, iArr4[i18]));
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaad.zza) : null;
            if (pairZzB2 != null) {
                zzabdVarArr[((Integer) pairZzB2.second).intValue()] = (zzabd) pairZzB2.first;
            } else if (pairZzB != null) {
                zzabdVarArr[((Integer) pairZzB.second).intValue()] = (zzabd) pairZzB.first;
            }
        }
        if (zzA(zzabdVarArr, 3) == null) {
            int i15 = zzaaqVar.zzw.zzb;
            if (!zzaaqVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = zzfm.zza;
                languageTag = locale.toLanguageTag();
            }
            Pair pairZzB3 = zzB(3, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaai
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i16, zzbg zzbgVar, int[] iArr4) {
                    int i17 = zzabc.zzb;
                    int i18 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    for (int i19 = 0; i19 < zzbgVar.zza; i19++) {
                        zzgxjVar.zzf(new zzaas(i16, zzbgVar, i19, zzaaqVar, iArr4[i19], str, languageTag));
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaae.zza);
            if (pairZzB3 != null) {
                zzabdVarArr[((Integer) pairZzB3.second).intValue()] = (zzabd) pairZzB3.first;
            }
        }
        int i16 = zzaaqVar.zzw.zzb;
        zzgxv zzgxvVar = new zzgxv();
        int i17 = 0;
        while (i17 < 2) {
            zzabd zzabdVar = zzabdVarArr[i17];
            if (zzabdVar == null || zzaaqVar.zza(i17)) {
                i11 = i12;
            } else {
                zzgxw zzgxwVar = zzaaqVar.zzI;
                zzbg zzbgVar = zzabdVar.zza;
                i11 = i12;
                if (!zzgxwVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgxvVar.zzf(zzbgVar.zzb);
                    int i18 = i11;
                    while (true) {
                        int[] iArr4 = zzabdVar.zzb;
                        if (i18 < iArr4.length) {
                            String str3 = zzbgVar.zza(iArr4[i18]).zzn;
                            if (str3 != null) {
                                zzgxvVar.zzf(str3);
                            }
                            i18++;
                        }
                    }
                }
            }
            i17++;
            i12 = i11;
        }
        int i19 = i12;
        zzgxw zzgxwVarZzh = zzgxvVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i20 = i19; i20 < 2; i20++) {
            if (zzabhVar.zza(i20) == 5) {
                zzzr zzzrVarZzb = zzabhVar.zzb(i20);
                for (int i21 = i19; i21 < zzzrVarZzb.zzb; i21++) {
                    zzbg zzbgVarZza = zzzrVarZzb.zza(i21);
                    arrayList.add(zzbgVarZza);
                    int[] iArr5 = (int[]) iArr[i20][i21].clone();
                    for (int i22 = i19; i22 < iArr5.length; i22++) {
                        String str4 = zzbgVarZza.zza(i22).zzn;
                        if (str4 != null && !zzgxwVarZzh.contains(str4)) {
                            iArr5[i22] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i23 = 128;
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfm.zzc(arrayList, zzbgVarArr);
        zzzr zzzrVar = new zzzr(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        zzfm.zzc(arrayList2, iArr6);
        int i24 = i19;
        while (i24 < 2) {
            if (zzabhVar.zza(i24) == 5) {
                zzabd zzabdVarZzp = zzp(5, zzzrVar, iArr6, zzaaqVar);
                zzabdVarArr[i24] = zzabdVarZzp;
                if (zzabdVarZzp == null) {
                    break;
                }
                i10 = i23;
                Arrays.fill(iArr6[zzzrVar.zzb(zzabdVarZzp.zza)], i10);
            } else {
                i10 = i23;
            }
            i24++;
            i23 = i10;
        }
        for (int i25 = i19; i25 < 2; i25++) {
            int iZza = zzabhVar.zza(i25);
            if (iZza != 2 && iZza != 1) {
                if (iZza != 3 && iZza != 4 && iZza != 5 && zzabdVarArr[i25] == null) {
                    zzabdVarArr[i25] = zzp(iZza, zzabhVar.zzb(i25), iArr[i25], zzaaqVar);
                }
            }
        }
        zzw(zzabhVar, zzaaqVar, zzabdVarArr);
        zzy(zzabhVar, zzaaqVar, zzabdVarArr);
        zzz(zzabhVar, zzaaqVar, zzabdVarArr);
        zzzx zzzxVar2 = this.zzj;
        zzabu zzabuVarZzu = zzu();
        zzgxm zzgxmVarZzd = zzzy.zzd(zzabdVarArr);
        zzabe[] zzabeVarArr = new zzabe[2];
        int i26 = i19;
        while (i26 < 2) {
            zzabd zzabdVar2 = zzabdVarArr[i26];
            if (zzabdVar2 == null || (length = (iArr3 = zzabdVar2.zzb).length) == 0) {
                zzzxVar = zzzxVar2;
            } else {
                if (length == 1) {
                    zzabeVarZza = new zzabf(zzabdVar2.zza, iArr3[i19], 0, 0, null);
                    zzzxVar = zzzxVar2;
                } else {
                    zzzxVar = zzzxVar2;
                    zzabeVarZza = zzzxVar.zza(zzabdVar2.zza, iArr3, 0, zzabuVarZzu, (zzgxm) zzgxmVarZzd.get(i26));
                }
                zzabeVarArr[i26] = zzabeVarZza;
            }
            i26++;
            zzzxVar2 = zzzxVar;
        }
        zznh[] zznhVarArr = new zznh[2];
        for (int i27 = i19; i27 < 2; i27++) {
            zznhVarArr[i27] = (zzaaqVar.zza(i27) || zzaaqVar.zzI.contains(Integer.valueOf(zzabhVar.zza(i27))) || (zzabhVar.zza(i27) != -2 && zzabeVarArr[i27] == null)) ? null : zznh.zza;
        }
        return Pair.create(zznhVarArr, zzabeVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzl(zzaaq zzaaqVar, zzv zzvVar) {
        Boolean bool;
        zzacr zzacrVar;
        zzacr zzacrVar2;
        if (!zzaaqVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i10 = zzvVar.zzI;
        byte b10 = -1;
        if (i10 != -1 && i10 > 2) {
            String str = zzvVar.zzp;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b10 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b10 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b10 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b10 = 1;
                        }
                        break;
                }
                if ((b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) && (Build.VERSION.SDK_INT < 32 || (zzacrVar2 = this.zzg) == null || !zzacrVar2.zzb())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null && zzacrVar.zzb() && zzacrVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
        }
        return true;
    }
}
