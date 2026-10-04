package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Vor implements Qg<com.bytedance.adsdk.NOt.mZ.NOt> {
    public static final Vor ZRu = new Vor();

    private Vor() {
    }

    @Override // com.bytedance.adsdk.NOt.TFq.Qg
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.NOt.mZ.NOt NOt(JsonReader jsonReader, float f10) throws IOException {
        NOt.ZRu zRu = NOt.ZRu.CENTER;
        jsonReader.beginObject();
        NOt.ZRu zRu2 = zRu;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iZRu = 0;
        int iZRu2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    zRu2 = NOt.ZRu.CENTER;
                    if (iNextInt2 <= zRu2.ordinal() && iNextInt2 >= 0) {
                        zRu2 = NOt.ZRu.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iZRu = om.ZRu(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iZRu2 = om.ZRu(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.NOt.mZ.NOt(strNextString, strNextString2, fNextDouble, zRu2, iNextInt, fNextDouble2, fNextDouble3, iZRu, iZRu2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
