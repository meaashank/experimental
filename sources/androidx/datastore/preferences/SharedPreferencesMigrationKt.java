package androidx.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.migrations.SharedPreferencesMigration;
import dd.k;
import ed.InterfaceC4376a;
import ed.p;
import ed.q;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.e;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesMigrationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<String> f112471a = new LinkedHashSet();

    @k
    @NotNull
    public static final SharedPreferencesMigration<androidx.datastore.preferences.core.a> a(@NotNull Context context, @NotNull String sharedPreferencesName) {
        G.p(context, "context");
        G.p(sharedPreferencesName, "sharedPreferencesName");
        return e(context, sharedPreferencesName, null, 4, null);
    }

    @k
    @NotNull
    public static final SharedPreferencesMigration<androidx.datastore.preferences.core.a> b(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate) {
        G.p(context, "context");
        G.p(sharedPreferencesName, "sharedPreferencesName");
        G.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f112471a ? new SharedPreferencesMigration<>(context, sharedPreferencesName, null, i(keysToMigrate), h(), 4, null) : new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, i(keysToMigrate), h());
    }

    @k
    @NotNull
    public static final SharedPreferencesMigration<androidx.datastore.preferences.core.a> c(@NotNull InterfaceC4376a<? extends SharedPreferences> produceSharedPreferences) {
        G.p(produceSharedPreferences, "produceSharedPreferences");
        return f(produceSharedPreferences, null, 2, null);
    }

    @k
    @NotNull
    public static final SharedPreferencesMigration<androidx.datastore.preferences.core.a> d(@NotNull InterfaceC4376a<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate) {
        G.p(produceSharedPreferences, "produceSharedPreferences");
        G.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f112471a ? new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, i(keysToMigrate), h(), 2, (C4969v) null) : new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, i(keysToMigrate), h());
    }

    public static /* synthetic */ SharedPreferencesMigration e(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f112471a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ SharedPreferencesMigration f(InterfaceC4376a interfaceC4376a, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = f112471a;
        }
        return d(interfaceC4376a, set);
    }

    @NotNull
    public static final Set<String> g() {
        return f112471a;
    }

    public static final q<androidx.datastore.migrations.b, androidx.datastore.preferences.core.a, e<? super androidx.datastore.preferences.core.a>, Object> h() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(3, null);
    }

    public static final p<androidx.datastore.preferences.core.a, e<? super Boolean>, Object> i(Set<String> set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
