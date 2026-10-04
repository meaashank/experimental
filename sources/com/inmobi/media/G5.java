package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class G5 extends W8 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AdQualityResult f151978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f151979z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G5(AdQualityResult result, C3686pc uidMap, AdConfig.AdQualityConfig config) {
        super("POST", result.getBeaconUrl(), uidMap, false, (N4) null, "application/json", 64);
        kotlin.jvm.internal.G.p(result, "result");
        kotlin.jvm.internal.G.p(uidMap, "uidMap");
        kotlin.jvm.internal.G.p(config, "config");
        this.f151978y = result;
        this.f151979z = config;
    }

    @Override // com.inmobi.media.W8
    public final void f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Log.i("JsonBeaconRequest", "preparing beacon request");
        this.f152571t = false;
        this.f152572u = false;
        this.f152575x = false;
        this.f152573v = false;
        super.f();
        Log.i("JsonBeaconRequest", "getScreenshot");
        if (this.f151978y.getImageLocation().length() > 0) {
            Log.i("JsonBeaconRequest", "screen shot image found in DB");
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f151978y.getImageLocation());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapDecodeFile != null) {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.G.o(byteArray, "toByteArray(...)");
                if (!(byteArray.length == 0) && (jSONObject2 = this.f152563l) != null) {
                    jSONObject2.put("screenshotImageByte", Base64.encodeToString(byteArray, 0));
                }
            } catch (FileNotFoundException e10) {
                Log.e("JsonBeaconRequest", "image file not found...", e10);
                Log.i("JsonBeaconRequest", "result produced no screenshot");
            }
        } else {
            Log.i("JsonBeaconRequest", "result produced no screenshot");
        }
        Log.i("JsonBeaconRequest", "getExtras");
        try {
        } catch (JSONException e11) {
            Log.e("JsonBeaconRequest", "error while adding extras", e11);
        }
        if (AbstractC3620l2.a(this.f151978y.getExtras())) {
            String extras = this.f151978y.getExtras();
            if (extras != null && (jSONObject = this.f152563l) != null) {
                jSONObject.put("templateInfo", new JSONObject(extras));
            }
        } else {
            Log.i("JsonBeaconRequest", "result has no extras");
        }
        Log.i("JsonBeaconRequest", "getExtras");
        if (!AbstractC3620l2.a(this.f151978y.getSdkModelResult())) {
            Log.i("JsonBeaconRequest", "result has no model info");
            return;
        }
        JSONObject jSONObject3 = this.f152563l;
        if (jSONObject3 != null) {
            jSONObject3.put("sdkModelInfo", this.f151978y.getSdkModelResult());
        }
    }
}
