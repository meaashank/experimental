package b4;

import android.content.Context;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import javax.inject.Inject;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
@InterfaceC2859i
public final class C2781b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120795b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f120796a;

    @Inject
    public C2781b(@NotNull Context context) {
        G.p(context, "context");
        this.f120796a = context;
    }

    public final boolean a() {
        return (this.f120796a.getResources().getConfiguration().screenLayout & 15) == 4;
    }
}
