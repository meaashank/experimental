package com.mbridge.msdk.config.component.cal;

import Hd.d;
import Z3.f;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.base.e;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpVersion;

/* JADX INFO: loaded from: classes5.dex */
public class CalCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f154198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f154199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f154200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f154201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f154202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f154203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f154204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f154205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f154206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f154207q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(c.c("500"), z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        if (!z10) {
            map.put(c.c(f.f79422s), str);
            map.put(c.c("reason"), str2);
        }
        a(a("910002", (Map<String, Object>) map));
    }

    private String h() {
        Map<String, Object> mapF = this.f154198h.f();
        this.f154200j = e.a("107", mapF);
        this.f154201k = e.a("cbType", mapF);
        this.f154202l = e.a("110", mapF);
        this.f154203m = e.a("111", mapF);
        this.f154204n = e.a("106", mapF);
        this.f154205o = e.a("108", mapF);
        this.f154206p = e.a("109", mapF);
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f154190d.b((Object) "adModel")).b((Object) d.f50815k);
        StringBuilder sb2 = new StringBuilder();
        if (objB instanceof String) {
            sb2.append(objB);
            sb2.append("/addReward?user_id=");
            sb2.append(this.f154200j);
            sb2.append("&cb_type=");
            sb2.append(this.f154201k);
            sb2.append("&reward_name=");
            sb2.append(this.f154202l);
            sb2.append("&reward_amount=");
            sb2.append(this.f154203m);
            sb2.append("&unit_id=");
            sb2.append(this.f154204n);
            sb2.append("&click_id=");
            sb2.append(this.f154205o);
            sb2.append("&extra=");
            sb2.append(this.f154206p);
        }
        return sb2.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f154198h.f();
        this.f154202l = e.a("110", mapF);
        this.f154203m = e.a("111", mapF);
        RewardInfo rewardInfo = new RewardInfo(mapF.get(c.c("112")).equals("1"), 1);
        rewardInfo.setRewardName(this.f154202l);
        rewardInfo.setRewardAmount(this.f154203m);
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f154199i, rewardInfo);
        }
    }

    private void j() {
        if (this.f154207q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("buyer_id"), this.f154198h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f154207q).a(map);
        }
    }

    private void k() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f154199i);
        }
    }

    private void l() {
        if (this.f154207q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c(MBridgeConstans.PROPERTIES_UNIT_ID), this.f154198h.g());
            map.put(c.c("ready_state"), Boolean.valueOf(this.f154198h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f154207q).a(map);
        }
    }

    private void m() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f154199i, this.f154198h.c() == null ? "" : this.f154198h.c());
        }
    }

    private void n() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f154199i);
        }
    }

    private void o() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f154199i);
        }
    }

    private void p() {
        if (this.f154207q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(c.c("init_status"), Integer.valueOf(this.f154198h.d()));
            map.put(c.c("reason"), this.f154198h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f154207q).a(map);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", HttpVersion.HTTP);
        map2.put("method", "GET");
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f154190d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f154199i, this.f154198h.c() == null ? "" : this.f154198h.c());
        }
    }

    private void s() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f154199i);
        }
    }

    private void t() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f154199i);
        }
    }

    private void u() {
        Object obj = this.f154207q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f154199i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "910001";
        this.f154198h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f154199i = mBridgeIds;
        mBridgeIds.setUnitId(this.f154198h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f154190d;
            if (aVar != null && aVar.a((Object) c.c("sdk_context"))) {
                Object objB = this.f154190d.b((Object) c.c("sdk_context"));
                if (objB instanceof Map) {
                    this.f154207q = ((Map) objB).get(c.c("callback"));
                }
            }
            if (this.f154207q == null) {
                a(false, "", "Callback Listener is NULL");
            }
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = this.f154190d;
            if (aVar2 != null && aVar2.a((Object) c.c("51"))) {
                Object objB2 = this.f154190d.b((Object) c.c("51"));
                if (objB2 instanceof Map) {
                    String strValueOf = String.valueOf(((Map) objB2).get("id"));
                    if (!TextUtils.isEmpty(strValueOf) && strValueOf.contains(com.prism.gaia.download.a.f164606q)) {
                        this.f154199i.setContextId(strValueOf);
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("CalCpt", th.getMessage(), th);
        }
        g();
    }

    public void g() {
        String strB = this.f154198h.b();
        if (strB == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            if (c.c("loadV3Success").equals(strB)) {
                n();
            } else if (c.c("loadSuccess").equals(strB)) {
                o();
            } else if (c.c("loadFailed").equals(strB)) {
                m();
            } else if (c.c("301").equals(strB)) {
                s();
            } else if (c.c("302").equals(strB)) {
                r();
            } else if (c.c("304").equals(strB)) {
                k();
            } else if (c.c("305").equals(strB)) {
                t();
            } else if (c.c("306").equals(strB)) {
                i();
            } else if (c.c("303").equals(strB)) {
                u();
            } else if (c.c("308").equals(strB)) {
                q();
            } else if (c.c("300").equals(strB)) {
                l();
            } else if (c.c("sdkInit").equals(strB)) {
                p();
            } else if (c.c("309").equals(strB)) {
                j();
            }
        } catch (Exception e10) {
            q0.b("CalCpt", e10.getMessage(), e10);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }
}
