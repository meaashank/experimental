package h7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.IInterface;
import android.os.WorkSource;
import c7.AbstractC2950b;
import c7.C;
import c7.m;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.compat.android.app.PendingIntentCompat2;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import v8.C5703m;
import v8.C5705o;

/* JADX INFO: renamed from: h7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4498b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: h7.b$a */
    public static class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "canScheduleExactAlarms";
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            U6.c.i0();
            return Boolean.TRUE;
        }

        public a(C4499c c4499c) {
        }
    }

    /* JADX INFO: renamed from: h7.b$b, reason: collision with other inner class name */
    public static class C0744b extends m {
        public C0744b() {
        }

        @Override // c7.m
        public String A() {
            return "remove";
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            IInterface mTarget;
            PendingIntent pendingIntent = (PendingIntent) C3838b.h(objArr, PendingIntent.class);
            if (pendingIntent == null || (mTarget = PendingIntentCompat2.Util.getMTarget(pendingIntent)) == null) {
                return true;
            }
            C5703m.o().z0(mTarget.asBinder());
            return true;
        }

        public C0744b(C4499c c4499c) {
        }
    }

    /* JADX INFO: renamed from: h7.b$c */
    public static class c extends m {
        public c() {
        }

        @Override // c7.m
        public String A() {
            return "removeAll";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (!m.Q()) {
                return method.invoke(obj, objArr);
            }
            C5703m.o().g(m.q(), m.M());
            return null;
        }

        public c(C4499c c4499c) {
        }
    }

    /* JADX INFO: renamed from: h7.b$d */
    public static class d extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f202449f = l0.b(d.class.getSimpleName());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f202450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f202451e;

        @Override // c7.m
        public String A() {
            return "set";
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            IInterface mTarget;
            String str;
            if (C3841e.p() && (objArr[0] instanceof String)) {
                objArr[0] = m.w();
            }
            int iJ = C3838b.j(objArr, WorkSource.class);
            if (iJ >= 0) {
                objArr[iJ] = null;
            }
            U6.c.i0();
            char c10 = C3841e.p() ? (char) 3 : (char) 2;
            if (((Long) objArr[c10]).longValue() == 0) {
                objArr[c10] = 100;
            }
            int iJ2 = C3838b.j(objArr, AlarmManager.AlarmClockInfo.class);
            if (iJ2 >= 0) {
                objArr[iJ2] = null;
            }
            this.f202450d = false;
            PendingIntent pendingIntent = (PendingIntent) C3838b.h(objArr, PendingIntent.class);
            if (pendingIntent != null && (mTarget = PendingIntentCompat2.Util.getMTarget(pendingIntent)) != null) {
                if (m.Q()) {
                    String strA0 = C5703m.o().A0(mTarget.asBinder());
                    if (strA0 != null) {
                        this.f202450d = true;
                        I.v(f202449f, "AlarmManager.set() dropped, %s", strA0);
                        return true;
                    }
                    str = "(guest) " + mTarget.asBinder().toString();
                } else if (m.c0()) {
                    str = "(supervisor) " + mTarget.asBinder().toString();
                } else {
                    str = "(host) " + mTarget.asBinder().toString();
                }
                I.b(f202449f, "AlarmManager.set() with pendingIntent: %s", str);
                int iIncrementAndGet = this.f202451e.incrementAndGet();
                if (iIncrementAndGet <= 20 || iIncrementAndGet % 50 == 0) {
                    C5705o.c().d("AlarmManager.set() #" + iIncrementAndGet + " with pendingIntent: " + str);
                }
            }
            return true;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (this.f202450d) {
                return null;
            }
            return method.invoke(obj, objArr);
        }

        public d() {
            this.f202451e = new AtomicInteger();
        }
    }

    /* JADX INFO: renamed from: h7.b$e */
    public static class e extends m {
        public e() {
        }

        @Override // c7.m
        public String A() {
            return "setTime";
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.FALSE;
        }

        public e(C4499c c4499c) {
        }
    }

    /* JADX INFO: renamed from: h7.b$f */
    public static class f extends m {
        public f() {
        }

        @Override // c7.m
        public String A() {
            return "setTimeZone";
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        public f(C4499c c4499c) {
        }
    }

    public C4498b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new d());
        f(new C0744b());
        f(new e());
        f(new f());
        f(new c());
        f(new a());
        f(new C("hasScheduleExactAlarm"));
    }
}
