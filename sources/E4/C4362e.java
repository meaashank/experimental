package e4;

import android.net.Uri;
import dd.j;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nUriExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriExtensions.kt\ncom/cookiegames/smartcookie/favicon/FaviconUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
@j(name = "FaviconUtils")
public final class C4362e {
    @Nullable
    public static final C4363f a(@NotNull Uri uri) {
        G.p(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme == null || M.Q3(scheme)) {
            scheme = null;
        }
        String host = uri.getHost();
        if (host == null || M.Q3(host)) {
            host = null;
        }
        if (scheme == null || host == null) {
            return null;
        }
        return new C4363f(scheme, host);
    }
}
