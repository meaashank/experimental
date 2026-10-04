package com.prism.lib.pfs.ui;

import Wa.e;
import Ya.g;
import ab.C1465b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.activity.D;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import c6.C2947b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.H;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.r0;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.file.exchange.LocalExchangeFile;
import com.prism.lib.pfs.ui.pager.preview.PreviewItemView;
import d6.InterfaceC4300a;
import g6.C4455a;
import java.io.File;
import java.util.Collections;
import java.util.List;
import z6.InterfaceC5860b;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewActivity extends ActivityC1486c implements InterfaceC5860b<ExchangeFile> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f188869r = l0.b("PreviewActivity");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f188870s = "previewItem";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f188871t = "sortType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f188872u = "pfsExport";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateFileSystem f188873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PrivateFileSystem f188874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppBarLayout f188875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f188876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewFlipper f188877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f188878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f188879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f188880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewPager f188881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1465b f188882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Animation f188883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animation f188884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animation f188885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Animation f188886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f188887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f188888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f188889q;

    public enum SortType {
        NONE,
        MODIFIED_TIME_DSC
    }

    public class a extends ViewPager.l {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            PreviewActivity.this.onPageSelected(i10);
        }
    }

    public class b extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ PrivateFile f188891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c, PrivateFile privateFile) {
            super(privateFileSystem, activityC1486c);
            this.f188891f = privateFile;
        }

        @Override // o6.g
        public void a() {
            PreviewActivity.this.finish();
        }

        @Override // o6.g
        public void onSuccess() {
            try {
                List<PrivateFile> list = this.f188891f.getParent().list();
                if (list == null) {
                    PreviewActivity.this.finish();
                    return;
                }
                if (SortType.values()[PreviewActivity.this.getIntent().getIntExtra(PreviewActivity.f188871t, SortType.NONE.ordinal())] == SortType.MODIFIED_TIME_DSC) {
                    Collections.sort(list, PrivateFile.MODIFIED_TIME_DSC);
                }
                int iIndexOf = list.indexOf(this.f188891f);
                PreviewActivity.this.f188882j.h(list);
                PreviewActivity.this.f188882j.notifyDataSetChanged();
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.O1(previewActivity.f188882j.d(iIndexOf));
                PreviewActivity.this.P1();
            } catch (PfsIOException unused) {
                PreviewActivity.this.finish();
            }
        }
    }

    public class c extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ExchangeFile f188893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Activity f188894g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c, ExchangeFile exchangeFile, Activity activity) {
            super(privateFileSystem, activityC1486c);
            this.f188893f = exchangeFile;
            this.f188894g = activity;
        }

        @Override // o6.g
        public void a() {
            PreviewActivity previewActivity = PreviewActivity.this;
            r0.f(previewActivity, previewActivity.getString(d.p.f187163X1), -2);
        }

        public final /* synthetic */ void j(Activity activity, List list) {
            if (list == null || list.size() == 0) {
                r0.f(activity, activity.getString(d.p.f187163X1), -2);
            } else {
                Da.b.j(activity, PreviewActivity.this.f188873a.getResidePath());
                r0.f(activity, activity.getString(d.p.f187173Z1, PreviewActivity.this.f188873a.getResidePath()), -2);
            }
        }

        @Override // o6.g
        public void onSuccess() {
            Ma.c cVarExportFiles = PrivateFileSystem.exportFiles(true, false, PreviewActivity.this.f188873a, this.f188893f);
            final Activity activity = this.f188894g;
            cVarExportFiles.a(new InterfaceC4300a.e() { // from class: Ya.r
                @Override // d6.InterfaceC4300a.e
                public final void onSuccess(Object obj) {
                    this.f79372a.j(activity, (List) obj);
                }
            }).e(this.f188894g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1() {
        if (!this.f188887o) {
            this.f188877e.startAnimation(this.f188883k);
            this.f188875c.startAnimation(this.f188885m);
        }
        this.f188877e.setVisibility(0);
        this.f188875c.setVisibility(0);
        this.f188887o = true;
    }

    private void Q1() {
        if (this.f188887o) {
            u1();
        } else {
            P1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPageSelected(int i10) {
        this.f188888p = i10;
        setTitle((i10 + 1) + RemoteSettings.FORWARD_SLASH_STRING + this.f188882j.getCount());
        ExchangeFile exchangeFileA = this.f188882j.a(i10);
        if (exchangeFileA == null) {
            return;
        }
        FileType type = exchangeFileA.getType();
        if (type == FileType.IMAGE) {
            ViewFlipper viewFlipper = this.f188877e;
            viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(this.f188879g));
        } else if (type == FileType.VIDEO || type == FileType.AUDIO) {
            ViewFlipper viewFlipper2 = this.f188877e;
            viewFlipper2.setDisplayedChild(viewFlipper2.indexOfChild(this.f188880h));
        } else {
            ViewFlipper viewFlipper3 = this.f188877e;
            viewFlipper3.setDisplayedChild(viewFlipper3.indexOfChild(this.f188878f));
            P1();
        }
    }

    public static Intent p1(Context context, PrivateFile privateFile, SortType sortType, @Nullable PrivateFileSystem privateFileSystem) {
        Intent intent = new Intent(context, (Class<?>) PreviewActivity.class);
        intent.putExtra(f188870s, privateFile);
        intent.putExtra(f188871t, sortType.ordinal());
        intent.putExtra(f188872u, privateFileSystem);
        return intent;
    }

    private void s1(PreviewItemView previewItemView) {
        if (previewItemView == null) {
            return;
        }
        ImageView imageViewC = previewItemView.c();
        if (D.a(imageViewC)) {
            ((AttachPhotoView) imageViewC).d().g0(90.0f);
        }
    }

    private void u1() {
        if (this.f188887o) {
            this.f188877e.startAnimation(this.f188884l);
            this.f188875c.startAnimation(this.f188886n);
        }
        this.f188877e.setVisibility(8);
        this.f188875c.setVisibility(8);
        this.f188887o = false;
    }

    public final /* synthetic */ void A1(final File file, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C4455a.b().c().post(new Runnable() { // from class: Ya.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f79361a.z1(file);
            }
        });
    }

    public final /* synthetic */ void B1(View view) {
        t1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void C1(View view) {
        r1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void D1(View view) {
        q1(this.f188882j.c(this.f188888p));
    }

    public final /* synthetic */ void E1(View view) {
        t1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void F1(View view) {
        r1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void G1(View view) {
        q1(this.f188882j.c(this.f188888p));
    }

    public final /* synthetic */ void H1(View view) {
        s1(this.f188882j.c(this.f188888p));
    }

    public final /* synthetic */ void I1(View view) {
        t1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void J1(View view) {
        r1(this.f188882j.a(this.f188888p));
    }

    public final /* synthetic */ void K1(View view) {
        q1(this.f188882j.c(this.f188888p));
    }

    @Override // z6.InterfaceC5860b
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void R(int i10, ExchangeFile exchangeFile, int i11, Object[] objArr) {
        if (i11 == 1) {
            onPageSelected(i10);
            return;
        }
        if (i11 == 2) {
            M1(i10);
        } else if (i11 == 3) {
            Q1();
        } else {
            if (i11 != 10) {
                return;
            }
            N1(i10, exchangeFile);
        }
    }

    public final void M1(int i10) {
        if (this.f188887o) {
            u1();
        }
    }

    public final void N1(int i10, ExchangeFile exchangeFile) {
        ExchangeFile item;
        PreviewItemView previewItemViewC = this.f188882j.c(i10);
        if (previewItemViewC == null || (item = previewItemViewC.getItem()) == null || !item.equals(exchangeFile)) {
            return;
        }
        ImageView imageViewC = previewItemViewC.c();
        Da.b.k(this, VideoPlayActivity.V0(this, exchangeFile, imageViewC.getWidth() > imageViewC.getHeight() ? 2 : 1, true), imageViewC);
    }

    public void O1(int i10) {
        try {
            this.f188881i.setCurrentItem(i10);
            onPageSelected(i10);
        } catch (IllegalArgumentException e10) {
            Log.w(f188869r, "selectPage failed: " + e10.getMessage(), e10);
        }
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        H.a(this);
        PrivateFile privateFile = (PrivateFile) getIntent().getParcelableExtra(f188870s);
        if (privateFile == null) {
            finish();
            return;
        }
        this.f188873a = (PrivateFileSystem) getIntent().getParcelableExtra(f188872u);
        this.f188874b = privateFile.getPfs();
        this.f188882j = new C1465b(this);
        this.f188883k = AnimationUtils.loadAnimation(this, d.a.f183728m);
        this.f188884l = AnimationUtils.loadAnimation(this, d.a.f183729n);
        this.f188885m = AnimationUtils.loadAnimation(this, d.a.f183730o);
        this.f188886n = AnimationUtils.loadAnimation(this, d.a.f183731p);
        setContentView(d.k.f186898C);
        this.f188875c = (AppBarLayout) findViewById(d.h.preview_app_bar_layout);
        this.f188876d = (Toolbar) findViewById(d.h.preview_toolbar);
        this.f188877e = (ViewFlipper) findViewById(d.h.preview_bottom_bar_flipper);
        v1();
        this.f188881i = (ViewPager) findViewById(d.h.preview_view_pager);
        setSupportActionBar(this.f188876d);
        getSupportActionBar().X(true);
        this.f188881i.addOnPageChangeListener(new a());
        this.f188881i.setOffscreenPageLimit(3);
        this.f188881i.setAdapter(this.f188882j);
        this.f188874b.mount(this, new b(this.f188874b, this, privateFile));
        e eVar = new e(this);
        this.f188889q = eVar;
        eVar.d();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
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
        this.f188889q.e();
    }

    public final void q1(final PreviewItemView previewItemView) {
        if (previewItemView == null) {
            return;
        }
        final int iE = previewItemView.e();
        final ExchangeFile item = previewItemView.getItem();
        new AlertDialog.Builder(this).setTitle(d.p.f187151V).setMessage(getString(d.p.f187146U, "1")).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: Ya.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f79357a.x1(item, previewItemView, iE, dialogInterface, i10);
            }
        }).setNegativeButton(C2947b.m.f129666u2, new g()).create().show();
    }

    public final void r1(final ExchangeFile exchangeFile) {
        if (exchangeFile == null || this.f188873a == null) {
            return;
        }
        new AlertDialog.Builder(this).setTitle(d.p.f187102L0).setMessage(d.p.f187097K0).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: Ya.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f79354a.y1(exchangeFile, this, dialogInterface, i10);
            }
        }).setNegativeButton(C2947b.m.f129666u2, new Ya.e()).create().show();
    }

    public final void t1(ExchangeFile exchangeFile) {
        if (exchangeFile == null) {
            return;
        }
        final File file = new File(PrivateFileSystem.getTempExportPath(), exchangeFile.getName());
        PrivateFileSystem.exportFile(true, true, new LocalExchangeFile(file), exchangeFile).a(new InterfaceC4300a.e() { // from class: Ya.a
            @Override // d6.InterfaceC4300a.e
            public final void onSuccess(Object obj) {
                this.f79348a.A1(file, (List) obj);
            }
        }).e(this);
    }

    public final void v1() {
        View viewFindViewById = findViewById(d.h.vf_file);
        this.f188878f = viewFindViewById;
        int i10 = d.h.f186736s6;
        viewFindViewById.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: Ya.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79363a.B1(view);
            }
        });
        if (this.f188873a != null) {
            this.f188878f.findViewById(d.h.f186762v2).setOnClickListener(new View.OnClickListener() { // from class: Ya.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79364a.C1(view);
                }
            });
        }
        View view = this.f188878f;
        int i11 = d.h.f186780x1;
        view.findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: Ya.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79365a.D1(view2);
            }
        });
        View viewFindViewById2 = findViewById(d.h.vf_image);
        this.f188879g = viewFindViewById2;
        viewFindViewById2.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: Ya.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79366a.E1(view2);
            }
        });
        if (this.f188873a != null) {
            this.f188879g.findViewById(d.h.f186762v2).setOnClickListener(new View.OnClickListener() { // from class: Ya.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f79367a.F1(view2);
                }
            });
        }
        this.f188879g.findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: Ya.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79368a.G1(view2);
            }
        });
        this.f188879g.findViewById(d.h.f186438N5).setOnClickListener(new View.OnClickListener() { // from class: Ya.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79369a.H1(view2);
            }
        });
        View viewFindViewById3 = findViewById(d.h.vf_video);
        this.f188880h = viewFindViewById3;
        viewFindViewById3.findViewById(i10).setOnClickListener(new View.OnClickListener() { // from class: Ya.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79370a.I1(view2);
            }
        });
        if (this.f188873a != null) {
            this.f188880h.findViewById(d.h.f186762v2).setOnClickListener(new View.OnClickListener() { // from class: Ya.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f79371a.J1(view2);
                }
            });
        }
        this.f188880h.findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: Ya.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f79350a.K1(view2);
            }
        });
    }

    public final /* synthetic */ void w1(PreviewItemView previewItemView, int i10) {
        this.f188882j.e(previewItemView);
        O1(this.f188882j.d(i10));
    }

    public final /* synthetic */ void x1(ExchangeFile exchangeFile, final PreviewItemView previewItemView, final int i10, DialogInterface dialogInterface, int i11) {
        exchangeFile.deleteQuietly();
        C4455a.b().c().post(new Runnable() { // from class: Ya.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f79351a.w1(previewItemView, i10);
            }
        });
    }

    public final /* synthetic */ void y1(ExchangeFile exchangeFile, Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        this.f188873a.mount(this, new c(this.f188873a, this, exchangeFile, activity));
    }

    public final /* synthetic */ void z1(File file) {
        C3858w.U(this, PrivateFileSystem.getTempExportAuth(), file);
    }
}
