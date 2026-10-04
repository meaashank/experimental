package com.gaia.ngallery.ui;

import N4.d;
import N4.l;
import Q4.a;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b5.C2785a0;
import c5.C2926f;
import c5.C2931k;
import c5.C2934n;
import c5.T;
import com.gaia.ngallery.ui.GalleryActivity;
import com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton;
import com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionsMenu;
import com.prism.commons.utils.C3845i;
import com.prism.commons.utils.r0;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;
import com.prism.lib.pfs.file.exchange.MediaStoreExchangeFile;
import d6.InterfaceC4300a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o6.f;

/* JADX INFO: loaded from: classes3.dex */
public class GalleryActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f150380i = i5.b.g("GalleryActivity");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f150381j = "KEY_SHOW_PROVERSION_AD";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwipeRefreshLayout f150382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Toolbar f150383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f150384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I f150385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d5.c f150386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Wa.e f150387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f150388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GridLayoutManager f150389h;

    public class a implements R4.c<View> {
        public a() {
        }

        @Override // R4.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            GalleryActivity.this.I1(N4.d.m().g(i10));
        }

        @Override // R4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(View view, int i10) {
            GalleryActivity.this.G1(view, N4.d.m().g(i10));
        }
    }

    public class b implements d.f {
        public b() {
        }

        @Override // N4.d.f
        public void a(String str) {
            r0.g(GalleryActivity.this, str, 1);
        }

        @Override // N4.d.f
        public void b(P4.e eVar) {
            GalleryActivity.this.f150382a.D(false);
            GalleryActivity.this.f150386e.j(N4.d.m().k());
        }
    }

    public class c implements FloatingActionsMenu.d {
        public c() {
        }

        @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionsMenu.d
        public void a() {
        }

        @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionsMenu.d
        public void b() {
            O4.a.e(GalleryActivity.this, O4.a.f65164g);
        }
    }

    public class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatingActionsMenu f150393a;

        public d(FloatingActionsMenu floatingActionsMenu) {
            this.f150393a = floatingActionsMenu;
        }

        @Override // o6.f
        public void a(String str) {
            r0.g(GalleryActivity.this, str, 1);
        }

        @Override // o6.f
        public void onSuccess() {
            GalleryActivity.this.K1();
            this.f150393a.o();
        }
    }

    public class e implements d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f150395a;

        public e(Intent intent) {
            this.f150395a = intent;
        }

        @Override // N4.d.f
        public void a(String str) {
            GalleryActivity galleryActivity = GalleryActivity.this;
            r0.g(galleryActivity, galleryActivity.getString(l.p.f62898P1), 1);
        }

        @Override // N4.d.f
        public void b(P4.e eVar) {
            ArrayList parcelableArrayListExtra;
            if (this.f150395a.getBooleanExtra(GalleryActivity.f150381j, false)) {
                GalleryActivity.this.O1();
            }
            GalleryActivity.this.K1();
            int intExtra = this.f150395a.getIntExtra(a.c.f65884m, 10);
            if (intExtra == 4) {
                GalleryActivity.this.P1();
                return;
            }
            if (intExtra == 3) {
                GalleryActivity.this.J1();
                return;
            }
            String action = this.f150395a.getAction();
            if ("android.intent.action.SEND".equals(action)) {
                Uri uri = (Uri) this.f150395a.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    GalleryActivity.this.t1(C3845i.b(uri));
                    return;
                }
                return;
            }
            if (!"android.intent.action.SEND_MULTIPLE".equals(action) || (parcelableArrayListExtra = this.f150395a.getParcelableArrayListExtra("android.intent.extra.STREAM")) == null || parcelableArrayListExtra.size() <= 0) {
                return;
            }
            GalleryActivity.this.t1(parcelableArrayListExtra);
        }
    }

    public static /* synthetic */ void X0(Throwable th, String str) {
    }

    public static /* synthetic */ boolean c1(GalleryActivity galleryActivity, T4.c cVar, MenuItem menuItem) {
        galleryActivity.D1(cVar, menuItem);
        return true;
    }

    public static /* synthetic */ void x1(Throwable th, String str) {
    }

    public final /* synthetic */ void A1(FloatingActionsMenu floatingActionsMenu, View view) {
        J1();
        floatingActionsMenu.o();
    }

    public final /* synthetic */ void B1(FloatingActionsMenu floatingActionsMenu, View view) {
        p1();
        floatingActionsMenu.o();
    }

    public final /* synthetic */ void C1(FloatingActionsMenu floatingActionsMenu, View view) {
        N4.d.e(this, new d(floatingActionsMenu));
    }

    public final /* synthetic */ boolean D1(T4.c cVar, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == l.h.f62018P5) {
            L1(cVar);
            return true;
        }
        if (itemId != l.h.f62030Q5) {
            return true;
        }
        M1(cVar);
        return true;
    }

    public final /* synthetic */ void E1(T4.c cVar, Boolean bool) {
        if (bool.booleanValue()) {
            this.f150386e.l(cVar);
            N1();
        }
    }

    public final /* synthetic */ void F1(T4.c cVar, Boolean bool) {
        if (bool.booleanValue()) {
            this.f150386e.k(cVar);
        }
    }

    public final void G1(View view, final T4.c cVar) {
        P4.e eVarM = N4.d.m();
        if (eVarM.m(cVar) || eVarM.n(cVar)) {
            return;
        }
        I i10 = new I(this, view, 0);
        this.f150385d = i10;
        i10.e().inflate(l.C0083l.f62753e, this.f150385d.d());
        this.f150385d.k(new I.e() { // from class: b5.Y
            @Override // androidx.appcompat.widget.I.e
            public final boolean onMenuItemClick(MenuItem menuItem) {
                GalleryActivity.c1(this.f120897a, cVar, menuItem);
                return true;
            }
        });
        this.f150385d.l();
    }

    public final void H1() {
        new LjAdLoader.Builder().withCache(true).withReportPrefix(a.b.f65871b).build().u(this, new LjAdRequest.Builder(this).setAdPlaceName(a.C0099a.f65868b).build());
    }

    public final void I1(T4.c cVar) {
        GalleryAlbumActivity.i2(this, cVar);
        J6.a.f().h(a.C0099a.f65868b, getApplicationContext(), null);
        O4.a.b(this);
    }

    public final void J1() {
        CameraActivity.k1(this, N4.d.m().i(), null);
        O4.a.m(this);
    }

    public final void K1() {
        Log.d(f150380i, "REFRESH ===================================");
        this.f150382a.D(true);
        N4.d.z(this, new b());
    }

    public final void L1(final T4.c cVar) {
        C2931k c2931k = new C2931k(cVar);
        c2931k.f194862a = new InterfaceC4300a.e() { // from class: b5.S
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120877a.E1(cVar, (Boolean) obj);
            }
        };
        c2931k.e(this);
    }

    public final void M1(final T4.c cVar) {
        C2934n c2934n = new C2934n(cVar);
        c2934n.f194862a = new InterfaceC4300a.e() { // from class: b5.Z
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120900a.F1(cVar, (Boolean) obj);
            }
        };
        c2934n.e(this);
    }

    public final void N1() {
        if (N4.d.m().h() == 0) {
            this.f150384c.setVisibility(0);
        } else {
            this.f150384c.setVisibility(8);
        }
    }

    public final void O1() {
        startActivity(new Intent(this, (Class<?>) StandaloneVersionAdActivity.class));
    }

    public final void P1() {
        CameraActivity.l1(this, N4.d.m().i(), null);
        O4.a.n(this);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        GridLayoutManager gridLayoutManager = this.f150389h;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(q1());
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62580F);
        this.f150382a = (SwipeRefreshLayout) findViewById(l.h.f61984M7);
        this.f150383b = (Toolbar) findViewById(l.h.f62168ba);
        this.f150384c = findViewById(l.h.f61931I2);
        this.f150388g = (FrameLayout) findViewById(l.h.f61848B3);
        setSupportActionBar(this.f150383b);
        getSupportActionBar().X(true);
        getSupportActionBar().y0(l.p.f63063j4);
        RecyclerView recyclerView = (RecyclerView) findViewById(l.h.f61972L7);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, q1());
        this.f150389h = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        d5.c cVar = new d5.c(this, new a());
        this.f150386e = cVar;
        recyclerView.setAdapter(cVar);
        this.f150382a.r(-16711936, -256, -65536);
        this.f150382a.x(new SwipeRefreshLayout.j() { // from class: b5.P
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                this.f120875a.K1();
            }
        });
        Wa.e eVar = new Wa.e(this);
        this.f150387f = eVar;
        eVar.d();
        u1();
        r1(getIntent());
        this.f150388g.setVisibility(4);
        H1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!N4.d.l().h() || N4.d.f59078h.g()) {
            getMenuInflater().inflate(l.C0083l.f62751c, menu);
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(l.C0083l.f62752d, menu);
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        r1(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId == l.h.f62353q0) {
            O4.a.j(this);
            O1();
            return true;
        }
        if (itemId != l.h.f62249i0) {
            return true;
        }
        N4.d.g(this);
        return true;
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f150387f.e();
        this.f150386e.j(N4.d.m().k());
    }

    public final void p1() {
        C2926f c2926f = new C2926f();
        c2926f.f194862a = new InterfaceC4300a.e() { // from class: b5.Q
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120876a.v1((T4.c) obj);
            }
        };
        c2926f.e(this);
        O4.a.k(this);
    }

    public final int q1() {
        return Math.max(2, Math.min(6, Math.round(getResources().getConfiguration().screenWidthDp / 190.0f)));
    }

    public final void r1(Intent intent) {
        N4.d.y(this, new e(intent));
    }

    public final void s1() {
        HostImportMainActivity.a1(this, null, null);
        O4.a.l(this);
    }

    public final void t1(List<Uri> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MediaStoreExchangeFile(it.next()));
        }
        T t10 = new T((T4.c) null, getString(l.p.f62794C1), arrayList);
        t10.f194863b = new C2785a0();
        t10.f194862a = new InterfaceC4300a.e() { // from class: b5.b0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120908a.w1((List) obj);
            }
        };
        t10.e(this);
    }

    public final void u1() {
        boolean zSupportChangeMountPath = N4.d.r().supportChangeMountPath();
        final FloatingActionsMenu floatingActionsMenu = (FloatingActionsMenu) findViewById(l.h.f61875D6);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(l.h.f61956K3);
        if (!zSupportChangeMountPath && floatingActionButton != null) {
            floatingActionsMenu.z(floatingActionButton);
        }
        floatingActionsMenu.A(new c());
        findViewById(l.h.f61944J3).setOnClickListener(new View.OnClickListener() { // from class: b5.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120880a.y1(floatingActionsMenu, view);
            }
        });
        findViewById(l.h.f61968L3).setOnClickListener(new View.OnClickListener() { // from class: b5.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120883a.z1(floatingActionsMenu, view);
            }
        });
        findViewById(l.h.f61980M3).setOnClickListener(new View.OnClickListener() { // from class: b5.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120886a.A1(floatingActionsMenu, view);
            }
        });
        findViewById(l.h.f61932I3).setOnClickListener(new View.OnClickListener() { // from class: b5.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120889a.B1(floatingActionsMenu, view);
            }
        });
        if (!zSupportChangeMountPath || floatingActionButton == null) {
            return;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: b5.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120892a.C1(floatingActionsMenu, view);
            }
        });
    }

    public final /* synthetic */ void v1(T4.c cVar) {
        this.f150386e.j(N4.d.m().k());
    }

    public final /* synthetic */ void w1(List list) {
        this.f150386e.j(N4.d.m().k());
    }

    public final /* synthetic */ void y1(FloatingActionsMenu floatingActionsMenu, View view) {
        s1();
        floatingActionsMenu.o();
    }

    public final /* synthetic */ void z1(FloatingActionsMenu floatingActionsMenu, View view) {
        P1();
        floatingActionsMenu.o();
    }
}
