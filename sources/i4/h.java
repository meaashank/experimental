package I4;

import Bc.o;
import C4.q;
import I4.h;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.a;
import androidx.datastore.preferences.rxjava3.RxPreferenceDataStoreBuilder;
import androidx.datastore.rxjava3.RxDataStore;
import androidx.lifecycle.B;
import androidx.lifecycle.C2589b;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.a0;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.y;
import xc.C5805b;
import zc.X;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends C2589b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51114i = "PreferenceModel";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f51115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RxDataStore<androidx.datastore.preferences.core.a> f51116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, c> f51117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P<Boolean> f51118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f51119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51120h;

    public class b implements Q<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f51124a;

        public b(Runnable runnable) {
            this.f51124a = runnable;
        }

        @Override // androidx.lifecycle.Q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            Log.d(h.f51114i, "onceloaded:" + bool);
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            h.this.o().p(this);
            this.f51124a.run();
        }
    }

    public static class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f51126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.C0292a<T> f51127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public P<T> f51128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f51129d;

        public c(String str, a.C0292a<T> c0292a, P<T> p10, T t10) {
            this.f51126a = str;
            this.f51127b = c0292a;
            this.f51128c = p10;
            this.f51129d = t10;
        }
    }

    public h(@NonNull Application application, a0 a0Var) {
        super(application);
        this.f51117e = new HashMap();
        this.f51118f = new P<>(Boolean.FALSE);
        this.f51119g = new Handler(Looper.getMainLooper());
        int i10 = 0;
        this.f51120h = false;
        Log.d(f51114i, "initialize " + this);
        this.f51115c = a0Var;
        this.f51116d = new RxPreferenceDataStoreBuilder(application, "datastore_wallpaper").c();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) r();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            if (hashSet.contains(pair.first)) {
                throw new IllegalStateException("duplicated key:" + ((String) pair.first));
            }
            hashSet.add((String) pair.first);
            Object obj2 = pair.second;
            if (obj2 instanceof Integer) {
                t(androidx.datastore.preferences.core.c.d((String) pair.first), (Integer) pair.second);
            } else if (obj2 instanceof Long) {
                t(androidx.datastore.preferences.core.c.e((String) pair.first), (Long) pair.second);
            } else if (obj2 instanceof Float) {
                t(androidx.datastore.preferences.core.c.c((String) pair.first), (Float) pair.second);
            } else if (obj2 instanceof String) {
                t(androidx.datastore.preferences.core.c.f((String) pair.first), (String) pair.second);
            } else if (obj2 instanceof Boolean) {
                t(androidx.datastore.preferences.core.c.a((String) pair.first), (Boolean) pair.second);
            } else {
                if (!(obj2 instanceof Set)) {
                    throw new IllegalStateException("none support type of preference of " + pair.second);
                }
                t(androidx.datastore.preferences.core.c.g((String) pair.first), (Set) pair.second);
            }
        }
        this.f51116d.c().H6(Ic.a.Z(Jc.b.f58226c)).A4(C5805b.d()).E6(new Bc.g() { // from class: I4.c
            @Override // Bc.g
            public final void accept(Object obj3) {
                h.k(this.f51110a, (androidx.datastore.preferences.core.a) obj3);
            }
        }, new d(), Functions.f207354c);
    }

    public static /* synthetic */ void k(h hVar, androidx.datastore.preferences.core.a aVar) {
        if (hVar.f51120h) {
            return;
        }
        for (c cVar : hVar.f51117e.values()) {
            T t10 = cVar.f51129d;
            if (t10 instanceof Integer) {
                hVar.q(cVar, aVar);
            } else if (t10 instanceof Long) {
                hVar.q(cVar, aVar);
            } else if (t10 instanceof Float) {
                hVar.q(cVar, aVar);
            } else if (t10 instanceof String) {
                hVar.q(cVar, aVar);
            } else if (t10 instanceof Boolean) {
                hVar.q(cVar, aVar);
            } else if (t10 instanceof Set) {
                hVar.q(cVar, aVar);
            }
        }
        hVar.f51120h = true;
        hVar.f51118f.r(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.k0
    public void g() {
        Log.d(f51114i, "onCleared");
        RxDataStore<androidx.datastore.preferences.core.a> rxDataStore = this.f51116d;
        if (rxDataStore != null) {
            rxDataStore.dispose();
        }
    }

    @NonNull
    public abstract String m();

    public <T> K<T> n(@NonNull String str) {
        c cVar = this.f51117e.get(str);
        if (cVar != null) {
            return cVar.f51128c;
        }
        throw new IllegalStateException(y.a("can not get unregistered key ", str));
    }

    public K<Boolean> o() {
        return this.f51118f;
    }

    public <T> G4.a<T> p(@NonNull String str) {
        c cVar = this.f51117e.get(str);
        if (cVar != null) {
            return new G4.a<>(cVar.f51128c, cVar.f51129d);
        }
        throw new IllegalStateException(y.a("can not get unregistered key ", str));
    }

    public final <T> void q(c<T> cVar, androidx.datastore.preferences.core.a aVar) {
        cVar.f51128c.l(new a(cVar));
        Object objC = aVar.c(cVar.f51127b);
        if (objC != null) {
            Log.d(f51114i, "init value local key:" + cVar.f51126a + " value: " + objC);
            cVar.f51128c.r((T) objC);
            return;
        }
        Log.d(f51114i, "init value default key:" + cVar.f51126a + " value: " + cVar.f51129d);
        cVar.f51128c.r(cVar.f51129d);
    }

    @NonNull
    public abstract List<Pair<String, Object>> r();

    public void s(B b10, @NonNull Runnable runnable) {
        o().k(b10, new b(runnable));
    }

    public final <T> void t(a.C0292a<T> c0292a, T t10) {
        P p10 = new P();
        String str = c0292a.f112491a;
        this.f51117e.put(str, new c(str, c0292a, p10, t10));
    }

    public <T> void u(@NonNull String str, @NonNull T t10) {
        c cVar = this.f51117e.get(str);
        if (cVar == null) {
            throw new IllegalStateException(y.a("can not get unregistered key ", str));
        }
        if (!cVar.f51129d.getClass().equals(t10.getClass())) {
            throw new IllegalStateException("type not match required:" + t10.getClass() + " get:" + cVar.f51129d.getClass());
        }
        P<T> p10 = cVar.f51128c;
        T tF = p10.f();
        if (tF == null) {
            throw new IllegalStateException(y.a("not inited yet ", str));
        }
        if (tF.equals(t10)) {
            return;
        }
        p10.r(t10);
    }

    public <T> void v(@NonNull final String str, @NonNull final T t10) {
        Runnable runnable = new Runnable() { // from class: I4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f51107a.u(str, t10);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f51119g.post(runnable);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements Q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f51121a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f51122b;

        public a(c cVar) {
            this.f51122b = cVar;
        }

        public static /* synthetic */ X c(c cVar, Object obj, androidx.datastore.preferences.core.a aVar) {
            MutablePreferences mutablePreferencesD = aVar.d();
            mutablePreferencesD.o(cVar.f51127b, obj);
            return X.N0(mutablePreferencesD);
        }

        public static /* synthetic */ void d(androidx.datastore.preferences.core.a aVar) {
        }

        @Override // androidx.lifecycle.Q
        public void a(final T t10) {
            if (t10 == null) {
                return;
            }
            if (!this.f51121a) {
                this.f51121a = true;
                return;
            }
            Log.d(h.f51114i, "update key:" + this.f51122b.f51126a + q.f17581a + t10);
            RxDataStore<androidx.datastore.preferences.core.a> rxDataStore = h.this.f51116d;
            final c cVar = this.f51122b;
            X<androidx.datastore.preferences.core.a> xH1 = rxDataStore.e(new o() { // from class: I4.e
                @Override // Bc.o
                public final Object apply(Object obj) {
                    return h.a.c(cVar, t10, (androidx.datastore.preferences.core.a) obj);
                }
            }).N1(Jc.b.e()).h1(C5805b.d());
            f fVar = new f();
            final c cVar2 = this.f51122b;
            xH1.L1(fVar, new Bc.g() { // from class: I4.g
                @Override // Bc.g
                public final void accept(Object obj) {
                    Log.e(h.f51114i, "write preference error " + cVar2.f51126a);
                }
            });
        }

        public static /* synthetic */ void e(androidx.datastore.preferences.core.a aVar) throws Throwable {
        }
    }
}
