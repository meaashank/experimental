package K2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.G;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentName f58380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentName f58381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f58382c;

    public s(@NotNull ComponentName primaryActivityName, @NotNull ComponentName secondaryActivityName, @Nullable String str) {
        String str2;
        boolean z10;
        int i10;
        Object obj;
        G.p(primaryActivityName, "primaryActivityName");
        G.p(secondaryActivityName, "secondaryActivityName");
        this.f58380a = primaryActivityName;
        this.f58381b = secondaryActivityName;
        this.f58382c = str;
        String packageName = primaryActivityName.getPackageName();
        G.o(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        G.o(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        G.o(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        G.o(className2, "secondaryActivityName.className");
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (M.p3(packageName, "*", false, 2, null) && M.L3(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (M.p3(className, "*", false, 2, null)) {
            str2 = "Wildcard in package name is only allowed at the end.";
            if (M.L3(className, "*", 0, false, 6, null) != className.length() - 1) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
            }
        } else {
            str2 = "Wildcard in package name is only allowed at the end.";
        }
        if (M.p3(packageName2, "*", false, 2, null)) {
            i10 = 2;
            obj = null;
            z10 = false;
            if (M.L3(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
                throw new IllegalArgumentException(str2);
            }
        } else {
            z10 = false;
            i10 = 2;
            obj = null;
        }
        if (M.p3(className2, "*", z10, i10, obj) && M.L3(className2, "*", 0, false, 6, null) != className2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @NotNull
    public final ComponentName a() {
        return this.f58380a;
    }

    @Nullable
    public final String b() {
        return this.f58382c;
    }

    @NotNull
    public final ComponentName c() {
        return this.f58381b;
    }

    public final boolean d(@NotNull Activity primaryActivity, @NotNull Intent secondaryActivityIntent) {
        G.p(primaryActivity, "primaryActivity");
        G.p(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        p pVar = p.f58368a;
        if (!pVar.b(componentName, this.f58380a) || !pVar.b(secondaryActivityIntent.getComponent(), this.f58381b)) {
            return false;
        }
        String str = this.f58382c;
        return str == null || G.g(str, secondaryActivityIntent.getAction());
    }

    public final boolean e(@NotNull Activity primaryActivity, @NotNull Activity secondaryActivity) {
        G.p(primaryActivity, "primaryActivity");
        G.p(secondaryActivity, "secondaryActivity");
        p pVar = p.f58368a;
        boolean z10 = pVar.b(primaryActivity.getComponentName(), this.f58380a) && pVar.b(secondaryActivity.getComponentName(), this.f58381b);
        if (secondaryActivity.getIntent() == null) {
            return z10;
        }
        if (z10) {
            Intent intent = secondaryActivity.getIntent();
            G.o(intent, "secondaryActivity.intent");
            if (d(primaryActivity, intent)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return G.g(this.f58380a, sVar.f58380a) && G.g(this.f58381b, sVar.f58381b) && G.g(this.f58382c, sVar.f58382c);
    }

    public int hashCode() {
        int iHashCode = (this.f58381b.hashCode() + (this.f58380a.hashCode() * 31)) * 31;
        String str = this.f58382c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.f58380a + ", secondaryActivityName=" + this.f58381b + ", secondaryActivityAction=" + ((Object) this.f58382c) + '}';
    }
}
