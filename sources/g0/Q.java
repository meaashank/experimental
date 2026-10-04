package G0;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Q {
    public static final void a(@NotNull Shader shader, @NotNull ed.l<? super Matrix, L0> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
