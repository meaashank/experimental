package androidx.core.app;

import B0.C0924h;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.N0;
import e.Z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f110986a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f110987b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f110988c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f110989d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f110990e = ".sharecompat_";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f110991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Intent f110992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f110993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f110994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f110995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f110996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public ArrayList<Uri> f110997g;

        public a(@NonNull Context context) {
            Activity activity;
            context.getClass();
            this.f110991a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f110992b = action;
            action.putExtra(W.f110986a, context.getPackageName());
            action.putExtra(W.f110987b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f110992b.putExtra(W.f110988c, componentName);
                this.f110992b.putExtra(W.f110989d, componentName);
            }
        }

        @NonNull
        @Deprecated
        public static a k(@NonNull Activity activity) {
            return new a(activity);
        }

        @NonNull
        public a a(@NonNull String str) {
            if (this.f110996f == null) {
                this.f110996f = new ArrayList<>();
            }
            this.f110996f.add(str);
            return this;
        }

        @NonNull
        public a b(@NonNull String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            if (this.f110995e == null) {
                this.f110995e = new ArrayList<>();
            }
            this.f110995e.add(str);
            return this;
        }

        @NonNull
        public a d(@NonNull String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            if (this.f110994d == null) {
                this.f110994d = new ArrayList<>();
            }
            this.f110994d.add(str);
            return this;
        }

        @NonNull
        public a f(@NonNull String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a g(@NonNull Uri uri) {
            if (this.f110997g == null) {
                this.f110997g = new ArrayList<>();
            }
            this.f110997g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f110992b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f110992b.putExtra(str, strArr);
        }

        public final void i(@Nullable String str, @NonNull String[] strArr) {
            Intent intentM = m();
            String[] stringArrayExtra = intentM.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM.putExtra(str, strArr2);
        }

        @NonNull
        public Intent j() {
            return Intent.createChooser(m(), this.f110993c);
        }

        @NonNull
        public Context l() {
            return this.f110991a;
        }

        @NonNull
        public Intent m() {
            ArrayList<String> arrayList = this.f110994d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f110994d = null;
            }
            ArrayList<String> arrayList2 = this.f110995e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f110995e = null;
            }
            ArrayList<String> arrayList3 = this.f110996f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f110996f = null;
            }
            ArrayList<Uri> arrayList4 = this.f110997g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f110992b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f110997g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f110992b.removeExtra("android.intent.extra.STREAM");
                    this.f110992b.setClipData(null);
                    Intent intent = this.f110992b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f110992b.putExtra("android.intent.extra.STREAM", this.f110997g.get(0));
                    W.g(this.f110992b, this.f110997g);
                }
            } else {
                this.f110992b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f110992b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f110997g);
                W.g(this.f110992b, this.f110997g);
            }
            return this.f110992b;
        }

        @NonNull
        public a n(@Z int i10) {
            return o(this.f110991a.getText(i10));
        }

        @NonNull
        public a o(@Nullable CharSequence charSequence) {
            this.f110993c = charSequence;
            return this;
        }

        @NonNull
        public a p(@Nullable String[] strArr) {
            this.f110992b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a q(@Nullable String[] strArr) {
            this.f110992b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a r(@Nullable String[] strArr) {
            if (this.f110994d != null) {
                this.f110994d = null;
            }
            this.f110992b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a s(@Nullable String str) {
            this.f110992b.putExtra(C0924h.f12276b, str);
            if (!this.f110992b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @NonNull
        public a t(@Nullable Uri uri) {
            this.f110997g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @NonNull
        public a u(@Nullable String str) {
            this.f110992b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @NonNull
        public a v(@Nullable CharSequence charSequence) {
            this.f110992b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @NonNull
        public a w(@Nullable String str) {
            this.f110992b.setType(str);
            return this;
        }

        public void x() {
            this.f110991a.startActivity(j());
        }
    }

    @Deprecated
    public static void a(@NonNull Menu menu, @e.C int i10, @NonNull a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException(N0.a("Could not find menu item with id ", i10, " in the supplied menu"));
        }
        b(menuItemFindItem, aVar);
    }

    @Deprecated
    public static void b(@NonNull MenuItem menuItem, @NonNull a aVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(aVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f110990e.concat(aVar.l().getClass().getName()));
        shareActionProvider.setShareIntent(aVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @Nullable
    public static ComponentName c(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @Nullable
    public static ComponentName d(@NonNull Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f110988c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f110989d) : componentName;
    }

    @Nullable
    public static String e(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @Nullable
    public static String f(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra(f110986a);
        return stringExtra == null ? intent.getStringExtra(f110987b) : stringExtra;
    }

    public static void g(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(C0924h.f12276b), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i10)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f110998f = "IntentReader";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f110999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Intent f111000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f111001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final ComponentName f111002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ArrayList<Uri> f111003e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NonNull Activity activity) {
            this(activity, activity.getIntent());
            activity.getClass();
        }

        @NonNull
        @Deprecated
        public static b a(@NonNull Activity activity) {
            return new b(activity);
        }

        @Nullable
        public ComponentName b() {
            return this.f111002d;
        }

        @Nullable
        public Drawable c() {
            if (this.f111002d == null) {
                return null;
            }
            try {
                return this.f110999a.getPackageManager().getActivityIcon(this.f111002d);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f110998f, "Could not retrieve icon for calling activity", e10);
                return null;
            }
        }

        @Nullable
        public Drawable d() {
            if (this.f111001c == null) {
                return null;
            }
            try {
                return this.f110999a.getPackageManager().getApplicationIcon(this.f111001c);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f110998f, "Could not retrieve icon for calling application", e10);
                return null;
            }
        }

        @Nullable
        public CharSequence e() {
            if (this.f111001c == null) {
                return null;
            }
            PackageManager packageManager = this.f110999a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f111001c, 0));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f110998f, "Could not retrieve label for calling application", e10);
                return null;
            }
        }

        @Nullable
        public String f() {
            return this.f111001c;
        }

        @Nullable
        public String[] g() {
            return this.f111000b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @Nullable
        public String[] h() {
            return this.f111000b.getStringArrayExtra("android.intent.extra.CC");
        }

        @Nullable
        public String[] i() {
            return this.f111000b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @Nullable
        public String j() {
            String stringExtra = this.f111000b.getStringExtra(C0924h.f12276b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceO = o();
            return charSequenceO instanceof Spanned ? Html.toHtml((Spanned) charSequenceO) : charSequenceO != null ? Html.escapeHtml(charSequenceO) : stringExtra;
        }

        @Nullable
        public Uri k() {
            return (Uri) this.f111000b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @Nullable
        public Uri l(int i10) {
            if (this.f111003e == null && q()) {
                this.f111003e = this.f111000b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f111003e;
            if (arrayList != null) {
                return arrayList.get(i10);
            }
            if (i10 == 0) {
                return (Uri) this.f111000b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i10);
        }

        public int m() {
            if (this.f111003e == null && q()) {
                this.f111003e = this.f111000b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f111003e;
            return arrayList != null ? arrayList.size() : this.f111000b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @Nullable
        public String n() {
            return this.f111000b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @Nullable
        public CharSequence o() {
            return this.f111000b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @Nullable
        public String p() {
            return this.f111000b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f111000b.getAction());
        }

        public boolean r() {
            String action = this.f111000b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f111000b.getAction());
        }

        public b(@NonNull Context context, @NonNull Intent intent) {
            context.getClass();
            this.f110999a = context;
            intent.getClass();
            this.f111000b = intent;
            this.f111001c = W.f(intent);
            this.f111002d = W.d(intent);
        }
    }
}
