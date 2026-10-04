package Nb;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f64936a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64937b = null;

    public void a(String str, String str2) {
        this.f64936a.put(str, str2);
    }

    public String b() {
        return this.f64937b;
    }

    public Map<String, String> c() {
        return this.f64936a;
    }

    public void d(String str) {
        this.f64937b = str;
    }
}
