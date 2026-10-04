package androidx.core.content;

import B0.C0925i;
import B0.C0926j;
import B0.C0929m;
import B0.C0931o;
import B0.q;
import B0.r;
import B0.s;
import B0.t;
import B0.u;
import B0.v;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.B;
import androidx.core.util.InterfaceC2427d;
import e.T;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: loaded from: classes2.dex */
public class IntentSanitizer {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f111126p = "IntentSanitizer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f111127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B<String> f111128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B<Uri> f111129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B<String> f111130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B<String> f111131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B<String> f111132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B<ComponentName> f111133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f111134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, B<Object>> f111135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B<Uri> f111137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B<ClipData> f111138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f111139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f111140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f111141o;

    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private int mAllowedFlags;
        private B<String> mAllowedActions = new q();
        private B<Uri> mAllowedData = new r();
        private B<String> mAllowedTypes = new q();
        private B<String> mAllowedCategories = new q();
        private B<String> mAllowedPackages = new q();
        private B<ComponentName> mAllowedComponents = new s();
        private Map<String, B<Object>> mAllowedExtras = new HashMap();
        private boolean mAllowClipDataText = false;
        private B<Uri> mAllowedClipDataUri = new r();
        private B<ClipData> mAllowedClipData = new t();

        public static /* synthetic */ boolean a(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean b(String str) {
            return false;
        }

        public static /* synthetic */ boolean e(Class cls, B b10, Object obj) {
            return cls.isInstance(obj) && b10.test(cls.cast(obj));
        }

        public static /* synthetic */ boolean f(String str) {
            return false;
        }

        public static /* synthetic */ boolean i(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean j(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean k(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean m(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean o(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean p(String str) {
            return false;
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return false;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull B<String> b10) {
            b10.getClass();
            this.mAllowedActions = this.mAllowedActions.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new C0929m();
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull B<String> b10) {
            b10.getClass();
            this.mAllowedCategories = this.mAllowedCategories.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipData(@NonNull B<ClipData> b10) {
            b10.getClass();
            this.mAllowedClipData = this.mAllowedClipData.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUri(@NonNull B<Uri> b10) {
            b10.getClass();
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUriWithAuthority(@NonNull final String str) {
            str.getClass();
            return allowClipDataUri(new B() { // from class: B0.n
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull final ComponentName componentName) {
            componentName.getClass();
            return allowComponent(new B() { // from class: B0.l
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponentWithPackage(@NonNull final String str) {
            str.getClass();
            return allowComponent(new B() { // from class: B0.w
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return str.equals(((ComponentName) obj).getPackageName());
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowData(@NonNull B<Uri> b10) {
            b10.getClass();
            this.mAllowedData = this.mAllowedData.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowDataWithAuthority(@NonNull final String str) {
            str.getClass();
            allowData(new B() { // from class: B0.x
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull B<Object> b10) {
            str.getClass();
            b10.getClass();
            B<Object> c0931o = this.mAllowedExtras.get(str);
            if (c0931o == null) {
                c0931o = new C0931o();
            }
            this.mAllowedExtras.put(str, c0931o.b(b10));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull final String str) {
            allowExtra(AgentOptions.OUTPUT, Uri.class, new B() { // from class: B0.k
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStream(@NonNull B<Uri> b10) {
            allowExtra("android.intent.extra.STREAM", Uri.class, b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStreamUriWithAuthority(@NonNull final String str) {
            str.getClass();
            allowExtra("android.intent.extra.STREAM", Uri.class, new B() { // from class: B0.p
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                    return androidx.core.util.A.a(this, b10);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                    return androidx.core.util.A.c(this, b10);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return str.equals(((Uri) obj).getAuthority());
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowFlags(int i10) {
            this.mAllowedFlags = i10 | this.mAllowedFlags;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull B<String> b10) {
            b10.getClass();
            this.mAllowedPackages = this.mAllowedPackages.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull B<String> b10) {
            b10.getClass();
            this.mAllowedTypes = this.mAllowedTypes.b(b10);
            return this;
        }

        @NonNull
        public IntentSanitizer build() {
            boolean z10 = this.mAllowAnyComponent;
            if ((z10 && this.mAllowSomeComponents) || (!z10 && !this.mAllowSomeComponents)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer = new IntentSanitizer();
            intentSanitizer.f111127a = this.mAllowedFlags;
            intentSanitizer.f111128b = this.mAllowedActions;
            intentSanitizer.f111129c = this.mAllowedData;
            intentSanitizer.f111130d = this.mAllowedTypes;
            intentSanitizer.f111131e = this.mAllowedCategories;
            intentSanitizer.f111132f = this.mAllowedPackages;
            intentSanitizer.f111134h = z10;
            intentSanitizer.f111133g = this.mAllowedComponents;
            intentSanitizer.f111135i = this.mAllowedExtras;
            intentSanitizer.f111136j = this.mAllowClipDataText;
            intentSanitizer.f111137k = this.mAllowedClipDataUri;
            intentSanitizer.f111138l = this.mAllowedClipData;
            intentSanitizer.f111139m = this.mAllowIdentifier;
            intentSanitizer.f111140n = this.mAllowSelector;
            intentSanitizer.f111141o = this.mAllowSourceBounds;
            return intentSanitizer;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull B<Uri> b10) {
            allowExtra(AgentOptions.OUTPUT, Uri.class, b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull String str) {
            str.getClass();
            allowAction(new v(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull String str) {
            str.getClass();
            return allowCategory(new v(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull B<ComponentName> b10) {
            b10.getClass();
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.b(b10);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull String str) {
            str.getClass();
            return allowPackage(new v(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull String str) {
            str.getClass();
            return allowType(new v(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> Builder allowExtra(@NonNull String str, @NonNull final Class<T> cls, @NonNull final B<T> b10) {
            str.getClass();
            cls.getClass();
            b10.getClass();
            return allowExtra(str, new B() { // from class: B0.y
                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b11) {
                    return androidx.core.util.A.a(this, b11);
                }

                @Override // androidx.core.util.B
                public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b11) {
                    return androidx.core.util.A.c(this, b11);
                }

                @Override // androidx.core.util.B
                public androidx.core.util.B negate() {
                    return new androidx.core.util.z(this);
                }

                @Override // androidx.core.util.B
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.e(cls, b10, obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, new u());
        }
    }

    @T(29)
    public static class b {
        public static String a(Intent intent) {
            return intent.getIdentifier();
        }

        public static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    @T(31)
    public static class c {
        public static void a(int i10, ClipData.Item item, InterfaceC2427d<String> interfaceC2427d) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            interfaceC2427d.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    public IntentSanitizer() {
    }

    public static /* synthetic */ void a(String str) {
        throw new SecurityException(str);
    }

    public static /* synthetic */ void b(String str) {
    }

    public static void r(int i10, ClipData.Item item, InterfaceC2427d<String> interfaceC2427d) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        interfaceC2427d.accept("ClipData item at position " + i10 + " contains htmlText, textLinks or intent: " + item);
    }

    public static /* synthetic */ void s(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.B<android.content.ClipData> r9, boolean r10, androidx.core.util.B<android.net.Uri> r11, androidx.core.util.InterfaceC2427d<java.lang.String> r12) {
        /*
            android.content.ClipData r7 = r7.getClipData()
            if (r7 != 0) goto L8
            goto Lc0
        L8:
            if (r9 == 0) goto L14
            boolean r9 = r9.test(r7)
            if (r9 == 0) goto L14
            r8.setClipData(r7)
            return
        L14:
            r9 = 0
            r0 = 0
            r1 = r9
        L17:
            int r2 = r7.getItemCount()
            if (r0 >= r2) goto Lbb
            android.content.ClipData$Item r2 = r7.getItemAt(r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L2b
            androidx.core.content.IntentSanitizer.c.a(r0, r2, r12)
            goto L2e
        L2b:
            r(r0, r2, r12)
        L2e:
            if (r10 == 0) goto L35
            java.lang.CharSequence r3 = r2.getText()
            goto L52
        L35:
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L51
            java.lang.String r3 = "Item text cannot contain value. Item position: "
            java.lang.String r4 = ". Text: "
            java.lang.StringBuilder r3 = android.support.v4.media.a.a(r3, r0, r4)
            java.lang.CharSequence r4 = r2.getText()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r12.accept(r3)
        L51:
            r3 = r9
        L52:
            java.lang.String r4 = ". URI: "
            java.lang.String r5 = "Item URI is not allowed. Item position: "
            if (r11 != 0) goto L71
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto L94
            java.lang.StringBuilder r4 = android.support.v4.media.a.a(r5, r0, r4)
            android.net.Uri r2 = r2.getUri()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r12.accept(r2)
            goto L94
        L71:
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto L96
            android.net.Uri r6 = r2.getUri()
            boolean r6 = r11.test(r6)
            if (r6 == 0) goto L82
            goto L96
        L82:
            java.lang.StringBuilder r4 = android.support.v4.media.a.a(r5, r0, r4)
            android.net.Uri r2 = r2.getUri()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r12.accept(r2)
        L94:
            r2 = r9
            goto L9a
        L96:
            android.net.Uri r2 = r2.getUri()
        L9a:
            if (r3 != 0) goto L9e
            if (r2 == 0) goto Lb7
        L9e:
            if (r1 != 0) goto Laf
            android.content.ClipData r1 = new android.content.ClipData
            android.content.ClipDescription r4 = r7.getDescription()
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            r5.<init>(r3, r9, r2)
            r1.<init>(r4, r5)
            goto Lb7
        Laf:
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            r4.<init>(r3, r9, r2)
            r1.addItem(r4)
        Lb7:
            int r0 = r0 + 1
            goto L17
        Lbb:
            if (r1 == 0) goto Lc0
            r8.setClipData(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.x(android.content.Intent, android.content.Intent, androidx.core.util.B, boolean, androidx.core.util.B, androidx.core.util.d):void");
    }

    public final void t(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @NonNull
    public Intent u(@NonNull Intent intent, @NonNull InterfaceC2427d<String> interfaceC2427d) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f111134h && component == null) || this.f111133g.test(component)) {
            intent2.setComponent(component);
        } else {
            interfaceC2427d.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f111132f.test(str)) {
            intent2.setPackage(str);
        } else {
            interfaceC2427d.accept("Package is not allowed: ".concat(str));
        }
        int flags = this.f111127a | intent.getFlags();
        int i10 = this.f111127a;
        if (flags == i10) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i10);
            interfaceC2427d.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f111127a)));
        }
        String action = intent.getAction();
        if (action == null || this.f111128b.test(action)) {
            intent2.setAction(action);
        } else {
            interfaceC2427d.accept("Action is not allowed: ".concat(action));
        }
        Uri data = intent.getData();
        if (data == null || this.f111129c.test(data)) {
            intent2.setData(data);
        } else {
            interfaceC2427d.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f111130d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            interfaceC2427d.accept("Type is not allowed: ".concat(type));
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f111131e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    interfaceC2427d.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f111127a & 1) == 0) {
                    interfaceC2427d.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals(AgentOptions.OUTPUT) || ((~this.f111127a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    B<Object> b10 = this.f111135i.get(str3);
                    if (b10 == null || !b10.test(obj)) {
                        interfaceC2427d.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        t(intent2, str3, obj);
                    }
                } else {
                    interfaceC2427d.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        x(intent, intent2, this.f111138l, this.f111136j, this.f111137k, interfaceC2427d);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f111139m) {
                b.b(intent2, b.a(intent));
            } else if (b.a(intent) != null) {
                interfaceC2427d.accept("Identifier is not allowed: " + b.a(intent));
            }
        }
        if (this.f111140n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            interfaceC2427d.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f111141o) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            interfaceC2427d.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent v(@NonNull Intent intent) {
        return u(intent, new C0926j());
    }

    @NonNull
    public Intent w(@NonNull Intent intent) {
        return u(intent, new C0925i());
    }

    public IntentSanitizer(a aVar) {
    }
}
