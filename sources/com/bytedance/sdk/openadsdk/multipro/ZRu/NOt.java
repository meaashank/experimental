package com.bytedance.sdk.openadsdk.multipro.ZRu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.TFq;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements com.bytedance.sdk.openadsdk.multipro.ZRu {
    private static final Object NOt = new Object();
    private Context ZRu;

    private boolean NOt(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    @NonNull
    public String ZRu() {
        return "t_db";
    }

    private Context NOt() {
        Context context = this.ZRu;
        return context == null ? WMI.ZRu() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Cursor ZRu(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (NOt) {
            try {
                if (NOt(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return TFq.ZRu(NOt()).ZRu().ZRu(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu(@NonNull Uri uri) {
        synchronized (NOt) {
            try {
                if (NOt(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                TFq.ZRu(NOt()).ZRu().ZRu(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            TFq.ZRu(NOt()).ZRu().NOt();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            TFq.ZRu(NOt()).ZRu().mZ();
                        } else if ("transactionEnd".equals(str2)) {
                            TFq.ZRu(NOt()).ZRu().uR();
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Uri ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (NOt) {
            try {
                if (NOt(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        TFq.ZRu(NOt()).ZRu().ZRu(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (NOt) {
            try {
                if (NOt(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return TFq.ZRu(NOt()).ZRu().ZRu(str3, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (NOt) {
            try {
                if (NOt(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return TFq.ZRu(NOt()).ZRu().ZRu(str3, contentValues, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }
}
