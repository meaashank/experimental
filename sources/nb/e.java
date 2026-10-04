package Nb;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f64931a = "gmaScarBiddingRewardedSignal";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64932b = "gmaScarBiddingInterstitialSignal";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f64933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f64934b;

        public a(b bVar, f fVar) {
            this.f64933a = bVar;
            this.f64934b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapC = this.f64934b.c();
            if (mapC.size() > 0) {
                this.f64933a.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f64934b.b() == null) {
                this.f64933a.onSignalsCollected("");
            } else {
                this.f64933a.onSignalsCollectionFailed(this.f64934b.b());
            }
        }
    }

    @Override // Nb.c
    public void a(Context context, String[] strArr, String[] strArr2, b bVar) {
        com.unity3d.scar.adapter.common.b bVar2 = new com.unity3d.scar.adapter.common.b();
        f fVar = new f();
        for (String str : strArr) {
            bVar2.a();
            c(context, str, true, bVar2, fVar);
        }
        for (String str2 : strArr2) {
            bVar2.a();
            c(context, str2, false, bVar2, fVar);
        }
        bVar2.c(new a(bVar, fVar));
    }

    @Override // Nb.c
    public void b(Context context, b bVar) {
        com.unity3d.scar.adapter.common.b bVar2 = new com.unity3d.scar.adapter.common.b();
        f fVar = new f();
        bVar2.a();
        d(context, true, bVar2, fVar);
        bVar2.a();
        d(context, false, bVar2, fVar);
        bVar2.c(new a(bVar, fVar));
    }

    public void e(String str, com.unity3d.scar.adapter.common.b bVar, f fVar) {
        fVar.d(String.format("Operation Not supported: %s.", str));
        bVar.b();
    }
}
