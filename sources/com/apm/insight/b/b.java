package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.k;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f137015z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f137020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f137021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f137022c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f137026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f137027h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONArray f137032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f137033n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONArray f137036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JSONArray f137037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private JSONObject f137038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f137039t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f137041v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f137023d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f137024e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f137025f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f137028i = "unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f137029j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f137030k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f137031l = "npth_inner_default";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f137034o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f137035p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f137040u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f137042w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f137043x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f137044y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f137016A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List<Pattern> f137017B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Pattern f137018C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private File f137019D = null;

    public b(Context context) {
        this.f137021b = context;
    }

    private boolean h() {
        boolean zA = com.apm.insight.l.a.a(this.f137021b);
        boolean z10 = !zA;
        if (zA || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z10;
        }
        return false;
    }

    private File i() {
        if (this.f137019D == null) {
            this.f137019D = new File(this.f137021b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.d(this.f137021b).replaceAll(com.prism.gaia.server.accounts.b.f166434b0, "_"));
        }
        return this.f137019D;
    }

    public final void b() {
        if (this.f137022c) {
            this.f137022c = false;
            c cVar = this.f137020a;
            if (cVar != null) {
                cVar.b();
            }
            this.f137020a = null;
        }
    }

    public final void c() {
        c cVar = this.f137020a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.f137040u) {
        }
        this.f137044y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.f137016A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
        this.f137042w = SystemClock.uptimeMillis();
        this.f137041v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.f137016A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final boolean g() {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean z11;
        JSONArray jSONArrayB;
        boolean z12;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        JSONObject jSONObjectA;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j10;
        JSONObject jSONObjectA2;
        boolean z13;
        JSONObject jSONObject2;
        boolean zB = com.apm.insight.runtime.j.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.f137021b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str5 = "normal";
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            z10 = zB;
            i10 = 1;
            str = "unknown";
            str2 = "unknown";
            z11 = false;
            jSONArrayB = null;
            z12 = false;
            jSONArrayA = null;
            jSONObject = null;
            jSONObjectA = null;
            str3 = "normal";
            str4 = "unknown";
            jSONArray = null;
            j10 = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.f137040u) {
            }
            if (this.f137026g == null || System.currentTimeMillis() - this.f137023d > 20000) {
                if (this.f137041v) {
                    this.f137041v = false;
                    str5 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str5 = "trace_last";
            }
            JSONObject jSONObject3 = this.f137026g;
            String str6 = this.f137028i;
            String str7 = this.f137029j;
            String str8 = this.f137030k;
            JSONArray jSONArray2 = this.f137032m;
            JSONArray jSONArray3 = this.f137037r;
            JSONArray jSONArray4 = this.f137036q;
            i10 = 1;
            JSONObject jSONObject4 = this.f137038s;
            JSONObject jSONObject5 = this.f137027h;
            z10 = zB;
            z11 = this.f137039t;
            long j11 = this.f137035p;
            this.f137026g = null;
            this.f137032m = null;
            this.f137036q = null;
            this.f137027h = null;
            this.f137037r = null;
            this.f137028i = "unknown";
            this.f137029j = "unknown";
            this.f137030k = "unknown";
            this.f137034o = 0;
            str2 = str8;
            str4 = str6;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject5;
            jSONArrayA = jSONArray4;
            jSONArrayB = jSONArray3;
            str = str7;
            str3 = str5;
            j10 = j11;
            jSONObjectA2 = jSONObject3;
            jSONObject = jSONObject4;
            z12 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.f137026g == null || System.currentTimeMillis() - this.f137023d <= 20000) {
                if (this.f137026g == null || System.currentTimeMillis() - this.f137023d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.f137026g = null;
            this.f137032m = null;
            this.f137036q = null;
            this.f137027h = null;
            this.f137037r = null;
            this.f137028i = "unknown";
            this.f137029j = "unknown";
            this.f137030k = "unknown";
            this.f137034o = 0;
            this.f137024e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    z13 = z11;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.f137021b, jSONObject6);
                            jSONObject = jSONObject6;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject6;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z13 = z11;
                }
            } else {
                z13 = z11;
            }
            jSONObjectA2 = d.a();
        } else {
            z13 = z11;
        }
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 == null || jSONObjectA2.length() <= 0) {
            return z12;
        }
        boolean z14 = z12;
        try {
            jSONObjectA2.put("pid", Process.myPid());
            jSONObjectA2.put("package", this.f137021b.getPackageName());
            jSONObjectA2.put("is_remote_process", 0);
            jSONObjectA2.put("is_new_stack", 10);
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
            JSONObject jSONObject9 = jSONObjectA2;
            aVar.a("data", (Object) jSONObject9.toString());
            aVar.a("is_anr", Integer.valueOf(i10));
            aVar.a("anrType", (Object) str3);
            aVar.a("history_message", (Object) jSONArrayB);
            aVar.a("current_message", jSONObject8);
            aVar.a("pending_messages", (Object) jSONArrayA);
            aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_time", Long.valueOf(j10));
            com.apm.insight.c.a.b();
            aVar.c(jSONObject7);
            aVar.a("anr_info", (Object) strA);
            if (jSONArray != null) {
                aVar.a("dump_trace", (Object) jSONArray);
            }
            JSONObject jSONObject10 = this.f137033n;
            aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? m.b((String) null) : this.f137033n);
            com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
            CrashType crashType = CrashType.ANR;
            com.apm.insight.entity.a aVarA = fVarA.a(crashType, aVar);
            aVarA.a("is_background", Boolean.valueOf(z13));
            aVarA.a("logcat", (Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
            aVarA.a("has_dump", (Object) "true");
            aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j10, crashType, false, false));
            aVarA.a("jiffy", Long.valueOf(o.a.a()));
            JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(aVarA.c());
            if (jSONObjectOptJSONObject == null) {
                try {
                    jSONObject2 = new JSONObject();
                    try {
                        aVarA.a("filters", jSONObject2);
                    } catch (Throwable unused4) {
                        jSONObjectOptJSONObject = jSONObject2;
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } catch (Throwable unused5) {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
            }
            jSONObject2.put("anrType", str3);
            jSONObject2.put("max_utm_thread", str4);
            jSONObject2.put("max_stm_thread", str);
            jSONObject2.put("max_utm_stm_thread", str2);
            jSONObject2.put("max_utm_thread_version", this.f137031l);
            long j12 = j10 - com.apm.insight.e.j();
            jSONObject2.put("crash_length", j12 < 30000 ? "0 - 30s" : j12 < 60000 ? "30s - 1min" : j12 < 120000 ? "1min - 2min" : j12 < 300000 ? "2min - 5min" : j12 < 600000 ? "5min - 10min" : j12 < com.prism.gaia.server.content.j.f167261b0 ? "10min - 30min" : j12 < 3600000 ? "30min - 1h" : "1h - ");
            jSONObject2.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject2.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject2.put("sdk_version", "1.3.8.nourl-rc.1");
            jSONObject2.put("has_logcat", String.valueOf(aVarA.a()));
            jSONObject2.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject2.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject2.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject2.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject2.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject2.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? "true" : "false");
            jSONObject2.put("anr_normal_trace", String.valueOf(!this.f137041v));
            jSONObject2.put("anr_no_run", String.valueOf(z10));
            jSONObject2.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
            jSONObject2.put("from_file", String.valueOf(d.b()));
            jSONObject2.put("has_dump", "true");
            jSONObject2.put("from_kill", "false");
            jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            int i11 = this.f137034o;
            if (i11 > 0) {
                jSONObject2.put("may_have_stack_overflow", String.valueOf(i11));
            }
            try {
                a(strA, jSONObject2);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
            com.apm.insight.a.a.a();
            CrashType crashType2 = CrashType.ANR;
            com.apm.insight.e.e();
            try {
                if (com.apm.insight.a.e().length() > 1024) {
                    aVarA.a("has_system_traces", "true");
                }
            } catch (Throwable unused6) {
            }
            try {
                JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                if (jSONArrayA2.length() > 0) {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                }
            } catch (Throwable unused7) {
            }
            String strOptString = jSONObject9.optString("mainStackFromTrace");
            JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
            com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject11) {
                    com.apm.insight.k.d.a().a(jSONObject11, j10, b.this.f137025f);
                }
            });
            b(strOptString, jSONArrayA3);
            return z14;
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            k.a(th2, "NPTH_CATCH");
            return z14;
        }
    }

    public final void a() {
        if (this.f137022c) {
            return;
        }
        this.f137020a = new c(this);
        this.f137023d = com.apm.insight.e.j();
        this.f137022c = true;
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f137034o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(long j10) {
        if (this.f137041v) {
            this.f137041v = false;
            b(j10);
        }
        return false;
    }

    private void b(long j10) {
        if (this.f137043x != this.f137042w) {
            try {
                this.f137035p = System.currentTimeMillis();
                this.f137037r = f.b().b();
                this.f137036q = j.a(j10);
                this.f137027h = f.b().a(j10).a();
                JSONObject jSONObject = new JSONObject();
                this.f137038s = jSONObject;
                com.apm.insight.l.a.a(this.f137021b, jSONObject);
                this.f137039t = h();
                this.f137025f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f137023d = this.f137035p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f137021b), strB), "trace_" + com.apm.insight.l.a.d(this.f137021b).replace(':', Ra.b.f67799c) + com.prism.gaia.download.a.f164604o);
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                p.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.f137032m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    k.a(th, "NPTH_CATCH");
                }
                if (this.f137026g == null) {
                    this.f137026g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                k.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.f137023d = this.f137035p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f137021b), strB2), "trace" + com.apm.insight.l.a.d(this.f137021b).replace(':', Ra.b.f67799c) + com.prism.gaia.download.a.f164604o);
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                p.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.f137032m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    k.a(th3, "NPTH_CATCH");
                }
                if (this.f137026g == null) {
                    this.f137026g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                k.a(th4, "NPTH_CATCH");
            }
        }
        long j11 = this.f137042w;
        this.f137043x = j11;
        this.f137042w = -1L;
        if (j11 == -1) {
            this.f137043x = (-1) - 1;
        }
    }

    private void a(JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.f137026g = null;
        this.f137033n = null;
        this.f137034o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f137028i = "unknown";
        this.f137029j = "unknown";
        this.f137030k = "unknown";
        int[] iArr = new int[3];
        iArr[0] = 0;
        iArr[1] = 0;
        int i10 = 2;
        iArr[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String string = null;
        boolean z10 = false;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String strOptString = jSONArray.optString(i11);
            int i12 = i10;
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f137026g == null && "main".equals(string)) {
                        this.f137026g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!"main".equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = string;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e10) {
                            com.apm.insight.c.a();
                            k.a(e10, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i13 = iArrB2[0];
                            if (i13 > iArr[0]) {
                                iArr[0] = i13;
                                this.f137028i = str;
                            }
                            int i14 = iArrB2[1];
                            if (i14 > iArr[1]) {
                                iArr[1] = i14;
                                this.f137029j = str;
                            }
                            int i15 = iArrB2[i12];
                            if (i15 > iArr[i12]) {
                                iArr[i12] = i15;
                                this.f137030k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i10 = i12;
                string = null;
            } else if (!z10) {
                i10 = i12;
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z10 = true;
                }
                jSONArray3.put(strOptString);
            } else if (!z10) {
                i10 = i12;
            } else if (strOptString.contains(" prio=")) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f137026g == null && "main".equals(string)) {
                        this.f137026g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!"main".equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused3) {
                    }
                    String str2 = string;
                    if (!a(str2)) {
                        try {
                            iArrB = b(jSONArray5);
                        } catch (IllegalArgumentException e11) {
                            com.apm.insight.c.a();
                            k.a(e11, "NPTH_CATCH");
                            iArrB = null;
                        } catch (Throwable unused4) {
                            iArrB = null;
                        }
                        if (iArrB != null) {
                            int i16 = iArrB[0];
                            if (i16 > iArr[0]) {
                                iArr[0] = i16;
                                this.f137028i = str2;
                            }
                            int i17 = iArrB[1];
                            if (i17 > iArr[1]) {
                                iArr[1] = i17;
                                this.f137029j = str2;
                            }
                            int i18 = iArrB[i12];
                            if (i18 > iArr[i12]) {
                                iArr[i12] = i18;
                                this.f137030k = str2;
                            }
                        }
                    }
                }
                String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                if ("main".equals(strSubstring)) {
                    i10 = i12;
                    string = strSubstring;
                } else {
                    StringBuilder sbA = android.support.v4.media.f.a(strSubstring, "  (");
                    i10 = i12;
                    sbA.append(strOptString.substring(strOptString.indexOf(34, i10) + 1));
                    sbA.append(" )");
                    string = sbA.toString();
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                jSONArray5.put(strOptString);
            } else {
                i10 = i12;
                if (TextUtils.isEmpty(string)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.f137032m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f137033n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f137033n.put("thread_stacks", jSONArray2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.f137018C == null) {
                    this.f137018C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.f137018C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
            }
        }
        return null;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.m.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.f137017B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.f137017B = new LinkedList();
                this.f137031l = jSONArrayB.optString(0);
                for (int i10 = 1; i10 < jSONArrayB.length(); i10++) {
                    try {
                        this.f137017B.add(Pattern.compile(jSONArrayB.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f137017B == null) {
                LinkedList linkedList = new LinkedList();
                this.f137017B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f137017B.add(Pattern.compile("^default_npth_thread$"));
                this.f137017B.add(Pattern.compile("^RenderThread$"));
                this.f137017B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f137017B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f137034o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        r10 = r24 + 3;
        r24 = r12;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
    
        r12 = "softirq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        if (r8 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        if (r8 != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r8 != 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        if (r8 != 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r8 != 4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0210, code lost:
    
        if (r8 != 5) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0214, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0217, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021a, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0220, code lost:
    
        r28 = r4;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022c, code lost:
    
        if ("user".equalsIgnoreCase(r28[r10]) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022e, code lost:
    
        r12 = "user";
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0239, code lost:
    
        if ("kernel".equalsIgnoreCase(r28[r10]) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023b, code lost:
    
        r12 = "kernel";
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0246, code lost:
    
        if ("iowait".equalsIgnoreCase(r28[r10]) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0248, code lost:
    
        r12 = "iowait";
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0253, code lost:
    
        if ("irq".equalsIgnoreCase(r28[r10]) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0255, code lost:
    
        r12 = "irq";
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025e, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0260, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0268, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x026a, code lost:
    
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026c, code lost:
    
        r8 = r29;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026f, code lost:
    
        if (r12 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0273, code lost:
    
        r4 = java.lang.Float.valueOf(r28[r10 - 1].replace(r3, "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0281, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0283, code lost:
    
        r3 = r7 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0292, code lost:
    
        if (r0 == r5) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0295, code lost:
    
        r4 = r4 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029e, code lost:
    
        r0.put(r3, java.lang.Float.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a7, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a9, code lost:
    
        r0.put(r7 + r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bc, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        if (r8 >= 6) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c1, code lost:
    
        r10 = r10 + 3;
        r3 = r27;
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        r10 = java.lang.Float.valueOf(r4[r8].replace("%", "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r8 = r7 + "total";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c9, code lost:
    
        if (r0 != r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        r10 = r10 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r0.put(r8, java.lang.Float.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        r0.put(r7 + "total", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b A[PHI: r28 r29
      0x024b: PHI (r28v3 java.lang.String[]) = (r28v2 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r29v3 char) = (r29v2 char), (r29v10 char) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258 A[PHI: r28 r29
      0x0258: PHI (r28v4 java.lang.String[]) = (r28v3 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r29v4 char) = (r29v3 char), (r29v11 char) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262 A[PHI: r28 r29
      0x0262: PHI (r28v7 java.lang.String[]) = (r28v4 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r29v7 char) = (r29v4 char), (r29v12 char) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c1 A[LOOP:2: B:101:0x01f8->B:153:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e1 A[EDGE_INSN: B:233:0x03e1->B:204:0x03e1 BREAK  A[LOOP:0: B:3:0x0047->B:206:0x03f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c9 A[EDGE_INSN: B:237:0x02c9->B:154:0x02c9 BREAK  A[LOOP:2: B:101:0x01f8->B:153:0x02c1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r31, org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 = entry.getValue().floatValue() + fFloatValue5;
            }
        }
        float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(androidx.compose.runtime.changelist.j.a(strConcat, "_total"), b(f10));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f10));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f10));
    }

    private static String a(float f10, float f11) {
        if (f11 > 0.0f) {
            return a(f10 / f11);
        }
        return f10 > 0.0f ? "100%" : "0%";
    }

    private static String a(float f10) {
        if (f10 <= 0.0f) {
            return "0%";
        }
        if (f10 <= 0.1f) {
            return "0% - 10%";
        }
        if (f10 <= 0.3f) {
            return "10% - 30%";
        }
        if (f10 <= 0.6f) {
            return "30% - 60%";
        }
        if (f10 <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
