package com.bytedance.sdk.openadsdk.core.lp;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lp;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class FA {
    @NonNull
    public static Mm ZRu(@NonNull View view, @NonNull Set<aT> set) {
        AdSession adSessionZRu = ZRu(CreativeType.VIDEO, set, Owner.NATIVE);
        return new Vor(adSessionZRu, AdEvents.createAdEvents(adSessionZRu), view, MediaEvents.createMediaEvents(adSessionZRu));
    }

    public static Mm ZRu(WebView webView) {
        Partner partnerZRu = TFq.ZRu();
        if (partnerZRu != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerZRu, webView, "", ""));
            return new Mm(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession ZRu(CreativeType creativeType, Set<aT> set, Owner owner) {
        List<VerificationScriptResource> listZRu = ZRu(set);
        if (listZRu.isEmpty()) {
            lp.NOt("verificationScriptResources is empty");
        }
        Partner partnerZRu = TFq.ZRu();
        if (partnerZRu == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerZRu, TFq.NOt(), listZRu, "", ""));
    }

    private static List<VerificationScriptResource> ZRu(Set<aT> set) {
        ArrayList arrayList = new ArrayList();
        for (aT aTVar : set) {
            try {
                if (!TextUtils.isEmpty(aTVar.ZRu()) && !TextUtils.isEmpty(aTVar.NOt())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(aTVar.ZRu(), aTVar.mZ(), aTVar.NOt()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(aTVar.mZ()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
