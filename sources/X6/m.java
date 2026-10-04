package X6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GaiaContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(28)
public final class m extends AppComponentFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f78635c = "asdf-".concat(m.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppComponentFactory f78636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f78637b = Collections.synchronizedSet(new HashSet());

    public static final class a extends ContentProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78638a;

        public a(String str) {
            this.f78638a = str;
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
            return null;
        }

        @Override // android.content.ContentProvider
        public boolean onCreate() {
            return false;
        }

        @Override // android.content.ContentProvider
        @Nullable
        public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
            return null;
        }

        @NonNull
        public String toString() {
            return android.support.v4.media.e.a(new StringBuilder("MissingProvider{"), this.f78638a, "}");
        }

        @Override // android.content.ContentProvider
        public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
            return 0;
        }
    }

    public m(@NonNull AppComponentFactory appComponentFactory) {
        this.f78636a = appComponentFactory;
    }

    public AppComponentFactory a() {
        return this.f78636a;
    }

    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return this.f78636a.instantiateActivity(classLoader, str, intent);
    }

    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return this.f78636a.instantiateApplication(classLoader, str);
    }

    @NonNull
    @TargetApi(29)
    public ClassLoader instantiateClassLoader(@NonNull ClassLoader classLoader, @NonNull ApplicationInfo applicationInfo) {
        return this.f78636a.instantiateClassLoader(classLoader, applicationInfo);
    }

    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return this.f78636a.instantiateProvider(classLoader, str);
        } catch (ClassNotFoundException e10) {
            if (this.f78637b.add(str)) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("provider_class", str);
                    bundle.putString("guest_pkg", GaiaContext.j().r());
                    C5705o c5705oC = C5705o.c();
                    GaiaContext gaiaContext = GaiaContext.f164212y;
                    c5705oC.e(e10, gaiaContext.r(), gaiaContext.s(), "GUEST_PROVIDER_CLASS_MISSING_AT_FACTORY", bundle);
                } catch (Throwable unused) {
                }
            }
            return new a(str);
        }
    }

    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return this.f78636a.instantiateReceiver(classLoader, str, intent);
    }

    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return this.f78636a.instantiateService(classLoader, str, intent);
    }
}
