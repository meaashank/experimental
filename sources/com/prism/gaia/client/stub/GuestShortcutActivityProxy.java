package com.prism.gaia.client.stub;

import U6.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.net.URISyntaxException;
import v8.C5703m;

/* JADX INFO: loaded from: classes6.dex */
public class GuestShortcutActivityProxy extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent uri;
        Intent uri2;
        super.onCreate(bundle);
        finish();
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(b.c.f68618g, 0);
        String stringExtra = intent.getStringExtra(b.c.f68607I);
        String stringExtra2 = intent.getStringExtra(b.c.f68606H);
        if (stringExtra != null) {
            try {
                uri = Intent.parseUri(stringExtra, 0);
            } catch (URISyntaxException e10) {
                e10.printStackTrace();
                uri = null;
            }
        } else {
            uri = null;
        }
        if (stringExtra2 != null) {
            try {
                uri2 = Intent.parseUri(stringExtra2, 0);
            } catch (URISyntaxException e11) {
                e11.printStackTrace();
                uri2 = null;
            }
        } else {
            uri2 = null;
        }
        if (uri2 == null) {
            return;
        }
        uri2.setSelector(null);
        if (uri != null) {
            uri.putExtra("android.intent.extra.INTENT", uri2);
            uri.putExtra("android.intent.extra.CC", intExtra);
            startActivity(uri);
        } else {
            try {
                C5703m.o().e0(uri2, intExtra);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
