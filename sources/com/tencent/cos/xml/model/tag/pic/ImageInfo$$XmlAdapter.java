package com.tencent.cos.xml.model.tag.pic;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import t1.b;
import zb.InterfaceC5876a;
import zb.InterfaceC5877b;

/* JADX INFO: loaded from: classes7.dex */
public class ImageInfo$$XmlAdapter implements InterfaceC5877b<ImageInfo> {
    private HashMap<String, InterfaceC5876a<ImageInfo>> childElementBinders;

    public ImageInfo$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<ImageInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Format", new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(HttpHeaders.WIDTH, new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Height", new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.3
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Quality", new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.4
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.quality = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Ave", new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.5
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.ave = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(b.f238676C, new InterfaceC5876a<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.6
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.orientation = Integer.parseInt(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public ImageInfo fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        ImageInfo imageInfo = new ImageInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<ImageInfo> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, imageInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "ImageInfo" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imageInfo;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, ImageInfo imageInfo, String str) throws XmlPullParserException, IOException {
        if (imageInfo == null) {
            return;
        }
        if (str == null) {
            str = "ImageInfo";
        }
        xmlSerializer.startTag("", str);
        if (imageInfo.format != null) {
            xmlSerializer.startTag("", "Format");
            xmlSerializer.text(String.valueOf(imageInfo.format));
            xmlSerializer.endTag("", "Format");
        }
        xmlSerializer.startTag("", HttpHeaders.WIDTH);
        xmlSerializer.text(String.valueOf(imageInfo.width));
        xmlSerializer.endTag("", HttpHeaders.WIDTH);
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(imageInfo.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", "Quality");
        xmlSerializer.text(String.valueOf(imageInfo.quality));
        xmlSerializer.endTag("", "Quality");
        if (imageInfo.ave != null) {
            xmlSerializer.startTag("", "Ave");
            xmlSerializer.text(String.valueOf(imageInfo.ave));
            xmlSerializer.endTag("", "Ave");
        }
        xmlSerializer.startTag("", b.f238676C);
        xmlSerializer.text(String.valueOf(imageInfo.orientation));
        xmlSerializer.endTag("", b.f238676C);
        xmlSerializer.endTag("", str);
    }
}
