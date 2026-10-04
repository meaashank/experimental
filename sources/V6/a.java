package V6;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.gserver.SupervisorService;
import java.util.HashMap;
import java.util.Map;
import n6.C5256a;

/* JADX INFO: loaded from: classes6.dex */
public class a extends C5256a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76352c = l0.b(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Activity, ServiceConnection> f76353a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Activity, IBinder> f76354b = new HashMap();

    /* JADX INFO: renamed from: V6.a$a, reason: collision with other inner class name */
    public class ServiceConnectionC0126a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f76355a;

        public ServiceConnectionC0126a(Activity activity) {
            this.f76355a = activity;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f76353a.put(this.f76355a, this);
            a.this.f76354b.put(this.f76355a, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.f76353a.remove(this.f76355a);
            a.this.f76354b.remove(this.f76355a);
        }
    }

    public SupervisorService.a c(Activity activity) {
        IBinder iBinder = this.f76354b.get(activity);
        if (iBinder != null) {
            return (SupervisorService.a) iBinder;
        }
        return null;
    }

    @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        try {
            Intent intent = new Intent(GaiaContext.j().z(), (Class<?>) SupervisorService.class);
            activity.bindService(intent, new ServiceConnectionC0126a(activity), 65);
            activity.startService(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        ServiceConnection serviceConnection = this.f76353a.get(activity);
        if (serviceConnection != null) {
            try {
                activity.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
