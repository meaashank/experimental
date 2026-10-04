package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f106038b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, e> f106039a = new HashMap<>();

    public static d c() {
        return f106038b;
    }

    public String a(String str) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            return eVar.g();
        }
        return null;
    }

    public String b(String str) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            return eVar.h();
        }
        return null;
    }

    public long d(String str) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            return eVar.f();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f106039a.keySet();
    }

    public void f(String str, e eVar) {
        this.f106039a.put(str, eVar);
    }

    public void g(String str, int i10) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            eVar.c(i10);
        }
    }

    public void h(String str, int i10) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            eVar.d(i10);
        }
    }

    public void i(String str, e eVar) {
        this.f106039a.remove(str);
    }

    public void j(String str, String str2) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            eVar.b(str2);
        }
    }

    public void k(String str, int i10, int i11) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            eVar.a(i10, i11);
        }
    }

    public void l(String str, float f10) {
        e eVar = this.f106039a.get(str);
        if (eVar != null) {
            eVar.e(f10);
        }
    }
}
