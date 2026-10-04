package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f159890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f159891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f159892c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f159893d = new long[2];

    public g(c cVar, s sVar) {
        this.f159890a = cVar;
        this.f159891b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f159892c.incrementAndGet();
            this.f159893d[0] = System.currentTimeMillis();
            this.f159893d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f159890a.a(iVar);
            this.f159891b.l();
            this.f159891b.e();
            this.f159891b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f159893d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
