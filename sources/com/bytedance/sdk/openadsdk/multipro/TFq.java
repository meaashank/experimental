package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements ZRu {
    private static WeakReference<Context> NOt;
    private static volatile TFq ZRu;
    private static final List<ZRu> mZ;

    static {
        List<ZRu> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        mZ = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.uR.mZ());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.ZRu.NOt());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.mZ.ZRu());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.uR.ZRu.TFq(new com.bytedance.sdk.component.Ht.ZRu.NOt.NOt.NOt()));
        Iterator<ZRu> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private TFq() {
    }

    private ZRu NOt(Uri uri) {
        if (uri == null || !mZ(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (ZRu zRu : mZ) {
            if (str.equals(zRu.ZRu())) {
                return zRu;
            }
        }
        return null;
    }

    public static TFq ZRu(Context context) {
        if (context != null) {
            NOt = new WeakReference<>(context.getApplicationContext());
        }
        if (ZRu == null) {
            synchronized (TFq.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new TFq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    private boolean mZ(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    @NonNull
    public String ZRu() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Cursor ZRu(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            ZRu zRuNOt = NOt(uri);
            if (zRuNOt != null) {
                return zRuNOt.ZRu(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public String ZRu(@NonNull Uri uri) {
        try {
            ZRu zRuNOt = NOt(uri);
            if (zRuNOt != null) {
                return zRuNOt.ZRu(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public Uri ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            ZRu zRuNOt = NOt(uri);
            if (zRuNOt != null) {
                return zRuNOt.ZRu(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            ZRu zRuNOt = NOt(uri);
            if (zRuNOt != null) {
                return zRuNOt.ZRu(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ZRu
    public int ZRu(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            ZRu zRuNOt = NOt(uri);
            if (zRuNOt != null) {
                return zRuNOt.ZRu(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
