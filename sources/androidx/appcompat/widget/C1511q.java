package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4345t;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public TextView f86412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextClassifier f86413b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.q$a */
    @e.T(26)
    public static final class a {
        @NonNull
        @InterfaceC4345t
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C1511q(@NonNull TextView textView) {
        textView.getClass();
        this.f86412a = textView;
    }

    @NonNull
    @e.T(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f86413b;
        return textClassifier == null ? a.a(this.f86412a) : textClassifier;
    }

    @e.T(api = 26)
    public void b(@Nullable TextClassifier textClassifier) {
        this.f86413b = textClassifier;
    }
}
