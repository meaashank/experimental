package ha;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;
import com.prism.fusionadsdk.internal.config.AdPlaceConfig;
import com.unity3d.services.core.di.ServiceProvider;
import ga.C4465a;
import ha.t;
import ha.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class G {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Map<String, Long> f202473m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<String> f202474n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f202475o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f202476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f202477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4511e f202478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f202479d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f202484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScrollView f202485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f202486k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, e> f202480e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<String> f202481f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f202482g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Random f202483h = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f202487l = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (G.this.f202484i) {
                return;
            }
            G.this.C();
            G.this.f202482g.postDelayed(this, 500L);
        }
    }

    public class b implements t.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f202489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f202490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f202491c;

        public b(e eVar, String str, Map map) {
            this.f202489a = eVar;
            this.f202490b = str;
            this.f202491c = map;
        }

        @Override // ha.t.d
        public void a() {
            if (G.this.f202484i) {
                return;
            }
            e eVar = this.f202489a;
            if (eVar.f202501d != 1) {
                return;
            }
            if (!G.this.p(eVar)) {
                this.f202489a.a();
                G.this.u(this.f202489a, false);
                return;
            }
            this.f202489a.f202500c.removeAllViews();
            e eVar2 = this.f202489a;
            eVar2.f202500c.addView(eVar2.f202507j, new FrameLayout.LayoutParams(-1, -2));
            G.this.u(this.f202489a, true);
            G.this.x(this.f202489a, "loaded");
            G.this.C();
        }

        @Override // ha.t.d
        public void b(x.a aVar) {
            if (G.this.f202484i || !G.this.p(this.f202489a)) {
                return;
            }
            G.this.x(this.f202489a, "click");
            G.this.f202479d.a(aVar);
        }

        @Override // ha.t.d
        public void c() {
            if (G.this.f202484i) {
                return;
            }
            e eVar = this.f202489a;
            if (eVar.f202501d != 1) {
                return;
            }
            eVar.f202507j.z();
            this.f202489a.f202507j = null;
            G.this.f202481f.remove(this.f202490b);
            G.this.r(this.f202489a, this.f202491c);
        }
    }

    public interface c {
        void a(x.a aVar);
    }

    public static final class d extends T6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<G> f202493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f202494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f202496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f202497e;

        public d(G g10, String str, String str2, boolean z10) {
            this.f202493a = new WeakReference<>(g10);
            this.f202494b = str;
            this.f202495c = str2;
            this.f202496d = z10;
        }

        @Override // T6.a
        public void c(int i10) {
            i(null, i10);
        }

        @Override // T6.a
        public void f(Object obj) {
            i(obj, 0);
        }

        public final void i(final Object obj, final int i10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ha.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202510a.j(obj, i10);
                }
            });
        }

        public final /* synthetic */ void j(Object obj, int i10) {
            if (this.f202497e) {
                if (obj instanceof J6.c) {
                    ((J6.c) obj).a();
                    return;
                }
                return;
            }
            this.f202497e = true;
            G.f202475o = Math.max(0, G.f202475o - 1);
            if (i10 == 1101) {
                G.f202474n.add(this.f202495c);
            }
            G g10 = this.f202493a.get();
            if (g10 != null) {
                g10.y(this.f202494b, obj, i10, this.f202496d);
            } else if (obj instanceof J6.c) {
                ((J6.c) obj).a();
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x.f f202499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C4465a f202500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f202501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f202502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f202503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f202504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f202505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public x.c f202506i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public t f202507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public J6.c f202508k;

        public e(String str, x.f fVar) {
            this.f202498a = str;
            this.f202499b = fVar;
            this.f202500c = new C4465a(G.this.f202476a);
        }

        public void a() {
            t tVar = this.f202507j;
            if (tVar != null) {
                tVar.z();
                this.f202507j = null;
            }
            J6.c cVar = this.f202508k;
            if (cVar != null) {
                cVar.a();
                this.f202508k = null;
            }
            this.f202500c.removeAllViews();
            this.f202500c.a(false);
        }
    }

    public G(Activity activity, x xVar, C4511e c4511e, c cVar) {
        this.f202476a = activity;
        this.f202477b = xVar;
        this.f202478c = c4511e;
        this.f202479d = cVar;
        for (Map.Entry<String, x.e> entry : xVar.f202594h.entrySet()) {
            for (x.f fVar : entry.getValue().f202627b) {
                this.f202480e.put(fVar.f202628a, new e(entry.getKey(), fVar));
            }
        }
    }

    public final boolean A(e eVar, x.g gVar) {
        return q() && s(eVar);
    }

    public final void B(e eVar) {
        eVar.f202501d = 1;
        this.f202486k++;
        v(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.G.C():void");
    }

    public C4465a D(x.f fVar) {
        return this.f202480e.get(fVar.f202628a).f202500c;
    }

    public final boolean p(e eVar) {
        return q() && s(eVar);
    }

    public final boolean q() {
        return (!this.f202477b.f202587a || this.f202484i || this.f202476a.isFinishing() || this.f202476a.isDestroyed()) ? false : true;
    }

    public final void r(e eVar, Map<String, Integer> map) {
        String key;
        int iIntValue = 0;
        if (this.f202484i || !p(eVar) || eVar.f202501d != 1) {
            u(eVar, false);
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!this.f202477b.f202595i.containsKey(next) || !this.f202477b.f202595i.get(next).f202612e) {
                it.remove();
            }
        }
        if (map.isEmpty()) {
            v(eVar);
            return;
        }
        Iterator<String> it2 = map.keySet().iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            if (!this.f202481f.contains(it2.next())) {
                z10 = true;
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!z10 || !this.f202481f.contains(entry.getKey())) {
                iIntValue = entry.getValue().intValue() + iIntValue;
            }
        }
        int iNextInt = this.f202483h.nextInt(iIntValue);
        Iterator<Map.Entry<String, Integer>> it3 = map.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<String, Integer> next2 = it3.next();
            if (!z10 || !this.f202481f.contains(next2.getKey())) {
                iNextInt -= next2.getValue().intValue();
                if (iNextInt < 0) {
                    key = next2.getKey();
                    break;
                }
            }
        }
        map.remove(key);
        this.f202481f.add(key);
        eVar.f202506i = this.f202477b.f202595i.get(key);
        t tVar = new t(this.f202476a, eVar.f202506i, this.f202478c, eVar.f202499b.f202629b, new b(eVar, key, map));
        eVar.f202507j = tVar;
        tVar.R(true);
    }

    public final boolean s(e eVar) {
        try {
            if (J6.f.m() == null) {
                return true;
            }
            LjAdRequest ljAdRequest = new LjAdRequest();
            AdPlaceConfig adPlaceConfig = new AdPlaceConfig();
            ljAdRequest.f162251a = adPlaceConfig;
            adPlaceConfig.sitesName = eVar.f202499b.f202628a;
            if (J6.f.f53207g.b(ljAdRequest)) {
                if (J6.f.f53207g.a(eVar.f202499b.f202628a)) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    public void t() {
        if (this.f202484i) {
            return;
        }
        this.f202484i = true;
        this.f202482g.removeCallbacksAndMessages(null);
        Iterator<e> it = this.f202480e.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void u(e eVar, boolean z10) {
        if (eVar.f202501d == 1) {
            this.f202486k = Math.max(0, this.f202486k - 1);
        }
        eVar.f202501d = z10 ? 2 : 3;
        eVar.f202500c.a(z10);
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void v(final e eVar) {
        if (this.f202484i || !p(eVar) || eVar.f202501d != 1) {
            u(eVar, false);
            return;
        }
        if (eVar.f202502e >= eVar.f202499b.f202634g.size()) {
            u(eVar, false);
            return;
        }
        List<x.g> list = eVar.f202499b.f202634g;
        int i10 = eVar.f202502e;
        eVar.f202502e = i10 + 1;
        x.g gVar = list.get(i10);
        if (!A(eVar, gVar)) {
            v(eVar);
            return;
        }
        if (!gVar.f202635a) {
            r(eVar, new LinkedHashMap(gVar.f202638d));
            return;
        }
        String lowerCase = gVar.f202637c.toLowerCase(Locale.ROOT);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f202473m;
        Long l10 = map.get(lowerCase);
        if (l10 != null && jElapsedRealtime - l10.longValue() < ((long) this.f202477b.f202591e) * 1000) {
            if (f202474n.contains(lowerCase) && gVar.f202636b) {
                v(eVar);
                return;
            } else {
                u(eVar, false);
                return;
            }
        }
        if (f202475o >= this.f202477b.f202589c) {
            eVar.f202502e--;
            this.f202482g.postDelayed(new Runnable() { // from class: ha.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202471a.v(eVar);
                }
            }, 500L);
            return;
        }
        map.put(lowerCase, Long.valueOf(jElapsedRealtime));
        f202474n.remove(lowerCase);
        f202475o++;
        x(eVar, "request");
        d dVar = new d(this, eVar.f202499b.f202628a, lowerCase, gVar.f202636b);
        try {
            new LjAdLoader.Builder().withCache(false).withReportPrefix("minus_one_" + eVar.f202499b.f202628a).withAdListener(dVar).build().u(this.f202476a, new LjAdRequest.Builder(this.f202476a).setAdPlaceName(gVar.f202637c).inlineNativeOnly().build());
        } catch (RuntimeException unused) {
            dVar.i(null, com.prism.fusionadsdkbase.a.f162367d);
        }
    }

    public final void x(e eVar, String str) {
        try {
            if (J6.f.n() == null) {
                return;
            }
            V5.c cVarC = J6.f.f53216p.a(this.f202476a, "minus_one_ad_" + str).c("slot", eVar.f202499b.f202628a).c("page", eVar.f202498a).c("revision", this.f202477b.f202588b).c("source", eVar.f202506i == null ? ServiceProvider.NAMED_SDK : "custom");
            x.c cVar = eVar.f202506i;
            if (cVar != null) {
                cVarC.c("creative", cVar.f202608a).c("creative_version", eVar.f202506i.f202609b);
            }
            cVarC.b();
        } catch (RuntimeException unused) {
        }
    }

    public final void y(String str, Object obj, int i10, boolean z10) {
        e eVar = this.f202480e.get(str);
        if (this.f202484i || eVar == null || eVar.f202501d != 1 || !q() || !s(eVar)) {
            if (obj instanceof J6.c) {
                ((J6.c) obj).a();
            }
            if (this.f202484i || eVar == null) {
                return;
            }
            u(eVar, false);
            return;
        }
        if (!(obj instanceof J6.c)) {
            if (z10 && i10 == 1101) {
                v(eVar);
                return;
            } else {
                u(eVar, false);
                return;
            }
        }
        J6.c cVar = (J6.c) obj;
        eVar.f202508k = cVar;
        try {
            cVar.d(this.f202476a, eVar.f202500c, eVar.f202499b.f202629b);
            u(eVar, true);
        } catch (RuntimeException unused) {
            eVar.a();
            u(eVar, false);
        }
    }

    public void z(String str, List<x.f> list, ScrollView scrollView) {
        t tVar;
        this.f202485j = scrollView;
        HashSet hashSet = new HashSet();
        Iterator<x.f> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f202628a);
        }
        for (e eVar : this.f202480e.values()) {
            boolean z10 = eVar.f202498a.equals(str) && hashSet.contains(eVar.f202499b.f202628a);
            eVar.f202503f = z10;
            if (!z10 && (tVar = eVar.f202507j) != null) {
                tVar.W(false);
            }
        }
        this.f202482g.removeCallbacks(this.f202487l);
        this.f202482g.post(this.f202487l);
    }
}
