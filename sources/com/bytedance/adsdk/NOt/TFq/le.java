package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt.Vor;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class le {
    public static com.bytedance.adsdk.NOt.mZ.NOt.Vor ZRu(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        Vor.ZRu ZRu = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    ZRu = Vor.ZRu.ZRu(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.NOt.mZ.NOt.Vor(strNextString, ZRu, zNextBoolean);
    }
}
