package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f154776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e f154777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f154778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f154779n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f154780h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f154781i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Map<String, Object> f154782j = null;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "916001";
        if (map == null) {
            return;
        }
        this.f154782j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f154781i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f154781i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f154779n == null) {
            f154779n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f154807a.b(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f154776k;
                if (cVar != null) {
                    cVar.b(f154779n);
                    f154776k.d();
                }
                f154776k = null;
            } else if (f154776k == null) {
                c cVar2 = new c();
                f154776k = cVar2;
                cVar2.a(f154779n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f155937s;
                if (bVar != null) {
                    bVar.a(f154779n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f155937s;
                if (bVar2 != null) {
                    bVar2.b(f154779n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f154777l;
                if (eVar != null) {
                    eVar.b(f154779n);
                    f154777l.d();
                }
                f154777l = null;
            } else if (f154777l == null) {
                e eVar2 = new e();
                f154777l = eVar2;
                eVar2.a(f154779n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f154782j;
            if (map2 != null) {
                Object obj = map2.get(com.mbridge.msdk.config.component.common.util.c.c(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f154782j.containsKey(com.mbridge.msdk.config.component.common.util.c.c("key_list")) && (this.f154782j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) instanceof List)) ? (List) this.f154782j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f154778m;
                if (dVar != null) {
                    dVar.b(f154779n);
                }
                f154778m = null;
            } else if (f154778m == null) {
                d dVar2 = new d(strValueOf);
                f154778m = dVar2;
                dVar2.a(list);
                f154778m.a(f154779n);
            }
        }
        g();
        a(a("916007", (Map<String, Object>) null));
    }

    private boolean c(String str) {
        Object obj = this.f154781i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("17"))).equals("1");
        }
        return false;
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f154779n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (TextUtils.isEmpty(this.f154780h)) {
                    this.f154780h = strValueOf;
                    break;
                } else if (!this.f154780h.equals(strValueOf)) {
                    this.f154780h = strValueOf;
                    a(a(bVar.c(), bVar.b()));
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f154781i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(com.mbridge.msdk.config.component.common.util.c.c("17"))) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }
}
