package O4;

import N4.d;
import V5.c;
import android.content.Context;
import com.gaia.ngallery.model.MediaFile;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f65152A = "evt_open_album_ad_loaded";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f65153B = "evt_open_album_ad_opened";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f65154C = "evt_open_album_ad_clicked";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f65155D = "evt_import_p_v_ad_loaded";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f65156E = "evt_import_p_v_ad_opened";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f65157F = "evt_import_p_v_ad_clicked";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65158a = "event_click_album";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65159b = "event_click_cloud_setting";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65160c = "event_click_vault_setting";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65161d = "event_click_contactus";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65162e = "event_click_rateus";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65163f = "scence";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65164g = "SCENCE_HOME";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65165h = "SCENCE_ALBUM";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65166i = "event_click_float_button";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65167j = "event_click_sub_import";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65168k = "event_click_sub_takephoto";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65169l = "event_click_sub_recordvedio";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f65170m = "event_click_sub_addalbum";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f65171n = "event_click_import_ms";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f65172o = "event_click_import_is";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f65173p = "KEY_FROM";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f65174q = "FROM_MEDIASTORE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f65175r = "FROM_INTERNALSTORAGE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f65176s = "event_import_images";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f65177t = "event_import_videos";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f65178u = "event_click_login_gdrive";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f65179v = "event_login_gdrive_success";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f65180w = "event_click_syncnow";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f65181x = "event_sync_success";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f65182y = "event_sync_failed";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f65183z = "event_click_standalone_ad";

    public static void A(Context context) {
        a(context, f65182y).b();
    }

    public static void B(Context context) {
        a(context, f65181x).b();
    }

    public static c a(Context context, String str) {
        return d.l().e().a(context, str);
    }

    public static void b(Context context) {
        a(context, f65158a).b();
    }

    public static void c(Context context) {
        a(context, f65159b).b();
    }

    public static void d(Context context) {
        a(context, f65161d).b();
    }

    public static void e(Context context, String str) {
        a(context, f65166i).c(f65163f, str).b();
    }

    public static void f(Context context) {
        a(context, f65172o).b();
    }

    public static void g(Context context) {
        a(context, f65171n).b();
    }

    public static void h(Context context) {
        a(context, f65178u).b();
    }

    public static void i(Context context) {
        a(context, f65162e).b();
    }

    public static void j(Context context) {
        a(context, f65183z).b();
    }

    public static void k(Context context) {
        a(context, f65170m).b();
    }

    public static void l(Context context) {
        a(context, f65167j).b();
    }

    public static void m(Context context) {
        a(context, f65169l).b();
    }

    public static void n(Context context) {
        a(context, f65168k).b();
    }

    public static void o(Context context) {
        a(context, f65180w).b();
    }

    public static void p(Context context) {
        a(context, f65160c).b();
    }

    public static void q(Context context, String str, Iterable<MediaFile> iterable) {
        int i10 = 0;
        int i11 = 0;
        for (MediaFile mediaFile : iterable) {
            if (d.u(mediaFile.getType())) {
                i10++;
            } else if (d.x(mediaFile.getType())) {
                i11++;
            }
        }
        if (i10 > 0) {
            r(context, str, i10);
        }
        if (i11 > 0) {
            v(context, str, i11);
        }
    }

    public static void r(Context context, String str, int i10) {
        a(context, f65176s).c(f65173p, str).a(i10).b();
    }

    public static void s(Context context) {
        a(context, f65157F).b();
    }

    public static void t(Context context) {
        a(context, f65155D).b();
    }

    public static void u(Context context) {
        a(context, f65156E).b();
    }

    public static void v(Context context, String str, int i10) {
        a(context, f65177t).c(f65173p, str).a(i10).b();
    }

    public static void w(Context context) {
        a(context, f65179v).b();
    }

    public static void x(Context context) {
        a(context, f65154C).b();
    }

    public static void y(Context context) {
        a(context, f65152A).b();
    }

    public static void z(Context context) {
        a(context, f65153B).b();
    }
}
