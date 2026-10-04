package com.prism.gaia.ui;

import N9.D;
import U6.o;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.prism.commons.utils.H;
import com.prism.commons.utils.l0;
import g6.C4455a;
import g6.d;
import v8.C5715y;

/* JADX INFO: loaded from: classes6.dex */
public class RunningProcessesActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f167729c = l0.b("RunningProcessesActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRefreshLayout f167730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f167731b;

    public class a implements d.a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            RunningProcessesActivity.this.f167730a.D(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            RunningProcessesActivity.this.f167730a.D(true);
        }

        @Override // g6.d.a
        public void onConnected() {
            C4455a.b().b().execute(new Runnable() { // from class: N9.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64835a.c();
                }
            });
        }

        @Override // g6.d.a
        public void onDisconnected() {
            C4455a.b().b().execute(new Runnable() { // from class: N9.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64836a.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0() {
        this.f167730a.D(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        this.f167730a.D(true);
        C4455a.b().a().execute(new Runnable() { // from class: N9.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f64924a.a1();
            }
        });
    }

    public final /* synthetic */ void a1() {
        this.f167731b.H();
        C4455a.b().b().execute(new Runnable() { // from class: N9.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f64834a.Z0();
            }
        });
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
        setContentView(o.k.f71900G);
        Toolbar toolbar = (Toolbar) findViewById(o.h.f71703o7);
        this.f167730a = (SwipeRefreshLayout) findViewById(o.h.f71764v5);
        this.f167731b = new D(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().X(true);
        this.f167730a.r(-16711936, -256, -65536);
        this.f167730a.x(new SwipeRefreshLayout.j() { // from class: N9.x
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                this.f64923a.b1();
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(o.h.f71755u5);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(this.f167731b);
        this.f167730a.D(true);
        this.f167731b.N(new a());
        this.f167731b.w();
        C5715y.a().e();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f167731b.x();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }
}
