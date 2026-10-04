package Zb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes7.dex */
public class e extends a<RewardedAd> {
    public e(Context context, Yb.a aVar, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, h hVar) {
        super(context, cVar, aVar, dVar);
        this.f84453e = new f(hVar, this);
    }

    @Override // Zb.a
    public void b(AdRequest adRequest, Mb.b bVar) {
        RewardedAd.load(this.f84450b, this.f84451c.b(), adRequest, ((f) this.f84453e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Mb.a
    public void show(Activity activity) {
        T t10 = this.f84449a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((f) this.f84453e).f());
        } else {
            this.f84454f.handleError(com.unity3d.scar.adapter.common.c.a(this.f84451c));
        }
    }
}
