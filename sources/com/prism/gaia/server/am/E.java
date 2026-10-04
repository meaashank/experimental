package com.prism.gaia.server.am;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.compose.runtime.C1979x1;
import com.prism.gaia.server.am.D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f166689e = "asdf-".concat(E.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f166690f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<D, String> f166691a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, D> f166692b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<IBinder, D> f166693c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<IBinder, D.a> f166694d = new HashMap();

    public class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f166695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IBinder f166696b;

        public a(String str, IBinder iBinder) {
            this.f166695a = str;
            this.f166696b = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (E.this.f166691a) {
                E.this.f166691a.remove(E.this.f166692b.remove(this.f166695a));
                E.this.f166693c.remove(this.f166696b);
                E.this.f166694d.remove(this.f166696b);
                String str = E.f166689e;
                this.f166696b.unlinkToDeath(this, 0);
            }
        }
    }

    public final void f(IBinder iBinder) {
        synchronized (this.f166691a) {
            try {
                D dRemove = this.f166693c.remove(iBinder);
                this.f166694d.remove(iBinder);
                if (dRemove != null) {
                    this.f166691a.remove(dRemove);
                    this.f166692b.remove(dRemove.p());
                    dRemove.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<D> g(String str, int i10) {
        LinkedList linkedList = new LinkedList();
        if (str == null) {
            return linkedList;
        }
        synchronized (this.f166691a) {
            try {
                Iterator<Map.Entry<D, String>> it = this.f166691a.entrySet().iterator();
                while (it.hasNext()) {
                    D key = it.next().getKey();
                    if (str.equals(key.g()) && (i10 == Integer.MIN_VALUE || key.o() == i10)) {
                        it.remove();
                        this.f166692b.remove(key.p());
                        IBinder iBinderB = key.b();
                        if (iBinderB != null) {
                            this.f166693c.remove(iBinderB);
                            this.f166694d.remove(iBinderB);
                        }
                        linkedList.add(key);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public final D h(IBinder iBinder) {
        D d10;
        synchronized (this.f166691a) {
            d10 = this.f166693c.get(iBinder);
        }
        return d10;
    }

    public final D i(String str) {
        D d10;
        synchronized (this.f166691a) {
            d10 = this.f166692b.get(str);
        }
        return d10;
    }

    public final D.a j(IBinder iBinder) {
        D.a aVar;
        synchronized (this.f166691a) {
            aVar = this.f166694d.get(iBinder);
        }
        return aVar;
    }

    public final D.a k(String str) {
        synchronized (this.f166691a) {
            try {
                D d10 = this.f166692b.get(str);
                if (d10 == null) {
                    return null;
                }
                return this.f166694d.get(d10.b());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final D l(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13) {
        boolean z10 = (i13 & 536870912) != 0;
        boolean z11 = (i13 & 268435456) != 0;
        boolean z12 = (i13 & C1979x1.f100279m) != 0;
        int i14 = i13 & (-939524097);
        synchronized (this.f166691a) {
            try {
                D d10 = new D(i10, i11, str, str2, i12, intentArr, strArr, i14);
                String str3 = this.f166691a.get(d10);
                if (str3 != null) {
                    d10.f166666a = str3;
                    if (!z11) {
                        if (z12) {
                            this.f166691a.put(d10, str3);
                            this.f166692b.put(str3, d10);
                        }
                        return d10;
                    }
                    this.f166691a.remove(d10);
                    D dRemove = this.f166692b.remove(str3);
                    if (dRemove.b() != null) {
                        this.f166693c.remove(dRemove.b());
                    }
                } else if (z10) {
                    return null;
                }
                if (z10) {
                    return d10;
                }
                this.f166691a.put(d10, d10.f166666a);
                this.f166692b.put(d10.f166666a, d10);
                return d10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<PendingIntent> m(String str, int i10) {
        PendingIntent pendingIntentH;
        LinkedList linkedList = new LinkedList();
        if (str == null) {
            return linkedList;
        }
        synchronized (this.f166691a) {
            try {
                for (D d10 : this.f166691a.keySet()) {
                    if (str.equals(d10.g()) && d10.o() == i10 && (pendingIntentH = d10.h()) != null) {
                        linkedList.add(pendingIntentH);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public final void n(IBinder iBinder) {
        synchronized (this.f166691a) {
            try {
                D dRemove = this.f166693c.remove(iBinder);
                this.f166694d.remove(iBinder);
                if (dRemove != null) {
                    this.f166691a.remove(dRemove);
                    this.f166692b.remove(dRemove.p());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(String str, String str2, IBinder iBinder, PendingIntent pendingIntent) {
        String str3;
        synchronized (this.f166691a) {
            try {
                iBinder.linkToDeath(new a(str, iBinder), 0);
            } catch (RemoteException unused) {
            }
            D d10 = this.f166693c.get(iBinder);
            if (d10 != null && (str3 = this.f166691a.get(d10)) != null && !str.equals(str3)) {
                this.f166691a.remove(d10);
                this.f166692b.remove(str3);
            }
            D d11 = this.f166692b.get(str);
            if (d11 == null) {
                return;
            }
            d11.r(str2);
            d11.q(iBinder);
            d11.s(pendingIntent);
            this.f166693c.put(iBinder, d11);
        }
    }

    public final void p(IBinder iBinder, Intent intent, String str, IBinder iBinder2, String str2, int i10, int i11, int i12, Bundle bundle) {
        synchronized (this.f166691a) {
            D.a aVar = new D.a();
            aVar.f166681a = intent;
            aVar.f166682b = str;
            aVar.f166683c = iBinder2;
            aVar.f166684d = str2;
            aVar.f166685e = i10;
            aVar.f166686f = i11;
            aVar.f166687g = i12;
            aVar.f166688h = bundle;
            this.f166694d.put(iBinder, aVar);
        }
    }
}
