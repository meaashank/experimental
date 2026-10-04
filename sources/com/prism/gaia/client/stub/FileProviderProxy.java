package com.prism.gaia.client.stub;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3861z;
import com.prism.gaia.client.GaiaContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FileProviderProxy extends FileProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164312b = ".fileprovider";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164311a = "asdf-".concat("FileProviderProxy");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3861z<String, Context> f164313c = new C3861z<>(new e());

    public static /* synthetic */ String a(Context context) {
        return context.getPackageName() + f164312b;
    }

    public static String b(Context context) {
        return f164313c.a(context);
    }

    public static Uri c(@Nullable String str, @NonNull Uri uri) {
        ProviderInfo providerInfoResolveContentProvider = GaiaContext.j().T().resolveContentProvider(uri.getAuthority(), 512);
        if (providerInfoResolveContentProvider != null && U6.c.X(providerInfoResolveContentProvider.packageName)) {
            return uri;
        }
        File fileD = d(uri);
        if (fileD == null) {
            return null;
        }
        fileD.getAbsolutePath();
        File file = C3841e.x() ? new File(D9.d.H(str), fileD.getAbsolutePath()) : new File(Environment.getExternalStorageDirectory(), fileD.getAbsolutePath());
        file.getAbsolutePath();
        return e(GaiaContext.f164212y.n(), file);
    }

    public static File d(Uri uri) {
        Class<?> cls;
        String authority = uri.getAuthority();
        try {
            Method declaredMethod = FileProvider.class.getDeclaredMethod("getPathStrategy", Context.class, String.class);
            declaredMethod.setAccessible(true);
            Class<?>[] declaredClasses = FileProvider.class.getDeclaredClasses();
            int length = declaredClasses.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cls = null;
                    break;
                }
                cls = declaredClasses[i10];
                if (cls.getSimpleName().equals("PathStrategy")) {
                    break;
                }
                i10++;
            }
            Object objInvoke = declaredMethod.invoke(null, GaiaContext.j().n(), authority);
            Method declaredMethod2 = cls.getDeclaredMethod("getFileForUri", Uri.class);
            declaredMethod2.setAccessible(true);
            return (File) declaredMethod2.invoke(objInvoke, uri);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri e(@NonNull Context context, @NonNull File file) {
        String strB = b(context);
        file.getAbsolutePath();
        return FileProvider.getUriForFile(context, strB, file);
    }

    public static int modeToMode(@NonNull String str) {
        if (CampaignEx.JSON_KEY_AD_R.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(w.y.a("Invalid mode: ", str));
    }

    @Override // android.content.ContentProvider
    public Bundle call(@NonNull String str, String str2, Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        uri.toString();
        return super.delete(uri, str, strArr);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        uri.toString();
        return super.getType(uri);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        uri.toString();
        return super.insert(uri, contentValues);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        super.onCreate();
        return true;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        uri.toString();
        String path = uri.getPath();
        File file = new File(Uri.decode(path.substring(path.indexOf(47, 1))));
        file.getAbsolutePath();
        return ParcelFileDescriptor.open(file, modeToMode(str));
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.toString();
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.toString();
        return super.update(uri, contentValues, str, strArr);
    }
}
