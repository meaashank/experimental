package com.tencent.cos.xml.model.tag.pic;

import com.tencent.cos.xml.model.tag.pic.QRCodeInfo;
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
public class QRCodeInfo$$XmlAdapter implements InterfaceC5877b<QRCodeInfo> {
    private HashMap<String, InterfaceC5876a<QRCodeInfo>> childElementBinders;

    public QRCodeInfo$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<QRCodeInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("CodeUrl", new InterfaceC5876a<QRCodeInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeInfo$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, QRCodeInfo qRCodeInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                qRCodeInfo.codeUrl = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodeLocation", new InterfaceC5876a<QRCodeInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeInfo$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, QRCodeInfo qRCodeInfo, String str) throws XmlPullParserException, IOException {
                if (qRCodeInfo.codeLocation == null) {
                    qRCodeInfo.codeLocation = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        qRCodeInfo.codeLocation.add((QRCodeInfo.QRCodePoint) C5878c.d(xmlPullParser, QRCodeInfo.QRCodePoint.class, "Point"));
                    } else if (eventType == 3 && "CodeLocation".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public QRCodeInfo fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        QRCodeInfo qRCodeInfo = new QRCodeInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<QRCodeInfo> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, qRCodeInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "QRcodeInfo" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return qRCodeInfo;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, QRCodeInfo qRCodeInfo, String str) throws XmlPullParserException, IOException {
        if (qRCodeInfo == null) {
            return;
        }
        if (str == null) {
            str = "QRcodeInfo";
        }
        xmlSerializer.startTag("", str);
        if (qRCodeInfo.codeUrl != null) {
            xmlSerializer.startTag("", "CodeUrl");
            xmlSerializer.text(String.valueOf(qRCodeInfo.codeUrl));
            xmlSerializer.endTag("", "CodeUrl");
        }
        xmlSerializer.startTag("", "CodeLocation");
        if (qRCodeInfo.codeLocation != null) {
            for (int i10 = 0; i10 < qRCodeInfo.codeLocation.size(); i10++) {
                C5878c.h(xmlSerializer, qRCodeInfo.codeLocation.get(i10), "CodeLocation");
            }
        }
        xmlSerializer.endTag("", "CodeLocation");
        xmlSerializer.endTag("", str);
    }
}
