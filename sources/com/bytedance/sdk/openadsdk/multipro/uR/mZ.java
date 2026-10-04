package com.bytedance.sdk.openadsdk.multipro.uR;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements com.bytedance.sdk.openadsdk.multipro.ZRu {
    private Context ZRu;

    private Context NOt() {
        Context context = this.ZRu;
        return context == null ? WMI.ZRu() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    @NonNull
    public String ZRu() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Cursor ZRu(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> mapMZ;
        if (!uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[2].equals("get_all") || (mapMZ = NOt.mZ(NOt(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapMZ.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapMZ.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = x.b.f238265f;
            } else if (obj instanceof String) {
                objArr[1] = x.b.f238264e;
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = x.b.f238262c;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(NOt.ZRu(WMI.ZRu(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return NOt.ZRu(NOt(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Uri ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING)[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            NOt.ZRu(NOt(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        if (strArrSplit[2].equals("clean")) {
            NOt.NOt(NOt(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (NOt.ZRu(NOt(), uri.getQueryParameter("sp_file_name"), str2)) {
            NOt.NOt(NOt(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        ZRu(uri, contentValues);
        return 0;
    }
}
