package com.mbridge.msdk.config.component.animation;

import android.text.TextUtils;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f154156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f154158c;

    public c() {
        this.f154156a = new e(GlideExecutor.f139627g);
        this.f154157b = "";
    }

    private Map<String, Object> g(Map<String, Object> map) {
        Map<String, Object> mapI = i(map);
        if (!mapI.containsKey("operators")) {
            mapI.put("operators", new ArrayList());
        }
        return mapI;
    }

    private Map<String, Object> h(Map<String, Object> map) {
        Map<String, Object> mapI = i(map);
        if (!mapI.containsKey("type") && mapI.containsKey("interpolatorType")) {
            mapI.put("type", mapI.get("interpolatorType"));
        }
        return mapI;
    }

    private Map<String, Object> i(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return map2;
    }

    public c a(Map<String, Object> map) {
        return b("alpha", i(map));
    }

    public c b(Map<String, Object> map) {
        return b("color", i(map));
    }

    public c c(Object obj) {
        HashMap map = new HashMap();
        map.put(x.h.f238399b, obj);
        return e(map);
    }

    public c d(Map<String, Object> map) {
        this.f154156a.a("delay", i(map));
        return this;
    }

    public c e(Map<String, Object> map) {
        this.f154156a.a(x.h.f238399b, i(map));
        return this;
    }

    public c f(Map<String, Object> map) {
        this.f154156a.a("interpolator", h(map));
        return this;
    }

    public c j(Map<String, Object> map) {
        return a("parallel", g(map));
    }

    public c k(Map<String, Object> map) {
        this.f154156a.a("repeat", i(map));
        return this;
    }

    public c l(Map<String, Object> map) {
        return b("rotate", i(map));
    }

    public c m(Map<String, Object> map) {
        Map<String, Object> mapI = i(map);
        Object obj = mapI.get("maintainAspectRatio");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            if (mapI.containsKey("scaleX") && !mapI.containsKey("scaleY")) {
                mapI.put("scaleY", mapI.get("scaleX"));
            } else if (mapI.containsKey("scaleY") && !mapI.containsKey("scaleX")) {
                mapI.put("scaleX", mapI.get("scaleY"));
            }
        }
        return b("scale", mapI);
    }

    public c n(Map<String, Object> map) {
        return a("sequence", g(map));
    }

    public c o(Map<String, Object> map) {
        return a("stagger", g(map));
    }

    public c p(Map<String, Object> map) {
        return b("translate", i(map));
    }

    public List<e> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.f154156a));
        return arrayList;
    }

    public c b(Object obj) {
        HashMap map = new HashMap();
        map.put("delay", obj);
        return d((Map<String, Object>) map);
    }

    public c d(Object obj) {
        HashMap map = new HashMap();
        map.put("interpolatorType", obj);
        return f(map);
    }

    public c(String str) {
        this.f154156a = new e(GlideExecutor.f139627g);
        this.f154157b = "";
        this.f154157b = str == null ? "" : str;
    }

    private c a(String str, Map<String, Object> map) {
        e eVar = new e(str);
        Object objRemove = map.remove("operators");
        eVar.a(map);
        eVar.a(a(a(objRemove)));
        this.f154156a.a().add(eVar);
        return this;
    }

    public g c() {
        g gVar = new g();
        gVar.a(this.f154157b);
        gVar.a(this.f154158c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.f154156a));
        gVar.a(arrayList);
        return gVar;
    }

    public g b() {
        this.f154158c = true;
        return c();
    }

    private c b(String str, Map<String, Object> map) {
        e eVar = new e(str);
        eVar.a(map);
        this.f154156a.a().add(eVar);
        return this;
    }

    private List<e> a(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof c) {
                    arrayList.addAll(((c) obj).a());
                } else if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (gVar.b() != null) {
                        Iterator<e> it = gVar.b().iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(it.next()));
                        }
                    }
                } else if (obj instanceof e) {
                    arrayList.add(a((e) obj));
                }
            }
        }
        return arrayList;
    }

    private Map<String, Object> c(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null) {
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        value = c((Map<String, Object>) value);
                    } else if (value instanceof List) {
                        value = new ArrayList((List) value);
                    }
                    map2.put(entry.getKey(), value);
                }
            }
        }
        return map2;
    }

    private List<Object> a(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        ArrayList arrayList = new ArrayList();
        if (obj != null) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    private e a(e eVar) {
        e eVar2 = new e(eVar.c());
        eVar2.a(c(eVar.b()));
        ArrayList arrayList = new ArrayList();
        if (eVar.a() != null) {
            Iterator<e> it = eVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
        }
        eVar2.a(arrayList);
        return eVar2;
    }
}
