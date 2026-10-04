package com.prism.hider.ui;

import Da.b;
import P9.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC1486c;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.C3840d;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;
import e6.C4367c;
import java.util.ArrayList;
import java.util.List;
import pb.C5404d;

/* JADX INFO: loaded from: classes6.dex */
public class SplashActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f168116h = com.prism.commons.utils.l0.b("SplashActivity");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f168117i = 4000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f168118j = "KEY_DONOT_START_MAIN_ACTIVITY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f168120b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f168122d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f168119a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f168121c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f168123e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IntentFilter f168124f = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f168125g = new d();

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f168126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f168127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f168128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f168129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f168130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextView f168131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f168132g;

        /* JADX INFO: renamed from: com.prism.hider.ui.SplashActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0684a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f168134a;

            public RunnableC0684a(float f10) {
                this.f168134a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f168126a.setProgress((int) this.f168134a);
                a.this.f168128c.setText(((int) this.f168134a) + "%");
                float f10 = this.f168134a;
                a aVar = a.this;
                int size = (int) (f10 / aVar.f168129d);
                if (size >= aVar.f168130e.size()) {
                    size = a.this.f168130e.size() - 1;
                }
                a.this.f168131f.setText((String) a.this.f168130e.get(size));
            }
        }

        public a(ProgressBar progressBar, float f10, TextView textView, float f11, List list, TextView textView2, int i10) {
            this.f168126a = progressBar;
            this.f168127b = f10;
            this.f168128c = textView;
            this.f168129d = f11;
            this.f168130e = list;
            this.f168131f = textView2;
            this.f168132g = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!SplashActivity.this.f168119a) {
                int progress = this.f168126a.getProgress();
                if (progress >= 100) {
                    SplashActivity.this.finish();
                    return;
                }
                SplashActivity.this.runOnUiThread(new RunnableC0684a(progress + this.f168127b));
                try {
                    Thread.sleep(this.f168132g);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class b implements C5404d.c {
        public b() {
        }

        @Override // pb.C5404d.c
        public void onComplete() {
            SplashActivity.this.d1();
        }
    }

    public class c extends T6.a {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f168138a;

            public a(Object obj) {
                this.f168138a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = SplashActivity.f168116h;
                StringBuilder sb2 = new StringBuilder("onAdLoaded, try to show, isPause=");
                sb2.append(SplashActivity.this.f168121c);
                sb2.append(", isDestroyed=");
                sb2.append(SplashActivity.this.isDestroyed());
                SplashActivity splashActivity = SplashActivity.this;
                if (splashActivity.f168121c || splashActivity.isDestroyed()) {
                    P9.b.f().d();
                    String str = SplashActivity.f168116h;
                } else {
                    ((J6.c) this.f168138a).c(SplashActivity.this, null);
                    P9.b.f().j();
                    String str2 = SplashActivity.f168116h;
                }
                SplashActivity.this.f168123e = false;
            }
        }

        public c() {
        }

        @Override // T6.a
        public void b() {
            SplashActivity.Y0(SplashActivity.this);
        }

        @Override // T6.a
        public void c(int i10) {
            SplashActivity.Y0(SplashActivity.this);
        }

        @Override // T6.a
        public void f(Object obj) {
            long j10 = System.currentTimeMillis() - SplashActivity.this.f168122d >= 4000 ? 0L : 4000L;
            SplashActivity.this.f168123e = true;
            new Handler().postDelayed(new a(obj), j10);
        }
    }

    public class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f168140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f168141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f168142c;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (!intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") || (stringExtra = intent.getStringExtra("reason")) == null) {
                return;
            }
            if (stringExtra.equals(b.a.f23037c) || stringExtra.equals(b.a.f23036b)) {
                P9.b.f().e();
                if (!stringExtra.equals(b.a.f23037c)) {
                    String unused = SplashActivity.f168116h;
                } else {
                    String unused2 = SplashActivity.f168116h;
                    SplashActivity.this.finish();
                }
            }
        }

        public d() {
            this.f168140a = "reason";
            this.f168141b = b.a.f23037c;
            this.f168142c = b.a.f23036b;
        }
    }

    public static void Y0(SplashActivity splashActivity) {
        splashActivity.finish();
    }

    public final void b1() {
        finish();
    }

    public final void c1() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public final void d1() {
        J6.f.t(this);
        J6.f.f53216p = com.prism.hider.variant.a.b().a();
        f1();
    }

    public final void e1() {
        C5404d.f().e(getApplicationContext(), new b());
    }

    public final void f1() {
        LjAdLoader ljAdLoaderBuild = new LjAdLoader.Builder().withReportPrefix(a.b.f65585a).withCache(true).withAdListener(new c()).build();
        LjAdRequest ljAdRequestBuild = new LjAdRequest.Builder(getApplicationContext()).setAdPlaceName(a.C0095a.f65578a).build();
        this.f168122d = System.currentTimeMillis();
        ljAdLoaderBuild.u(this, ljAdRequestBuild);
    }

    public final void g1() {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.splash_progress);
        TextView textView = (TextView) findViewById(R.id.splash_progress_percent);
        TextView textView2 = (TextView) findViewById(R.id.splash_progress_status);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.splash_progress_text_1));
        arrayList.add(getString(R.string.splash_progress_text_2));
        arrayList.add(getString(R.string.splash_progress_text_3));
        arrayList.add(getString(R.string.splash_progress_text_4));
        arrayList.add(getString(R.string.splash_progress_text_5));
        arrayList.add(getString(R.string.splash_progress_text_6));
        arrayList.add(getString(R.string.splash_progress_text_7));
        progressBar.setProgress(0);
        new a(progressBar, 100.0f / 100, textView, 100.0f / arrayList.size(), arrayList, textView2, 200).start();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        setContentView(R.layout.hider_activity_splash_with_progress);
        this.f168120b = findViewById(R.id.rr_splash);
        C5404d.f().e(getApplicationContext(), null);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        c1();
        P9.b.f().e();
        finish();
        return true;
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f168121c = true;
        unregisterReceiver(this.f168125g);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        this.f168121c = false;
        super.onResume();
        if (!C4367c.o().u()) {
            this.f168120b.setVisibility(0);
            g1();
            if (!P9.b.f().c() || this.f168123e) {
                finish();
            } else {
                e1();
            }
        }
        C3840d.a(this, this.f168125g, this.f168124f);
    }
}
