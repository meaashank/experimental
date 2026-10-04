package v;

import android.os.Bundle;
import androidx.annotation.NonNull;
import e.D;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    void onGreatestScrollPercentageIncreased(@D(from = 1, to = 100) int i10, @NonNull Bundle bundle);

    void onSessionEnded(boolean z10, @NonNull Bundle bundle);

    void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle);
}
