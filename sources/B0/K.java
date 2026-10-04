package B0;

import A0.b;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12259b = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.AbstractBinderC0002b f12260a = new a();

    public class a extends b.AbstractBinderC0002b {
        public a() {
        }

        @Override // A0.b
        public void B1(@Nullable A0.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            K.this.a(new J(aVar));
        }
    }

    public abstract void a(@NonNull J j10);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.f12260a;
    }
}
