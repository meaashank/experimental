package com.inmobi.media;

import Y6.d;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.C3530ea;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3530ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f152874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3596j6 f152875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3587ib f152876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f152877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f152878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f152879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f152880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f152881k;

    public C3530ea(Context context, double d10, EnumC3568h6 logLevel, long j10, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(logLevel, "logLevel");
        this.f152871a = context;
        this.f152872b = j10;
        this.f152873c = i10;
        this.f152874d = z10;
        this.f152875e = new C3596j6(logLevel);
        this.f152876f = new C3587ib(d10);
        this.f152877g = Collections.synchronizedList(new ArrayList());
        this.f152878h = new ConcurrentHashMap();
        this.f152879i = new AtomicBoolean(false);
        this.f152880j = "";
        this.f152881k = new AtomicInteger(0);
    }

    public final void a(final EnumC3568h6 logLevel, String tag, String message) throws JSONException {
        kotlin.jvm.internal.G.p(logLevel, "logLevel");
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(message, "message");
        if (this.f152879i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = AbstractC3610k6.f153083a;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", simpleDateFormat.format(new Date()));
        jSONObject.put(d.C0152d.f79310d, tag);
        jSONObject.put("data", message);
        AbstractC3721s6.f153342a.submit(new Runnable() { // from class: F5.d1
            @Override // java.lang.Runnable
            public final void run() {
                C3530ea.a(this.f34462a, logLevel, jSONObject);
            }
        });
    }

    public final void b() {
        Objects.toString(this.f152879i);
        if ((this.f152874d || this.f152876f.a()) && !this.f152879i.getAndSet(true)) {
            AbstractC3721s6.f153342a.submit(new Runnable() { // from class: F5.c1
                @Override // java.lang.Runnable
                public final void run() {
                    C3530ea.b(this.f34456a);
                }
            });
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f152878h) {
            for (Map.Entry entry : this.f152878h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f152877g;
        kotlin.jvm.internal.G.o(logData, "logData");
        synchronized (logData) {
            List logData2 = this.f152877g;
            kotlin.jvm.internal.G.o(logData2, "logData");
            Iterator it = logData2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
        }
        return jSONArray;
    }

    public static final void b(C3530ea this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        Objects.toString(this$0.f152879i);
        ScheduledExecutorService scheduledExecutorService = AbstractC3721s6.f153342a;
        Result.e(AbstractC3707r6.a(new C3516da(this$0, true)));
    }

    public static final void a(C3530ea this$0, EnumC3568h6 logLevel, JSONObject data) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(logLevel, "$logLevel");
        kotlin.jvm.internal.G.p(data, "$data");
        try {
            C3596j6 c3596j6 = this$0.f152875e;
            c3596j6.getClass();
            int iOrdinal = c3596j6.f153050a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (logLevel != EnumC3568h6.f152976d) {
                            return;
                        }
                    } else if (logLevel != EnumC3568h6.f152975c && logLevel != EnumC3568h6.f152976d) {
                        return;
                    }
                } else if (logLevel != EnumC3568h6.f152974b && logLevel != EnumC3568h6.f152975c && logLevel != EnumC3568h6.f152976d) {
                    return;
                }
            }
            this$0.f152877g.add(data);
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a() {
        Objects.toString(this.f152879i);
        if ((this.f152874d || this.f152876f.a()) && !this.f152879i.get()) {
            AbstractC3721s6.f153342a.submit(new Runnable() { // from class: F5.b1
                @Override // java.lang.Runnable
                public final void run() {
                    C3530ea.a(this.f34450a);
                }
            });
        }
    }

    public static final void a(C3530ea this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f152881k.getAndIncrement();
        Objects.toString(this$0.f152879i);
        ScheduledExecutorService scheduledExecutorService = AbstractC3721s6.f153342a;
        Result.e(AbstractC3707r6.a(new C3516da(this$0, false)));
    }
}
