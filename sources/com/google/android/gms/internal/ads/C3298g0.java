package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3298g0 {
    public static void a(zzbtf zzbtfVar, String str, JSONObject jSONObject) {
        zzbtfVar.zzc(str, jSONObject.toString());
    }

    public static void b(zzbtf zzbtfVar, String str, String str2) {
        zzbtfVar.zza(C2564b.a(new StringBuilder(com.bytedance.sdk.component.utils.a.a(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    public static void c(zzbtf zzbtfVar, String str, JSONObject jSONObject) {
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbA.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zzbtfVar.zza(sbA.toString());
    }

    public static void d(zzbtf zzbtfVar, String str, Map map) {
        try {
            zzbtfVar.zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
