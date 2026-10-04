package O6;

import J6.f;
import android.content.Context;
import com.prism.fusionadsdk.internal.config.AdPlaceItems;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65190f = com.prism.fusionadsdkbase.a.f162373j.concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Queue<AdPlaceItems> f65191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T6.a f65192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdPlaceItems f65193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f65194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f65195e;

    public b(List<AdPlaceItems> list, Context context, c cVar) {
        if (this.f65191a == null) {
            this.f65191a = new LinkedList();
        }
        this.f65192b = new a(cVar, this);
        this.f65194d = context;
        this.f65195e = cVar;
        this.f65191a.addAll(list);
    }

    public void a(Class cls, AdPlaceItems adPlaceItems) {
        if (cls == null) {
            this.f65195e.onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162367d);
            return;
        }
        try {
            e eVar = (e) cls.getConstructor(null).newInstance(null);
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setAdid(adPlaceItems.f162308id);
            builder.setAdListener(this.f65192b);
            StringBuilder sb2 = new StringBuilder("call ");
            sb2.append(c());
            sb2.append(" load ad");
            eVar.load(this.f65194d, builder.build());
        } catch (Exception e10) {
            e10.getMessage();
            this.f65195e.onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162367d);
        }
    }

    public AdPlaceItems b() {
        return this.f65193c;
    }

    public String c() {
        AdPlaceItems adPlaceItems = this.f65193c;
        if (adPlaceItems == null) {
            return null;
        }
        return adPlaceItems.adNetworkName;
    }

    @Override // java.lang.Runnable
    public void run() {
        Class clsS;
        Queue<AdPlaceItems> queue = this.f65191a;
        if (queue == null) {
            this.f65195e.onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162367d);
            return;
        }
        AdPlaceItems adPlaceItemsPoll = queue.poll();
        this.f65193c = adPlaceItemsPoll;
        if (adPlaceItemsPoll == null) {
            this.f65195e.onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162366c);
            return;
        }
        new StringBuilder("to load:").append(this.f65193c.toString());
        if (this.f65193c.isOriginalInterstitialAd()) {
            clsS = f.o(this.f65193c.adNetworkName);
        } else if (this.f65193c.isBanner()) {
            clsS = null;
        } else if (this.f65193c.isNative()) {
            clsS = f.r(this.f65193c.adNetworkName);
        } else if (this.f65193c.isNativeFakeInterstitial()) {
            clsS = f.p(this.f65193c.adNetworkName);
        } else if (this.f65193c.isNativeInterstitial()) {
            clsS = f.q(this.f65193c.adNetworkName);
        } else {
            if (!this.f65193c.isRewardedInterstitial()) {
                run();
                return;
            }
            clsS = f.s(this.f65193c.adNetworkName);
        }
        StringBuilder sb2 = new StringBuilder("adnetwork:");
        sb2.append(this.f65193c.adNetworkName);
        sb2.append("; clz exists ");
        sb2.append(clsS != null);
        sb2.append("; tryingNetwork: ");
        sb2.append(this.f65193c.type);
        a(clsS, this.f65193c);
    }
}
