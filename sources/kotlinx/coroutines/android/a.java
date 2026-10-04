package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.internal.B;
import kotlinx.coroutines.internal.C5091z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements B {
    @Override // kotlinx.coroutines.internal.B
    public int a() {
        return C5091z.f220373j;
    }

    @Override // kotlinx.coroutines.internal.B
    @NotNull
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.B
    @NotNull
    public J0 c(@NotNull List<? extends B> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(f.e(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
