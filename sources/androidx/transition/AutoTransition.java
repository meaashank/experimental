package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        O();
    }

    public final void O() {
        L(1);
        y(new Fade(2)).y(new ChangeBounds()).y(new Fade(1));
    }

    public AutoTransition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        O();
    }
}
