package com.prism.gaia.client.stub;

import U6.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.content.BroadcastReceiverCompat2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164504a = "asdf-".concat(t.class.getSimpleName());

    public final boolean a(Intent intent) {
        int intExtra = intent.getIntExtra(b.c.f68618g, -1);
        return intExtra == -1 || intExtra == GaiaContext.j().Z();
    }

    public abstract void b(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        BroadcastReceiverCompat2.Util.setPendingResult(this, goAsync());
        b(context, intent);
    }
}
