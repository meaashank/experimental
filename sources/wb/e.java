package wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vb.C5724e;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f240235b = "QCloudTask";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile e f240236c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, AbstractCallableC5772a> f240237a = new ConcurrentHashMap(30);

    public static e d() {
        if (f240236c == null) {
            synchronized (e.class) {
                try {
                    if (f240236c == null) {
                        f240236c = new e();
                    }
                } finally {
                }
            }
        }
        return f240236c;
    }

    public void a(AbstractCallableC5772a abstractCallableC5772a) {
        this.f240237a.put(abstractCallableC5772a.f240185a, abstractCallableC5772a);
        C5724e.b(f240235b, "[Pool] ADD %s, %d cached", abstractCallableC5772a.f240185a, Integer.valueOf(this.f240237a.size()));
    }

    public void b() {
        C5724e.b(f240235b, "[Pool] CLEAR %d", Integer.valueOf(this.f240237a.size()));
        this.f240237a.clear();
    }

    public AbstractCallableC5772a c(String str) {
        return this.f240237a.get(str);
    }

    public void e(AbstractCallableC5772a abstractCallableC5772a) {
        if (this.f240237a.remove(abstractCallableC5772a.f240185a) != null) {
            C5724e.b(f240235b, "[Pool] REMOVE %s, %d cached", abstractCallableC5772a.f240185a, Integer.valueOf(this.f240237a.size()));
        }
    }

    public List<AbstractCallableC5772a> f() {
        return new ArrayList(this.f240237a.values());
    }
}
