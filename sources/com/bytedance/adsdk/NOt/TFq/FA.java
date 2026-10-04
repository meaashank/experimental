package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class FA {
    public static com.bytedance.adsdk.NOt.mZ.NOt.mZ ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        com.bytedance.adsdk.NOt.mZ.NOt.mZ mZVarZRu;
        String strNextString;
        jsonReader.beginObject();
        int iNextInt = 2;
        while (true) {
            mZVarZRu = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString) {
            case "el":
                mZVarZRu = Ht.ZRu(jsonReader, mm, iNextInt);
                break;
            case "fl":
                mZVarZRu = gI.ZRu(jsonReader, mm);
                break;
            case "gf":
                mZVarZRu = yBV.ZRu(jsonReader, mm);
                break;
            case "gr":
                mZVarZRu = Ho.ZRu(jsonReader, mm);
                break;
            case "gs":
                mZVarZRu = WMI.ZRu(jsonReader, mm);
                break;
            case "mm":
                mZVarZRu = le.ZRu(jsonReader);
                mm.ZRu("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                mZVarZRu = th.ZRu(jsonReader, mm);
                break;
            case "rd":
                mZVarZRu = fWk.ZRu(jsonReader, mm);
                break;
            case "rp":
                mZVarZRu = WD.ZRu(jsonReader, mm);
                break;
            case "sh":
                mZVarZRu = bO.ZRu(jsonReader, mm);
                break;
            case "sr":
                mZVarZRu = VdW.ZRu(jsonReader, mm, iNextInt);
                break;
            case "st":
                mZVarZRu = AK.ZRu(jsonReader, mm);
                break;
            case "tm":
                mZVarZRu = Vr.ZRu(jsonReader, mm);
                break;
            case "tr":
                mZVarZRu = mZ.ZRu(jsonReader, mm);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return mZVarZRu;
    }
}
