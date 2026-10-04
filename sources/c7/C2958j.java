package c7;

import android.os.IBinder;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: c7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C2958j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f131259d;

    public C2958j(IBinder iBinder) {
        this.f131259d = iBinder;
    }

    @Override // c7.m
    public String A() {
        return "asBinder";
    }

    @Override // c7.m
    public Object c(Object obj, Method method, Object... objArr) throws Throwable {
        return this.f131259d;
    }
}
