package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f154593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f154594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f154595c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f154596d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    public class RunnableC0550a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f154597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f154599c;

        public RunnableC0550a(c.a aVar, String str, String str2) {
            this.f154597a = aVar;
            this.f154598b = str;
            this.f154599c = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.load.downloader.database.a.RunnableC0550a.run():void");
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f154601a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f154601a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f154596d)) {
                a aVar = a.this;
                aVar.f154596d = aVar.f154593a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f154596d) || !a.this.f154596d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.f154596d.beginTransaction();
                    a.this.f154596d.insertWithOnConflict(a.this.f154595c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f154601a), 4);
                    a.this.f154596d.setTransactionSuccessful();
                } catch (Exception e10) {
                    q0.b(IDatabaseHelper.TAG, e10.getMessage());
                    try {
                        if (a.this.f154596d.inTransaction()) {
                            a.this.f154596d.endTransaction();
                        }
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                }
            } finally {
                try {
                    if (a.this.f154596d.inTransaction()) {
                        a.this.f154596d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f154603a;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f154603a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f154596d)) {
                a aVar = a.this;
                aVar.f154596d = aVar.f154593a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f154596d) || !a.this.f154596d.isOpen()) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f154603a.b())) {
                    a.this.f154596d.update(a.this.f154595c, com.mbridge.msdk.config.component.load.downloader.database.b.b(this.f154603a), "cacheKey = ? ", new String[]{this.f154603a.b()});
                } else {
                    if (TextUtils.isEmpty(this.f154603a.f())) {
                        return;
                    }
                    a.this.f154596d.update(a.this.f154595c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f154603a), "originalURL = ? ", new String[]{this.f154603a.f()});
                }
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, d dVar) {
        this.f154594b = handler;
        this.f154593a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.f154594b.post(new RunnableC0550a(aVar, str2, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f154594b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f154594b.post(new c(bVar));
    }
}
