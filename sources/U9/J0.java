package U9;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Toast;
import com.android.launcher3.AppInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherState;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.extension.ItemClickHandlerExtension;
import com.app.hider.master.promax.R;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.hider.ui.DialogC4230q;
import com.prism.hider.utils.HiderPreferenceUtils;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class J0 implements ItemClickHandlerExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f73937a = com.prism.commons.utils.l0.b(J0.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f73938b = 6000;

    public static class a extends DialogC4230q {
        public a(Context context, GuestAppInfo guestAppInfo) {
            super(context);
            int length = guestAppInfo.vuserIds.length;
            ApkInfo apkInfo = guestAppInfo.getApkInfo();
            m(apkInfo.getName() + " X" + (length + 1));
            g(new BitmapDrawable(context.getResources(), apkInfo.getIcon()));
            e(GaiaContext.j().N(R.string.tips_btn_create_multi_account, new Object[0]));
        }
    }

    public static /* synthetic */ void e(Context context, String str, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        com.prism.commons.utils.A.e(context, str);
    }

    public static /* synthetic */ void f(Launcher launcher, GuestAppInfo guestAppInfo, int i10, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        C1303j0.z(launcher, guestAppInfo, i10);
    }

    public static /* synthetic */ void i(String str, Context context, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        com.prism.commons.utils.g0.e(context, str, true);
    }

    public final void o(Context context, GuestAppInfo guestAppInfo, final View view, final AppInfo appInfo, final Launcher launcher) {
        a aVar = new a(context, guestAppInfo);
        aVar.f168290k = new DialogInterface.OnClickListener() { // from class: U9.v0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f74166a.u(view, appInfo, launcher, dialogInterface);
            }
        };
        aVar.f168291l = new A0();
        aVar.show();
    }

    @Override // com.android.launcher3.extension.ItemClickHandlerExtension
    public boolean onClickAppInfo(final View view, final AppInfo appInfo, final Launcher launcher) {
        final Context context = view.getContext();
        String decodedPkgName = appInfo.getDecodedPkgName();
        if (Z6.g.B().C(decodedPkgName)) {
            com.prism.commons.utils.I.b(f73937a, "SECURE_ENV restricted, quit to import app(%s)", decodedPkgName);
            new AlertDialog.Builder(launcher).setMessage(R.string.mesg_forbid_import_app_require_secure_env_gp).setNegativeButton(R.string.text_confirm, new B0()).create().show();
            return true;
        }
        if (D.g().b().O(decodedPkgName)) {
            com.prism.commons.utils.I.b(f73937a, "app(%s) is importing currently, quit to import this time", decodedPkgName);
            Toast.makeText(view.getContext(), context.getString(R.string.hider_toast_importing, appInfo.title), 0).show();
            return true;
        }
        final GuestAppInfo guestAppInfoE = C5842a.m().e(decodedPkgName);
        if (guestAppInfoE != null) {
            com.prism.commons.utils.I.b(f73937a, "app(%s) imported already, create multi user", decodedPkgName);
            launcher.getStateManager().goToState(LauncherState.NORMAL, true, new Runnable() { // from class: U9.C0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73890a.o(context, guestAppInfoE, view, appInfo, launcher);
                }
            });
            return true;
        }
        com.prism.commons.utils.I.b(f73937a, "app(%s) not imported before, start to import", decodedPkgName);
        launcher.getStateManager().goToState(LauncherState.NORMAL, true, new Runnable() { // from class: U9.D0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73902a.q(context, appInfo, view, launcher);
            }
        });
        return true;
    }

    @Override // com.android.launcher3.extension.ItemClickHandlerExtension
    public boolean onClickShortcutInfo(final View view, final ShortcutInfo shortcutInfo, final Launcher launcher) {
        String packageNameInComponent = shortcutInfo.getPackageNameInComponent();
        com.prism.commons.utils.I.b(f73937a, "onClickShortcutInfo pkgName: %s", packageNameInComponent);
        if (!com.prism.hider.utils.c.k(packageNameInComponent)) {
            return false;
        }
        if (!com.prism.hider.utils.c.i(packageNameInComponent)) {
            if (com.prism.hider.utils.c.j(packageNameInComponent)) {
                String strB = com.prism.hider.utils.c.b(packageNameInComponent);
                R9.a.a().k(view.getContext(), strB);
                ea.l.d().c(strB).onLaunch(launcher);
            }
            return true;
        }
        if (shortcutInfo.hasStatusFlag(3)) {
            Toast.makeText(view.getContext(), R.string.hider_wait_for_installing, 1).show();
            return true;
        }
        String strA = com.prism.hider.utils.c.a(packageNameInComponent);
        final int vuserId = shortcutInfo.getVuserId();
        final GuestAppInfo guestAppInfoE = C5842a.m().e(strA);
        if (!((Boolean) ((r6.k) HiderPreferenceUtils.f168340h.a(view.getContext())).o()).booleanValue()) {
            C1303j0.z(launcher, guestAppInfoE, vuserId);
            return true;
        }
        final com.prism.hider.ui.O o10 = new com.prism.hider.ui.O(view.getContext());
        o10.o(shortcutInfo);
        o10.f168291l = new G0();
        o10.k(new DialogInterface.OnClickListener() { // from class: U9.H0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f73921a.s(o10, view, shortcutInfo, dialogInterface, i10);
            }
        });
        o10.f168290k = new DialogInterface.OnClickListener() { // from class: U9.I0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                J0.f(launcher, guestAppInfoE, vuserId, dialogInterface, i10);
            }
        };
        o10.show();
        return true;
    }

    public final /* synthetic */ void p(View view, AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface, int i10) {
        t(view, appInfo, launcher, dialogInterface);
    }

    public final void q(Context context, final AppInfo appInfo, final View view, final Launcher launcher) {
        com.prism.hider.ui.I i10 = new com.prism.hider.ui.I(context);
        i10.w(appInfo);
        i10.f168290k = new DialogInterface.OnClickListener() { // from class: U9.w0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f74174a.t(view, appInfo, launcher, dialogInterface);
            }
        };
        i10.f168291l = new DialogInterfaceOnClickListenerC1330x0();
        i10.E(context);
    }

    public final /* synthetic */ void r(View view, AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface, int i10) {
        u(view, appInfo, launcher, dialogInterface);
    }

    public final /* synthetic */ void s(com.prism.hider.ui.O o10, View view, ShortcutInfo shortcutInfo, DialogInterface dialogInterface, int i10) {
        if (!o10.q()) {
            v(view.getContext(), shortcutInfo);
        }
        dialogInterface.dismiss();
    }

    public final void t(View view, AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        com.prism.hider.utils.m.a(launcher, com.prism.hider.utils.m.j(launcher, appInfo), 0);
        D.g().b().K(appInfo);
    }

    public final void u(View view, AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        D.g().b().A(appInfo.getDecodedPkgName(), null);
    }

    public final void v(final Context context, ShortcutInfo shortcutInfo) {
        final String strA = com.prism.hider.utils.c.a(shortcutInfo.getPackageNameInComponent());
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, 2132083378).setTitle(R.string.tips_to_hide_guest_title).setMessage(R.string.tips_to_hide_guest_msg).setNegativeButton(R.string.cancel, new E0()).setPositiveButton(R.string.guide_3_title, new DialogInterface.OnClickListener() { // from class: U9.F0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                J0.e(context, strA, dialogInterface, i10);
            }
        }).create();
        com.prism.hider.utils.h.s(alertDialogCreate, -1, f73938b);
        alertDialogCreate.show();
    }

    public final void w(final Context context, ShortcutInfo shortcutInfo) {
        final String strA = com.prism.hider.utils.c.a(shortcutInfo.getPackageNameInComponent());
        new AlertDialog.Builder(context, 2132083378).setMessage(context.getString(R.string.tips_to_unhide_guest)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC1332y0()).setPositiveButton(R.string.launch_abi_64_app_confirm_install, new DialogInterface.OnClickListener() { // from class: U9.z0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                J0.i(strA, context, dialogInterface, i10);
            }
        }).create().show();
    }
}
