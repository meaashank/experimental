package T5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends Dialog {
    public c(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public abstract View a();

    @NonNull
    public abstract List<String> b();

    @NonNull
    public abstract View c();

    public c(@NonNull Context context, int i10) {
        super(context, i10);
    }

    public c(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
    }
}
