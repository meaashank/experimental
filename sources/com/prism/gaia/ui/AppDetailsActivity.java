package com.prism.gaia.ui;

import N9.j;
import N9.q;
import N9.t;
import U6.c;
import U6.o;
import Z6.g;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.media.f;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c6.C2947b;
import com.prism.commons.utils.C3854s;
import com.prism.commons.utils.H;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.stub.FileProviderHost;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GInstallProgress;
import com.prism.gaia.remote.GuestAppInfo;
import g6.C4455a;
import g6.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class AppDetailsActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f167719i = l0.b("AppDetailsActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRefreshLayout f167720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f167721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GuestAppInfo f167722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<String> f167723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f167724e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f167725f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AlertDialog f167726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressDialog f167727h;

    public class a implements d.a {
        public a() {
        }

        public final /* synthetic */ void c() {
            AppDetailsActivity.this.f167720a.D(false);
        }

        public final /* synthetic */ void d() {
            AppDetailsActivity.this.f167720a.D(true);
        }

        @Override // g6.d.a
        public void onConnected() {
            C4455a.b().b().execute(new Runnable() { // from class: N9.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64894a.c();
                }
            });
        }

        @Override // g6.d.a
        public void onDisconnected() {
            C4455a.b().b().execute(new Runnable() { // from class: N9.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64893a.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D1() {
        this.f167720a.D(true);
        C4455a.b().a().execute(new Runnable() { // from class: N9.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f64889a.v1();
            }
        });
    }

    public static /* synthetic */ void e1(DialogInterface dialogInterface, int i10) {
    }

    public static /* synthetic */ void q1(DialogInterface dialogInterface, int i10) {
    }

    public final /* synthetic */ void A1(DialogInterface dialogInterface, int i10) {
        l1();
    }

    public final /* synthetic */ void B1(final GuestAppInfo guestAppInfo, DialogInterface dialogInterface, int i10) {
        final String str = this.f167723d.get(this.f167724e);
        if (str.equals(guestAppInfo.spacePkgName)) {
            l1();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getString(o.n.f72289u1));
        builder.setPositiveButton(getString(C2947b.m.f129670v2), new DialogInterface.OnClickListener() { // from class: N9.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i11) {
                this.f64884a.n1(guestAppInfo, str);
            }
        });
        builder.setNegativeButton(getString(C2947b.m.f129666u2), new DialogInterface.OnClickListener() { // from class: N9.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i11) {
                this.f64887a.l1();
            }
        });
        builder.show();
    }

    public final /* synthetic */ void C1(DialogInterface dialogInterface, int i10) {
        l1();
    }

    public void E1(final GuestAppInfo guestAppInfo) {
        AlertDialog alertDialog = this.f167726g;
        if (alertDialog == null) {
            this.f167724e = -1;
        } else {
            alertDialog.dismiss();
            this.f167726g = null;
        }
        GuestAppInfo guestAppInfo2 = this.f167722c;
        if (guestAppInfo2 != null && !guestAppInfo2.packageName.equals(guestAppInfo.packageName)) {
            this.f167725f = -1;
        }
        this.f167722c = guestAppInfo;
        I.b(f167719i, "guestAppInfo.spacePkgName: %s", guestAppInfo.spacePkgName);
        int i10 = this.f167725f;
        String str = i10 >= 0 ? this.f167723d.get(i10) : null;
        c.a aVarB = c.b(guestAppInfo.betterSpacePkgName);
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        if (aVarB.f68731b == c.f68697c) {
            hashSet.add("com.app.hider.master.promax");
        }
        hashSet.add(guestAppInfo.spacePkgName);
        hashSet.add(guestAppInfo.betterSpacePkgName);
        hashSet.addAll(this.f167721b.u(aVarB.f68731b));
        hashSet.addAll(a7.c.g(aVarB.f68731b));
        ArrayList<String> arrayList3 = new ArrayList<>(hashSet);
        this.f167723d = arrayList3;
        Collections.sort(arrayList3, new q());
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < this.f167723d.size(); i13++) {
            String str2 = this.f167723d.get(i13);
            c.a aVarB2 = c.b(str2);
            boolean zD = g.B().D(str2);
            if (zD && str2.equals(str)) {
                this.f167724e = i13;
                this.f167725f = -1;
            }
            if (this.f167724e < 0 && str2.equals(guestAppInfo.spacePkgName)) {
                this.f167724e = i13;
            }
            int i14 = aVarB2.f68732c;
            if (i14 <= guestAppInfo.targetSdkVersion && i14 > i11) {
                i12 = i13;
                i11 = i14;
            }
            arrayList.add(Boolean.valueOf(zD));
            arrayList2.add(aVarB2);
        }
        final RadioGroup radioGroup = new RadioGroup(this);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        radioGroup.setPadding(48, 24, 24, 24);
        for (int i15 = 0; i15 < this.f167723d.size(); i15++) {
            boolean zBooleanValue = ((Boolean) arrayList.get(i15)).booleanValue();
            String strA = ((c.a) arrayList2.get(i15)).a(this);
            if (i12 >= 0 && i15 == i12) {
                StringBuilder sbA = f.a(strA, " (");
                sbA.append(getString(o.n.f72238l4));
                sbA.append(")");
                strA = sbA.toString();
            }
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(i15);
            radioButton.setText(strA);
            radioButton.setTextSize(16.0f);
            radioButton.setPadding(0, 16, 0, 16);
            if (!zBooleanValue) {
                radioButton.setTextColor(-7829368);
            }
            radioGroup.addView(radioButton, layoutParams);
        }
        int i16 = this.f167724e;
        if (i16 >= 0) {
            ((RadioButton) radioGroup.getChildAt(i16)).setChecked(true);
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: N9.b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i17) {
                this.f64866a.y1(arrayList, radioGroup, radioGroup2, i17);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(o.n.f72095M4);
        builder.setPositiveButton(getString(C2947b.m.f129670v2), new DialogInterface.OnClickListener() { // from class: N9.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                this.f64869a.B1(guestAppInfo, dialogInterface, i17);
            }
        });
        builder.setNegativeButton(getString(C2947b.m.f129666u2), new DialogInterface.OnClickListener() { // from class: N9.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                this.f64871a.l1();
            }
        });
        builder.setView(radioGroup);
        this.f167726g = builder.show();
    }

    public final void l1() {
        this.f167722c = null;
        this.f167726g = null;
        this.f167727h = null;
    }

    public final void m1() {
        l1();
    }

    public final void n1(final GuestAppInfo guestAppInfo, final String str) {
        final ApkInfo apkInfo = guestAppInfo.getApkInfo();
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f167727h = progressDialog;
        progressDialog.setTitle(apkInfo.getName());
        this.f167727h.setMessage(getString(o.n.f72283t1));
        this.f167727h.setMax(100);
        this.f167727h.setProgressStyle(1);
        this.f167727h.show();
        ((g6.t) C4455a.b().f()).execute(new Runnable() { // from class: N9.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f64872a.s1(guestAppInfo, str, apkInfo);
            }
        });
    }

    public final /* synthetic */ void o1(GuestAppInfo guestAppInfo) {
        ProgressDialog progressDialog;
        while (true) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
            }
            if (this.f167727h == null) {
                return;
            }
            GInstallProgress gInstallProgressF = C5842a.m().f(guestAppInfo.packageName);
            if (gInstallProgressF != null && (progressDialog = this.f167727h) != null) {
                final double virtualProgress = gInstallProgressF.getVirtualProgress(((double) progressDialog.getProgress()) / 100.0d);
                C4455a.b().b().execute(new Runnable() { // from class: N9.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64891a.t1(virtualProgress);
                    }
                });
            }
        }
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H.a(this);
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        H.a(this);
        setContentView(o.k.f71892C);
        Toolbar toolbar = (Toolbar) findViewById(o.h.f71703o7);
        this.f167720a = (SwipeRefreshLayout) findViewById(o.h.f71764v5);
        this.f167721b = new t(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().X(true);
        this.f167720a.r(-16711936, -256, -65536);
        this.f167720a.x(new SwipeRefreshLayout.j() { // from class: N9.m
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                this.f64888a.D1();
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(o.h.f71755u5);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(this.f167721b);
        this.f167720a.D(true);
        this.f167721b.H(new a());
        this.f167721b.r();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l1();
        this.f167721b.s();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = f167719i;
        Integer numValueOf = Integer.valueOf(this.f167725f);
        GuestAppInfo guestAppInfo = this.f167722c;
        I.b(str, "onResume(): targetIndex=%d, guestAppInfo=%s", numValueOf, guestAppInfo == null ? "NULL" : guestAppInfo.packageName);
        GuestAppInfo guestAppInfo2 = this.f167722c;
        if (guestAppInfo2 != null) {
            E1(guestAppInfo2);
        }
    }

    public final /* synthetic */ void p1() {
        Toast.makeText(this, getString(o.n.f72241m1), 1).show();
    }

    public final /* synthetic */ void r1(ApkInfo apkInfo, AppProceedInfo appProceedInfo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(apkInfo.getName());
        builder.setMessage(appProceedInfo.msg);
        builder.setPositiveButton(getString(C2947b.m.f129670v2), new j());
        builder.show();
    }

    public final void s1(final GuestAppInfo guestAppInfo, String str, final ApkInfo apkInfo) {
        C5842a.m().q(guestAppInfo.packageName, str);
        ((g6.t) C4455a.b().f()).execute(new Runnable() { // from class: N9.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f64876a.o1(guestAppInfo);
            }
        });
        final AppProceedInfo appProceedInfoP = C5842a.f241112c.p(guestAppInfo.packageName);
        if (appProceedInfoP.isSuccess()) {
            C4455a.b.f202252a.b().execute(new Runnable() { // from class: N9.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64878a.p1();
                }
            });
            this.f167721b.D();
        } else {
            C4455a.b.f202252a.b().execute(new Runnable() { // from class: N9.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64879a.r1(apkInfo, appProceedInfoP);
                }
            });
        }
        if (this.f167722c.packageName.equals(guestAppInfo.packageName)) {
            try {
                ProgressDialog progressDialog = this.f167727h;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                AlertDialog alertDialog = this.f167726g;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            } catch (Throwable unused2) {
            }
            l1();
        }
    }

    public final /* synthetic */ void t1(double d10) {
        try {
            this.f167727h.setProgress((int) (d10 * 100.0d));
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void u1() {
        this.f167720a.D(false);
    }

    public final /* synthetic */ void v1() {
        this.f167721b.D();
        l1();
        C4455a.b().b().execute(new Runnable() { // from class: N9.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f64890a.u1();
            }
        });
    }

    public final /* synthetic */ void w1(RadioGroup radioGroup, DialogInterface dialogInterface, int i10) {
        String strC = a7.c.c(this.f167723d.get(this.f167725f));
        if (strC == null) {
            this.f167725f = -1;
            ((RadioButton) radioGroup.getChildAt(this.f167724e)).setChecked(true);
        } else {
            C3854s.d(this, FileProviderHost.c(this), strC, true);
            Toast.makeText(this, getString(o.n.f72253o1), 1).show();
        }
    }

    public final /* synthetic */ void x1(RadioGroup radioGroup, DialogInterface dialogInterface, int i10) {
        this.f167725f = -1;
        ((RadioButton) radioGroup.getChildAt(this.f167724e)).setChecked(true);
    }

    public final /* synthetic */ void y1(ArrayList arrayList, final RadioGroup radioGroup, RadioGroup radioGroup2, int i10) {
        this.f167725f = i10;
        if (((Boolean) arrayList.get(i10)).booleanValue()) {
            this.f167724e = this.f167725f;
            this.f167725f = -1;
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getString(o.n.f72247n1));
        builder.setPositiveButton(getString(C2947b.m.f129670v2), new DialogInterface.OnClickListener() { // from class: N9.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f64864a.w1(radioGroup, dialogInterface, i11);
            }
        });
        builder.setNegativeButton(getString(C2947b.m.f129666u2), new DialogInterface.OnClickListener() { // from class: N9.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f64882a.x1(radioGroup, dialogInterface, i11);
            }
        });
        builder.show();
    }

    public final /* synthetic */ void z1(GuestAppInfo guestAppInfo, String str, DialogInterface dialogInterface, int i10) {
        n1(guestAppInfo, str);
    }
}
