package com.prism.gaia.download;

import U6.o;
import android.R;
import android.app.Notification;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.prism.gaia.download.j;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164670d = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f164671e = "(status >= '100') AND (status <= '199') AND (visibility IS NULL OR visibility == '0' OR visibility == '1')";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f164672f = "status >= '200' AND visibility == '1'";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f164673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, a> f164674b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f164675c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f164676a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f164680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f164681f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f164677b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f164678c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f164679d = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String[] f164682g = new String[2];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f164683h = null;

        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.String r4, long r5, long r7) {
            /*
                r3 = this;
                long r0 = r3.f164677b
                long r0 = r0 + r5
                r3.f164677b = r0
                r5 = 0
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                r0 = -1
                if (r5 <= 0) goto L18
                long r5 = r3.f164678c
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L14
                goto L18
            L14:
                long r5 = r5 + r7
                r3.f164678c = r5
                goto L1a
            L18:
                r3.f164678c = r0
            L1a:
                int r5 = r3.f164679d
                r6 = 2
                if (r5 >= r6) goto L23
                java.lang.String[] r6 = r3.f164682g
                r6[r5] = r4
            L23:
                int r5 = r5 + 1
                r3.f164679d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.download.f.a.a(java.lang.String, long, long):void");
        }
    }

    public f(Context context, p pVar) {
        this.f164673a = context;
        this.f164675c = pVar;
    }

    public static String a(Context context, long j10, long j11) {
        if (j10 <= 0) {
            return null;
        }
        return context.getString(o.n.f72180c0, Integer.valueOf((int) ((j11 * 100) / j10)));
    }

    public final boolean b(d dVar) {
        int i10 = dVar.f164651j;
        return 100 <= i10 && i10 < 200 && dVar.f164649h != 2;
    }

    public final boolean c(d dVar) {
        return dVar.f164651j >= 200 && dVar.f164649h == 1;
    }

    public void d(long j10, String str, int i10, int i11, long j11) {
        String string;
        Intent intent;
        Notification.Builder builder = new Notification.Builder(this.f164673a);
        builder.setSmallIcon(R.drawable.stat_sys_download_done);
        if (str == null || str.length() == 0) {
            str = this.f164673a.getResources().getString(o.n.f72192e0);
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(j.b.f164750k, j10);
        if (j.b.d(i10)) {
            string = this.f164673a.getResources().getString(o.n.f72171a3);
            intent = new Intent(com.prism.gaia.download.a.f164600k);
        } else {
            string = this.f164673a.getResources().getString(o.n.f72165Z2);
            intent = i11 != 5 ? new Intent(com.prism.gaia.download.a.f164599j) : new Intent(com.prism.gaia.download.a.f164600k);
        }
        intent.setClassName(this.f164673a.getPackageName(), h.class.getName());
        intent.setData(uriWithAppendedId);
        builder.setWhen(j11);
        builder.setContentTitle(str);
        builder.setContentText(string);
        builder.setContentIntent(this.f164675c.i(this.f164673a, 0, intent, 0));
        Intent intent2 = new Intent(com.prism.gaia.download.a.f164601l);
        intent2.setClassName(this.f164673a.getPackageName(), h.class.getName());
        intent2.setData(uriWithAppendedId);
        builder.setDeleteIntent(this.f164675c.i(this.f164673a, 0, intent2, 0));
        this.f164675c.h(j10, builder.getNotification());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.Collection<com.prism.gaia.download.d> r14) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.download.f.e(java.util.Collection):void");
    }

    public final void f(Collection<d> collection) {
        for (d dVar : collection) {
            if (c(dVar)) {
                d(dVar.f164642a, dVar.f164635D, dVar.f164651j, dVar.f164648g, dVar.f164654m);
            }
        }
    }

    public void g(Collection<d> collection) {
        e(collection);
        f(collection);
    }
}
