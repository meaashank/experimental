package com.tencent.cos.xml.model.tag.pic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import zb.C5878c;
import zb.InterfaceC5876a;
import zb.InterfaceC5877b;

/* JADX INFO: loaded from: classes7.dex */
public class PicUploadResult$$XmlAdapter implements InterfaceC5877b<PicUploadResult> {
    private HashMap<String, InterfaceC5876a<PicUploadResult>> childElementBinders;

    public PicUploadResult$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<PicUploadResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("OriginalInfo", new InterfaceC5876a<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult, String str) throws XmlPullParserException, IOException {
                picUploadResult.originalInfo = (PicOriginalInfo) C5878c.d(xmlPullParser, PicOriginalInfo.class, "OriginalInfo");
            }
        });
        this.childElementBinders.put("ProcessResults", new InterfaceC5876a<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult, String str) throws XmlPullParserException, IOException {
                if (picUploadResult.processResults == null) {
                    picUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        picUploadResult.processResults.add((PicObject) C5878c.d(xmlPullParser, PicObject.class, "Object"));
                    } else if (eventType == 3 && "ProcessResults".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public PicUploadResult fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        PicUploadResult picUploadResult = new PicUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<PicUploadResult> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, picUploadResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "UploadResult" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picUploadResult;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, PicUploadResult picUploadResult, String str) throws XmlPullParserException, IOException {
        if (picUploadResult == null) {
            return;
        }
        if (str == null) {
            str = "UploadResult";
        }
        xmlSerializer.startTag("", str);
        PicOriginalInfo picOriginalInfo = picUploadResult.originalInfo;
        if (picOriginalInfo != null) {
            C5878c.h(xmlSerializer, picOriginalInfo, "OriginalInfo");
        }
        xmlSerializer.startTag("", "ProcessResults");
        if (picUploadResult.processResults != null) {
            for (int i10 = 0; i10 < picUploadResult.processResults.size(); i10++) {
                C5878c.h(xmlSerializer, picUploadResult.processResults.get(i10), "ProcessResults");
            }
        }
        xmlSerializer.endTag("", "ProcessResults");
        xmlSerializer.endTag("", str);
    }
}
