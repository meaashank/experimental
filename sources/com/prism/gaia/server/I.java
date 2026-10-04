package com.prism.gaia.server;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.V;
import com.prism.gaia.ui.EmptyActivity;
import g6.C4455a;
import p6.InterfaceC5394a;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class I extends V.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166107b = "asdf-".concat(I.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166108c = "guest_crash";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f166109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p6.d f166110e;

    static {
        I i10 = new I();
        f166109d = i10;
        f166110e = new p6.d("guest_crash", i10, null);
    }

    public static InterfaceC5394a T5() {
        return f166110e;
    }

    public static void h2(GGuestUncaughtException gGuestUncaughtException, boolean z10) throws Throwable {
        Throwable th;
        String str;
        boolean z11;
        Exception exc;
        Exception exc2;
        String str2;
        Context contextN = GaiaContext.j().n();
        boolean zIsMainThread = false;
        try {
            Exception exception = gGuestUncaughtException.getException();
            try {
                String packageName = gGuestUncaughtException.getPackageName();
                try {
                    zIsMainThread = gGuestUncaughtException.isMainThread();
                    if (z10) {
                        GProcessSupervisorProvider.E(gGuestUncaughtException.getPid());
                        contextN.startActivity(new Intent(contextN, (Class<?>) EmptyActivity.class));
                        if (GaiaContext.f164212y.q() != null) {
                            gGuestUncaughtException.getPackageName();
                            gGuestUncaughtException.getException();
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IS_GUEST_MAIN_THREAAD", zIsMainThread);
                    C5705o.c().e(exception, packageName, gGuestUncaughtException.getProcessName(), "GUEST_UNCAUGHT", bundle);
                } catch (Exception unused) {
                    exc2 = exception;
                    str2 = packageName;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("IS_GUEST_MAIN_THREAAD", zIsMainThread);
                    C5705o.c().e(exc2, str2, gGuestUncaughtException.getProcessName(), "GUEST_UNCAUGHT", bundle2);
                } catch (Throwable th2) {
                    th = th2;
                    z11 = zIsMainThread;
                    exc = exception;
                    str = packageName;
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("IS_GUEST_MAIN_THREAAD", z11);
                    C5705o.c().e(exc, str, gGuestUncaughtException.getProcessName(), "GUEST_UNCAUGHT", bundle3);
                    throw th;
                }
            } catch (Exception unused2) {
                str2 = null;
                exc2 = exception;
            } catch (Throwable th3) {
                th = th3;
                str = null;
                z11 = false;
                exc = exception;
            }
        } catch (Exception unused3) {
            exc2 = null;
            str2 = null;
        } catch (Throwable th4) {
            th = th4;
            str = null;
            z11 = false;
            exc = null;
        }
    }

    public static I v5() {
        return f166109d;
    }

    @Override // com.prism.gaia.server.V
    public void l(final GGuestUncaughtException gGuestUncaughtException, final boolean z10) throws RemoteException {
        gGuestUncaughtException.getPid();
        gGuestUncaughtException.isMainThread();
        gGuestUncaughtException.getProcessName();
        gGuestUncaughtException.getPackageName();
        gGuestUncaughtException.getException();
        C4455a.b().c().postAtFrontOfQueue(new Runnable() { // from class: com.prism.gaia.server.H
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                I.h2(gGuestUncaughtException, z10);
            }
        });
    }
}
