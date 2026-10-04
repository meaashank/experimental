package g5;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.prism.commons.utils.r;
import e.InterfaceC4337k;

/* JADX INFO: renamed from: g5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4454c extends RecyclerView.n {
    @NonNull
    public static AbstractC4454c c(Context context, @InterfaceC4337k int i10) {
        int iA = r.a(context, 6);
        return new C4453b(i10, iA, iA);
    }

    public abstract int d();

    public abstract int e();
}
