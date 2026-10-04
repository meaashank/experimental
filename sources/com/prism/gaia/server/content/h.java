package com.prism.gaia.server.content;

import C4.q;
import android.accounts.Account;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import com.prism.gaia.naked.compat.android.content.ContentResolverCompat2;
import com.prism.gaia.server.content.j;
import com.prism.gaia.server.pm.BinderC4171f;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes6.dex */
public class h implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f167204q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f167205r = -2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f167206s = -3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f167207t = -4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f167208u = -5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f167209v = -6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f167210w = -7;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f167211x = -8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String[] f167212y = {"DataSettingsChanged", "AccountsUpdated", "ServiceChanged", "Periodic", "IsSyncable", "AutoSync", "MasterSyncAuto", "UserStart"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f167213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f167215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f167216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f167217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f167218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f167220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f167221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f167222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j.e f167223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f167224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f167225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f167226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f167227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f167228p;

    public h(Account account, int i10, int i11, int i12, String str, Bundle bundle, long j10, long j11, long j12, long j13, boolean z10) {
        this.f167215c = null;
        this.f167213a = account;
        this.f167214b = str;
        this.f167216d = i10;
        this.f167217e = i11;
        this.f167218f = i12;
        this.f167219g = z10;
        Bundle bundle2 = new Bundle(bundle);
        this.f167220h = bundle2;
        a(bundle2);
        this.f167226n = j13;
        this.f167225m = Long.valueOf(j12);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 < 0 || e()) {
            this.f167222j = true;
            this.f167224l = jElapsedRealtime;
            this.f167228p = 0L;
        } else {
            this.f167222j = false;
            this.f167224l = jElapsedRealtime + j10;
            this.f167228p = j11;
        }
        k();
        this.f167221i = j();
    }

    public static void c(Bundle bundle, StringBuilder sb2) {
        sb2.append("[");
        for (String str : bundle.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(bundle.get(str));
            sb2.append(q.f17581a);
        }
        sb2.append("]");
    }

    public static String h(PackageManager packageManager, int i10) {
        if (i10 < 0) {
            int i11 = (-i10) - 1;
            String[] strArr = f167212y;
            return i11 >= strArr.length ? String.valueOf(i10) : strArr[i11];
        }
        if (packageManager == null) {
            return String.valueOf(i10);
        }
        String[] strArrP0 = BinderC4171f.h6().P0(i10);
        if (strArrP0 != null && strArrP0.length == 1) {
            return strArrP0[0];
        }
        String strA4 = BinderC4171f.f167556s0.a4(i10);
        return strA4 != null ? strA4 : String.valueOf(i10);
    }

    public final void a(Bundle bundle) {
        i(bundle, "upload");
        i(bundle, u4.g.f239555d);
        i(bundle, "ignore_settings");
        i(bundle, "ignore_backoff");
        i(bundle, "do_not_retry");
        i(bundle, "discard_deletions");
        i(bundle, j.f167272m0);
        i(bundle, "deletions_override");
        i(bundle, ContentResolverCompat2.Util.getSyncExtrasDisallowMetered());
        bundle.remove(ContentResolverCompat2.Util.getSyncExtrasExpectedUpload());
        bundle.remove(ContentResolverCompat2.Util.getSyncExtrasExpectedDownload());
    }

    public String b(PackageManager packageManager, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f167213a.name);
        sb2.append(" u");
        sb2.append(this.f167216d);
        sb2.append(" (");
        sb2.append(this.f167213a.type);
        sb2.append("), ");
        sb2.append(this.f167214b);
        sb2.append(U6.j.f68738d);
        sb2.append(j.f167254U[this.f167218f]);
        sb2.append(", latestRunTime ");
        sb2.append(this.f167224l);
        if (this.f167222j) {
            sb2.append(", EXPEDITED");
        }
        sb2.append(", reason: ");
        sb2.append(h(packageManager, this.f167217e));
        if (!z10 && !this.f167220h.keySet().isEmpty()) {
            sb2.append("\n    ");
            c(this.f167220h, sb2);
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        h hVar = (h) obj;
        boolean z10 = this.f167222j;
        if (z10 != hVar.f167222j) {
            return z10 ? -1 : 1;
        }
        long jMax = Math.max(this.f167227o - this.f167228p, 0L);
        long jMax2 = Math.max(hVar.f167227o - hVar.f167228p, 0L);
        if (jMax < jMax2) {
            return -1;
        }
        return jMax2 < jMax ? 1 : 0;
    }

    public boolean d() {
        return this.f167220h.getBoolean("ignore_backoff", false);
    }

    public boolean e() {
        return this.f167220h.getBoolean(j.f167272m0, false) || this.f167222j;
    }

    public boolean f() {
        return this.f167220h.getBoolean(MobileAdsBridgeBase.initializeMethodName, false);
    }

    public boolean g() {
        return this.f167220h.getBoolean(ContentResolverCompat2.Util.getSyncExtrasDisallowMetered(), false);
    }

    public final void i(Bundle bundle, String str) {
        if (bundle.getBoolean(str, false)) {
            return;
        }
        bundle.remove(str);
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f167215c == null) {
            sb2.append("authority: ");
            sb2.append(this.f167214b);
            sb2.append(" account {name=" + this.f167213a.name + ", user=" + this.f167216d + ", type=" + this.f167213a.type + "}");
        } else {
            sb2.append("service {package=");
            sb2.append(this.f167215c.getPackageName());
            sb2.append(" user=");
            sb2.append(this.f167216d);
            sb2.append(", class=");
            sb2.append(this.f167215c.getClassName());
            sb2.append("}");
        }
        sb2.append(" extras: ");
        c(this.f167220h, sb2);
        return sb2.toString();
    }

    public void k() {
        this.f167227o = d() ? this.f167224l : Math.max(Math.max(this.f167224l, this.f167226n), this.f167225m.longValue());
    }

    public String toString() {
        return b(null, true);
    }

    public h(h hVar) {
        this.f167215c = hVar.f167215c;
        this.f167213a = hVar.f167213a;
        this.f167214b = hVar.f167214b;
        this.f167216d = hVar.f167216d;
        this.f167217e = hVar.f167217e;
        this.f167218f = hVar.f167218f;
        this.f167220h = new Bundle(hVar.f167220h);
        this.f167222j = hVar.f167222j;
        this.f167224l = SystemClock.elapsedRealtime();
        this.f167228p = 0L;
        this.f167225m = hVar.f167225m;
        this.f167219g = hVar.f167219g;
        k();
        this.f167221i = j();
    }
}
