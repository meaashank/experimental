package U9;

import U9.C1303j0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import ba.o;
import com.android.launcher3.graphics.ColorExtractor;
import com.app.hider.master.promax.R;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.server.pm.PackageG;
import com.prism.hider.ui.DialogC4230q;
import com.prism.hider.ui.LoadingActivity;
import com.prism.hider.utils.HiderPreferenceUtils;
import g6.C4455a;
import java.util.HashSet;
import java.util.Set;
import v8.C5705o;
import y8.C5842a;

/* JADX INFO: renamed from: U9.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1303j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f74080a = com.prism.commons.utils.l0.b(C1303j0.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f74081b = new HashSet();

    /* JADX INFO: renamed from: U9.j0$a */
    public static class a extends DialogC4230q {
        public a(final Activity activity, final GuestAppInfo guestAppInfo, final int i10, final String str, final Bitmap bitmap) {
            super(activity);
            m(str);
            f(GaiaContext.j().N(R.string.tips_can_update, new Object[0]));
            g(new BitmapDrawable(activity.getResources(), bitmap));
            GaiaContext gaiaContext = GaiaContext.f164212y;
            e(gaiaContext.N(R.string.tips_btn_launch_directly, new Object[0]));
            l(gaiaContext.N(R.string.tips_btn_update_now, new Object[0]));
            j(new DialogInterface.OnClickListener() { // from class: U9.f0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.a.p(activity, guestAppInfo, i10, str, bitmap, dialogInterface, i11);
                }
            });
            k(new DialogInterface.OnClickListener() { // from class: U9.g0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.a.n(guestAppInfo, activity, i10, str, bitmap, dialogInterface, i11);
                }
            });
            i(new DialogInterfaceOnClickListenerC1299h0());
        }

        public static /* synthetic */ void n(final GuestAppInfo guestAppInfo, final Activity activity, final int i10, String str, Bitmap bitmap, DialogInterface dialogInterface, int i11) {
            dialogInterface.dismiss();
            if (ApkInfo.getApkInfoSys(guestAppInfo.packageName) != null) {
                D.g().b().L(guestAppInfo.packageName, new o.b() { // from class: U9.i0
                    @Override // ba.o.b
                    public final void a(String str2, int i12, boolean z10) {
                        C1303j0.a.o(guestAppInfo, activity, i10, str2, i12, z10);
                    }
                });
            } else {
                C1303j0.x(activity, guestAppInfo, i10, str, bitmap);
            }
        }

        public static /* synthetic */ void o(GuestAppInfo guestAppInfo, final Activity activity, final int i10, String str, int i11, boolean z10) {
            final GuestAppInfo guestAppInfoE = C5842a.m().e(guestAppInfo.packageName);
            if (guestAppInfoE != null && guestAppInfoE.getStateCode().isRightState()) {
                new Handler(activity.getMainLooper()).post(new Runnable() { // from class: U9.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1303j0.z(activity, guestAppInfoE, i10);
                    }
                });
            }
        }

        public static /* synthetic */ void p(Activity activity, GuestAppInfo guestAppInfo, int i10, String str, Bitmap bitmap, DialogInterface dialogInterface, int i11) {
            dialogInterface.dismiss();
            C1303j0.x(activity, guestAppInfo, i10, str, bitmap);
        }
    }

    /* JADX INFO: renamed from: U9.j0$b */
    public static class b extends DialogC4230q {
        public b(final Activity activity, final GuestAppInfo guestAppInfo, final int i10) {
            super(activity);
            ApkInfo apkInfo = guestAppInfo.getApkInfo();
            m(apkInfo.getName());
            f(guestAppInfo.getErrorMsg());
            g(new BitmapDrawable(activity.getResources(), apkInfo.getIcon()));
            e(GaiaContext.j().N(R.string.dialog_button_try_fix, new Object[0]));
            l(GaiaContext.f164212y.N(R.string.cancel, new Object[0]));
            j(new DialogInterface.OnClickListener() { // from class: U9.m0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.b.o(guestAppInfo, activity, i10, dialogInterface, i11);
                }
            });
            k(new DialogInterfaceOnClickListenerC1311n0());
            i(new DialogInterfaceOnClickListenerC1313o0());
        }

        public static /* synthetic */ void o(final GuestAppInfo guestAppInfo, final Activity activity, final int i10, DialogInterface dialogInterface, int i11) {
            dialogInterface.dismiss();
            D.g().b().b0(guestAppInfo.packageName, new o.b() { // from class: U9.k0
                @Override // ba.o.b
                public final void a(String str, int i12, boolean z10) {
                    C1303j0.b.q(guestAppInfo, activity, i10, str, i12, z10);
                }
            });
        }

        public static /* synthetic */ void q(GuestAppInfo guestAppInfo, final Activity activity, final int i10, String str, int i11, boolean z10) {
            final GuestAppInfo guestAppInfoE = C5842a.m().e(guestAppInfo.packageName);
            if (guestAppInfoE != null && guestAppInfoE.getStateCode().isRightState()) {
                C4455a.b().c().post(new Runnable() { // from class: U9.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1303j0.z(activity, guestAppInfoE, i10);
                    }
                });
            }
        }
    }

    public static void A(Activity activity, String str, int i10) {
        GuestAppInfo guestAppInfoE = C5842a.m().e(str);
        if (guestAppInfoE == null) {
            return;
        }
        ApkInfo apkInfo = guestAppInfoE.getApkInfo();
        w(activity, guestAppInfoE.packageName, guestAppInfoE.spacePkgName, i10, apkInfo.getName(), apkInfo.getIcon());
    }

    public static void B(Activity activity, String str, int i10) {
        z(activity, C5842a.m().e(str), i10);
    }

    public static void C(final Activity activity, final String str) {
        C4455a.b().c().post(new Runnable() { // from class: U9.M
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.g(str, activity);
            }
        });
    }

    public static void D(final Activity activity, final String str, final boolean z10, final boolean z11, final String str2) {
        C4455a.b().c().post(new Runnable() { // from class: U9.a0
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.q(z11, z10, activity, str, str2);
            }
        });
    }

    public static void E(final Activity activity, final String str, final String str2, final int i10, final String str3, final Bitmap bitmap, final String str4) {
        C4455a.b().c().post(new Runnable() { // from class: U9.P
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.d(activity, str, str3, str4, str2, i10, bitmap);
            }
        });
    }

    public static void F(final Context context, final String str, final String str2) {
        C4455a.b().c().post(new Runnable() { // from class: U9.L
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.t(str2, str, context);
            }
        });
    }

    public static void G(final Activity activity, final GuestAppInfo guestAppInfo, final int i10, final String str, final Bitmap bitmap) {
        C4455a.b().c().post(new Runnable() { // from class: U9.Y
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.n(str, guestAppInfo, activity, i10, bitmap);
            }
        });
    }

    public static void H(final Context context, final String str, final String str2) {
        C4455a.b().c().post(new Runnable() { // from class: U9.S
            @Override // java.lang.Runnable
            public final void run() {
                C1303j0.r(str, str2, context);
            }
        });
    }

    public static /* synthetic */ void a(final GuestAppInfo guestAppInfo, final Activity activity, final int i10, DialogInterface dialogInterface, int i11) {
        D.g().b().b0(guestAppInfo.packageName, new o.b() { // from class: U9.I
            @Override // ba.o.b
            public final void a(String str, int i12, boolean z10) {
                C1303j0.l(guestAppInfo, activity, i10, str, i12, z10);
            }
        });
        dialogInterface.dismiss();
    }

    public static void c(String str, final Activity activity, final int i10) {
        C5842a.m().p(str);
        final GuestAppInfo guestAppInfoE = C5842a.f241112c.e(str);
        if (guestAppInfoE != null && guestAppInfoE.getStateCode().isRightState()) {
            C4455a.b().c().post(new Runnable() { // from class: U9.K
                @Override // java.lang.Runnable
                public final void run() {
                    C1303j0.z(activity, guestAppInfoE, i10);
                }
            });
        }
    }

    public static /* synthetic */ void d(final Activity activity, final String str, final String str2, final String str3, final String str4, final int i10, final Bitmap bitmap) {
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(y()).setTitle(str2).setIcon(0).setMessage(PkgUtils.k(activity, str)).setPositiveButton(R.string.launch_abi_64_app_confirm_install, new DialogInterface.OnClickListener() { // from class: U9.d0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.e(activity, str3, dialogInterface, i11);
                }
            }).setNegativeButton(R.string.launch_abi_64_app_later_install, new DialogInterface.OnClickListener() { // from class: U9.J
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.h(activity, str, str4, i10, str2, bitmap, dialogInterface, i11);
                }
            }).setCancelable(false).create();
            alertDialogCreate.show();
            com.prism.commons.utils.h0.a(activity, alertDialogCreate);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void e(Activity activity, String str, DialogInterface dialogInterface, int i10) {
        Z6.g.B().G(activity, str);
        dialogInterface.dismiss();
    }

    public static void g(final String str, Activity activity) {
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(y()).setIcon(0).setTitle(R.string.helper_allow_rel_start_title).setMessage(GaiaContext.f164212y.N(R.string.helper_allow_rel_start, Z6.g.B().v(str))).setPositiveButton(R.string.text_go_to, new DialogInterface.OnClickListener() { // from class: U9.T
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C1303j0.s(str, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.text_cancel, new V()).setCancelable(false).create();
            alertDialogCreate.show();
            com.prism.commons.utils.h0.a(activity, alertDialogCreate);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void h(Activity activity, String str, String str2, int i10, String str3, Bitmap bitmap, DialogInterface dialogInterface, int i11) {
        w(activity, str, str2, i10, str3, bitmap);
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void k(Activity activity, GuestAppInfo guestAppInfo, int i10, String str, Bitmap bitmap, DialogInterface dialogInterface, int i11) {
        w(activity, guestAppInfo.packageName, guestAppInfo.spacePkgName, i10, str, bitmap);
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void l(GuestAppInfo guestAppInfo, final Activity activity, final int i10, String str, int i11, boolean z10) {
        final GuestAppInfo guestAppInfoE = C5842a.m().e(guestAppInfo.packageName);
        if (guestAppInfoE != null && guestAppInfoE.getStateCode().isRightState()) {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: U9.U
                @Override // java.lang.Runnable
                public final void run() {
                    C1303j0.z(activity, guestAppInfoE, i10);
                }
            });
        }
    }

    public static /* synthetic */ void n(final String str, final GuestAppInfo guestAppInfo, final Activity activity, final int i10, final Bitmap bitmap) {
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(y()).setTitle(str).setIcon(0).setMessage(GaiaContext.j().N(R.string.helper_relocate_better_api_mesg_text, guestAppInfo.betterSpacePkgName)).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: U9.b0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.a(guestAppInfo, activity, i10, dialogInterface, i11);
                }
            }).setNegativeButton(R.string.launch_abi_64_app_later_install, new DialogInterface.OnClickListener() { // from class: U9.c0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C1303j0.k(activity, guestAppInfo, i10, str, bitmap, dialogInterface, i11);
                }
            }).setCancelable(false).create();
            alertDialogCreate.show();
            com.prism.commons.utils.h0.a(activity, alertDialogCreate);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void q(boolean z10, boolean z11, final Activity activity, String str, final String str2) {
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(y()).setIcon(0).setMessage(activity.getString(z10 ? z11 ? R.string.update_abi_64_app_msg : R.string.launch_abi_64_app_msg : z11 ? R.string.update_abi_32_app_msg : R.string.launch_abi_32_app_msg, str)).setPositiveButton(z11 ? R.string.update_abi_64_app_confirm_update : R.string.launch_abi_64_app_confirm_install, new DialogInterface.OnClickListener() { // from class: U9.N
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C1303j0.u(activity, str2, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.launch_abi_64_app_later_install, new O()).setCancelable(false).create();
            alertDialogCreate.show();
            com.prism.commons.utils.h0.a(activity, alertDialogCreate);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void r(String str, String str2, Context context) {
        try {
            Activity activityY = y();
            if (activityY == null) {
                return;
            }
            androidx.appcompat.app.AlertDialog alertDialogCreate = new AlertDialog.Builder(activityY, 2132083378).setIcon(0).setTitle(str).setMessage(str2).setPositiveButton(context.getString(R.string.import_app_fail_dialog_yes), new Z()).setCancelable(false).create();
            alertDialogCreate.show();
            com.prism.commons.utils.h0.b(context, alertDialogCreate);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void s(String str, DialogInterface dialogInterface, int i10) {
        L0.a(y(), str);
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void t(final String str, String str2, Context context) {
        Set<String> set = f74081b;
        if (set.add(str)) {
            try {
                Activity activityY = y();
                if (activityY == null) {
                    set.remove(str);
                    return;
                }
                String strTrim = (str2 == null || str2.trim().isEmpty()) ? str : str2.trim();
                androidx.appcompat.app.AlertDialog alertDialogCreate = new AlertDialog.Builder(activityY, 2132083378).setIcon(0).setTitle(context.getString(R.string.guest_signature_mismatch_notice_title, strTrim)).setMessage(context.getString(R.string.guest_signature_mismatch_notice, strTrim, str)).setPositiveButton(context.getString(R.string.import_app_fail_dialog_yes), new W()).setCancelable(true).create();
                alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: U9.X
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C1303j0.f74081b.remove(str);
                    }
                });
                alertDialogCreate.show();
                com.prism.commons.utils.h0.b(context, alertDialogCreate);
            } catch (Throwable unused) {
                f74081b.remove(str);
            }
        }
    }

    public static /* synthetic */ void u(Activity activity, String str, DialogInterface dialogInterface, int i10) {
        Z6.g.B().G(activity, str);
        dialogInterface.dismiss();
    }

    public static void w(Activity activity, String str, String str2, int i10, String str3, Bitmap bitmap) {
        String str4 = f74080a;
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("doLaunchGuest: ", str, "(", str3, ")(");
        sbA.append(i10);
        sbA.append(")");
        Log.d(str4, sbA.toString());
        LoadingActivity.D1(activity, str, str2, i10, str3, bitmap, ColorExtractor.findDominantColorByHue(bitmap, 20));
    }

    public static void x(Activity activity, GuestAppInfo guestAppInfo, int i10, String str, Bitmap bitmap) {
        String strF;
        if (!a7.c.j(guestAppInfo.packageName)) {
            w(activity, guestAppInfo.packageName, guestAppInfo.spacePkgName, i10, str, bitmap);
            return;
        }
        String str2 = guestAppInfo.betterSpacePkgName;
        if (str2 != null && !str2.equals(guestAppInfo.spacePkgName)) {
            G(activity, guestAppInfo, i10, str, bitmap);
            return;
        }
        boolean zF0 = U6.c.f0();
        int iX = GaiaContext.j().x();
        if (U6.c.W(guestAppInfo.spacePkgName)) {
            zF0 = U6.c.S(guestAppInfo.spacePkgName);
            iX = U6.c.z(guestAppInfo.spacePkgName);
        }
        if (iX != 0) {
            int iAbs = Math.abs(iX);
            int i11 = guestAppInfo.targetSdkVersion;
            if (iAbs > i11 && (strF = a7.c.f(zF0, i11)) != null) {
                E(activity, guestAppInfo.packageName, guestAppInfo.spacePkgName, i10, str, bitmap, strF);
                return;
            }
        }
        w(activity, guestAppInfo.packageName, guestAppInfo.spacePkgName, i10, str, bitmap);
    }

    public static Activity y() {
        return C1298h.j().k();
    }

    public static void z(final Activity activity, @Nullable GuestAppInfo guestAppInfo, int i10) {
        if (guestAppInfo != null && !guestAppInfo.isVisibleToUser()) {
            Toast.makeText(activity, "App is disabled", 1).show();
            return;
        }
        if (guestAppInfo == null) {
            Toast.makeText(activity, "App is not exist now!", 1).show();
            C5705o.c().a(new RuntimeException("query guestAppInfo null"), "LAUNCH_GUEST", null);
            return;
        }
        final String str = guestAppInfo.packageName;
        ApkInfo apkInfo = guestAppInfo.getApkInfo();
        int i11 = i10 >= 0 ? i10 : 0;
        String name = apkInfo.getName();
        Bitmap icon = apkInfo.getIcon();
        boolean zIsLaunchInHelper = guestAppInfo.isLaunchInHelper();
        boolean z10 = zIsLaunchInHelper && GaiaContext.j().g0(guestAppInfo.spacePkgName);
        boolean z11 = zIsLaunchInHelper && U6.c.V(guestAppInfo.spacePkgName);
        boolean z12 = zIsLaunchInHelper && U6.c.S(guestAppInfo.spacePkgName);
        boolean z13 = z12;
        R9.a.a().t(activity, guestAppInfo.packageName, guestAppInfo.is64bitOnly(), guestAppInfo.is32bitOnly(), zIsLaunchInHelper ? guestAppInfo.spacePkgName : "null", U6.c.o()[0]);
        if (guestAppInfo.getStateCode().isRightState()) {
            if (zIsLaunchInHelper && !z11) {
                D(activity, name, z10, z13, guestAppInfo.spacePkgName);
                R9.a.a().A(activity, str);
                return;
            } else if (guestAppInfo.isUsingOldVersionNow() && ((Boolean) ((r6.k) HiderPreferenceUtils.f168342j.a(activity)).o()).booleanValue()) {
                new a(activity, guestAppInfo, i11, name, icon).show();
                return;
            } else {
                x(activity, guestAppInfo, i11, name, icon);
                return;
            }
        }
        final int i12 = i11;
        if (guestAppInfo.getStateCode() == PackageG.StateCode.HELPER_NO_INSTALL || guestAppInfo.getStateCode() == PackageG.StateCode.HELPER_VS_TOO_LOW) {
            if (!z10 || !z11) {
                D(activity, name, z10, z13, guestAppInfo.spacePkgName);
                R9.a.a().A(activity, str);
                return;
            }
        } else if (guestAppInfo.getStateCode() == PackageG.StateCode.HELPER_NO_REL_START) {
            if (!Z6.g.h(true, guestAppInfo.spacePkgName)) {
                C(activity, guestAppInfo.spacePkgName);
                return;
            }
        } else if (guestAppInfo.getStateCode() == PackageG.StateCode.OPTIMIZE_WAITING) {
            com.prism.commons.utils.r0.g(activity, GaiaContext.j().N(R.string.tips_need_optimize, new Object[0]), 1);
            C4455a.b.f202252a.a().execute(new Runnable() { // from class: U9.Q
                @Override // java.lang.Runnable
                public final void run() {
                    C1303j0.c(str, activity, i12);
                }
            });
            return;
        }
        new b(activity, guestAppInfo, i12).show();
    }
}
