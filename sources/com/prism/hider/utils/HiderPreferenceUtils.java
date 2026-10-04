package com.prism.hider.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.G;
import com.prism.commons.utils.V;
import com.prism.commons.utils.e0;
import com.prism.commons.utils.w0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.server.Gaia32bit64bitProvider;

/* JADX INFO: loaded from: classes6.dex */
public class HiderPreferenceUtils {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f168331A = "GO_HOME_WHEN_FLIP_OVER";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static r6.i<Boolean> f168332B = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168333a = "preferences_hider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static V f168334b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168335c = "shown_user_terms";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r6.i<Boolean> f168336d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168337e = "upgrade_warning_tips_count";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static r6.i<Integer> f168338f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f168339g = "SHOW_TIPS_WHEN_LAUNCH_GUEST";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static r6.i<Boolean> f168340h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f168341i = "SHOW_TIPS_WHEN_UPDATE_AVAILABLE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static r6.i<Boolean> f168342j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f168343k = "LAUNCH_TIPS_NOT_NEXT_TIME_CHECKED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static r6.i<Boolean> f168344l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f168345m = "user_choocied_Language";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static r6.j<String> f168346n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f168347o = "show_rate_us";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static r6.i<Boolean> f168348p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f168349q = "SHOW_IMPORT_APP_GUIDE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static r6.i<Boolean> f168350r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f168351s = "success_app_open_count";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static r6.i<Integer> f168352t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f168353u = "ENABLE_SYSTEM_SHORTCUT";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static r6.i<Boolean> f168354v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f168355w = "ALLOW_SCREEN_CAPTURE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static r6.i<Boolean> f168356x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f168357y = "KEEP_ALIVE_FOREGROUND";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static r6.i<Boolean> f168358z;

    static {
        V vC = c();
        Boolean bool = Boolean.FALSE;
        f168336d = new r6.i<>(vC, f168335c, bool, Boolean.class);
        f168338f = new r6.i<>(c(), f168337e, 0, Integer.class);
        V vC2 = c();
        Boolean bool2 = Boolean.TRUE;
        f168340h = new r6.i<>(vC2, f168339g, bool2, Boolean.class);
        f168342j = new r6.i<>(c(), f168341i, bool2, Boolean.class);
        f168344l = new r6.i<>(c(), f168343k, bool2, Boolean.class);
        f168346n = new r6.j<>(c(), f168345m, (w0) new e(), String.class);
        f168348p = new r6.i<>(c(), f168347o, bool2, Boolean.class);
        f168350r = new r6.i<>(c(), f168349q, bool2, Boolean.class);
        f168352t = new r6.i<>(c(), f168351s, 0, Integer.class);
        f168354v = new r6.i<>(c(), f168353u, bool, Boolean.class);
        f168356x = new r6.i<>(c(), f168355w, bool, Boolean.class);
        f168358z = new r6.i<>(c(), f168357y, Boolean.valueOf(!C3841e.E()), Boolean.class);
        f168332B = new r6.i<>(c(), f168331A, bool, Boolean.class);
    }

    public static /* synthetic */ String a(Context context) {
        G.e();
        return "";
    }

    public static boolean b(Context context) {
        return p6.i.b(context) ? ((Boolean) ((r6.k) f168356x.a(context)).o()).booleanValue() : new RemoteAllowScreenCapture().start(Gaia32bit64bitProvider.g()) == 1;
    }

    public static V c() {
        V v10 = f168334b;
        if (v10 != null) {
            return v10;
        }
        synchronized (e0.class) {
            try {
                V v11 = f168334b;
                if (v11 != null) {
                    return v11;
                }
                V v12 = new V("preferences_hider");
                f168334b = v12;
                return v12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class RemoteAllowScreenCapture extends RemoteRunnable {
        public static final Parcelable.Creator<RemoteAllowScreenCapture> CREATOR = new a();

        public class a implements Parcelable.Creator<RemoteAllowScreenCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteAllowScreenCapture createFromParcel(Parcel parcel) {
                return new RemoteAllowScreenCapture(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteAllowScreenCapture[] newArray(int i10) {
                return new RemoteAllowScreenCapture[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            setResultCode(((Boolean) ((r6.k) HiderPreferenceUtils.f168356x.a(GaiaContext.j().n())).o()).booleanValue() ? 1 : 0);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
        }

        private RemoteAllowScreenCapture() {
        }

        private RemoteAllowScreenCapture(Parcel parcel) {
            super(parcel);
        }
    }
}
