package com.bytedance.sdk.openadsdk.multipro.mZ;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.e;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Ht.ZRu.Ht;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.multipro.uR;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements com.bytedance.sdk.openadsdk.multipro.ZRu {
    public static boolean NOt() {
        if (WMI.ZRu() == null) {
            return false;
        }
        try {
            Ht htUR = uR();
            if (htUR != null) {
                return "true".equals(htUR.ZRu(Uri.parse(TFq() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String TFq() {
        return e.a(new StringBuilder(), uR.NOt, "/t_frequent/");
    }

    public static String mZ() {
        if (WMI.ZRu() == null) {
            return null;
        }
        try {
            Ht htUR = uR();
            if (htUR != null) {
                return htUR.ZRu(Uri.parse(TFq() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static Ht uR() {
        try {
            if (WMI.ZRu() != null) {
                return com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Cursor ZRu(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Uri ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean ZRu(String str) {
        if (WMI.ZRu() == null) {
            return false;
        }
        try {
            Ht htUR = uR();
            if (htUR != null) {
                return "true".equals(htUR.ZRu(Uri.parse(TFq() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    @NonNull
    public String ZRu() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Mm.ZRu.ZRu().ZRu(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Mm.ZRu.ZRu().NOt() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Mm.ZRu.ZRu().mZ();
        }
        return null;
    }
}
