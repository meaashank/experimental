package B0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: B0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0924h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12275a = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12276b = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12277c = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12278d = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12279e = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: renamed from: B0.h$a */
    @T(33)
    public static class a {
        public static <T> T[] a(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        public static <T> ArrayList<T> b(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        public static <T> T c(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        public static <T extends Serializable> T d(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull String str) {
        if (!F.a(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent(F.f12252b).setData(Uri.fromParts("package", str, null));
        if (i10 >= 30) {
            return data;
        }
        String strB = F.b(context.getPackageManager());
        strB.getClass();
        return data.setPackage(strB);
    }

    @Nullable
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] b(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a.a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @Nullable
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> c(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @Nullable
    public static <T> T d(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.c(intent, str, cls);
        }
        T t10 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @Nullable
    public static <T extends Serializable> T e(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(intent, str, cls);
        }
        T t10 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @NonNull
    public static Intent f(@NonNull String str, @NonNull String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
