package com.bytedance.sdk.component.adexpress.dynamic.uR;

import D3.a;
import D3.b;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    public static final Map<String, Integer> ZRu;
    private String Ht;
    private String NOt;
    private Ht TFq;
    private String mZ;
    private Ht uR;

    static {
        HashMap map = new HashMap();
        ZRu = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        b.a(map, "text", 0, 17, "tag-group");
        map.put("app-version", 0);
        b.a(map, "development-name", 0, 23, "privacy-detail");
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        b.a(map, "icon-download", 1, 4, "logoad");
        a.a(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 3);
        map.put("close-fill", 3);
        a.a(22, map, "webview-close", 12, "feedback-dislike");
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        b.a(map, "custom-component-vessel", 6, 24, "carousel");
        a.a(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        b.a(map, "video-sq", 7, 10, "muted");
        a.a(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        a.a(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        b.a(map, "skip-with-time-countdown", 13, 15, "skip-with-time-skip-btn");
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        b.a(map, "score-count-type-2", 0, 28, "lottie");
    }

    public int Ht() {
        return this.uR.FFX();
    }

    public Ht Mm() {
        return this.TFq;
    }

    public String NOt() {
        return this.NOt;
    }

    public Ht TFq() {
        return this.uR;
    }

    public int ZRu() {
        if (TextUtils.isEmpty(this.NOt)) {
            return 0;
        }
        if (this.NOt.equals("logo")) {
            String str = this.NOt + this.mZ;
            this.NOt = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.NOt.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = ZRu;
        if (map.get(this.NOt) != null) {
            return map.get(this.NOt).intValue();
        }
        return -1;
    }

    public String mZ() {
        return this.mZ;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutBrick{type='");
        sb2.append(this.NOt);
        sb2.append("', data='");
        sb2.append(this.mZ);
        sb2.append("', value=");
        sb2.append(this.uR);
        sb2.append(", themeValue=");
        sb2.append(this.TFq);
        sb2.append(", dataExtraInfo='");
        return e.a(sb2, this.Ht, "'}");
    }

    public String uR() {
        return this.Ht;
    }

    public void NOt(String str) {
        this.mZ = str;
    }

    public void mZ(String str) {
        this.Ht = str;
    }

    public void NOt(Ht ht) {
        this.TFq = ht;
    }

    public void ZRu(String str) {
        this.NOt = str;
    }

    public void ZRu(Ht ht) {
        this.uR = ht;
    }
}
