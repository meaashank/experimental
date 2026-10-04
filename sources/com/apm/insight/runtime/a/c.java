package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CrashType f137460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f137461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonParams f137462c = com.apm.insight.e.a().c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f137463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f137464e;

    public interface a {
        com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i10, com.apm.insight.entity.a aVar);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f137460a = crashType;
        this.f137461b = context;
        this.f137463d = bVar;
        this.f137464e = dVar;
    }

    public int a() {
        return 6;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f137462c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + m.a(th), 0);
                aVar.a(map);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        aVar.a("process_name", com.apm.insight.l.a.d(com.apm.insight.e.g()));
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        b bVar;
        if (!com.apm.insight.l.a.c(com.apm.insight.e.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.f137463d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f137462c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + m.a(th)));
            } catch (Throwable unused) {
            }
        }
        String strK = com.apm.insight.e.k();
        if (strK != null) {
            aVar.a("business", (Object) strK);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a(this.f137461b)));
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public final com.apm.insight.entity.a a(@Nullable com.apm.insight.entity.a aVar, @Nullable a aVar2, boolean z10) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i10 = 0; i10 < a(); i10++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i10, aVar3);
                } catch (Throwable unused) {
                }
            }
            try {
                aVar3 = a(i10, aVar3);
            } catch (Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i10, aVar3);
                } catch (Throwable unused3) {
                }
                if (z10) {
                    if (i10 != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(String.valueOf(i10)), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i10 == 0) {
            b(aVar);
            return aVar;
        }
        if (i10 == 1) {
            c(aVar);
            List<AttachUserData> listA = com.apm.insight.e.b().a(this.f137460a);
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = aVar.c().optJSONObject("custom");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                aVar.a("custom", jSONObjectOptJSONObject);
            }
            if (listA != null) {
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    try {
                        AttachUserData attachUserData = listA.get(i11);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f137460a));
                        map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                    } catch (Throwable th) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th);
                    }
                }
            }
            try {
                jSONObjectOptJSONObject.put("fd_count", com.apm.insight.a.f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> listB = com.apm.insight.e.b().b(this.f137460a);
            if (listB != null) {
                JSONObject jSONObjectOptJSONObject2 = aVar.c().optJSONObject("custom_long");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    aVar.a("custom_long", jSONObjectOptJSONObject2);
                }
                while (i < listB.size()) {
                    try {
                        AttachUserData attachUserData2 = listB.get(i);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f137460a));
                        map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                    } catch (Throwable th2) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th2);
                    }
                    i++;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (Throwable unused2) {
                }
            }
        } else if (i10 != 2) {
            if (i10 == 5 && c()) {
                aVar.b(n.a());
                return aVar;
            }
        } else {
            d dVar = this.f137464e;
            aVar.a("battery", Integer.valueOf(dVar != null ? dVar.a() : 0));
            aVar.c(com.apm.insight.e.b().a());
            return aVar;
        }
        return aVar;
    }
}
