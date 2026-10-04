package androidx.navigation;

import B0.C0920d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.app.C2382e;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.V;
import e.InterfaceC4335i;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,530:1\n179#2,2:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:531,2\n*E\n"})
@Navigator.b("activity")
public class ActivityNavigator extends Navigator<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f114892e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f114893f = "android-support-navigation:ActivityNavigator:source";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f114894g = "android-support-navigation:ActivityNavigator:current";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f114895h = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f114896i = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f114897j = "ActivityNavigator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f114898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Activity f114899d;

    public static final class Extras implements Navigator.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final C2382e f114901b;

        public static final class Builder {

            @Nullable
            private C2382e activityOptions;
            private int flags;

            @NotNull
            public final Builder addFlags(int i10) {
                this.flags = i10 | this.flags;
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            @NotNull
            public final Builder setActivityOptions(@NotNull C2382e activityOptions) {
                kotlin.jvm.internal.G.p(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i10, @Nullable C2382e c2382e) {
            this.f114900a = i10;
            this.f114901b = c2382e;
        }

        @Nullable
        public final C2382e a() {
            return this.f114901b;
        }

        public final int b() {
            return this.f114900a;
        }
    }

    public static final class a {
        public a() {
        }

        @dd.o
        public final void a(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.f114895h, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.f114896i, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,530:1\n232#2,3:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n270#1:531,3\n*E\n"})
    @NavDestination.a(Activity.class)
    public static class b extends NavDestination {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public Intent f114902l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public String f114903m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f114904n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public ComponentName f114905o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public String f114906p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public Uri f114907q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Navigator<? extends b> activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.G.p(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.NavDestination
        @InterfaceC4335i
        public void N(@NotNull Context context, @NotNull AttributeSet attrs) {
            kotlin.jvm.internal.G.p(context, "context");
            kotlin.jvm.internal.G.p(attrs, "attrs");
            super.N(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, V.c.f115184a);
            kotlin.jvm.internal.G.o(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            l0(f0(context, typedArrayObtainAttributes.getString(V.c.f115189f)));
            String string = typedArrayObtainAttributes.getString(V.c.f115185b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                h0(new ComponentName(context, string));
            }
            g0(typedArrayObtainAttributes.getString(V.c.f115186c));
            String strF0 = f0(context, typedArrayObtainAttributes.getString(V.c.f115187d));
            if (strF0 != null) {
                i0(Uri.parse(strF0));
            }
            this.f114903m = f0(context, typedArrayObtainAttributes.getString(V.c.f115188e));
            typedArrayObtainAttributes.recycle();
        }

        @Nullable
        public final String Z() {
            Intent intent = this.f114902l;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Nullable
        public final ComponentName a0() {
            Intent intent = this.f114902l;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Nullable
        public final Uri b0() {
            Intent intent = this.f114902l;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Nullable
        public final String c0() {
            return this.f114903m;
        }

        @Nullable
        public final Intent d0() {
            return this.f114902l;
        }

        @Nullable
        public final String e0() {
            Intent intent = this.f114902l;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f114902l;
                if ((intent != null ? intent.filterEquals(((b) obj).f114902l) : ((b) obj).f114902l == null) && kotlin.jvm.internal.G.g(this.f114903m, ((b) obj).f114903m)) {
                    return true;
                }
            }
            return false;
        }

        public final String f0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            kotlin.jvm.internal.G.o(packageName, "context.packageName");
            return kotlin.text.F.B2(str, I.f114919h, packageName, false, 4, null);
        }

        @NotNull
        public final b g0(@Nullable String str) {
            if (this.f114902l == null) {
                this.f114902l = new Intent();
            }
            Intent intent = this.f114902l;
            kotlin.jvm.internal.G.m(intent);
            intent.setAction(str);
            return this;
        }

        @NotNull
        public final b h0(@Nullable ComponentName componentName) {
            if (this.f114902l == null) {
                this.f114902l = new Intent();
            }
            Intent intent = this.f114902l;
            kotlin.jvm.internal.G.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f114902l;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f114903m;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final b i0(@Nullable Uri uri) {
            if (this.f114902l == null) {
                this.f114902l = new Intent();
            }
            Intent intent = this.f114902l;
            kotlin.jvm.internal.G.m(intent);
            intent.setData(uri);
            return this;
        }

        @NotNull
        public final b j0(@Nullable String str) {
            this.f114903m = str;
            return this;
        }

        @NotNull
        public final b k0(@Nullable Intent intent) {
            this.f114902l = intent;
            return this;
        }

        @NotNull
        public final b l0(@Nullable String str) {
            if (this.f114902l == null) {
                this.f114902l = new Intent();
            }
            Intent intent = this.f114902l;
            kotlin.jvm.internal.G.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            ComponentName componentNameA0 = a0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameA0 != null) {
                sb2.append(" class=");
                sb2.append(componentNameA0.getClassName());
            } else {
                String strZ = Z();
                if (strZ != null) {
                    sb2.append(" action=");
                    sb2.append(strZ);
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.G.o(string, "sb.toString()");
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull P navigatorProvider) {
            super((Navigator<? extends NavDestination>) navigatorProvider.e(ActivityNavigator.class));
            kotlin.jvm.internal.G.p(navigatorProvider, "navigatorProvider");
        }
    }

    public ActivityNavigator(@NotNull Context context) {
        Object next;
        kotlin.jvm.internal.G.p(context, "context");
        this.f114898c = context;
        Iterator it = SequencesKt__SequencesKt.v(context, new ed.l<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Context invoke(@NotNull Context it2) {
                kotlin.jvm.internal.G.p(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f114899d = (Activity) next;
    }

    @dd.o
    public static final void l(@NotNull Activity activity) {
        f114892e.a(activity);
    }

    @Override // androidx.navigation.Navigator
    public /* bridge */ /* synthetic */ NavDestination d(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.a aVar) {
        o((b) navDestination, bundle, navOptions, aVar);
        return null;
    }

    @Override // androidx.navigation.Navigator
    public boolean k() {
        Activity activity = this.f114899d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context n() {
        return this.f114898c;
    }

    @Nullable
    public NavDestination o(@NotNull b destination, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.a aVar) {
        C2382e c2382e;
        Intent intent;
        int intExtra;
        kotlin.jvm.internal.G.p(destination, "destination");
        if (destination.f114902l == null) {
            throw new IllegalStateException(android.support.v4.media.d.a(new StringBuilder("Destination "), destination.f115094h, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.f114902l);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = destination.f114903m;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar instanceof Extras;
        if (z10) {
            intent2.addFlags(((Extras) aVar).f114900a);
        }
        if (this.f114899d == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.f115136a) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f114899d;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f114894g, 0)) != 0) {
            intent2.putExtra(f114893f, intExtra);
        }
        intent2.putExtra(f114894g, destination.f115094h);
        Resources resources = this.f114898c.getResources();
        if (navOptions != null) {
            int i10 = navOptions.f115143h;
            int i11 = navOptions.f115144i;
            if ((i10 <= 0 || !kotlin.jvm.internal.G.g(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !kotlin.jvm.internal.G.g(resources.getResourceTypeName(i11), "animator"))) {
                intent2.putExtra(f114895h, i10);
                intent2.putExtra(f114896i, i11);
            } else {
                Log.w(f114897j, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + destination);
            }
        }
        if (!z10 || (c2382e = ((Extras) aVar).f114901b) == null) {
            this.f114898c.startActivity(intent2);
        } else {
            C0920d.startActivity(this.f114898c, intent2, c2382e.n());
        }
        if (navOptions == null || this.f114899d == null) {
            return null;
        }
        int i12 = navOptions.f115141f;
        int i13 = navOptions.f115142g;
        if ((i12 <= 0 || !kotlin.jvm.internal.G.g(resources.getResourceTypeName(i12), "animator")) && (i13 <= 0 || !kotlin.jvm.internal.G.g(resources.getResourceTypeName(i13), "animator"))) {
            if (i12 < 0 && i13 < 0) {
                return null;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            this.f114899d.overridePendingTransition(i12, i13 >= 0 ? i13 : 0);
            return null;
        }
        Log.w(f114897j, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + destination);
        return null;
    }
}
