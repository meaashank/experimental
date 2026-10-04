package com.prism.hider.vault.commons;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import com.prism.commons.utils.C3841e;
import com.prism.hider.vault.commons.C4276l;
import t1.C5596a;

/* JADX INFO: loaded from: classes6.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168613a = "VaultUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f168614b = 1.7777778f;

    public class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4278n f168615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f168616b;

        public a(InterfaceC4278n interfaceC4278n, Activity activity) {
            this.f168615a = interfaceC4278n;
            this.f168616b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f168615a.k(this.f168616b);
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4278n f168617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f168618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f168619c;

        public b(InterfaceC4278n interfaceC4278n, Activity activity, d dVar) {
            this.f168617a = interfaceC4278n;
            this.f168618b = activity;
            this.f168619c = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            this.f168617a.a(this.f168618b, true);
            this.f168619c.a();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    public interface d {
        void a();
    }

    public static void a(Activity activity, InterfaceC4278n interfaceC4278n, String str, d dVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setIcon(0);
        builder.setTitle(activity.getString(C4276l.m.f171891T));
        builder.setMessage(activity.getString(C4276l.m.f171894U, str));
        builder.setNegativeButton(C4276l.m.f171888S, new a(interfaceC4278n, activity));
        builder.setNeutralButton(C4276l.m.f171897V, new b(interfaceC4278n, activity, dVar));
        builder.setPositiveButton(C4276l.m.f171885R, new c());
        builder.create().show();
    }

    public static Intent b(@NonNull Context context, @NonNull Class<? extends Activity> cls) {
        return c(context, C4270f.f168647a.b(), cls);
    }

    public static Intent c(@NonNull Context context, String str, @NonNull Class<? extends Activity> cls) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, cls.getCanonicalName()));
        return intent;
    }

    public static boolean d(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("brand:");
            String str = Build.BRAND;
            sb2.append(str);
            Log.d(f168613a, sb2.toString());
            if (str == null || !str.trim().equalsIgnoreCase(C3841e.f162087c)) {
                return false;
            }
            float fD = com.prism.commons.utils.r.d(context);
            Log.d(f168613a, "screen ratio:" + fD);
            if (fD <= 1.7777778f) {
                return false;
            }
            int i10 = Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
            C5596a.a("force_fsg_nav_bar:", i10, f168613a);
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        return !((PowerManager) context.getSystemService(Y7.a.f79330e)).isInteractive();
    }

    public static boolean f(Activity activity) {
        return activity instanceof u;
    }

    public static boolean g(Activity activity) {
        return activity instanceof InterfaceC4271g;
    }
}
