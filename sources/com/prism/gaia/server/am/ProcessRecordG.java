package com.prism.gaia.server.am;

import android.os.IInterface;
import android.text.TextUtils;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.server.GProcessSupervisorProvider;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ProcessRecordG {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f166730t = "asdf-".concat(ProcessRecordG.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f166735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f166736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f166738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.prism.gaia.client.a f166739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public X6.w f166740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IInterface f166741k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f166743m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActivityRecordG f166747q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B8.b<C4150i> f166744n = new B8.b<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B8.b<ReceiverListG> f166745o = new B8.b<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B8.b<BinderC4149h> f166746p = new B8.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<G> f166748r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set<String> f166749s = new LinkedHashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Status f166742l = Status.starting;

    public enum Status {
        starting,
        attached,
        bound,
        dead
    }

    public ProcessRecordG(String str, String str2, String str3, int i10, int i11) {
        this.f166731a = str;
        this.f166732b = str2;
        this.f166733c = str3;
        this.f166734d = i10;
        this.f166735e = i11;
        this.f166736f = GaiaUserHandle.getVuserId(i10);
    }

    public void a(int i10, String str, com.prism.gaia.client.a aVar, X6.w wVar, IInterface iInterface) {
        this.f166737g = i10;
        this.f166738h = str;
        this.f166739i = aVar;
        this.f166740j = wVar;
        this.f166741k = iInterface;
        if (p()) {
            this.f166742l = Status.attached;
        }
    }

    public boolean b() {
        com.prism.gaia.client.a aVar;
        if (p()) {
            return true;
        }
        Status status = this.f166742l;
        Status status2 = Status.dead;
        if (status != status2 && (aVar = this.f166739i) != null && aVar.asBinder().isBinderAlive()) {
            return true;
        }
        this.f166742l = status2;
        return false;
    }

    public synchronized boolean c() {
        if (this.f166743m) {
            return false;
        }
        this.f166743m = true;
        return true;
    }

    public IInterface d() {
        return this.f166741k;
    }

    public com.prism.gaia.client.a e() {
        return this.f166739i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProcessRecordG.class == obj.getClass()) {
            ProcessRecordG processRecordG = (ProcessRecordG) obj;
            return this.f166735e == processRecordG.f166735e && this.f166734d == processRecordG.f166734d && TextUtils.equals(this.f166732b, processRecordG.f166732b);
        }
        return false;
    }

    public String f() {
        return this.f166738h;
    }

    public X6.w g() {
        if (p()) {
            GProcessSupervisorProvider.Z(this);
        }
        return this.f166740j;
    }

    public int h() {
        return this.f166737g;
    }

    public GUri i() {
        return U6.c.F().r(this.f166733c);
    }

    public boolean j() {
        return this.f166742l == Status.bound;
    }

    public boolean k() {
        return this.f166742l == Status.attached;
    }

    public boolean l() {
        return this.f166742l == Status.dead;
    }

    public boolean m() {
        return (this.f166734d == 1000 || U6.c.h0(this.f166735e)) ? false : true;
    }

    public boolean n() {
        return this.f166734d == 1000 && this.f166731a.equals(this.f166732b);
    }

    public boolean o() {
        return U6.c.h0(this.f166735e);
    }

    public boolean p() {
        return this.f166742l == Status.starting;
    }

    public boolean q() {
        return this.f166734d == 1000 && this.f166732b.endsWith(U6.c.I());
    }

    public synchronized void r() {
        this.f166743m = false;
    }

    public boolean s() {
        return U6.c.W(this.f166733c);
    }

    public void t() {
        this.f166742l = Status.bound;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        U6.j.F(sb2, "pid", Integer.valueOf(this.f166737g));
        U6.j.F(sb2, GProcessClient.f164190q, Integer.valueOf(this.f166734d));
        U6.j.F(sb2, GProcessClient.f164191r, Integer.valueOf(this.f166735e));
        U6.j.F(sb2, "packageName", this.f166731a);
        U6.j.F(sb2, GProcessClient.f164193t, this.f166732b);
        U6.j.F(sb2, "spacePkgName", this.f166733c);
        U6.j.F(sb2, "clientId", this.f166738h);
        com.prism.gaia.client.a aVar = this.f166739i;
        U6.j.F(sb2, "processClient", aVar == null ? null : aVar.asBinder());
        IInterface iInterface = this.f166741k;
        U6.j.F(sb2, "appMainThread", iInterface == null ? null : iInterface.asBinder());
        X6.w wVar = this.f166740j;
        U6.j.F(sb2, "guestAppClient", wVar != null ? wVar.asBinder() : null);
        U6.j.F(sb2, "status", this.f166742l);
        U6.j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    public void u() {
        this.f166742l = Status.dead;
    }
}
