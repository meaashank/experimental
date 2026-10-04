package com.google.android.gms.internal.ads;

import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdh implements zzgbx {

    @NotNull
    private final kotlinx.coroutines.L zza;

    @NotNull
    private final zzgtm zzb;

    @NotNull
    private final kotlinx.coroutines.sync.a zzc;

    @NotNull
    private final kotlinx.coroutines.sync.a zzd;

    @NotNull
    private final kotlinx.coroutines.sync.a zze;
    private boolean zzf;
    private zzgbv zzg;
    private boolean zzh;

    @NotNull
    private final androidx.datastore.core.d zzi;

    @NotNull
    private final zzdxu zzj;

    public zzgdh(@NotNull androidx.datastore.core.d adQualityDataStore, @NotNull zzgcj coroutineScopeProvider, @NotNull zzdxu dataPinger, @NotNull zzgcg clock) {
        kotlin.jvm.internal.G.p(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.G.p(coroutineScopeProvider, "coroutineScopeProvider");
        kotlin.jvm.internal.G.p(dataPinger, "dataPinger");
        kotlin.jvm.internal.G.p(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgtm();
        this.zzc = MutexKt.b(false, 1, null);
        this.zzd = MutexKt.b(false, 1, null);
        this.zze = MutexKt.b(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzA(kotlin.coroutines.e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgcp
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgcp r0 = (com.google.android.gms.internal.ads.zzgcp) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcp r0 = new com.google.android.gms.internal.ads.zzgcp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            kotlin.C4885d0.n(r8)     // Catch: java.lang.Throwable -> L2f
            goto L65
        L2f:
            r8 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            kotlin.C4885d0.n(r8)
            r8 = r2
            goto L51
        L42:
            kotlin.C4885d0.n(r8)
            kotlinx.coroutines.sync.a r8 = r7.zze
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.h(r5, r0)
            if (r2 == r1) goto L75
        L51:
            androidx.datastore.core.d r2 = r7.zzi     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.zzgcq r4 = new com.google.android.gms.internal.ads.zzgcq     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6d
            r0.zza = r8     // Catch: java.lang.Throwable -> L6d
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == r1) goto L75
            r6 = r0
            r0 = r8
            r8 = r6
        L65:
            com.google.android.gms.internal.ads.zzgca r8 = (com.google.android.gms.internal.ads.zzgca) r8     // Catch: java.lang.Throwable -> L2f
            r0.i(r5)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L6d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            r0.i(r5)
            throw r8
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzA(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzB(long r6, kotlin.coroutines.e r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgco
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgco r0 = (com.google.android.gms.internal.ads.zzgco) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgco r0 = new com.google.android.gms.internal.ads.zzgco
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            kotlin.C4885d0.n(r8)
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C4885d0.n(r8)
            kotlinx.coroutines.sync.a r8 = r5.zzc
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.h(r4, r0)
            if (r0 == r1) goto L79
            r0 = r8
        L48:
            com.google.android.gms.internal.ads.zzgbv r8 = r5.zzg     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "adQualityDataBuilder"
            if (r8 == 0) goto L71
            if (r8 == 0) goto L6d
            long r2 = r8.zzi()     // Catch: java.lang.Throwable -> L67
            long r6 = r6 - r2
            com.google.android.gms.internal.ads.zzgbv r2 = r5.zzg     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L69
            long r1 = r2.zzg()     // Catch: java.lang.Throwable -> L67
            long r6 = r6 - r1
            r8.zzb(r6)     // Catch: java.lang.Throwable -> L67
            r0.i(r4)
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L67:
            r6 = move-exception
            goto L75
        L69:
            kotlin.jvm.internal.G.S(r1)     // Catch: java.lang.Throwable -> L67
            throw r4     // Catch: java.lang.Throwable -> L67
        L6d:
            kotlin.jvm.internal.G.S(r1)     // Catch: java.lang.Throwable -> L67
            throw r4     // Catch: java.lang.Throwable -> L67
        L71:
            kotlin.jvm.internal.G.S(r1)     // Catch: java.lang.Throwable -> L67
            throw r4     // Catch: java.lang.Throwable -> L67
        L75:
            r0.i(r4)
            throw r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzB(long, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzC(kotlin.coroutines.e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgct
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgct r0 = (com.google.android.gms.internal.ads.zzgct) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgct r0 = new com.google.android.gms.internal.ads.zzgct
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            kotlin.C4885d0.n(r8)     // Catch: java.lang.Throwable -> L32
            goto L92
        L32:
            r8 = move-exception
            goto L9c
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            java.lang.Object r2 = r0.zzb
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            java.lang.Object r4 = r0.zza
            com.google.android.gms.internal.ads.zzgbw r4 = (com.google.android.gms.internal.ads.zzgbw) r4
            kotlin.C4885d0.n(r8)
            goto L7e
        L48:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            kotlin.C4885d0.n(r8)
            goto L5f
        L50:
            kotlin.C4885d0.n(r8)
            kotlinx.coroutines.sync.a r2 = r7.zzc
            r0.zza = r2
            r0.zze = r5
            java.lang.Object r8 = r2.h(r6, r0)
            if (r8 == r1) goto Lac
        L5f:
            com.google.android.gms.internal.ads.zzgbv r8 = r7.zzg     // Catch: java.lang.Throwable -> La0
            if (r8 == 0) goto La2
            com.google.android.gms.internal.ads.zzifm r8 = r8.zzbu()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.internal.ads.zzgbw r8 = (com.google.android.gms.internal.ads.zzgbw) r8     // Catch: java.lang.Throwable -> La0
            r2.i(r6)
            kotlin.jvm.internal.G.m(r8)
            kotlinx.coroutines.sync.a r2 = r7.zze
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r4
            java.lang.Object r4 = r2.h(r6, r0)
            if (r4 == r1) goto Lac
            r4 = r8
        L7e:
            androidx.datastore.core.d r8 = r7.zzi     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzgcu r5 = new com.google.android.gms.internal.ads.zzgcu     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L9a
            r0.zza = r2     // Catch: java.lang.Throwable -> L9a
            r0.zzb = r6     // Catch: java.lang.Throwable -> L9a
            r0.zze = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r8 = r8.a(r5, r0)     // Catch: java.lang.Throwable -> L9a
            if (r8 == r1) goto Lac
            r0 = r2
        L92:
            com.google.android.gms.internal.ads.zzgca r8 = (com.google.android.gms.internal.ads.zzgca) r8     // Catch: java.lang.Throwable -> L32
            r0.i(r6)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L9a:
            r8 = move-exception
            r0 = r2
        L9c:
            r0.i(r6)
            throw r8
        La0:
            r8 = move-exception
            goto La8
        La2:
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.G.S(r8)     // Catch: java.lang.Throwable -> La0
            throw r6     // Catch: java.lang.Throwable -> La0
        La8:
            r2.i(r6)
            throw r8
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzC(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean zzD(com.google.android.gms.internal.ads.zzgbw r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = kotlin.collections.U.A3(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzD(com.google.android.gms.internal.ads.zzgbw):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgdh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzs(kotlin.coroutines.e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzs(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzt(java.lang.String r8, kotlin.coroutines.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzgcw
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzgcw r0 = (com.google.android.gms.internal.ads.zzgcw) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcw r0 = new com.google.android.gms.internal.ads.zzgcw
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.zzb
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
            java.lang.String r0 = r0.zzf
            kotlin.C4885d0.n(r9)
            goto L52
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.C4885d0.n(r9)
            kotlinx.coroutines.sync.a r9 = r7.zzc
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzf = r8
            r0.zza = r9
            r0.zzb = r5
            r0.zze = r3
            java.lang.Object r0 = r9.h(r4, r0)
            if (r0 == r1) goto L81
            r0 = r8
            r8 = r9
            r1 = r5
        L52:
            boolean r9 = r7.zzf     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L5e
            kotlin.L0 r9 = kotlin.L0.f217464a     // Catch: java.lang.Throwable -> L5c
            r8.i(r4)
            return r9
        L5c:
            r9 = move-exception
            goto L7d
        L5e:
            r7.zzf = r3     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.zzgbw r9 = com.google.android.gms.internal.ads.zzgbw.zzp()     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.zzifg r9 = r9.zzcc()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "toBuilder(...)"
            kotlin.jvm.internal.G.o(r9, r3)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.zzgbv r9 = (com.google.android.gms.internal.ads.zzgbv) r9     // Catch: java.lang.Throwable -> L5c
            r7.zzg = r9     // Catch: java.lang.Throwable -> L5c
            r9.zza(r0)     // Catch: java.lang.Throwable -> L5c
            r9.zzj(r1)     // Catch: java.lang.Throwable -> L5c
            r8.i(r4)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L7d:
            r8.i(r4)
            throw r9
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzt(java.lang.String, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (zzC(r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:33:0x0083, B:35:0x0087, B:45:0x00a5, B:46:0x00aa), top: B:52:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #0 {all -> 0x00a3, blocks: (B:33:0x0083, B:35:0x0087, B:45:0x00a5, B:46:0x00aa), top: B:52:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzu(kotlin.coroutines.e r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgcs
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgcs r0 = (com.google.android.gms.internal.ads.zzgcs) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcs r0 = new com.google.android.gms.internal.ads.zzgcs
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L50
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.C4885d0.n(r11)
            goto La0
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            kotlin.C4885d0.n(r11)
            goto L98
        L3e:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            kotlin.C4885d0.n(r11)
            goto L83
        L48:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            kotlin.C4885d0.n(r11)
            goto L5f
        L50:
            kotlin.C4885d0.n(r11)
            kotlinx.coroutines.sync.a r2 = r10.zzd
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.h(r7, r0)
            if (r11 == r1) goto Lb3
        L5f:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L6b
            kotlin.L0 r11 = kotlin.L0.f217464a     // Catch: java.lang.Throwable -> L69
            r2.i(r7)
            return r11
        L69:
            r11 = move-exception
            goto Laf
        L6b:
            r10.zzh = r6     // Catch: java.lang.Throwable -> L69
            r2.i(r7)
            kotlinx.coroutines.sync.a r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.h(r7, r0)
            if (r11 == r1) goto Lb3
            r5 = r8
        L83:
            com.google.android.gms.internal.ads.zzgbv r11 = r10.zzg     // Catch: java.lang.Throwable -> La3
            if (r11 == 0) goto La5
            r11.zzo(r5)     // Catch: java.lang.Throwable -> La3
            r2.i(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzB(r5, r0)
            if (r11 != r1) goto L98
            goto Lb3
        L98:
            r0.zze = r3
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Lb3
        La0:
            kotlin.L0 r11 = kotlin.L0.f217464a
            return r11
        La3:
            r11 = move-exception
            goto Lab
        La5:
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.G.S(r11)     // Catch: java.lang.Throwable -> La3
            throw r7     // Catch: java.lang.Throwable -> La3
        Lab:
            r2.i(r7)
            throw r11
        Laf:
            r2.i(r7)
            throw r11
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzu(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00bb, blocks: (B:30:0x0077, B:33:0x007d, B:36:0x0085, B:38:0x0089, B:40:0x00a5, B:42:0x00ae, B:44:0x00b2, B:47:0x00bd, B:48:0x00c0, B:49:0x00c1, B:50:0x00c4, B:51:0x00c5, B:52:0x00c8, B:53:0x00c9, B:55:0x00cd, B:57:0x00d3, B:59:0x00d7, B:61:0x00f3, B:62:0x00fc, B:63:0x00ff, B:64:0x0100, B:65:0x0103, B:66:0x0104, B:68:0x0108, B:71:0x0111, B:72:0x0114, B:73:0x0115, B:74:0x0118, B:75:0x0119, B:76:0x011c), top: B:83:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119 A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:30:0x0077, B:33:0x007d, B:36:0x0085, B:38:0x0089, B:40:0x00a5, B:42:0x00ae, B:44:0x00b2, B:47:0x00bd, B:48:0x00c0, B:49:0x00c1, B:50:0x00c4, B:51:0x00c5, B:52:0x00c8, B:53:0x00c9, B:55:0x00cd, B:57:0x00d3, B:59:0x00d7, B:61:0x00f3, B:62:0x00fc, B:63:0x00ff, B:64:0x0100, B:65:0x0103, B:66:0x0104, B:68:0x0108, B:71:0x0111, B:72:0x0114, B:73:0x0115, B:74:0x0118, B:75:0x0119, B:76:0x011c), top: B:83:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(kotlin.coroutines.e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzv(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (zzz(r14, r0) == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:34:0x008a, B:38:0x0092, B:40:0x009c, B:42:0x00a8, B:44:0x00af, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee, B:61:0x00ef, B:62:0x00f2, B:63:0x00f3, B:64:0x00f6, B:65:0x00f7, B:66:0x00fa), top: B:72:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzw(kotlin.coroutines.e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzw(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (zzz(r15, r0) == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101 A[Catch: all -> 0x00eb, TryCatch #0 {all -> 0x00eb, blocks: (B:33:0x0089, B:37:0x0091, B:39:0x009b, B:41:0x00a7, B:43:0x00ae, B:45:0x00b5, B:58:0x00ed, B:59:0x00f0, B:60:0x00f1, B:61:0x00f4, B:62:0x00f5, B:63:0x00f8, B:64:0x00f9, B:65:0x00fc, B:66:0x00fd, B:67:0x0100, B:68:0x0101, B:69:0x0104), top: B:75:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzx(kotlin.coroutines.e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzx(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzy(kotlin.coroutines.e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgcy
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgcy r0 = (com.google.android.gms.internal.ads.zzgcy) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcy r0 = new com.google.android.gms.internal.ads.zzgcy
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            kotlin.C4885d0.n(r8)
            goto L4d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.C4885d0.n(r8)
            kotlinx.coroutines.sync.a r8 = r7.zzc
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzb = r8
            r0.zza = r5
            r0.zze = r3
            java.lang.Object r0 = r8.h(r4, r0)
            if (r0 == r1) goto L66
            r0 = r8
            r1 = r5
        L4d:
            com.google.android.gms.internal.ads.zzgbv r8 = r7.zzg     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5c
            r8.zzs(r1)     // Catch: java.lang.Throwable -> L5a
            r0.i(r4)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L5a:
            r8 = move-exception
            goto L62
        L5c:
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.G.S(r8)     // Catch: java.lang.Throwable -> L5a
            throw r4     // Catch: java.lang.Throwable -> L5a
        L62:
            r0.i(r4)
            throw r8
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzy(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzz(java.lang.String r8, kotlin.coroutines.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzgcm
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzgcm r0 = (com.google.android.gms.internal.ads.zzgcm) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcm r0 = new com.google.android.gms.internal.ads.zzgcm
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
            kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r9 = move-exception
            goto L7a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.zzb
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C4885d0.n(r9)
            r9 = r8
            r8 = r2
            goto L58
        L47:
            kotlin.C4885d0.n(r9)
            kotlinx.coroutines.sync.a r9 = r7.zze
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.h(r5, r0)
            if (r2 == r1) goto L7e
        L58:
            androidx.datastore.core.d r2 = r7.zzi     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzgcn r4 = new com.google.android.gms.internal.ads.zzgcn     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L76
            r0.zza = r9     // Catch: java.lang.Throwable -> L76
            r0.zzb = r5     // Catch: java.lang.Throwable -> L76
            r0.zze = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L76
            if (r8 == r1) goto L7e
            r6 = r9
            r9 = r8
            r8 = r6
        L6e:
            com.google.android.gms.internal.ads.zzgca r9 = (com.google.android.gms.internal.ads.zzgca) r9     // Catch: java.lang.Throwable -> L2f
            r8.i(r5)
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L76:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7a:
            r8.i(r5)
            throw r9
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdh.zzz(java.lang.String, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zza() {
        C5092j.f(this.zza, null, null, new zzgdb(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzb(@NotNull String gwsQueryId) {
        kotlin.jvm.internal.G.p(gwsQueryId, "gwsQueryId");
        zzgtp.zza(this.zza, this.zzb, new zzgcv(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzc() {
        zzgtp.zza(this.zza, this.zzb, new zzgcr(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzd() {
        zzgtp.zza(this.zza, this.zzb, new zzgdf(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zze() {
        zzgtp.zza(this.zza, this.zzb, new zzgcz(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzf() {
        zzgtp.zza(this.zza, this.zzb, new zzgdd(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzg() {
        zzgtp.zza(this.zza, this.zzb, new zzgcx(this, null));
    }
}
