package B0;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class O {
    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static androidx.core.util.B<Uri> b(@NonNull final UriMatcher uriMatcher) {
        return new androidx.core.util.B() { // from class: B0.N
            @Override // androidx.core.util.B
            public /* synthetic */ androidx.core.util.B a(androidx.core.util.B b10) {
                return androidx.core.util.A.a(this, b10);
            }

            @Override // androidx.core.util.B
            public /* synthetic */ androidx.core.util.B b(androidx.core.util.B b10) {
                return androidx.core.util.A.c(this, b10);
            }

            @Override // androidx.core.util.B
            public androidx.core.util.B negate() {
                return new androidx.core.util.z(this);
            }

            @Override // androidx.core.util.B
            public final boolean test(Object obj) {
                return O.a(uriMatcher, (Uri) obj);
            }
        };
    }
}
