package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    @NotNull
    public static final InterfaceC4846f<Object, String> a(@NotNull SharedPreferences sharedPreferences, @NotNull String name, @NotNull String defaultValue) {
        G.p(sharedPreferences, "<this>");
        G.p(name, "name");
        G.p(defaultValue, "defaultValue");
        return new i(name, defaultValue, sharedPreferences);
    }
}
