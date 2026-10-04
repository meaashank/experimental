package K2;

import android.app.Activity;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f58377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f58378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58379c;

    public r(@NotNull b primaryActivityStack, @NotNull b secondaryActivityStack, float f10) {
        G.p(primaryActivityStack, "primaryActivityStack");
        G.p(secondaryActivityStack, "secondaryActivityStack");
        this.f58377a = primaryActivityStack;
        this.f58378b = secondaryActivityStack;
        this.f58379c = f10;
    }

    public final boolean a(@NotNull Activity activity) {
        G.p(activity, "activity");
        return this.f58377a.a(activity) || this.f58378b.a(activity);
    }

    @NotNull
    public final b b() {
        return this.f58377a;
    }

    @NotNull
    public final b c() {
        return this.f58378b;
    }

    public final float d() {
        return this.f58379c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return G.g(this.f58377a, rVar.f58377a) && G.g(this.f58378b, rVar.f58378b) && this.f58379c == rVar.f58379c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f58379c) + ((this.f58378b.hashCode() + (this.f58377a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitInfo:{");
        sb2.append("primaryActivityStack=" + this.f58377a + ',');
        sb2.append("secondaryActivityStack=" + this.f58378b + ',');
        sb2.append("splitRatio=" + this.f58379c + '}');
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
