package com.prism.gaia.server.am;

import android.app.Notification;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.prism.gaia.os.GaiaUserHandle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class G extends Binder {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f166698q = "asdf-".concat(G.class.getSimpleName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f166699r = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceInfo f166700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166701b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Notification f166707h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProcessRecordG f166710k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f166715p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B8.a<Intent.FilterComparison, B> f166711l = new B8.a<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B8.a<IBinder, ArrayList<C4150i>> f166712m = new B8.a<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<a> f166713n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<a> f166714o = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f166702c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f166703d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f166704e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f166705f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f166708i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f166709j = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f166716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f166717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Intent f166718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f166719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f166720e;

        public a(int i10, G g10, Intent intent) {
            this(i10, g10, intent, null);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            U6.j.F(sb2, "id", Integer.valueOf(this.f166716a));
            U6.j.F(sb2, "intent", this.f166718c);
            U6.j.F(sb2, "deliveryFlags", Integer.valueOf(this.f166720e));
            U6.j.F(sb2, "record", this.f166717b);
            U6.j.G(sb2);
            sb2.append(")");
            return sb2.toString();
        }

        public a(int i10, G g10, Intent intent, Bundle bundle) {
            this.f166716a = i10;
            this.f166717b = g10;
            this.f166718c = intent;
            this.f166719d = bundle;
        }
    }

    public G(ServiceInfo serviceInfo, int i10) {
        this.f166700a = serviceInfo;
        this.f166701b = i10;
    }

    public void a(int i10) {
        for (int size = this.f166714o.size() - 1; size >= 0; size--) {
            if (this.f166714o.get(size).f166716a == i10) {
                this.f166714o.remove(size);
            }
        }
    }

    public boolean b(ProcessRecordG processRecordG) {
        ProcessRecordG processRecordG2 = this.f166710k;
        if (processRecordG2 != null) {
            return processRecordG2.equals(processRecordG) && this.f166701b == processRecordG.f166735e;
        }
        this.f166710k = processRecordG;
        return true;
    }

    public a c(int i10) {
        for (int size = this.f166714o.size() - 1; size >= 0; size--) {
            if (this.f166714o.get(size).f166716a == i10) {
                return this.f166714o.get(size);
            }
        }
        return null;
    }

    public String d() {
        return this.f166700a.packageName;
    }

    public String e() {
        if (this.f166702c == null) {
            return this.f166700a.processName;
        }
        return this.f166700a.processName + com.prism.gaia.server.accounts.b.f166434b0 + this.f166702c;
    }

    public int f() {
        return this.f166703d;
    }

    public int g() {
        return this.f166700a.applicationInfo.uid;
    }

    public int h() {
        return GaiaUserHandle.getVuserId(g());
    }

    public boolean i() {
        int size = this.f166712m.size() - 1;
        while (true) {
            if (size < 0) {
                return false;
            }
            ArrayList<C4150i> arrayListP = this.f166712m.p(size);
            for (int i10 = 0; i10 < arrayListP.size(); i10++) {
                if ((arrayListP.get(i10).f166909d & 1) != 0) {
                    return true;
                }
            }
            size--;
        }
    }

    public int j() {
        int i10 = this.f166703d + 1;
        this.f166703d = i10;
        if (i10 < 1) {
            this.f166703d = 1;
        }
        return this.f166703d;
    }

    public C4146e k(Intent intent, ProcessRecordG processRecordG) {
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        B b10 = this.f166711l.get(filterComparison);
        if (b10 == null) {
            b10 = new B(this, filterComparison);
            this.f166711l.put(filterComparison, b10);
        }
        C4146e c4146e = b10.f166657c.get(processRecordG);
        if (c4146e != null) {
            return c4146e;
        }
        C4146e c4146e2 = new C4146e(this, b10, processRecordG);
        b10.f166657c.put(processRecordG, c4146e2);
        return c4146e2;
    }

    public void l(@Nullable String str) {
        this.f166702c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        U6.j.F(sb2, BidResponsed.KEY_TOKEN, U6.j.L(this));
        U6.j.F(sb2, "lastStartId", Integer.valueOf(this.f166703d));
        U6.j.F(sb2, "startRequested", Boolean.valueOf(this.f166704e));
        U6.j.F(sb2, "destroying", Boolean.valueOf(this.f166705f));
        U6.j.F(sb2, "bindingsNum", Integer.valueOf(this.f166711l.size()));
        U6.j.F(sb2, "connectionsNum", Integer.valueOf(this.f166712m.size()));
        U6.j.F(sb2, "foregroundId", Integer.valueOf(this.f166706g));
        U6.j.F(sb2, "pendingStartsNum", Integer.valueOf(this.f166713n.size()));
        U6.j.F(sb2, "instanceName", this.f166702c);
        U6.j.F(sb2, "app", this.f166710k);
        U6.j.H(sb2, "serviceInfo", this.f166700a);
        U6.j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }
}
