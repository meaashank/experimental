package com.tencent.cos.xml.model.tag.pic;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import zb.C5878c;
import zb.InterfaceC5876a;
import zb.InterfaceC5877b;

/* JADX INFO: loaded from: classes7.dex */
public class PicOriginalInfo$$XmlAdapter implements InterfaceC5877b<PicOriginalInfo> {
    private HashMap<String, InterfaceC5876a<PicOriginalInfo>> childElementBinders;

    public PicOriginalInfo$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<PicOriginalInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new InterfaceC5876a<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new InterfaceC5876a<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ETag", new InterfaceC5876a<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.3
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.etag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ImageInfo", new InterfaceC5876a<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.4
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws XmlPullParserException, IOException {
                picOriginalInfo.imageInfo = (ImageInfo) C5878c.d(xmlPullParser, ImageInfo.class, "ImageInfo");
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public PicOriginalInfo fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        PicOriginalInfo picOriginalInfo = new PicOriginalInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<PicOriginalInfo> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, picOriginalInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "OriginalInfo" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picOriginalInfo;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, PicOriginalInfo picOriginalInfo, String str) throws XmlPullParserException, IOException {
        if (picOriginalInfo == null) {
            return;
        }
        if (str == null) {
            str = "OriginalInfo";
        }
        xmlSerializer.startTag("", str);
        if (picOriginalInfo.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(picOriginalInfo.key));
            xmlSerializer.endTag("", "Key");
        }
        if (picOriginalInfo.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(picOriginalInfo.location));
            xmlSerializer.endTag("", "Location");
        }
        if (picOriginalInfo.etag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(picOriginalInfo.etag));
            xmlSerializer.endTag("", "ETag");
        }
        ImageInfo imageInfo = picOriginalInfo.imageInfo;
        if (imageInfo != null) {
            C5878c.h(xmlSerializer, imageInfo, "ImageInfo");
        }
        xmlSerializer.endTag("", str);
    }
}
