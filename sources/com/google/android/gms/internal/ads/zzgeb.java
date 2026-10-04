package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgeb {
    private final zzggi zza;
    private final zzghf zzb;
    private final zzgqc zzc;
    private final zzgrh zzd;
    private final zzgfo zze;
    private final long zzf;
    private final zzinq zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public zzgeb(zzggi zzggiVar, zzghf zzghfVar, zzgqc zzgqcVar, zzgrh zzgrhVar, zzgfo zzgfoVar, zzinq zzinqVar, zzgei zzgeiVar) {
        this.zza = zzggiVar;
        this.zzb = zzghfVar;
        this.zzc = zzgqcVar;
        this.zzd = zzgrhVar;
        this.zze = zzgfoVar;
        this.zzf = zzgeiVar.zzj();
        this.zzg = zzinqVar;
        this.zzh = zzgeiVar.zzi();
        this.zzj = zzgeiVar.zzs();
        this.zzk = zzgeiVar.zzr();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(final Context context) {
        String string;
        boolean z10 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z10 = true;
            }
        }
        zzgrf zzgrfVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgrfVarZza.zza();
                    string = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgea
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhdp.zza()).get(z10 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z10) {
                        string = ((zzgkh) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        string = Integer.toString(17);
                    }
                } catch (Throwable th) {
                    zzgrfVarZza.zzb(th);
                    throw th;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                zzgrfVarZza.zzb(e10);
                string = "";
            } catch (ExecutionException e11) {
                e = e11;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgrfVarZza.zzb(e);
                string = Integer.toString(3);
            }
            zzgrfVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgrfVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgfo) = (r2 I:com.google.android.gms.internal.ads.zzgeb) (LINE:127) com.google.android.gms.internal.ads.zzgeb.zze com.google.android.gms.internal.ads.zzgfo, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgeb] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgeb zzgebVar;
        ?? r22;
        String string;
        zzgrf zzgrfVarZza = this.zzd.zza(4);
        try {
            try {
                zzgrfVarZza.zza();
                final String str2 = null;
                zzgebVar = this;
                try {
                    string = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgdy
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzhdp.zza()).get(zzgebVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgrfVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgrfVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgebVar.zzd.zzb(57);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgrfVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgrfVarZza.zzc();
                r22.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e12) {
            e = e12;
            zzgebVar = this;
        } catch (ExecutionException e13) {
            e = e13;
            zzgebVar = this;
        } catch (TimeoutException unused2) {
            zzgebVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgrfVarZza.zzc();
        zzgebVar.zze.zzb();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgfo) = (r2 I:com.google.android.gms.internal.ads.zzgeb) (LINE:127) com.google.android.gms.internal.ads.zzgeb.zze com.google.android.gms.internal.ads.zzgfo, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgeb] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgeb zzgebVar;
        ?? r22;
        String string;
        zzgrf zzgrfVarZza = this.zzd.zza(5);
        try {
            try {
                zzgrfVarZza.zza();
                final Activity activity2 = null;
                zzgebVar = this;
                try {
                    string = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgdz
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzhdp.zza()).get(zzgebVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgrfVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgrfVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgebVar.zzd.zzb(58);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgrfVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgrfVarZza.zzc();
                r22.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e12) {
            e = e12;
            zzgebVar = this;
        } catch (ExecutionException e13) {
            e = e13;
            zzgebVar = this;
        } catch (TimeoutException unused2) {
            zzgebVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgrfVarZza.zzc();
        zzgebVar.zze.zzb();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ ListenableFuture zzg(Context context, Void r22) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
