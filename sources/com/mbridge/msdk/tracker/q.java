package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f160113a;

    public q(g gVar) {
        this.f160113a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f160113a)) {
            return;
        }
        this.f160113a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f160113a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f160113a.b(eVar);
        } catch (Exception e10) {
            if (a.f159874a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f160113a)) {
            return new long[]{0, 0};
        }
        return this.f160113a.a();
    }
}
