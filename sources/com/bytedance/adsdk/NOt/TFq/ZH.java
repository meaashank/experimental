package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ZH {
    private com.bytedance.adsdk.NOt.mZ.ZRu.NOt NOt;
    private com.bytedance.adsdk.NOt.mZ.ZRu.NOt TFq;
    private com.bytedance.adsdk.NOt.mZ.ZRu.ZRu ZRu;
    private com.bytedance.adsdk.NOt.mZ.ZRu.NOt mZ;
    private com.bytedance.adsdk.NOt.mZ.ZRu.NOt uR;

    private void NOt(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.uR = uR.ZRu(jsonReader, mm);
                        break;
                    case "Opacity":
                        this.NOt = uR.ZRu(jsonReader, mm, false);
                        break;
                    case "Direction":
                        this.mZ = uR.ZRu(jsonReader, mm, false);
                        break;
                    case "Shadow Color":
                        this.ZRu = uR.Mm(jsonReader, mm);
                        break;
                    case "Softness":
                        this.TFq = uR.ZRu(jsonReader, mm);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals(SearchView.f86146d0)) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public aT ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt3;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    NOt(jsonReader, mm);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRu = this.ZRu;
        if (zRu == null || (nOt = this.NOt) == null || (nOt2 = this.mZ) == null || (nOt3 = this.uR) == null || (nOt4 = this.TFq) == null) {
            return null;
        }
        return new aT(zRu, nOt, nOt2, nOt3, nOt4);
    }
}
