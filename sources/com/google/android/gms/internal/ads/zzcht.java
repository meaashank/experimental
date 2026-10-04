package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1711w0;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import s0.x;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcht extends FrameLayout implements zzchk {

    @e.f0
    final zzcih zza;
    private final zzcif zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjv zze;
    private final long zzf;

    @Nullable
    private final zzchl zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcht(Context context, zzcif zzcifVar, int i10, boolean z10, zzbjv zzbjvVar, zzcie zzcieVar, @Nullable zzeaj zzeajVar) {
        zzchl zzchjVar;
        zzbjv zzbjvVar2;
        zzchl zzclbVar;
        super(context);
        this.zzb = zzcifVar;
        this.zze = zzbjvVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzt)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcifVar.zzk());
        zzchm zzchmVar = zzcifVar.zzk().zza;
        zzcig zzcigVar = new zzcig(context, zzcifVar.zzs(), zzcifVar.zzm(), zzbjvVar, zzcifVar.zzi());
        if (i10 == 3) {
            zzclbVar = new zzclb(context, zzcigVar);
            zzbjvVar2 = zzbjvVar;
        } else {
            if (i10 == 2) {
                zzchjVar = new zzcix(context, zzcigVar, zzcifVar, z10, zzchm.zza(zzcifVar), zzcieVar, zzeajVar);
                zzbjvVar2 = zzbjvVar;
            } else {
                zzbjvVar2 = zzbjvVar;
                zzchjVar = new zzchj(context, zzcifVar, z10, zzchm.zza(zzcifVar), zzcieVar, new zzcig(context, zzcifVar.zzs(), zzcifVar.zzm(), zzbjvVar, zzcifVar.zzi()), zzeajVar);
            }
            zzclbVar = zzchjVar;
        }
        this.zzg = zzclbVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzclbVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzay)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzav)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaA)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzax)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbjvVar2 != null) {
            zzbjvVar2.zzd("spinner_used", true != zBooleanValue ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        this.zza = new zzcih(this);
        zzclbVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcif zzcifVar = this.zzb;
        if (zzcifVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcifVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzchl zzchlVar = this.zzg;
            if (zzchlVar != null) {
                zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzchlVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzchk
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchp(this, z10));
    }

    public final void zzA(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzB(i10);
    }

    public final void zzB(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzC(i10);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        TextView textView = new TextView(zzchlVar.getContext());
        Resources resourcesZzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        textView.setText(String.valueOf(resourcesZzg == null ? "AdMob - " : resourcesZzg.getString(R.string.watermark_label_prefix)).concat(zzchlVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            zzchlVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        long jZzh = zzchlVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f10 = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(zzchlVar.zzo()), "qoeCachedBytes", String.valueOf(zzchlVar.zzn()), "qoeLoadedBytes", String.valueOf(zzchlVar.zzm()), "droppedFrames", String.valueOf(zzchlVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZzh;
    }

    public final /* synthetic */ void zzG(boolean z10) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzb() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null && this.zzm == 0) {
            zzI("canplaythrough", x.h.f238399b, String.valueOf(zzchlVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzchlVar.zzk()), "videoHeight", String.valueOf(zzchlVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcI)).booleanValue()) {
            this.zza.zzb();
        }
        zzcif zzcifVar = this.zzb;
        if (zzcifVar.zzj() != null && !this.zzi) {
            boolean z10 = (zzcifVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                zzcifVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzd() {
        zzI(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcI)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzf(String str, @Nullable String str2) {
        zzI(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "what", str, androidx.preference.s.f115701h, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzg(String str, @Nullable String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", androidx.preference.s.f115701h, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcho(this));
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzchlVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb2.append("Spinner frame grab took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjv zzbjvVar = this.zze;
            if (zzbjvVar != null) {
                zzbjvVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbix zzbixVar = zzbjg.zzaz;
            int iMax = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    @Nullable
    public final Integer zzl() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            return zzchlVar.zzw();
        }
        return null;
    }

    public final void zzm(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzay)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzn(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i10).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length() + 3 + String.valueOf(i13).length());
            C1711w0.a(sb2, "Set video bounds to x:", i10, ";y:", i11);
            sb2.append(";w:");
            sb2.append(i12);
            sb2.append(";h:");
            sb2.append(i13);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f10, float f11) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            zzchlVar.zzj(f10, f11);
        }
    }

    public final void zzq(Integer num) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzchlVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzf();
    }

    public final void zzs() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zze();
    }

    public final void zzt(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzi(i10);
    }

    public final void zzu() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zza(true);
        zzchlVar.zzq();
    }

    public final void zzv() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zza(false);
        zzchlVar.zzq();
    }

    public final void zzw(float f10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zzb(f10);
        zzchlVar.zzq();
    }

    public final void zzx(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzy(i10);
    }

    public final void zzy(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzz(i10);
    }

    public final void zzz(int i10) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzA(i10);
    }
}
