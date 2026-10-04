package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f151371a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0527a> f151372b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f151373c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f151374d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f151375e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f151376f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f151377g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f151378h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f151379i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0527a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f151380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f151381b = new ArrayList<>();

        public C0527a(e eVar, String str) {
            this.f151380a = eVar;
            a(str);
        }

        public e a() {
            return this.f151380a;
        }

        public ArrayList<String> b() {
            return this.f151381b;
        }

        public void a(String str) {
            this.f151381b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f151378h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f151378h.containsKey(view)) {
            return this.f151378h.get(view);
        }
        Map<View, Boolean> map = this.f151378h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f151373c.get(str);
    }

    public C0527a c(View view) {
        C0527a c0527a = this.f151372b.get(view);
        if (c0527a != null) {
            this.f151372b.remove(view);
        }
        return c0527a;
    }

    public String d(View view) {
        if (this.f151371a.size() == 0) {
            return null;
        }
        String str = this.f151371a.get(view);
        if (str != null) {
            this.f151371a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f151374d.contains(view) ? c.PARENT_VIEW : this.f151379i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f151378h.containsKey(view)) {
            return true;
        }
        this.f151378h.put(view, Boolean.TRUE);
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
        this.f151374d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f151377g.get(str);
    }

    public HashSet<String> c() {
        return this.f151375e;
    }

    public void d() {
        this.f151379i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f151375e.add(adSessionId);
                            this.f151371a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f151376f.add(adSessionId);
                            this.f151373c.put(adSessionId, viewC);
                            this.f151377g.put(adSessionId, strA);
                        }
                    } else {
                        this.f151376f.add(adSessionId);
                        this.f151377g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f151371a.clear();
        this.f151372b.clear();
        this.f151373c.clear();
        this.f151374d.clear();
        this.f151375e.clear();
        this.f151376f.clear();
        this.f151377g.clear();
        this.f151379i = false;
    }

    public HashSet<String> b() {
        return this.f151376f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0527a c0527a = this.f151372b.get(view);
        if (c0527a != null) {
            c0527a.a(aVar.getAdSessionId());
        } else {
            this.f151372b.put(view, new C0527a(eVar, aVar.getAdSessionId()));
        }
    }
}
