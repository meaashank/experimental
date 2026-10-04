package H2;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4330d;
import e.T;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public abstract class p {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public p() {
    }

    public abstract void a();

    @NonNull
    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract WebMessagePort b();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract InvocationHandler c();

    public abstract void d(@NonNull o oVar);

    public abstract void e(@NonNull a aVar);

    public abstract void f(@Nullable Handler handler, @NonNull a aVar);

    public static abstract class a {
        public void a(@NonNull p pVar, @Nullable o oVar) {
        }
    }
}
