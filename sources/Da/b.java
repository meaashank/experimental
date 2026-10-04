package Da;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaScannerConnection;
import android.util.Log;
import android.view.View;
import androidx.core.app.C2382e;
import com.prism.commons.utils.C3840d;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f23031a = l0.b(b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f23032b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<d> f23033c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f23034d = false;

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f23035a = "reason";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f23036b = "recentapps";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f23037c = "homekey";

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            Log.d(b.f23031a, "onReceive: " + intent);
            if (!"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("reason")) == null) {
                return;
            }
            if (stringExtra.equals(f23037c) || stringExtra.equals(f23036b)) {
                b.g();
            }
        }

        public a(c cVar) {
        }
    }

    /* JADX INFO: renamed from: Da.b$b, reason: collision with other inner class name */
    public static class C0020b extends BroadcastReceiver {
        public C0020b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.d(b.f23031a, "onReceive: " + intent);
            b.f();
        }

        public C0020b(c cVar) {
        }
    }

    public static void d(Context context) {
        if (f23034d) {
            return;
        }
        synchronized (b.class) {
            try {
                if (f23034d) {
                    return;
                }
                e(context);
                f23034d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Context context) {
        C3840d.a(context, new C0020b(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        C3840d.a(context, new a(), new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public static void f() {
        ReentrantReadWriteLock.ReadLock lock = f23032b.readLock();
        lock.lock();
        try {
            Iterator<d> it = f23033c.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
        } catch (Throwable th) {
            try {
                Log.w(f23031a, th);
            } finally {
                lock.unlock();
            }
        }
    }

    public static void g() {
        ReentrantReadWriteLock.ReadLock lock = f23032b.readLock();
        lock.lock();
        try {
            Iterator<d> it = f23033c.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        } catch (Throwable th) {
            try {
                Log.w(f23031a, th);
            } finally {
                lock.unlock();
            }
        }
    }

    public static void h(d dVar) {
        ReentrantReadWriteLock.WriteLock writeLock = f23032b.writeLock();
        writeLock.lock();
        try {
            f23033c.add(dVar);
        } finally {
            writeLock.unlock();
        }
    }

    public static void i(Context context, Collection<String> collection) {
        j(context, (String[]) collection.toArray(new String[0]));
    }

    public static void j(Context context, String... strArr) {
        I.a(f23031a, "scanFile has been called");
        MediaScannerConnection.scanFile(context, strArr, null, null);
    }

    public static void k(Context context, Intent intent, View view) {
        context.startActivity(intent, ((C2382e.a) C2382e.e(view, view.getWidth() / 2, view.getHeight() / 2, view.getWidth(), view.getHeight())).f111021c.toBundle());
    }

    public static void l(d dVar) {
        ReentrantReadWriteLock.WriteLock writeLock = f23032b.writeLock();
        writeLock.lock();
        try {
            f23033c.remove(dVar);
        } finally {
            writeLock.unlock();
        }
    }
}
