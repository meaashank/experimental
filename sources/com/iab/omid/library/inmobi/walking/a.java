package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f151500a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0531a> f151501b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f151502c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f151503d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f151504e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f151505f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f151506g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f151507h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f151508i;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0531a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f151509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f151510b = new ArrayList<>();

        public C0531a(e eVar, String str) {
            this.f151509a = eVar;
            a(str);
        }

        public e a() {
            return this.f151509a;
        }

        public ArrayList<String> b() {
            return this.f151510b;
        }

        public void a(String str) {
            this.f151510b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f151507h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f151507h.containsKey(view)) {
            return this.f151507h.get(view);
        }
        Map<View, Boolean> map = this.f151507h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f151502c.get(str);
    }

    public C0531a c(View view) {
        C0531a c0531a = this.f151501b.get(view);
        if (c0531a != null) {
            this.f151501b.remove(view);
        }
        return c0531a;
    }

    public String d(View view) {
        if (this.f151500a.size() == 0) {
            return null;
        }
        String str = this.f151500a.get(view);
        if (str != null) {
            this.f151500a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f151503d.contains(view) ? c.PARENT_VIEW : this.f151508i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f151507h.containsKey(view)) {
            return true;
        }
        this.f151507h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f151503d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f151506g.get(str);
    }

    public HashSet<String> c() {
        return this.f151504e;
    }

    public void d() {
        this.f151508i = true;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f151504e.add(adSessionId);
                            this.f151500a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f151505f.add(adSessionId);
                            this.f151502c.put(adSessionId, viewC);
                            this.f151506g.put(adSessionId, strA);
                        }
                    } else {
                        this.f151505f.add(adSessionId);
                        this.f151506g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f151500a.clear();
        this.f151501b.clear();
        this.f151502c.clear();
        this.f151503d.clear();
        this.f151504e.clear();
        this.f151505f.clear();
        this.f151506g.clear();
        this.f151508i = false;
    }

    public HashSet<String> b() {
        return this.f151505f;
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0531a c0531a = this.f151501b.get(view);
        if (c0531a != null) {
            c0531a.a(aVar.getAdSessionId());
        } else {
            this.f151501b.put(view, new C0531a(eVar, aVar.getAdSessionId()));
        }
    }
}
