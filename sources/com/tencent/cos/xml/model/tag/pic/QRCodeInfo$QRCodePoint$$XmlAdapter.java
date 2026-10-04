package com.tencent.cos.xml.model.tag.pic;

import com.tencent.cos.xml.model.tag.pic.QRCodeInfo;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import zb.InterfaceC5876a;
import zb.InterfaceC5877b;

/* JADX INFO: loaded from: classes7.dex */
public class QRCodeInfo$QRCodePoint$$XmlAdapter implements InterfaceC5877b<QRCodeInfo.QRCodePoint> {
    private HashMap<String, InterfaceC5876a<QRCodeInfo.QRCodePoint>> childElementBinders;

    public QRCodeInfo$QRCodePoint$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<QRCodeInfo.QRCodePoint>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Point", new InterfaceC5876a<QRCodeInfo.QRCodePoint>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeInfo$QRCodePoint$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, QRCodeInfo.QRCodePoint qRCodePoint, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                qRCodePoint.point = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public QRCodeInfo.QRCodePoint fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        QRCodeInfo.QRCodePoint qRCodePoint = new QRCodeInfo.QRCodePoint();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<QRCodeInfo.QRCodePoint> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, qRCodePoint, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "Point" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return qRCodePoint;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, QRCodeInfo.QRCodePoint qRCodePoint, String str) throws XmlPullParserException, IOException {
        if (qRCodePoint == null) {
            return;
        }
        if (str == null) {
            str = "Point";
        }
        xmlSerializer.startTag("", str);
        String str2 = qRCodePoint.point;
        if (str2 != null) {
            xmlSerializer.text(String.valueOf(str2));
        }
        xmlSerializer.endTag("", str);
    }
}
