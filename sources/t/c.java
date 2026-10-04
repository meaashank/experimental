package T;

import T.b;
import android.view.View;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68174b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f68175a;

    public c(@NotNull View view) {
        this.f68175a = view;
    }

    @Override // T.a
    public void a(int i10) {
        b.a aVar = b.f68172b;
        if (i10 == aVar.a()) {
            this.f68175a.performHapticFeedback(0);
        } else if (i10 == aVar.b()) {
            this.f68175a.performHapticFeedback(9);
        }
    }
}
