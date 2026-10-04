package R9;

import android.content.Context;
import androidx.fragment.app.G;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f67750A = "evt_import_app_ad_loaded";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f67751B = "evt_import_app_ad_opened";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f67752C = "evt_import_app_ad_click";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f67753D = "evt_start_guest_app_ad_loaded";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f67754E = "evt_start_guest_app_ad_opened";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f67755F = "evt_start_guest_app_ad_clicked";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f67756G = "event_apk_ad_confirm";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f67757H = "event_apk_ad_impression";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f67758I = "event_apk_start_import";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f67759J = "event_remote_apk_start";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f67760K = "event_remote_import_result";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f67761L = "event_remote_apk_launch";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f67762M = "event_game_click_";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f67763N = "event_game_level_up_";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f67764O = "event_download_app_res_";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f67765P = "event_start_download_res";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f67766Q = "event_check_game_available_res";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f67767a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f67768b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f67769c = "event_browser_clicked";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67770d = "event_install_guest_result";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67771e = "event_uninstall_guest_result";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67772f = "event_launch_guest_result";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67773g = "event_go_to_install_support";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67774h = "show_installhelper_launch";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f67775i = "show_installhelper_install";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f67776j = "event_launch_guest_click";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f67777k = "abi_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f67778l = "device_abi";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f67779m = "installed_support";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67780n = "event_splash_opened_with_click";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f67781o = "event_splash_opened_without_click";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f67782p = "event_splash_opened";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f67783q = "event_startup_splash_opened";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f67784r = "event_splash_click";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f67785s = "event_startup_splash_click";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f67786t = "v2event_card_opened_with_click";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f67787u = "v2event_card_opened_without_click";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f67788v = "event_card__click";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f67789w = "event_card_opened";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f67790x = "event_load_splash_startup_intention";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f67791y = "event_load_splash_other_intention";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f67792z = "event_click_ff_";

    public static a a() {
        if (f67767a == null) {
            synchronized (a.class) {
                try {
                    if (f67767a == null) {
                        f67767a = new a();
                    }
                } finally {
                }
            }
        }
        return f67767a;
    }

    public void A(Context context, String str) {
        c cVarB = b(context, f67774h);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void B(Context context, boolean z10) {
        if (z10) {
            b(context, f67785s).b();
        } else {
            b(context, f67784r).b();
        }
    }

    public void C(Context context, boolean z10) {
        if (z10) {
            b(context, f67783q).b();
        } else {
            b(context, f67782p).b();
        }
    }

    public void D(Context context, String str) {
        c cVarB = b(context, f67765P);
        cVarB.f67798a.c("pkg", str);
        cVarB.b();
    }

    public void E(Context context) {
        b(context, f67755F).b();
    }

    public void F(Context context) {
        b(context, f67753D).b();
    }

    public void G(Context context) {
        b(context, f67754E).b();
    }

    public void H(Context context, String str, boolean z10) {
        c cVarB = b(context, f67771e);
        cVarB.c("pkg", str);
        cVarB.d(c.f67796d, z10);
        cVarB.b();
    }

    public final c b(Context context, String str) {
        return new c(com.prism.hider.variant.a.b().a().a(context, str));
    }

    public void c(Context context, String str) {
        c cVarB = b(context, f67757H);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void d(Context context, String str) {
        c cVarB = b(context, f67758I);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void e(Context context) {
        b(context, f67769c).b();
    }

    public void f(Context context) {
        b(context, f67788v).b();
    }

    public void g(Context context) {
        b(context, f67789w).b();
    }

    public void h(Context context, boolean z10) {
        if (z10) {
            b(context, f67786t).b();
        } else {
            b(context, f67787u).b();
        }
    }

    public void i(Context context, String str, boolean z10) {
        c cVarB = b(context, f67766Q);
        cVarB.f67798a.c("pkg", str);
        cVarB.f67798a.d("Available", z10);
        cVarB.b();
    }

    public void j(Context context, String str) {
        c cVarB = b(context, f67756G);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void k(Context context, String str) {
        c cVarB = b(context, f67792z);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void l(Context context, String str, String str2, boolean z10) {
        c cVarB = b(context, f67764O + z10);
        cVarB.f67798a.c("pkg", str);
        cVarB.f67798a.c("version", str2);
        cVarB.f67798a.d(c.f67796d, z10);
        cVarB.b();
    }

    public void m(Context context, String str) {
        b(context, f67762M + str).b();
    }

    public void n(Context context, String str, String str2) {
        b(context, G.a(f67763N, str, "_", str2)).b();
    }

    public void o(Context context, String str) {
        c cVarB = b(context, f67773g);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void p(Context context) {
        b(context, f67752C).b();
    }

    public void q(Context context) {
        b(context, f67750A).b();
    }

    public void r(Context context) {
        b(context, f67751B).b();
    }

    public void s(Context context, String str, boolean z10) {
        c cVarB = b(context, f67770d);
        cVarB.c(c.f67795c, str);
        cVarB.d(c.f67796d, z10);
        cVarB.b();
    }

    public void t(Context context, String str, boolean z10, boolean z11, String str2, String str3) {
        String str4 = (z10 && z11) ? CampaignEx.JSON_NATIVE_VIDEO_ERROR : z11 ? "32only" : z10 ? "64only" : "both";
        c cVarB = b(context, f67776j);
        cVarB.c("pkg", str);
        cVarB.f67798a.c(f67777k, str4);
        cVarB.f67798a.c(f67779m, str2);
        cVarB.b();
    }

    public void u(Context context, String str, String str2) {
        c cVarB = b(context, f67772f);
        cVarB.c("pkg", str);
        cVarB.c(c.f67797e, str2);
        cVarB.b();
    }

    public void v(Context context, boolean z10) {
        if (z10) {
            b(context, f67790x).b();
        } else {
            b(context, f67791y).b();
        }
    }

    public void w(Context context, String str, boolean z10) {
        c cVarB = b(context, f67760K);
        cVarB.c("pkg", str);
        cVarB.d(c.f67796d, z10);
        cVarB.b();
    }

    public void x(Context context, String str) {
        c cVarB = b(context, f67761L);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void y(Context context, String str) {
        c cVarB = b(context, f67759J);
        cVarB.c("pkg", str);
        cVarB.b();
    }

    public void z(Context context, String str) {
        c cVarB = b(context, f67775i);
        cVarB.c("pkg", str);
        cVarB.b();
    }
}
