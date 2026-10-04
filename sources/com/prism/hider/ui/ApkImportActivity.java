package com.prism.hider.ui;

import Z9.k;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes6.dex */
public class ApkImportActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167909a = "ApkImportActivity";

    public static Uri b(Intent intent) {
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
            if (parcelableExtra instanceof Uri) {
                return (Uri) parcelableExtra;
            }
        } catch (Throwable th) {
            Log.w(f167909a, "cannot read shared stream: " + th.getMessage());
        }
        return null;
    }

    public final /* synthetic */ void c(Intent intent, boolean z10) {
        if (z10) {
            intent.addFlags(335544320);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), R.string.hider_apk_import_failed, 1).show();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri uriB = b(getIntent());
        if (uriB == null) {
            Log.w(f167909a, "no file in " + getIntent());
            finish();
            return;
        }
        final Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            Z9.k.v(this, uriB, new k.a() { // from class: com.prism.hider.ui.m
                @Override // Z9.k.a
                public final void a(boolean z10) {
                    this.f168269a.c(launchIntentForPackage, z10);
                }
            });
            return;
        }
        Log.w(f167909a, "no launch intent for " + getPackageName());
        finish();
    }
}
