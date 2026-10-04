package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.inmobi.commons.core.configs.SignalsConfig;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3726sb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f153358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f153359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f153360f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SignalsConfig.SessionConfig f153362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f153363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final K5 f153364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3591j1 f153365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3591j1 f153366l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n[] f153356b = {kotlin.jvm.internal.O.u(new PropertyReference1Impl(C3726sb.class, "sessionCnt", "getSessionCnt()I", 0)), kotlin.jvm.internal.O.f217893a.n(new PropertyReference1Impl(C3726sb.class, "userRetention", "getUserRetention()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3726sb f153355a = new C3726sb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f153357c = "sb";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f153361g = kotlin.collections.I.U(0, 0, 0, 0);

    static {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        K5 k5A = null;
        f153362h = ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getSessionConfig();
        f153363i = new AtomicBoolean(false);
        Context contextD = C3657nb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            k5A = J5.a(contextD, "session_pref_file");
        }
        f153364j = k5A;
        f153365k = new C3591j1((Integer) (-1), (InterfaceC4376a) C3699qb.f153300a, false, 12);
        f153366l = new C3591j1((Integer) (-1), (InterfaceC4376a) C3712rb.f153319a, false, 12);
    }

    public static int a() {
        K5 k52 = f153364j;
        if (k52 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return Math.min((int) ((jCurrentTimeMillis - k52.f152165a.getLong("u-ret", jCurrentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f153363i.getAndSet(true)) {
            return;
        }
        if (C3740tb.a().isSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            f153358d = string;
            String TAG = f153357c;
            kotlin.jvm.internal.G.o(TAG, "TAG");
        }
        f153360f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            K5 k52 = f153364j;
            if (k52 != null) {
                int iMin = Math.min(k52.f152165a.getInt("cnt", 0) + 1, Integer.MAX_VALUE);
                SharedPreferences.Editor editorEdit = k52.f152165a.edit();
                editorEdit.putInt("cnt", iMin);
                editorEdit.apply();
            }
            f153365k.a();
        }
        if (a(6)) {
            K5 k53 = f153364j;
            if (k53 != null && !k53.f152165a.contains("u-ret")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit2 = k53.f152165a.edit();
                editorEdit2.putLong("u-ret", jCurrentTimeMillis);
                editorEdit2.apply();
            }
            f153366l.a();
        }
    }

    public final JSONObject b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        if (a(0)) {
            linkedHashMap.put("st", Long.valueOf(f153360f));
        }
        if (a(5)) {
            C3591j1 c3591j1 = f153365k;
            kotlin.reflect.n[] nVarArr = f153356b;
            if (((Number) c3591j1.getValue(this, nVarArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) c3591j1.getValue(this, nVarArr[0])).intValue()));
            }
        }
        if (a(6)) {
            C3591j1 c3591j12 = f153366l;
            kotlin.reflect.n[] nVarArr2 = f153356b;
            if (((Number) c3591j12.getValue(this, nVarArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) c3591j12.getValue(this, nVarArr2[1])).intValue()));
            }
        }
        List listD6 = kotlin.collections.U.d6(f153361g);
        if (!a(1)) {
            ((ArrayList) listD6).set(0, -1);
        }
        if (!a(2)) {
            ((ArrayList) listD6).set(1, -1);
        }
        if (!a(3)) {
            ((ArrayList) listD6).set(2, -1);
        }
        if (!a(4)) {
            ((ArrayList) listD6).set(3, -1);
        }
        if (!((ArrayList) listD6).isEmpty()) {
            ArrayList arrayList = (ArrayList) listD6;
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((Number) obj).intValue() != -1) {
                        linkedHashMap.put("dep", listD6);
                        break;
                    }
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean a(int i10) {
        return f153362h.getSigControlList().contains(Integer.valueOf(i10));
    }

    public static void a(String adtype, Boolean bool) {
        kotlin.jvm.internal.G.p(adtype, "adtype");
        if (adtype.equals("banner") && a(1)) {
            List list = f153361g;
            list.set(0, Integer.valueOf(Math.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (adtype.equals("int") && !kotlin.jvm.internal.G.g(bool, Boolean.TRUE) && a(2)) {
            List list2 = f153361g;
            list2.set(1, Integer.valueOf(Math.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (adtype.equals("native") && a(4)) {
            List list3 = f153361g;
            list3.set(3, Integer.valueOf(Math.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.G.g(bool, Boolean.TRUE) && a(3)) {
            List list4 = f153361g;
            list4.set(2, Integer.valueOf(Math.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
