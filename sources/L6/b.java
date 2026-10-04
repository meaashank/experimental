package L6;

import K6.g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, g> f58664a = new ConcurrentHashMap();

    public static g a(String str) {
        return f58664a.get(str);
    }

    public static void b(String str, g gVar) {
        f58664a.put(str, gVar);
    }

    public static void c(String str) {
        f58664a.remove(str);
    }
}
