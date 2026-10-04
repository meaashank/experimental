package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import e.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f151634a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0535a> f151635b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f151636c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f151637d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f151638e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f151639f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f151640g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f151641h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f151642i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f151643j;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0535a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f151644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f151645b = new ArrayList<>();

        public C0535a(e eVar, String str) {
            this.f151644a = eVar;
            a(str);
        }

        public e a() {
            return this.f151644a;
        }

        public ArrayList<String> b() {
            return this.f151645b;
        }

        public void a(String str) {
            this.f151645b.add(str);
        }
    }

    public View a(String str) {
        return this.f151636c.get(str);
    }

    public C0535a b(View view) {
        C0535a c0535a = this.f151635b.get(view);
        if (c0535a != null) {
            this.f151635b.remove(view);
        }
        return c0535a;
    }

    public String c(View view) {
        if (this.f151634a.size() == 0) {
            return null;
        }
        String str = this.f151634a.get(view);
        if (str != null) {
            this.f151634a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f151637d.contains(view) ? c.PARENT_VIEW : this.f151643j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f151641h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f151638e.add(adSessionId);
                            this.f151634a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f151639f.add(adSessionId);
                            this.f151636c.put(adSessionId, viewC);
                            this.f151640g.put(adSessionId, strA);
                        }
                    } else {
                        this.f151639f.add(adSessionId);
                        this.f151640g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f151642i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f151642i.containsKey(view)) {
            return this.f151642i.get(view);
        }
        Map<View, Boolean> map = this.f151642i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f151640g.get(str);
    }

    public HashSet<String> c() {
        return this.f151638e;
    }

    public void d() {
        this.f151643j = true;
    }

    public boolean e(View view) {
        if (!this.f151642i.containsKey(view)) {
            return true;
        }
        this.f151642i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f151637d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f151639f;
    }

    @f0
    public boolean c(String str) {
        return this.f151641h.contains(str);
    }

    public void a() {
        this.f151634a.clear();
        this.f151635b.clear();
        this.f151636c.clear();
        this.f151637d.clear();
        this.f151638e.clear();
        this.f151639f.clear();
        this.f151640g.clear();
        this.f151643j = false;
        this.f151641h.clear();
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0535a c0535a = this.f151635b.get(view);
        if (c0535a != null) {
            c0535a.a(aVar.getAdSessionId());
        } else {
            this.f151635b.put(view, new C0535a(eVar, aVar.getAdSessionId()));
        }
    }
}
