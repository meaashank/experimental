package com.prism.gaia.download;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.prism.gaia.download.d;
import com.prism.gaia.download.j;
import e.f0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f164540h = "asdf-".concat("DownloadService");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f164541i = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f164542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f164543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Long, d> f164544c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f0
    public b f164545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f164546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f0
    public p f164547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f164548g;

    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "Service ContentObserver received notification");
            }
            DownloadService.this.o();
        }
    }

    public class b extends Thread {
        public b() {
            super("Download Service");
        }

        public final void a(long j10) {
            AlarmManager alarmManager = (AlarmManager) DownloadService.this.getSystemService("alarm");
            if (alarmManager == null) {
                Log.e(com.prism.gaia.download.a.f164590a, "couldn't get alarm manager");
                return;
            }
            if (com.prism.gaia.download.a.f164587H) {
                Log.v(com.prism.gaia.download.a.f164590a, "scheduling retry in " + j10 + "ms");
            }
            Intent intent = new Intent(com.prism.gaia.download.a.f164598i);
            intent.setClassName(DownloadService.this.getPackageName(), h.class.getName());
            long jCurrentTimeMillis = DownloadService.this.f164547f.currentTimeMillis() + j10;
            DownloadService downloadService = DownloadService.this;
            alarmManager.set(0, jCurrentTimeMillis, downloadService.f164547f.i(downloadService, 0, intent, 1073741824));
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            DownloadService downloadService;
            String unused = DownloadService.f164540h;
            Process.setThreadPriority(10);
            while (true) {
                boolean z10 = false;
                long j10 = Long.MAX_VALUE;
                while (true) {
                    synchronized (DownloadService.this) {
                        try {
                            downloadService = DownloadService.this;
                            if (downloadService.f164545d != this) {
                                throw new IllegalStateException("multiple UpdateThreads in DownloadService");
                            }
                            if (!downloadService.f164546e) {
                                downloadService.f164545d = null;
                                if (!z10) {
                                    downloadService.stopSelf();
                                }
                                if (j10 != Long.MAX_VALUE) {
                                    a(j10);
                                }
                                return;
                            }
                            downloadService.f164546e = false;
                        } finally {
                        }
                    }
                    long jCurrentTimeMillis = downloadService.f164547f.currentTimeMillis();
                    HashSet hashSet = new HashSet(DownloadService.this.f164544c.keySet());
                    Cursor cursorQuery = DownloadService.this.getContentResolver().query(j.b.f164750k, null, null, null, null);
                    if (cursorQuery == null) {
                        break;
                    }
                    try {
                        d.a aVar = new d.a(DownloadService.this.getContentResolver(), cursorQuery);
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                        if (com.prism.gaia.download.a.f164589J) {
                            Log.i(com.prism.gaia.download.a.f164590a, "number of rows from downloads-db: " + cursorQuery.getCount());
                        }
                        cursorQuery.moveToFirst();
                        boolean z11 = false;
                        long j11 = Long.MAX_VALUE;
                        while (!cursorQuery.isAfterLast()) {
                            long j12 = cursorQuery.getLong(columnIndexOrThrow);
                            hashSet.remove(Long.valueOf(j12));
                            d dVarM = DownloadService.this.f164544c.get(Long.valueOf(j12));
                            if (dVarM != null) {
                                DownloadService.this.n(aVar, dVarM, jCurrentTimeMillis);
                            } else {
                                dVarM = DownloadService.this.m(aVar, jCurrentTimeMillis);
                            }
                            if (dVarM.j()) {
                                z11 = true;
                            }
                            long jN = dVarM.n(jCurrentTimeMillis);
                            if (jN == 0) {
                                z11 = true;
                            } else if (jN > 0 && jN < j11) {
                                j11 = jN;
                            }
                            cursorQuery.moveToNext();
                        }
                        cursorQuery.close();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            DownloadService.this.k(((Long) it.next()).longValue());
                        }
                        Iterator<d> it2 = DownloadService.this.f164544c.values().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z10 = z11;
                                break;
                            }
                            d next = it2.next();
                            if (next.f164666y && TextUtils.isEmpty(next.f164667z)) {
                                z10 = true;
                                break;
                            }
                        }
                        DownloadService downloadService2 = DownloadService.this;
                        downloadService2.f164543b.g(downloadService2.f164544c.values());
                        for (d dVar : DownloadService.this.f164544c.values()) {
                            if (dVar.f164666y) {
                                DownloadService.this.l(dVar.f164646e);
                                DownloadService.this.getContentResolver().delete(j.b.f164750k, "_id = ? ", new String[]{String.valueOf(dVar.f164642a)});
                            }
                        }
                        j10 = j11;
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator<d> it = this.f164544c.values().iterator();
        while (it.hasNext()) {
            it.next().e(printWriter);
        }
    }

    public final void k(long j10) {
        d dVar = this.f164544c.get(Long.valueOf(j10));
        if (dVar.f164651j == 192) {
            dVar.f164651j = j.b.f164695C0;
        }
        if (dVar.f164648g != 0 && dVar.f164646e != null) {
            new File(dVar.f164646e).delete();
        }
        this.f164547f.g(dVar.f164642a);
        this.f164544c.remove(Long.valueOf(dVar.f164642a));
    }

    public final void l(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Log.i(com.prism.gaia.download.a.f164590a, "deleting " + str);
            new File(str).delete();
        } catch (Exception e10) {
            Log.w(com.prism.gaia.download.a.f164590a, "file: '" + str + "' couldn't be deleted", e10);
        }
    }

    public final d m(d.a aVar, long j10) {
        d dVarH = aVar.h(this, this.f164547f);
        this.f164544c.put(Long.valueOf(dVarH.f164642a), dVarH);
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "processing inserted download " + dVarH.f164642a);
        }
        dVarH.t(j10, this.f164548g);
        return dVarH;
    }

    public final void n(d.a aVar, d dVar, long j10) {
        int i10 = dVar.f164649h;
        int i11 = dVar.f164651j;
        aVar.j(dVar);
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "processing updated download " + dVar.f164642a + ", status: " + dVar.f164651j);
        }
        boolean z10 = false;
        boolean z11 = i10 == 1 && dVar.f164649h != 1 && j.b.c(dVar.f164651j);
        if (!j.b.c(i11) && j.b.c(dVar.f164651j)) {
            z10 = true;
        }
        if (z11 || z10) {
            this.f164547f.g(dVar.f164642a);
        }
        dVar.t(j10, this.f164548g);
    }

    public final void o() {
        synchronized (this) {
            try {
                this.f164546e = true;
                if (this.f164545d == null) {
                    b bVar = new b();
                    this.f164545d = bVar;
                    this.f164547f.b(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Cannot bind to Download Manager Service");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "Service onCreate");
        }
        if (this.f164547f == null) {
            this.f164547f = new m(this);
        }
        this.f164542a = new a();
        getContentResolver().registerContentObserver(j.b.f164750k, true, this.f164542a);
        this.f164543b = new f(this, this.f164547f);
        this.f164547f.k();
        this.f164548g = o.h(getApplicationContext());
        o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        getContentResolver().unregisterContentObserver(this.f164542a);
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "Service onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        int iOnStartCommand = super.onStartCommand(intent, i10, i11);
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "Service onStart");
        }
        o();
        return iOnStartCommand;
    }
}
