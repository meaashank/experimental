package com.gaia.ngallery.ui;

import N4.d;
import N4.l;
import P4.e;
import W4.b;
import W4.c;
import W4.g;
import Y4.j0;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import b5.C2823u;
import b5.C2829x;
import b5.DialogInterfaceOnClickListenerC2804k;
import com.bumptech.glide.c;
import com.gaia.ngallery.sync.model.SyncAccount;
import com.gaia.ngallery.ui.CloudSettingActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.m0;
import i5.C4555a;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class CloudSettingActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f150341h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f150342i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f150343j = l0.b("CloudSettingActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f150344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f150345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f150346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f150347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f150348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SyncAccount f150349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GoogleSignInAccount f150350g;

    public class a implements d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GoogleSignInAccount f150351a;

        public a(GoogleSignInAccount googleSignInAccount) {
            this.f150351a = googleSignInAccount;
        }

        @Override // N4.d.f
        public void a(String str) {
        }

        @Override // N4.d.f
        public void b(e eVar) {
            Log.d(CloudSettingActivity.f150343j, "sync account isExpired:" + this.f150351a.isExpired());
            j0.D0().a(d.i(), this.f150351a);
        }
    }

    public static /* synthetic */ void A1(DialogInterface dialogInterface, int i10) {
    }

    public static /* synthetic */ SyncAccount Y0(CloudSettingActivity cloudSettingActivity, SyncAccount syncAccount) throws Exception {
        cloudSettingActivity.w1(syncAccount);
        return syncAccount;
    }

    public static /* synthetic */ Object g1(CloudSettingActivity cloudSettingActivity) throws Exception {
        cloudSettingActivity.u1();
        return null;
    }

    public static /* synthetic */ void j1(CloudSettingActivity cloudSettingActivity, CompoundButton compoundButton, boolean z10) {
        cloudSettingActivity.getClass();
        C4555a.h(cloudSettingActivity, z10);
    }

    public static /* synthetic */ Void k1(CloudSettingActivity cloudSettingActivity, Void r12) throws Exception {
        cloudSettingActivity.q1(r12);
        return r12;
    }

    public static /* synthetic */ void n1(DialogInterface dialogInterface, int i10) {
    }

    public final /* synthetic */ void B1(DialogInterface dialogInterface, int i10) {
        I1();
    }

    public final /* synthetic */ void C1(AlertDialog alertDialog, DialogInterface dialogInterface) {
        alertDialog.f(-1).setTextColor(m0.a(this, l.c.f59255E3));
    }

    public final /* synthetic */ void D1(View view) {
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(getString(l.p.f63140t1, this.f150349f.getAccountName())).setMessage(l.p.f63124r1).setNegativeButton(l.p.f63116q1, new DialogInterfaceOnClickListenerC2804k()).setPositiveButton(l.p.f63132s1, new DialogInterface.OnClickListener() { // from class: b5.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f120934a.I1();
            }
        }).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: b5.m
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f120936a.C1(alertDialogCreate, dialogInterface);
            }
        });
        alertDialogCreate.show();
    }

    public final /* synthetic */ void F1(final b bVar) {
        runOnUiThread(new Runnable() { // from class: b5.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f120922a.E1(bVar);
            }
        });
    }

    public final /* synthetic */ void G1(View view) {
        Log.d(f150343j, "Google Drive Login");
        O4.a.h(this);
        N1();
    }

    public final /* synthetic */ void H1(GoogleSignInAccount googleSignInAccount, SyncAccount syncAccount) {
        Q1(googleSignInAccount);
    }

    public final void I1() {
        Log.d(f150343j, "logout");
        p1().signOut().onSuccessTask(AsyncTask.THREAD_POOL_EXECUTOR, new SuccessContinuation() { // from class: b5.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f120948a.r1((Void) obj);
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: b5.t
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f120950a.s1((Void) obj);
            }
        }).addOnFailureListener(new C2823u());
    }

    public final Task<SyncAccount> J1(GoogleSignInAccount googleSignInAccount) {
        O4.a.w(this);
        android.support.v4.media.b.a("onGoogleDriveSignedIn ", googleSignInAccount.getDisplayName() + " \n" + googleSignInAccount.getEmail() + " \n", f150343j);
        this.f150350g = googleSignInAccount;
        final SyncAccount syncAccount = new SyncAccount();
        syncAccount.setAccountType(1);
        syncAccount.setAccountName(googleSignInAccount.getDisplayName());
        syncAccount.setAccountId(googleSignInAccount.getId());
        syncAccount.setAccountSubTitle("EMAIL:" + googleSignInAccount.getEmail());
        syncAccount.setProfilePhoto(googleSignInAccount.getPhotoUrl());
        return Tasks.call(AsyncTask.THREAD_POOL_EXECUTOR, new Callable() { // from class: b5.w
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                CloudSettingActivity cloudSettingActivity = this.f120956a;
                SyncAccount syncAccount2 = syncAccount;
                CloudSettingActivity.Y0(cloudSettingActivity, syncAccount2);
                return syncAccount2;
            }
        }).addOnFailureListener(new C2829x()).addOnSuccessListener(new OnSuccessListener() { // from class: b5.f
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f120919a.P1();
            }
        });
    }

    public final void K1() {
        this.f150344a.setVisibility(8);
        this.f150345b.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(l.h.f62331o4);
        ImageView imageView2 = (ImageView) findViewById(l.h.f62357q4);
        TextView textView = (TextView) findViewById(l.h.f62311ma);
        TextView textView2 = (TextView) findViewById(l.h.f62298la);
        imageView2.setImageResource(l.m.f62766j);
        textView.setText(this.f150349f.getAccountName());
        textView2.setText(this.f150349f.getAccountSubTitle());
        c.p(this).k(this).i(this.f150349f.getProfilePhoto()).D().v1(imageView);
        findViewById(l.h.f62237h1).setOnClickListener(new View.OnClickListener() { // from class: b5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120916a.D1(view);
            }
        });
        this.f150346c = (Button) findViewById(l.h.f62224g1);
        this.f150347d = (TextView) findViewById(l.h.f62023Pa);
        this.f150348e = (TextView) findViewById(l.h.f62035Qa);
        E1(W4.c.b().a(this));
        W4.c.f76610c.f(new c.a() { // from class: b5.p
            @Override // W4.c.a
            public final void a(W4.b bVar) {
                this.f120943a.F1(bVar);
            }
        });
        this.f150346c.setOnClickListener(new View.OnClickListener() { // from class: b5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120945a.y1(view);
            }
        });
        Switch r02 = (Switch) findViewById(l.h.f62336o9);
        r02.setChecked(C4555a.d(this));
        r02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b5.r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CloudSettingActivity.j1(this.f120946a, compoundButton, z10);
            }
        });
    }

    public final void L1() {
        this.f150344a.setVisibility(0);
        this.f150345b.setVisibility(8);
        findViewById(l.h.f62185d1).setOnClickListener(new View.OnClickListener() { // from class: b5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120939a.G1(view);
            }
        });
    }

    public final void M1(int i10) {
        Log.i(f150343j, "Start sign in");
        startActivityForResult(p1().getSignInIntent(), i10);
    }

    public final void N1() {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this);
        Log.d(f150343j, "signInIfNeeded account:" + lastSignedInAccount);
        if (lastSignedInAccount == null || lastSignedInAccount.isExpired()) {
            M1(1);
        } else {
            J1(lastSignedInAccount);
        }
    }

    public final void O1() {
        GoogleSignInAccount googleSignInAccount = this.f150350g;
        if (googleSignInAccount != null) {
            Q1(googleSignInAccount);
            return;
        }
        final GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this);
        Log.d(f150343j, "signInIfNeededAndSync account:" + lastSignedInAccount);
        if (lastSignedInAccount == null || lastSignedInAccount.isExpired()) {
            M1(2);
        } else {
            J1(lastSignedInAccount).addOnSuccessListener(new OnSuccessListener() { // from class: b5.v
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f120953a.Q1(lastSignedInAccount);
                }
            });
        }
    }

    public final void P1() {
        if (this.f150349f == null) {
            L1();
        } else {
            K1();
        }
    }

    public final void Q1(GoogleSignInAccount googleSignInAccount) {
        d.y(this, new a(googleSignInAccount));
    }

    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
    public final void E1(b bVar) {
        Log.d(f150343j, "updateSyncStatus status:" + bVar.a());
        if (bVar.a() == 2) {
            this.f150346c.setText(l.p.f63059j0);
            this.f150346c.setEnabled(false);
        } else {
            this.f150346c.setText(l.p.f63051i0);
            this.f150346c.setEnabled(true);
        }
        int i10 = l.p.f62897P0;
        this.f150347d.setText(getString(i10, Integer.valueOf(bVar.c()), Integer.valueOf(bVar.e())));
        this.f150348e.setText(getString(i10, Integer.valueOf(bVar.d()), Integer.valueOf(bVar.f())));
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 1) {
            if (i10 == 2) {
                if (i11 == -1) {
                    final GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this);
                    Log.d(f150343j, "signInGoogleDrive account:" + lastSignedInAccount);
                    if (lastSignedInAccount != null) {
                        J1(lastSignedInAccount).addOnSuccessListener(new OnSuccessListener() { // from class: b5.h
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                this.f120926a.Q1(lastSignedInAccount);
                            }
                        });
                    } else {
                        Toast.makeText(this, "Login Google Drive Failed due to no account returned", 1).show();
                    }
                } else {
                    Log.e(f150343j, "Login Google Drive Failed code:" + i11);
                    Toast.makeText(this, "Login Google Drive Failed code:" + i11, 1).show();
                }
            }
        } else if (i11 == -1) {
            GoogleSignInAccount lastSignedInAccount2 = GoogleSignIn.getLastSignedInAccount(this);
            Log.d(f150343j, "signInGoogleDrive account:" + lastSignedInAccount2);
            if (lastSignedInAccount2 != null) {
                J1(lastSignedInAccount2);
            } else {
                Toast.makeText(this, "Login Google Drive Failed due to no account returned", 1).show();
            }
        } else {
            Log.e(f150343j, "Login Google Drive Failed code:" + i11);
            Toast.makeText(this, "Login Google Drive Failed code:" + i11, 1).show();
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.k.f62568C);
        setSupportActionBar((Toolbar) findViewById(l.h.f62168ba));
        getSupportActionBar().X(true);
        this.f150344a = (ViewGroup) findViewById(l.h.f62017P4);
        this.f150345b = (ViewGroup) findViewById(l.h.f62005O4);
        Tasks.call(AsyncTask.THREAD_POOL_EXECUTOR, new Callable() { // from class: b5.i
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                CloudSettingActivity.g1(this.f120929a);
                return null;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: b5.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f120931a.P1();
            }
        });
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
    }

    public final GoogleSignInClient p1() {
        return GoogleSignIn.getClient((Activity) this, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(Drive.SCOPE_FILE, new Scope[0]).build());
    }

    public final /* synthetic */ Void q1(Void r32) throws Exception {
        W4.d.b().d(this);
        W4.a.c().h(this);
        g.b().d(this);
        this.f150349f = null;
        Log.d(f150343j, "signout success1");
        return r32;
    }

    public final /* synthetic */ Task r1(final Void r32) throws Exception {
        Log.d(f150343j, "signout success");
        return Tasks.call(new Callable() { // from class: b5.o
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                CloudSettingActivity cloudSettingActivity = this.f120940a;
                Void r12 = r32;
                CloudSettingActivity.k1(cloudSettingActivity, r12);
                return r12;
            }
        });
    }

    public final /* synthetic */ void s1(Void r22) {
        Log.d(f150343j, "signout success2");
        P1();
    }

    public final /* synthetic */ void t1(GoogleSignInAccount googleSignInAccount, SyncAccount syncAccount) {
        Q1(googleSignInAccount);
    }

    public final /* synthetic */ Object u1() throws Exception {
        this.f150349f = W4.d.b().c(this);
        return null;
    }

    public final /* synthetic */ void v1(Task task) {
        P1();
    }

    public final /* synthetic */ SyncAccount w1(SyncAccount syncAccount) throws Exception {
        W4.d.b().e(this, syncAccount);
        this.f150349f = syncAccount;
        return syncAccount;
    }

    public final /* synthetic */ void x1(SyncAccount syncAccount) {
        P1();
    }

    public final /* synthetic */ void y1(View view) {
        O1();
        O4.a.o(this);
    }

    public final /* synthetic */ void z1(CompoundButton compoundButton, boolean z10) {
        C4555a.h(this, z10);
    }
}
