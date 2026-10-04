package com.bytedance.sdk.openadsdk.core.lp;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    private final AdEvents Ht;
    private final AdSession TFq;
    protected String mZ;
    protected VastProperties uR;
    private boolean Mm = false;
    protected boolean ZRu = false;
    protected int NOt = 0;

    public Mm(AdSession adSession, AdEvents adEvents, View view) {
        this.TFq = adSession;
        this.Ht = adEvents;
        this.mZ = adSession.getAdSessionId();
        ZRu(view);
    }

    public void NOt(int i10) {
    }

    public void ZRu(float f10, boolean z10) {
    }

    public void mZ() {
        ZRu(4);
    }

    public void uR() {
        ZRu(3);
    }

    public void NOt() {
        ZRu(1);
    }

    public void ZRu(boolean z10) {
    }

    public void ZRu(boolean z10, float f10) {
    }

    public void ZRu(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.TFq) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void ZRu(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.TFq;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean ZRu() {
        return this.ZRu;
    }

    public void ZRu(int i10) {
        int i11;
        if (this.TFq == null || this.Ht == null || !TFq.mZ()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.NOt) == 0 || i11 == 4) {
                        return;
                    }
                    this.TFq.finish();
                    this.ZRu = false;
                } else {
                    if (this.Mm) {
                        return;
                    }
                    int i12 = this.NOt;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.Ht.impressionOccurred();
                    this.Mm = true;
                }
            } else {
                if (this.NOt != 0) {
                    return;
                }
                this.TFq.start();
                if (this.uR == null) {
                    this.uR = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.Ht.loaded(this.uR);
                this.ZRu = true;
                this.uR = null;
            }
        } else {
            if (this.NOt != 0) {
                return;
            }
            this.TFq.start();
            this.Ht.loaded();
            this.ZRu = true;
        }
        this.NOt = i10;
    }

    public void ZRu(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            ZRu((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
