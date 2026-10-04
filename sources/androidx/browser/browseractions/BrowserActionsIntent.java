package androidx.browser.browseractions;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u.C5630a;
import u.d;
import u.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsIntent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f86461b = "BrowserActions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f86462c = "https://www.example.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f86463d = "androidx.browser.browseractions.APP_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f86464e = "androidx.browser.browseractions.browser_action_open";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f86465f = "androidx.browser.browseractions.ICON_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f86466g = "androidx.browser.browseractions.ICON_URI";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f86467h = "androidx.browser.browseractions.TITLE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f86468i = "androidx.browser.browseractions.ACTION";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f86469j = "androidx.browser.browseractions.extra.TYPE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f86470k = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f86471l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f86472m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f86473n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f86474o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f86475p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f86476q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f86477r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f86478s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f86479t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f86480u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f86481v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f86482w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f86483x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f86484y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public static a f86485z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f86486a;

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public BrowserActionsIntent(@NonNull Intent intent) {
        this.f86486a = intent;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<ResolveInfo> a(@NonNull Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f86464e, Uri.parse(f86462c)), 131072);
    }

    @Nullable
    @Deprecated
    public static String b(@NonNull Intent intent) {
        return d(intent);
    }

    @Nullable
    public static String d(@NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f86463d);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void e(@NonNull Context context, @NonNull Intent intent) {
        f(context, intent, a(context));
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            i(context, intent);
            return;
        }
        int i10 = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f86462c)), 65536);
            if (resolveInfoResolveActivity != null) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (str.equals(list.get(i10).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    }
                    i10++;
                }
            }
        }
        C0920d.startActivity(context, intent, null);
    }

    public static void g(@NonNull Context context, @NonNull Uri uri) {
        e(context, new Builder(context, uri).build().c());
    }

    public static void h(@NonNull Context context, @NonNull Uri uri, int i10, @NonNull ArrayList<C5630a> arrayList, @NonNull PendingIntent pendingIntent) {
        e(context, new Builder(context, uri).setUrlType(i10).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().c());
    }

    public static void i(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f86470k);
        j(context, data, parcelableArrayListExtra != null ? k(parcelableArrayListExtra) : null);
    }

    public static void j(Context context, Uri uri, List<C5630a> list) {
        new d(context, uri, list).e();
        a aVar = f86485z;
        if (aVar != null) {
            aVar.a();
        }
    }

    @NonNull
    public static List<C5630a> k(@NonNull ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = arrayList.get(i10);
            String string = bundle.getString(f86467h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f86468i);
            int i11 = bundle.getInt(f86465f);
            Uri uri = (Uri) bundle.getParcelable(f86466g);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(i11 != 0 ? new C5630a(string, pendingIntent, i11) : new C5630a(string, pendingIntent, uri));
        }
        return arrayList2;
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void l(a aVar) {
        f86485z = aVar;
    }

    @NonNull
    public Intent c() {
        return this.f86486a;
    }

    public static final class Builder {
        private Context mContext;
        private Uri mUri;
        private final Intent mIntent = new Intent(BrowserActionsIntent.f86464e);
        private int mType = 0;
        private ArrayList<Bundle> mMenuItems = new ArrayList<>();

        @Nullable
        private PendingIntent mOnItemSelectedPendingIntent = null;
        private List<Uri> mImageUris = new ArrayList();

        public Builder(@NonNull Context context, @NonNull Uri uri) {
            this.mContext = context;
            this.mUri = uri;
        }

        @NonNull
        private Bundle getBundleFromItem(@NonNull C5630a c5630a) {
            Bundle bundle = new Bundle();
            bundle.putString(BrowserActionsIntent.f86467h, c5630a.e());
            bundle.putParcelable(BrowserActionsIntent.f86468i, c5630a.a());
            if (c5630a.b() != 0) {
                bundle.putInt(BrowserActionsIntent.f86465f, c5630a.b());
            }
            if (c5630a.c() != null) {
                bundle.putParcelable(BrowserActionsIntent.f86466g, c5630a.c());
            }
            return bundle;
        }

        @NonNull
        public BrowserActionsIntent build() {
            this.mIntent.setData(this.mUri);
            this.mIntent.putExtra(BrowserActionsIntent.f86469j, this.mType);
            this.mIntent.putParcelableArrayListExtra(BrowserActionsIntent.f86470k, this.mMenuItems);
            this.mIntent.putExtra(BrowserActionsIntent.f86463d, PendingIntent.getActivity(this.mContext, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.mOnItemSelectedPendingIntent;
            if (pendingIntent != null) {
                this.mIntent.putExtra(BrowserActionsIntent.f86471l, pendingIntent);
            }
            e.b(this.mIntent, this.mImageUris, this.mContext);
            return new BrowserActionsIntent(this.mIntent);
        }

        @NonNull
        public Builder setCustomItems(@NonNull ArrayList<C5630a> arrayList) {
            if (arrayList.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (TextUtils.isEmpty(arrayList.get(i10).e()) || arrayList.get(i10).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.mMenuItems.add(getBundleFromItem(arrayList.get(i10)));
                if (arrayList.get(i10).c() != null) {
                    this.mImageUris.add(arrayList.get(i10).c());
                }
            }
            return this;
        }

        @NonNull
        public Builder setOnItemSelectedAction(@NonNull PendingIntent pendingIntent) {
            this.mOnItemSelectedPendingIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setUrlType(int i10) {
            this.mType = i10;
            return this;
        }

        @NonNull
        public Builder setCustomItems(@NonNull C5630a... c5630aArr) {
            return setCustomItems(new ArrayList<>(Arrays.asList(c5630aArr)));
        }
    }
}
