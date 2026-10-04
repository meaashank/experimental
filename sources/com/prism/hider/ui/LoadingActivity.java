package com.prism.hider.ui;

import P9.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import com.app.hider.master.promax.R;
import com.mbridge.msdk.MBridgeConstans;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.l;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.remote.PermissionGroup;
import com.prism.hider.utils.HiderPreferenceUtils;
import g6.C4455a;
import java.util.HashMap;
import java.util.Set;
import t1.C5596a;
import v8.C5703m;
import v8.C5714x;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f167992o = "KEY_GUEST_PKG_NAME";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f167993p = "KEY_SPACE_PKG_NAME";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f167994q = "KEY_INTENT";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f167995r = "KEY_USER";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f167996s = "TARGET_APP";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f167997t = "KEY_TITLE";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f167998u = "KEY_BG_COLOR";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static LoadingActivity f167999v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f168000w = 10000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f168001x = 360;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f168003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f168004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f168005c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f168008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l.c f168009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l.b f168010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile ServiceConnection f168011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f168012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressBar f168013k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f167991n = com.prism.commons.utils.l0.b("LoadingActivity");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f168002y = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f168006d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f168007e = new Runnable() { // from class: com.prism.hider.ui.X
        @Override // java.lang.Runnable
        public final void run() {
            this.f168213a.u1();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PowerManager.WakeLock f168014l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap<String, Set<Integer>> f168015m = new HashMap<>();

    public class a implements l.b {
        public a() {
        }

        @Override // com.prism.gaia.helper.compat.l.b
        public void a(int i10, String[] strArr) {
            if (i10 != 360 || LoadingActivity.this.isFinishing()) {
                return;
            }
            LoadingActivity.this.o1();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoadingActivity.this.B1();
        }
    }

    public class c extends X9.a {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f168019a;

            public a(int i10) {
                this.f168019a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                LoadingActivity.this.f168012j.q(LoadingActivity.this.getString(R.string.download_game_resource) + C4.q.f17581a + this.f168019a + "%");
                LoadingActivity.this.f168013k.setProgress(this.f168019a);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(LoadingActivity.this, R.string.download_successful, 0).show();
            }
        }

        /* JADX INFO: renamed from: com.prism.hider.ui.LoadingActivity$c$c, reason: collision with other inner class name */
        public class RunnableC0683c implements Runnable {
            public RunnableC0683c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(LoadingActivity.this, R.string.download_failed, 0).show();
            }
        }

        public c() {
        }

        @Override // X9.a
        public void a(int i10, @Nullable String str) {
            Log.d(LoadingActivity.f167991n, "Download.onFailed, errorCode: " + i10 + "; errorMessage: " + str);
            LoadingActivity.this.runOnUiThread(new RunnableC0683c());
            LoadingActivity.this.n1();
            LoadingActivity.this.y1();
        }

        @Override // X9.a
        public void b() {
            LoadingActivity.this.n1();
            LoadingActivity.this.q1();
        }

        @Override // X9.a
        public void c(int i10) {
            C5596a.a("Download.onProgress: ", i10, LoadingActivity.f167991n);
            LoadingActivity.this.runOnUiThread(new a(i10));
        }

        @Override // X9.a
        public void d(String str) {
            android.support.v4.media.b.a("Download.onSuccess: ", str, LoadingActivity.f167991n);
            LoadingActivity.this.runOnUiThread(new b());
            LoadingActivity.this.n1();
            LoadingActivity.this.y1();
        }

        @Override // X9.a
        public void e() {
            Log.d(LoadingActivity.f167991n, "Download.onUnAvailableObb .. .. ..");
            LoadingActivity.this.n1();
            LoadingActivity.this.y1();
        }
    }

    public class d extends T6.a {
        public d() {
        }

        @Override // T6.a
        public void b() {
            if (LoadingActivity.this.isFinishing()) {
                return;
            }
            String unused = LoadingActivity.f167991n;
            LoadingActivity.this.x1();
        }

        @Override // T6.a
        public void c(int i10) {
            if (LoadingActivity.this.isFinishing()) {
                return;
            }
            String unused = LoadingActivity.f167991n;
            LoadingActivity.this.x1();
        }

        @Override // T6.a
        public void f(Object obj) {
            if (LoadingActivity.this.isFinishing()) {
                return;
            }
            ((J6.c) obj).c(LoadingActivity.this, null);
            String unused = LoadingActivity.f167991n;
        }
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LoadingActivity.this.f168011i = this;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LoadingActivity.this.f168011i = null;
        }
    }

    public static void D1(Context context, String str, String str2, int i10, String str3, Bitmap bitmap, int i11) {
        Intent intentZ = C5714x.j().z(str, i10);
        String str4 = f167991n;
        Log.d(str4, "guestPkg:" + str + " intent:" + intentZ);
        if (intentZ != null) {
            Intent intent = new Intent(context, (Class<?>) LoadingActivity.class);
            intent.putExtra("KEY_GUEST_PKG_NAME", str);
            intent.putExtra("KEY_SPACE_PKG_NAME", str2);
            intent.addFlags(268435456);
            intent.putExtra("KEY_INTENT", intentZ);
            intent.putExtra("KEY_USER", i10);
            intent.putExtra("KEY_TITLE", str3);
            intent.putExtra("KEY_BG_COLOR", i11);
            intent.addFlags(8388608);
            Log.d(str4, "runningInstance:" + f167999v);
            LoadingActivity loadingActivity = f167999v;
            if (loadingActivity != null) {
                loadingActivity.q1();
            }
            f168002y = true;
            context.startActivity(intent);
        }
    }

    public final boolean A1() {
        if (this.f168008f) {
            return false;
        }
        this.f168008f = true;
        this.f168006d.removeCallbacks(this.f168007e);
        GProcessClient.c6().p6(this);
        runOnUiThread(new Runnable() { // from class: com.prism.hider.ui.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f168176a.q1();
            }
        });
        return true;
    }

    public final void B1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("!!");
        builder.setMessage(getString(R.string.terminate_game_res_download_alert));
        builder.setCancelable(false);
        builder.setNegativeButton(R.string.cancel, new T());
        builder.setPositiveButton(R.string.action_ok, new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.U
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f168145a.v1(dialogInterface, i10);
            }
        });
        builder.setCancelable(true);
        builder.show();
    }

    public final void C1() {
        ProgressBar progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        this.f168013k = progressBar;
        progressBar.setMax(100);
        this.f168013k.setProgress(0);
        this.f168013k.setLayoutParams(new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.material_grid_touch_xlarge)));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.dialog_padding), getResources().getDimensionPixelSize(R.dimen.dialog_padding), getResources().getDimensionPixelSize(R.dimen.dialog_padding), getResources().getDimensionPixelSize(R.dimen.dialog_padding));
        linearLayout.addView(this.f168013k);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.action_downloads);
        builder.setMessage(getString(R.string.download_game_resource) + MBridgeConstans.ENDCARD_URL_TYPE_PL);
        builder.setView(linearLayout);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.setCancelable(false);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        this.f168012j = alertDialogCreate;
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.prism.hider.ui.Q
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f168080a.w1(dialogInterface);
            }
        });
        this.f168012j.show();
    }

    public final void m1() {
    }

    public final void n1() {
        AlertDialog alertDialog = this.f168012j;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f168012j.dismiss();
    }

    public final void o1() {
        C1();
        int i10 = C5842a.m().e(this.f168003a).versionCode;
        new c().e();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, android.app.Activity
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        l.c cVar = this.f168009g;
        if (cVar != null) {
            cVar.f(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = f167991n;
        Log.d(str, "onCreate");
        super.onCreate(bundle);
        getWindow().addFlags(128);
        f167999v = this;
        this.f168008f = false;
        setContentView(R.layout.hider_activity_loading);
        this.f168003a = getIntent().getStringExtra("KEY_GUEST_PKG_NAME");
        this.f168004b = getIntent().getStringExtra("KEY_SPACE_PKG_NAME");
        this.f168005c = getIntent().getStringExtra("KEY_TITLE");
        int intExtra = getIntent().getIntExtra("KEY_BG_COLOR", -1);
        findViewById(R.id.rl_content).setBackgroundColor(intExtra);
        GuestAppInfo guestAppInfoE = C5842a.m().e(this.f168003a);
        Log.d(str, "onCreate bgColor:" + intExtra + " guestAppInfo:" + guestAppInfoE);
        ImageView imageView = (ImageView) findViewById(R.id.app_icon);
        if (guestAppInfoE != null) {
            imageView.setImageDrawable(Drawable.createFromPath(guestAppInfoE.getIconFile().getAbsolutePath()));
        } else {
            q1();
        }
        if (((Intent) getIntent().getParcelableExtra("KEY_INTENT")) == null) {
            return;
        }
        l.c cVarL = com.prism.gaia.helper.compat.l.l(this.f168003a, new PermissionGroup[0]);
        this.f168009g = cVarL;
        a aVar = new a();
        this.f168010h = aVar;
        cVarL.d(this, 360, aVar);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.d(f167991n, "onDestroy");
        getWindow().clearFlags(128);
        f167999v = null;
        this.f168006d.removeCallbacks(this.f168007e);
        GProcessClient.c6().p6(this);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f168008f) {
            q1();
        }
    }

    public final void p1(final Intent intent, String str, final int i10) {
        GProcessClient.c6().n6(this, str, new GProcessClient.d() { // from class: com.prism.hider.ui.V
            @Override // com.prism.gaia.client.GProcessClient.d
            public final void a(GuestProcessInfo guestProcessInfo, GProcessClient.ProcessAction processAction) {
                this.f168153a.s1(intent, i10, guestProcessInfo, processAction);
            }
        });
        this.f168006d.removeCallbacks(this.f168007e);
        this.f168006d.postDelayed(this.f168007e, 10000L);
        C5703m.o().e0(intent, i10);
    }

    public final void q1() {
        try {
            if (this.f168011i != null) {
                unbindService(this.f168011i);
            }
            finish();
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void r1(GuestProcessInfo guestProcessInfo) {
        bindService(E9.c.f(guestProcessInfo.vpid, this.f168004b, -1), new e(), 129);
    }

    public final /* synthetic */ void s1(Intent intent, int i10, final GuestProcessInfo guestProcessInfo, GProcessClient.ProcessAction processAction) {
        String str = f167991n;
        Log.d(str, "action: " + processAction);
        if (processAction == GProcessClient.ProcessAction.starting) {
            runOnUiThread(new Runnable() { // from class: com.prism.hider.ui.S
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168083a.r1(guestProcessInfo);
                }
            });
            return;
        }
        if (processAction == GProcessClient.ProcessAction.shown) {
            Log.d(str, "received guest shown message");
            if (A1()) {
                r6.k kVar = (r6.k) HiderPreferenceUtils.f168352t.a(GaiaContext.j().n());
                kVar.p(Integer.valueOf(((Integer) kVar.o()).intValue() + 1));
                return;
            }
            return;
        }
        if (processAction == GProcessClient.ProcessAction.dead) {
            Log.d(str, "received guest dead message");
            A1();
        } else if (processAction == GProcessClient.ProcessAction.cmd_restart) {
            Log.d(str, "received guest restart command");
            C5703m.o().e0(intent, i10);
        }
    }

    public final /* synthetic */ void t1() {
        Intent intent = (Intent) getIntent().getParcelableExtra("KEY_INTENT");
        int intExtra = getIntent().getIntExtra("KEY_USER", -1);
        String stringExtra = getIntent().getStringExtra("KEY_GUEST_PKG_NAME");
        this.f168003a = stringExtra;
        if (intent == null) {
            return;
        }
        p1(intent, stringExtra, intExtra);
    }

    public final /* synthetic */ void u1() {
        if (isFinishing() || this.f168008f) {
            return;
        }
        try {
            Toast.makeText(this, R.string.text_feedback_failure, 0).show();
        } catch (Throwable unused) {
        }
        A1();
    }

    public final /* synthetic */ void v1(DialogInterface dialogInterface, int i10) {
        n1();
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void w1(DialogInterface dialogInterface) {
        Button buttonF = this.f168012j.f(-2);
        if (buttonF != null) {
            buttonF.setOnClickListener(new b());
        }
    }

    public final void x1() {
        f168002y = false;
        startActivity(new Intent(this, (Class<?>) LoadingActivity.class));
        C4455a.b().a().execute(new Runnable() { // from class: com.prism.hider.ui.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f168057a.t1();
            }
        });
    }

    public final void y1() {
        if (!f168002y) {
            f168002y = true;
            return;
        }
        new LjAdLoader.Builder().withCache(false).withAdListener(new d()).withReportPrefix(a.b.f65588d).build().u(this, new LjAdRequest.Builder(this).setAdPlaceName(a.C0095a.f65581d).build());
        Log.d(f167991n, "loaded ad......");
    }

    public final boolean z1(String str, Integer num) {
        Set<Integer> set;
        HashMap<String, Set<Integer>> map = this.f168015m;
        return (map == null || (set = map.get(str)) == null || !set.contains(num)) ? false : true;
    }
}
