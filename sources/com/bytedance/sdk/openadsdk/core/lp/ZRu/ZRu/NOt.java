package com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static com.bytedance.sdk.openadsdk.core.lp.ZRu ZRu(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list, int i10, double d10) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, TFq.Mm, "InLine");
        com.bytedance.sdk.openadsdk.core.lp.ZRu zRu = new com.bytedance.sdk.openadsdk.core.lp.ZRu();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                zRu.ZRu().aT(list);
                return zRu;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        zRu.ZRu(uR.ZRu(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(zRu.Mm()) || zRu.mZ() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        ZRu(context, xmlPullParser, zRu, i10, d10);
                                    } else {
                                        TFq.ZRu(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            TFq.ZRu(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                    case "Description":
                        zRu.NOt(TFq.NOt(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(TFq.ZRu(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i10 = i10;
                                d10 = d10;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    zRu.ZRu(uR.ZRu(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        zRu.ZRu(TFq.NOt(xmlPullParser, name));
                        break;
                    case "Impression":
                        zRu.ZRu().ZRu(TFq.ZRu(xmlPullParser, name));
                        break;
                    default:
                        TFq.ZRu(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i10 = i10;
                        d10 = d10;
                        break;
                }
            }
        }
    }

    public static void ZRu(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.lp.ZRu zRu, int i10, double d10) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(zRu.Mm())) {
                    mZ.ZRu(xmlPullParser, zRu, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && zRu.mZ() == null) {
                    zRu.ZRu(ZRu.ZRu(context, xmlPullParser));
                } else {
                    TFq.ZRu(xmlPullParser);
                }
            }
        }
    }
}
