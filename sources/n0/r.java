package N0;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r {
    public static void b(InterfaceC1230s interfaceC1230s, @NonNull List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC1230s.onLocationChanged((Location) list.get(i10));
        }
    }

    public static void a(InterfaceC1230s interfaceC1230s, int i10) {
    }

    public static void c(InterfaceC1230s interfaceC1230s, @NonNull String str) {
    }

    public static void d(InterfaceC1230s interfaceC1230s, @NonNull String str) {
    }

    public static void e(InterfaceC1230s interfaceC1230s, @NonNull String str, int i10, @Nullable Bundle bundle) {
    }
}
