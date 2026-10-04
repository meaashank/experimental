package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxu implements zzfwv {
    private static final zzfxu zza = new zzfxu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfxq();
    private static final Runnable zzl = new zzfxr();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfxn zzh = new zzfxn();
    private final zzfwx zzg = new zzfwx();
    private final zzfxo zzi = new zzfxo(new zzfxx());

    public static zzfxu zzb() {
        return zza;
    }

    private final void zzk(View view, zzfww zzfwwVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfwwVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final void zza(View view, zzfww zzfwwVar, JSONObject jSONObject, boolean z10) {
        zzfxn zzfxnVar;
        int iZzl;
        boolean z11;
        zzfxu zzfxuVar;
        View view2;
        zzfww zzfwwVar2;
        boolean z12;
        if (zzfxl.zza(view) != null || (iZzl = (zzfxnVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfwwVar.zza(view);
        zzfxg.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfxnVar.zzg(view);
        if (strZzg != null) {
            zzfxg.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e10) {
                zzfxh.zza("Error with setting has window focus", e10);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e11) {
                    zzfxh.zza("Error with setting is picture-in-picture active", e11);
                }
            }
            this.zzh.zzf();
            zzfxuVar = this;
        } else {
            zzfxm zzfxmVarZzi = zzfxnVar.zzi(view);
            if (zzfxmVarZzi != null) {
                zzfwn zzfwnVarZzb = zzfxmVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfxmVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListZzc.get(i10));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfwnVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfwnVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfwnVarZzb.zzd());
                } catch (JSONException e12) {
                    zzfxh.zza("Error with setting friendly obstruction", e12);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                zzfxuVar = this;
                view2 = view;
                zzfwwVar2 = zzfwwVar;
                z12 = true;
            } else {
                view2 = view;
                zzfwwVar2 = zzfwwVar;
                z12 = false;
                zzfxuVar = this;
            }
            zzfxuVar.zzk(view2, zzfwwVar2, jSONObjectZza, iZzl, z12);
        }
        zzfxuVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfxp(this));
    }

    public final void zze() {
        zzl();
    }

    public final /* synthetic */ void zzf() {
        zzfxu zzfxuVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfvq zzfvqVar : zzfwk.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfxn zzfxnVar = this.zzh;
        zzfxnVar.zzd();
        zzfwx zzfwxVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfww zzfwwVarZza = zzfwxVar.zza();
        if (zzfxnVar.zzb().size() > 0) {
            for (String str : zzfxnVar.zzb()) {
                JSONObject jSONObjectZza = zzfwwVarZza.zza(null);
                View viewZzh = zzfxnVar.zzh(str);
                zzfww zzfwwVarZzb = zzfwxVar.zzb();
                String strZzc = zzfxnVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfwwVarZzb.zza(viewZzh);
                    zzfxg.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzfxh.zza("Error with setting not visible reason", e10);
                    }
                    zzfxg.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfxg.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfxn zzfxnVar2 = this.zzh;
        if (zzfxnVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfwwVarZza.zza(null);
            zzfxuVar = this;
            zzfxuVar.zzk(null, zzfwwVarZza, jSONObjectZza3, 1, false);
            zzfxg.zzf(jSONObjectZza3);
            zzfxuVar.zzi.zza(jSONObjectZza3, zzfxnVar2.zza(), jNanoTime);
        } else {
            zzfxuVar = this;
            zzfxuVar.zzi.zzc();
        }
        zzfxnVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfxuVar.zzj;
        List<zzfxt> list = zzfxuVar.zzd;
        if (list.size() > 0) {
            for (zzfxt zzfxtVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfxtVar.zzb();
                if (zzfxtVar instanceof zzfxs) {
                    ((zzfxs) zzfxtVar).zza();
                }
            }
        }
        zzfwu.zza().zzc();
    }

    public final /* synthetic */ zzfxo zzh() {
        return this.zzi;
    }
}
