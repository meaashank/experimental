package b5;

import N4.l;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.ActivityC1486c;

/* JADX INFO: loaded from: classes3.dex */
public class g1 extends ActivityC1486c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120925a = com.prism.commons.utils.l0.b(g1.class.getSimpleName());

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62600L);
        Intent intent = getIntent();
        String str = f120925a;
        Log.d(str, "onCreate intent:" + intent);
        Log.d(str, "onCreate data:" + intent.getData());
        Log.d(str, "onCreate EXTRA_STREAM:" + intent.getParcelableExtra("android.intent.extra.STREAM"));
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                String str3 = f120925a;
                StringBuilder sbA = androidx.activity.result.i.a("extra key:", str2, " value:");
                sbA.append(extras.get(str2));
                Log.d(str3, sbA.toString());
            }
        }
    }
}
