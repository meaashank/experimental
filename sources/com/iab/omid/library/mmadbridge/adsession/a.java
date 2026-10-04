package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f151527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f151528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f151529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f151530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f151531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f151532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f151533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f151534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f151535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f151536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f151537k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f151535i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f151536j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f151533g) {
            return;
        }
        this.f151529c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f151530d.get();
    }

    public List<e> d() {
        return this.f151529c.a();
    }

    public boolean e() {
        return this.f151537k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f151533g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f151532f && !this.f151533g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f151533g) {
            return;
        }
        this.f151530d.clear();
        removeAllFriendlyObstructions();
        this.f151533g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f151531e = null;
        this.f151537k = null;
    }

    public boolean g() {
        return this.f151533g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f151534h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f151531e;
    }

    public boolean h() {
        return this.f151528b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f151528b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f151532f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f151535i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f151536j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f151533g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f151533g) {
            return;
        }
        this.f151529c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f151533g) {
            return;
        }
        this.f151529c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f151537k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f151532f) {
            return;
        }
        this.f151532f = true;
        c.c().c(this);
        this.f151531e.a(i.c().b());
        this.f151531e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f151531e.a(this, this.f151527a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f151529c = new f();
        this.f151532f = false;
        this.f151533g = false;
        this.f151528b = adSessionConfiguration;
        this.f151527a = adSessionContext;
        this.f151534h = str;
        b(null);
        this.f151531e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f151531e.i();
        c.c().a(this);
        this.f151531e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f151530d.clear();
            }
        }
    }

    private void b(View view) {
        this.f151530d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f151537k.onPossibleObstructionsDetected(this.f151534h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f151536j = true;
    }
}
