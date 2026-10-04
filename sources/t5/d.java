package T5;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends DialogInterfaceOnCancelListenerC2573k {
    @Nullable
    public abstract View n();

    @NonNull
    public abstract List<String> o();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @NonNull
    public abstract View p();
}
