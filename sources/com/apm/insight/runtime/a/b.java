package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f137428a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f137429b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f137430c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f137431d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f137432e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f137433f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f137434z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f137436B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f137437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f137438h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f137444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f137445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f137446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f137447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f137448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f137449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f137450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f137451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f137452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f137453w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f137439i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f137440j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f137441k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f137442l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f137443m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f137454x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f137455y = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f137435A = 50;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f137457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f137458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f137459c;

        public a(String str, String str2, long j10) {
            this.f137458b = str2;
            this.f137459c = j10;
            this.f137457a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f137459c)) + " : " + this.f137457a + ' ' + this.f137458b;
        }
    }

    private b(@NonNull Application application) {
        this.f137438h = application;
        this.f137437g = application;
        if (application != null) {
            try {
                this.f137437g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f137444n = activity.getClass().getName();
                        b.this.f137445o = System.currentTimeMillis();
                        boolean unused = b.f137429b = bundle != null;
                        boolean unused2 = b.f137430c = true;
                        b.this.f137439i.add(b.this.f137444n);
                        b.this.f137440j.add(Long.valueOf(b.this.f137445o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f137444n, b.this.f137445o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f137439i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f137439i.size()) {
                            b.this.f137439i.remove(iIndexOf);
                            b.this.f137440j.remove(iIndexOf);
                        }
                        b.this.f137441k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f137442l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f137450t = activity.getClass().getName();
                        b.this.f137451u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.f137436B == 0) {
                            b.this.f137454x = false;
                            boolean unused = b.f137430c = false;
                            b.this.f137455y = SystemClock.uptimeMillis();
                        } else if (b.this.f137436B < 0) {
                            b.n(b.this);
                            b.this.f137454x = false;
                            boolean unused2 = b.f137430c = false;
                            b.this.f137455y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f137450t, b.this.f137451u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f137448r = activity.getClass().getName();
                        b.this.f137449s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f137454x) {
                            if (b.f137428a) {
                                b.k();
                                int unused = b.f137431d = 1;
                                long unused2 = b.f137433f = b.this.f137449s;
                            }
                            if (!b.this.f137448r.equals(b.this.f137450t)) {
                                return;
                            }
                            if (b.f137430c && !b.f137429b) {
                                int unused3 = b.f137431d = 4;
                                long unused4 = b.f137433f = b.this.f137449s;
                                return;
                            } else if (!b.f137430c) {
                                int unused5 = b.f137431d = 3;
                                long unused6 = b.f137433f = b.this.f137449s;
                                return;
                            }
                        }
                        b.this.f137454x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f137448r, b.this.f137449s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f137446p = activity.getClass().getName();
                        b.this.f137447q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f137446p, b.this.f137447q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f137452v = activity.getClass().getName();
                        b.this.f137453w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f137452v, b.this.f137453w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.f137436B;
        bVar.f137436B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.f137436B;
        bVar.f137436B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.f137436B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f137428a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f137439i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f137439i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f137439i.get(i10), this.f137440j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f137441k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f137441k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f137441k.get(i10), this.f137442l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f137444n, this.f137445o));
            jSONObject.put("last_start_activity", a(this.f137446p, this.f137447q));
            jSONObject.put("last_resume_activity", a(this.f137448r, this.f137449s));
            jSONObject.put("last_pause_activity", a(this.f137450t, this.f137451u));
            jSONObject.put("last_stop_activity", a(this.f137452v, this.f137453w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f137448r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f137443m);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f137454x;
    }

    public static long c() {
        return f137433f;
    }

    public static b d() {
        if (f137434z == null) {
            synchronized (b.class) {
                try {
                    if (f137434z == null) {
                        f137434z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f137434z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f137455y;
    }

    public static int b() {
        int i10 = f137431d;
        return i10 == 1 ? f137432e ? 2 : 1 : i10;
    }

    public static void a() {
        f137432e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        try {
            if (bVar.f137443m.size() >= bVar.f137435A) {
                aVar = bVar.f137443m.poll();
                if (aVar != null) {
                    bVar.f137443m.add(aVar);
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new a(str, str2, j10);
                bVar.f137443m.add(aVar);
            }
            aVar.f137458b = str2;
            aVar.f137457a = str;
            aVar.f137459c = j10;
        } catch (Throwable unused) {
        }
    }
}
