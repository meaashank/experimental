package x;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5776b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"IntentName"})
    public static final String f240247e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f240248f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f240249g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f240250h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f240251i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f240252j = "POST";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f240253k = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f240254l = "multipart/form-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f240255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f240256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f240257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final c f240258d;

    /* JADX INFO: renamed from: x.b$a */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: renamed from: x.b$b, reason: collision with other inner class name */
    public static final class C0904b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f240259c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f240260d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f240261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final List<String> f240262b;

        public C0904b(@NonNull String str, @NonNull List<String> list) {
            this.f240261a = str;
            this.f240262b = Collections.unmodifiableList(list);
        }

        @Nullable
        public static C0904b a(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f240259c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f240260d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C0904b(string, stringArrayList);
        }

        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(f240259c, this.f240261a);
            bundle.putStringArrayList(f240260d, new ArrayList<>(this.f240262b));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: x.b$c */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f240263d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f240264e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f240265f = "androidx.browser.trusted.sharing.KEY_FILES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f240266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f240267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final List<C0904b> f240268c;

        public c(@Nullable String str, @Nullable String str2, @Nullable List<C0904b> list) {
            this.f240266a = str;
            this.f240267b = str2;
            this.f240268c = list;
        }

        @Nullable
        public static c a(@Nullable Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f240265f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                int size = parcelableArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    arrayList.add(C0904b.a((Bundle) obj));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @NonNull
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f240266a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f240267b);
            if (this.f240268c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<C0904b> it = this.f240268c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                bundle.putParcelableArrayList(f240265f, arrayList);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: x.b$d */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface d {
    }

    public C5776b(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull c cVar) {
        this.f240255a = str;
        this.f240256b = str2;
        this.f240257c = str3;
        this.f240258d = cVar;
    }

    @Nullable
    public static C5776b a(@NonNull Bundle bundle) {
        String string = bundle.getString(f240247e);
        String string2 = bundle.getString(f240248f);
        String string3 = bundle.getString(f240249g);
        c cVarA = c.a(bundle.getBundle(f240250h));
        if (string == null || cVarA == null) {
            return null;
        }
        return new C5776b(string, string2, string3, cVarA);
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f240247e, this.f240255a);
        bundle.putString(f240248f, this.f240256b);
        bundle.putString(f240249g, this.f240257c);
        bundle.putBundle(f240250h, this.f240258d.b());
        return bundle;
    }
}
