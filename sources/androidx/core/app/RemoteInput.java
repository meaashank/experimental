package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteInput {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f110959h = "android.remoteinput.results";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f110960i = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f110961j = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f110962k = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f110963l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f110964m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f110965n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f110966o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f110967p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f110969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f110970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f110971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f110973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f110974g;

    public static final class Builder {
        private CharSequence[] mChoices;
        private CharSequence mLabel;
        private final String mResultKey;
        private final Set<String> mAllowedDataTypes = new HashSet();
        private final Bundle mExtras = new Bundle();
        private boolean mAllowFreeFormTextInput = true;
        private int mEditChoicesBeforeSending = 0;

        public Builder(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.mResultKey = str;
        }

        @NonNull
        public Builder addExtras(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mEditChoicesBeforeSending, this.mExtras, this.mAllowedDataTypes);
        }

        @NonNull
        public Bundle getExtras() {
            return this.mExtras;
        }

        @NonNull
        public Builder setAllowDataType(@NonNull String str, boolean z10) {
            if (z10) {
                this.mAllowedDataTypes.add(str);
                return this;
            }
            this.mAllowedDataTypes.remove(str);
            return this;
        }

        @NonNull
        public Builder setAllowFreeFormInput(boolean z10) {
            this.mAllowFreeFormTextInput = z10;
            return this;
        }

        @NonNull
        public Builder setChoices(@Nullable CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setEditChoicesBeforeSending(int i10) {
            this.mEditChoicesBeforeSending = i10;
            return this;
        }

        @NonNull
        public Builder setLabel(@Nullable CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }
    }

    @e.T(20)
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        public static android.app.RemoteInput b(RemoteInput remoteInput) {
            Set<String> set;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(remoteInput.f110968a).setLabel(remoteInput.f110969b).setChoices(remoteInput.f110970c).setAllowFreeFormInput(remoteInput.f110971d).addExtras(remoteInput.f110973f);
            if (Build.VERSION.SDK_INT >= 26 && (set = remoteInput.f110974g) != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(builderAddExtras, remoteInput.f110972e);
            }
            return builderAddExtras.build();
        }

        public static RemoteInput c(Object obj) {
            Set<String> setB;
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            Builder builderAddExtras = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setB = b.b(remoteInput)) != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    builderAddExtras.setAllowDataType(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builderAddExtras.setEditChoicesBeforeSending(d.a(remoteInput));
            }
            return builderAddExtras.build();
        }

        public static Bundle d(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    @e.T(26)
    public static class b {
        public static void a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(a.b(remoteInput), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    @e.T(28)
    public static class c {
        public static int a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        public static void b(Intent intent, int i10) {
            android.app.RemoteInput.setResultsSource(intent, i10);
        }
    }

    @e.T(29)
    public static class d {
        public static int a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface f {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f110968a = str;
        this.f110969b = charSequence;
        this.f110970c = charSequenceArr;
        this.f110971d = z10;
        this.f110972e = i10;
        this.f110973f = bundle;
        this.f110974g = set;
        if (i10 == 2 && !z10) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@NonNull RemoteInput remoteInput, @NonNull Intent intent, @NonNull Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(remoteInput, intent, map);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentI.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(remoteInput.f110968a, value.toString());
                intentI.putExtra(l(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(f110959h, intentI));
    }

    public static void b(@NonNull RemoteInput[] remoteInputArr, @NonNull Intent intent, @NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            android.app.RemoteInput.addResultsToIntent(d(remoteInputArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = android.app.RemoteInput.getResultsFromIntent(intent);
        int iQ = q(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (RemoteInput remoteInput : remoteInputArr) {
            Map<String, Uri> mapJ = j(intent, remoteInput.f110968a);
            android.app.RemoteInput.addResultsToIntent(d(new RemoteInput[]{remoteInput}), intent, bundle);
            if (mapJ != null) {
                a(remoteInput, intent, mapJ);
            }
        }
        s(intent, iQ);
    }

    @e.T(20)
    public static android.app.RemoteInput c(RemoteInput remoteInput) {
        return a.b(remoteInput);
    }

    @e.T(20)
    public static android.app.RemoteInput[] d(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i10 = 0; i10 < remoteInputArr.length; i10++) {
            remoteInputArr2[i10] = a.b(remoteInputArr[i10]);
        }
        return remoteInputArr2;
    }

    @e.T(20)
    public static RemoteInput e(android.app.RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    public static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f110959h)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    @Nullable
    public static Map<String, Uri> j(@NonNull Intent intent, @NonNull String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(intent, str);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentI.getExtras().keySet()) {
            if (str2.startsWith(f110961j)) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentI.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static String l(String str) {
        return w.y.a(f110961j, str);
    }

    @Nullable
    public static Bundle p(@NonNull Intent intent) {
        return android.app.RemoteInput.getResultsFromIntent(intent);
    }

    public static int q(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return 0;
        }
        return intentI.getExtras().getInt(f110962k, 0);
    }

    public static void s(@NonNull Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i10);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        intentI.putExtra(f110962k, i10);
        intent.setClipData(ClipData.newIntent(f110959h, intentI));
    }

    public boolean f() {
        return this.f110971d;
    }

    @Nullable
    public Set<String> g() {
        return this.f110974g;
    }

    @Nullable
    public CharSequence[] h() {
        return this.f110970c;
    }

    public int k() {
        return this.f110972e;
    }

    @NonNull
    public Bundle m() {
        return this.f110973f;
    }

    @Nullable
    public CharSequence n() {
        return this.f110969b;
    }

    @NonNull
    public String o() {
        return this.f110968a;
    }

    public boolean r() {
        Set<String> set;
        if (this.f110971d) {
            return false;
        }
        CharSequence[] charSequenceArr = this.f110970c;
        return ((charSequenceArr != null && charSequenceArr.length != 0) || (set = this.f110974g) == null || set.isEmpty()) ? false : true;
    }
}
