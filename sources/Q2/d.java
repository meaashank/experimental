package Q2;

import T2.r;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public class d extends c<P2.b> {
    public d(Context context, V2.a taskExecutor) {
        super(R2.h.c(context, taskExecutor).d());
    }

    @Override // Q2.c
    public boolean b(@NonNull r workSpec) {
        return workSpec.f68228j.f120209a == NetworkType.CONNECTED;
    }

    @Override // Q2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@NonNull P2.b state) {
        return Build.VERSION.SDK_INT >= 26 ? (state.a() && state.d()) ? false : true : !state.a();
    }
}
