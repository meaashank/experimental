package p4;

import android.util.Log;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import javax.inject.Inject;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
@InterfaceC2859i
public final class C5388a implements InterfaceC5390c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f226336a = 0;

    @Inject
    public C5388a() {
    }

    @Override // p4.InterfaceC5390c
    public void a(@NotNull String tag, @NotNull String message, @NotNull Throwable throwable) {
        G.p(tag, "tag");
        G.p(message, "message");
        G.p(throwable, "throwable");
        Log.e(tag, message, throwable);
    }

    @Override // p4.InterfaceC5390c
    public void log(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        Log.d(tag, message);
    }
}
