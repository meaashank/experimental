package g1;

import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:thumb", method = "setThumbDrawable", type = SwitchCompat.class), @androidx.databinding.g(attribute = "android:track", method = "setTrackDrawable", type = SwitchCompat.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class B {
    @InterfaceC2511d({"android:switchTextAppearance"})
    public static void a(SwitchCompat switchCompat, int i10) {
        switchCompat.setSwitchTextAppearance(null, i10);
    }
}
