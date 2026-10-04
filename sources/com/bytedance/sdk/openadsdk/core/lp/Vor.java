package com.bytedance.sdk.openadsdk.core.lp;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes3.dex */
public class Vor extends Mm {
    private boolean Ht;

    @NonNull
    private final MediaEvents TFq;

    public Vor(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.TFq = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.Mm
    public void NOt(int i10) {
        if (ZRu()) {
            switch (i10) {
                case 0:
                    this.TFq.pause();
                    break;
                case 1:
                    this.TFq.resume();
                    break;
                case 2:
                case 14:
                    this.TFq.skipped();
                    break;
                case 4:
                    this.TFq.bufferStart();
                    break;
                case 5:
                    this.TFq.bufferFinish();
                    break;
                case 6:
                    this.TFq.firstQuartile();
                    break;
                case 7:
                    this.TFq.midpoint();
                    break;
                case 8:
                    this.TFq.thirdQuartile();
                    break;
                case 9:
                    this.TFq.complete();
                    break;
                case 10:
                    this.TFq.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.TFq.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.TFq.volumeChange(this.Ht ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.TFq.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.Mm
    public void ZRu(boolean z10, float f10) {
        if (z10) {
            this.uR = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.uR = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        ZRu(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.Mm
    public void ZRu(float f10, boolean z10) {
        if (ZRu()) {
            this.TFq.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.Mm
    public void ZRu(boolean z10) {
        this.Ht = z10;
        NOt(12);
    }
}
