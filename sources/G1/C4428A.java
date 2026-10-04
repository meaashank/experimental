package g1;

import android.annotation.TargetApi;
import android.widget.Switch;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: renamed from: g1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:thumb", method = "setThumbDrawable", type = Switch.class), @androidx.databinding.g(attribute = "android:track", method = "setTrackDrawable", type = Switch.class)})
@TargetApi(14)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4428A {
    @InterfaceC2511d({"android:switchTextAppearance"})
    public static void a(Switch r12, int i10) {
        r12.setSwitchTextAppearance(null, i10);
    }
}
