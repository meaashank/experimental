package com.prism.gaia.client.stub;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.prism.gaia.naked.compat.android.app.ActivityCompat2;
import v8.C5703m;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class GuestPendingActivityProxy extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164343a = "asdf-".concat("GuestPendingActivityProxy");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f164344b = 3600;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164345c = "_Gaia_Fake_ResultData_key_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164346d = "_Gaia_Fake_ResultData_value_";

    public final void a(boolean z10) {
        if (z10) {
            Intent intent = new Intent();
            intent.putExtra(f164345c, f164346d);
            setResult(3600, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        try {
            F9.c cVar = new F9.c(intent);
            C5703m.o().F0(intent, ActivityCompat2.Util.getToken(this), null, -1, null, cVar.f39869d);
        } catch (Throwable th) {
            th.getMessage();
            C5705o.c().e(th, "", "", "PendingActivity", null);
        }
        finish();
    }
}
