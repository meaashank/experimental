package tb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239268a = "CosXmlSigner";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, Class<? extends m>> f239269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, m> f239270c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(5);
        f239269b = concurrentHashMap;
        f239270c = new ConcurrentHashMap(5);
        concurrentHashMap.put(f239268a, f.class);
    }

    public static m a(String str) {
        Class<? extends m> cls = f239269b.get(str);
        if (cls == null) {
            return null;
        }
        try {
            m mVarNewInstance = cls.newInstance();
            f239270c.put(str, mVarNewInstance);
            return mVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e11);
        }
    }

    public static m b(String str) {
        return c(str);
    }

    public static m c(String str) {
        Map<String, m> map = f239270c;
        return map.containsKey(str) ? map.get(str) : a(str);
    }

    public static void d(String str, Class<? extends m> cls) {
        if (str == null) {
            throw new IllegalArgumentException("signerType cannot be null");
        }
        if (cls == null) {
            throw new IllegalArgumentException("signerClass cannot be null");
        }
        f239269b.put(str, cls);
    }

    public static <T extends m> void e(String str, T t10) {
        if (str == null) {
            throw new IllegalArgumentException("signerType cannot be null");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("signer instance cannot be null");
        }
        f239270c.put(str, t10);
    }
}
