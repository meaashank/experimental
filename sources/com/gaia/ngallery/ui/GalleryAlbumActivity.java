package com.gaia.ngallery.ui;

import N4.d;
import N4.l;
import Q4.a;
import Wa.e;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.C2795f0;
import b5.C2811n0;
import b5.C2817q0;
import b5.ProgressDialogC2832y0;
import c5.C2931k;
import c5.C2934n;
import c5.K;
import c5.a0;
import c5.f0;
import c5.i0;
import c5.q0;
import com.bumptech.glide.j;
import com.gaia.ngallery.model.MediaFile;
import com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton;
import com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionsMenu;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.prism.commons.utils.I;
import com.prism.commons.utils.m0;
import com.prism.commons.utils.r;
import com.prism.lib.pfs.file.PrivateFile;
import d5.n;
import d5.o;
import d6.InterfaceC4300a;
import e6.C4366b;
import g6.C4455a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l.AbstractC5126b;

/* JADX INFO: loaded from: classes3.dex */
public class GalleryAlbumActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f150397w = i5.b.g("GalleryAlbumActivity");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f150398x = "ALBUM_ID";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f150399y = "SORT_TYPE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f150400z = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressDialogC2832y0 f150401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CollapsingToolbarLayout f150402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatTextView f150403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f150404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f150405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FloatingActionsMenu f150406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f150407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewGroup f150408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f150409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f150410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f150411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T4.c f150412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SortType f150413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public P4.b f150414n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f150416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GridLayoutManager f150417q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC5126b f150419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC5126b.a f150420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n<MediaFile> f150421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f150422v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f150415o = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f150418r = -1;

    public enum SortType {
        NONE,
        MODIFIED_TIME_ASC,
        MODIFIED_TIME_DSC,
        NAME_ASC,
        NAME_DSC
    }

    public class a implements R4.c<View> {
        public a() {
        }

        @Override // R4.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            GalleryAlbumActivity.this.k2(i10);
        }

        @Override // R4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(View view, int i10) {
            GalleryAlbumActivity.this.f150418r = i10;
            GalleryAlbumActivity galleryAlbumActivity = GalleryAlbumActivity.this;
            AbstractC5126b abstractC5126bStartSupportActionMode = galleryAlbumActivity.startSupportActionMode(galleryAlbumActivity.f150420t);
            Log.d(GalleryAlbumActivity.f150397w, "start action mode:" + abstractC5126bStartSupportActionMode);
        }
    }

    public class b implements AbstractC5126b.a {
        public b() {
        }

        @Override // l.AbstractC5126b.a
        public boolean a(AbstractC5126b abstractC5126b, MenuItem menuItem) {
            if (menuItem.getItemId() != l.h.f61982M5) {
                return true;
            }
            GalleryAlbumActivity.this.f150416p.u();
            return true;
        }

        @Override // l.AbstractC5126b.a
        public boolean b(AbstractC5126b abstractC5126b, Menu menu) {
            GalleryAlbumActivity.this.f150402b.setExpandedTitleTextAppearance(m0.b(GalleryAlbumActivity.this, l.c.f59231C9));
            int iB = m0.b(GalleryAlbumActivity.this, l.c.f59201A9);
            GalleryAlbumActivity galleryAlbumActivity = GalleryAlbumActivity.this;
            galleryAlbumActivity.f150403c.setTextAppearance(galleryAlbumActivity, iB);
            GalleryAlbumActivity.this.f150405e.setVisibility(0);
            GalleryAlbumActivity.this.f150406f.setVisibility(4);
            GalleryAlbumActivity.this.f150407g.setVisibility(0);
            GalleryAlbumActivity galleryAlbumActivity2 = GalleryAlbumActivity.this;
            galleryAlbumActivity2.f150421u = galleryAlbumActivity2.f150416p.n();
            GalleryAlbumActivity.this.f150421u.j(new n.a() { // from class: b5.x0
                @Override // d5.n.a
                public final void a(int i10) {
                    this.f120959a.g(i10);
                }
            });
            GalleryAlbumActivity galleryAlbumActivity3 = GalleryAlbumActivity.this;
            galleryAlbumActivity3.f150416p.s(galleryAlbumActivity3.f150418r);
            GalleryAlbumActivity.this.f150419s = abstractC5126b;
            abstractC5126b.q("0 selected");
            GalleryAlbumActivity.this.getMenuInflater().inflate(l.C0083l.f62749a, menu);
            return true;
        }

        @Override // l.AbstractC5126b.a
        public boolean c(AbstractC5126b abstractC5126b, Menu menu) {
            return true;
        }

        @Override // l.AbstractC5126b.a
        public void d(AbstractC5126b abstractC5126b) {
            GalleryAlbumActivity.this.f150402b.setExpandedTitleTextAppearance(m0.b(GalleryAlbumActivity.this, l.c.f59216B9));
            int iB = m0.b(GalleryAlbumActivity.this, l.c.f59960z9);
            GalleryAlbumActivity galleryAlbumActivity = GalleryAlbumActivity.this;
            galleryAlbumActivity.f150403c.setTextAppearance(galleryAlbumActivity, iB);
            GalleryAlbumActivity.this.f150405e.setVisibility(8);
            GalleryAlbumActivity.this.f150406f.setVisibility(0);
            GalleryAlbumActivity.this.f150407g.setVisibility(8);
            GalleryAlbumActivity.this.f150416p.o();
            GalleryAlbumActivity.this.f150419s = null;
        }

        public boolean f() {
            return GalleryAlbumActivity.this.f150419s != null;
        }

        public final /* synthetic */ void g(int i10) {
            if (i10 == 0) {
                GalleryAlbumActivity galleryAlbumActivity = GalleryAlbumActivity.this;
                galleryAlbumActivity.l2(galleryAlbumActivity.f150408h, false);
                GalleryAlbumActivity galleryAlbumActivity2 = GalleryAlbumActivity.this;
                galleryAlbumActivity2.l2(galleryAlbumActivity2.f150409i, false);
                GalleryAlbumActivity galleryAlbumActivity3 = GalleryAlbumActivity.this;
                galleryAlbumActivity3.l2(galleryAlbumActivity3.f150410j, false);
                GalleryAlbumActivity galleryAlbumActivity4 = GalleryAlbumActivity.this;
                galleryAlbumActivity4.l2(galleryAlbumActivity4.f150411k, false);
                return;
            }
            GalleryAlbumActivity galleryAlbumActivity5 = GalleryAlbumActivity.this;
            galleryAlbumActivity5.l2(galleryAlbumActivity5.f150408h, true);
            GalleryAlbumActivity galleryAlbumActivity6 = GalleryAlbumActivity.this;
            galleryAlbumActivity6.l2(galleryAlbumActivity6.f150409i, true);
            GalleryAlbumActivity galleryAlbumActivity7 = GalleryAlbumActivity.this;
            galleryAlbumActivity7.l2(galleryAlbumActivity7.f150410j, true);
            GalleryAlbumActivity galleryAlbumActivity8 = GalleryAlbumActivity.this;
            galleryAlbumActivity8.l2(galleryAlbumActivity8.f150411k, true);
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
            O4.a.e(GalleryAlbumActivity.this, O4.a.f65165h);
        }
    }

    @Nullable
    public static Comparator<MediaFile> K1(SortType sortType) {
        int iOrdinal = sortType.ordinal();
        if (iOrdinal == 1) {
            return MediaFile.MODIFY_TIME_ASC;
        }
        if (iOrdinal == 2) {
            return MediaFile.MODIFY_TIME_DSC;
        }
        if (iOrdinal == 3) {
            return MediaFile.NAME_ASC;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return MediaFile.NAME_DSC;
    }

    private void N1() {
        this.f150406f = (FloatingActionsMenu) findViewById(l.h.f61875D6);
        this.f150406f.z((FloatingActionButton) findViewById(l.h.f61932I3));
        this.f150406f.z((FloatingActionButton) findViewById(l.h.f61956K3));
        this.f150406f.A(new c());
        findViewById(l.h.f61944J3).setOnClickListener(new View.OnClickListener() { // from class: b5.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120924a.Y1(view);
            }
        });
        findViewById(l.h.f61968L3).setOnClickListener(new View.OnClickListener() { // from class: b5.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120928a.Z1(view);
            }
        });
        findViewById(l.h.f61980M3).setOnClickListener(new View.OnClickListener() { // from class: b5.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120930a.a2(view);
            }
        });
    }

    public static void i2(Activity activity, T4.c cVar) {
        j2(activity, cVar, SortType.MODIFIED_TIME_DSC);
    }

    public static void j2(Activity activity, T4.c cVar, SortType sortType) {
        if (cVar == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) GalleryAlbumActivity.class);
        intent.putExtra(f150398x, cVar.g());
        intent.putExtra(f150399y, sortType.ordinal());
        activity.startActivity(intent);
    }

    public final int J1() {
        return Math.max(4, Math.min(10, Math.round(getResources().getConfiguration().screenWidthDp / 108.0f)));
    }

    public final void L1() {
        this.f150420t = new b();
    }

    public final void M1() {
        this.f150408h.setOnClickListener(new View.OnClickListener() { // from class: b5.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120932a.U1(view);
            }
        });
        this.f150409i.setOnClickListener(new View.OnClickListener() { // from class: b5.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120933a.X1(view);
            }
        });
        this.f150410j.setOnClickListener(new View.OnClickListener() { // from class: b5.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120935a.Q1(view);
            }
        });
        this.f150411k.setOnClickListener(new View.OnClickListener() { // from class: b5.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120938a.T1(view);
            }
        });
    }

    public final /* synthetic */ void O1(Throwable th, String str) {
        this.f150419s.a();
        n2();
    }

    public final /* synthetic */ void P1(List list) {
        this.f150419s.a();
        n2();
    }

    public final void Q1(View view) {
        a0 a0Var = new a0((T4.c) null, this.f150421u.f());
        a0Var.f194863b = new InterfaceC4300a.d() { // from class: b5.s0
            @Override // d6.InterfaceC4300a.d
            public final void a(Throwable th, String str) {
                this.f120949a.O1(th, str);
            }
        };
        a0Var.f194862a = new InterfaceC4300a.e() { // from class: b5.t0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120951a.P1((List) obj);
            }
        };
        a0Var.e(this);
    }

    public final /* synthetic */ void R1(Throwable th, String str) {
        this.f150419s.a();
        n2();
    }

    public final /* synthetic */ void S1(List list) {
        this.f150419s.a();
        n2();
    }

    public final /* synthetic */ void T1(View view) {
        List<MediaFile> listF = this.f150421u.f();
        InterfaceC4300a f0Var = d.m().n(this.f150412l) ? new f0(listF) : new q0(listF);
        f0Var.c(new InterfaceC4300a.d() { // from class: b5.u0
            @Override // d6.InterfaceC4300a.d
            public final void a(Throwable th, String str) {
                this.f120952a.R1(th, str);
            }
        });
        f0Var.a(new InterfaceC4300a.e() { // from class: b5.v0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120955a.S1((List) obj);
            }
        });
        f0Var.e(this);
    }

    public final /* synthetic */ void U1(View view) {
        new i0(this.f150421u.f()).e(this);
    }

    public final /* synthetic */ void V1(Throwable th, String str) {
        this.f150419s.a();
    }

    public final /* synthetic */ void W1(List list) {
        this.f150419s.a();
    }

    public final void X1(View view) {
        K k10 = new K(this.f150421u.f());
        k10.f126219g = true;
        k10.f126220h = false;
        k10.f194863b = new InterfaceC4300a.d() { // from class: b5.w0
            @Override // d6.InterfaceC4300a.d
            public final void a(Throwable th, String str) {
                this.f120958a.V1(th, str);
            }
        };
        k10.f194862a = new InterfaceC4300a.e() { // from class: b5.d0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120914a.W1((List) obj);
            }
        };
        k10.e(this);
    }

    public final /* synthetic */ void Y1(View view) {
        HostImportMainActivity.a1(this, this.f150412l, new C2795f0(this));
        O4.a.l(this);
        this.f150406f.o();
    }

    public final /* synthetic */ void Z1(View view) {
        CameraActivity.l1(this, this.f150412l, new C2795f0(this));
        O4.a.n(this);
        this.f150406f.o();
    }

    public final /* synthetic */ void a2(View view) {
        CameraActivity.k1(this, this.f150412l, new C2795f0(this));
        O4.a.m(this);
        this.f150406f.o();
    }

    public final /* synthetic */ void b2(Boolean bool) {
        m2();
    }

    public final /* synthetic */ void c2(Boolean bool) {
        finish();
    }

    public final /* synthetic */ void d2() {
        this.f150416p.p(this.f150414n.g());
        m2();
    }

    public final /* synthetic */ void e2() {
        synchronized (this.f150415o) {
            try {
                if (this.f150414n == null) {
                    this.f150414n = this.f150412l.F(K1(this.f150413m), false);
                }
                C4455a.b().b().execute(new Runnable() { // from class: b5.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120911a.d2();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f2() {
        String stringExtra = getIntent().getStringExtra(f150398x);
        if (stringExtra == null) {
            stringExtra = d.m().i().g();
        }
        this.f150413m = SortType.MODIFIED_TIME_DSC;
        int intExtra = getIntent().getIntExtra(f150399y, -1);
        if (intExtra >= 0 && intExtra < SortType.values().length) {
            this.f150413m = SortType.values()[intExtra];
        }
        I.b(f150397w, "onCreate, album=%s, sortType=%s", stringExtra, this.f150413m);
        this.f150412l = d.m().e(stringExtra);
        RecyclerView recyclerView = (RecyclerView) findViewById(l.h.f61972L7);
        int iJ1 = J1();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, iJ1);
        this.f150417q = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        o oVar = new o(this, getResources().getDisplayMetrics().widthPixels / iJ1, new a());
        this.f150416p = oVar;
        recyclerView.setAdapter(oVar);
        n2();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        setResult(1);
    }

    public final void g2(int i10, Intent intent) {
        if (i10 != -1) {
            Log.d(f150397w, "updateItems null returned or no RESULT_OK from cameraActivity");
        } else {
            n2();
        }
    }

    public final void h2(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            i5.b.a(f150397w, "onPreviewResult return");
            return;
        }
        ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra(a.h.f65890a);
        if (integerArrayListExtra == null || integerArrayListExtra.size() < 1) {
            return;
        }
        n2();
    }

    public final void k2(int i10) {
        PreviewActivity.G1(this, this.f150412l, i10, new C4366b.a() { // from class: b5.o0
            @Override // e6.C4366b.a
            public final void a(int i11, Intent intent) {
                this.f120942a.h2(i11, intent);
            }
        });
    }

    public final void l2(ViewGroup viewGroup, boolean z10) {
        if (viewGroup.isEnabled() != z10) {
            viewGroup.setEnabled(z10);
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                viewGroup.getChildAt(i10).setEnabled(z10);
            }
        }
    }

    public final void m2() {
        int iH;
        int iP;
        T4.c cVar = this.f150412l;
        j<Drawable> jVarN = null;
        if (cVar != null) {
            iH = cVar.h();
            iP = this.f150412l.p();
            PrivateFile privateFileE = this.f150412l.n();
            if (privateFileE != null) {
                jVarN = d.o(new MediaFile(privateFileE), false, true);
            } else {
                P4.b bVar = this.f150414n;
                if (bVar != null && bVar.k() > 0) {
                    this.f150412l.x(this.f150414n.l(0).getName());
                    this.f150412l.z();
                    jVarN = d.o(new MediaFile(this.f150412l.n()), false, true);
                }
            }
        } else {
            iH = 0;
            iP = 0;
        }
        if (jVarN == null) {
            jVarN = d.n(l.m.f62762f, false);
        }
        T4.c cVar2 = this.f150412l;
        if (cVar2 != null) {
            this.f150402b.setTitle(cVar2.C());
        }
        this.f150403c.setText(getString(l.p.f63105o6, Integer.valueOf(iH), Integer.valueOf(iP)));
        jVarN.v1(this.f150404d);
    }

    public final void n2() {
        if (this.f150412l == null) {
            return;
        }
        P4.b bVar = this.f150414n;
        if (bVar == null) {
            C4455a.b().a().execute(new Runnable() { // from class: b5.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120917a.e2();
                }
            });
            return;
        }
        bVar.p(K1(this.f150413m));
        this.f150416p.p(this.f150414n.g());
        m2();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f150417q != null) {
            int iJ1 = J1();
            this.f150417q.setSpanCount(iJ1);
            o oVar = this.f150416p;
            if (oVar != null) {
                oVar.v(getResources().getDisplayMetrics().widthPixels / iJ1);
            }
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62584G);
        this.f150401a = new ProgressDialogC2832y0(this, l.q.f63349K4);
        L1();
        N1();
        this.f150402b = (CollapsingToolbarLayout) findViewById(l.h.f62062T1);
        this.f150403c = (AppCompatTextView) findViewById(l.h.f62011Oa);
        this.f150404d = (ImageView) findViewById(l.h.f62393t4);
        this.f150405e = findViewById(l.h.f62119Xa);
        View viewFindViewById = findViewById(l.h.f61883E2);
        this.f150407g = viewFindViewById;
        viewFindViewById.setVisibility(8);
        this.f150408h = (ViewGroup) findViewById(l.h.f61913G8);
        this.f150409i = (ViewGroup) findViewById(l.h.f62291l3);
        this.f150410j = (ViewGroup) findViewById(l.h.f62216f6);
        this.f150411k = (ViewGroup) findViewById(l.h.f62225g2);
        M1();
        Toolbar toolbar = (Toolbar) findViewById(l.h.f62168ba);
        setSupportActionBar(toolbar);
        getSupportActionBar().X(true);
        int iF = r.f(this);
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setStatusBarColor(0);
        toolbar.getLayoutParams().height += iF;
        toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop() + iF, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        ((AppBarLayout) findViewById(l.h.f61953K0)).getLayoutParams().height += iF;
        f2();
        e eVar = new e(this);
        this.f150422v = eVar;
        eVar.d();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        P4.e eVarM = d.m();
        if (eVarM.m(this.f150412l) || eVarM.n(this.f150412l)) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(l.C0083l.f62750b, menu);
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        T4.c cVar = this.f150412l;
        if (cVar != null) {
            if (itemId == l.h.f62030Q5) {
                C2934n c2934n = new C2934n(cVar);
                c2934n.f194863b = new C2811n0();
                c2934n.f194862a = new InterfaceC4300a.e() { // from class: b5.p0
                    @Override // d6.InterfaceC4300a.e
                    public final void onSuccess(Object obj) {
                        this.f120944a.m2();
                    }
                };
                c2934n.e(this);
                return true;
            }
            if (itemId == l.h.f62018P5) {
                C2931k c2931k = new C2931k(cVar);
                c2931k.f194863b = new C2817q0();
                c2931k.f194862a = new InterfaceC4300a.e() { // from class: b5.r0
                    @Override // d6.InterfaceC4300a.e
                    public final void onSuccess(Object obj) {
                        this.f120947a.finish();
                    }
                };
                c2931k.e(this);
                return true;
            }
            if (itemId == l.h.f62054S5) {
                SortType sortType = this.f150413m;
                SortType sortType2 = SortType.NAME_ASC;
                if (sortType == sortType2) {
                    this.f150413m = SortType.NAME_DSC;
                } else if (sortType == SortType.NAME_DSC) {
                    this.f150413m = sortType2;
                } else {
                    this.f150413m = sortType2;
                }
                n2();
                return true;
            }
            if (itemId == l.h.f62042R5) {
                SortType sortType3 = this.f150413m;
                SortType sortType4 = SortType.MODIFIED_TIME_DSC;
                if (sortType3 == sortType4) {
                    this.f150413m = SortType.MODIFIED_TIME_ASC;
                } else if (sortType3 == SortType.MODIFIED_TIME_ASC) {
                    this.f150413m = sortType4;
                } else {
                    this.f150413m = sortType4;
                }
                n2();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f150422v.e();
    }
}
