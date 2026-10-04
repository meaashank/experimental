package Q2;

import T2.r;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public class f extends c<P2.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65818e = androidx.work.i.f("NetworkNotRoamingCtrlr");

    public f(Context context, V2.a taskExecutor) {
        super(R2.h.c(context, taskExecutor).d());
    }

    @Override // Q2.c
    public boolean b(@NonNull r workSpec) {
        return workSpec.f68228j.f120209a == NetworkType.NOT_ROAMING;
    }

    @Override // Q2.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@NonNull P2.b state) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (state.a() && state.c()) ? false : true;
        }
        androidx.work.i.c().a(f65818e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !state.a();
    }
}
