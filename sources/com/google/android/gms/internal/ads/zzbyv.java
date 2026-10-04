package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbyv extends zzbyy {
    private final Map zza;
    private final Context zzb;

    public zzbyv(zzclm zzclmVar, Map map) {
        super(zzclmVar, "storePicture");
        this.zza = map;
        this.zzb = zzclmVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbin(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        builderZzN.setTitle(resourcesZzg != null ? resourcesZzg.getString(R.string.f150754s1) : "Save image");
        builderZzN.setMessage(resourcesZzg != null ? resourcesZzg.getString(R.string.f150755s2) : "Allow Ad to store image in Picture gallery?");
        builderZzN.setPositiveButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f150756s3) : "Accept", new zzbyt(this, str, lastPathSegment));
        builderZzN.setNegativeButton(resourcesZzg != null ? resourcesZzg.getString(R.string.f150757s4) : "Decline", new zzbyu(this));
        builderZzN.create().show();
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
