package com.prism.gaia.server.content;

import android.accounts.Account;
import android.content.SyncAdapterType;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Pair;
import com.bumptech.glide.load.engine.GlideException;
import com.prism.gaia.server.accounts.RegisteredServicesCache;
import com.prism.gaia.server.content.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f167229e = "asdf-".concat(i.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyncAdaptersCache f167230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f167231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PackageManager f167232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, h> f167233d = new HashMap<>();

    public i(PackageManager packageManager, j jVar, SyncAdaptersCache syncAdaptersCache) {
        this.f167232c = packageManager;
        this.f167231b = jVar;
        this.f167230a = syncAdaptersCache;
    }

    public boolean a(h hVar) {
        return b(hVar, null);
    }

    public final boolean b(h hVar, j.e eVar) {
        String str = hVar.f167221i;
        h hVar2 = this.f167233d.get(str);
        if (hVar2 != null) {
            if (hVar.compareTo(hVar2) > 0) {
                return false;
            }
            hVar2.f167222j = hVar.f167222j;
            hVar2.f167224l = Math.min(hVar2.f167224l, hVar.f167224l);
            hVar2.f167228p = hVar.f167228p;
            return true;
        }
        hVar.f167223k = eVar;
        if (eVar == null) {
            hVar.f167223k = this.f167231b.Q(new j.e(hVar.f167213a, hVar.f167216d, hVar.f167217e, hVar.f167218f, hVar.f167214b, hVar.f167220h, hVar.f167222j));
        }
        this.f167233d.put(str, hVar);
        return true;
    }

    public void c(int i10) {
        ArrayList<j.e> arrayListH = this.f167231b.H();
        int size = arrayListH.size();
        int i11 = 0;
        while (i11 < size) {
            j.e eVar = arrayListH.get(i11);
            i11++;
            j.e eVar2 = eVar;
            int i12 = eVar2.f167323b;
            if (i12 == i10) {
                Pair<Long, Long> pairQ = this.f167231b.q(eVar2.f167322a, i12, eVar2.f167326e);
                RegisteredServicesCache.e<SyncAdapterType> eVarV = this.f167230a.v(SyncAdapterType.newKey(eVar2.f167326e, eVar2.f167322a.type), eVar2.f167323b);
                if (eVarV != null) {
                    h hVar = new h(eVar2.f167322a, eVar2.f167323b, eVar2.f167324c, eVar2.f167325d, eVar2.f167326e, eVar2.f167327f, 0L, 0L, pairQ != null ? ((Long) pairQ.first).longValue() : 0L, this.f167231b.y(eVar2.f167322a, eVar2.f167323b, eVar2.f167326e), eVarV.f166398a.allowParallelSyncs());
                    hVar.f167222j = eVar2.f167329h;
                    hVar.f167223k = eVar2;
                    b(hVar, eVar2);
                    arrayListH = arrayListH;
                    size = size;
                }
            }
        }
    }

    public void d(StringBuilder sb2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sb2.append("SyncQueue: ");
        sb2.append(this.f167233d.size());
        sb2.append(" operation(s)\n");
        for (h hVar : this.f167233d.values()) {
            sb2.append(GlideException.a.f139488d);
            long j10 = hVar.f167227o;
            if (j10 <= jElapsedRealtime) {
                sb2.append("READY");
            } else {
                sb2.append(DateUtils.formatElapsedTime((j10 - jElapsedRealtime) / 1000));
            }
            sb2.append(" - ");
            sb2.append(hVar.b(this.f167232c, false));
            sb2.append("\n");
        }
    }

    public Collection<h> e() {
        return this.f167233d.values();
    }

    public void f(Account account, int i10, String str, long j10) {
        for (h hVar : this.f167233d.values()) {
            if (hVar.f167213a.equals(account) && hVar.f167214b.equals(str) && hVar.f167216d == i10) {
                hVar.f167225m = Long.valueOf(j10);
                hVar.k();
            }
        }
    }

    public void g(Account account, String str, long j10) {
        for (h hVar : this.f167233d.values()) {
            if (hVar.f167213a.equals(account) && hVar.f167214b.equals(str)) {
                hVar.f167226n = j10;
                hVar.k();
            }
        }
    }

    public void h(Account account, int i10, String str) {
        Iterator<Map.Entry<String, h>> it = this.f167233d.entrySet().iterator();
        while (it.hasNext()) {
            h value = it.next().getValue();
            if (account == null || value.f167213a.equals(account)) {
                if (str == null || value.f167214b.equals(str)) {
                    if (i10 == value.f167216d) {
                        it.remove();
                        if (!this.f167231b.i(value.f167223k)) {
                            new IllegalStateException("unable to find pending row for " + value);
                        }
                    }
                }
            }
        }
    }

    public void i(h hVar) {
        h hVarRemove = this.f167233d.remove(hVar.f167221i);
        if (hVarRemove == null || this.f167231b.i(hVarRemove.f167223k)) {
            return;
        }
        new IllegalStateException("unable to find pending row for " + hVarRemove);
    }

    public void j(int i10) {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f167233d.values()) {
            if (hVar.f167216d == i10) {
                arrayList.add(hVar);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            i((h) obj);
        }
    }
}
