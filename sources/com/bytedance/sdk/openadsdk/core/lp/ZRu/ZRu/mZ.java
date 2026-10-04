package com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu.TFq;
import com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.prism.gaia.server.accounts.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    public static double NOt(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (TFq.NOt(xmlPullParser, "Duration").split(b.f166434b0).length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * 3600) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void ZRu(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu, int i10, double d10) throws XmlPullParserException, IOException {
        boolean z10 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z10 && TextUtils.isEmpty(zRu.Mm())) {
                        TFq.ZRu(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            ZRu(xmlPullParser, zRu);
                            break;
                        case "Duration":
                            zRu.ZRu(NOt(xmlPullParser));
                            break;
                        case "MediaFiles":
                            ZRu(xmlPullParser, i10, d10, zRu);
                            z10 = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.lp.NOt nOtZRu = ZRu(xmlPullParser);
                            if (nOtZRu != null && zRu.NOt() == null) {
                                zRu.ZRu(nOtZRu);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            ZRu(xmlPullParser, zRu.ZRu());
                            break;
                        default:
                            TFq.ZRu(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> mZ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return TFq.ZRu(xmlPullParser, "Tracking");
    }

    private static String ZRu(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu) throws XmlPullParserException, IOException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = TFq.Mm;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iNOt = TFq.NOt(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.WIDTH));
                int iNOt2 = TFq.NOt(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.HEIGHT));
                int iNOt3 = TFq.NOt(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strNOt = TFq.NOt(xmlPullParser, "MediaFile");
                if (iNOt > 0 && iNOt2 > 0 && com.bytedance.sdk.openadsdk.core.lp.mZ.uR.ZRu.contains(attributeValue) && !TextUtils.isEmpty(strNOt)) {
                    double dZRu = com.bytedance.sdk.openadsdk.core.lp.mZ.uR.ZRu(i10, d10, iNOt, iNOt2, iNOt3, attributeValue);
                    if (dZRu > d11) {
                        str = strNOt;
                        d11 = dZRu;
                        i11 = iNOt;
                        i12 = iNOt2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            zRu.uR(str);
            zRu.ZRu(i11);
            zRu.NOt(i12);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.sdk.openadsdk.core.lp.NOt ZRu(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.lp.NOt nOt;
        com.bytedance.sdk.openadsdk.core.lp.NOt nOt2;
        int i10;
        int i11;
        int i12;
        ZRu.EnumC0453ZRu enumC0453ZRu;
        com.bytedance.sdk.openadsdk.core.lp.NOt nOt3 = null;
        while (true) {
            int i13 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return nOt3;
            }
            xmlPullParser.next();
            int i14 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = TFq.Mm;
                int iNOt = TFq.NOt(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.WIDTH));
                int iNOt2 = TFq.NOt(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.HEIGHT));
                if (iNOt > 0 && iNOt <= 300 && iNOt2 > 0 && iNOt2 <= 300) {
                    int iZRu = com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu.ZRu(xmlPullParser.getAttributeValue(str, x.c.f238293R));
                    int iZRu2 = com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu.ZRu(xmlPullParser.getAttributeValue(str, x.h.f238399b));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    TFq.ZRu zRu = null;
                    String strNOt = null;
                    while (true) {
                        if (xmlPullParser.next() == i13 && xmlPullParser.getName().equals("Icon")) {
                            if (zRu != null && (nOt3 == null || TextUtils.isEmpty(nOt3.Ht()))) {
                                nOt3 = new com.bytedance.sdk.openadsdk.core.lp.NOt(iNOt, iNOt2, iZRu, iZRu2, zRu.NOt, zRu.mZ, zRu.ZRu, arrayList, arrayList2, strNOt);
                                TFq.ZRu(xmlPullParser, "Icons", i13);
                            }
                        } else {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i14) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                nOt2 = nOt3;
                                i10 = iZRu2;
                                switch (name) {
                                    case "IconViewTracking":
                                        i11 = 3;
                                        i12 = 2;
                                        arrayList4.add(new mZ.ZRu(TFq.NOt(xmlPullParser, "IconViewTracking")).ZRu());
                                        break;
                                    case "IFrameResource":
                                        i11 = 3;
                                        i12 = 2;
                                        if (zRu == null) {
                                            zRu = new TFq.ZRu(TFq.NOt(xmlPullParser, "IFrameResource"), ZRu.EnumC0453ZRu.NONE, ZRu.NOt.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            TFq.ZRu(xmlPullParser);
                                            break;
                                        }
                                        break;
                                    case "StaticResource":
                                        i11 = 3;
                                        i12 = 2;
                                        ZRu.EnumC0453ZRu enumC0453ZRu2 = ZRu.EnumC0453ZRu.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(TFq.Mm, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.ZRu;
                                        String strNOt2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu.NOt.contains(lowerCase)) ? TFq.NOt(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0453ZRu = ZRu.EnumC0453ZRu.IMAGE;
                                        } else {
                                            enumC0453ZRu = ZRu.EnumC0453ZRu.JAVASCRIPT;
                                        }
                                        zRu = new TFq.ZRu(strNOt2, enumC0453ZRu, ZRu.NOt.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i11 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i12 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strNOt = TFq.NOt(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new mZ.ZRu(TFq.NOt(xmlPullParser, "IconClickTracking")).ZRu());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (zRu == null || zRu.mZ == ZRu.NOt.IFRAME_RESOURCE) {
                                            zRu = new TFq.ZRu(TFq.NOt(xmlPullParser, "HTMLResource"), ZRu.EnumC0453ZRu.NONE, ZRu.NOt.HTML_RESOURCE);
                                            nOt3 = nOt2;
                                            iZRu2 = i10;
                                            i13 = 3;
                                            i14 = 2;
                                            break;
                                        }
                                        i11 = 3;
                                        i12 = 2;
                                        TFq.ZRu(xmlPullParser);
                                        break;
                                    default:
                                        i11 = 3;
                                        i12 = 2;
                                        TFq.ZRu(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                nOt2 = nOt3;
                                i10 = iZRu2;
                                i11 = i13;
                                i12 = i14;
                            }
                            i13 = i11;
                            i14 = i12;
                            nOt3 = nOt2;
                            iZRu2 = i10;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                } else {
                    nOt = nOt3;
                    TFq.ZRu(xmlPullParser);
                    nOt3 = nOt;
                }
            } else {
                nOt = nOt3;
                nOt3 = nOt;
            }
        }
    }

    public static void ZRu(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.lp.uR uRVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(TFq.Mm, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        TFq.ZRu(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                uRVar.ZRu(TFq.NOt(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                uRVar.ZRu(TFq.NOt(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                uRVar.mZ(mZ(xmlPullParser));
                                break;
                            case "unmute":
                                uRVar.lp(mZ(xmlPullParser));
                                break;
                            case "complete":
                                uRVar.uR(mZ(xmlPullParser));
                                break;
                            case "mute":
                                uRVar.ZH(mZ(xmlPullParser));
                                break;
                            case "skip":
                                uRVar.Ht(mZ(xmlPullParser));
                                break;
                            case "close":
                                uRVar.TFq(mZ(xmlPullParser));
                                break;
                            case "pause":
                                uRVar.NOt(mZ(xmlPullParser));
                                break;
                            case "start":
                            case "creativeView":
                                uRVar.ZRu(TFq.NOt(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                uRVar.ZRu(TFq.NOt(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    TFq.ZRu(xmlPullParser);
                }
            }
        }
    }

    private static void ZRu(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    zRu.mZ(TFq.NOt(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    TFq.ZRu(xmlPullParser);
                } else {
                    zRu.ZRu().Mm(TFq.ZRu(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }
}
