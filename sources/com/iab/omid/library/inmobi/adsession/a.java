package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.internal.c;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import com.iab.omid.library.inmobi.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f151398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f151399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f151400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.a f151401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f151402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f151403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f151404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f151405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f151406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f151407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f151408k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f151406i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f151407j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f151404g) {
            return;
        }
        this.f151400c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f151401d.get();
    }

    public List<e> d() {
        return this.f151400c.a();
    }

    public boolean e() {
        return this.f151408k != null;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f151404g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f151403f && !this.f151404g;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f151404g) {
            return;
        }
        this.f151401d.clear();
        removeAllFriendlyObstructions();
        this.f151404g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f151402e = null;
        this.f151408k = null;
    }

    public boolean g() {
        return this.f151404g;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public String getAdSessionId() {
        return this.f151405h;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f151402e;
    }

    public boolean h() {
        return this.f151399b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f151399b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f151403f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f151406i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f151407j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f151404g) {
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

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f151404g) {
            return;
        }
        this.f151400c.b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f151404g) {
            return;
        }
        this.f151400c.c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f151408k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f151403f) {
            return;
        }
        this.f151403f = true;
        c.c().c(this);
        this.f151402e.a(i.c().b());
        this.f151402e.a(com.iab.omid.library.inmobi.internal.a.a().b());
        this.f151402e.a(this, this.f151398a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f151400c = new f();
        this.f151403f = false;
        this.f151404g = false;
        this.f151399b = adSessionConfiguration;
        this.f151398a = adSessionContext;
        this.f151405h = str;
        b(null);
        this.f151402e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f151402e.i();
        c.c().a(this);
        this.f151402e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f151401d.clear();
            }
        }
    }

    private void b(View view) {
        this.f151401d = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.inmobi.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.inmobi.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f151408k.onPossibleObstructionsDetected(this.f151405h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f151407j = true;
    }
}
