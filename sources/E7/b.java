package e7;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.naked.metadata.android.content.ContentProviderCAG;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f200288a = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f200289b = {"com.miui.home.launcher.download"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, IInterface> f200290c = new HashMap();

    public static boolean a(@Nullable String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : f200289b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static synchronized IInterface b(Context context, ProviderInfo providerInfo) {
        Map<String, IInterface> map = f200290c;
        IInterface iInterface = map.get(providerInfo.authority);
        if (iInterface != null) {
            return iInterface;
        }
        if (ContentProviderCAG.f165590C.getIContentProvider() == null) {
            return null;
        }
        ProviderInfo providerInfo2 = new ProviderInfo(providerInfo);
        providerInfo2.exported = true;
        providerInfo2.readPermission = null;
        providerInfo2.writePermission = null;
        providerInfo2.pathPermissions = null;
        providerInfo2.grantUriPermissions = false;
        b bVar = new b();
        bVar.attachInfo(context, providerInfo2);
        IInterface iInterfaceCall = ContentProviderCAG.f165590C.getIContentProvider().call(bVar, new Object[0]);
        if (iInterfaceCall != null) {
            map.put(providerInfo.authority, iInterfaceCall);
        }
        return iInterfaceCall;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        return new Bundle();
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return ContentUris.withAppendedId(uri, 0L);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (strArr == null) {
            strArr = new String[0];
        }
        return new MatrixCursor(strArr);
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
