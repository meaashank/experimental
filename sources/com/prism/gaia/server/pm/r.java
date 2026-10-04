package com.prism.gaia.server.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.prism.commons.utils.C3840d;

/* JADX INFO: loaded from: classes6.dex */
public class r extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167628a = "asdf-".concat(r.class.getSimpleName());

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f167630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f167631c;

        public a(String str, String str2, Intent intent) {
            this.f167629a = str;
            this.f167630b = str2;
            this.f167631c = intent;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if ("android.intent.action.PACKAGE_ADDED".equals(this.f167629a)) {
                u.n().B(this.f167630b);
                return;
            }
            if ("android.intent.action.PACKAGE_REPLACED".equals(this.f167629a)) {
                u.n().D(this.f167630b);
            } else {
                if (!"android.intent.action.PACKAGE_REMOVED".equals(this.f167629a) || this.f167631c.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                u.n().C(this.f167630b);
            }
        }
    }

    public static void a(Context context) {
        r rVar = new r();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        C3840d.a(context.getApplicationContext(), rVar, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        new a(intent.getAction(), intent.getData().getSchemeSpecificPart(), intent).start();
    }
}
