package I0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50910b = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50911a;

    public a(Context context) {
        this.f50911a = context;
    }

    @NonNull
    public static a d(@NonNull Context context) {
        return new a(context);
    }

    @Nullable
    public Display a(int i10) {
        return ((DisplayManager) this.f50911a.getSystemService("display")).getDisplay(i10);
    }

    @NonNull
    public Display[] b() {
        return ((DisplayManager) this.f50911a.getSystemService("display")).getDisplays();
    }

    @NonNull
    public Display[] c(@Nullable String str) {
        return ((DisplayManager) this.f50911a.getSystemService("display")).getDisplays();
    }
}
