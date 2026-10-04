package P0;

import U6.b;
import android.net.Uri;
import androidx.appcompat.widget.O;
import java.io.File;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class f {
    @NotNull
    public static final File a(@NotNull Uri uri) {
        if (!G.g(uri.getScheme(), b.h.f68653a)) {
            throw new IllegalArgumentException(O.a("Uri lacks 'file' scheme: ", uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(O.a("Uri path is null: ", uri).toString());
    }

    @NotNull
    public static final Uri b(@NotNull File file) {
        return Uri.fromFile(file);
    }

    @NotNull
    public static final Uri c(@NotNull String str) {
        return Uri.parse(str);
    }
}
