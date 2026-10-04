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
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentName f58334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f58335b;

    public a(@NotNull ComponentName componentName, @Nullable String str) {
        G.p(componentName, "componentName");
        this.f58334a = componentName;
        this.f58335b = str;
        String packageName = componentName.getPackageName();
        G.o(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        G.o(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (M.p3(packageName, "*", false, 2, null) && M.L3(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (M.p3(className, "*", false, 2, null) && M.L3(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @NotNull
    public final ComponentName a() {
        return this.f58334a;
    }

    @Nullable
    public final String b() {
        return this.f58335b;
    }

    public final boolean c(@NotNull Activity activity) {
        G.p(activity, "activity");
        if (!p.f58368a.a(activity, this.f58334a)) {
            return false;
        }
        String str = this.f58335b;
        if (str == null) {
            return true;
        }
        Intent intent = activity.getIntent();
        return G.g(str, intent == null ? null : intent.getAction());
    }

    public final boolean d(@NotNull Intent intent) {
        G.p(intent, "intent");
        if (!p.f58368a.b(intent.getComponent(), this.f58334a)) {
            return false;
        }
        String str = this.f58335b;
        return str == null || G.g(str, intent.getAction());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f58334a, aVar.f58334a) && G.g(this.f58335b, aVar.f58335b);
    }

    public int hashCode() {
        int iHashCode = this.f58334a.hashCode() * 31;
        String str = this.f58335b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.f58334a + ", intentAction=" + ((Object) this.f58335b) + ')';
    }
}
