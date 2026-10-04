package b4;

import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.device.BuildType;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class C2780a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120793b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BuildType f120794a;

    public C2780a(@NotNull BuildType buildType) {
        G.p(buildType, "buildType");
        this.f120794a = buildType;
    }

    public static /* synthetic */ C2780a c(C2780a c2780a, BuildType buildType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            buildType = c2780a.f120794a;
        }
        return c2780a.b(buildType);
    }

    @NotNull
    public final BuildType a() {
        return this.f120794a;
    }

    @NotNull
    public final C2780a b(@NotNull BuildType buildType) {
        G.p(buildType, "buildType");
        return new C2780a(buildType);
    }

    @NotNull
    public final BuildType d() {
        return this.f120794a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2780a) && this.f120794a == ((C2780a) obj).f120794a;
    }

    public int hashCode() {
        return this.f120794a.hashCode();
    }

    @NotNull
    public String toString() {
        return "BuildInfo(buildType=" + this.f120794a + ")";
    }
}
