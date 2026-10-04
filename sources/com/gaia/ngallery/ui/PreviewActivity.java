package com.gaia.ngallery.ui;

import N4.d;
import N4.l;
import Q4.a;
import T4.c;
import Wa.e;
import ab.C1465b;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.D;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import b5.O0;
import b5.P0;
import b5.Q0;
import b5.R0;
import b5.a1;
import c5.K;
import c5.a0;
import c5.f0;
import c5.i0;
import c5.q0;
import com.gaia.ngallery.model.MediaFile;
import com.google.android.material.appbar.AppBarLayout;
import com.prism.commons.utils.r;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.ui.VideoPlayActivity;
import com.prism.lib.pfs.ui.pager.preview.PreviewItemView;
import d6.InterfaceC4300a;
import e6.C4366b;
import e6.C4367c;
import i5.C4555a;
import i5.b;
import java.util.ArrayList;
import java.util.List;
import t1.C5596a;
import z6.InterfaceC5860b;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewActivity extends ActivityC1486c implements InterfaceC5860b<ExchangeFile> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f150436q = b.g("PreviewActivity");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f150437r = "CURRENT_ALBUM_ID";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f150438s = "CURRENT_POSITION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f150439a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P4.b f150441c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f150443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f150444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f150445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f150446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppBarLayout f150447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f150448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f150449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewPager f150450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f150451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f150452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1465b f150453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f150454p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f150440b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<Integer> f150442d = new ArrayList<>();

    public class a extends ViewPager.l {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            PreviewActivity.this.k1(i10);
        }
    }

    public static void G1(@NonNull ActivityC1486c activityC1486c, c cVar, int i10, @Nullable C4366b.a aVar) {
        Intent intent = new Intent(activityC1486c, (Class<?>) PreviewActivity.class);
        intent.putExtra(f150437r, cVar.g());
        intent.putExtra(f150438s, i10);
        C4367c.o().x(activityC1486c, intent, aVar);
    }

    public static /* synthetic */ void V0() {
    }

    public static /* synthetic */ void b1() {
    }

    public static /* synthetic */ void c1(List list) {
    }

    public static /* synthetic */ void t1(List list) {
    }

    public static /* synthetic */ void x1() {
    }

    public static /* synthetic */ void y1() {
    }

    public final /* synthetic */ void A1(View view) {
        j1(this.f150453o.c(this.f150440b));
    }

    public final /* synthetic */ void B1(View view) {
        i1(p1(this.f150440b));
    }

    public final /* synthetic */ void C1(View view) {
        m1(this.f150453o.c(this.f150440b));
    }

    public final /* synthetic */ void D1(View view) {
        n1(p1(this.f150440b));
    }

    @Override // z6.InterfaceC5860b
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public void R(int i10, ExchangeFile exchangeFile, int i11, Object[] objArr) {
        if (i11 == 1) {
            k1(i10);
            return;
        }
        if (i11 == 2) {
            if (this.f150449k) {
                q1();
            }
        } else if (i11 == 3) {
            J1();
        } else {
            if (i11 != 10) {
                return;
            }
            F1(i10, exchangeFile);
        }
    }

    public final void F1(int i10, ExchangeFile exchangeFile) {
        ExchangeFile item;
        PreviewItemView previewItemViewC = this.f150453o.c(i10);
        if (previewItemViewC == null || (item = previewItemViewC.getItem()) == null || !item.equals(exchangeFile)) {
            return;
        }
        ImageView imageViewC = previewItemViewC.c();
        Da.b.k(this, VideoPlayActivity.V0(this, exchangeFile, imageViewC.getWidth() > imageViewC.getHeight() ? 2 : 1, true), imageViewC);
    }

    public final void H1(boolean z10) {
        this.f150452n = z10;
        K1();
        this.f150453o.g(z10);
    }

    public final void I1() {
        b.c(f150436q, "show animation");
        this.f150448j.startAnimation(this.f150443e);
        this.f150448j.setVisibility(0);
        this.f150447i.startAnimation(this.f150445g);
        this.f150447i.setVisibility(0);
        this.f150449k = true;
    }

    public final void J1() {
        if (this.f150449k) {
            q1();
        } else {
            I1();
        }
    }

    public final void K1() {
        if (!d.u(this.f150453o.a(this.f150440b).getType()) || this.f150452n) {
            this.f150451m.setVisibility(8);
        } else {
            this.f150451m.setVisibility(0);
        }
    }

    public final void i1(MediaFile mediaFile) {
        if (mediaFile == null) {
            return;
        }
        K k10 = new K(mediaFile);
        k10.f126219g = true;
        k10.f126220h = false;
        k10.f194862a = new O0();
        k10.e(this);
    }

    public final void j1(final PreviewItemView previewItemView) {
        if (previewItemView == null) {
            return;
        }
        final int iE = previewItemView.e();
        a0 a0Var = new a0((c) null, (MediaFile) previewItemView.getItem());
        a0Var.f194863b = new InterfaceC4300a.d() { // from class: b5.Y0
            @Override // d6.InterfaceC4300a.d
            public final void a(Throwable th, String str) {
                this.f120899a.u1(th, str);
            }
        };
        a0Var.f194862a = new InterfaceC4300a.e() { // from class: b5.Z0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120902a.v1(iE, previewItemView, (List) obj);
            }
        };
        a0Var.e(this);
    }

    public final void k1(int i10) {
        C5596a.a("doPageSelected pos:", i10, f150436q);
        this.f150440b = this.f150453o.d(i10);
        setTitle((this.f150440b + 1) + " / " + this.f150453o.getCount());
        K1();
    }

    public final void l1(final PreviewItemView previewItemView) {
        if (previewItemView == null) {
            return;
        }
        final int iE = previewItemView.e();
        MediaFile mediaFile = (MediaFile) previewItemView.getItem();
        InterfaceC4300a f0Var = d.m().n(this.f150439a) ? new f0(mediaFile) : new q0(mediaFile);
        f0Var.a(new InterfaceC4300a.e() { // from class: b5.X0
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f120894a.w1(iE, previewItemView, (List) obj);
            }
        });
        f0Var.e(this);
    }

    public final void m1(PreviewItemView previewItemView) {
        if (previewItemView == null) {
            return;
        }
        ImageView imageViewC = previewItemView.c();
        if (D.a(imageViewC)) {
            ((AttachPhotoView) imageViewC).d().g0(90.0f);
        }
    }

    public final void n1(MediaFile mediaFile) {
        if (mediaFile == null) {
            return;
        }
        Log.d(f150436q, "doShare file:" + mediaFile.getType());
        i0 i0Var = new i0(mediaFile);
        i0Var.f194865d = new a1();
        i0Var.f194866e = new P0();
        i0Var.f194863b = new Q0();
        i0Var.f194862a = new R0();
        i0Var.e(this);
    }

    public final void o1() {
        if (this.f150442d.size() == 0) {
            setResult(0);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                intent.putExtra(a.h.f65890a, this.f150442d);
            }
            setResult(-1, intent);
        }
        finish();
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onBackPressed() {
        o1();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62594J);
        String stringExtra = getIntent().getStringExtra(f150437r);
        this.f150440b = getIntent().getIntExtra(f150438s, -1);
        c cVarE = d.m().e(stringExtra);
        this.f150439a = cVarE;
        if (cVarE == null) {
            finish();
            return;
        }
        P4.b bVarF = cVarE.f();
        this.f150441c = bVarF;
        if (bVarF == null) {
            this.f150441c = this.f150439a.F(null, false);
        }
        ArrayList<MediaFile> arrayListG = this.f150441c.g();
        Toolbar toolbar = (Toolbar) findViewById(l.h.f62168ba);
        setSupportActionBar(toolbar);
        getSupportActionBar().X(true);
        int iF = r.f(this);
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setStatusBarColor(0);
        toolbar.getLayoutParams().height += iF;
        toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop() + iF, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        this.f150443e = AnimationUtils.loadAnimation(this, l.a.f59139m);
        this.f150444f = AnimationUtils.loadAnimation(this, l.a.f59140n);
        this.f150445g = AnimationUtils.loadAnimation(this, l.a.f59143q);
        this.f150446h = AnimationUtils.loadAnimation(this, l.a.f59144r);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(l.h.f61953K0);
        this.f150447i = appBarLayout;
        appBarLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(l.h.f61859C2);
        this.f150448j = linearLayout;
        linearLayout.setVisibility(8);
        this.f150450l = (ViewPager) findViewById(l.h.f62182cb);
        s1(arrayListG);
        e eVar = new e(this);
        this.f150454p = eVar;
        eVar.d();
        H1(C4555a.a(this));
        I1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(l.C0083l.f62754f, menu);
        menu.findItem(l.h.f61994N5).setChecked(this.f150452n);
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
            o1();
        } else if (itemId == l.h.f61994N5) {
            boolean z10 = !menuItem.isChecked();
            C4555a.f(this, z10);
            H1(z10);
            menuItem.setChecked(z10);
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
        this.f150454p.e();
    }

    public final MediaFile p1(int i10) {
        return (MediaFile) this.f150453o.a(i10);
    }

    public final void q1() {
        b.c(f150436q, "hide animation");
        this.f150448j.startAnimation(this.f150444f);
        this.f150448j.setVisibility(8);
        this.f150447i.startAnimation(this.f150446h);
        this.f150447i.setVisibility(8);
        this.f150449k = false;
    }

    public final void r1() {
        View viewFindViewById = findViewById(l.h.f62291l3);
        View viewFindViewById2 = findViewById(l.h.f62216f6);
        View viewFindViewById3 = findViewById(l.h.f62225g2);
        View viewFindViewById4 = findViewById(l.h.f61913G8);
        this.f150451m = findViewById(l.h.f62092V7);
        viewFindViewById3.setClickable(true);
        viewFindViewById4.setClickable(true);
        viewFindViewById.setClickable(true);
        viewFindViewById2.setClickable(true);
        this.f150451m.setClickable(true);
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: b5.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120879a.z1(view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: b5.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120882a.A1(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: b5.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120885a.B1(view);
            }
        });
        this.f150451m.setOnClickListener(new View.OnClickListener() { // from class: b5.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120888a.C1(view);
            }
        });
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: b5.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120891a.D1(view);
            }
        });
    }

    public final void s1(List<MediaFile> list) {
        if (!list.isEmpty()) {
            if (list.size() > 3) {
                this.f150450l.setOffscreenPageLimit(3);
            } else if (list.size() > 2) {
                this.f150450l.setOffscreenPageLimit(2);
            }
        }
        C1465b c1465b = new C1465b(this);
        this.f150453o = c1465b;
        c1465b.h(list);
        a aVar = new a();
        this.f150450l.setAdapter(this.f150453o);
        this.f150450l.addOnPageChangeListener(aVar);
        r1();
        this.f150450l.setCurrentItem(this.f150440b);
        aVar.onPageSelected(this.f150440b);
    }

    public final /* synthetic */ void u1(Throwable th, String str) {
        o1();
        setResult(0);
    }

    public final /* synthetic */ void v1(int i10, PreviewItemView previewItemView, List list) {
        this.f150442d.add(Integer.valueOf(i10));
        this.f150453o.e(previewItemView);
        if (this.f150453o.getCount() == 0) {
            o1();
        } else {
            this.f150450l.getAdapter().notifyDataSetChanged();
            k1(this.f150440b);
        }
    }

    public final /* synthetic */ void w1(int i10, PreviewItemView previewItemView, List list) {
        this.f150442d.add(Integer.valueOf(i10));
        this.f150453o.e(previewItemView);
        if (this.f150453o.getCount() == 0) {
            o1();
        } else {
            this.f150453o.notifyDataSetChanged();
            k1(i10);
        }
    }

    public final /* synthetic */ void z1(View view) {
        l1(this.f150453o.c(this.f150440b));
    }
}
