package com.prism.hider.vault.commons;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes6.dex */
public class VaultProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168621a = l0.b("VaultProvider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f168622b = ".vault.provider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168623c = "KEY_CERTIFICATED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f168624d = "KEY_ISSETUP";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168625e = "getModel";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f168626f = "grantCertificate";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f168627g = "releaseCertificate";

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Log.d(f168621a, "Vault Provider call " + str);
        B bH = B.h();
        if (f168625e.equals(str)) {
            bundle2.putBoolean(f168623c, bH.e(getContext()));
            bundle2.putBoolean(f168624d, bH.c(getContext()));
            return bundle2;
        }
        if (f168627g.equals(str)) {
            bH.d();
            return bundle2;
        }
        if (!f168626f.equals(str)) {
            return null;
        }
        bH.a();
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
