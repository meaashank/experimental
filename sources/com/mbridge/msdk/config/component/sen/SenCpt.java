package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.f;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f154766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f154767l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f154768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f154769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f154770j;

    private String c(String str) {
        return com.mbridge.msdk.config.component.common.util.c.c("331").equals(str) ? "accelerometer" : com.mbridge.msdk.config.component.common.util.c.c("332").equals(str) ? "magnetic" : com.mbridge.msdk.config.component.common.util.c.c("333").equals(str) ? "gyroscope" : com.mbridge.msdk.config.component.common.util.c.c("334").equals(str) ? f.f106849i : str;
    }

    private void h() {
        if (f154766k == null) {
            f154766k = new b();
        }
        if (f154767l == null) {
            f154767l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f154775a.b(bVar);
            }
        };
        f154767l.put(this.f154769i, aVar);
        f154766k.a(aVar);
        f154766k.a(g(), c(this.f154769i), this.f154770j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("149"))) {
                    this.f154769i = String.valueOf(entry.getValue());
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("150"))) {
                    double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d10 > 0.0d) {
                        this.f154770j = (int) (d10 * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.f154768h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f154768h.equals(com.mbridge.msdk.config.component.common.util.c.c("310"))) {
            h();
        }
        if (this.f154768h.equals(com.mbridge.msdk.config.component.common.util.c.c("318")) && f154766k != null && (map = f154767l) != null) {
            f154766k.b(map.get(this.f154769i));
            f154767l.remove(this.f154769i);
            if (f154767l.isEmpty()) {
                f154766k.a();
                f154766k = null;
            }
        }
        a("917003", (HashMap<String, Object>) null);
    }

    private int g() {
        if (com.mbridge.msdk.config.component.common.util.c.c("331").equals(this.f154769i)) {
            return 1;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("332").equals(this.f154769i)) {
            return 2;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("333").equals(this.f154769i)) {
            return 4;
        }
        return com.mbridge.msdk.config.component.common.util.c.c("334").equals(this.f154769i) ? 11 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }
}
