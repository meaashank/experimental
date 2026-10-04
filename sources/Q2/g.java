package Q2;

import T2.r;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public class g extends c<P2.b> {
    public g(@NonNull Context context, @NonNull V2.a taskExecutor) {
        super(R2.h.c(context, taskExecutor).d());
    }

    @Override // Q2.c
    public boolean b(@NonNull r workSpec) {
        NetworkType networkType = workSpec.f68228j.f120209a;
        if (networkType != NetworkType.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // Q2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@NonNull P2.b state) {
        return !state.a() || state.b();
    }
}
