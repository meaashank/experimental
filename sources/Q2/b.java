package Q2;

import T2.r;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c<Boolean> {
    public b(Context context, V2.a taskExecutor) {
        super(R2.h.c(context, taskExecutor).b());
    }

    @Override // Q2.c
    public boolean b(@NonNull r workSpec) {
        return workSpec.f68228j.f120212d;
    }

    @Override // Q2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@NonNull Boolean isBatteryNotLow) {
        return !isBatteryNotLow.booleanValue();
    }
}
