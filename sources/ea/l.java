package ea;

import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f200317b = l0.b(l.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f200318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, ca.c> f200319a = new ConcurrentHashMap();

    public static l d() {
        if (f200318c == null) {
            synchronized (l.class) {
                try {
                    if (f200318c == null) {
                        f200318c = new l();
                    }
                } finally {
                }
            }
        }
        return f200318c;
    }

    public boolean a(String str) {
        return this.f200319a.containsKey(str);
    }

    public Collection<ca.c> b() {
        return this.f200319a.values();
    }

    public ca.c c(String str) {
        return this.f200319a.get(str);
    }

    public void e(ca.c cVar) {
        I.b(f200317b, "register module id: %s", cVar.getModuleId());
        this.f200319a.put(cVar.getModuleId(), cVar);
    }
}
