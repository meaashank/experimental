package Q2;

import T2.r;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public class e extends c<P2.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65817e = androidx.work.i.f("NetworkMeteredCtrlr");

    public e(Context context, V2.a taskExecutor) {
        super(R2.h.c(context, taskExecutor).d());
    }

    @Override // Q2.c
    public boolean b(@NonNull r workSpec) {
        return workSpec.f68228j.f120209a == NetworkType.METERED;
    }

    @Override // Q2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@NonNull P2.b state) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (state.a() && state.b()) ? false : true;
        }
        androidx.work.i.c().a(f65817e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !state.a();
    }
}
