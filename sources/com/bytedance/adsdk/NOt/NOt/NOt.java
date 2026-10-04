package com.bytedance.adsdk.NOt.NOt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.NOt.Ht.Ht;
import com.bytedance.adsdk.NOt.aT;
import com.bytedance.adsdk.NOt.uR;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.Map;
import zd.b;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static final Object ZRu = new Object();
    private final Context NOt;
    private final Map<String, aT> TFq;
    private final String mZ;
    private uR uR;

    public NOt(Drawable.Callback callback, String str, uR uRVar, Map<String, aT> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.mZ = str;
        } else {
            this.mZ = str.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        this.TFq = map;
        ZRu(uRVar);
        if (callback instanceof View) {
            this.NOt = ((View) callback).getContext().getApplicationContext();
        } else {
            this.NOt = null;
        }
    }

    private Bitmap NOt(String str, Bitmap bitmap) {
        synchronized (ZRu) {
            this.TFq.get(str).ZRu(bitmap);
        }
        return bitmap;
    }

    public void ZRu(uR uRVar) {
        this.uR = uRVar;
    }

    public Bitmap ZRu(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapAT = this.TFq.get(str).aT();
            NOt(str, bitmap);
            return bitmapAT;
        }
        aT aTVar = this.TFq.get(str);
        Bitmap bitmapAT2 = aTVar.aT();
        aTVar.ZRu(null);
        return bitmapAT2;
    }

    public Bitmap ZRu(String str) {
        aT aTVar = this.TFq.get(str);
        if (aTVar == null) {
            return null;
        }
        Bitmap bitmapAT = aTVar.aT();
        if (bitmapAT != null) {
            return bitmapAT;
        }
        uR uRVar = this.uR;
        if (uRVar != null) {
            return uRVar.ZRu(aTVar);
        }
        Context context = this.NOt;
        if (context == null) {
            return null;
        }
        String strFA = aTVar.FA();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strFA.startsWith(b.f241358c) && strFA.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strFA.substring(strFA.indexOf(44) + 1), 0);
                return NOt(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.mZ)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.mZ + strFA), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return NOt(str, Ht.ZRu(bitmapDecodeStream, aTVar.ZRu(), aTVar.NOt()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean ZRu(Context context) {
        return (context == null && this.NOt == null) || this.NOt.equals(context);
    }
}
