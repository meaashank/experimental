package com.tencent.cos.xml.model.tag.pic;

import com.google.common.net.HttpHeaders;
import com.tonyodev.fetch2core.server.FileRequest;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import zb.InterfaceC5876a;
import zb.InterfaceC5877b;

/* JADX INFO: loaded from: classes7.dex */
public class PicObject$$XmlAdapter implements InterfaceC5877b<PicObject> {
    private HashMap<String, InterfaceC5876a<PicObject>> childElementBinders;

    public PicObject$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<PicObject>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Format", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.3
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(HttpHeaders.WIDTH, new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.4
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Height", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.5
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(FileRequest.FIELD_SIZE, new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.6
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.size = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Quality", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.7
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.quality = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("ETag", new InterfaceC5876a<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.8
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.etag = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zb.InterfaceC5877b
    public PicObject fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        PicObject picObject = new PicObject();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<PicObject> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, picObject, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "Object" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picObject;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, PicObject picObject, String str) throws XmlPullParserException, IOException {
        if (picObject == null) {
            return;
        }
        if (str == null) {
            str = "Object";
        }
        xmlSerializer.startTag("", str);
        if (picObject.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(picObject.key));
            xmlSerializer.endTag("", "Key");
        }
        if (picObject.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(picObject.location));
            xmlSerializer.endTag("", "Location");
        }
        if (picObject.format != null) {
            xmlSerializer.startTag("", "Format");
            xmlSerializer.text(String.valueOf(picObject.format));
            xmlSerializer.endTag("", "Format");
        }
        xmlSerializer.startTag("", HttpHeaders.WIDTH);
        xmlSerializer.text(String.valueOf(picObject.width));
        xmlSerializer.endTag("", HttpHeaders.WIDTH);
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(picObject.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", FileRequest.FIELD_SIZE);
        xmlSerializer.text(String.valueOf(picObject.size));
        xmlSerializer.endTag("", FileRequest.FIELD_SIZE);
        xmlSerializer.startTag("", "Quality");
        xmlSerializer.text(String.valueOf(picObject.quality));
        xmlSerializer.endTag("", "Quality");
        if (picObject.etag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(picObject.etag));
            xmlSerializer.endTag("", "ETag");
        }
        xmlSerializer.endTag("", str);
    }
}
