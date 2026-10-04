package com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu.TFq;
import com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.lp.mZ ZRu(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10;
        com.bytedance.sdk.openadsdk.core.lp.mZ mZVar;
        TFq.ZRu zRu;
        int i10;
        byte b10;
        if (context == null) {
            TFq.ZRu(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i13 = (int) (i11 / f11);
        int i14 = (int) (i12 / f11);
        float f12 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.lp.mZ mZVar2 = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return mZVar2;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = TFq.Mm;
                int iNOt = TFq.NOt(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.WIDTH));
                int iNOt2 = TFq.NOt(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.HEIGHT));
                if (iNOt < 300 || iNOt2 < 250) {
                    f10 = f12;
                    mZVar = mZVar2;
                    TFq.ZRu(xmlPullParser);
                    f12 = f10;
                    mZVar2 = mZVar;
                } else {
                    TFq.ZRu zRu2 = new TFq.ZRu();
                    while (true) {
                        if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals("Companion")) {
                            int i17 = iNOt2;
                            int i18 = iNOt;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i16) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                float f13 = f12;
                                com.bytedance.sdk.openadsdk.core.lp.mZ mZVar3 = mZVar2;
                                byte b11 = -1;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b10 = 0;
                                            b11 = b10;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            b10 = 1;
                                            b11 = b10;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            b11 = 2;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b11 = 3;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            b10 = 4;
                                            b11 = b10;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b10 = 5;
                                            b11 = b10;
                                        }
                                        break;
                                }
                                switch (b11) {
                                    case 0:
                                        TFq.ZRu zRu3 = zRu2;
                                        i10 = 2;
                                        Point pointZRu = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.ZRu(context, i18, i17, ZRu.NOt.HTML_RESOURCE);
                                        int i19 = pointZRu.x;
                                        int i20 = pointZRu.y;
                                        ZRu.NOt nOt = ZRu.NOt.IFRAME_RESOURCE;
                                        ZRu.EnumC0453ZRu enumC0453ZRu = ZRu.EnumC0453ZRu.NONE;
                                        float fZRu = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu(i13, i14, i19, i20, nOt, enumC0453ZRu);
                                        String strNOt = TFq.NOt(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strNOt) && fZRu > zRu3.Mm && fZRu > f13) {
                                            zRu3.Mm = fZRu;
                                            zRu3.ZRu(strNOt, enumC0453ZRu, nOt);
                                            zRu2 = zRu3;
                                            i16 = i10;
                                            iNOt = i18;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            mZVar2 = mZVar3;
                                            i15 = 3;
                                        } else {
                                            TFq.ZRu(xmlPullParser, "IFrameResource", 3);
                                            zRu2 = zRu3;
                                            i15 = 3;
                                            i16 = 2;
                                            iNOt = i18;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            mZVar2 = mZVar3;
                                        }
                                        break;
                                    case 1:
                                        i10 = 2;
                                        zRu2.uR = TFq.NOt(xmlPullParser, "CompanionClickThrough");
                                        i16 = i10;
                                        iNOt = i18;
                                        iNOt2 = i17;
                                        f12 = f13;
                                        mZVar2 = mZVar3;
                                        i15 = 3;
                                        break;
                                    case 2:
                                        zRu = zRu2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                iNOt = i18;
                                                zRu2 = zRu;
                                                iNOt2 = i17;
                                                f12 = f13;
                                                mZVar2 = mZVar3;
                                                i15 = 3;
                                                i16 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                zRu.NOt(TFq.NOt(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        zRu = zRu2;
                                        ZRu.EnumC0453ZRu enumC0453ZRu2 = ZRu.EnumC0453ZRu.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(TFq.Mm, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.ZRu;
                                        ZRu.EnumC0453ZRu enumC0453ZRu3 = set.contains(lowerCase) ? ZRu.EnumC0453ZRu.IMAGE : ZRu.EnumC0453ZRu.JAVASCRIPT;
                                        ZRu.NOt nOt2 = ZRu.NOt.STATIC_RESOURCE;
                                        Point pointZRu2 = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.ZRu(context, i18, i17, nOt2);
                                        float fZRu2 = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu(i13, i14, pointZRu2.x, pointZRu2.y, nOt2, enumC0453ZRu3);
                                        String strNOt2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.NOt.contains(lowerCase)) ? TFq.NOt(xmlPullParser, "StaticResource") : null;
                                        if (fZRu2 >= zRu.Mm && fZRu2 > f13 && !TextUtils.isEmpty(strNOt2)) {
                                            zRu.Mm = fZRu2;
                                            zRu.ZRu(strNOt2, enumC0453ZRu3, nOt2);
                                            iNOt = i18;
                                            zRu2 = zRu;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            mZVar2 = mZVar3;
                                            i15 = 3;
                                            i16 = 2;
                                        } else {
                                            TFq.ZRu(xmlPullParser, "StaticResource", 3);
                                            iNOt = i18;
                                            zRu2 = zRu;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            i16 = 2;
                                            i15 = 3;
                                            mZVar2 = mZVar3;
                                        }
                                        break;
                                    case 4:
                                        zRu2.ZRu(TFq.NOt(xmlPullParser, "CompanionClickTracking"));
                                        iNOt = i18;
                                        iNOt2 = i17;
                                        f12 = f13;
                                        mZVar2 = mZVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                    case 5:
                                        ZRu.NOt nOt3 = ZRu.NOt.HTML_RESOURCE;
                                        Point pointZRu3 = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.ZRu(context, i18, i17, nOt3);
                                        int i21 = pointZRu3.x;
                                        int i22 = pointZRu3.y;
                                        ZRu.EnumC0453ZRu enumC0453ZRu4 = ZRu.EnumC0453ZRu.NONE;
                                        zRu = zRu2;
                                        float fZRu3 = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu(i13, i14, i21, i22, nOt3, enumC0453ZRu4);
                                        String strNOt3 = TFq.NOt(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strNOt3) && fZRu3 > zRu.Mm && fZRu3 > f13) {
                                            zRu.Mm = fZRu3;
                                            zRu.ZRu(strNOt3, enumC0453ZRu4, nOt3);
                                            iNOt = i18;
                                            zRu2 = zRu;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            mZVar2 = mZVar3;
                                            i15 = 3;
                                            i16 = 2;
                                        } else {
                                            TFq.ZRu(xmlPullParser, "HTMLResource", 3);
                                            iNOt = i18;
                                            zRu2 = zRu;
                                            iNOt2 = i17;
                                            f12 = f13;
                                            mZVar2 = mZVar3;
                                            i16 = 2;
                                            i15 = 3;
                                        }
                                        break;
                                    default:
                                        TFq.ZRu(xmlPullParser);
                                        zRu = zRu2;
                                        iNOt = i18;
                                        zRu2 = zRu;
                                        iNOt2 = i17;
                                        f12 = f13;
                                        mZVar2 = mZVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                }
                            } else {
                                iNOt = i18;
                                iNOt2 = i17;
                            }
                        } else if (!TextUtils.isEmpty(zRu2.ZRu) && zRu2.Mm >= f12) {
                            com.bytedance.sdk.openadsdk.core.lp.mZ mZVar4 = new com.bytedance.sdk.openadsdk.core.lp.mZ(iNOt, iNOt2, zRu2.NOt, zRu2.mZ, zRu2.ZRu, zRu2.TFq, zRu2.Ht, zRu2.uR);
                            f12 = zRu2.Mm;
                            mZVar2 = mZVar4;
                        }
                    }
                }
            } else {
                f10 = f12;
                mZVar = mZVar2;
                f12 = f10;
                mZVar2 = mZVar;
            }
        }
    }
}
