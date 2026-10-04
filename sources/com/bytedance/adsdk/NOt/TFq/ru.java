package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt.FA;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ru {
    public static com.bytedance.adsdk.NOt.mZ.NOt.FA ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        FA.ZRu zRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.FA faTFq = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVarNOt = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    uRVarNOt = uR.NOt(jsonReader, mm);
                    break;
                case "pt":
                    faTFq = uR.TFq(jsonReader, mm);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            zRu = FA.ZRu.MASK_MODE_ADD;
                            break;
                        case "i":
                            mm.ZRu("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            zRu = FA.ZRu.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            zRu = FA.ZRu.MASK_MODE_NONE;
                            break;
                        case "s":
                            zRu = FA.ZRu.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            zRu = FA.ZRu.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.NOt.mZ.NOt.FA(zRu, faTFq, uRVarNOt, zNextBoolean);
    }
}
