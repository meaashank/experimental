package X6;

import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f78717a = "GaiaThreadDump";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f78718b = "debug.gaia.dumpthreads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f78719c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f78720d = new AtomicBoolean();

    public static void a(Set<Thread> set, ThreadGroup threadGroup) {
        if (threadGroup == null) {
            return;
        }
        Thread[] threadArr = new Thread[(threadGroup.activeCount() * 2) + 16];
        set.addAll(Arrays.asList(threadArr).subList(0, threadGroup.enumerate(threadArr, true)));
    }

    public static void b(String str) {
        LinkedHashSet<Thread> linkedHashSet = new LinkedHashSet();
        Thread thread = Looper.getMainLooper().getThread();
        linkedHashSet.add(thread);
        a(linkedHashSet, thread.getThreadGroup());
        a(linkedHashSet, Thread.currentThread().getThreadGroup());
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup != null && threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        a(linkedHashSet, threadGroup);
        linkedHashSet.addAll(Thread.getAllStackTraces().keySet());
        Log.w(f78717a, "==== pid " + Process.myPid() + " (" + str + "): " + linkedHashSet.size() + " threads");
        for (Thread thread2 : linkedHashSet) {
            Log.w(f78717a, "\"" + thread2.getName() + "\" id=" + thread2.getId() + " state=" + thread2.getState());
            for (StackTraceElement stackTraceElement : thread2.getStackTrace()) {
                Log.w(f78717a, "    at " + stackTraceElement);
            }
        }
        Log.w(f78717a, "==== end pid " + Process.myPid());
    }

    public static /* synthetic */ void c(Method method, String str) {
        String strD = d(method);
        while (true) {
            try {
                Thread.sleep(1000L);
                String strD2 = d(method);
                if (strD2 != null && !strD2.equals(strD)) {
                    String str2 = strD2.split(com.prism.gaia.download.a.f164606q, 2)[0];
                    if ("all".equals(str2) || str2.equals(str) || str2.equals(String.valueOf(Process.myPid()))) {
                        b(str);
                    }
                    strD = strD2;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public static String d(Method method) {
        try {
            return (String) method.invoke(null, f78718b);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(String str) {
    }
}
