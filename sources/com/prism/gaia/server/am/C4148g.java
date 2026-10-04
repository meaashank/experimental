package com.prism.gaia.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C1979x1;
import com.prism.gaia.naked.compat.android.os.HandlerCompat2;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.prism.gaia.server.am.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4148g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f166843m = "BroadcastQueue";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f166844n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f166845o = 200;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f166846p = 200;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f166847q = 201;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f166848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4147f f166849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f166851d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f166856i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f166858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f166859l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<BinderC4149h> f166852e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<BinderC4149h> f166853f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BinderC4149h f166854g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f166855h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BinderC4149h f166857j = null;

    /* JADX INFO: renamed from: com.prism.gaia.server.am.g$a */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper, null);
            HandlerCompat2.Util.setAsynchronous(this, true);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 200) {
                C4148g.this.p(true);
            } else {
                if (i10 != 201) {
                    return;
                }
                synchronized (C4148g.this.f166848a) {
                    C4148g.this.c(true);
                }
            }
        }
    }

    public C4148g(q qVar, Handler handler, String str, C4147f c4147f, boolean z10) {
        this.f166848a = qVar;
        this.f166859l = new a(handler.getLooper());
        this.f166850c = str;
        this.f166851d = z10;
        this.f166849b = c4147f;
    }

    public final void a(BinderC4149h binderC4149h) {
        if (binderC4149h.f166885f < 0) {
            return;
        }
        binderC4149h.f166899t = SystemClock.uptimeMillis();
    }

    public void b(int i10) {
        BinderC4149h binderC4149h = this.f166854g;
        if (binderC4149h != null && binderC4149h.f166889j == i10 && binderC4149h.f166871B == 4) {
            binderC4149h.f166878I = null;
            binderC4149h.f166871B = 0;
            p(false);
        }
    }

    public final void c(boolean z10) {
        Object obj;
        if (z10) {
            this.f166856i = false;
        }
        if (this.f166854g == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        BinderC4149h binderC4149h = this.f166854g;
        if (z10) {
            if (binderC4149h.f166900u) {
                binderC4149h.f166880a.getAction();
                return;
            }
            long j10 = binderC4149h.f166898s + this.f166849b.f166837a;
            if (j10 > jUptimeMillis) {
                w(j10);
                return;
            }
        }
        if (binderC4149h.f166871B == 4) {
            ComponentName componentName = binderC4149h.f166878I;
            if (componentName != null) {
                componentName.flattenToShortString();
            }
            binderC4149h.f166878I = null;
            binderC4149h.f166871B = 0;
            p(false);
            return;
        }
        binderC4149h.toString();
        Objects.toString(binderC4149h.f166870A);
        binderC4149h.f166898s = jUptimeMillis;
        binderC4149h.f166872C++;
        int i10 = binderC4149h.f166905z;
        if (i10 > 0) {
            obj = binderC4149h.f166891l.get(i10 - 1);
            binderC4149h.f166892m[binderC4149h.f166905z - 1] = 3;
        } else {
            obj = binderC4149h.f166879J;
        }
        binderC4149h.toString();
        Objects.toString(obj);
        if (this.f166857j == binderC4149h) {
            this.f166857j = null;
        }
        j(binderC4149h, binderC4149h.f166901v, binderC4149h.f166902w, binderC4149h.f166903x, binderC4149h.f166904y, false);
        u();
    }

    public final void d() {
        if (this.f166856i) {
            this.f166859l.removeMessages(201, this);
            this.f166856i = false;
        }
    }

    public final void e(BinderC4149h binderC4149h, BroadcastFilterG broadcastFilterG, boolean z10, int i10) {
        q qVar = this.f166848a;
        String str = binderC4149h.f166883d;
        String str2 = broadcastFilterG.packageName;
        qVar.getClass();
        ProcessRecordG processRecordG = broadcastFilterG.receiverList.f166752c;
        if (processRecordG == null || !processRecordG.b()) {
            binderC4149h.toString();
            Objects.toString(broadcastFilterG.receiverList);
            ProcessRecordG processRecordG2 = broadcastFilterG.receiverList.f166752c;
            (processRecordG2 == null ? "NULL" : Integer.valueOf(processRecordG2.f166737g)).toString();
            binderC4149h.f166892m[i10] = 2;
            return;
        }
        binderC4149h.f166892m[i10] = 1;
        if (z10) {
            binderC4149h.f166870A = broadcastFilterG.receiverList.f166751b.asBinder();
            binderC4149h.f166876G = broadcastFilterG;
            ReceiverListG receiverListG = broadcastFilterG.receiverList;
            receiverListG.f166756g = binderC4149h;
            binderC4149h.f166871B = 2;
            ProcessRecordG processRecordG3 = receiverListG.f166752c;
            if (processRecordG3 != null) {
                binderC4149h.f166877H = processRecordG3;
                processRecordG3.f166746p.add(binderC4149h);
            }
        }
        try {
            broadcastFilterG.toString();
            binderC4149h.toString();
            binderC4149h.f166898s = SystemClock.uptimeMillis();
            ReceiverListG receiverListG2 = broadcastFilterG.receiverList;
            n(receiverListG2.f166752c, receiverListG2.f166751b, new Intent(binderC4149h.f166880a), binderC4149h.f166901v, binderC4149h.f166902w, binderC4149h.f166903x, binderC4149h.f166886g, binderC4149h.f166888i, binderC4149h.f166889j);
            if (z10) {
                binderC4149h.f166871B = 3;
            }
        } catch (RemoteException unused) {
            Objects.toString(binderC4149h.f166880a);
            ProcessRecordG processRecordG4 = broadcastFilterG.receiverList.f166752c;
            if (processRecordG4 != null && z10) {
                processRecordG4.f166746p.remove(binderC4149h);
            }
            if (z10) {
                binderC4149h.f166870A = null;
                binderC4149h.f166876G = null;
                broadcastFilterG.receiverList.f166756g = null;
            }
        }
    }

    @Nullable
    public BinderC4149h f() {
        BinderC4149h binderC4149h = this.f166854g;
        if (binderC4149h != null) {
            return binderC4149h;
        }
        if (this.f166853f.size() == 0) {
            return null;
        }
        BinderC4149h binderC4149hRemove = this.f166853f.remove(0);
        this.f166854g = binderC4149hRemove;
        return binderC4149hRemove;
    }

    public final void g(BinderC4149h binderC4149h) {
        binderC4149h.f166895p = System.currentTimeMillis();
    }

    public void h(BinderC4149h binderC4149h) {
        this.f166853f.add(binderC4149h);
        g(binderC4149h);
    }

    public void i(BinderC4149h binderC4149h) {
        this.f166852e.add(binderC4149h);
        g(binderC4149h);
    }

    public boolean j(BinderC4149h binderC4149h, int i10, String str, Bundle bundle, boolean z10, boolean z11) {
        int i11 = binderC4149h.f166871B;
        long jUptimeMillis = SystemClock.uptimeMillis() - binderC4149h.f166898s;
        binderC4149h.f166871B = 0;
        int i12 = binderC4149h.f166905z;
        if (i12 > 0) {
            binderC4149h.f166893n[i12 - 1] = jUptimeMillis;
        }
        binderC4149h.f166870A = null;
        binderC4149h.f166880a.setComponent(null);
        ProcessRecordG processRecordG = binderC4149h.f166877H;
        if (processRecordG != null) {
            processRecordG.f166746p.remove(binderC4149h);
        }
        BroadcastFilterG broadcastFilterG = binderC4149h.f166876G;
        if (broadcastFilterG != null) {
            broadcastFilterG.receiverList.f166756g = null;
        }
        binderC4149h.f166876G = null;
        binderC4149h.f166879J = null;
        binderC4149h.f166877H = null;
        this.f166857j = null;
        binderC4149h.f166901v = i10;
        binderC4149h.f166902w = str;
        binderC4149h.f166903x = bundle;
        if (z10 && (binderC4149h.f166880a.getFlags() & C1979x1.f100279m) == 0) {
            binderC4149h.f166904y = true;
        } else {
            binderC4149h.f166904y = false;
        }
        binderC4149h.f166878I = null;
        return i11 == 1 || i11 == 3;
    }

    public BinderC4149h k(IBinder iBinder) {
        ProcessRecordG processRecordG;
        IInterface iInterface;
        BinderC4149h binderC4149h = this.f166854g;
        if (binderC4149h == null || iBinder == null || (binderC4149h.f166870A != iBinder && ((processRecordG = binderC4149h.f166877H) == null || (iInterface = processRecordG.f166741k) == null || iBinder != iInterface.asBinder()))) {
            return null;
        }
        return binderC4149h;
    }

    public boolean l() {
        return this.f166852e.isEmpty() && this.f166853f.isEmpty() && this.f166857j == null;
    }

    public boolean m(int i10) {
        BinderC4149h binderC4149h = this.f166857j;
        return binderC4149h != null && binderC4149h.f166877H.f166737g == i10;
    }

    public void n(ProcessRecordG processRecordG, com.prism.gaia.client.stub.r rVar, Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) throws RemoteException {
        if (processRecordG == null) {
            rVar.L4(intent, i10, str, bundle, z10, z11, i11);
            return;
        }
        if (processRecordG.g() != null) {
            try {
                processRecordG.g().h0(intent, rVar, i10, str, bundle, z10, z11, i11);
                return;
            } catch (RemoteException e10) {
                synchronized (this.f166848a) {
                    this.f166848a.D0(processRecordG.f166732b, processRecordG.f166734d);
                    throw e10;
                }
            }
        }
        if (processRecordG.q()) {
            rVar.L4(intent, i10, str, bundle, z10, z11, i11);
            return;
        }
        throw new RemoteException("app.thread must not be null: pid=" + processRecordG.f166737g + ", processName=" + processRecordG.f166732b);
    }

    public final void o(BinderC4149h binderC4149h, ProcessRecordG processRecordG) throws RemoteException {
        Objects.toString(binderC4149h);
        Objects.toString(processRecordG);
        if (processRecordG.g() == null) {
            throw new RemoteException();
        }
        binderC4149h.f166870A = processRecordG.f166741k.asBinder();
        binderC4149h.f166877H = processRecordG;
        processRecordG.f166746p.add(binderC4149h);
        binderC4149h.f166880a.setComponent(binderC4149h.f166878I);
        try {
            Objects.toString(binderC4149h.f166878I);
            binderC4149h.toString();
            processRecordG.g().n1(new Intent(binderC4149h.f166880a), binderC4149h.f166879J, binderC4149h.f166901v, binderC4149h.f166902w, binderC4149h.f166903x, binderC4149h.f166886g, binderC4149h.f166889j);
            binderC4149h.toString();
            processRecordG.toString();
        } catch (Throwable th) {
            binderC4149h.toString();
            binderC4149h.f166870A = null;
            binderC4149h.f166877H = null;
            processRecordG.f166746p.remove(binderC4149h);
            throw th;
        }
    }

    public final void p(boolean z10) {
        synchronized (this.f166848a) {
            q(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(boolean r15) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.am.C4148g.q(boolean):void");
    }

    public final BinderC4149h r(ArrayList<BinderC4149h> arrayList, BinderC4149h binderC4149h) {
        Intent intent = binderC4149h.f166880a;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            BinderC4149h binderC4149h2 = arrayList.get(size);
            if (binderC4149h2.f166889j == binderC4149h.f166889j && intent.filterEquals(binderC4149h2.f166880a)) {
                arrayList.set(size, binderC4149h);
                return binderC4149h2;
            }
        }
        return null;
    }

    public final BinderC4149h s(BinderC4149h binderC4149h) {
        return r(this.f166853f, binderC4149h);
    }

    public final BinderC4149h t(BinderC4149h binderC4149h) {
        return r(this.f166852e, binderC4149h);
    }

    public String toString() {
        return this.f166850c;
    }

    public void u() {
        if (this.f166855h) {
            return;
        }
        a aVar = this.f166859l;
        aVar.sendMessage(aVar.obtainMessage(200, this));
        this.f166855h = true;
    }

    public boolean v(ProcessRecordG processRecordG) {
        ProcessRecordG processRecordG2;
        BinderC4149h binderC4149h = this.f166857j;
        if (binderC4149h == null || (processRecordG2 = binderC4149h.f166877H) == null || processRecordG2.f166737g != processRecordG.f166737g) {
            return false;
        }
        if (processRecordG2 != processRecordG) {
            String str = processRecordG2.f166732b;
            return false;
        }
        try {
            this.f166857j = null;
            o(binderC4149h, processRecordG);
            return true;
        } catch (Exception e10) {
            binderC4149h.f166878I.flattenToShortString();
            j(binderC4149h, binderC4149h.f166901v, binderC4149h.f166902w, binderC4149h.f166903x, binderC4149h.f166904y, false);
            u();
            binderC4149h.f166871B = 0;
            throw new RuntimeException(e10.getMessage());
        }
    }

    public final void w(long j10) {
        if (this.f166856i) {
            return;
        }
        this.f166859l.sendMessageAtTime(this.f166859l.obtainMessage(201, this), j10);
        this.f166856i = true;
    }

    public void x(ProcessRecordG processRecordG) {
        BinderC4149h binderC4149h;
        BinderC4149h binderC4149h2 = this.f166854g;
        if (binderC4149h2 == null || binderC4149h2.f166877H != processRecordG) {
            binderC4149h2 = null;
        }
        if (binderC4149h2 == null && (binderC4149h = this.f166857j) != null && binderC4149h.f166877H == processRecordG) {
            Objects.toString(binderC4149h);
            binderC4149h2 = binderC4149h;
        }
        if (binderC4149h2 != null) {
            z(binderC4149h2);
        }
    }

    public void y(int i10) {
        ProcessRecordG processRecordG;
        BinderC4149h binderC4149h = this.f166857j;
        if (binderC4149h == null || (processRecordG = binderC4149h.f166877H) == null || processRecordG.f166737g != i10) {
            return;
        }
        binderC4149h.f166871B = 0;
        binderC4149h.f166905z = this.f166858k;
        this.f166857j = null;
        u();
    }

    public final void z(BinderC4149h binderC4149h) {
        j(binderC4149h, binderC4149h.f166901v, binderC4149h.f166902w, binderC4149h.f166903x, binderC4149h.f166904y, false);
        u();
    }
}
