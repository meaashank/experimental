package R0;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f67686a;

    @T(24)
    public static class a {
        public static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* JADX INFO: renamed from: R0.b$b, reason: collision with other inner class name */
    @T(34)
    public static class C0102b {
        public static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    public interface c {
        void a(Intent intent);

        void b(PendingIntent pendingIntent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a() {
        f67686a = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void b(@NonNull c cVar) {
        f67686a = cVar;
    }

    public static void c(@NonNull TileService tileService, @NonNull R0.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c cVar = f67686a;
            if (cVar != null) {
                cVar.b(aVar.f());
                return;
            } else {
                C0102b.a(tileService, aVar.f());
                return;
            }
        }
        if (i10 >= 24) {
            c cVar2 = f67686a;
            if (cVar2 != null) {
                cVar2.a(aVar.d());
            } else {
                a.a(tileService, aVar.d());
            }
        }
    }
}
