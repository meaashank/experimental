package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f151269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f151270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f151271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f151272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f151273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f151274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f151275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f151276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f151277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f151278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f151279k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f151277i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f151278j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f151275g) {
            return;
        }
        this.f151271c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f151272d.get();
    }

    public List<e> d() {
        return this.f151271c.a();
    }

    public boolean e() {
        return this.f151279k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f151275g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f151274f && !this.f151275g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f151275g) {
            return;
        }
        this.f151272d.clear();
        removeAllFriendlyObstructions();
        this.f151275g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f151273e = null;
        this.f151279k = null;
    }

    public boolean g() {
        return this.f151275g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f151276h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f151273e;
    }

    public boolean h() {
        return this.f151270b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f151270b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f151274f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f151277i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f151278j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f151275g) {
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

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f151275g) {
            return;
        }
        this.f151271c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f151275g) {
            return;
        }
        this.f151271c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f151279k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f151274f) {
            return;
        }
        this.f151274f = true;
        c.c().c(this);
        this.f151273e.a(i.c().b());
        this.f151273e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f151273e.a(this, this.f151269a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f151271c = new f();
        this.f151274f = false;
        this.f151275g = false;
        this.f151270b = adSessionConfiguration;
        this.f151269a = adSessionContext;
        this.f151276h = str;
        b(null);
        this.f151273e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f151273e.i();
        c.c().a(this);
        this.f151273e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f151272d.clear();
            }
        }
    }

    private void b(View view) {
        this.f151272d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f151279k.onPossibleObstructionsDetected(this.f151276h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f151278j = true;
    }
}
