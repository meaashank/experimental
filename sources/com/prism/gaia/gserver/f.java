package com.prism.gaia.gserver;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import com.prism.commons.utils.C3836a;
import com.prism.commons.utils.C3858w;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.bit32bit64.FileCompat;
import com.prism.gaia.helper.io.GFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class f extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f164902e = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f164905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageInstaller f164906d = GaiaContext.j().T().getPackageInstaller();

    public f(String str, String str2, String[] strArr) {
        this.f164903a = str;
        this.f164904b = str2;
        this.f164905c = strArr;
    }

    public static void a(PackageInstaller packageInstaller, int i10) throws Exception {
        PackageInstaller.Session sessionOpenSession = null;
        try {
            Context contextN = GaiaContext.j().n();
            sessionOpenSession = packageInstaller.openSession(i10);
            sessionOpenSession.commit(PendingIntent.getService(contextN, 0, new Intent(contextN, (Class<?>) UnhideGuestService.class), C3836a.b.a(0)).getIntentSender());
        } finally {
            try {
                sessionOpenSession.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(PackageInstaller packageInstaller, int i10, String str) throws Exception {
        Throwable th;
        OutputStream outputStream;
        PackageInstaller.Session sessionOpenSession;
        byte[] bArr = new byte[32768];
        GFile gFile = new GFile(str);
        InputStream inputStream = null;
        OutputStream outputStreamOpenWrite = null;
        inputStream = null;
        try {
            sessionOpenSession = packageInstaller.openSession(i10);
            try {
                InputStream inputStreamO = FileCompat.o(gFile);
                try {
                    outputStreamOpenWrite = sessionOpenSession.openWrite(gFile.getName(), 0L, -1L);
                    while (true) {
                        int i11 = inputStreamO.read(bArr);
                        if (i11 <= 0) {
                            sessionOpenSession.fsync(outputStreamOpenWrite);
                            C3858w.f(inputStreamO);
                            C3858w.f(outputStreamOpenWrite);
                            C3858w.f(sessionOpenSession);
                            return;
                        }
                        outputStreamOpenWrite.write(bArr, 0, i11);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    OutputStream outputStream2 = outputStreamOpenWrite;
                    inputStream = inputStreamO;
                    outputStream = outputStream2;
                    C3858w.f(inputStream);
                    C3858w.f(outputStream);
                    C3858w.f(sessionOpenSession);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            sessionOpenSession = null;
        }
    }

    public final void b() throws Exception {
        int iCreateSession = this.f164906d.createSession(new PackageInstaller.SessionParams(1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f164904b);
        String[] strArr = this.f164905c;
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c(this.f164906d, iCreateSession, (String) obj);
        }
        a(this.f164906d, iCreateSession);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            b();
        } catch (Exception unused) {
        }
    }
}
