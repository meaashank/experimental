package com.prism.gaia.client.stub;

import U6.b;
import U6.o;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class HostSupervisorChooserActivity extends ResolverActivity {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f164351t = "asdf-".concat("HostSupervisorChooserActivity");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f164352u = Intent.createChooser(new Intent(), "").getAction();

    public static boolean o(Intent intent) {
        try {
            if (TextUtils.equals(f164352u, intent.getAction())) {
                return true;
            }
            return TextUtils.equals("android.intent.action.CHOOSER", intent.getAction());
        } catch (Exception unused) {
            return false;
        }
    }

    public static void p(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle, Integer num) {
        Bundle bundle2 = new Bundle();
        bundle2.putBinder(b.c.f68629r, iBinder);
        bundle2.putString(b.c.f68630s, str);
        bundle2.putInt(b.c.f68631t, i10);
        bundle2.putBundle(b.c.f68632u, bundle);
        if (num != null) {
            bundle2.putInt(b.c.f68633v, num.intValue());
        }
        intent.setComponent(new ComponentName("com.app.hider.master.promax", HostSupervisorChooserActivity.class.getCanonicalName()));
        intent.putExtras(bundle2);
    }

    @Override // com.prism.gaia.client.stub.ResolverActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        Intent[] intentArr;
        Intent intent = getIntent();
        this.f164382a = intent.getExtras().getBinder(b.c.f68629r);
        this.f164383b = intent.getStringExtra(b.c.f68630s);
        this.f164384c = intent.getIntExtra(b.c.f68631t, -1);
        this.f164385d = intent.getBundleExtra(b.c.f68632u);
        int intExtra = intent.getIntExtra(b.c.f68611M, 0);
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        if (!(parcelableExtra instanceof Intent)) {
            Objects.toString(parcelableExtra);
            finish();
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TITLE");
        if (charSequenceExtra == null) {
            charSequenceExtra = getString(o.n.f72114Q);
        }
        CharSequence charSequence = charSequenceExtra;
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
        if (parcelableArrayExtra != null) {
            intentArr = new Intent[parcelableArrayExtra.length];
            for (int i10 = 0; i10 < parcelableArrayExtra.length; i10++) {
                Parcelable parcelable = parcelableArrayExtra[i10];
                if (!(parcelable instanceof Intent)) {
                    Parcelable parcelable2 = parcelableArrayExtra[i10];
                    finish();
                    return;
                }
                intentArr[i10] = (Intent) parcelable;
            }
        } else {
            intentArr = null;
        }
        super.k(bundle, intent2, charSequence, intentArr, null, false, intExtra);
    }
}
