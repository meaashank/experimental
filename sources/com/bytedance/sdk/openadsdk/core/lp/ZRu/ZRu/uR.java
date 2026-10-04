package com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.lp.aT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    public static Set<aT> ZRu(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        aT aTVarZRu;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(TFq.Mm, "vendor");
                    String strNOt = null;
                    String strNOt2 = null;
                    String strNOt3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(TFq.Mm, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strNOt3 = TFq.NOt(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(TFq.Mm, "apiFramework"))) {
                                            break;
                                        } else {
                                            strNOt = TFq.NOt(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strNOt2 = TFq.NOt(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strNOt) && (aTVarZRu = aT.ZRu(CampaignEx.KEY_OMID, strNOt, attributeValue, strNOt2, strNOt3)) != null) {
                            hashSet.add(aTVarZRu);
                        }
                    }
                } else {
                    TFq.ZRu(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
