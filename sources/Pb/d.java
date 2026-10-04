package Pb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes7.dex */
public class d extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RewardedAd f65698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f65699f;

    public d(Context context, QueryInfo queryInfo, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, h hVar) {
        super(context, cVar, queryInfo, dVar);
        RewardedAd rewardedAd = new RewardedAd(context, cVar.b());
        this.f65698e = rewardedAd;
        this.f65699f = new e(rewardedAd, hVar);
    }

    @Override // Pb.a
    public void b(Mb.b bVar, AdRequest adRequest) {
        this.f65699f.e(bVar);
        this.f65698e.loadAd(adRequest, this.f65699f.d());
    }

    @Override // Mb.a
    public void show(Activity activity) {
        if (this.f65698e.isLoaded()) {
            this.f65698e.show(activity, this.f65699f.c());
        } else {
            this.f65690d.handleError(com.unity3d.scar.adapter.common.c.a(this.f65688b));
        }
    }
}
