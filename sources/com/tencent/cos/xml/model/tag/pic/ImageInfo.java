package com.tencent.cos.xml.model.tag.pic;

import com.google.common.net.HttpHeaders;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import t1.b;

/* JADX INFO: loaded from: classes7.dex */
@XmlBean(name = "ImageInfo")
public class ImageInfo {

    @XmlElement(name = "Ave")
    public String ave;

    @XmlElement(name = "Format")
    public String format;

    @XmlElement(name = "Height")
    public int height;

    @XmlElement(name = b.f238676C)
    public int orientation;

    @XmlElement(name = "Quality")
    public int quality;

    @XmlElement(name = HttpHeaders.WIDTH)
    public int width;
}
