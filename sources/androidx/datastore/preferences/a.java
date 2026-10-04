package androidx.datastore.preferences;

import android.content.Context;
import dd.j;
import java.io.File;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "PreferenceDataStoreFile")
public final class a {
    @NotNull
    public static final File a(@NotNull Context context, @NotNull String name) {
        G.p(context, "<this>");
        G.p(name, "name");
        return androidx.datastore.a.a(context, G.C(name, ".preferences_pb"));
    }
}
