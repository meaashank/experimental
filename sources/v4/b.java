package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @NotNull
    public static final InterfaceC4846f<Object, Boolean> a(@NotNull SharedPreferences sharedPreferences, @NotNull String name, boolean z10) {
        G.p(sharedPreferences, "<this>");
        G.p(name, "name");
        return new C5684a(name, z10, sharedPreferences);
    }
}
