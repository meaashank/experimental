package com.prism.gaia.download;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.snapshots.z;
import com.prism.commons.utils.C3849m;
import com.prism.gaia.download.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f164814h = 209715200;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f164815i = 20971520;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static o f164816j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f164817k = 1048576;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f164818l = 250;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f164823e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164822d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164824f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f164825g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f164821c = D9.d.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f164819a = D9.d.H(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f164820b = D9.d.f23006r;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            o.this.l();
            o.this.o();
        }
    }

    public o(Context context) {
        this.f164823e = context;
        n();
    }

    public static synchronized o h(Context context) {
        try {
            if (f164816j == null) {
                f164816j = new o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f164816j;
    }

    /* JADX WARN: Finally extract failed */
    public final long c(int i10, long j10) {
        Log.i(com.prism.gaia.download.a.f164590a, "discardPurgeableFiles: destination = " + i10 + ", targetBytes = " + j10);
        Cursor cursorQuery = this.f164823e.getContentResolver().query(j.b.f164750k, null, "( status = '200' AND destination = ? )", new String[]{i10 == 5 ? String.valueOf(i10) : String.valueOf(2)}, j.b.f164780z);
        long length = 0;
        if (cursorQuery == null) {
            return 0L;
        }
        while (cursorQuery.moveToNext() && length < j10) {
            try {
                File file = new File(C3849m.e(cursorQuery, j.b.f164768t, null));
                Log.i(com.prism.gaia.download.a.f164590a, "purging " + file.getAbsolutePath() + " for " + file.length() + " bytes");
                length += file.length();
                file.delete();
                this.f164823e.getContentResolver().delete(ContentUris.withAppendedId(j.b.f164750k, C3849m.c(cursorQuery, "_id", -1L)), null, null);
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        String str = com.prism.gaia.download.a.f164590a;
        StringBuilder sbA = z.a("Purged files, freed ", length, " for ");
        sbA.append(j10);
        sbA.append(" requested");
        Log.i(str, sbA.toString());
        return length;
    }

    public final synchronized void d(File file, long j10, int i10) throws StopRequestException {
        if (j10 == 0) {
            return;
        }
        if (i10 == 4 || i10 == 0) {
            try {
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    throw new StopRequestException(199, "external media not mounted");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long jF = f(file);
        if (jF < f164815i) {
            c(i10, f164815i);
            l();
            jF = f(file);
            if (jF < f164815i) {
                if (!file.equals(this.f164820b)) {
                    throw new StopRequestException(198, "space in the filesystem rooted at: " + file + " is below 10% availability. stopping this download.");
                }
                Log.w(com.prism.gaia.download.a.f164590a, "System cache dir ('/cache') is running low on space.space available (in bytes): " + jF);
            }
        }
        if (file.equals(this.f164821c)) {
            jF = e(this.f164821c);
            if (jF < f164815i) {
                Log.w(com.prism.gaia.download.a.f164590a, "Downloads data dir: " + file + " is running low on space. space available (in bytes): " + jF);
            }
            if (jF < j10) {
                c(i10, f164815i);
                l();
                jF = e(this.f164821c);
            }
        }
        if (jF >= j10) {
            return;
        }
        throw new StopRequestException(198, "not enough free space in the filesystem rooted at: " + file + " and unable to free any more");
    }

    public final long e(File file) {
        File[] fileArrListFiles = file.listFiles();
        long length = f164814h;
        if (fileArrListFiles == null) {
            return f164814h;
        }
        for (File file2 : fileArrListFiles) {
            length -= file2.length();
        }
        if (com.prism.gaia.download.a.f164587H) {
            Log.i(com.prism.gaia.download.a.f164590a, "available space (in bytes) in downloads data dir: " + length);
        }
        return length;
    }

    public final long f(File file) {
        StatFs statFs = new StatFs(file.getPath());
        long blockSize = ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
        if (com.prism.gaia.download.a.f164587H) {
            Log.i(com.prism.gaia.download.a.f164590a, "available space (in bytes) in filesystem rooted at: " + file.getPath() + " is: " + blockSize);
        }
        return blockSize;
    }

    public File g() {
        return this.f164821c;
    }

    public final synchronized int i(long j10) {
        int i10;
        i10 = (int) (((long) this.f164822d) + j10);
        this.f164822d = i10;
        return i10;
    }

    public synchronized void j() {
        int i10 = this.f164824f + 1;
        this.f164824f = i10;
        if (i10 % 250 == 0) {
            n();
        }
    }

    public File k(String str, int i10, long j10) throws StopRequestException {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return this.f164821c;
            }
            if (i10 == 5) {
                return this.f164820b;
            }
            throw new IllegalStateException(android.support.v4.media.c.a("unexpected value for destination: ", i10));
        }
        File file = new File(this.f164819a.getPath() + com.prism.gaia.download.a.f164607r);
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        throw new StopRequestException(j.b.f164699E0, "unable to create external downloads directory " + file.getPath());
    }

    public final void l() {
        Log.i(com.prism.gaia.download.a.f164590a, "in removeSpuriousFiles");
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f164820b.listFiles();
        if (fileArrListFiles != null) {
            arrayList.addAll(Arrays.asList(fileArrListFiles));
        }
        File[] fileArrListFiles2 = this.f164821c.listFiles();
        if (fileArrListFiles2 != null) {
            arrayList.addAll(Arrays.asList(fileArrListFiles2));
        }
        if (arrayList.size() == 0) {
            return;
        }
        Cursor cursorQuery = this.f164823e.getContentResolver().query(j.b.f164750k, new String[]{j.b.f164768t}, null, null, null);
        int i10 = 0;
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        Log.i(com.prism.gaia.download.a.f164590a, "in removeSpuriousFiles, preserving file " + string);
                        arrayList.remove(new File(string));
                    }
                } finally {
                    cursorQuery.close();
                }
            }
        }
        if (cursorQuery != null) {
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            File file = (File) obj;
            if (!file.getName().equals(com.prism.gaia.download.a.f164608s) && !file.getName().equalsIgnoreCase(com.prism.gaia.download.a.f164609t)) {
                Log.i(com.prism.gaia.download.a.f164590a, "deleting spurious file " + file.getAbsolutePath());
                file.delete();
            }
        }
    }

    public final synchronized void m() {
        this.f164822d = 0;
    }

    public final synchronized void n() {
        Thread thread = this.f164825g;
        if (thread == null || !thread.isAlive()) {
            a aVar = new a();
            this.f164825g = aVar;
            aVar.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final void o() throws Throwable {
        Cursor cursorQuery;
        if (com.prism.gaia.download.a.f164587H) {
            Log.i(com.prism.gaia.download.a.f164590a, "in trimDatabase");
        }
        ?? r12 = 0;
        Cursor cursor = null;
        try {
            try {
                cursorQuery = this.f164823e.getContentResolver().query(j.b.f164750k, new String[]{"_id"}, "status >= '200'", null, j.b.f164780z);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        try {
        } catch (SQLiteException e11) {
            e = e11;
            cursor = cursorQuery;
            Log.w(com.prism.gaia.download.a.f164590a, "trimDatabase failed with exception: " + e.getMessage());
            r12 = cursor;
            if (cursor != null) {
                cursor.close();
                r12 = cursor;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = cursorQuery;
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
        if (cursorQuery == null) {
            Log.e(com.prism.gaia.download.a.f164590a, "null cursor in trimDatabase");
            r12 = "null cursor in trimDatabase";
            if (cursorQuery != null) {
                cursorQuery.close();
                return;
            }
            return;
        }
        if (cursorQuery.moveToFirst()) {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            for (int count = cursorQuery.getCount() - 1000; count > 0; count--) {
                this.f164823e.getContentResolver().delete(ContentUris.withAppendedId(j.b.f164750k, cursorQuery.getLong(columnIndexOrThrow)), null, null);
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            }
        }
        cursorQuery.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(int r5, java.lang.String r6, long r7) throws com.prism.gaia.download.StopRequestException {
        /*
            r4 = this;
            r4.m()
            boolean r0 = com.prism.gaia.download.a.f164587H
            java.lang.String r1 = ", path: "
            if (r0 == 0) goto L2a
            java.lang.String r0 = com.prism.gaia.download.a.f164590a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "in verifySpace, destination: "
            r2.<init>(r3)
            r2.append(r5)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r3 = ", length: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
        L2a:
            if (r6 == 0) goto L8f
            if (r5 == 0) goto L6d
            r0 = 1
            if (r5 == r0) goto L6a
            r0 = 2
            if (r5 == r0) goto L6a
            r0 = 3
            if (r5 == r0) goto L6a
            r0 = 4
            if (r5 == r0) goto L41
            r0 = 5
            if (r5 == r0) goto L3e
            goto L68
        L3e:
            java.io.File r0 = r4.f164820b
            goto L6f
        L41:
            boolean r0 = D9.d.u0(r6)
            if (r0 == 0) goto L4a
            java.io.File r0 = r4.f164819a
            goto L6f
        L4a:
            java.io.File r0 = r4.f164821c
            java.lang.String r0 = r0.getPath()
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L59
            java.io.File r0 = r4.f164821c
            goto L6f
        L59:
            java.io.File r0 = r4.f164820b
            java.lang.String r0 = r0.getPath()
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L68
            java.io.File r0 = r4.f164820b
            goto L6f
        L68:
            r0 = 0
            goto L6f
        L6a:
            java.io.File r0 = r4.f164821c
            goto L6f
        L6d:
            java.io.File r0 = r4.f164819a
        L6f:
            if (r0 == 0) goto L75
            r4.d(r0, r7, r5)
            return
        L75:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid combination of destination: "
            r8.<init>(r0)
            r8.append(r5)
            r8.append(r1)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
        L8f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "path can't be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.download.o.p(int, java.lang.String, long):void");
    }

    public void q(int i10, String str, long j10) throws StopRequestException {
        if (i(j10) < 1048576) {
            return;
        }
        p(i10, str, j10);
    }
}
