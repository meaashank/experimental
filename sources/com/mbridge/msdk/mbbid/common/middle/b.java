package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f157249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f157250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f157251c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f157253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f157254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f157255g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f157257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f157258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f157259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f157260l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f157256h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f157252d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.f157249a = str;
        this.f157250b = str2;
        this.f157251c = str3;
    }

    public void b(boolean z10) {
        this.f157259k = z10;
    }

    public void b(int i10) {
        this.f157260l = i10;
    }

    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f157261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f157261b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f157256h = false;
            b.this.f157254f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f157252d, b.this.f157250b, bidResponsedEx.getBidId(), this.f157261b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f157256h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f157252d, b.this.f157250b, str, this.f157261b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f157258j = j10;
    }

    public void a(int i10) {
        this.f157255g = i10;
    }

    public void a(long j10) {
        this.f157257i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f157256h) {
                this.f157256h = true;
                if (this.f157252d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f157252d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a("app_id", strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f157250b);
                if (TextUtils.isEmpty(this.f157249a)) {
                    this.f157249a = "";
                }
                eVar.a(MintegralConstants.PLACEMENT_ID, this.f157249a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f157251c);
                eVar.a(e.f156515h, v0.a(this.f157252d, this.f157250b));
                eVar.a(e.f156514g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f157250b, ""));
                String str = "1";
                eVar.a("req_type", this.f157259k ? "1" : "2");
                eVar.a("orientation", m0.G(this.f157252d) + "");
                int i10 = this.f157255g;
                if (i10 == 296) {
                    if (this.f157257i > 0 && this.f157258j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f157258j + "x" + this.f157257i);
                        try {
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f157250b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f157250b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f157257i > 0 && this.f157258j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f157258j + "x" + this.f157257i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f157260l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f157257i > 0 && this.f157258j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f157258j + "x" + this.f157257i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f157249a, this.f157250b, md5);
                aVar2.setUnitId(this.f157250b);
                aVar2.setPlacementId(this.f157249a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th) {
            a(th.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f157253e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f157253e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f157253e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
