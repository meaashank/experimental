package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.play.core.hsdp.R;
import e.f0;
import q8.C5443b;

/* JADX INFO: loaded from: classes4.dex */
final class zzax {

    @Nullable
    @f0
    View zza = null;
    private final Activity zzb;
    private final WindowManager zzc;

    public zzax(Activity activity) {
        this.zzb = activity;
        this.zzc = (WindowManager) activity.getSystemService(C5443b.f226850e);
    }

    public static /* synthetic */ void zza(zzax zzaxVar, View view) {
        Log.i("HsdpLoadingPanel", "hideLoading");
        try {
            if (view.getParent() != null) {
                zzaxVar.zzc.removeView(view);
            }
        } catch (RuntimeException e10) {
            Log.e("HsdpLoadingPanel", "Error removing view from WindowManager", e10);
        }
        zzaxVar.zza = null;
    }

    private final boolean zze() {
        return (this.zzb.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final void zzb() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        final View view = this.zza;
        if (view == null) {
            return;
        }
        this.zzb.runOnUiThread(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzau
            @Override // java.lang.Runnable
            public final void run() {
                zzax.zza(this.zza, view);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.zzax.zzc():void");
    }

    public final void zzd() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 && this.zzb.isInPictureInPictureMode()) {
            zzb();
            return;
        }
        try {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            if (layoutParams != null) {
                Activity activity = this.zzb;
                layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (zza.zzb(activity) * 0.6f));
                if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                    layoutParams.width = zza.zza(activity, 640);
                } else {
                    layoutParams.width = -1;
                }
                this.zzc.updateViewLayout(view, layoutParams);
                Log.i("HsdpLoadingPanel", "updateLoadingView: updated window size.");
            }
        } catch (RuntimeException e10) {
            Log.e("HsdpLoadingPanel", "updateLoadingView: error updating window size.", e10);
        }
    }
}
