package androidx.datastore;

import android.content.Context;
import dd.j;
import java.io.File;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "DataStoreFile")
public final class a {
    @NotNull
    public static final File a(@NotNull Context context, @NotNull String fileName) {
        G.p(context, "<this>");
        G.p(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), G.C("datastore/", fileName));
    }
}
