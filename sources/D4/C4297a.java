package d4;

import android.R;
import android.app.Activity;
import com.google.android.material.snackbar.Snackbar;
import e.Z;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@dd.j(name = "ActivityExtensions")
public final class C4297a {
    public static final void a(@NotNull Activity activity, @Z int i10) {
        G.p(activity, "<this>");
        Snackbar.make(activity.findViewById(R.id.content), i10, -1).show();
    }

    public static final void b(@NotNull Activity activity, @NotNull String message) {
        G.p(activity, "<this>");
        G.p(message, "message");
        Snackbar.make(activity.findViewById(R.id.content), message, -1).show();
    }
}
