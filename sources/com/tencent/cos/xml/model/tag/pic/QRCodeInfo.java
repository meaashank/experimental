package com.tencent.cos.xml.model.tag.pic;

import android.graphics.Point;
import androidx.annotation.Nullable;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@XmlBean(name = "QRcodeInfo")
public class QRCodeInfo {
    public List<QRCodePoint> codeLocation;
    public String codeUrl;

    @XmlBean(name = "Point")
    public static class QRCodePoint {

        @XmlElement(ignoreName = true)
        public String point;

        @Nullable
        public Point point() {
            String[] strArrSplit = this.point.split(",");
            if (strArrSplit.length == 2) {
                return new Point(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
            }
            return null;
        }
    }
}
