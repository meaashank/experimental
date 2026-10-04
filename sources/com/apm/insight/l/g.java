package com.apm.insight.l;

import androidx.loader.content.ModernAsyncTask;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f137362a;

    static {
        HashSet hashSet = new HashSet();
        f137362a = hashSet;
        hashSet.add("HeapTaskDaemon");
        hashSet.add("ThreadPlus");
        hashSet.add("ApiDispatcher");
        hashSet.add("ApiLocalDispatcher");
        p.a(hashSet, "AsyncLoader", ModernAsyncTask.f114387f, "Binder", "PackageProcessor");
        p.a(hashSet, "SettingsObserver", "WifiManager", "JavaBridge", "Compiler");
        p.a(hashSet, "Signal Catcher", "GC", "ReferenceQueueDaemon", "FinalizerDaemon");
        p.a(hashSet, "FinalizerWatchdogDaemon", "CookieSyncManager", "RefQueueWorker", "CleanupReference");
        p.a(hashSet, "VideoManager", "DBHelper-AsyncOp", "InstalledAppTracker2", "AppData-AsyncOp");
        p.a(hashSet, "IdleConnectionMonitor", "LogReaper", "ActionReaper", "Okio Watchdog");
        p.a(hashSet, "CheckWaitingQueue", "NPTH-CrashTimer", "NPTH-JavaCallback", "NPTH-LocalParser");
        hashSet.add("ANR_FILE_MODIFY");
    }

    public static Set<String> a() {
        return f137362a;
    }

    public static boolean a(Throwable th) {
        return th == null || (th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException);
    }
}
