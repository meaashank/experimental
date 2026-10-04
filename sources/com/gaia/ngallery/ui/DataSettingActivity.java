package com.gaia.ngallery.ui;

import N4.d;
import N4.l;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.B;
import b5.DialogInterfaceOnClickListenerC2833z;
import c6.C2947b;
import com.gaia.ngallery.ui.DataSettingActivity;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.c;
import com.prism.lib.pfs.compat.PfsCompatType;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.PrivateFile;
import e5.C4364a;
import g6.C4455a;
import java.util.LinkedList;
import java.util.List;
import o6.InterfaceC5331d;
import o6.j;
import o6.k;

/* JADX INFO: loaded from: classes3.dex */
public class DataSettingActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f150353k = l0.b("DataSettingActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f150354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PrivateFileSystem f150355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<PrivateFile> f150356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f150357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f150358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f150359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f150360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f150361h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f150362i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f150363j;

    public static class a extends Fragment {
        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            return layoutInflater.inflate(l.k.f62734w0, viewGroup, false);
        }
    }

    public static abstract class b extends com.prism.lib.pfs.c {
        public b(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c) {
            super(privateFileSystem, activityC1486c);
        }

        @Override // com.prism.lib.pfs.c, com.prism.lib.pfs.a, com.prism.lib.pfs.PrivateFileSystem.d
        public void b(PfsCompatType pfsCompatType, String str, InterfaceC5331d interfaceC5331d) {
            if (Oa.a.f65254w) {
                new c.a(interfaceC5331d, this.f183657b.getString(d.p.f187160W3)).show(this.f183659d.getSupportFragmentManager(), "");
            } else {
                new c.b(interfaceC5331d, this.f183657b.getString(l.p.f63052i1)).show(this.f183659d.getSupportFragmentManager(), "");
            }
        }
    }

    public static class c extends RecyclerView.Adapter<RecyclerView.C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DataSettingActivity f150364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrivateFile[] f150365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final R4.c<View> f150366f;

        public c(DataSettingActivity dataSettingActivity, PrivateFile[] privateFileArr, R4.c<View> cVar) {
            this.f150364d = dataSettingActivity;
            this.f150365e = privateFileArr;
            this.f150366f = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f150365e.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.C c10, int i10) {
            ((f) c10).g(this.f150365e[i10]);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.C onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            return new f(LayoutInflater.from(this.f150364d).inflate(l.k.f62571C2, viewGroup, false), this.f150366f);
        }
    }

    public static class d extends Fragment {
        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            return layoutInflater.inflate(l.k.f62726u0, viewGroup, false);
        }
    }

    public static class e extends Fragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSettingActivity f150367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PrivateFile[] f150368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final R4.c<View> f150369c;

        public e(DataSettingActivity dataSettingActivity, List<PrivateFile> list, R4.c<View> cVar) {
            this.f150367a = dataSettingActivity;
            this.f150368b = (PrivateFile[]) list.toArray(new PrivateFile[0]);
            this.f150369c = cVar;
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            View viewInflate = layoutInflater.inflate(l.k.f62722t0, viewGroup, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(l.h.f61972L7);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.addItemDecoration(new C4364a(getContext(), 1, getResources().getDimensionPixelSize(l.f.ie), getResources().getColor(l.e.f60458h1)));
            recyclerView.setAdapter(new c(this.f150367a, this.f150368b, this.f150369c));
            return viewInflate;
        }
    }

    public static class f extends RecyclerView.C implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final R4.c<View> f150370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f150371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f150372d;

        public f(@NonNull View view, R4.c<View> cVar) {
            super(view);
            this.f150370b = cVar;
            this.f150371c = (TextView) view.findViewById(l.h.f62305m4);
            this.f150372d = (TextView) view.findViewById(l.h.f62292l4);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        public final /* synthetic */ void e(d.g gVar) {
            this.f150372d.setText(this.f150371c.getContext().getString(l.p.f62945V0, Integer.valueOf(gVar.f59089a), Integer.valueOf(gVar.f59090b)));
        }

        public final /* synthetic */ void f(PrivateFile privateFile) {
            final d.g gVarF = N4.d.f(privateFile.asRoot(), null);
            C4455a.b().c().post(new Runnable() { // from class: b5.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120833a.e(gVarF);
                }
            });
        }

        public void g(final PrivateFile privateFile) {
            this.f150371c.setText(privateFile.getRealPath());
            C4455a.b().a().execute(new Runnable() { // from class: b5.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120836a.f(privateFile);
                }
            });
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            R4.c<View> cVar = this.f150370b;
            if (cVar != null) {
                cVar.b(view, getAdapterPosition());
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            R4.c<View> cVar = this.f150370b;
            if (cVar == null) {
                return false;
            }
            cVar.a(view, getAdapterPosition());
            return false;
        }
    }

    public static class g extends Fragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f150373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f150374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ProgressBar f150375c;

        public void l(String str) {
            TextView textView = this.f150373a;
            if (textView == null) {
                return;
            }
            textView.setText(textView.getContext().getString(l.p.f62969Y0, str));
        }

        public void m(int i10) {
            ProgressBar progressBar = this.f150375c;
            if (progressBar == null) {
                return;
            }
            progressBar.setProgress(i10);
        }

        public void n(int i10) {
            TextView textView = this.f150374b;
            if (textView == null) {
                return;
            }
            textView.setText(textView.getContext().getString(l.p.f62961X0, Integer.valueOf(i10)));
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            View viewInflate = layoutInflater.inflate(l.k.f62730v0, viewGroup, false);
            this.f150373a = (TextView) viewInflate.findViewById(l.h.f61951Ja);
            this.f150374b = (TextView) viewInflate.findViewById(l.h.f61939Ia);
            this.f150375c = (ProgressBar) viewInflate.findViewById(l.h.f62334o7);
            l("...");
            n(0);
            m(0);
            return viewInflate;
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroyView() {
            this.f150373a = null;
            this.f150374b = null;
            this.f150375c = null;
            super.onDestroyView();
        }
    }

    public class h extends b {

        public class a extends k {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f150377c = 0;

            public a() {
            }

            @Override // o6.k
            public void e() {
                final int iA = a();
                if (iA > this.f150377c) {
                    this.f150377c = iA;
                    C4455a.b().c().post(new Runnable() { // from class: b5.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f120869a.h(iA);
                        }
                    });
                }
            }

            public final /* synthetic */ void h(int i10) {
                if (DataSettingActivity.this.f150360g == null || !DataSettingActivity.this.f150360g.isAdded()) {
                    return;
                }
                DataSettingActivity.this.f150360g.m(i10);
            }
        }

        public class b implements R4.c<View> {
            public b() {
            }

            @Override // R4.c
            public /* bridge */ /* synthetic */ void a(View view, int i10) {
            }

            @Override // R4.c
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(View view, int i10) {
                DataSettingActivity dataSettingActivity = DataSettingActivity.this;
                dataSettingActivity.s1((PrivateFile) dataSettingActivity.f150356c.get(i10));
            }

            public void d(View view, int i10) {
            }
        }

        public h(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c) {
            super(privateFileSystem, activityC1486c);
        }

        public static /* synthetic */ Boolean n(h hVar, PrivateFile privateFile) {
            hVar.r(privateFile);
            return Boolean.TRUE;
        }

        @Override // o6.g
        public void a() {
            I.a(DataSettingActivity.f150353k, "data dir scanner mount failed");
            DataSettingActivity.this.f150359f.setEnabled(true);
        }

        public final /* synthetic */ void o(PrivateFile privateFile) {
            if (DataSettingActivity.this.f150360g == null || !DataSettingActivity.this.f150360g.isAdded()) {
                return;
            }
            DataSettingActivity.this.f150360g.l(privateFile.getRealPath());
        }

        @Override // o6.g
        public void onSuccess() {
            I.a(DataSettingActivity.f150353k, "data dir scanner mount OK");
            DataSettingActivity.this.f150360g = new g();
            U u10 = DataSettingActivity.this.getSupportFragmentManager().u();
            u10.k(null);
            u10.z(l.h.f61860C3, DataSettingActivity.this.f150360g, "scanning");
            u10.m();
            DataSettingActivity.this.f150356c = new LinkedList();
            C4455a.b().a().execute(new Runnable() { // from class: b5.M
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120867a.t();
                }
            });
        }

        public final /* synthetic */ Boolean p(final PrivateFile privateFile) {
            if (System.currentTimeMillis() - DataSettingActivity.this.f150363j >= 10) {
                DataSettingActivity.this.f150363j = System.currentTimeMillis();
                C4455a.b().c().post(new Runnable() { // from class: b5.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120839a.o(privateFile);
                    }
                });
            }
            return Boolean.valueOf(DataSettingActivity.this.f150362i);
        }

        public final /* synthetic */ void q(PrivateFile privateFile) {
            DataSettingActivity.this.f150356c.add(privateFile);
            g gVar = DataSettingActivity.this.f150360g;
            if (gVar == null || !gVar.isAdded()) {
                return;
            }
            DataSettingActivity dataSettingActivity = DataSettingActivity.this;
            dataSettingActivity.f150360g.n(dataSettingActivity.f150356c.size());
        }

        public final /* synthetic */ Boolean r(final PrivateFile privateFile) {
            I.b(DataSettingActivity.f150353k, "data dir: %s", privateFile.getRealPath());
            C4455a.b().c().post(new Runnable() { // from class: b5.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120842a.q(privateFile);
                }
            });
            return Boolean.TRUE;
        }

        public final /* synthetic */ void s() {
            DataSettingActivity.this.f150359f.setEnabled(true);
            g gVar = DataSettingActivity.this.f150360g;
            if (gVar != null && gVar.isAdded()) {
                DataSettingActivity.this.f150360g.l("finished");
            }
            if (DataSettingActivity.this.f150356c.isEmpty()) {
                d dVar = new d();
                U u10 = DataSettingActivity.this.getSupportFragmentManager().u();
                u10.k(null);
                u10.z(l.h.f61860C3, dVar, "scanResultEmpty");
                u10.m();
                return;
            }
            DataSettingActivity dataSettingActivity = DataSettingActivity.this;
            e eVar = new e(dataSettingActivity, dataSettingActivity.f150356c, new b());
            U u11 = DataSettingActivity.this.getSupportFragmentManager().u();
            u11.k(null);
            u11.z(l.h.f61860C3, eVar, "scanResult");
            u11.m();
        }

        public final /* synthetic */ void t() {
            DataSettingActivity.this.f150361h = true;
            DataSettingActivity.this.f150363j = System.currentTimeMillis();
            for (PrivateFileSystem privateFileSystem : PrivateFileSystem.getExternalRoots()) {
                DataSettingActivity dataSettingActivity = DataSettingActivity.this;
                if (!dataSettingActivity.f150362i) {
                    break;
                }
                if (privateFileSystem == dataSettingActivity.f150355b || privateFileSystem.isMounted() || privateFileSystem.tryAutoMount()) {
                    I.b(DataSettingActivity.f150353k, "scanning volume: %s", privateFileSystem.getTargetResidePath());
                    N4.d.A(privateFileSystem, new j() { // from class: b5.J
                        @Override // o6.j
                        public final Object a(Object obj) {
                            return this.f120845a.p((PrivateFile) obj);
                        }
                    }, new j() { // from class: b5.K
                        @Override // o6.j
                        public final Object a(Object obj) {
                            DataSettingActivity.h.n(this.f120847a, (PrivateFile) obj);
                            return Boolean.TRUE;
                        }
                    }, new a());
                } else {
                    I.v(DataSettingActivity.f150353k, "volume %s not mountable without the user, skipped", privateFileSystem.getTargetResidePath());
                }
            }
            DataSettingActivity dataSettingActivity2 = DataSettingActivity.this;
            dataSettingActivity2.f150361h = false;
            if (dataSettingActivity2.f150362i) {
                C4455a.b().c().post(new Runnable() { // from class: b5.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f120865a.s();
                    }
                });
            }
        }
    }

    public final /* synthetic */ void n1(DialogInterface dialogInterface, int i10) {
        this.f150362i = false;
        finish();
        onBackPressed();
    }

    public final /* synthetic */ void o1(PrivateFile privateFile, DialogInterface dialogInterface, int i10) {
        try {
            N4.d.d(this, privateFile);
            t1();
        } catch (Exception e10) {
            Toast.makeText(this, getString(l.p.f63076l1, e10.getMessage()), 1).show();
        }
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onBackPressed() {
        if (this.f150361h) {
            new AlertDialog.Builder(this).setTitle(l.p.f62810E1).setMessage(l.p.f63036g1).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: b5.y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f120960a.n1(dialogInterface, i10);
                }
            }).setNegativeButton(C2947b.m.f129666u2, new DialogInterfaceOnClickListenerC2833z()).create().show();
            return;
        }
        this.f150362i = false;
        finish();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62572D);
        Toolbar toolbar = (Toolbar) findViewById(l.h.f62168ba);
        this.f150359f = (Button) findViewById(l.h.f62211f1);
        this.f150357d = (TextView) findViewById(l.h.f62435wa);
        this.f150358e = (TextView) findViewById(l.h.f62423va);
        setSupportActionBar(toolbar);
        getSupportActionBar().X(true);
        a aVar = new a();
        U u10 = getSupportFragmentManager().u();
        u10.k(null);
        u10.z(l.h.f61860C3, aVar, "default");
        u10.m();
        t1();
        this.f150359f.setOnClickListener(new View.OnClickListener() { // from class: b5.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120806a.p1(view);
            }
        });
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.ActivityC1486c
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public final /* synthetic */ void p1(View view) {
        if (this.f150359f.isEnabled()) {
            this.f150359f.setEnabled(false);
            I.a(f150353k, "data dir start to scan...");
            if (this.f150355b == null) {
                this.f150355b = PrivateFileSystem.getExternalRoot();
            }
            if (this.f150354a == null) {
                this.f150354a = new h(this.f150355b, this);
            }
            if (this.f150355b.isMounted()) {
                this.f150355b.changeMountPath(this, this.f150354a);
            } else {
                this.f150355b.mount(this, this.f150354a);
            }
        }
    }

    public final /* synthetic */ void q1(PrivateFile privateFile, d.g gVar) {
        this.f150357d.setText(privateFile.getRealPath());
        this.f150358e.setText(getString(l.p.f62945V0, Integer.valueOf(gVar.f59089a), Integer.valueOf(gVar.f59090b)));
    }

    public final /* synthetic */ void r1(final PrivateFile privateFile) {
        final d.g gVarF = N4.d.f(privateFile, null);
        C4455a.b().c().post(new Runnable() { // from class: b5.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f120802a.q1(privateFile, gVarF);
            }
        });
    }

    public final void s1(final PrivateFile privateFile) {
        new AlertDialog.Builder(this).setTitle(l.p.f63188z1).setMessage(getString(l.p.f63004c1, privateFile.getRealPath())).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: b5.A
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f120798a.o1(privateFile, dialogInterface, i10);
            }
        }).setNegativeButton(C2947b.m.f129666u2, new B()).create().show();
    }

    public final void t1() {
        if (N4.d.r().isMounted()) {
            final PrivateFile privateFileRoot = N4.d.f59079i.root();
            C4455a.b().a().execute(new Runnable() { // from class: b5.E
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120808a.r1(privateFileRoot);
                }
            });
        }
    }
}
