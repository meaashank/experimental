package com.bytedance.adsdk.NOt.uR;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.NOt.lp;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FA {
    private final Ht NOt;
    private final Mm ZRu;

    public FA(Mm mm, Ht ht) {
        this.ZRu = mm;
        this.NOt = ht;
    }

    @WorkerThread
    private com.bytedance.adsdk.NOt.Mm NOt(Context context, String str, String str2) {
        Mm mm;
        Pair<mZ, InputStream> pairZRu;
        if (str2 == null || (mm = this.ZRu) == null || (pairZRu = mm.ZRu(str)) == null) {
            return null;
        }
        mZ mZVar = (mZ) pairZRu.first;
        InputStream inputStream = (InputStream) pairZRu.second;
        lp<com.bytedance.adsdk.NOt.Mm> lpVarZRu = mZVar == mZ.ZIP ? com.bytedance.adsdk.NOt.FA.ZRu(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.NOt.FA.NOt(inputStream, str2);
        if (lpVarZRu.ZRu() != null) {
            return lpVarZRu.ZRu();
        }
        return null;
    }

    @WorkerThread
    private lp<com.bytedance.adsdk.NOt.Mm> mZ(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                uR uRVarZRu = this.NOt.ZRu(str);
                if (!uRVarZRu.ZRu()) {
                    lp<com.bytedance.adsdk.NOt.Mm> lpVar = new lp<>(new IllegalArgumentException(uRVarZRu.uR()));
                    try {
                        uRVarZRu.close();
                    } catch (IOException unused) {
                    }
                    return lpVar;
                }
                lp<com.bytedance.adsdk.NOt.Mm> lpVarZRu = ZRu(context, str, uRVarZRu.NOt(), uRVarZRu.mZ(), str2);
                lpVarZRu.ZRu();
                try {
                    uRVarZRu.close();
                } catch (IOException unused2) {
                }
                return lpVarZRu;
            } finally {
            }
        } catch (Exception e10) {
            lp<com.bytedance.adsdk.NOt.Mm> lpVar2 = new lp<>(e10);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused3) {
                }
            }
            return lpVar2;
        }
    }

    @WorkerThread
    public lp<com.bytedance.adsdk.NOt.Mm> ZRu(Context context, String str, String str2) {
        com.bytedance.adsdk.NOt.Mm mmNOt = NOt(context, str, str2);
        return mmNOt != null ? new lp<>(mmNOt) : mZ(context, str, str2);
    }

    private lp<com.bytedance.adsdk.NOt.Mm> ZRu(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        lp<com.bytedance.adsdk.NOt.Mm> lpVarZRu;
        mZ mZVar;
        Mm mm;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            mZVar = mZ.JSON;
            lpVarZRu = ZRu(str, inputStream, str3);
        } else {
            mZ mZVar2 = mZ.ZIP;
            lpVarZRu = ZRu(context, str, inputStream, str3);
            mZVar = mZVar2;
        }
        if (str3 != null && lpVarZRu.ZRu() != null && (mm = this.ZRu) != null) {
            mm.ZRu(str, mZVar);
        }
        return lpVarZRu;
    }

    private lp<com.bytedance.adsdk.NOt.Mm> ZRu(Context context, String str, InputStream inputStream, String str2) throws IOException {
        Mm mm;
        if (str2 != null && (mm = this.ZRu) != null) {
            return com.bytedance.adsdk.NOt.FA.ZRu(context, new ZipInputStream(new FileInputStream(mm.ZRu(str, inputStream, mZ.ZIP))), str);
        }
        return com.bytedance.adsdk.NOt.FA.ZRu(context, new ZipInputStream(inputStream), (String) null);
    }

    private lp<com.bytedance.adsdk.NOt.Mm> ZRu(String str, InputStream inputStream, String str2) throws IOException {
        Mm mm;
        if (str2 != null && (mm = this.ZRu) != null) {
            return com.bytedance.adsdk.NOt.FA.NOt(new FileInputStream(mm.ZRu(str, inputStream, mZ.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.NOt.FA.NOt(inputStream, (String) null);
    }
}
