package com.pgl.ssdk.ces;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.a0;
import com.pgl.ssdk.b0;
import com.pgl.ssdk.b1;
import com.pgl.ssdk.c0;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.d0;
import com.pgl.ssdk.e0;
import com.pgl.ssdk.f0;
import com.pgl.ssdk.g0;
import com.pgl.ssdk.h0;
import com.pgl.ssdk.i0;
import com.pgl.ssdk.j0;
import com.pgl.ssdk.l0;
import com.pgl.ssdk.n0;
import com.pgl.ssdk.o0;
import com.pgl.ssdk.s;
import com.pgl.ssdk.t;
import com.pgl.ssdk.t0;
import com.pgl.ssdk.u;
import com.pgl.ssdk.u0;
import com.pgl.ssdk.v;
import com.pgl.ssdk.v0;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.z;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f161817a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f161818b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f161819c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, Object> f161820d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f161821e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static t0.a f161822f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f161824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f161825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f161826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f161827k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f161832p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f161823g = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f161828l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f161829m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f161830n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f161831o = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f161833q = false;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            x.b(x.b());
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0658b implements Runnable {
        public RunnableC0658b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.a(b.this.f161824h).a();
            i0.a(b.this.f161824h).a();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.b(b.this.f161824h);
        }
    }

    private b(Context context, String str) {
        this.f161824h = context;
        this.f161825i = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f161817a == null) {
            synchronized (b.class) {
                try {
                    if (f161817a == null) {
                        if (context == null) {
                            context = z.a().getApplicationContext();
                        }
                        if (context == null) {
                            f161821e = 4;
                            return null;
                        }
                        a(i10);
                        t0.a aVarB = t0.b(context, "nms");
                        if (aVarB != null) {
                            f161821e = aVarB.f161923a;
                            f161822f = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f161817a = bVar;
                        bVar.f161826j = i11;
                        f161817a.f161827k = str2;
                        f161817a.b(context);
                        f161817a.c(a(context));
                        x.c(context);
                        f161821e = 0;
                        o0.b(new a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161817a;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f161832p = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public static String e() {
        if (h() != null) {
            return h().f161828l;
        }
        return null;
    }

    public static int g() {
        return f161821e;
    }

    public static b h() {
        return f161817a;
    }

    public static t0.a i() {
        return f161822f;
    }

    private void l() {
        b1.a(this.f161824h, this.f161825i);
    }

    public void b() {
        Map<String, Object> map = f161820d;
        if (map != null) {
            Object obj = map.get(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof String) {
                String strA = g0.a((String) obj);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                com.pgl.ssdk.ces.a.meta(Opcodes.IF_ICMPEQ, null, strA);
            }
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f161830n)) {
            com.pgl.ssdk.ces.a.meta(112, null, str);
            this.f161830n = str;
            b1.c();
        }
    }

    public long f() {
        return x.a(this.f161824h);
    }

    public String j() {
        return x.c();
    }

    public String k() {
        return b1.b();
    }

    public void m() {
        this.f161833q = true;
        n0.b();
        l();
        a("CZL-L1st", (Map<String, Object>) null);
    }

    public void c() {
        o0.b(new c());
    }

    public static String d() {
        if (h() != null) {
            return h().f161825i;
        }
        return null;
    }

    private void b(Context context) {
        if (context == null || f161818b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f161825i);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f161826j));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z.g(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(106, null, z.e(context));
            com.pgl.ssdk.ces.a.meta(107, null, z.d(context));
            com.pgl.ssdk.ces.a.meta(108, null, z.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, z.c());
            com.pgl.ssdk.ces.a.meta(110, null, z.b());
            com.pgl.ssdk.ces.a.meta(115, null, this.f161827k);
            f161818b = true;
        } catch (Throwable unused) {
        }
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f161831o)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f161831o = str;
            b1.c();
        }
    }

    private static String a(Context context) {
        String strA = u0.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        u0.b(context, "iid", string);
        return string;
    }

    public synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f161828l)) {
            com.pgl.ssdk.ces.a.meta(103, null, str);
            b1.c();
            this.f161828l = str;
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        this.f161828l = str2;
        this.f161830n = str3;
        this.f161829m = str;
        com.pgl.ssdk.ces.a.meta(113, null, str);
        com.pgl.ssdk.ces.a.meta(112, null, str3);
        com.pgl.ssdk.ces.a.meta(103, null, str2);
        com.pgl.ssdk.ces.a.meta(111, null, str4);
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    public static void a(int i10) {
        l0.a(i10);
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f161824h, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            long j10 = "CZL-L1st".equals(str) ? 10000L : 0L;
            Handler handlerB = o0.b();
            if (handlerB != null) {
                handlerB.postDelayed(new com.pgl.ssdk.ces.c(this.f161824h, str, map), j10);
            }
            a();
            x.a();
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return d0.a(this.f161824h);
        }
        if (i10 == 121) {
            return b0.a();
        }
        if (i10 == 122) {
            return b0.b();
        }
        if (i10 == 126) {
            return b0.b(this.f161824h);
        }
        if (i10 == 128) {
            return b0.c(this.f161824h);
        }
        if (i10 == 120) {
            return a0.c();
        }
        if (i10 == 124) {
            return e0.c(this.f161824h);
        }
        if (i10 == 130) {
            return e0.a(this.f161824h);
        }
        if (i10 == 145) {
            return f0.b(this.f161824h);
        }
        if (i10 == 125) {
            return e0.b(this.f161824h);
        }
        if (i10 == 129) {
            return c0.e(this.f161824h);
        }
        if (i10 == 141) {
            return c0.d(this.f161824h);
        }
        if (i10 == 131) {
            return b1.a();
        }
        if (i10 == 134) {
            return j0.a(this.f161824h).b();
        }
        if (i10 == 140) {
            return i0.a(this.f161824h).e();
        }
        if (i10 == 144) {
            return i0.a(this.f161824h).d();
        }
        String string = null;
        if (i10 == 133) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : f161820d.entrySet()) {
                    if (entry.getValue() == null) {
                        jSONObject.put(entry.getKey(), "");
                    } else {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                string = jSONObject.toString();
            } catch (Throwable unused) {
            }
            return string == null ? Ib.b.f53002g : string.trim();
        }
        if (i10 == 135) {
            return t.f();
        }
        if (i10 == 201) {
            return b0.a(this.f161824h);
        }
        if (i10 == 202) {
            return b0.c();
        }
        if (i10 == 236) {
            return v0.a((String) obj);
        }
        if (i10 == 142) {
            return z.f(this.f161824h);
        }
        if (i10 == 143) {
            return f0.a(this.f161824h);
        }
        if (i10 == 146) {
            try {
                return t.b();
            } catch (Throwable unused2) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(z.h(this.f161824h));
        }
        if (i10 == 148) {
            return s.b(this.f161824h);
        }
        if (i10 == 149) {
            return u.a(this.f161824h);
        }
        if (i10 == 150) {
            return Integer.valueOf(v.a());
        }
        if (i10 == 151) {
            return u.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(t.g());
        }
        if (i10 == 163) {
            return h0.a();
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        w.a(motionEvent, this.f161824h);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            f161820d = map;
        }
    }

    public void a() {
        o0.b(new RunnableC0658b());
    }
}
