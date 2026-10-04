package com.prism.gaia.helper.utils;

import android.util.Log;
import androidx.room.F;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165198a = "GaiaLockProbe";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f165199b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f165200c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArrayList<b> f165201d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Throwable> f165202e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<String> f165203f = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f165204g = new ThreadLocal<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f165206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f165207c;

        public a(String str, String[] strArr) {
            this.f165205a = str;
            this.f165206b = strArr == null ? new String[0] : strArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Object> f165209b;

        public b(String str, Object obj) {
            this.f165208a = str;
            this.f165209b = new WeakReference<>(obj);
        }

        public String a(Object obj) {
            if (!(obj instanceof ReentrantReadWriteLock)) {
                if (Thread.holdsLock(obj)) {
                    return "(monitor)";
                }
                return null;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) obj;
            boolean zIsWriteLockedByCurrentThread = reentrantReadWriteLock.isWriteLockedByCurrentThread();
            boolean z10 = reentrantReadWriteLock.getReadHoldCount() > 0;
            if (zIsWriteLockedByCurrentThread && z10) {
                return "(w+r)";
            }
            if (zIsWriteLockedByCurrentThread) {
                return "(w)";
            }
            if (z10) {
                return "(r)";
            }
            return null;
        }
    }

    public static void a(String str) {
        if (f165200c) {
            ArrayList arrayList = (ArrayList) e();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String strSubstring = (String) obj;
                int iLastIndexOf = strSubstring.lastIndexOf(40);
                if (iLastIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                }
                if (!strSubstring.equals(str)) {
                    String strA = androidx.concurrent.futures.a.a(strSubstring, " -> ", str);
                    String strA2 = androidx.concurrent.futures.a.a(str, " -> ", strSubstring);
                    ConcurrentHashMap<String, Throwable> concurrentHashMap = f165202e;
                    Throwable thPutIfAbsent = concurrentHashMap.putIfAbsent(strA, new Throwable(w.y.a("took ", strA)));
                    if (thPutIfAbsent == null) {
                        Log.i(f165198a, w.y.a("lock edge: ", strA), concurrentHashMap.get(strA));
                    }
                    Throwable th = concurrentHashMap.get(strA2);
                    if (th != null && f165203f.add(g(strSubstring, str))) {
                        String strA3 = androidx.constraintlayout.motion.widget.s.a("LOCK-ORDER CYCLE: ", strSubstring, " and ", str, " are taken in BOTH orders (AB-BA) -- see docs/gaia-lock-order.md");
                        if (f165199b) {
                            throw new IllegalStateException(strA3);
                        }
                        String str2 = strA3 + " [this order: " + strA + "]";
                        if (thPutIfAbsent == null) {
                            thPutIfAbsent = new Throwable(w.y.a("took ", strA));
                        }
                        Log.e(f165198a, str2, thPutIfAbsent);
                        Log.e(f165198a, strA3 + " [other order: " + strA2 + "]", th);
                    }
                }
            }
        }
    }

    public static void b(String str, String... strArr) {
        ThreadLocal<a> threadLocal = f165204g;
        a aVar = threadLocal.get();
        if (aVar != null) {
            aVar.f165207c++;
        } else {
            threadLocal.set(new a(str, strArr));
        }
    }

    public static void c(String str) {
        if (f165200c) {
            List<String> listE = e();
            if (((ArrayList) listE).isEmpty()) {
                return;
            }
            a aVar = f165204g.get();
            if (aVar != null) {
                k(aVar, str, listE);
            } else {
                l(str, listE);
            }
        }
    }

    public static void d() {
        ThreadLocal<a> threadLocal = f165204g;
        a aVar = threadLocal.get();
        if (aVar == null) {
            return;
        }
        int i10 = aVar.f165207c;
        if (i10 > 0) {
            aVar.f165207c = i10 - 1;
        } else {
            threadLocal.remove();
        }
    }

    public static List<String> e() {
        ArrayList arrayList = new ArrayList(2);
        for (b bVar : f165201d) {
            Object obj = bVar.f165209b.get();
            if (obj == null) {
                f165201d.remove(bVar);
            } else {
                String strA = bVar.a(obj);
                if (strA != null) {
                    arrayList.add(bVar.f165208a + strA);
                }
            }
        }
        return arrayList;
    }

    public static boolean f() {
        return !f165200c || ((ArrayList) e()).isEmpty();
    }

    public static String g(String str, String str2) {
        return str.compareTo(str2) <= 0 ? androidx.concurrent.futures.a.a(str, "|", str2) : androidx.concurrent.futures.a.a(str2, "|", str);
    }

    public static void h(String str, Object obj) {
        if (obj == null) {
            return;
        }
        CopyOnWriteArrayList<b> copyOnWriteArrayList = f165201d;
        copyOnWriteArrayList.add(new b(str, obj));
        Log.i(f165198a, "watching lock #" + copyOnWriteArrayList.size() + ": " + str);
    }

    public static <T> T i(String str, T t10) {
        h(str, t10);
        return t10;
    }

    public static void j(String str, String str2, List<String> list) {
        Throwable th = new Throwable("lock-order residue");
        if (f165203f.add("residue:" + n(th) + list)) {
            StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("LOCK-ORDER RESIDUE (accepted, see ", str2, "): ", str, " runs while holding ");
            sbA.append(list);
            Log.w(f165198a, sbA.toString());
        }
    }

    public static void k(a aVar, String str, List<String> list) {
        List<String> listO = o(list, aVar.f165206b);
        if (((ArrayList) listO).isEmpty()) {
            j(str, aVar.f165205a, list);
            return;
        }
        StringBuilder sbA = android.support.v4.media.f.a(str, " [inside a declared residue ");
        sbA.append(Arrays.toString(aVar.f165206b));
        sbA.append(" per ");
        sbA.append(aVar.f165205a);
        sbA.append(", but this stack also holds ");
        sbA.append(listO);
        sbA.append("]");
        l(sbA.toString(), list);
    }

    public static void l(String str, List<String> list) {
        String str2 = "LOCK-ORDER VIOLATION: " + str + " runs while holding " + list + " -- see docs/gaia-lock-order.md; this action must run on a stack with no gaia lock";
        if (f165199b) {
            throw new IllegalStateException(str2);
        }
        Throwable th = new Throwable("lock-order violation");
        if (f165203f.add(n(th) + list)) {
            Log.e(f165198a, str2, th);
        }
    }

    public static void m(String str, String str2, String... strArr) {
        if (f165200c) {
            List<String> listE = e();
            if (((ArrayList) listE).isEmpty()) {
                return;
            }
            List<String> listO = o(listE, strArr);
            if (((ArrayList) listO).isEmpty()) {
                j(str, str2, listE);
                return;
            }
            StringBuilder sbA = android.support.v4.media.f.a(str, " [declared residue ");
            F.a(sbA, Arrays.toString(strArr), " per ", str2, ", but this stack also holds ");
            sbA.append(listO);
            sbA.append("]");
            l(sbA.toString(), listE);
        }
    }

    public static String n(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(o.class.getName())) {
                sb2.append(stackTraceElement.getClassName());
                sb2.append('.');
                sb2.append(stackTraceElement.getMethodName());
                sb2.append(':');
                sb2.append(stackTraceElement.getLineNumber());
                sb2.append('|');
                i10++;
                if (i10 == 12) {
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public static List<String> o(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int iLastIndexOf = str.lastIndexOf(40);
            int i10 = 0;
            String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
            int length = strArr.length;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(str);
                    break;
                }
                if (strSubstring.equals(strArr[i10])) {
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }
}
