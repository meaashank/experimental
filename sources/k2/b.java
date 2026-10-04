package K2;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Activity> f58336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58337b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<? extends Activity> activities, boolean z10) {
        G.p(activities, "activities");
        this.f58336a = activities;
        this.f58337b = z10;
    }

    public final boolean a(@NotNull Activity activity) {
        G.p(activity, "activity");
        return this.f58336a.contains(activity);
    }

    @NotNull
    public final List<Activity> b() {
        return this.f58336a;
    }

    public final boolean c() {
        return this.f58337b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return (G.g(this.f58336a, bVar.f58336a) || this.f58337b == bVar.f58337b) ? false : true;
    }

    public int hashCode() {
        return this.f58336a.hashCode() + ((this.f58337b ? 1 : 0) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityStack{");
        sb2.append(G.C("activities=", this.f58336a));
        sb2.append("isEmpty=" + this.f58337b + '}');
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ b(List list, boolean z10, int i10, C4969v c4969v) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
