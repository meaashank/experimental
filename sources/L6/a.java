package L6;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, Object> f58662a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, T6.a> f58663b = new ConcurrentHashMap();

    public static void a(String str) {
        f58662a.remove(str);
        f58663b.remove(str);
    }

    public static T6.a b(String str) {
        return f58663b.get(str);
    }

    public static Object c(String str) {
        return f58662a.get(str);
    }

    public static void d(String str, T6.a aVar) {
        f58663b.put(str, aVar);
    }

    public static void e(String str, Object obj) {
        f58662a.put(str, obj);
    }
}
