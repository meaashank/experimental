package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f154832h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f154833i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f154834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f154835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f154836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f154837m;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154838a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f154839b;

        public a(boolean z10) {
            this.f154839b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            String strC = c.c("triggered_count");
            int i10 = this.f154838a;
            this.f154838a = i10 + 1;
            map.put(strC, Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", (Map<String, Object>) map));
            if (this.f154839b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f154832h.get(timeCpt2.f154834j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f154835k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("110"));
                if (obj2 instanceof String) {
                    return this.f154834j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get(c.c("110"));
        if (obj != null) {
            this.f154834j = String.valueOf(obj);
        }
        Object obj2 = map.get(c.c("152"));
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f154835k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get(c.c("153"));
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f154836l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
        if (obj4 != null) {
            this.f154837m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f154832h.containsKey(this.f154834j)) {
            handler = (Handler) this.f154832h.get(this.f154834j);
        } else {
            handler = new Handler();
            this.f154832h.put(this.f154834j, handler);
        }
        if (this.f154833i.containsKey(this.f154834j)) {
            aVar = (Runnable) this.f154833i.get(this.f154834j);
        } else {
            aVar = new a(this.f154836l == 1);
            this.f154833i.put(this.f154834j, aVar);
        }
        if (handler != null && aVar != null) {
            if (c.c("310").equals(this.f154837m) || c.c("335").equals(this.f154837m)) {
                handler.postDelayed(aVar, this.f154835k);
            } else if (c.c("311").equals(this.f154837m)) {
                handler.removeCallbacks(aVar);
                this.f154832h.remove(this.f154834j);
            } else if (c.c("316").equals(this.f154837m)) {
                handler.removeCallbacks(aVar);
            }
        }
        a("919002", (HashMap<String, Object>) null);
    }
}
