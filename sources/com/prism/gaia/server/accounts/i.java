package com.prism.gaia.server.accounts;

import U6.b;
import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.C1758e;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3840d;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.accounts.AccountCompat2;
import com.prism.gaia.naked.compat.android.accounts.AccountManagerResponseCompat2;
import com.prism.gaia.naked.compat.android.accounts.IAccountAuthenticatorCompat2;
import com.prism.gaia.naked.compat.android.accounts.IAccountAuthenticatorResponseCompat2;
import com.prism.gaia.naked.compat.android.accounts.IAccountManagerResponseCompat2;
import com.prism.gaia.naked.compat.android.content.IntentCompat2;
import com.prism.gaia.naked.compat.android.content.pm.PackageParserCompat2;
import com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAG;
import com.prism.gaia.naked.metadata.com.android.internal.ResCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.server.M;
import com.prism.gaia.server.accounts.RegisteredServicesCache;
import com.prism.gaia.server.pm.BinderC4171f;
import com.prism.gaia.server.pm.C;
import com.prism.gaia.server.pm.GaiaUserManagerService;
import com.prism.gaia.server.pm.PackageG;
import com.prism.gaia.server.pm.PackageSettingG;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p6.d;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"WrongConstant"})
public class i extends M.b implements com.prism.gaia.server.accounts.p<AuthenticatorDescription> {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f166478c0 = "asdf-".concat(i.class.getSimpleName());

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final boolean f166479d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f166480e0 = "account";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final i f166481f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final p6.d f166482g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f166483h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f166484i0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f166485j0 = 2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Account[] f166486k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final long f166487l0 = 43200000;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final long f166488m0 = 20000;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AuthenticatorCache f166490V;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public HandlerThread f166493Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public q f166494Z;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final LinkedHashMap<String, u> f166489U = new LinkedHashMap<>();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final SparseArray<x> f166491W = new SparseArray<>();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final SparseBooleanArray f166492X = new SparseBooleanArray();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f166495a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public com.prism.gaia.client.stub.t f166496b0 = new a();

    public class a extends com.prism.gaia.client.stub.t {

        /* JADX INFO: renamed from: com.prism.gaia.server.accounts.i$a$a, reason: collision with other inner class name */
        public class RunnableC0676a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f166498a;

            public RunnableC0676a(String str) {
                this.f166498a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.z7();
                i.this.N7(this.f166498a);
            }
        }

        public a() {
        }

        @Override // com.prism.gaia.client.stub.t
        public void b(Context context, Intent intent) {
            if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                return;
            }
            i.this.f166494Z.post(new RunnableC0676a(intent.getData().getSchemeSpecificPart()));
        }
    }

    public class b extends v {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f166500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String[] f166501t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Bundle f166502u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f166503v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, IBinder iBinder, String str, boolean z10, String str2, boolean z11, boolean z12, boolean z13, String str3, String[] strArr, Bundle bundle, String str4) {
            super(xVar, iBinder, str, z10, str2, z11, z12, z13);
            this.f166500s = str3;
            this.f166501t = strArr;
            this.f166502u = bundle;
            this.f166503v = str4;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.startAddAccountSession(this.f166586m, this.f166574a.f166563c, this.f166577d, this.f166500s, this.f166501t, this.f166502u);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            String strJoin = TextUtils.join(",", this.f166501t);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.p(j10));
            sb2.append(", startAddAccountSession, accountType ");
            sb2.append(this.f166503v);
            sb2.append(", requiredFeatures ");
            if (this.f166501t == null) {
                strJoin = null;
            }
            sb2.append(strJoin);
            return sb2.toString();
        }
    }

    public class c extends v {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Account f166505s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f166506t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Bundle f166507u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, IBinder iBinder, String str, boolean z10, String str2, boolean z11, boolean z12, boolean z13, Account account, String str3, Bundle bundle) {
            super(xVar, iBinder, str, z10, str2, z11, z12, z13);
            this.f166505s = account;
            this.f166506t = str3;
            this.f166507u = bundle;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.startUpdateCredentialsSession(this.f166586m, this.f166574a.f166563c, this.f166505s, this.f166506t, this.f166507u);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            Bundle bundle = this.f166507u;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.p(j10) + ", startUpdateCredentialsSession, " + this.f166505s + ", authTokenType " + this.f166506t + ", loginOptions " + this.f166507u;
        }
    }

    public class d extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Bundle f166509q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f166510r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, Bundle bundle, String str3) {
            super(xVar, iBinder, str, z10, z11, str2, z12, z13);
            this.f166509q = bundle;
            this.f166510r = str3;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.finishSession(this.f166586m, this.f166574a.f166563c, this.f166577d, this.f166509q);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", finishSession, accountType " + this.f166510r;
        }
    }

    public class e extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Account f166512q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f166513r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, Account account, String str3) {
            super(xVar, iBinder, str, z10, z11, str2, z12, false);
            this.f166512q = account;
            this.f166513r = str3;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            IInterface iInterfaceH = h();
            if (iInterfaceH == null) {
                return;
            }
            if (bundle == null) {
                k(iInterfaceH, 5, "null bundle");
                return;
            }
            if (bundle.getInt("errorCode", -1) > 0) {
                k(iInterfaceH, bundle.getInt("errorCode"), bundle.getString("errorMessage"));
            } else {
                if (!bundle.containsKey("booleanResult")) {
                    k(iInterfaceH, 5, "no result in response");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                m(iInterfaceH, bundle2);
            }
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.isCredentialsUpdateSuggested(this.f166586m, this.f166574a.f166563c, this.f166512q, this.f166513r);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", isCredentialsUpdateSuggested, " + this.f166512q;
        }
    }

    public class f extends o {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f166515y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x xVar, IBinder iBinder, String str, String[] strArr, int i10, String str2, boolean z10, String str3) {
            super(xVar, iBinder, str, strArr, i10, str2, z10);
            this.f166515y = str3;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void j(IInterface iInterface, int i10, String str) throws RemoteException {
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void l(IInterface iInterface, Bundle bundle) throws RemoteException {
            Parcelable[] parcelableArray = bundle.getParcelableArray(com.prism.gaia.server.accounts.b.f166442i);
            Account[] accountArr = new Account[parcelableArray.length];
            for (int i10 = 0; i10 < parcelableArray.length; i10++) {
                accountArr[i10] = (Account) parcelableArray[i10];
            }
            i.this.Z6(iInterface, accountArr, this.f166515y);
        }
    }

    public class g extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Bundle f166517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Account f166518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f166519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f166520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f166521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f166522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f166523w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f166524x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ byte[] f166525y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, Bundle bundle, Account account, String str3, boolean z13, boolean z14, int i10, boolean z15, String str4, byte[] bArr) {
            super(xVar, iBinder, str, z10, z11, str2, z12, false);
            this.f166517q = bundle;
            this.f166518r = account;
            this.f166519s = str3;
            this.f166520t = z13;
            this.f166521u = z14;
            this.f166522v = i10;
            this.f166523w = z15;
            this.f166524x = str4;
            this.f166525y = bArr;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            if (bundle != null) {
                if (bundle.containsKey("authTokenLabelKey")) {
                    Intent intentS7 = i.this.s7(this.f166518r, null, this.f166522v, this.f166576c, this.f166519s, true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("intent", intentS7);
                    c(bundle2);
                    return;
                }
                String string = bundle.getString(com.prism.gaia.server.accounts.b.f166454u);
                if (string != null) {
                    String string2 = bundle.getString("authAccount");
                    String string3 = bundle.getString("accountType");
                    if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string2)) {
                        a(5, "the type and name should not be empty");
                        return;
                    }
                    Account account = new Account(string2, string3);
                    if (!this.f166523w) {
                        i.this.Z7(this.f166588o, account, this.f166519s, string);
                    }
                    long j10 = bundle.getLong(com.prism.gaia.helper.compat.a.f164960a, 0L);
                    if (this.f166523w && j10 > System.currentTimeMillis()) {
                        i.this.a8(this.f166588o, this.f166518r, this.f166524x, this.f166525y, this.f166519s, string, j10);
                    }
                }
            }
            super.c(bundle);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            if (this.f166521u) {
                IAccountAuthenticatorCompat2.Util.getAuthToken(this.f166586m, this.f166574a.f166563c, this.f166518r, this.f166519s, this.f166517q);
            } else {
                IAccountAuthenticatorCompat2.Util.getAuthTokenLabel(this.f166586m, this.f166574a.f166563c, this.f166519s);
            }
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            Bundle bundle = this.f166517q;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.p(j10) + ", getAuthToken, " + this.f166518r + ", authTokenType " + this.f166519s + ", loginOptions " + this.f166517q + ", notifyOnAuthFailure " + this.f166520t;
        }
    }

    public class h extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f166527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String[] f166528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bundle f166529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f166530t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, String str3, String[] strArr, Bundle bundle, String str4) {
            super(xVar, iBinder, str, z10, z11, str2, z12, z13);
            this.f166527q = str3;
            this.f166528r = strArr;
            this.f166529s = bundle;
            this.f166530t = str4;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.addAccount(this.f166586m, this.f166574a.f166563c, this.f166577d, this.f166527q, this.f166528r, this.f166529s);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", addAccount, accountType " + this.f166530t + ", requiredFeatures " + Arrays.toString(this.f166528r);
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.accounts.i$i, reason: collision with other inner class name */
    public class C0677i extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f166532q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String[] f166533r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bundle f166534s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f166535t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0677i(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, String str3, String[] strArr, Bundle bundle, String str4) {
            super(xVar, iBinder, str, z10, z11, str2, z12, z13);
            this.f166532q = str3;
            this.f166533r = strArr;
            this.f166534s = bundle;
            this.f166535t = str4;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.addAccount(this.f166586m, this.f166574a.f166563c, this.f166577d, this.f166532q, this.f166533r, this.f166534s);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.p(j10));
            sb2.append(", addAccount, accountType ");
            sb2.append(this.f166535t);
            sb2.append(", requiredFeatures ");
            String[] strArr = this.f166533r;
            sb2.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb2.toString();
        }
    }

    public class j extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Account f166537q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f166538r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bundle f166539s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, Account account, String str3, Bundle bundle) {
            super(xVar, iBinder, str, z10, z11, str2, z12, z13);
            this.f166537q = account;
            this.f166538r = str3;
            this.f166539s = bundle;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.updateCredentials(this.f166586m, this.f166574a.f166563c, this.f166537q, this.f166538r, this.f166539s);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            Bundle bundle = this.f166539s;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.p(j10) + ", updateCredentials, " + this.f166537q + ", authTokenType " + this.f166538r + ", loginOptions " + this.f166539s;
        }
    }

    public class k extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f166541q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, String str3) {
            super(xVar, iBinder, str, z10, z11, str2, z12, false);
            this.f166541q = str3;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.editProperties(this.f166586m, this.f166574a.f166563c, this.f166577d);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", editProperties, accountType " + this.f166541q;
        }
    }

    public class l extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Account f166543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Bundle f166544r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, Account account, Bundle bundle) {
            super(xVar, iBinder, str, z10, z11, str2, z12, z13);
            this.f166543q = account;
            this.f166544r = bundle;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.confirmCredentials(this.f166586m, this.f166574a.f166563c, this.f166543q, this.f166544r);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", confirmCredentials, " + this.f166543q;
        }
    }

    public class m extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f166546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f166547r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, String str3, String str4) {
            super(xVar, iBinder, str, z10, z11, str2, z12, false);
            this.f166546q = str3;
            this.f166547r = str4;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            if (bundle == null) {
                super.c(bundle);
                return;
            }
            String string = bundle.getString("authTokenLabelKey");
            Bundle bundle2 = new Bundle();
            bundle2.putString("authTokenLabelKey", string);
            super.c(bundle2);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.getAuthTokenLabel(this.f166586m, this.f166574a.f166563c, this.f166547r);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", getAuthTokenLabel, " + this.f166546q + ", authTokenType " + this.f166547r;
        }
    }

    public final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthenticatorDescription f166549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ServiceInfo f166550b;

        public n(AuthenticatorDescription authenticatorDescription, ServiceInfo serviceInfo) {
            this.f166549a = authenticatorDescription;
            this.f166550b = serviceInfo;
        }
    }

    public class o extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String[] f166552q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public volatile Account[] f166553r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public volatile ArrayList<Account> f166554s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public volatile int f166555t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f166556u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final String f166557v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f166558w;

        public o(x xVar, IBinder iBinder, String str, String[] strArr, int i10, String str2, boolean z10) {
            super(xVar, iBinder, str, false, true, null, false, false);
            this.f166553r = null;
            this.f166554s = null;
            this.f166555t = 0;
            this.f166556u = i10;
            this.f166552q = strArr;
            this.f166557v = str2;
            this.f166558w = z10;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            this.f166583j++;
            if (bundle == null) {
                a(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.f166554s.add(this.f166553r[this.f166555t]);
            }
            this.f166555t++;
            r();
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            this.f166553r = i.this.I6(this.f166588o, this.f166577d, this.f166556u, this.f166557v, this.f166558w);
            this.f166554s = new ArrayList<>(this.f166553r.length);
            this.f166555t = 0;
            r();
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.p(j10));
            sb2.append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.f166552q;
            sb2.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb2.toString();
        }

        public void r() {
            if (this.f166555t >= this.f166553r.length) {
                s();
                return;
            }
            IInterface iInterface = this.f166586m;
            if (iInterface == null) {
                return;
            }
            try {
                IAccountAuthenticatorCompat2.Util.hasFeatures(iInterface, this.f166574a.f166563c, this.f166553r[this.f166555t], this.f166552q);
            } catch (RemoteException unused) {
                a(1, "remote exception");
            }
        }

        public void s() {
            IInterface iInterfaceH = h();
            if (iInterfaceH != null) {
                try {
                    int size = this.f166554s.size();
                    Account[] accountArr = new Account[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        accountArr[i10] = this.f166554s.get(i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray(com.prism.gaia.server.accounts.b.f166442i, accountArr);
                    l(iInterfaceH, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f166560d = "android.accounts.IAccountAuthenticatorResponse";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f166561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public E8.a f166562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IInterface f166563c;

        public class a extends E8.a {
            public a(String str, IInterface iInterface) {
                super(str, iInterface);
            }

            @Override // E8.a
            public boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
                if (i10 == 1) {
                    p.this.i(parcel, parcel2);
                } else if (i10 == 2) {
                    p.this.h(parcel, parcel2);
                } else {
                    if (i10 != 3) {
                        return false;
                    }
                    p.this.g(parcel, parcel2);
                }
                return true;
            }
        }

        public static IInterface a(p pVar) {
            return pVar.f166563c;
        }

        public final Binder e() {
            return this.f166562b;
        }

        public final IInterface f() {
            return this.f166563c;
        }

        public final void g(Parcel parcel, Parcel parcel2) throws RemoteException {
            this.f166562b.a(parcel);
            this.f166561a.a(C.e(parcel), parcel.readString());
            this.f166562b.c(parcel2);
        }

        public final void h(Parcel parcel, Parcel parcel2) throws RemoteException {
            this.f166562b.a(parcel);
            this.f166561a.b();
            this.f166562b.c(parcel2);
        }

        public final void i(Parcel parcel, Parcel parcel2) throws RemoteException {
            this.f166562b.a(parcel);
            this.f166561a.c(C.d(parcel));
            this.f166562b.c(parcel2);
        }

        public p(u uVar) {
            this.f166561a = uVar;
            a aVar = new a(f166560d, null);
            this.f166562b = aVar;
            this.f166563c = IAccountAuthenticatorResponseCompat2.Util.asInterface(aVar);
        }
    }

    public class q extends Handler {
        public q(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            throw new IllegalStateException("unhandled message: " + message.what);
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f166567b;

        public r(String str, int i10) {
            this.f166566a = str;
            this.f166567b = i10;
        }
    }

    public static final class s extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f166568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Bundle f166569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile String f166570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public IInterface f166571d;

        public boolean b(long j10) {
            try {
                return this.f166568a.await(j10, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }

        public final /* synthetic */ Object c(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            String name = method.getName();
            name.getClass();
            switch (name) {
                case "onError":
                    if (objArr == null || objArr.length <= 1) {
                        str = "unknown";
                    } else {
                        str = objArr[0] + ": " + objArr[1];
                    }
                    this.f166570c = str;
                    this.f166568a.countDown();
                    break;
                case "onResult":
                    this.f166569b = (objArr == null || objArr.length <= 0) ? null : (Bundle) objArr[0];
                    this.f166568a.countDown();
                    break;
            }
            return null;
        }

        @Override // android.os.Binder, android.os.IBinder
        public IInterface queryLocalInterface(String str) {
            if (this.f166571d == null) {
                Class clsORG_CLASS = IAccountManagerResponseCAG.f165238G.ORG_CLASS();
                if (clsORG_CLASS == null) {
                    return null;
                }
                this.f166571d = (IInterface) Proxy.newProxyInstance(clsORG_CLASS.getClassLoader(), new Class[]{clsORG_CLASS}, new InvocationHandler() { // from class: com.prism.gaia.server.accounts.j
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        return this.f166609a.c(obj, method, objArr);
                    }
                });
            }
            return this.f166571d;
        }

        public s() {
            this.f166568a = new CountDownLatch(1);
        }
    }

    public class t extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Account f166572q;

        public t(x xVar, IBinder iBinder, Account account, boolean z10) {
            super(xVar, iBinder, account.type, z10, true, account.name, false, false);
            this.f166572q = account;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
                if (bundle.getBoolean("booleanResult")) {
                    i.this.K7(this.f166588o, this.f166572q, D9.c.b());
                }
                IInterface iInterfaceH = h();
                if (iInterfaceH != null) {
                    try {
                        l(iInterfaceH, bundle);
                    } catch (RemoteException e10) {
                        String unused = i.f166478c0;
                        e10.getMessage();
                    }
                }
            }
            super.c(bundle);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            IAccountAuthenticatorCompat2.Util.getAccountRemovalAllowed(this.f166586m, this.f166574a.f166563c, this.f166572q);
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            return super.p(j10) + ", removeAccount, account " + this.f166572q;
        }
    }

    public abstract class u implements IBinder.DeathRecipient, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f166574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IBinder f166575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IInterface f166576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f166577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f166578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f166579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f166580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f166581h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f166582i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f166583j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f166584k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f166585l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public IInterface f166586m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f166587n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final x f166588o;

        public u(i iVar, x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12) {
            this(xVar, iBinder, str, z10, z11, str2, z12, false);
        }

        public void a(int i10, String str) {
            this.f166585l++;
            IInterface iInterfaceH = h();
            if (iInterfaceH != null) {
                try {
                    j(iInterfaceH, i10, str);
                } catch (RemoteException unused) {
                }
            }
        }

        public void b() {
            this.f166584k++;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f166576c = null;
            this.f166575b = null;
            g();
        }

        public void c(Bundle bundle) {
            boolean z10 = true;
            com.prism.gaia.helper.compat.d.h(bundle, true);
            this.f166583j++;
            if (bundle != null) {
                boolean z11 = bundle.getBoolean("booleanResult", false);
                boolean z12 = bundle.containsKey("authAccount") && bundle.containsKey("accountType");
                if (!this.f166582i || (!z11 && !z12)) {
                    z10 = false;
                }
                if (z10 || this.f166581h) {
                    boolean zE7 = i.this.e7(this.f166580g, this.f166577d);
                    if (z10 && zE7) {
                        i.this.o8(new Account(this.f166580g, this.f166577d));
                    }
                    if (this.f166581h) {
                        bundle.putLong(com.prism.gaia.helper.compat.a.f164961b, zE7 ? this.f166588o.f166596b.y(new Account(this.f166580g, this.f166577d)) : -1L);
                    }
                }
            }
            Intent intent = bundle != null ? (Intent) bundle.getParcelable("intent") : null;
            IInterface iInterfaceH = (this.f166578e && bundle != null && bundle.containsKey("intent")) ? this.f166576c : h();
            if (iInterfaceH != null) {
                try {
                    if (bundle == null) {
                        j(iInterfaceH, 5, "null bundle returned");
                        return;
                    }
                    if (this.f166587n) {
                        bundle.remove(com.prism.gaia.server.accounts.b.f166454u);
                    }
                    if (bundle.getInt("errorCode", -1) <= 0 || intent != null) {
                        l(iInterfaceH, bundle);
                    } else {
                        j(iInterfaceH, bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void d() {
            if (e(this.f166577d)) {
                return;
            }
            String str = i.f166478c0;
            o();
            a(1, "bind failure");
        }

        public final boolean e(String str) {
            RegisteredServicesCache.e<AuthenticatorDescription> eVarV = i.this.f166490V.v(AuthenticatorDescription.newKey(str), this.f166588o.f166595a);
            if (eVarV != null) {
                if (!i.this.p7(this.f166588o.f166595a) && !eVarV.f166399b.directBootAware) {
                    String str2 = i.f166478c0;
                    Objects.toString(eVarV.f166400c);
                    return false;
                }
                Intent intent = new Intent();
                intent.setAction("android.accounts.AccountAuthenticator");
                intent.setComponent(eVarV.f166400c);
                intent.putExtra(b.c.f68618g, this.f166588o.f166595a);
                if (GaiaContext.j().n().bindService(intent, this, 1)) {
                    return true;
                }
            }
            return false;
        }

        public void f() {
        }

        public final void g() {
            synchronized (i.this.f166489U) {
                try {
                    if (i.this.f166489U.remove(toString()) == null) {
                        return;
                    }
                    if (this.f166576c != null) {
                        this.f166575b.unlinkToDeath(this, 0);
                        this.f166576c = null;
                        this.f166575b = null;
                    }
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public IInterface h() {
            IInterface iInterface = this.f166576c;
            if (iInterface == null) {
                return null;
            }
            g();
            return iInterface;
        }

        public void i() {
            IInterface iInterfaceH = h();
            if (iInterfaceH != null) {
                try {
                    j(iInterfaceH, 1, Jb.d.f58184l);
                } catch (RemoteException unused) {
                }
            }
        }

        public void j(IInterface iInterface, int i10, String str) throws RemoteException {
            i.i6(iInterface, i10, str);
        }

        public void k(IInterface iInterface, int i10, String str) {
            i.j6(iInterface, i10, str);
        }

        public void l(IInterface iInterface, Bundle bundle) throws RemoteException {
            i.k6(iInterface, bundle);
        }

        public void m(IInterface iInterface, Bundle bundle) {
            i.l6(iInterface, bundle);
        }

        public abstract void n() throws RemoteException;

        public String o() {
            return p(SystemClock.elapsedRealtime());
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f166586m = IAccountAuthenticatorCompat2.Util.asInterface(iBinder);
            try {
                n();
            } catch (RemoteException unused) {
                a(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f166586m = null;
            IInterface iInterfaceH = h();
            if (iInterfaceH != null) {
                try {
                    j(iInterfaceH, 1, "disconnected");
                } catch (RemoteException unused) {
                }
            }
        }

        public String p(long j10) {
            StringBuilder sb2 = new StringBuilder("Session: expectLaunch ");
            sb2.append(this.f166578e);
            sb2.append(", connected ");
            sb2.append(this.f166586m != null);
            sb2.append(", stats (");
            sb2.append(this.f166583j);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(this.f166584k);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(this.f166585l);
            sb2.append("), lifetime ");
            sb2.append((j10 - this.f166579f) / 1000.0d);
            return sb2.toString();
        }

        public final void q() {
            if (this.f166586m != null) {
                this.f166586m = null;
                GaiaContext.j().n().unbindService(this);
            }
        }

        public u(x xVar, IBinder iBinder, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13) {
            this.f166583j = 0;
            this.f166584k = 0;
            this.f166585l = 0;
            this.f166586m = null;
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            this.f166574a = new p(this);
            this.f166588o = xVar;
            this.f166587n = z11;
            this.f166575b = iBinder;
            this.f166577d = str;
            this.f166578e = z10;
            this.f166579f = SystemClock.elapsedRealtime();
            this.f166580g = str2;
            this.f166581h = z12;
            this.f166582i = z13;
            synchronized (i.this.f166489U) {
                i.this.f166489U.put(toString(), this);
            }
            if (iBinder != null) {
                try {
                    this.f166576c = IAccountManagerResponseCompat2.Util.asInterface(iBinder);
                    this.f166575b.linkToDeath(this, 0);
                } catch (Throwable th) {
                    String str3 = i.f166478c0;
                    th.getMessage();
                    this.f166576c = null;
                    this.f166575b = null;
                    binderDied();
                }
            }
        }
    }

    public abstract class v extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f166590q;

        public v(x xVar, IBinder iBinder, String str, boolean z10, String str2, boolean z11, boolean z12, boolean z13) {
            super(xVar, iBinder, str, z10, true, str2, z11, z12);
            this.f166590q = z13;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            this.f166583j++;
            Intent intent = bundle != null ? (Intent) bundle.getParcelable("intent") : null;
            IInterface iInterfaceH = (this.f166578e && bundle != null && bundle.containsKey("intent")) ? this.f166576c : h();
            if (iInterfaceH == null) {
                return;
            }
            if (bundle == null) {
                k(iInterfaceH, 5, "null bundle returned");
                return;
            }
            if (bundle.getInt("errorCode", -1) > 0 && intent == null) {
                k(iInterfaceH, bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                return;
            }
            if (!this.f166590q) {
                bundle.remove("password");
            }
            bundle.remove(com.prism.gaia.server.accounts.b.f166454u);
            Bundle bundle2 = bundle.getBundle(com.prism.gaia.helper.compat.a.f164964e);
            if (bundle2 != null) {
                String string = bundle2.getString("accountType");
                if (TextUtils.isEmpty(string) || !this.f166577d.equalsIgnoreCase(string)) {
                    String unused = i.f166478c0;
                }
                bundle2.putString("accountType", this.f166577d);
                try {
                    bundle.putBundle(com.prism.gaia.helper.compat.a.f164964e, com.prism.gaia.server.accounts.e.e().d(bundle2));
                } catch (GeneralSecurityException unused2) {
                    k(iInterfaceH, 5, "failed to encrypt session bundle");
                    return;
                }
            }
            m(iInterfaceH, bundle);
        }
    }

    public class w extends u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String[] f166592q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Account f166593r;

        public w(x xVar, IBinder iBinder, Account account, String[] strArr) {
            super(xVar, iBinder, account.type, false, true, account.name, false, false);
            this.f166592q = strArr;
            this.f166593r = account;
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void c(Bundle bundle) {
            com.prism.gaia.helper.compat.d.h(bundle, true);
            IInterface iInterfaceH = h();
            if (iInterfaceH != null) {
                try {
                    if (bundle == null) {
                        j(iInterfaceH, 5, "null bundle");
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                    l(iInterfaceH, bundle2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public void n() throws RemoteException {
            try {
                IAccountAuthenticatorCompat2.Util.hasFeatures(this.f166586m, this.f166574a.f166563c, this.f166593r, this.f166592q);
            } catch (RemoteException unused) {
                a(1, "remote exception");
            }
        }

        @Override // com.prism.gaia.server.accounts.i.u
        public String p(long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.p(j10));
            sb2.append(", hasFeatures, ");
            sb2.append(this.f166593r);
            sb2.append(U6.j.f68738d);
            String[] strArr = this.f166592q;
            sb2.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb2.toString();
        }
    }

    public static class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f166595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.prism.gaia.server.accounts.b f166596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap<Pair<Pair<Account, String>, Integer>, r> f166597c = new HashMap<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap<Account, r> f166598d = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f166599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f166600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap<String, Account[]> f166601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public HashMap<String, Integer> f166602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Map<Account, Map<String, String>> f166603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Map<Account, Map<String, String>> f166604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final com.prism.gaia.server.accounts.r f166605k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Map<Account, Map<String, Integer>> f166606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Map<String, Map<String, Integer>> f166607m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final HashMap<Account, AtomicReference<String>> f166608n;

        public x(Context context, int i10, File file) {
            Object obj = new Object();
            com.prism.gaia.helper.utils.o.i("accounts.cacheLock", obj);
            this.f166599e = obj;
            Object obj2 = new Object();
            com.prism.gaia.helper.utils.o.h("accounts.dbLock", obj2);
            this.f166600f = obj2;
            this.f166601g = new LinkedHashMap();
            this.f166602h = null;
            this.f166603i = new HashMap();
            this.f166604j = new HashMap();
            this.f166605k = new com.prism.gaia.server.accounts.r();
            this.f166606l = new HashMap();
            this.f166607m = new HashMap();
            this.f166608n = new HashMap<>();
            this.f166595a = i10;
            synchronized (obj2) {
                synchronized (obj) {
                    this.f166596b = com.prism.gaia.server.accounts.b.f(context, i10, file);
                }
            }
        }
    }

    static {
        final i iVar = new i();
        f166481f0 = iVar;
        Objects.requireNonNull(iVar);
        f166482g0 = new p6.d("account", iVar, new d.a() { // from class: com.prism.gaia.server.accounts.f
            @Override // p6.d.a
            public final void a() {
                this.f166475a.l8();
            }
        });
        f166486k0 = new Account[0];
    }

    public static i B6() {
        return f166481f0;
    }

    public static HashMap<String, Integer> K6(AuthenticatorCache authenticatorCache, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (RegisteredServicesCache.e<AuthenticatorDescription> eVar : authenticatorCache.r(i10)) {
            linkedHashMap.put(eVar.f166398a.type, Integer.valueOf(eVar.f166401d));
        }
        return linkedHashMap;
    }

    public static p6.d N6() {
        return f166482g0;
    }

    public static void Q7(IBinder iBinder, int i10, String str) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onError(IAccountManagerResponseCompat2.Util.asInterface(iBinder), i10, str);
    }

    public static void R7(IInterface iInterface, int i10, String str) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onError(iInterface, i10, str);
    }

    public static void S7(IBinder iBinder, int i10, String str) {
        try {
            IAccountManagerResponseCompat2.Util.onError(IAccountManagerResponseCompat2.Util.asInterface(iBinder), i10, str);
        } catch (RemoteException unused) {
        }
    }

    public static void T7(IInterface iInterface, int i10, String str) {
        try {
            IAccountManagerResponseCompat2.Util.onError(iInterface, i10, str);
        } catch (RemoteException unused) {
        }
    }

    public static void U7(IBinder iBinder, Bundle bundle) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onResult(IAccountManagerResponseCompat2.Util.asInterface(iBinder), bundle);
    }

    public static void V7(IInterface iInterface, Bundle bundle) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onResult(iInterface, bundle);
    }

    public static void W7(IBinder iBinder, Bundle bundle) {
        try {
            IAccountManagerResponseCompat2.Util.onResult(IAccountManagerResponseCompat2.Util.asInterface(iBinder), bundle);
        } catch (RemoteException unused) {
        }
    }

    public static void X7(IInterface iInterface, Bundle bundle) {
        try {
            IAccountManagerResponseCompat2.Util.onResult(iInterface, bundle);
        } catch (RemoteException unused) {
        }
    }

    public static void i6(IInterface iInterface, int i10, String str) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onError(iInterface, i10, str);
    }

    public static void j6(IInterface iInterface, int i10, String str) {
        try {
            IAccountManagerResponseCompat2.Util.onError(iInterface, i10, str);
        } catch (RemoteException unused) {
        }
    }

    public static void k6(IInterface iInterface, Bundle bundle) throws RemoteException {
        IAccountManagerResponseCompat2.Util.onResult(iInterface, bundle);
    }

    public static void l6(IInterface iInterface, Bundle bundle) {
        try {
            IAccountManagerResponseCompat2.Util.onResult(iInterface, bundle);
        } catch (RemoteException unused) {
        }
    }

    public static void q8() {
        f166482g0.d();
    }

    @Override // com.prism.gaia.server.M
    public boolean A(Account account, String str, Bundle bundle, Map map) {
        q8();
        com.prism.gaia.helper.compat.d.h(bundle, true);
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        if (!d7(account.type, iM5, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot explicitly add accounts of type: %s", Integer.valueOf(iM5), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return o6(V6(vuserId), account, str, bundle, iM5, map);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @NonNull
    public final Map<Account, Integer> A6(x xVar, @NonNull Map<Account, Integer> map, int i10, @Nullable String str) {
        return map;
    }

    public String A7(x xVar, Account account, String str) {
        String str2;
        synchronized (xVar.f166599e) {
            try {
                Map<String, String> map = xVar.f166604j.get(account);
                if (map != null) {
                    return map.get(str);
                }
                synchronized (xVar.f166600f) {
                    synchronized (xVar.f166599e) {
                        try {
                            Map<String, String> mapT0 = xVar.f166604j.get(account);
                            if (mapT0 == null) {
                                mapT0 = xVar.f166596b.T0(account);
                                xVar.f166604j.put(account, mapT0);
                            }
                            str2 = mapT0.get(str);
                        } finally {
                        }
                    }
                }
                return str2;
            } finally {
            }
        }
    }

    public String B7(x xVar, Account account, String str, String str2, byte[] bArr) {
        String strA;
        synchronized (xVar.f166599e) {
            strA = xVar.f166605k.a(account, str, str2, bArr);
        }
        return strA;
    }

    @Override // com.prism.gaia.server.M
    public String C0(Account account) {
        q8();
        int vuserId = GaiaUserHandle.getVuserId(m5(Binder.getCallingPid()));
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return D7(V6(vuserId), account);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void C2(IBinder iBinder, Account account, boolean z10) {
        w1(iBinder, account, z10, D9.c.c());
    }

    @Override // com.prism.gaia.server.M
    public void C4(IBinder iBinder, Account account, String[] strArr, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        w6(iA, str);
        com.prism.gaia.helper.utils.v.b(account != null, "account cannot be null");
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        com.prism.gaia.helper.utils.v.b(strArr != null, "features cannot be null");
        x6(iA, account.type, vuserId, str);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new w(V6(vuserId), iBinder, account, strArr).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final List<String> C6(Account account, x xVar) {
        List<ResolveInfo> listJ6 = BinderC4171f.h6().J6(new Intent(com.prism.gaia.helper.compat.a.f164969j), null, 0, xVar.f166595a);
        ArrayList arrayList = new ArrayList();
        if (listJ6 != null) {
            Iterator<ResolveInfo> it = listJ6.iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.applicationInfo.packageName;
                int iIntValue = P7(account, str, xVar).intValue();
                if (iIntValue == 1 || iIntValue == 2) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public final String C7(x xVar, Account account) {
        String strP;
        if (account == null || !p7(xVar.f166595a)) {
            return null;
        }
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                strP = xVar.f166596b.P(account.name, account.type);
            }
        }
        return strP;
    }

    @Override // com.prism.gaia.server.M
    public Account[] D(int i10) {
        int iB = D9.c.b();
        if (o7(iB)) {
            return E6(i10);
        }
        throw new SecurityException(C1758e.a("vuid ", iB, " cannot list the accounts of vuser ", i10));
    }

    @Override // com.prism.gaia.server.M
    public boolean D4(Account account, String str, Bundle bundle) {
        return A(account, str, bundle, null);
    }

    public final int D6(Account account, String str, x xVar) {
        int iIntValue;
        synchronized (xVar.f166599e) {
            try {
                Integer num = P6(account, xVar).get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final String D7(x xVar, Account account) {
        if (account == null) {
            return null;
        }
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                AtomicReference<String> atomicReference = xVar.f166608n.get(account);
                if (atomicReference != null) {
                    return atomicReference.get();
                }
                String strG1 = xVar.f166596b.G1(account);
                xVar.f166608n.put(account, new AtomicReference<>(strG1));
                return strG1;
            }
        }
    }

    @Override // com.prism.gaia.server.M
    public void E(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) {
        q8();
        int vuserId = GaiaUserHandle.getVuserId(m5(Binder.getCallingPid()));
        com.prism.gaia.helper.compat.d.h(bundle, true);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        bundle.getString(com.prism.gaia.helper.compat.a.f164963d);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new c(V6(vuserId), iBinder, account.type, z10, account.name, false, true, true, account, str, bundle).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public AuthenticatorDescription[] E1(int i10) {
        AuthenticatorDescription[] authenticatorDescriptionArr;
        q8();
        synchronized (this.f166490V) {
            try {
                this.f166490V.O(i10);
                Collection<RegisteredServicesCache.e<AuthenticatorDescription>> collectionR = this.f166490V.r(i10);
                authenticatorDescriptionArr = new AuthenticatorDescription[collectionR.size()];
                Iterator<RegisteredServicesCache.e<AuthenticatorDescription>> it = collectionR.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    authenticatorDescriptionArr[i11] = it.next().f166398a;
                    i11++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return authenticatorDescriptionArr;
    }

    @NonNull
    public Account[] E6(int i10) {
        q8();
        int iB = D9.c.b();
        List<String> listS6 = S6(iB, i10, true);
        if (((ArrayList) listS6).isEmpty()) {
            return f166486k0;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return J6(V6(i10), iB, null, listS6, false);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final String E7(x xVar, Account account, String str) {
        Map<String, String> map;
        Map<String, String> mapH2;
        synchronized (xVar.f166599e) {
            map = xVar.f166603i.get(account);
        }
        if (map == null) {
            synchronized (xVar.f166600f) {
                synchronized (xVar.f166599e) {
                    try {
                        mapH2 = xVar.f166603i.get(account);
                        if (mapH2 == null) {
                            mapH2 = xVar.f166596b.h2(account);
                            xVar.f166603i.put(account, mapH2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            map = mapH2;
        }
        return map.get(str);
    }

    @Override // com.prism.gaia.server.M
    public Account[] F(String str, int i10, String str2) {
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        if (GaiaUserHandle.isSameApp(iM5, 1000)) {
            return H6(null, vuserId, str, iM5, str2, true);
        }
        throw new SecurityException(C1758e.a("getAccountsForPackage() called from unauthorized uid ", iM5, " with uid=", i10));
    }

    public final com.prism.gaia.server.accounts.a[] F6(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            for (Account account : I6(V6(i10), null, D9.c.b(), null, false)) {
                arrayList.add(new com.prism.gaia.server.accounts.a(account, i10));
            }
        }
        return (com.prism.gaia.server.accounts.a[]) arrayList.toArray(new com.prism.gaia.server.accounts.a[arrayList.size()]);
    }

    public final void F7(x xVar, String str, int i10, Integer num, Map<String, Integer> map) {
        String str2;
        try {
            List<PackageSettingG> listQ6 = BinderC4171f.h6().q6();
            Iterator<PackageSettingG> it = listQ6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                PackageSettingG next = it.next();
                if (GaiaUserHandle.getVuid(xVar.f166595a, next.appId) == i10) {
                    str2 = next.packageName;
                    break;
                }
            }
            String[] list = D9.d.h().list();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AUTHENTICATOR DECLARED GONE -- deleting all accounts of type '");
            sb2.append(str);
            sb2.append("'; vuserId=");
            sb2.append(xVar.f166595a);
            sb2.append("; vuidInDb=");
            sb2.append(i10);
            sb2.append("; vuidNow=");
            Object obj = num;
            if (num == null) {
                obj = "NOT-SCANNED";
            }
            sb2.append(obj);
            sb2.append("; pkgHoldingDbVuid=");
            if (str2 == null) {
                str2 = "NONE-LOADED";
            }
            sb2.append(str2);
            sb2.append("; loadedPackages=");
            sb2.append(((LinkedList) listQ6).size());
            sb2.append("; packagesOnDisk=");
            sb2.append(list == null ? -1 : list.length);
            sb2.append("; liveAuthenticators=");
            sb2.append(map);
            C5705o.c().d(sb2.toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.prism.gaia.server.M
    public void G0(IBinder iBinder, Account account, Bundle bundle, boolean z10, int i10) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.compat.d.h(bundle, true);
        if (g7(iA, i10)) {
            throw new SecurityException(String.format("User %s trying to confirm account credentials for %s", Integer.valueOf(vuserId), Integer.valueOf(i10)));
        }
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new l(V6(i10), iBinder, account.type, z10, true, account.name, true, true, account, bundle).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void G2(IBinder iBinder, Account account, String str) {
        q8();
        int vuserId = GaiaUserHandle.getVuserId(m5(Binder.getCallingPid()));
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("status token is empty");
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new e(V6(vuserId), iBinder, account.type, false, false, account.name, false, account, str).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final Map<Account, Integer> G6(String str, List<String> list, Integer num, x xVar) {
        if (!v7(str, xVar.f166595a)) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : list) {
            synchronized (xVar.f166600f) {
                synchronized (xVar.f166599e) {
                    try {
                        Account[] accountArr = xVar.f166601g.get(str2);
                        if (accountArr != null) {
                            for (Account account : accountArr) {
                                linkedHashMap.put(account, P7(account, str, xVar));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        num.intValue();
        return linkedHashMap;
    }

    public final boolean G7(IBinder iBinder, String str, int i10) {
        if (!"com.google".equals(str) || U6.m.g(i10)) {
            return false;
        }
        try {
            Q7(iBinder, 3, "This copy has not registered with Google yet, so signing in now would tie the account to a device Google does not know and Play would keep answering \"server error\". Open Google Play services > Google device registration, wait for an Android ID to appear, then sign in again.");
            return true;
        } catch (RemoteException unused) {
            return true;
        }
    }

    @NonNull
    public final Account[] H6(String str, int i10, String str2, int i11, String str3, boolean z10) {
        String str4;
        int i12;
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (h7(iA, str2, i10)) {
            throw new SecurityException(C1758e.a("User ", vuserId, " trying to get account for ", i10));
        }
        List<String> listS6 = S6(iA, vuserId, false);
        if (i11 == -1 || (!GaiaUserHandle.isSameApp(iA, 1000) && (str == null || !((ArrayList) listS6).contains(str)))) {
            str4 = str3;
            i12 = iA;
        } else {
            str4 = str2;
            i12 = i11;
        }
        List<String> listS62 = S6(i12, i10, true);
        ArrayList arrayList = (ArrayList) listS62;
        if (arrayList.isEmpty() || !(str == null || arrayList.contains(str))) {
            return f166486k0;
        }
        List<String> list = listS62;
        if (arrayList.contains(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            list = arrayList2;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return J6(V6(i10), i12, str4, list, z10);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void H7(String[] strArr, String str, x xVar) {
        synchronized (xVar.f166607m) {
            if (strArr == null) {
                try {
                    strArr = new String[]{null};
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (String str2 : strArr) {
                Map<String, Integer> map = xVar.f166607m.get(str2);
                if (map == null) {
                    map = new HashMap<>();
                    xVar.f166607m.put(str2, map);
                }
                Integer num = map.get(str);
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                map.put(str, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // com.prism.gaia.server.M
    public Bundle I2(String str, int i10) {
        q8();
        com.prism.gaia.helper.utils.v.b(str != null, "accountType cannot be null");
        int iB = D9.c.b();
        if (o7(iB)) {
            s sVar = new s();
            c1(sVar, str, null, null, false, new Bundle(), i10);
            if (sVar.b(20000L) && sVar.f166570c == null) {
                return sVar.f166569b;
            }
            return null;
        }
        throw new SecurityException("vuid " + iB + " cannot add an account of type " + str + " to vuser " + i10);
    }

    @NonNull
    public Account[] I6(x xVar, String str, int i10, @Nullable String str2, boolean z10) {
        Account[] accountArr;
        q8();
        com.prism.gaia.helper.utils.v.v(!Thread.holdsLock(xVar.f166599e), "Method should not be called with cacheLock");
        if (str != null) {
            synchronized (xVar.f166599e) {
                accountArr = xVar.f166601g.get(str);
            }
            return accountArr == null ? f166486k0 : z6(xVar, (Account[]) Arrays.copyOf(accountArr, accountArr.length), i10, str2, z10);
        }
        synchronized (xVar.f166599e) {
            try {
                Iterator<Account[]> it = xVar.f166601g.values().iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += it.next().length;
                }
                if (length == 0) {
                    return f166486k0;
                }
                Account[] accountArr2 = new Account[length];
                int length2 = 0;
                for (Account[] accountArr3 : xVar.f166601g.values()) {
                    System.arraycopy(accountArr3, 0, accountArr2, length2, accountArr3.length);
                    length2 += accountArr3.length;
                }
                return z6(xVar, accountArr2, i10, str2, z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I7(x xVar, Account account) {
        Account[] accountArr = xVar.f166601g.get(account.type);
        if (accountArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Account account2 : accountArr) {
                if (!account2.equals(account)) {
                    arrayList.add(account2);
                }
            }
            if (arrayList.isEmpty()) {
                xVar.f166601g.remove(account.type);
            } else {
                xVar.f166601g.put(account.type, (Account[]) arrayList.toArray(new Account[arrayList.size()]));
            }
        }
        xVar.f166603i.remove(account);
        xVar.f166604j.remove(account);
        xVar.f166608n.remove(account);
        xVar.f166606l.remove(account);
    }

    @NonNull
    public final Account[] J6(x xVar, int i10, String str, List<String> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            x xVar2 = xVar;
            int i11 = i10;
            String str2 = str;
            boolean z11 = z10;
            Account[] accountArrI6 = I6(xVar2, it.next(), i11, str2, z11);
            if (accountArrI6 != null) {
                arrayList.addAll(Arrays.asList(accountArrI6));
            }
            xVar = xVar2;
            i10 = i11;
            str = str2;
            z10 = z11;
        }
        Account[] accountArr = new Account[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            accountArr[i12] = (Account) arrayList.get(i12);
        }
        return accountArr;
    }

    public void J7(Account account) {
        K7(W6(), account, D9.c.b());
    }

    @Override // com.prism.gaia.server.M
    public boolean K2(Account account, String str, int i10) {
        q8();
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        com.prism.gaia.helper.utils.v.s(str, "packageName cannot be null");
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        if (!d7(account.type, iM5, vuserId) && !o7(iM5)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(iM5), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return e8(account, str, i10, true, V6(vuserId));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean K7(x xVar, Account account, int i10) {
        boolean zO;
        boolean zP7 = p7(xVar.f166595a);
        if (!zP7) {
            Objects.toString(account);
        }
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                try {
                    Map<String, Integer> mapQ6 = Q6(account, xVar);
                    List<String> listC6 = C6(account, xVar);
                    xVar.f166596b.s0();
                    try {
                        long jC1 = xVar.f166596b.C1(account);
                        int i11 = 0;
                        zO = jC1 >= 0 ? xVar.f166596b.o(jC1) : false;
                        if (zP7) {
                            long jF1 = xVar.f166596b.f1(account);
                            if (jF1 >= 0) {
                                xVar.f166596b.n(jF1);
                            }
                        }
                        xVar.f166596b.D2();
                        xVar.f166596b.N2();
                        if (zO) {
                            I7(xVar, account);
                            for (Map.Entry entry : ((HashMap) mapQ6).entrySet()) {
                                if (((Integer) entry.getValue()).intValue() == 1 || ((Integer) entry.getValue()).intValue() == 2) {
                                    t7((String) entry.getKey(), xVar);
                                }
                            }
                            c8(xVar.f166595a);
                            ArrayList arrayList = (ArrayList) listC6;
                            int size = arrayList.size();
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                b8(account, (String) obj, xVar.f166595a);
                            }
                        }
                    } finally {
                        xVar.f166596b.N2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zO;
    }

    @Override // com.prism.gaia.server.M
    public void L0(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        w6(iA, str2);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            if (!C3838b.n(strArr)) {
                new f(xVarV6, iBinder, str, strArr, iA, str2, true, str2).d();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } else {
                Z6(IAccountManagerResponseCompat2.Util.asInterface(iBinder), I6(xVarV6, str, iA, str2, true), str2);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final String L6(int i10) {
        return new File(D9.d.f0(i10), com.prism.gaia.server.accounts.b.f166420N).getPath();
    }

    public void L7(String str, int i10) {
        int[] iArr;
        if (str == null) {
            return;
        }
        if (i10 == -1) {
            synchronized (this.f166491W) {
                try {
                    iArr = new int[this.f166491W.size()];
                    for (int i11 = 0; i11 < this.f166491W.size(); i11++) {
                        iArr[i11] = this.f166491W.keyAt(i11);
                    }
                } finally {
                }
            }
        } else {
            iArr = new int[]{i10};
        }
        List<String> listP6 = p6(str, iArr);
        if (((ArrayList) listP6).isEmpty()) {
            return;
        }
        for (int i12 : iArr) {
            M7(str, i12, listP6);
        }
    }

    @Override // com.prism.gaia.server.M
    public void M0(String[] strArr, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        w6(iA, str);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            H7(strArr, str, V6(vuserId));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void M3(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) {
        q8();
        int callingPid = Binder.getCallingPid();
        int iM5 = m5(callingPid);
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        if (G7(iBinder, str, vuserId)) {
            return;
        }
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putInt("callerUid", iM5);
        bundle2.putInt("callerPid", callingPid);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new h(V6(vuserId), iBinder, str, z10, true, null, false, true, str2, strArr, bundle2, str).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void M4(IBinder iBinder, String str, boolean z10) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        if (!d7(str, iA, vuserId) && !o7(iA)) {
            throw new SecurityException(String.format("uid %s cannot edit authenticator properites for account type: %s", Integer.valueOf(iA), str));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new k(V6(vuserId), iBinder, str, z10, true, null, false, str).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final String M6(int i10) {
        return new File(D9.d.h0(i10), com.prism.gaia.server.accounts.b.f166421O).getPath();
    }

    public final void M7(String str, int i10, List<String> list) {
        Account[] accountArr;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(i10);
            for (String str2 : list) {
                synchronized (xVarV6.f166599e) {
                    Account[] accountArr2 = xVarV6.f166601g.get(str2);
                    accountArr = accountArr2 == null ? null : (Account[]) Arrays.copyOf(accountArr2, accountArr2.length);
                }
                if (accountArr != null) {
                    for (Account account : accountArr) {
                        K7(xVarV6, account, 1000);
                    }
                }
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        } catch (Throwable unused) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void N4(IBinder iBinder, Account account, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot rename accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Account accountO7 = O7(V6(vuserId), account, str);
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", accountO7.name);
            bundle.putString("accountType", accountO7.type);
            bundle.putString(com.prism.gaia.helper.compat.a.f164965f, AccountCompat2.Util.getAccessId(accountO7));
            try {
                U7(iBinder, bundle);
            } catch (RemoteException e10) {
                e10.getMessage();
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void N7(String str) {
        if (n7(str)) {
            return;
        }
        synchronized (this.f166491W) {
            try {
                int size = this.f166491W.size();
                for (int i10 = 0; i10 < size; i10++) {
                    x xVarValueAt = this.f166491W.valueAt(i10);
                    if (BinderC4171f.h6().K0(str, xVarValueAt.f166595a) == -1) {
                        xVarValueAt.f166596b.g(str);
                        synchronized (xVarValueAt.f166600f) {
                            synchronized (xVarValueAt.f166599e) {
                                try {
                                    Iterator<Account> it = xVarValueAt.f166606l.keySet().iterator();
                                    while (it.hasNext()) {
                                        P6(it.next(), xVarValueAt).remove(str);
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final String O6(int i10) {
        int i11;
        String[] strArrP0 = BinderC4171f.h6().P0(i10);
        if (C3838b.n(strArrP0)) {
            return null;
        }
        String str = strArrP0[0];
        if (strArrP0.length == 1) {
            return str;
        }
        int i12 = Integer.MAX_VALUE;
        for (String str2 : strArrP0) {
            ApplicationInfo applicationInfoK4 = BinderC4171f.f167556s0.k4(str2, 0, 0);
            if (applicationInfoK4 != null && (i11 = applicationInfoK4.targetSdkVersion) < i12) {
                str = str2;
                i12 = i11;
            }
        }
        return str;
    }

    public final Account O7(x xVar, Account account, String str) {
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                List<String> listC6 = C6(account, xVar);
                xVar.f166596b.s0();
                Account account2 = new Account(str, account.type);
                try {
                    if (xVar.f166596b.f1(account2) < 0) {
                        long jC1 = xVar.f166596b.C1(account);
                        if (jC1 >= 0) {
                            xVar.f166596b.V2(jC1, str);
                            if (xVar.f166596b.Z2(jC1, str, account.name)) {
                                xVar.f166596b.D2();
                                xVar.f166596b.N2();
                                Account accountB7 = b7(xVar, account2);
                                Map<String, String> map = xVar.f166603i.get(account);
                                Map<String, String> map2 = xVar.f166604j.get(account);
                                Map<String, Integer> map3 = xVar.f166606l.get(account);
                                I7(xVar, account);
                                xVar.f166603i.put(accountB7, map);
                                xVar.f166604j.put(accountB7, map2);
                                xVar.f166606l.put(accountB7, map3);
                                xVar.f166608n.put(accountB7, new AtomicReference<>(account.name));
                                d8(accountB7, xVar);
                                c8(xVar.f166595a);
                                ArrayList arrayList = (ArrayList) listC6;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    b8(account, (String) obj, xVar.f166595a);
                                }
                                return accountB7;
                            }
                            xVar.f166596b.N2();
                        } else {
                            xVar.f166596b.N2();
                        }
                    }
                    return null;
                } finally {
                    xVar.f166596b.N2();
                }
            }
        }
    }

    @NonNull
    public final Map<String, Integer> P6(Account account, x xVar) {
        Map<String, Integer> map = xVar.f166606l.get(account);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        xVar.f166606l.put(account, map2);
        return map2;
    }

    public final Integer P7(Account account, @NonNull String str, x xVar) {
        com.prism.gaia.helper.utils.v.s(str, "packageName cannot be null");
        int iK0 = BinderC4171f.h6().K0(str, xVar.f166595a);
        if (iK0 < 0) {
            return 3;
        }
        if (o7(iK0)) {
            return 1;
        }
        int iV6 = v6(account.type, iK0, xVar.f166595a);
        if (iV6 == 2) {
            return 1;
        }
        int iD6 = D6(account, str, xVar);
        if (iD6 != 0) {
            return Integer.valueOf(iD6);
        }
        if (m7(iK0)) {
            return 1;
        }
        boolean zK7 = k7(str);
        if (iV6 == 0 && !zK7) {
            n6(account.type, xVar.f166595a);
        }
        int iD62 = D6(account, com.prism.gaia.helper.compat.a.f164976q, xVar);
        return Integer.valueOf(iD62 != 0 ? iD62 : 2);
    }

    @Override // com.prism.gaia.server.M
    public void Q3(Account account, String str, String str2) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (str == null) {
            throw new IllegalArgumentException("key is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot set user data for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            if (m6(xVarV6, account)) {
                g8(xVarV6, account, str, str2);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public Account[] Q4(String str, int i10, String str2) {
        q8();
        w6(D9.c.b(), str2);
        return H6(str, i10, str2, -1, str2, false);
    }

    public final Map<String, Integer> Q6(Account account, x xVar) {
        HashSet<String> hashSet = new HashSet();
        synchronized (xVar.f166607m) {
            try {
                String[] strArr = {account.type, null};
                for (int i10 = 0; i10 < 2; i10++) {
                    Map<String, Integer> map = xVar.f166607m.get(strArr[i10]);
                    if (map != null) {
                        hashSet.addAll(map.keySet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map2 = new HashMap();
        for (String str : hashSet) {
            map2.put(str, P7(account, str, xVar));
        }
        return map2;
    }

    @Override // com.prism.gaia.server.M
    public boolean R3(Account account) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot notify authentication for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            V6(vuserId);
            return o8(account);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @NonNull
    public com.prism.gaia.server.accounts.a[] R6() {
        q8();
        return F6(GaiaUserManagerService.e6().j6());
    }

    @Override // com.prism.gaia.server.M
    public void S0(Account account, String str, int i10, boolean z10) throws RemoteException {
        q8();
        if (o7(m5(Binder.getCallingPid()))) {
            throw new SecurityException();
        }
        if (z10) {
            Y6(account, str, i10);
        } else {
            Y7(account, str, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.prism.gaia.server.accounts.i] */
    @Override // com.prism.gaia.server.M
    public Map<Account, Integer> S3(String str, String str2) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        boolean zO7 = o7(iA);
        ?? S62 = S6(iA, vuserId, zO7);
        if ((str2 != null && !((ArrayList) S62).contains(str2)) || (str2 == null && !zO7)) {
            throw new SecurityException("getAccountsAndVisibilityForPackage() called from unauthorized uid " + iA + " with packageName=" + str);
        }
        if (str2 != null) {
            S62 = new ArrayList();
            S62.add(str2);
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return G6(str, S62, Integer.valueOf(iA), V6(vuserId));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final List<String> S6(int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<RegisteredServicesCache.e<AuthenticatorDescription>> collectionR = this.f166490V.r(i11);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            for (RegisteredServicesCache.e<AuthenticatorDescription> eVar : collectionR) {
                if (z10 || BinderC4171f.h6().x6(eVar.f166401d, i10, PackageParserCompat2.Util.SigningDetails.CertCapabilities.AUTH)) {
                    arrayList.add(eVar.f166398a.type);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // com.prism.gaia.server.M
    public void T4(IBinder iBinder, Bundle bundle, boolean z10, Bundle bundle2, int i10) {
        q8();
        int callingPid = Binder.getCallingPid();
        int iM5 = m5(callingPid);
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        com.prism.gaia.helper.compat.d.h(bundle, true);
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        if (bundle == null || bundle.size() == 0) {
            throw new IllegalArgumentException("sessionBundle is empty");
        }
        if (g7(iM5, i10)) {
            throw new SecurityException(String.format("User %s trying to finish session for %s without cross user permission", Integer.valueOf(vuserId), Integer.valueOf(i10)));
        }
        try {
            Bundle bundleC = com.prism.gaia.server.accounts.e.e().c(bundle);
            if (bundleC == null) {
                S7(iBinder, 8, "failed to decrypt session bundle");
                return;
            }
            String string = bundleC.getString("accountType");
            if (TextUtils.isEmpty(string)) {
                S7(iBinder, 7, "accountType is empty");
                return;
            }
            if (bundle2 != null) {
                bundleC.putAll(bundle2);
            }
            bundleC.putInt("callerUid", iM5);
            bundleC.putInt("callerPid", callingPid);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new d(V6(i10), iBinder, string, z10, true, null, false, true, bundleC, string).d();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (GeneralSecurityException unused) {
            S7(iBinder, 8, "failed to decrypt session bundle");
        }
    }

    public final List<String> T6(int i10, int i11) {
        return S6(i10, i11, false);
    }

    public final List<String> U6(int i10, int i11, String str) {
        return S6(i10, i11, true);
    }

    public x V6(int i10) {
        x xVar;
        boolean z10;
        synchronized (this.f166491W) {
            try {
                xVar = this.f166491W.get(i10);
                if (xVar == null) {
                    x xVar2 = new x(GaiaContext.j().n(), i10, new File(M6(i10)));
                    this.f166492X.put(i10, true);
                    this.f166491W.append(i10, xVar2);
                    xVar = xVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } finally {
            }
        }
        synchronized (xVar.f166600f) {
            if (z10) {
                try {
                    y7(xVar);
                } finally {
                }
            }
            if (!xVar.f166596b.R2() && this.f166492X.get(i10)) {
                synchronized (xVar.f166599e) {
                    xVar.f166596b.e(new File(L6(i10)));
                }
                k8(xVar);
            }
            if (z10) {
                p8(xVar, true);
            }
        }
        return xVar;
    }

    public final x W6() {
        return V6(D9.c.c());
    }

    public final SparseBooleanArray X6(int i10) {
        List<PackageSettingG> listQ6 = BinderC4171f.h6().q6();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(((LinkedList) listQ6).size());
        Iterator<PackageSettingG> it = listQ6.iterator();
        while (it.hasNext()) {
            sparseBooleanArray.put(GaiaUserHandle.getVuid(i10, it.next().appId), true);
        }
        return sparseBooleanArray;
    }

    @Override // com.prism.gaia.server.M
    public int Y(Account account, String str) {
        q8();
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        com.prism.gaia.helper.utils.v.s(str, "packageName cannot be null");
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        if (!d7(account.type, iM5, vuserId) && !o7(iM5)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(iM5), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            if (com.prism.gaia.helper.compat.a.f164976q.equals(str)) {
                int iD6 = D6(account, str, xVarV6);
                if (iD6 != 0) {
                    return iD6;
                }
                return 2;
            }
            if (!com.prism.gaia.helper.compat.a.f164977r.equals(str)) {
                return P7(account, str, xVarV6).intValue();
            }
            int iD62 = D6(account, str, xVarV6);
            if (iD62 != 0) {
                return iD62;
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return 4;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void Y6(Account account, String str, int i10) {
        if (account == null || str == null) {
            new Exception();
            return;
        }
        x xVarV6 = V6(GaiaUserHandle.getVuserId(i10));
        synchronized (xVarV6.f166600f) {
            synchronized (xVarV6.f166599e) {
                try {
                    long jC1 = xVarV6.f166596b.C1(account);
                    if (jC1 >= 0) {
                        xVarV6.f166596b.F2(jC1, str, i10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void Y7(Account account, String str, int i10) {
        if (account == null || str == null) {
            new Exception();
            return;
        }
        x xVarV6 = V6(GaiaUserHandle.getVuserId(i10));
        synchronized (xVarV6.f166600f) {
            synchronized (xVarV6.f166599e) {
                xVarV6.f166596b.s0();
                try {
                    long jC1 = xVarV6.f166596b.C1(account);
                    if (jC1 >= 0) {
                        xVarV6.f166596b.p(jC1, str, i10);
                        xVarV6.f166596b.D2();
                    }
                    xVarV6.f166596b.N2();
                } catch (Throwable th) {
                    xVarV6.f166596b.N2();
                    throw th;
                }
            }
        }
    }

    public final void Z6(IInterface iInterface, Account[] accountArr, String str) throws RemoteException {
        if (r7(accountArr, str)) {
            j8(iInterface, accountArr, str);
            return;
        }
        if (accountArr.length != 1) {
            IAccountManagerResponseCompat2.Util.onResult(iInterface, new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        IAccountManagerResponseCompat2.Util.onResult(iInterface, bundle);
    }

    public final boolean Z7(x xVar, Account account, String str, String str2) {
        if (account == null || str == null) {
            return false;
        }
        synchronized (xVar.f166600f) {
            xVar.f166596b.s0();
            try {
                long jC1 = xVar.f166596b.C1(account);
                if (jC1 < 0) {
                    xVar.f166596b.N2();
                } else {
                    xVar.f166596b.m(jC1, str);
                    if (xVar.f166596b.m2(jC1, str, str2) >= 0) {
                        xVar.f166596b.D2();
                        xVar.f166596b.N2();
                        synchronized (xVar.f166599e) {
                            r8(xVar, account, str, str2);
                        }
                        return true;
                    }
                    xVar.f166596b.N2();
                }
                return false;
            } catch (Throwable th) {
                xVar.f166596b.N2();
                throw th;
            }
        }
    }

    @Override // com.prism.gaia.server.M
    public String a0(Account account, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("key is null");
        }
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot get user data for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            if (m6(xVarV6, account)) {
                return E7(xVarV6, account, str);
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean a7(Account account, String str, int i10) {
        boolean z10 = true;
        if (o7(i10)) {
            return true;
        }
        x xVarV6 = V6(GaiaUserHandle.getVuserId(i10));
        synchronized (xVarV6.f166600f) {
            synchronized (xVarV6.f166599e) {
                try {
                    if ((str != null ? xVarV6.f166596b.N1(i10, str, account) : xVarV6.f166596b.V1(i10, account)) <= 0) {
                        z10 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z10;
    }

    public final void a8(x xVar, Account account, String str, byte[] bArr, String str2, String str3, long j10) {
        if (account == null || str2 == null || str == null || bArr == null) {
            return;
        }
        synchronized (xVar.f166599e) {
            xVar.f166605k.b(account, str3, str2, str, bArr, j10);
        }
    }

    @Override // com.prism.gaia.server.M
    public Account[] b2(String str, String str2) {
        return Q4(str, D9.c.c(), str2);
    }

    public final Account b7(x xVar, Account account) {
        Account[] accountArr = xVar.f166601g.get(account.type);
        int length = accountArr != null ? accountArr.length : 0;
        Account[] accountArr2 = new Account[length + 1];
        if (accountArr != null) {
            System.arraycopy(accountArr, 0, accountArr2, 0, length);
        }
        String accessId = AccountCompat2.Util.getAccessId(account);
        if (accessId == null) {
            accessId = UUID.randomUUID().toString();
        }
        accountArr2[length] = AccountCompat2.Util.ctor(account.name, account.type, accessId);
        xVar.f166601g.put(account.type, accountArr2);
        return accountArr2[length];
    }

    public final void b8(Account account, String str, int i10) {
        Intent intent = new Intent(com.prism.gaia.helper.compat.a.f164969j);
        intent.setFlags(16777216);
        intent.setPackage(str);
        intent.putExtra("authAccount", account.name);
        intent.putExtra("accountType", account.type);
        x7(intent, i10);
    }

    @Override // com.prism.gaia.server.M
    public String c0(Account account) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return C7(V6(vuserId), account);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void c1(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle, int i10) {
        Bundle bundle2 = bundle;
        q8();
        int callingPid = Binder.getCallingPid();
        int iM5 = m5(callingPid);
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        com.prism.gaia.helper.compat.d.h(bundle2, true);
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        com.prism.gaia.helper.utils.v.b(str != null, "accountType cannot be null");
        if (g7(iM5, i10)) {
            throw new SecurityException(String.format("User %s trying to add account for %s", Integer.valueOf(vuserId), Integer.valueOf(i10)));
        }
        if (G7(iBinder, str, i10)) {
            return;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        Bundle bundle3 = bundle2;
        bundle3.putInt("callerUid", iM5);
        bundle3.putInt("callerPid", callingPid);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new C0677i(V6(i10), iBinder, str, z10, true, null, false, true, str2, strArr, bundle3, str).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void c5(IBinder iBinder, String str, String str2) throws RemoteException {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.b(str != null, "accountType cannot be null");
        com.prism.gaia.helper.utils.v.b(str2 != null, "authTokenType cannot be null");
        Binder.clearCallingIdentity();
        if (o7(iA)) {
            throw new SecurityException("can only call from system");
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new m(V6(vuserId), iBinder, str, false, false, null, false, str, str2).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final List<Pair<Account, String>> c7(x xVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorX0 = xVar.f166596b.X0(str, str2);
        while (cursorX0.moveToNext()) {
            try {
                String string = cursorX0.getString(0);
                String string2 = cursorX0.getString(1);
                String string3 = cursorX0.getString(2);
                xVar.f166596b.k(string);
                arrayList.add(Pair.create(new Account(string2, str), string3));
            } finally {
                cursorX0.close();
            }
        }
        return arrayList;
    }

    public final void c8(int i10) {
        Intent intent = new Intent(com.prism.gaia.helper.compat.a.f164968i);
        intent.setFlags(IntentCompat2.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT | 16777216);
        intent.getAction();
        x7(intent, i10);
        q6(i10);
    }

    public final boolean d7(String str, int i10, int i11) {
        if (str == null) {
            return false;
        }
        return ((ArrayList) S6(i10, i11, false)).contains(str);
    }

    public final void d8(Account account, x xVar) {
        for (Map.Entry entry : ((HashMap) Q6(account, xVar)).entrySet()) {
            if (((Integer) entry.getValue()).intValue() != 3 && ((Integer) entry.getValue()).intValue() != 4) {
                t7((String) entry.getKey(), xVar);
            }
        }
    }

    public final boolean e7(String str, String str2) {
        x xVarW6 = W6();
        if (xVarW6.f166601g.containsKey(str2)) {
            for (Account account : xVarW6.f166601g.get(str2)) {
                if (account.name.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e8(Account account, String str, int i10, boolean z10, x xVar) {
        List listC6;
        Map mapQ6;
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                try {
                    if (!z10) {
                        if (!n7(str) && !v7(str, xVar.f166595a)) {
                            return false;
                        }
                        mapQ6 = Collections.EMPTY_MAP;
                        listC6 = Collections.EMPTY_LIST;
                    } else if (n7(str)) {
                        mapQ6 = Q6(account, xVar);
                        listC6 = C6(account, xVar);
                    } else {
                        if (!v7(str, xVar.f166595a)) {
                            return false;
                        }
                        HashMap map = new HashMap();
                        map.put(str, P7(account, str, xVar));
                        ArrayList arrayList = new ArrayList();
                        mapQ6 = map;
                        listC6 = arrayList;
                        if (h8(account, str, xVar)) {
                            arrayList.add(str);
                            mapQ6 = map;
                            listC6 = arrayList;
                        }
                    }
                    if (!n8(account, str, i10, xVar)) {
                        return false;
                    }
                    if (z10) {
                        for (Map.Entry entry : mapQ6.entrySet()) {
                            if (q7(((Integer) entry.getValue()).intValue()) != q7(P7(account, str, xVar).intValue())) {
                                t7((String) entry.getKey(), xVar);
                            }
                        }
                        Iterator it = listC6.iterator();
                        while (it.hasNext()) {
                            b8(account, (String) it.next(), xVar.f166595a);
                        }
                        c8(xVar.f166595a);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean f7(String str, int i10, int i11, String str2) {
        if (str == null) {
            return false;
        }
        return ((ArrayList) S6(i10, i11, true)).contains(str);
    }

    public final void f8(x xVar, Account account, String str, int i10) {
        boolean z10;
        if (account == null) {
            return;
        }
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                try {
                    xVar.f166596b.s0();
                    try {
                        long jC1 = xVar.f166596b.C1(account);
                        if (jC1 >= 0) {
                            xVar.f166596b.q3(jC1, str);
                            xVar.f166596b.l(jC1);
                            xVar.f166604j.remove(account);
                            xVar.f166605k.c(account);
                            xVar.f166596b.D2();
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            d8(account, xVar);
                            c8(xVar.f166595a);
                        }
                    } finally {
                        xVar.f166596b.N2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean g7(int i10, int i11) {
        if (i11 == GaiaUserHandle.getVuserId(i10) || o7(i10)) {
            return false;
        }
        String strA4 = BinderC4171f.h6().a4(i10);
        return strA4 == null || !a7.c.l(strA4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g8(com.prism.gaia.server.accounts.i.x r9, android.accounts.Account r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.f166600f
            monitor-enter(r0)
            com.prism.gaia.server.accounts.b r1 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r1.s0()     // Catch: java.lang.Throwable -> L1b
            com.prism.gaia.server.accounts.b r1 = r9.f166596b     // Catch: java.lang.Throwable -> L37
            long r1 = r1.C1(r10)     // Catch: java.lang.Throwable -> L37
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            com.prism.gaia.server.accounts.b r9 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r9.N2()     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r9 = move-exception
            goto L63
        L1d:
            com.prism.gaia.server.accounts.b r5 = r9.f166596b     // Catch: java.lang.Throwable -> L37
            long r5 = r5.M1(r1, r11)     // Catch: java.lang.Throwable -> L37
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L39
            com.prism.gaia.server.accounts.b r5 = r9.f166596b     // Catch: java.lang.Throwable -> L37
            long r1 = r5.z2(r1, r11, r12)     // Catch: java.lang.Throwable -> L37
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L47
            com.prism.gaia.server.accounts.b r9 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r9.N2()     // Catch: java.lang.Throwable -> L1b
            goto L19
        L37:
            r10 = move-exception
            goto L5d
        L39:
            com.prism.gaia.server.accounts.b r1 = r9.f166596b     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.v3(r5, r12)     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L47
            com.prism.gaia.server.accounts.b r9 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r9.N2()     // Catch: java.lang.Throwable -> L1b
            goto L19
        L47:
            com.prism.gaia.server.accounts.b r1 = r9.f166596b     // Catch: java.lang.Throwable -> L37
            r1.D2()     // Catch: java.lang.Throwable -> L37
            com.prism.gaia.server.accounts.b r1 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r1.N2()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r9.f166599e     // Catch: java.lang.Throwable -> L1b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1b
            r8.s8(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L5a:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r9     // Catch: java.lang.Throwable -> L1b
        L5d:
            com.prism.gaia.server.accounts.b r9 = r9.f166596b     // Catch: java.lang.Throwable -> L1b
            r9.N2()     // Catch: java.lang.Throwable -> L1b
            throw r10     // Catch: java.lang.Throwable -> L1b
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.accounts.i.g8(com.prism.gaia.server.accounts.i$x, android.accounts.Account, java.lang.String, java.lang.String):void");
    }

    @Override // com.prism.gaia.server.M
    public boolean h(Account account) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        if (account == null) {
            return false;
        }
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot explicitly remove accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        x xVarW6 = W6();
        xVarW6.f166596b.C1(account);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return K7(xVarW6, account, iA);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean h7(int i10, String str, int i11) {
        if (i11 == GaiaUserHandle.getVuserId(i10) || o7(i10)) {
            return false;
        }
        return str == null || !a7.c.l(str);
    }

    public final boolean h8(Account account, String str, x xVar) {
        int iIntValue = P7(account, str, xVar).intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            Intent intent = new Intent(com.prism.gaia.helper.compat.a.f164969j);
            intent.setFlags(16777216);
            intent.setPackage(str);
            List<ResolveInfo> listJ6 = BinderC4171f.f167556s0.J6(intent, intent.getType(), 0, xVar.f166595a);
            if (listJ6 != null && listJ6.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i7(String str, int i10, String... strArr) {
        return true;
    }

    public final void i8(int i10, int i11) {
    }

    @Override // com.prism.gaia.server.M
    public void j5(IBinder iBinder, String str, String[] strArr, String str2) throws RemoteException {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        w6(iA, str2);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        if (!((ArrayList) S6(iA, vuserId, true)).contains(str)) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(com.prism.gaia.server.accounts.b.f166442i, f166486k0);
            try {
                U7(iBinder, bundle);
                return;
            } catch (RemoteException e10) {
                e10.getMessage();
                return;
            }
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            if (strArr != null && strArr.length != 0) {
                new o(xVarV6, iBinder, str, strArr, iA, str2, false).d();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return;
            }
            Account[] accountArrI6 = I6(xVarV6, str, iA, str2, false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArray(com.prism.gaia.server.accounts.b.f166442i, accountArrI6);
            U7(iBinder, bundle2);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final boolean j7(String str, int i10, int i11, String... strArr) {
        return true;
    }

    public final void j8(IInterface iInterface, Account[] accountArr, String str) throws RemoteException {
        Arrays.asList(accountArr);
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(Resources.getSystem().getString(ResCAG.f165977G.string.config_chooseAccountActivity().get()));
        if (componentNameUnflattenFromString == null) {
            IAccountManagerResponseCompat2.Util.onError(iInterface, 4, "fatal error: no config_chooseAccountActivity found");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(componentNameUnflattenFromString.getPackageName(), componentNameUnflattenFromString.getClassName());
        intent.putExtra(com.prism.gaia.server.accounts.b.f166442i, accountArr);
        intent.putExtra("accountManagerResponse", (Parcelable) AccountManagerResponseCompat2.Util.ctor(iInterface));
        intent.putExtra(com.prism.gaia.helper.compat.a.f164963d, str);
        GaiaContext.j().n().startActivity(intent);
    }

    public final boolean k7(String str) {
        PackageG packageGL6 = BinderC4171f.h6().l6(str);
        return packageGL6 != null && packageGL6.f167508k.targetSdkVersion < 26;
    }

    public final void k8(x xVar) {
        List<Account> listH1 = xVar.f166596b.h1();
        ArrayList arrayList = (ArrayList) listH1;
        if (arrayList.isEmpty()) {
            return;
        }
        listH1.toString();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            K7(xVar, (Account) obj, 1000);
        }
    }

    @Override // com.prism.gaia.server.M
    public String l3(Account account, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        com.prism.gaia.helper.utils.v.s(str, "authTokenType cannot be null");
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot peek the authtokens associated with accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        if (!p7(vuserId)) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return A7(V6(vuserId), account, str);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean l7(int i10) {
        return false;
    }

    public final void l8() {
        Context contextN = GaiaContext.j().n();
        this.f166492X.put(0, true);
        GaiaUserManagerService.f6().d();
        BinderC4171f.j6().d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        HandlerThread handlerThread = new HandlerThread("account_manager_handler");
        this.f166493Y = handlerThread;
        handlerThread.start();
        this.f166494Z = new q(this.f166493Y.getLooper());
        AuthenticatorCache authenticatorCache = new AuthenticatorCache(contextN);
        this.f166490V = authenticatorCache;
        authenticatorCache.N(this, this.f166494Z);
        C3840d.a(contextN, this.f166496b0, intentFilter);
    }

    @Override // com.prism.gaia.server.M
    public void m3(IBinder iBinder, Account account, String str, boolean z10, boolean z11, Bundle bundle) throws RemoteException {
        String str2;
        x xVar;
        Account account2;
        String strA7;
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.compat.d.h(bundle, true);
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        try {
            if (account == null) {
                Q7(iBinder, 7, "account is null");
                return;
            }
            if (str == null) {
                Q7(iBinder, 7, "authTokenType is null");
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                x xVarV6 = V6(vuserId);
                RegisteredServicesCache.e<AuthenticatorDescription> eVarV = this.f166490V.v(AuthenticatorDescription.newKey(account.type), xVarV6.f166595a);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                boolean z12 = eVarV != null && eVarV.f166398a.customTokens;
                boolean z13 = z12 || w7(account, str, iA, vuserId);
                String string = bundle.getString(com.prism.gaia.helper.compat.a.f164963d);
                jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    List listAsList = Arrays.asList(BinderC4171f.h6().P0(iA));
                    if (string == null || !listAsList.contains(string)) {
                        throw new SecurityException(String.format("Uid %s is attempting to illegally masquerade as package %s!", Integer.valueOf(iA), string));
                    }
                    bundle.putInt("callerUid", iA);
                    bundle.putInt("callerPid", Binder.getCallingPid());
                    if (z10) {
                        bundle.putBoolean(com.prism.gaia.helper.compat.a.f164962c, true);
                    }
                    jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        byte[] bArrR6 = r6(string);
                        if (!z12 && z13 && (strA7 = A7(xVarV6, account, str)) != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(com.prism.gaia.server.accounts.b.f166454u, strA7);
                            bundle2.putString("authAccount", account.name);
                            bundle2.putString("accountType", account.type);
                            U7(iBinder, bundle2);
                            return;
                        }
                        if (z12) {
                            xVar = xVarV6;
                            account2 = account;
                            String strB7 = B7(xVar, account2, str, string, bArrR6);
                            str2 = string;
                            if (strB7 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString(com.prism.gaia.server.accounts.b.f166454u, strB7);
                                bundle3.putString("authAccount", account2.name);
                                bundle3.putString("accountType", account2.type);
                                U7(iBinder, bundle3);
                                return;
                            }
                        } else {
                            str2 = string;
                            xVar = xVarV6;
                            account2 = account;
                        }
                        new g(xVar, iBinder, account2.type, z11, false, account2.name, false, bundle, account2, str, z10, z13, iA, z12, str2, bArrR6).d();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (RemoteException e10) {
            e10.toString();
        }
    }

    public final int m5(int i10) {
        return com.prism.gaia.server.am.q.p6().m5(i10);
    }

    public final boolean m6(x xVar, Account account) {
        synchronized (xVar.f166599e) {
            try {
                if (xVar.f166601g.containsKey(account.type)) {
                    for (Account account2 : xVar.f166601g.get(account.type)) {
                        if (account2.name.equals(account.name)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m7(int i10) {
        return i10 == 1000;
    }

    public final void m8(String[] strArr, String str, x xVar) {
        synchronized (xVar.f166607m) {
            if (strArr == null) {
                try {
                    strArr = new String[]{null};
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (String str2 : strArr) {
                Map<String, Integer> map = xVar.f166607m.get(str2);
                if (map == null || map.get(str) == null) {
                    throw new IllegalArgumentException("attempt to unregister wrong receiver");
                }
                Integer num = map.get(str);
                if (num.intValue() == 1) {
                    map.remove(str);
                } else {
                    map.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }

    public final boolean n6(String str, int i10) {
        if (str == null) {
            return false;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<RegisteredServicesCache.e<AuthenticatorDescription>> collectionR = this.f166490V.r(i10);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            for (RegisteredServicesCache.e<AuthenticatorDescription> eVar : collectionR) {
                if (str.equals(eVar.f166398a.type)) {
                    String str2 = eVar.f166398a.packageName;
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final boolean n7(String str) {
        return com.prism.gaia.helper.compat.a.f164976q.equals(str) || com.prism.gaia.helper.compat.a.f164977r.equals(str);
    }

    public final boolean n8(Account account, String str, int i10, x xVar) {
        long jC1 = xVar.f166596b.C1(account);
        if (jC1 < 0) {
            return false;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            if (!xVar.f166596b.k3(jC1, str, i10)) {
                return false;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            P6(account, xVar).put(str, Integer.valueOf(i10));
            return true;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    @Override // com.prism.gaia.server.M
    public Map<String, Integer> o3(Account account) {
        Map<String, Integer> mapP6;
        q8();
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        if (!d7(account.type, iM5, vuserId) && !o7(iM5)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for account %s", Integer.valueOf(iM5), account));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            synchronized (xVarV6.f166600f) {
                synchronized (xVarV6.f166599e) {
                    mapP6 = P6(account, xVarV6);
                }
            }
            return mapP6;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public Account[] o4(String str, String str2, String str3) {
        int iM5 = m5(Binder.getCallingPid());
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        w6(iM5, str3);
        int iK0 = BinderC4171f.f167556s0.K0(str2, vuserId);
        return iK0 == -1 ? f166486k0 : (GaiaUserHandle.isSameApp(iM5, 1000) || str == null || d7(str, iM5, vuserId)) ? (GaiaUserHandle.isSameApp(iM5, 1000) || str != null) ? H6(str, vuserId, str2, iK0, str3, true) : H6(str, vuserId, str2, iK0, str3, false) : f166486k0;
    }

    public final boolean o6(x xVar, Account account, String str, Bundle bundle, int i10, Map<String, Integer> map) {
        com.prism.gaia.helper.compat.d.h(bundle, true);
        if (account == null) {
            return false;
        }
        if (!p7(xVar.f166595a)) {
            account.toString();
            return false;
        }
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                xVar.f166596b.s0();
                try {
                    if (xVar.f166596b.f1(account) >= 0) {
                        account.toString();
                    } else {
                        long jN2 = xVar.f166596b.n2(account, str);
                        if (jN2 < 0) {
                            account.toString();
                            xVar.f166596b.N2();
                        } else {
                            if (xVar.f166596b.p2(account, jN2) >= 0) {
                                if (bundle != null) {
                                    for (String str2 : bundle.keySet()) {
                                        if (xVar.f166596b.z2(jN2, str2, bundle.getString(str2)) < 0) {
                                            account.toString();
                                            xVar.f166596b.N2();
                                        }
                                    }
                                }
                                if (map != null) {
                                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                                        e8(account, entry.getKey(), entry.getValue().intValue(), false, xVar);
                                    }
                                }
                                xVar.f166596b.D2();
                                b7(xVar, account);
                                d8(account, xVar);
                                c8(xVar.f166595a);
                                return true;
                            }
                            account.toString();
                            xVar.f166596b.N2();
                        }
                    }
                    return false;
                } finally {
                    xVar.f166596b.N2();
                }
            }
        }
    }

    public final boolean o7(int i10) {
        return i10 == 1000;
    }

    public final boolean o8(Account account) {
        boolean zM3;
        x xVarW6 = W6();
        synchronized (xVarW6.f166600f) {
            synchronized (xVarW6.f166599e) {
                zM3 = xVarW6.f166596b.m3(account);
            }
        }
        return zM3;
    }

    @Override // com.prism.gaia.server.M
    public void p(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) {
        q8();
        int vuserId = GaiaUserHandle.getVuserId(m5(Binder.getCallingPid()));
        com.prism.gaia.helper.compat.d.h(bundle, true);
        if (iBinder == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new j(V6(vuserId), iBinder, account.type, z10, true, account.name, false, true, account, str, bundle).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public boolean p5(Account account, int i10) {
        q8();
        com.prism.gaia.helper.utils.v.b(account != null, "account cannot be null");
        int iB = D9.c.b();
        if (o7(iB)) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return K7(V6(i10), account, iB);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        throw new SecurityException("vuid " + iB + " cannot remove " + account + " from vuser " + i10);
    }

    public final List<String> p6(String str, int[] iArr) {
        for (int i10 : iArr) {
            this.f166490V.C(i10);
            ArrayList arrayList = new ArrayList();
            for (RegisteredServicesCache.e<AuthenticatorDescription> eVar : this.f166490V.r(i10)) {
                AuthenticatorDescription authenticatorDescription = eVar.f166398a;
                if (authenticatorDescription != null && str.equals(authenticatorDescription.packageName)) {
                    arrayList.add(eVar.f166398a.type);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return new ArrayList();
    }

    public final boolean p7(int i10) {
        if (C3841e.p()) {
            return D9.e.b().k().isUserUnlocked(Process.myUserHandle());
        }
        return true;
    }

    public final void p8(x xVar, boolean z10) {
        boolean z11;
        LinkedHashMap linkedHashMap;
        if (z10) {
            this.f166490V.C(xVar.f166595a);
        }
        HashMap<String, Integer> mapK6 = K6(this.f166490V, xVar.f166595a);
        synchronized (xVar.f166599e) {
            try {
                HashMap<String, Integer> map = xVar.f166602h;
                if (map == null || !map.equals(mapK6)) {
                    HashMap<String, Integer> map2 = new HashMap<>(mapK6);
                    boolean zP7 = p7(xVar.f166595a);
                    synchronized (xVar.f166600f) {
                        try {
                            com.prism.gaia.server.accounts.b bVar = xVar.f166596b;
                            Map<String, Integer> mapY1 = bVar.Y1();
                            HashSet hashSet = new HashSet();
                            SparseBooleanArray sparseBooleanArrayX6 = null;
                            for (Map.Entry entry : ((LinkedHashMap) mapY1).entrySet()) {
                                String str = (String) entry.getKey();
                                int iIntValue = ((Integer) entry.getValue()).intValue();
                                Integer num = mapK6.get(str);
                                if (num == null || iIntValue != num.intValue()) {
                                    if (sparseBooleanArrayX6 == null) {
                                        sparseBooleanArrayX6 = X6(xVar.f166595a);
                                    }
                                    SparseBooleanArray sparseBooleanArray = sparseBooleanArrayX6;
                                    if (!sparseBooleanArray.get(iIntValue)) {
                                        F7(xVar, str, iIntValue, num, map2);
                                        hashSet.add(str);
                                        bVar.r(str, iIntValue);
                                    }
                                    sparseBooleanArrayX6 = sparseBooleanArray;
                                } else {
                                    mapK6.remove(str);
                                }
                            }
                            for (Map.Entry<String, Integer> entry2 : mapK6.entrySet()) {
                                bVar.H2(entry2.getKey(), entry2.getValue().intValue());
                            }
                            Map<Long, Account> mapL0 = bVar.L0();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                Iterator it = ((LinkedHashMap) mapL0).entrySet().iterator();
                                boolean z12 = false;
                                while (it.hasNext()) {
                                    try {
                                        Map.Entry entry3 = (Map.Entry) it.next();
                                        LinkedHashMap linkedHashMap4 = linkedHashMap3;
                                        long jLongValue = ((Long) entry3.getKey()).longValue();
                                        Account account = (Account) entry3.getValue();
                                        Iterator it2 = it;
                                        if (hashSet.contains(account.type)) {
                                            Map<String, Integer> mapQ6 = Q6(account, xVar);
                                            List<String> listC6 = C6(account, xVar);
                                            bVar.s0();
                                            try {
                                                bVar.o(jLongValue);
                                                if (zP7) {
                                                    bVar.n(jLongValue);
                                                }
                                                bVar.D2();
                                                bVar.N2();
                                                try {
                                                    arrayList.add(account);
                                                    for (Map.Entry entry4 : ((HashMap) mapQ6).entrySet()) {
                                                        if (q7(((Integer) entry4.getValue()).intValue())) {
                                                            arrayList2.add((String) entry4.getKey());
                                                        }
                                                    }
                                                    ArrayList arrayList4 = (ArrayList) listC6;
                                                    int size = arrayList4.size();
                                                    int i10 = 0;
                                                    while (i10 < size) {
                                                        Object obj = arrayList4.get(i10);
                                                        i10++;
                                                        ArrayList arrayList5 = arrayList4;
                                                        arrayList3.add(new Object[]{account, (String) obj});
                                                        arrayList4 = arrayList5;
                                                    }
                                                    z12 = true;
                                                    linkedHashMap = linkedHashMap4;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z11 = true;
                                                    if (z11) {
                                                        c8(xVar.f166595a);
                                                    }
                                                    throw th;
                                                }
                                            } finally {
                                                bVar.N2();
                                            }
                                        } else {
                                            linkedHashMap = linkedHashMap4;
                                            ArrayList arrayList6 = (ArrayList) linkedHashMap.get(account.type);
                                            if (arrayList6 == null) {
                                                arrayList6 = new ArrayList();
                                                linkedHashMap.put(account.type, arrayList6);
                                            }
                                            arrayList6.add(account.name);
                                        }
                                        linkedHashMap3 = linkedHashMap;
                                        it = it2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = z12;
                                    }
                                }
                                Iterator it3 = linkedHashMap3.entrySet().iterator();
                                while (it3.hasNext()) {
                                    Map.Entry entry5 = (Map.Entry) it3.next();
                                    String str2 = (String) entry5.getKey();
                                    ArrayList arrayList7 = (ArrayList) entry5.getValue();
                                    int size2 = arrayList7.size();
                                    Account[] accountArr = new Account[size2];
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        accountArr[i11] = AccountCompat2.Util.ctor((String) arrayList7.get(i11), str2, UUID.randomUUID().toString());
                                        i11++;
                                        it3 = it3;
                                        arrayList7 = arrayList7;
                                    }
                                    linkedHashMap2.put(str2, accountArr);
                                    it3 = it3;
                                }
                                Map<Account, Map<String, Integer>> mapO0 = bVar.O0();
                                synchronized (xVar.f166599e) {
                                    try {
                                        xVar.f166601g.clear();
                                        xVar.f166601g.putAll(linkedHashMap2);
                                        int size3 = arrayList.size();
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            Object obj2 = arrayList.get(i12);
                                            i12++;
                                            Account account2 = (Account) obj2;
                                            xVar.f166603i.remove(account2);
                                            xVar.f166604j.remove(account2);
                                            xVar.f166605k.c(account2);
                                            xVar.f166606l.remove(account2);
                                        }
                                        xVar.f166606l.putAll(mapO0);
                                        xVar.f166602h = map2;
                                    } finally {
                                    }
                                }
                                int size4 = arrayList2.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Object obj3 = arrayList2.get(i13);
                                    i13++;
                                    t7((String) obj3, xVar);
                                }
                                int size5 = arrayList3.size();
                                int i14 = 0;
                                while (i14 < size5) {
                                    Object obj4 = arrayList3.get(i14);
                                    i14++;
                                    Object[] objArr = (Object[]) obj4;
                                    b8((Account) objArr[0], (String) objArr[1], xVar.f166595a);
                                }
                                if (z12) {
                                    c8(xVar.f166595a);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = false;
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.prism.gaia.server.M
    public void q1(Account account, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot set secrets for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f8(V6(vuserId), account, str, iA);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void q6(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f166495a0) > f166487l0) {
            this.f166495a0 = jCurrentTimeMillis;
            x7(new Intent("android.server.checkin.CHECKIN_NOW"), i10);
        }
    }

    public final boolean q7(int i10) {
        return i10 == 1 || i10 == 2;
    }

    @Override // com.prism.gaia.server.M
    public void r4(Account account) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot clear passwords for accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            f8(V6(vuserId), account, null, iA);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] r6(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L26
            com.prism.gaia.server.pm.f r2 = com.prism.gaia.server.pm.BinderC4171f.h6()     // Catch: java.security.NoSuchAlgorithmException -> L26
            r3 = 64
            r4 = 0
            android.content.pm.PackageInfo r6 = r2.r6(r6, r3, r4)     // Catch: java.security.NoSuchAlgorithmException -> L26
            if (r6 != 0) goto L15
            goto L26
        L15:
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.security.NoSuchAlgorithmException -> L26
            int r2 = r6.length     // Catch: java.security.NoSuchAlgorithmException -> L26
        L18:
            if (r4 >= r2) goto L27
            r3 = r6[r4]     // Catch: java.security.NoSuchAlgorithmException -> L26
            byte[] r3 = r3.toByteArray()     // Catch: java.security.NoSuchAlgorithmException -> L26
            r1.update(r3)     // Catch: java.security.NoSuchAlgorithmException -> L26
            int r4 = r4 + 1
            goto L18
        L26:
            r1 = r0
        L27:
            if (r1 != 0) goto L2a
            goto L2e
        L2a:
            byte[] r0 = r1.digest()
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.accounts.i.r6(java.lang.String):byte[]");
    }

    public final boolean r7(Account[] accountArr, String str) {
        return accountArr.length >= 1 && (accountArr.length > 1 || P7(accountArr[0], str, V6(D9.c.c())).intValue() == 4);
    }

    public void r8(x xVar, Account account, String str, String str2) {
        Map<String, String> mapT0 = xVar.f166604j.get(account);
        if (mapT0 == null) {
            mapT0 = xVar.f166596b.T0(account);
            xVar.f166604j.put(account, mapT0);
        }
        if (str2 == null) {
            mapT0.remove(str);
        } else {
            mapT0.put(str, str2);
        }
    }

    @Override // com.prism.gaia.server.M
    public void s(Account account, String str, String str2) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        com.prism.gaia.helper.utils.v.s(str, "authTokenType cannot be null");
        if (!d7(account.type, iA, vuserId)) {
            throw new SecurityException(String.format("uid %s cannot set auth tokens associated with accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Z7(V6(vuserId), account, str, str2);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public Map<String, Integer> s1(Account account, int i10) {
        Map<String, Integer> mapP6;
        q8();
        com.prism.gaia.helper.utils.v.s(account, "account cannot be null");
        int iB = D9.c.b();
        if (!o7(iB)) {
            throw new SecurityException("vuid " + iB + " cannot read the visibility of " + account + " in vuser " + i10);
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(i10);
            synchronized (xVarV6.f166600f) {
                synchronized (xVarV6.f166599e) {
                    mapP6 = P6(account, xVarV6);
                }
            }
            return mapP6;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean s6(int i10, int i11) {
        return true;
    }

    public final Intent s7(Account account, String str, int i10, IInterface iInterface, String str2, boolean z10) {
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(Resources.getSystem().getString(ResCAG.f165977G.string.config_chooseAccountActivity().get()));
        if (componentNameUnflattenFromString == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName(componentNameUnflattenFromString.getPackageName(), componentNameUnflattenFromString.getClassName());
        if (z10) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public void s8(x xVar, Account account, String str, String str2) {
        Map<String, String> mapH2 = xVar.f166603i.get(account);
        if (mapH2 == null) {
            mapH2 = xVar.f166596b.h2(account);
            xVar.f166603i.put(account, mapH2);
        }
        if (str2 == null) {
            mapH2.remove(str);
        } else {
            mapH2.put(str, str2);
        }
    }

    @Override // com.prism.gaia.server.M
    public void t2(String[] strArr, String str) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        w6(iA, str);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            m8(strArr, str, V6(vuserId));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean t6(int i10, String str, int i11) {
        return true;
    }

    public final void t7(String str, x xVar) {
        Intent intent = new Intent(com.prism.gaia.helper.compat.a.f164970k);
        intent.setPackage(str);
        intent.setFlags(1073741824);
        x7(intent, xVar.f166595a);
    }

    public final boolean u6(String str, int i10, int i11) {
        return true;
    }

    @Override // com.prism.gaia.server.accounts.p
    /* JADX INFO: renamed from: u7, reason: merged with bridge method [inline-methods] */
    public void U0(AuthenticatorDescription authenticatorDescription, int i10, boolean z10) {
        p8(V6(i10), false);
    }

    public final int v6(String str, int i10, int i11) {
        if (str == null) {
            return 0;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<RegisteredServicesCache.e<AuthenticatorDescription>> collectionR = this.f166490V.r(i11);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            for (RegisteredServicesCache.e<AuthenticatorDescription> eVar : collectionR) {
                if (str.equals(eVar.f166398a.type)) {
                    if (eVar.f166401d == i10) {
                        return 2;
                    }
                    if (BinderC4171f.h6().x6(eVar.f166401d, i10, PackageParserCompat2.Util.SigningDetails.CertCapabilities.AUTH)) {
                        return 1;
                    }
                }
            }
            return 0;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final boolean v7(String str, int i10) {
        return -1 != BinderC4171f.h6().K0(str, i10);
    }

    @Override // com.prism.gaia.server.M
    public void w(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) {
        q8();
        int callingPid = Binder.getCallingPid();
        int iM5 = m5(callingPid);
        int vuserId = GaiaUserHandle.getVuserId(iM5);
        com.prism.gaia.helper.compat.d.h(bundle, true);
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        com.prism.gaia.helper.utils.v.b(str != null, "accountType cannot be null");
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putInt("callerUid", iM5);
        bundle2.putInt("callerPid", callingPid);
        if (bundle != null) {
            bundle.getString(com.prism.gaia.helper.compat.a.f164963d);
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new b(V6(vuserId), iBinder, str, z10, null, false, true, true, str2, strArr, bundle2, str).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.prism.gaia.server.M
    public void w1(IBinder iBinder, Account account, boolean z10, int i10) {
        int iA = com.prism.gaia.server.accounts.h.a(this);
        int vuserId = GaiaUserHandle.getVuserId(iA);
        com.prism.gaia.helper.utils.v.b(account != null, "account cannot be null");
        com.prism.gaia.helper.utils.v.b(iBinder != null, "response cannot be null");
        if (g7(iA, i10)) {
            throw new SecurityException(String.format("User %s tying remove account for %s", Integer.valueOf(vuserId), Integer.valueOf(i10)));
        }
        if (!d7(account.type, iA, i10) && !o7(iA) && !m7(iA)) {
            throw new SecurityException(String.format("uid %s cannot remove accounts of type: %s", Integer.valueOf(iA), account.type));
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        x xVarV6 = V6(i10);
        xVarV6.f166596b.C1(account);
        try {
            new t(xVarV6, iBinder, account, z10).d();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void w6(int i10, String str) {
        if (C3838b.d(BinderC4171f.h6().P0(i10), str)) {
            return;
        }
        throw new SecurityException("Package " + str + " does not belong to " + i10);
    }

    public final boolean w7(Account account, String str, int i10, int i11) {
        if (o7(i10)) {
            return true;
        }
        if (account == null || !d7(account.type, i10, i11)) {
            return account != null && a7(account, str, i10);
        }
        return true;
    }

    @Override // com.prism.gaia.server.M
    public void x5(String str, String str2) {
        q8();
        int vuserId = GaiaUserHandle.getVuserId(m5(Binder.getCallingPid()));
        com.prism.gaia.helper.utils.v.s(str, "accountType cannot be null");
        com.prism.gaia.helper.utils.v.s(str2, "authToken cannot be null");
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            x xVarV6 = V6(vuserId);
            synchronized (xVarV6.f166600f) {
                xVarV6.f166596b.s0();
                try {
                    List<Pair<Account, String>> listC7 = c7(xVarV6, str, str2);
                    xVarV6.f166596b.D2();
                    xVarV6.f166596b.N2();
                    synchronized (xVarV6.f166599e) {
                        try {
                            ArrayList arrayList = (ArrayList) listC7;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                Pair pair = (Pair) obj;
                                r8(xVarV6, (Account) pair.first, (String) pair.second, null);
                            }
                            xVarV6.f166605k.d(str, str2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    xVarV6.f166596b.N2();
                    throw th2;
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void x6(int i10, String str, int i11, String str2) {
        if (!f7(str, i10, i11, str2)) {
            throw new SecurityException(String.format("caller uid %s cannot access %s accounts", Integer.valueOf(i10), str));
        }
    }

    public final void x7(final Intent intent, final int i10) {
        q qVar = this.f166494Z;
        if (qVar == null) {
            com.prism.gaia.server.am.q.p6().Z6(intent, i10);
        } else {
            qVar.post(new Runnable() { // from class: com.prism.gaia.server.accounts.g
                @Override // java.lang.Runnable
                public final void run() {
                    com.prism.gaia.server.am.q.p6().Z6(intent, i10);
                }
            });
        }
    }

    public final boolean y6(String str, int i10, int i11) {
        return true;
    }

    public final void y7(x xVar) {
        synchronized (xVar.f166600f) {
            synchronized (xVar.f166599e) {
                try {
                    ArrayList arrayList = (ArrayList) xVar.f166596b.N0();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        int iIntValue = ((Integer) obj).intValue();
                        if (BinderC4171f.h6().a4(iIntValue) == null) {
                            xVar.f166596b.q(iIntValue);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @NonNull
    public final Account[] z6(x xVar, Account[] accountArr, int i10, @Nullable String str, boolean z10) {
        if (str == null) {
            str = O6(i10);
        }
        if (str == null) {
            return accountArr;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : accountArr) {
            Integer numP7 = P7(account, str, xVar);
            int iIntValue = numP7.intValue();
            if (iIntValue == 1 || iIntValue == 2 || (z10 && iIntValue == 4)) {
                linkedHashMap.put(account, numP7);
            }
        }
        return (Account[]) linkedHashMap.keySet().toArray(new Account[linkedHashMap.size()]);
    }

    public final void z7() {
        synchronized (this.f166491W) {
            for (int i10 = 0; i10 < this.f166491W.size(); i10++) {
                try {
                    y7(this.f166491W.valueAt(i10));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
