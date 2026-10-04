package com.prism.hider.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.app.hider.master.promax.R;
import com.prism.hider.utils.HiderPreferenceUtils;

/* JADX INFO: renamed from: com.prism.hider.ui.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4211g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168245a = com.prism.commons.utils.l0.b(C4211g0.class.getSimpleName());

    /* JADX INFO: renamed from: com.prism.hider.ui.g0$a */
    public interface a {
        void a(Context context);

        void b(Context context);

        void c(Context context);
    }

    public static /* synthetic */ void b(Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        ((r6.k) HiderPreferenceUtils.f168348p.a(activity)).p(Boolean.FALSE);
        com.prism.commons.utils.g0.e(activity, activity.getPackageName(), true);
    }

    public static /* synthetic */ void c(Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        ((r6.k) HiderPreferenceUtils.f168348p.a(activity)).p(Boolean.FALSE);
    }

    public static void d(final Activity activity) {
        try {
            new AlertDialog.Builder(activity).setIcon(0).setTitle(activity.getString(R.string.rate_us_dialog_head_text, activity.getString(R.string.app_name))).setView(activity.getLayoutInflater().inflate(R.layout.layout_rate_us_dialog_mesg_view, (ViewGroup) null)).setNegativeButton(activity.getString(R.string.rate_us_dialog_later), new DialogInterfaceOnClickListenerC4202d0()).setNeutralButton(activity.getString(R.string.rate_us_dialog_never), new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.e0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C4211g0.c(activity, dialogInterface, i10);
                }
            }).setPositiveButton(activity.getString(R.string.rate_us_dialog_yes), new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.f0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C4211g0.b(activity, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
        } catch (Exception unused) {
        }
    }
}
