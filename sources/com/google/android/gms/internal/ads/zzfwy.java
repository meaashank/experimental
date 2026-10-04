package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfwy implements zzfww {
    private final zzfww zza;

    public zzfwy(zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfxg.zzb(0, 0, 0, 0);
        int iZzb = zzfxj.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i10 == 0);
            return jSONObjectZzb;
        } catch (JSONException e10) {
            zzfxh.zza("Error with setting output device status", e10);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zzb(View view, JSONObject jSONObject, zzfwv zzfwvVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfwk zzfwkVarZza = zzfwk.zza();
        if (zzfwkVarZza != null) {
            Collection collectionZzf = zzfwkVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfvq) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfwvVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
