package com.prism.hider.ui;

import P9.a;
import U9.C1303j0;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC1486c;
import com.android.launcher3.AppInfo;
import com.android.launcher3.graphics.DrawableFactory;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.helper.utils.PkgUtils;
import e6.C4367c;
import s6.C5577b;
import s6.i;

/* JADX INFO: loaded from: classes6.dex */
public class I extends DialogC4230q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AppInfo f167976o;

    public class a implements i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityC1486c f167977a;

        public a(ActivityC1486c activityC1486c) {
            this.f167977a = activityC1486c;
        }

        @Override // s6.i.b
        public void a(s6.i iVar) {
            U6.c.r().b().b(this.f167977a);
            I.this.D(this.f167977a);
        }

        @Override // s6.i.b
        public void b(s6.i iVar) {
            I.this.D(this.f167977a);
        }

        @Override // s6.i.b
        public void c(s6.i iVar, @NonNull String[] strArr) {
            I.this.D(this.f167977a);
        }
    }

    public class b extends T6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f167979a;

        public b(View view) {
            this.f167979a = view;
        }

        @Override // T6.a
        public void b() {
            I.super.c(this.f167979a);
        }

        @Override // T6.a
        public void c(int i10) {
            I.super.c(this.f167979a);
        }
    }

    public I(@NonNull Context context) {
        super(context);
    }

    public final /* synthetic */ void A(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        show();
    }

    public final /* synthetic */ void B(Activity activity, String str) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setIcon(0).setTitle(this.f167976o.title).setMessage(str).setPositiveButton(activity.getString(R.string.import_app_fail_dialog_force), new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.G
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f167951a.A(dialogInterface, i10);
            }
        }).setNegativeButton(R.string.cancel, new H()).create();
        alertDialogCreate.show();
        com.prism.commons.utils.h0.a(activity, alertDialogCreate);
    }

    public final void C(final Activity activity) {
        if (!(activity instanceof ActivityC1486c)) {
            D(activity);
        } else {
            final ActivityC1486c activityC1486c = (ActivityC1486c) activity;
            new AlertDialog.Builder(activity).setIcon(0).setMessage(R.string.import_app_ask_perm_notification).setPositiveButton(R.string.import_app_ask_perm_grant, new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.D
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f167918a.y(activityC1486c, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.import_app_ask_perm_continue, new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.E
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f167923a.z(activity, dialogInterface, i10);
                }
            }).create().show();
        }
    }

    public final void D(final Activity activity) {
        final String strJ = PkgUtils.j(activity, this.f167976o.getDecodedPkgName());
        if (strJ == null) {
            show();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.prism.hider.ui.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167927a.B(activity, strJ);
                }
            });
        }
    }

    public void E(Context context) {
        Activity activityY = C1303j0.y();
        if (activityY == null) {
            return;
        }
        if (C3841e.p()) {
            if (((NotificationManager) activityY.getSystemService("notification")).areNotificationsEnabled()) {
                D(activityY);
                return;
            } else if (C3841e.D() && activityY.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                C(activityY);
                return;
            }
        }
        D(activityY);
    }

    @Override // com.prism.hider.ui.DialogC4230q
    public void c(View view) {
        J6.a.f().i(a.C0095a.f65580c, getContext(), null, new b(view));
    }

    public void v(Drawable drawable, String str) {
        x(drawable, str);
    }

    public void w(AppInfo appInfo) {
        this.f167976o = appInfo;
        x(DrawableFactory.get(getContext()).newIcon(appInfo), appInfo.title.toString());
    }

    public final void x(Drawable drawable, String str) {
        g(drawable);
        m(str);
        f(getContext().getString(R.string.hider_import_app_desc, str, getContext().getString(R.string.app_name)));
        e(getContext().getString(R.string.hider_bt_import));
    }

    public final /* synthetic */ void y(ActivityC1486c activityC1486c, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        C4367c.o().y(activityC1486c, new C5577b[]{new C5577b("android.permission.POST_NOTIFICATIONS", R.string.permlab_post_notifications, false)}, new a(activityC1486c));
    }

    public final /* synthetic */ void z(Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        D(activity);
    }
}
