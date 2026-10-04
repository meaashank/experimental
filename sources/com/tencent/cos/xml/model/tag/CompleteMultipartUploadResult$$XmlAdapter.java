package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.model.tag.pic.ImageInfo;
import com.tencent.cos.xml.model.tag.pic.PicObject;
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
public class CompleteMultipartUploadResult$$XmlAdapter implements InterfaceC5877b<CompleteMultipartUploadResult> {
    private HashMap<String, InterfaceC5876a<CompleteMultipartUploadResult>> childElementBinders;

    public CompleteMultipartUploadResult$$XmlAdapter() {
        HashMap<String, InterfaceC5876a<CompleteMultipartUploadResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new InterfaceC5876a<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.1
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new InterfaceC5876a<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.2
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ETag", new InterfaceC5876a<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.3
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.eTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ImageInfo", new InterfaceC5876a<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.4
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
                completeMultipartUploadResult.imageInfo = (ImageInfo) C5878c.d(xmlPullParser, ImageInfo.class, "ImageInfo");
            }
        });
        this.childElementBinders.put("ProcessResults", new InterfaceC5876a<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.5
            @Override // zb.InterfaceC5876a
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
                if (completeMultipartUploadResult.processResults == null) {
                    completeMultipartUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        completeMultipartUploadResult.processResults.add((PicObject) C5878c.d(xmlPullParser, PicObject.class, "Object"));
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
    public CompleteMultipartUploadResult fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        CompleteMultipartUploadResult completeMultipartUploadResult = new CompleteMultipartUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                InterfaceC5876a<CompleteMultipartUploadResult> interfaceC5876a = this.childElementBinders.get(xmlPullParser.getName());
                if (interfaceC5876a != null) {
                    interfaceC5876a.fromXml(xmlPullParser, completeMultipartUploadResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? "CompleteMultipartUploadResult" : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return completeMultipartUploadResult;
    }

    @Override // zb.InterfaceC5877b
    public void toXml(XmlSerializer xmlSerializer, CompleteMultipartUploadResult completeMultipartUploadResult, String str) throws XmlPullParserException, IOException {
        if (completeMultipartUploadResult == null) {
            return;
        }
        if (str == null) {
            str = "CompleteMultipartUploadResult";
        }
        xmlSerializer.startTag("", str);
        if (completeMultipartUploadResult.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.key));
            xmlSerializer.endTag("", "Key");
        }
        if (completeMultipartUploadResult.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.location));
            xmlSerializer.endTag("", "Location");
        }
        if (completeMultipartUploadResult.eTag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.eTag));
            xmlSerializer.endTag("", "ETag");
        }
        ImageInfo imageInfo = completeMultipartUploadResult.imageInfo;
        if (imageInfo != null) {
            C5878c.h(xmlSerializer, imageInfo, "ImageInfo");
        }
        xmlSerializer.startTag("", "ProcessResults");
        if (completeMultipartUploadResult.processResults != null) {
            for (int i10 = 0; i10 < completeMultipartUploadResult.processResults.size(); i10++) {
                C5878c.h(xmlSerializer, completeMultipartUploadResult.processResults.get(i10), "ProcessResults");
            }
        }
        xmlSerializer.endTag("", "ProcessResults");
        xmlSerializer.endTag("", str);
    }
}
