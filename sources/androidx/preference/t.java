package androidx.preference;

import B0.C0920d;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f115706o = "_has_set_default_values";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f115707p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f115708q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115709a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SharedPreferences f115711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public j f115712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public SharedPreferences.Editor f115713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f115715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115716h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PreferenceScreen f115718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f115719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f115720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f115721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f115722n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f115710b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115717i = 0;

    public interface a {
        void e(@NonNull Preference preference);
    }

    public interface b {
        void h(@NonNull PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean f(@NonNull Preference preference);
    }

    public static abstract class d {
        public abstract boolean a(@NonNull Preference preference, @NonNull Preference preference2);

        public abstract boolean b(@NonNull Preference preference, @NonNull Preference preference2);
    }

    public static class e extends d {
        @Override // androidx.preference.t.d
        public boolean a(@NonNull Preference preference, @NonNull Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.f115469M) || !TextUtils.equals(preference.K(), preference2.K()) || !TextUtils.equals(preference.I(), preference2.I())) {
                return false;
            }
            Drawable drawableN = preference.n();
            Drawable drawableN2 = preference2.n();
            if ((drawableN != drawableN2 && (drawableN == null || !drawableN.equals(drawableN2))) || preference.O() != preference2.O() || preference.S() != preference2.S()) {
                return false;
            }
            if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).q1() == ((TwoStatePreference) preference2).q1()) {
                return !(preference instanceof DropDownPreference) || preference == preference2;
            }
            return false;
        }

        @Override // androidx.preference.t.d
        public boolean b(@NonNull Preference preference, @NonNull Preference preference2) {
            return preference.p() == preference2.p();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public t(@NonNull Context context) {
        this.f115709a = context;
        E(f(context));
    }

    public static SharedPreferences d(@NonNull Context context) {
        return context.getSharedPreferences(f(context), 0);
    }

    public static int e() {
        return 0;
    }

    public static String f(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void u(@NonNull Context context, int i10, boolean z10) {
        v(context, f(context), 0, i10, z10);
    }

    public static void v(@NonNull Context context, String str, int i10, int i11, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f115706o, 0);
        if (z10 || !sharedPreferences.getBoolean(f115706o, false)) {
            t tVar = new t(context);
            tVar.E(str);
            tVar.D(i10);
            tVar.r(context, i11, null);
            sharedPreferences.edit().putBoolean(f115706o, true).apply();
        }
    }

    public void A(@Nullable d dVar) {
        this.f115719k = dVar;
    }

    public void B(@Nullable j jVar) {
        this.f115712d = jVar;
    }

    public boolean C(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f115718j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.g0();
        }
        this.f115718j = preferenceScreen;
        return true;
    }

    public void D(int i10) {
        this.f115716h = i10;
        this.f115711c = null;
    }

    public void E(String str) {
        this.f115715g = str;
        this.f115711c = null;
    }

    public void F() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f115717i = 0;
            this.f115711c = null;
        }
    }

    public void G() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f115717i = 1;
            this.f115711c = null;
        }
    }

    public boolean H() {
        return !this.f115714f;
    }

    public void I(@NonNull Preference preference) {
        a aVar = this.f115721m;
        if (aVar != null) {
            aVar.e(preference);
        }
    }

    @NonNull
    public PreferenceScreen a(@NonNull Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.b0(this);
        return preferenceScreen;
    }

    @Nullable
    public <T extends Preference> T b(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f115718j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.p1(charSequence);
    }

    @NonNull
    public Context c() {
        return this.f115709a;
    }

    @Nullable
    public SharedPreferences.Editor g() {
        if (this.f115712d != null) {
            return null;
        }
        if (!this.f115714f) {
            return o().edit();
        }
        if (this.f115713e == null) {
            this.f115713e = o().edit();
        }
        return this.f115713e;
    }

    public long h() {
        long j10;
        synchronized (this) {
            j10 = this.f115710b;
            this.f115710b = 1 + j10;
        }
        return j10;
    }

    @Nullable
    public a i() {
        return this.f115721m;
    }

    @Nullable
    public b j() {
        return this.f115722n;
    }

    @Nullable
    public c k() {
        return this.f115720l;
    }

    @Nullable
    public d l() {
        return this.f115719k;
    }

    @Nullable
    public j m() {
        return this.f115712d;
    }

    public PreferenceScreen n() {
        return this.f115718j;
    }

    @Nullable
    public SharedPreferences o() {
        if (m() != null) {
            return null;
        }
        if (this.f115711c == null) {
            this.f115711c = (this.f115717i != 1 ? this.f115709a : C0920d.createDeviceProtectedStorageContext(this.f115709a)).getSharedPreferences(this.f115715g, this.f115716h);
        }
        return this.f115711c;
    }

    public int p() {
        return this.f115716h;
    }

    public String q() {
        return this.f115715g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen r(@NonNull Context context, int i10, @Nullable PreferenceScreen preferenceScreen) {
        this.f115714f = true;
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new s(context, this).e(i10, preferenceScreen);
        preferenceScreen2.b0(this);
        w(false);
        return preferenceScreen2;
    }

    public boolean s() {
        return Build.VERSION.SDK_INT < 24 || this.f115717i == 0;
    }

    public boolean t() {
        return Build.VERSION.SDK_INT >= 24 && this.f115717i == 1;
    }

    public final void w(boolean z10) {
        SharedPreferences.Editor editor;
        if (!z10 && (editor = this.f115713e) != null) {
            editor.apply();
        }
        this.f115714f = z10;
    }

    public void x(@Nullable a aVar) {
        this.f115721m = aVar;
    }

    public void y(@Nullable b bVar) {
        this.f115722n = bVar;
    }

    public void z(@Nullable c cVar) {
        this.f115720l = cVar;
    }
}
