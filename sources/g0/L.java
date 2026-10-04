package G0;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class L {
    @NotNull
    public static final Picture a(@NotNull Picture picture, int i10, int i11, @NotNull ed.l<? super Canvas, L0> lVar) {
        try {
            lVar.invoke(picture.beginRecording(i10, i11));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
